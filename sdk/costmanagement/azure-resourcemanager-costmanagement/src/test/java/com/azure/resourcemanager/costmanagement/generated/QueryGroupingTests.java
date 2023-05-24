// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.costmanagement.models.QueryColumnType;
import com.azure.resourcemanager.costmanagement.models.QueryGrouping;
import org.junit.jupiter.api.Assertions;

public final class QueryGroupingTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        QueryGrouping model =
            BinaryData
                .fromString("{\"type\":\"Dimension\",\"name\":\"jrjxgciqibrhosx\"}")
                .toObject(QueryGrouping.class);
        Assertions.assertEquals(QueryColumnType.DIMENSION, model.type());
        Assertions.assertEquals("jrjxgciqibrhosx", model.name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        QueryGrouping model = new QueryGrouping().withType(QueryColumnType.DIMENSION).withName("jrjxgciqibrhosx");
        model = BinaryData.fromObject(model).toObject(QueryGrouping.class);
        Assertions.assertEquals(QueryColumnType.DIMENSION, model.type());
        Assertions.assertEquals("jrjxgciqibrhosx", model.name());
    }
}