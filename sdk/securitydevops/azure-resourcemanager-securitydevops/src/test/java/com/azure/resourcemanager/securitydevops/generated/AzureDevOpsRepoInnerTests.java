// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securitydevops.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.securitydevops.fluent.models.AzureDevOpsRepoInner;
import com.azure.resourcemanager.securitydevops.models.ActionableRemediation;
import com.azure.resourcemanager.securitydevops.models.ActionableRemediationState;
import com.azure.resourcemanager.securitydevops.models.AzureDevOpsRepoProperties;
import com.azure.resourcemanager.securitydevops.models.ProvisioningState;
import com.azure.resourcemanager.securitydevops.models.RuleCategory;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AzureDevOpsRepoInnerTests {
    @Test
    public void testDeserialize() {
        AzureDevOpsRepoInner model = BinaryData.fromString(
            "{\"properties\":{\"provisioningState\":\"Succeeded\",\"repoId\":\"nfygxgispemvtz\",\"repoUrl\":\"ufubl\",\"orgName\":\"fxqeof\",\"projectName\":\"e\",\"visibility\":\"hqjbasvmsmj\",\"actionableRemediation\":{\"state\":\"Disabled\",\"severityLevels\":[\"ntnbybkzg\",\"wrwclxxwrljd\",\"uskcqvkocrcj\"],\"categories\":[\"IaC\",\"Containers\",\"Containers\",\"Containers\"]}},\"id\":\"jbiksqrglssai\",\"name\":\"qpjwnzlljfm\",\"type\":\"pee\"}")
            .toObject(AzureDevOpsRepoInner.class);
        Assertions.assertEquals(ProvisioningState.SUCCEEDED, model.properties().provisioningState());
        Assertions.assertEquals("nfygxgispemvtz", model.properties().repoId());
        Assertions.assertEquals("ufubl", model.properties().repoUrl());
        Assertions.assertEquals("fxqeof", model.properties().orgName());
        Assertions.assertEquals("e", model.properties().projectName());
        Assertions.assertEquals("hqjbasvmsmj", model.properties().visibility());
        Assertions.assertEquals(ActionableRemediationState.DISABLED,
            model.properties().actionableRemediation().state());
        Assertions.assertEquals("ntnbybkzg", model.properties().actionableRemediation().severityLevels().get(0));
        Assertions.assertEquals(RuleCategory.IAC, model.properties().actionableRemediation().categories().get(0));
    }

    @Test
    public void testSerialize() {
        AzureDevOpsRepoInner model = new AzureDevOpsRepoInner()
            .withProperties(new AzureDevOpsRepoProperties().withProvisioningState(ProvisioningState.SUCCEEDED)
                .withRepoId("nfygxgispemvtz")
                .withRepoUrl("ufubl")
                .withOrgName("fxqeof")
                .withProjectName("e")
                .withVisibility("hqjbasvmsmj")
                .withActionableRemediation(new ActionableRemediation().withState(ActionableRemediationState.DISABLED)
                    .withSeverityLevels(Arrays.asList("ntnbybkzg", "wrwclxxwrljd", "uskcqvkocrcj"))
                    .withCategories(Arrays.asList(RuleCategory.IAC, RuleCategory.CONTAINERS, RuleCategory.CONTAINERS,
                        RuleCategory.CONTAINERS))));
        model = BinaryData.fromObject(model).toObject(AzureDevOpsRepoInner.class);
        Assertions.assertEquals(ProvisioningState.SUCCEEDED, model.properties().provisioningState());
        Assertions.assertEquals("nfygxgispemvtz", model.properties().repoId());
        Assertions.assertEquals("ufubl", model.properties().repoUrl());
        Assertions.assertEquals("fxqeof", model.properties().orgName());
        Assertions.assertEquals("e", model.properties().projectName());
        Assertions.assertEquals("hqjbasvmsmj", model.properties().visibility());
        Assertions.assertEquals(ActionableRemediationState.DISABLED,
            model.properties().actionableRemediation().state());
        Assertions.assertEquals("ntnbybkzg", model.properties().actionableRemediation().severityLevels().get(0));
        Assertions.assertEquals(RuleCategory.IAC, model.properties().actionableRemediation().categories().get(0));
    }
}
