// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.commerce.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.commerce.models.RecurringCharge;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;

public final class RecurringChargeTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RecurringCharge model = BinaryData
            .fromString("{\"Name\":\"Recurring"
                + " Charge\",\"RecurringCharge\":1084941449,\"EffectiveDate\":\"2021-01-26T04:33:28Z\"}")
            .toObject(RecurringCharge.class);
        Assertions.assertEquals(OffsetDateTime.parse("2021-01-26T04:33:28Z"), model.effectiveDate());
        Assertions.assertEquals(1084941449, model.recurringCharge());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RecurringCharge model = new RecurringCharge().withEffectiveDate(OffsetDateTime.parse("2021-01-26T04:33:28Z"))
            .withRecurringCharge(1084941449);
        model = BinaryData.fromObject(model).toObject(RecurringCharge.class);
        Assertions.assertEquals(OffsetDateTime.parse("2021-01-26T04:33:28Z"), model.effectiveDate());
        Assertions.assertEquals(1084941449, model.recurringCharge());
    }
}
