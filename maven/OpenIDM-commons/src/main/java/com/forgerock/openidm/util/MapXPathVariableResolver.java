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
package com.forgerock.openidm.util;

import com.forgerock.openidm.util.Variable;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import javax.xml.namespace.QName;
import javax.xml.xpath.XPathVariableResolver;

/**
 * 
 *
 * @author Igor Farinic
 * @version $Revision$ $Date$
 * @since 0.1
 */
public class MapXPathVariableResolver implements XPathVariableResolver {

    private Map<QName, Object> variables = new HashMap<QName, Object>();

    public MapXPathVariableResolver() {
    }

    public MapXPathVariableResolver(Map<QName, Variable> variables) {
        Set<Entry<QName, Variable>> set = variables.entrySet();
        for (Entry<QName, Variable> entry : set) {
            this.variables.put(entry.getKey(), entry.getValue().getObject());
        }
    }

    public void addVariable(QName name, Object value) {
        variables.put(name, value);
    }

    @Override
    public Object resolveVariable(QName name) {
        Object retval = variables.get(name);
        return retval;
    }
}