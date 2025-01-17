// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.powerbidedicated.implementation;

import com.azure.resourcemanager.powerbidedicated.fluent.models.SkuEnumerationForNewResourceResultInner;
import com.azure.resourcemanager.powerbidedicated.models.CapacitySku;
import com.azure.resourcemanager.powerbidedicated.models.SkuEnumerationForNewResourceResult;
import java.util.Collections;
import java.util.List;

public final class SkuEnumerationForNewResourceResultImpl implements SkuEnumerationForNewResourceResult {
    private SkuEnumerationForNewResourceResultInner innerObject;

    private final com.azure.resourcemanager.powerbidedicated.PowerBIDedicatedManager serviceManager;

    SkuEnumerationForNewResourceResultImpl(SkuEnumerationForNewResourceResultInner innerObject,
        com.azure.resourcemanager.powerbidedicated.PowerBIDedicatedManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public List<CapacitySku> value() {
        List<CapacitySku> inner = this.innerModel().value();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public SkuEnumerationForNewResourceResultInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.powerbidedicated.PowerBIDedicatedManager manager() {
        return this.serviceManager;
    }
}
