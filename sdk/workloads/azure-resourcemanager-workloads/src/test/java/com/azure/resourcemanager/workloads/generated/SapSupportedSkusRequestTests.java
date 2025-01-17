// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloads.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.workloads.models.SapDatabaseType;
import com.azure.resourcemanager.workloads.models.SapDeploymentType;
import com.azure.resourcemanager.workloads.models.SapEnvironmentType;
import com.azure.resourcemanager.workloads.models.SapHighAvailabilityType;
import com.azure.resourcemanager.workloads.models.SapProductType;
import com.azure.resourcemanager.workloads.models.SapSupportedSkusRequest;
import org.junit.jupiter.api.Assertions;

public final class SapSupportedSkusRequestTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SapSupportedSkusRequest model = BinaryData.fromString(
            "{\"appLocation\":\"h\",\"environment\":\"NonProd\",\"sapProduct\":\"Other\",\"deploymentType\":\"SingleServer\",\"databaseType\":\"HANA\",\"highAvailabilityType\":\"AvailabilityZone\"}")
            .toObject(SapSupportedSkusRequest.class);
        Assertions.assertEquals("h", model.appLocation());
        Assertions.assertEquals(SapEnvironmentType.NON_PROD, model.environment());
        Assertions.assertEquals(SapProductType.OTHER, model.sapProduct());
        Assertions.assertEquals(SapDeploymentType.SINGLE_SERVER, model.deploymentType());
        Assertions.assertEquals(SapDatabaseType.HANA, model.databaseType());
        Assertions.assertEquals(SapHighAvailabilityType.AVAILABILITY_ZONE, model.highAvailabilityType());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SapSupportedSkusRequest model = new SapSupportedSkusRequest().withAppLocation("h")
            .withEnvironment(SapEnvironmentType.NON_PROD)
            .withSapProduct(SapProductType.OTHER)
            .withDeploymentType(SapDeploymentType.SINGLE_SERVER)
            .withDatabaseType(SapDatabaseType.HANA)
            .withHighAvailabilityType(SapHighAvailabilityType.AVAILABILITY_ZONE);
        model = BinaryData.fromObject(model).toObject(SapSupportedSkusRequest.class);
        Assertions.assertEquals("h", model.appLocation());
        Assertions.assertEquals(SapEnvironmentType.NON_PROD, model.environment());
        Assertions.assertEquals(SapProductType.OTHER, model.sapProduct());
        Assertions.assertEquals(SapDeploymentType.SINGLE_SERVER, model.deploymentType());
        Assertions.assertEquals(SapDatabaseType.HANA, model.databaseType());
        Assertions.assertEquals(SapHighAvailabilityType.AVAILABILITY_ZONE, model.highAvailabilityType());
    }
}
