// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Provisioning state of the namespace resource. */
public final class NamespaceProvisioningState extends ExpandableStringEnum<NamespaceProvisioningState> {
    /** Static value Creating for NamespaceProvisioningState. */
    public static final NamespaceProvisioningState CREATING = fromString("Creating");

    /** Static value Updating for NamespaceProvisioningState. */
    public static final NamespaceProvisioningState UPDATING = fromString("Updating");

    /** Static value Deleting for NamespaceProvisioningState. */
    public static final NamespaceProvisioningState DELETING = fromString("Deleting");

    /** Static value Succeeded for NamespaceProvisioningState. */
    public static final NamespaceProvisioningState SUCCEEDED = fromString("Succeeded");

    /** Static value Canceled for NamespaceProvisioningState. */
    public static final NamespaceProvisioningState CANCELED = fromString("Canceled");

    /** Static value Failed for NamespaceProvisioningState. */
    public static final NamespaceProvisioningState FAILED = fromString("Failed");

    /** Static value Deleted for NamespaceProvisioningState. */
    public static final NamespaceProvisioningState DELETED = fromString("Deleted");

    /** Static value DeleteFailed for NamespaceProvisioningState. */
    public static final NamespaceProvisioningState DELETE_FAILED = fromString("DeleteFailed");

    /** Static value CreateFailed for NamespaceProvisioningState. */
    public static final NamespaceProvisioningState CREATE_FAILED = fromString("CreateFailed");

    /** Static value UpdatedFailed for NamespaceProvisioningState. */
    public static final NamespaceProvisioningState UPDATED_FAILED = fromString("UpdatedFailed");

    /**
     * Creates a new instance of NamespaceProvisioningState value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public NamespaceProvisioningState() {
    }

    /**
     * Creates or finds a NamespaceProvisioningState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding NamespaceProvisioningState.
     */
    @JsonCreator
    public static NamespaceProvisioningState fromString(String name) {
        return fromString(name, NamespaceProvisioningState.class);
    }

    /**
     * Gets known NamespaceProvisioningState values.
     *
     * @return known NamespaceProvisioningState values.
     */
    public static Collection<NamespaceProvisioningState> values() {
        return values(NamespaceProvisioningState.class);
    }
}