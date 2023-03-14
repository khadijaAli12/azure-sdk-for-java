// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Settings for upgrading a cluster. */
@Fluent
public final class ClusterUpgradeSettings {
    /*
     * Settings for overrides.
     */
    @JsonProperty(value = "overrideSettings")
    private UpgradeOverrideSettings overrideSettings;

    /** Creates an instance of ClusterUpgradeSettings class. */
    public ClusterUpgradeSettings() {
    }

    /**
     * Get the overrideSettings property: Settings for overrides.
     *
     * @return the overrideSettings value.
     */
    public UpgradeOverrideSettings overrideSettings() {
        return this.overrideSettings;
    }

    /**
     * Set the overrideSettings property: Settings for overrides.
     *
     * @param overrideSettings the overrideSettings value to set.
     * @return the ClusterUpgradeSettings object itself.
     */
    public ClusterUpgradeSettings withOverrideSettings(UpgradeOverrideSettings overrideSettings) {
        this.overrideSettings = overrideSettings;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (overrideSettings() != null) {
            overrideSettings().validate();
        }
    }
}