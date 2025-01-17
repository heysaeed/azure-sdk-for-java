// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysqlflexibleserver.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.mysqlflexibleserver.models.AdministratorType;
import java.io.IOException;

/**
 * Represents a Administrator.
 */
@Fluent
public final class AzureADAdministratorInner extends ProxyResource {
    /*
     * The properties of an administrator.
     */
    private AdministratorProperties innerProperties;

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
     * Creates an instance of AzureADAdministratorInner class.
     */
    public AzureADAdministratorInner() {
    }

    /**
     * Get the innerProperties property: The properties of an administrator.
     * 
     * @return the innerProperties value.
     */
    private AdministratorProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     * @return the systemData value.
     */
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
     * Get the administratorType property: Type of the sever administrator.
     * 
     * @return the administratorType value.
     */
    public AdministratorType administratorType() {
        return this.innerProperties() == null ? null : this.innerProperties().administratorType();
    }

    /**
     * Set the administratorType property: Type of the sever administrator.
     * 
     * @param administratorType the administratorType value to set.
     * @return the AzureADAdministratorInner object itself.
     */
    public AzureADAdministratorInner withAdministratorType(AdministratorType administratorType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AdministratorProperties();
        }
        this.innerProperties().withAdministratorType(administratorType);
        return this;
    }

    /**
     * Get the login property: Login name of the server administrator.
     * 
     * @return the login value.
     */
    public String login() {
        return this.innerProperties() == null ? null : this.innerProperties().login();
    }

    /**
     * Set the login property: Login name of the server administrator.
     * 
     * @param login the login value to set.
     * @return the AzureADAdministratorInner object itself.
     */
    public AzureADAdministratorInner withLogin(String login) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AdministratorProperties();
        }
        this.innerProperties().withLogin(login);
        return this;
    }

    /**
     * Get the sid property: SID (object ID) of the server administrator.
     * 
     * @return the sid value.
     */
    public String sid() {
        return this.innerProperties() == null ? null : this.innerProperties().sid();
    }

    /**
     * Set the sid property: SID (object ID) of the server administrator.
     * 
     * @param sid the sid value to set.
     * @return the AzureADAdministratorInner object itself.
     */
    public AzureADAdministratorInner withSid(String sid) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AdministratorProperties();
        }
        this.innerProperties().withSid(sid);
        return this;
    }

    /**
     * Get the tenantId property: Tenant ID of the administrator.
     * 
     * @return the tenantId value.
     */
    public String tenantId() {
        return this.innerProperties() == null ? null : this.innerProperties().tenantId();
    }

    /**
     * Set the tenantId property: Tenant ID of the administrator.
     * 
     * @param tenantId the tenantId value to set.
     * @return the AzureADAdministratorInner object itself.
     */
    public AzureADAdministratorInner withTenantId(String tenantId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AdministratorProperties();
        }
        this.innerProperties().withTenantId(tenantId);
        return this;
    }

    /**
     * Get the identityResourceId property: The resource id of the identity used for AAD Authentication.
     * 
     * @return the identityResourceId value.
     */
    public String identityResourceId() {
        return this.innerProperties() == null ? null : this.innerProperties().identityResourceId();
    }

    /**
     * Set the identityResourceId property: The resource id of the identity used for AAD Authentication.
     * 
     * @param identityResourceId the identityResourceId value to set.
     * @return the AzureADAdministratorInner object itself.
     */
    public AzureADAdministratorInner withIdentityResourceId(String identityResourceId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AdministratorProperties();
        }
        this.innerProperties().withIdentityResourceId(identityResourceId);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
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
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AzureADAdministratorInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AzureADAdministratorInner if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the AzureADAdministratorInner.
     */
    public static AzureADAdministratorInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AzureADAdministratorInner deserializedAzureADAdministratorInner = new AzureADAdministratorInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedAzureADAdministratorInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedAzureADAdministratorInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedAzureADAdministratorInner.type = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedAzureADAdministratorInner.innerProperties = AdministratorProperties.fromJson(reader);
                } else if ("systemData".equals(fieldName)) {
                    deserializedAzureADAdministratorInner.systemData = SystemData.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAzureADAdministratorInner;
        });
    }
}
