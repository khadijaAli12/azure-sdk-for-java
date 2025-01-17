// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SystemData;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.securityinsights.fluent.models.EntityInner;
import com.azure.resourcemanager.securityinsights.fluent.models.ProcessEntityProperties;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.Map;

/**
 * Represents a process entity.
 */
@Fluent
public final class ProcessEntity extends EntityInner {
    /*
     * The kind of the entity.
     */
    private EntityKind kind = EntityKind.PROCESS;

    /*
     * Process entity properties
     */
    private ProcessEntityProperties innerProperties;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    private SystemData systemData;

    /*
     * The type of the resource.
     */
    private String type;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /**
     * Creates an instance of ProcessEntity class.
     */
    public ProcessEntity() {
    }

    /**
     * Get the kind property: The kind of the entity.
     * 
     * @return the kind value.
     */
    @Override
    public EntityKind kind() {
        return this.kind;
    }

    /**
     * Get the innerProperties property: Process entity properties.
     * 
     * @return the innerProperties value.
     */
    private ProcessEntityProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     * @return the systemData value.
     */
    @Override
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the type property: The type of the resource.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
    }

    /**
     * Get the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    @Override
    public String id() {
        return this.id;
    }

    /**
     * Get the accountEntityId property: The account entity id running the processes.
     * 
     * @return the accountEntityId value.
     */
    public String accountEntityId() {
        return this.innerProperties() == null ? null : this.innerProperties().accountEntityId();
    }

    /**
     * Get the commandLine property: The command line used to create the process.
     * 
     * @return the commandLine value.
     */
    public String commandLine() {
        return this.innerProperties() == null ? null : this.innerProperties().commandLine();
    }

    /**
     * Get the creationTimeUtc property: The time when the process started to run.
     * 
     * @return the creationTimeUtc value.
     */
    public OffsetDateTime creationTimeUtc() {
        return this.innerProperties() == null ? null : this.innerProperties().creationTimeUtc();
    }

    /**
     * Get the elevationToken property: The elevation token associated with the process.
     * 
     * @return the elevationToken value.
     */
    public ElevationToken elevationToken() {
        return this.innerProperties() == null ? null : this.innerProperties().elevationToken();
    }

    /**
     * Set the elevationToken property: The elevation token associated with the process.
     * 
     * @param elevationToken the elevationToken value to set.
     * @return the ProcessEntity object itself.
     */
    public ProcessEntity withElevationToken(ElevationToken elevationToken) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ProcessEntityProperties();
        }
        this.innerProperties().withElevationToken(elevationToken);
        return this;
    }

    /**
     * Get the hostEntityId property: The host entity id on which the process was running.
     * 
     * @return the hostEntityId value.
     */
    public String hostEntityId() {
        return this.innerProperties() == null ? null : this.innerProperties().hostEntityId();
    }

    /**
     * Get the hostLogonSessionEntityId property: The session entity id in which the process was running.
     * 
     * @return the hostLogonSessionEntityId value.
     */
    public String hostLogonSessionEntityId() {
        return this.innerProperties() == null ? null : this.innerProperties().hostLogonSessionEntityId();
    }

    /**
     * Get the imageFileEntityId property: Image file entity id.
     * 
     * @return the imageFileEntityId value.
     */
    public String imageFileEntityId() {
        return this.innerProperties() == null ? null : this.innerProperties().imageFileEntityId();
    }

    /**
     * Get the parentProcessEntityId property: The parent process entity id.
     * 
     * @return the parentProcessEntityId value.
     */
    public String parentProcessEntityId() {
        return this.innerProperties() == null ? null : this.innerProperties().parentProcessEntityId();
    }

    /**
     * Get the processId property: The process ID.
     * 
     * @return the processId value.
     */
    public String processId() {
        return this.innerProperties() == null ? null : this.innerProperties().processId();
    }

    /**
     * Get the additionalData property: A bag of custom fields that should be part of the entity and will be presented
     * to the user.
     * 
     * @return the additionalData value.
     */
    public Map<String, Object> additionalData() {
        return this.innerProperties() == null ? null : this.innerProperties().additionalData();
    }

    /**
     * Get the friendlyName property: The graph item display name which is a short humanly readable description of the
     * graph item instance. This property is optional and might be system generated.
     * 
     * @return the friendlyName value.
     */
    public String friendlyName() {
        return this.innerProperties() == null ? null : this.innerProperties().friendlyName();
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("kind", this.kind == null ? null : this.kind.toString());
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ProcessEntity from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ProcessEntity if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ProcessEntity.
     */
    public static ProcessEntity fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ProcessEntity deserializedProcessEntity = new ProcessEntity();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedProcessEntity.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedProcessEntity.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedProcessEntity.type = reader.getString();
                } else if ("systemData".equals(fieldName)) {
                    deserializedProcessEntity.systemData = SystemData.fromJson(reader);
                } else if ("kind".equals(fieldName)) {
                    deserializedProcessEntity.kind = EntityKind.fromString(reader.getString());
                } else if ("properties".equals(fieldName)) {
                    deserializedProcessEntity.innerProperties = ProcessEntityProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedProcessEntity;
        });
    }
}
