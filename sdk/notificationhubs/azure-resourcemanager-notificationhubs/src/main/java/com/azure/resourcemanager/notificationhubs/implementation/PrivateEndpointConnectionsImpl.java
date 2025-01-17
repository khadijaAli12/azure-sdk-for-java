// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.notificationhubs.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.notificationhubs.fluent.PrivateEndpointConnectionsClient;
import com.azure.resourcemanager.notificationhubs.fluent.models.PrivateEndpointConnectionResourceInner;
import com.azure.resourcemanager.notificationhubs.fluent.models.PrivateLinkResourceInner;
import com.azure.resourcemanager.notificationhubs.models.PrivateEndpointConnectionResource;
import com.azure.resourcemanager.notificationhubs.models.PrivateEndpointConnections;
import com.azure.resourcemanager.notificationhubs.models.PrivateLinkResource;

public final class PrivateEndpointConnectionsImpl implements PrivateEndpointConnections {
    private static final ClientLogger LOGGER = new ClientLogger(PrivateEndpointConnectionsImpl.class);

    private final PrivateEndpointConnectionsClient innerClient;

    private final com.azure.resourcemanager.notificationhubs.NotificationHubsManager serviceManager;

    public PrivateEndpointConnectionsImpl(PrivateEndpointConnectionsClient innerClient,
        com.azure.resourcemanager.notificationhubs.NotificationHubsManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PrivateEndpointConnectionResource update(String resourceGroupName, String namespaceName,
        String privateEndpointConnectionName, PrivateEndpointConnectionResourceInner parameters) {
        PrivateEndpointConnectionResourceInner inner
            = this.serviceClient().update(resourceGroupName, namespaceName, privateEndpointConnectionName, parameters);
        if (inner != null) {
            return new PrivateEndpointConnectionResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PrivateEndpointConnectionResource update(String resourceGroupName, String namespaceName,
        String privateEndpointConnectionName, PrivateEndpointConnectionResourceInner parameters, Context context) {
        PrivateEndpointConnectionResourceInner inner = this.serviceClient()
            .update(resourceGroupName, namespaceName, privateEndpointConnectionName, parameters, context);
        if (inner != null) {
            return new PrivateEndpointConnectionResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String namespaceName, String privateEndpointConnectionName) {
        this.serviceClient().delete(resourceGroupName, namespaceName, privateEndpointConnectionName);
    }

    public void delete(String resourceGroupName, String namespaceName, String privateEndpointConnectionName,
        Context context) {
        this.serviceClient().delete(resourceGroupName, namespaceName, privateEndpointConnectionName, context);
    }

    public Response<PrivateEndpointConnectionResource> getWithResponse(String resourceGroupName, String namespaceName,
        String privateEndpointConnectionName, Context context) {
        Response<PrivateEndpointConnectionResourceInner> inner = this.serviceClient()
            .getWithResponse(resourceGroupName, namespaceName, privateEndpointConnectionName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new PrivateEndpointConnectionResourceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PrivateEndpointConnectionResource get(String resourceGroupName, String namespaceName,
        String privateEndpointConnectionName) {
        PrivateEndpointConnectionResourceInner inner
            = this.serviceClient().get(resourceGroupName, namespaceName, privateEndpointConnectionName);
        if (inner != null) {
            return new PrivateEndpointConnectionResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PagedIterable<PrivateEndpointConnectionResource> list(String resourceGroupName, String namespaceName) {
        PagedIterable<PrivateEndpointConnectionResourceInner> inner
            = this.serviceClient().list(resourceGroupName, namespaceName);
        return ResourceManagerUtils.mapPage(inner,
            inner1 -> new PrivateEndpointConnectionResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<PrivateEndpointConnectionResource> list(String resourceGroupName, String namespaceName,
        Context context) {
        PagedIterable<PrivateEndpointConnectionResourceInner> inner
            = this.serviceClient().list(resourceGroupName, namespaceName, context);
        return ResourceManagerUtils.mapPage(inner,
            inner1 -> new PrivateEndpointConnectionResourceImpl(inner1, this.manager()));
    }

    public Response<PrivateLinkResource> getGroupIdWithResponse(String resourceGroupName, String namespaceName,
        String subResourceName, Context context) {
        Response<PrivateLinkResourceInner> inner
            = this.serviceClient().getGroupIdWithResponse(resourceGroupName, namespaceName, subResourceName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new PrivateLinkResourceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PrivateLinkResource getGroupId(String resourceGroupName, String namespaceName, String subResourceName) {
        PrivateLinkResourceInner inner
            = this.serviceClient().getGroupId(resourceGroupName, namespaceName, subResourceName);
        if (inner != null) {
            return new PrivateLinkResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PagedIterable<PrivateLinkResource> listGroupIds(String resourceGroupName, String namespaceName) {
        PagedIterable<PrivateLinkResourceInner> inner
            = this.serviceClient().listGroupIds(resourceGroupName, namespaceName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new PrivateLinkResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<PrivateLinkResource> listGroupIds(String resourceGroupName, String namespaceName,
        Context context) {
        PagedIterable<PrivateLinkResourceInner> inner
            = this.serviceClient().listGroupIds(resourceGroupName, namespaceName, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new PrivateLinkResourceImpl(inner1, this.manager()));
    }

    private PrivateEndpointConnectionsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.notificationhubs.NotificationHubsManager manager() {
        return this.serviceManager;
    }
}
