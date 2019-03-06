/*
 * Copyright (c) 2017, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.siddhi.distribution.core.core.internal.exception;

/**
 * Execption class that used when execution plan deployment is failed
 */
public class SiddhiAppConfigurationException extends Exception {

    public SiddhiAppConfigurationException() {
    }

    public SiddhiAppConfigurationException(String message) {
        super(message);
    }

    public SiddhiAppConfigurationException(String message, Throwable cause) {
        super(message, cause);
    }

    public SiddhiAppConfigurationException(Throwable cause) {
        super(cause);
    }
}
