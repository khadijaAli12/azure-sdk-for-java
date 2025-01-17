// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managementgroups.implementation;

import com.azure.resourcemanager.managementgroups.fluent.models.HierarchySettingsInner;
import com.azure.resourcemanager.managementgroups.models.HierarchySettings;

public final class HierarchySettingsImpl implements HierarchySettings {
    private HierarchySettingsInner innerObject;

    private final com.azure.resourcemanager.managementgroups.ManagementGroupsManager serviceManager;

    HierarchySettingsImpl(HierarchySettingsInner innerObject,
        com.azure.resourcemanager.managementgroups.ManagementGroupsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String tenantId() {
        return this.innerModel().tenantId();
    }

    public Boolean requireAuthorizationForGroupCreation() {
        return this.innerModel().requireAuthorizationForGroupCreation();
    }

    public String defaultManagementGroup() {
        return this.innerModel().defaultManagementGroup();
    }

    public HierarchySettingsInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.managementgroups.ManagementGroupsManager manager() {
        return this.serviceManager;
    }
}
