/*
 * Copyright (c) 2017, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.siddhi.distribution.core.core;

import io.siddhi.distribution.core.core.codegen.DynamicHtmlGen;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DynamicHtmlGenTest {

    @BeforeTest
    public void setDebugLogLevel() {
        Logger.getLogger(DynamicHtmlGenTest.class.getName()).setLevel(Level.DEBUG);
    }

    @Test
    public void testOperations() {
        DynamicHtmlGen dynamicHtmlGen = new DynamicHtmlGen();

        Assert.assertEquals(dynamicHtmlGen.sanitizeTag("sample test case"), "SampleTestCase");
        Assert.assertEquals(dynamicHtmlGen.toApiName("SampleTestCase"), "sample test case");
        Assert.assertEquals(dynamicHtmlGen.toApiName("DifferentName"), "DifferentName");
        Assert.assertEquals(dynamicHtmlGen.toApiFilename("sample test case"), "SampleTestCase");

    }
}
