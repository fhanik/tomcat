/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.tomcat.util.net;

import java.io.File;
import java.net.InetAddress;
import java.net.ServerSocket;

import org.junit.Assert;
import org.junit.Test;

import org.apache.catalina.connector.Connector;
import org.apache.catalina.startup.Tomcat;
import org.apache.catalina.startup.TomcatBaseTest;

/**
 * Test case for the Endpoint implementations. The testing framework will ensure
 * that each implementation is tested.
 */
public class TestXxxEndpoint extends TomcatBaseTest {

    @Test
    public void testStartStopBindOnInit() throws Exception {
        Tomcat tomcat = getTomcatInstance();
        File appDir = new File(getBuildDirectory(), "webapps/examples");
        tomcat.addWebapp(null, "/examples", appDir.getAbsolutePath());

        tomcat.start();

        int port = getPort();

        tomcat.getConnector().stop();
        Exception e = null;
        ServerSocket s = null;
        boolean isApr = false;
        try {
            // This should throw an Exception
            if (!isApr) {
                s = new ServerSocket(port, 100,
                        InetAddress.getByName("localhost"));
            }
        } catch (Exception e1) {
            e = e1;
        } finally {
            try {
                if (s != null) {
                    s.close();
                }
            } catch (Exception e2) { /* Ignore */ }
        }
        if (e != null) {
            log.info("Exception was", e);
        }
        Assert.assertNotNull(e);
        tomcat.getConnector().start();
    }

    @Test
    public void testStartStopBindOnStart() throws Exception {
        Tomcat tomcat = getTomcatInstance();
        Connector c = tomcat.getConnector();
        Assert.assertTrue(c.setProperty("bindOnInit", "false"));

        File appDir = new File(getBuildDirectory(), "webapps/examples");
        tomcat.addWebapp(null, "/examples", appDir.getAbsolutePath());

        tomcat.start();
        int port = getPort();

        tomcat.getConnector().stop();
        Exception e = null;
        ServerSocket s = null;
        try {
            // This should not throw an Exception
                s = new ServerSocket(port, 100,
                        InetAddress.getByName("localhost"));
        } catch (Exception e1) {
            e = e1;
        } finally {
            try {
                if (s != null) {
                    s.close();
                }
            } catch (Exception e2) { /* Ignore */ }
        }
        Assert.assertNull(e);
        tomcat.getConnector().start();
    }
}
