/*
 *
 * Copyright (c) 2010 ForgeRock Inc. All Rights Reserved
 *
 * The contents of this file are subject to the terms
 * of the Common Development and Distribution License
 * (the License). You may not use this file except in
 * compliance with the License.
 *
 * You can obtain a copy of the License at
 * http://www.opensource.org/licenses/cddl1.php or
 * OpenIDM/legal/CDDLv1.0.txt
 * See the License for the specific language governing
 * permission and limitations under the License.
 *
 * When distributing Covered Code, include this CDDL
 * Header Notice in each file and include the License file
 * at OpenIDM/legal/CDDLv1.0.txt.
 * If applicable, add the following below the CDDL Header,
 * with the fields enclosed by brackets [] replaced by
 * your own identifying information:
 * "Portions Copyrighted 2010 [name of copyright owner]"
 *
 * $Id$
 */
package com.forgerock.openidm.staging.test.mock;

import com.forgerock.openidm.staging.consumer.ModelService;
import com.forgerock.openidm.xml.ns._public.model.model_1.ModelPortType;

/**
 * End user entity.
 *
 * @author Igor Farinic
 * @version $Revision$ $Date$
 * @since 0.1
 */
public class IdmModelServiceMock extends ModelService {

    ModelPortType idmModelPortType = null;

    public IdmModelServiceMock() {
    }

    public synchronized ModelPortType getIdmModelPort() {
        if (null == idmModelPortType) {
            idmModelPortType = new IdmModelPortTypeMock();
        }
        return idmModelPortType;
    }

}
