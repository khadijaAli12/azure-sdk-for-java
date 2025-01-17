// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.securityinsights.models.ActivityEntityQueriesPropertiesQueryDefinitions;
import com.azure.resourcemanager.securityinsights.models.ActivityEntityQuery;
import com.azure.resourcemanager.securityinsights.models.EntityType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ActivityEntityQueryTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ActivityEntityQuery model = BinaryData.fromString(
            "{\"kind\":\"Activity\",\"properties\":{\"title\":\"x\",\"content\":\"ecrsnh\",\"description\":\"selqxov\",\"queryDefinitions\":{\"query\":\"ibuk\"},\"inputEntityType\":\"RegistryValue\",\"requiredInputFieldsSets\":[[\"rmlccmet\",\"scz\",\"vfqbqna\",\"dsyenzsieuscpl\"]],\"entitiesFilter\":{\"pzbtzuyk\":[\"gxlyzkxitdshezs\",\"kol\",\"upjo\",\"mozsayebrazwz\"],\"zwyqejga\":[\"ip\",\"sdyepfno\",\"mbezacfpztg\"]},\"templateName\":\"kctgkp\",\"enabled\":true,\"createdTimeUtc\":\"2021-10-20T02:45:22Z\",\"lastModifiedTimeUtc\":\"2021-04-06T11:21:22Z\"},\"etag\":\"zmffngdyfcixrh\",\"id\":\"qvhoej\",\"name\":\"oiutgwrmkahpq\",\"type\":\"azyntacihncogm\"}")
            .toObject(ActivityEntityQuery.class);
        Assertions.assertEquals("zmffngdyfcixrh", model.etag());
        Assertions.assertEquals("x", model.title());
        Assertions.assertEquals("ecrsnh", model.content());
        Assertions.assertEquals("selqxov", model.description());
        Assertions.assertEquals("ibuk", model.queryDefinitions().query());
        Assertions.assertEquals(EntityType.REGISTRY_VALUE, model.inputEntityType());
        Assertions.assertEquals("rmlccmet", model.requiredInputFieldsSets().get(0).get(0));
        Assertions.assertEquals("gxlyzkxitdshezs", model.entitiesFilter().get("pzbtzuyk").get(0));
        Assertions.assertEquals("kctgkp", model.templateName());
        Assertions.assertEquals(true, model.enabled());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ActivityEntityQuery model = new ActivityEntityQuery().withEtag("zmffngdyfcixrh")
            .withTitle("x")
            .withContent("ecrsnh")
            .withDescription("selqxov")
            .withQueryDefinitions(new ActivityEntityQueriesPropertiesQueryDefinitions().withQuery("ibuk"))
            .withInputEntityType(EntityType.REGISTRY_VALUE)
            .withRequiredInputFieldsSets(Arrays.asList(Arrays.asList("rmlccmet", "scz", "vfqbqna", "dsyenzsieuscpl")))
            .withEntitiesFilter(mapOf("pzbtzuyk", Arrays.asList("gxlyzkxitdshezs", "kol", "upjo", "mozsayebrazwz"),
                "zwyqejga", Arrays.asList("ip", "sdyepfno", "mbezacfpztg")))
            .withTemplateName("kctgkp")
            .withEnabled(true);
        model = BinaryData.fromObject(model).toObject(ActivityEntityQuery.class);
        Assertions.assertEquals("zmffngdyfcixrh", model.etag());
        Assertions.assertEquals("x", model.title());
        Assertions.assertEquals("ecrsnh", model.content());
        Assertions.assertEquals("selqxov", model.description());
        Assertions.assertEquals("ibuk", model.queryDefinitions().query());
        Assertions.assertEquals(EntityType.REGISTRY_VALUE, model.inputEntityType());
        Assertions.assertEquals("rmlccmet", model.requiredInputFieldsSets().get(0).get(0));
        Assertions.assertEquals("gxlyzkxitdshezs", model.entitiesFilter().get("pzbtzuyk").get(0));
        Assertions.assertEquals("kctgkp", model.templateName());
        Assertions.assertEquals(true, model.enabled());
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
