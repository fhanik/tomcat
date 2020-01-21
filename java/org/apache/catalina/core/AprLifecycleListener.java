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

package org.apache.catalina.core;


import org.apache.catalina.LifecycleEvent;
import org.apache.catalina.LifecycleListener;



/**
 * Implementation of <code>LifecycleListener</code> that will init and
 * and destroy APR.
 *
 * @since 4.1
 */
public class AprLifecycleListener
    implements LifecycleListener {

    public static boolean isAprAvailable() {
        return  false;
    }


    // ---------------------------------------------- LifecycleListener Methods

    /**
     * Primary entry point for startup and shutdown events.
     *
     * @param event The event that has occurred
     */
    @Override
    public void lifecycleEvent(LifecycleEvent event) {
    }

    public String getSSLEngine() {
        return null;
    }

    public void setSSLEngine(String SSLEngine) {
    }

    public String getSSLRandomSeed() {
        return null;
    }

    public void setSSLRandomSeed(String SSLRandomSeed) {
    }

    public String getFIPSMode() {
        return null;
    }

    public void setFIPSMode(String FIPSMode) {
    }

    public boolean isFIPSModeActive() {
        return false;
    }

    public void setUseAprConnector(boolean useAprConnector) {
    }

    public static boolean getUseAprConnector() {
        return false;
    }

    public void setUseOpenSSL(boolean useOpenSSL) {
    }

    public static boolean getUseOpenSSL() {
        return false;
    }

    public static boolean isInstanceCreated() {
        return false;
    }

}
