// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.implementation;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.synapse.fluent.models.DataConnectionInner;
import com.azure.resourcemanager.synapse.models.DataConnection;
import com.azure.resourcemanager.synapse.models.DataConnectionKind;

public final class DataConnectionImpl implements DataConnection {
    private DataConnectionInner innerObject;

    private final com.azure.resourcemanager.synapse.SynapseManager serviceManager;

    DataConnectionImpl(DataConnectionInner innerObject,
        com.azure.resourcemanager.synapse.SynapseManager serviceManager) {
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

    public DataConnectionKind kind() {
        return this.innerModel().kind();
    }

    public String location() {
        return this.innerModel().location();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public DataConnectionInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.synapse.SynapseManager manager() {
        return this.serviceManager;
    }
}
