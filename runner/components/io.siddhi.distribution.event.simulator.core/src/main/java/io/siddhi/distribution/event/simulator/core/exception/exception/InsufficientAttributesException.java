/*
 * Copyright (c)  2017, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package io.siddhi.distribution.event.simulator.core.exception.exception;

import io.siddhi.distribution.common.common.exception.ResourceNotFoundException;

/**
 * customized exception class for validation whethere the number of attributes generated is equal to the number of
 * attributes in stream
 */
public class InsufficientAttributesException extends SimulationValidationException {

    /**
     * Throws customizes validating the number of attributes generated
     *
     * @param message Error Message
     */
    public InsufficientAttributesException(String message) {
        super(message);
    }

    public InsufficientAttributesException(ResourceNotFoundException.ResourceType resourceType,
                                           String resourceName, String message) {
        super(message, resourceType, resourceName);
    }

    /**
     * Throws customizes validating the number of attributes generated
     *
     * @param message Error Message
     * @param cause throwable that caused the exception
     */
    public InsufficientAttributesException(String message, Throwable cause) {
        super(message, cause);
    }
}
