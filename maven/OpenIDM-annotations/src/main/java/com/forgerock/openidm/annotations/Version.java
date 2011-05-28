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
package com.forgerock.openidm.annotations;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Level;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Sample Class Doc
 *
 * @author $author$
 * @version $Revision$ $Date$
 * @since 1.0.0
 */
public class Version {

    public static final String code_id = "$Id$";
    public static String VERSION = "UNKNOWN";
    private static Logger log = LoggerFactory.getLogger(Version.class);

    static {
        try {
            Properties p = new Properties();
            InputStream st = Version.class.getResourceAsStream("/version.properties");
            p.load(st);
            st.close();
            VERSION = p.getProperty("project.version");
            log.info("OpenIDM Annotations {}", VERSION);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void touch() {
    }
}
