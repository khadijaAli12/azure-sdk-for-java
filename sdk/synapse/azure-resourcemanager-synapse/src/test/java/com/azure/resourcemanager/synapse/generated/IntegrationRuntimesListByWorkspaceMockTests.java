// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.synapse.SynapseManager;
import com.azure.resourcemanager.synapse.models.IntegrationRuntimeResource;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class IntegrationRuntimesListByWorkspaceMockTests {
    @Test
    public void testListByWorkspace() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"type\":\"IntegrationRuntime\",\"description\":\"wcgi\",\"\":{\"z\":\"dataimaabsqqlon\"}},\"etag\":\"wcahdkmbjsmihr\",\"id\":\"jezbfsjwfczgl\",\"name\":\"vbgukbs\",\"type\":\"bw\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        SynapseManager manager = SynapseManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<IntegrationRuntimeResource> response
            = manager.integrationRuntimes().listByWorkspace("chefpgeed", "ybruhola", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("wcgi", response.iterator().next().properties().description());
    }
}
