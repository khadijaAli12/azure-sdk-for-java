// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.astro.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.astro.AstroManager;
import com.azure.resourcemanager.astro.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.astro.models.MarketplaceSubscriptionStatus;
import com.azure.resourcemanager.astro.models.OrganizationResource;
import com.azure.resourcemanager.astro.models.SingleSignOnStates;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class OrganizationsGetByResourceGroupWithResponseMockTests {
    @Test
    public void testGetByResourceGroupWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr
            = "{\"properties\":{\"marketplace\":{\"subscriptionId\":\"brjcxe\",\"subscriptionStatus\":\"Unsubscribed\",\"offerDetails\":{\"publisherId\":\"wutttxfvjrbi\",\"offerId\":\"phxepcyvahf\",\"planId\":\"ljkyqxjvuuj\",\"planName\":\"idokgjlj\",\"termUnit\":\"xgvcl\",\"termId\":\"gsncghkjeszz\"}},\"user\":{\"firstName\":\"bijhtxfvgxbf\",\"lastName\":\"mxnehmp\",\"emailAddress\":\"ec\",\"upn\":\"odebfqkkrbmpu\",\"phoneNumber\":\"riwflzlfb\"},\"provisioningState\":\"Succeeded\",\"partnerOrganizationProperties\":{\"organizationId\":\"ycispnqzahmgkb\",\"workspaceId\":\"yydhibnuqqk\",\"organizationName\":\"ik\",\"workspaceName\":\"rgvtqag\",\"singleSignOnProperties\":{\"singleSignOnState\":\"Disable\",\"enterpriseAppId\":\"hijggme\",\"singleSignOnUrl\":\"siarbutrcvpn\",\"aadDomains\":[\"mhjrunmpxttdbhr\",\"nlankxmyskpb\",\"enbtkcxywny\"],\"provisioningState\":\"Failed\"}}},\"identity\":{\"principalId\":\"4e9d45d5-9993-4d5e-956e-afa53d820d11\",\"tenantId\":\"0bd69aea-19b9-464a-894d-f0c666a4f28c\",\"type\":\"SystemAssigned\",\"userAssignedIdentities\":{\"by\":{\"principalId\":\"59e2d09a-be5b-4633-b0d0-8d448a9a2d68\",\"clientId\":\"9e6dc9ad-5317-4565-a2ba-2d9d95c40f9a\"},\"fclhaaxdbabphlwr\":{\"principalId\":\"1bbf30c6-ac2d-4140-bb61-9e8e1800d572\",\"clientId\":\"a0ecb2b4-9432-4c28-8ffc-f726050b1133\"},\"ktsthsucocmny\":{\"principalId\":\"8eeb914e-fa06-45f5-94bb-d9a976cfd92a\",\"clientId\":\"3d80fb79-7470-40fd-9c1e-cd36b3203fa2\"}}},\"location\":\"zt\",\"tags\":{\"uedck\":\"wwrq\",\"bxu\":\"ywbiexzfeyueax\"},\"id\":\"wbhqwal\",\"name\":\"uzyoxaep\",\"type\":\"kzjancuxrhdwbav\"}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito.when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito.when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito.when(httpClient.send(httpRequest.capture(), Mockito.any())).thenReturn(Mono.defer(() -> {
            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
            return Mono.just(httpResponse);
        }));

        AstroManager manager = AstroManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        OrganizationResource response = manager.organizations()
            .getByResourceGroupWithResponse("ctq", "jf", com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("zt", response.location());
        Assertions.assertEquals("wwrq", response.tags().get("uedck"));
        Assertions.assertEquals("brjcxe", response.properties().marketplace().subscriptionId());
        Assertions.assertEquals(MarketplaceSubscriptionStatus.UNSUBSCRIBED,
            response.properties().marketplace().subscriptionStatus());
        Assertions.assertEquals("wutttxfvjrbi", response.properties().marketplace().offerDetails().publisherId());
        Assertions.assertEquals("phxepcyvahf", response.properties().marketplace().offerDetails().offerId());
        Assertions.assertEquals("ljkyqxjvuuj", response.properties().marketplace().offerDetails().planId());
        Assertions.assertEquals("idokgjlj", response.properties().marketplace().offerDetails().planName());
        Assertions.assertEquals("xgvcl", response.properties().marketplace().offerDetails().termUnit());
        Assertions.assertEquals("gsncghkjeszz", response.properties().marketplace().offerDetails().termId());
        Assertions.assertEquals("bijhtxfvgxbf", response.properties().user().firstName());
        Assertions.assertEquals("mxnehmp", response.properties().user().lastName());
        Assertions.assertEquals("ec", response.properties().user().emailAddress());
        Assertions.assertEquals("odebfqkkrbmpu", response.properties().user().upn());
        Assertions.assertEquals("riwflzlfb", response.properties().user().phoneNumber());
        Assertions.assertEquals("ycispnqzahmgkb",
            response.properties().partnerOrganizationProperties().organizationId());
        Assertions.assertEquals("yydhibnuqqk", response.properties().partnerOrganizationProperties().workspaceId());
        Assertions.assertEquals("ik", response.properties().partnerOrganizationProperties().organizationName());
        Assertions.assertEquals("rgvtqag", response.properties().partnerOrganizationProperties().workspaceName());
        Assertions.assertEquals(SingleSignOnStates.DISABLE,
            response.properties().partnerOrganizationProperties().singleSignOnProperties().singleSignOnState());
        Assertions.assertEquals("hijggme",
            response.properties().partnerOrganizationProperties().singleSignOnProperties().enterpriseAppId());
        Assertions.assertEquals("siarbutrcvpn",
            response.properties().partnerOrganizationProperties().singleSignOnProperties().singleSignOnUrl());
        Assertions.assertEquals("mhjrunmpxttdbhr",
            response.properties().partnerOrganizationProperties().singleSignOnProperties().aadDomains().get(0));
        Assertions.assertEquals(ManagedServiceIdentityType.SYSTEM_ASSIGNED, response.identity().type());
    }
}
