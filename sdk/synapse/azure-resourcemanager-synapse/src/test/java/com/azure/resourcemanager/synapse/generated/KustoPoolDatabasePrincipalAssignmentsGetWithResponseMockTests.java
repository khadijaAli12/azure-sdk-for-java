// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.synapse.SynapseManager;
import com.azure.resourcemanager.synapse.models.DatabasePrincipalAssignment;
import com.azure.resourcemanager.synapse.models.DatabasePrincipalRole;
import com.azure.resourcemanager.synapse.models.PrincipalType;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class KustoPoolDatabasePrincipalAssignmentsGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"principalId\":\"fmxgl\",\"role\":\"Viewer\",\"tenantId\":\"jrau\",\"principalType\":\"User\",\"tenantName\":\"hznurttu\",\"principalName\":\"aaxxdcdjmdkqtxfr\",\"provisioningState\":\"Creating\",\"aadObjectId\":\"xstowagehxuihwes\"},\"id\":\"jaqgblkkn\",\"name\":\"ypmte\",\"type\":\"spsaneyvaerpiob\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        SynapseManager manager = SynapseManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        DatabasePrincipalAssignment response = manager.kustoPoolDatabasePrincipalAssignments()
            .getWithResponse("rgyzcslazp", "kqoyimxpggk", "teagbgac", "qpjuytvude", "lpbybkisb",
                com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("fmxgl", response.principalId());
        Assertions.assertEquals(DatabasePrincipalRole.VIEWER, response.role());
        Assertions.assertEquals("jrau", response.tenantId());
        Assertions.assertEquals(PrincipalType.USER, response.principalType());
    }
}
