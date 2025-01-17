// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iotcentral.implementation;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.iotcentral.fluent.models.PrivateEndpointConnectionInner;
import com.azure.resourcemanager.iotcentral.models.PrivateEndpoint;
import com.azure.resourcemanager.iotcentral.models.PrivateEndpointConnection;
import com.azure.resourcemanager.iotcentral.models.PrivateEndpointConnectionProvisioningState;
import com.azure.resourcemanager.iotcentral.models.PrivateLinkServiceConnectionState;
import java.util.Collections;
import java.util.List;

public final class PrivateEndpointConnectionImpl
    implements PrivateEndpointConnection, PrivateEndpointConnection.Definition {
    private PrivateEndpointConnectionInner innerObject;

    private final com.azure.resourcemanager.iotcentral.IotCentralManager serviceManager;

    PrivateEndpointConnectionImpl(PrivateEndpointConnectionInner innerObject,
        com.azure.resourcemanager.iotcentral.IotCentralManager serviceManager) {
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

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public List<String> groupIds() {
        List<String> inner = this.innerModel().groupIds();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public PrivateEndpoint privateEndpoint() {
        return this.innerModel().privateEndpoint();
    }

    public PrivateLinkServiceConnectionState privateLinkServiceConnectionState() {
        return this.innerModel().privateLinkServiceConnectionState();
    }

    public PrivateEndpointConnectionProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public PrivateEndpointConnectionInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.iotcentral.IotCentralManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String resourceName;

    private String privateEndpointConnectionName;

    public PrivateEndpointConnectionImpl withExistingIotApp(String resourceGroupName, String resourceName) {
        this.resourceGroupName = resourceGroupName;
        this.resourceName = resourceName;
        return this;
    }

    public PrivateEndpointConnection create() {
        this.innerObject = serviceManager.serviceClient()
            .getPrivateEndpointConnections()
            .create(resourceGroupName, resourceName, privateEndpointConnectionName, this.innerModel(), Context.NONE);
        return this;
    }

    public PrivateEndpointConnection create(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getPrivateEndpointConnections()
            .create(resourceGroupName, resourceName, privateEndpointConnectionName, this.innerModel(), context);
        return this;
    }

    PrivateEndpointConnectionImpl(String name, com.azure.resourcemanager.iotcentral.IotCentralManager serviceManager) {
        this.innerObject = new PrivateEndpointConnectionInner();
        this.serviceManager = serviceManager;
        this.privateEndpointConnectionName = name;
    }

    public PrivateEndpointConnection refresh() {
        this.innerObject = serviceManager.serviceClient()
            .getPrivateEndpointConnections()
            .getWithResponse(resourceGroupName, resourceName, privateEndpointConnectionName, Context.NONE)
            .getValue();
        return this;
    }

    public PrivateEndpointConnection refresh(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getPrivateEndpointConnections()
            .getWithResponse(resourceGroupName, resourceName, privateEndpointConnectionName, context)
            .getValue();
        return this;
    }

    public PrivateEndpointConnectionImpl withPrivateEndpoint(PrivateEndpoint privateEndpoint) {
        this.innerModel().withPrivateEndpoint(privateEndpoint);
        return this;
    }

    public PrivateEndpointConnectionImpl
        withPrivateLinkServiceConnectionState(PrivateLinkServiceConnectionState privateLinkServiceConnectionState) {
        this.innerModel().withPrivateLinkServiceConnectionState(privateLinkServiceConnectionState);
        return this;
    }
}
