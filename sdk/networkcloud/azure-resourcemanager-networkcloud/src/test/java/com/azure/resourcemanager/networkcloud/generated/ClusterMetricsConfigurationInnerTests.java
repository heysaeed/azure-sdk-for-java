// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.networkcloud.fluent.models.ClusterMetricsConfigurationInner;
import com.azure.resourcemanager.networkcloud.models.ExtendedLocation;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ClusterMetricsConfigurationInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ClusterMetricsConfigurationInner model =
            BinaryData
                .fromString(
                    "{\"extendedLocation\":{\"name\":\"rrxxgewpktvq\",\"type\":\"lkm\"},\"properties\":{\"collectionInterval\":1955127853962585170,\"detailedStatus\":\"Processing\",\"detailedStatusMessage\":\"lfbcgwgcl\",\"disabledMetrics\":[\"ebqinjipnw\",\"fujqlafcba\",\"hpzpo\"],\"enabledMetrics\":[\"yjwpfilkmkkh\",\"l\",\"dndviauogp\",\"uartvti\"],\"provisioningState\":\"Succeeded\"},\"location\":\"fchnmnah\",\"tags\":{\"i\":\"hkxjqirwrweooxf\"},\"id\":\"hx\",\"name\":\"rsnewmozqvbubqma\",\"type\":\"hsycxhxzgaz\"}")
                .toObject(ClusterMetricsConfigurationInner.class);
        Assertions.assertEquals("fchnmnah", model.location());
        Assertions.assertEquals("hkxjqirwrweooxf", model.tags().get("i"));
        Assertions.assertEquals("rrxxgewpktvq", model.extendedLocation().name());
        Assertions.assertEquals("lkm", model.extendedLocation().type());
        Assertions.assertEquals(1955127853962585170L, model.collectionInterval());
        Assertions.assertEquals("yjwpfilkmkkh", model.enabledMetrics().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ClusterMetricsConfigurationInner model =
            new ClusterMetricsConfigurationInner()
                .withLocation("fchnmnah")
                .withTags(mapOf("i", "hkxjqirwrweooxf"))
                .withExtendedLocation(new ExtendedLocation().withName("rrxxgewpktvq").withType("lkm"))
                .withCollectionInterval(1955127853962585170L)
                .withEnabledMetrics(Arrays.asList("yjwpfilkmkkh", "l", "dndviauogp", "uartvti"));
        model = BinaryData.fromObject(model).toObject(ClusterMetricsConfigurationInner.class);
        Assertions.assertEquals("fchnmnah", model.location());
        Assertions.assertEquals("hkxjqirwrweooxf", model.tags().get("i"));
        Assertions.assertEquals("rrxxgewpktvq", model.extendedLocation().name());
        Assertions.assertEquals("lkm", model.extendedLocation().type());
        Assertions.assertEquals(1955127853962585170L, model.collectionInterval());
        Assertions.assertEquals("yjwpfilkmkkh", model.enabledMetrics().get(0));
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}