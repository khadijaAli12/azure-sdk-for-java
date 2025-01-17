// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.securityinsights.SecurityInsightsManager;
import com.azure.resourcemanager.securityinsights.models.AutomationRule;
import com.azure.resourcemanager.securityinsights.models.TriggersOn;
import com.azure.resourcemanager.securityinsights.models.TriggersWhen;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class AutomationRulesGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"displayName\":\"qtlfoz\",\"order\":1923772072,\"triggeringLogic\":{\"isEnabled\":false,\"expirationTimeUtc\":\"2021-10-27T06:43:47Z\",\"triggersOn\":\"Incidents\",\"triggersWhen\":\"Updated\",\"conditions\":[{\"conditionType\":\"AutomationRuleCondition\"},{\"conditionType\":\"AutomationRuleCondition\"},{\"conditionType\":\"AutomationRuleCondition\"}]},\"actions\":[{\"actionType\":\"AutomationRuleAction\",\"order\":948560497}],\"lastModifiedTimeUtc\":\"2021-05-24T12:37:52Z\",\"createdTimeUtc\":\"2021-07-27T13:23:57Z\",\"lastModifiedBy\":{\"email\":\"xz\",\"name\":\"mkanbc\",\"objectId\":\"0e935fed-bb45-4fe8-a5d7-6884833253cf\",\"userPrincipalName\":\"ofmex\"},\"createdBy\":{\"email\":\"mas\",\"name\":\"anydsc\",\"objectId\":\"d519e9b6-c159-432c-b473-60563e42a131\",\"userPrincipalName\":\"w\"}},\"etag\":\"wj\",\"id\":\"haahntofelfhpfi\",\"name\":\"oskkz\",\"type\":\"fivsujybsr\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        SecurityInsightsManager manager = SecurityInsightsManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        AutomationRule response = manager.automationRules()
            .getWithResponse("rexw", "onbexft", "daubheeggzgr", com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("wj", response.etag());
        Assertions.assertEquals("qtlfoz", response.displayName());
        Assertions.assertEquals(1923772072, response.order());
        Assertions.assertEquals(false, response.triggeringLogic().isEnabled());
        Assertions.assertEquals(OffsetDateTime.parse("2021-10-27T06:43:47Z"),
            response.triggeringLogic().expirationTimeUtc());
        Assertions.assertEquals(TriggersOn.INCIDENTS, response.triggeringLogic().triggersOn());
        Assertions.assertEquals(TriggersWhen.UPDATED, response.triggeringLogic().triggersWhen());
        Assertions.assertEquals(948560497, response.actions().get(0).order());
    }
}
