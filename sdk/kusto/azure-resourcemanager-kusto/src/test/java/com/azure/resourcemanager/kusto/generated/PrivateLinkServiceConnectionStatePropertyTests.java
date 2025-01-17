// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.kusto.models.PrivateLinkServiceConnectionStateProperty;
import org.junit.jupiter.api.Assertions;

public final class PrivateLinkServiceConnectionStatePropertyTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PrivateLinkServiceConnectionStateProperty model
            = BinaryData.fromString("{\"status\":\"lssai\",\"description\":\"p\",\"actionsRequired\":\"nzl\"}")
                .toObject(PrivateLinkServiceConnectionStateProperty.class);
        Assertions.assertEquals("lssai", model.status());
        Assertions.assertEquals("p", model.description());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PrivateLinkServiceConnectionStateProperty model
            = new PrivateLinkServiceConnectionStateProperty().withStatus("lssai").withDescription("p");
        model = BinaryData.fromObject(model).toObject(PrivateLinkServiceConnectionStateProperty.class);
        Assertions.assertEquals("lssai", model.status());
        Assertions.assertEquals("p", model.description());
    }
}
