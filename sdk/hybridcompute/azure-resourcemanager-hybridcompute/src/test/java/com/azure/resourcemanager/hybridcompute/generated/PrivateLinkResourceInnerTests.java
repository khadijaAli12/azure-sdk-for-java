// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hybridcompute.fluent.models.PrivateLinkResourceInner;
import com.azure.resourcemanager.hybridcompute.models.PrivateLinkResourceProperties;

public final class PrivateLinkResourceInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PrivateLinkResourceInner model = BinaryData.fromString(
            "{\"properties\":{\"groupId\":\"j\",\"requiredMembers\":[\"xxpshneeku\",\"fgslqubkwdl\"],\"requiredZoneNames\":[\"d\"]},\"id\":\"tujbazpju\",\"name\":\"hminyflnorwmduv\",\"type\":\"pklvxw\"}")
            .toObject(PrivateLinkResourceInner.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PrivateLinkResourceInner model
            = new PrivateLinkResourceInner().withProperties(new PrivateLinkResourceProperties());
        model = BinaryData.fromObject(model).toObject(PrivateLinkResourceInner.class);
    }
}
