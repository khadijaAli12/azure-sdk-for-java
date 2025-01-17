// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.iothub.models.CertificateVerificationDescription;
import org.junit.jupiter.api.Assertions;

public final class CertificateVerificationDescriptionTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CertificateVerificationDescription model
            = BinaryData.fromString("{\"certificate\":\"chea\"}").toObject(CertificateVerificationDescription.class);
        Assertions.assertEquals("chea", model.certificate());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CertificateVerificationDescription model = new CertificateVerificationDescription().withCertificate("chea");
        model = BinaryData.fromObject(model).toObject(CertificateVerificationDescription.class);
        Assertions.assertEquals("chea", model.certificate());
    }
}
