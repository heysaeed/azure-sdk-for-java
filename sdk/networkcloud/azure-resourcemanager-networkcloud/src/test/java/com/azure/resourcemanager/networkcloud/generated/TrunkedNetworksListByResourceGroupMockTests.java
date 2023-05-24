// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.networkcloud.NetworkCloudManager;
import com.azure.resourcemanager.networkcloud.models.HybridAksPluginType;
import com.azure.resourcemanager.networkcloud.models.TrunkedNetwork;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class TrunkedNetworksListByResourceGroupMockTests {
    @Test
    public void testListByResourceGroup() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"extendedLocation\":{\"name\":\"a\",\"type\":\"krmukmyjmkxett\"},\"properties\":{\"clusterId\":\"lojfkqidnqto\",\"detailedStatus\":\"Error\",\"detailedStatusMessage\":\"qxcsqhtkbtnqlrn\",\"hybridAksClustersAssociatedIds\":[\"mbiipsnawwlqk\"],\"hybridAksPluginType\":\"SRIOV\",\"interfaceName\":\"hllxricctkw\",\"isolationDomainIds\":[\"qqoajxeiyglesrw\",\"aexhdctrceqnk\"],\"provisioningState\":\"Provisioning\",\"virtualMachinesAssociatedIds\":[\"behdmljzacvume\",\"jpbi\",\"nzpphepife\"],\"vlans\":[3891540649967901501,277998703102904309,8312103472306255148,7298580622744112210]},\"location\":\"ykcgxvrpjlvcz\",\"tags\":{\"u\":\"ac\"},\"id\":\"ettepdjxqe\",\"name\":\"koynuiylpckae\",\"type\":\"sedveskwxegqphrg\"}]}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito
            .when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito
            .when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito
            .when(httpClient.send(httpRequest.capture(), Mockito.any()))
            .thenReturn(
                Mono
                    .defer(
                        () -> {
                            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
                            return Mono.just(httpResponse);
                        }));

        NetworkCloudManager manager =
            NetworkCloudManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<TrunkedNetwork> response =
            manager.trunkedNetworks().listByResourceGroup("xcxscvslxlh", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("ykcgxvrpjlvcz", response.iterator().next().location());
        Assertions.assertEquals("ac", response.iterator().next().tags().get("u"));
        Assertions.assertEquals("a", response.iterator().next().extendedLocation().name());
        Assertions.assertEquals("krmukmyjmkxett", response.iterator().next().extendedLocation().type());
        Assertions.assertEquals(HybridAksPluginType.SRIOV, response.iterator().next().hybridAksPluginType());
        Assertions.assertEquals("hllxricctkw", response.iterator().next().interfaceName());
        Assertions.assertEquals("qqoajxeiyglesrw", response.iterator().next().isolationDomainIds().get(0));
        Assertions.assertEquals(3891540649967901501L, response.iterator().next().vlans().get(0));
    }
}