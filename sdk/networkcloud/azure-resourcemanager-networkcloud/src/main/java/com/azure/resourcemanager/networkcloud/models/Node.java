// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Node denotes the list of node that utilizes configuration. */
@Immutable
public final class Node {
    /*
     * The resource ID of the bare metal machine that hosts this node.
     */
    @JsonProperty(value = "bareMetalMachineId", access = JsonProperty.Access.WRITE_ONLY)
    private String bareMetalMachineId;

    /*
     * The machine image last used to deploy this node.
     */
    @JsonProperty(value = "imageId", access = JsonProperty.Access.WRITE_ONLY)
    private String imageId;

    /*
     * The list of network attachments to the virtual machine.
     */
    @JsonProperty(value = "networkAttachments", access = JsonProperty.Access.WRITE_ONLY)
    private List<NetworkAttachment> networkAttachments;

    /*
     * The name of this node, as realized in the Hybrid AKS cluster.
     */
    @JsonProperty(value = "nodeName", access = JsonProperty.Access.WRITE_ONLY)
    private String nodeName;

    /*
     * The power state (On | Off) of the node.
     */
    @JsonProperty(value = "powerState", access = JsonProperty.Access.WRITE_ONLY)
    private HybridAksClusterMachinePowerState powerState;

    /** Creates an instance of Node class. */
    public Node() {
    }

    /**
     * Get the bareMetalMachineId property: The resource ID of the bare metal machine that hosts this node.
     *
     * @return the bareMetalMachineId value.
     */
    public String bareMetalMachineId() {
        return this.bareMetalMachineId;
    }

    /**
     * Get the imageId property: The machine image last used to deploy this node.
     *
     * @return the imageId value.
     */
    public String imageId() {
        return this.imageId;
    }

    /**
     * Get the networkAttachments property: The list of network attachments to the virtual machine.
     *
     * @return the networkAttachments value.
     */
    public List<NetworkAttachment> networkAttachments() {
        return this.networkAttachments;
    }

    /**
     * Get the nodeName property: The name of this node, as realized in the Hybrid AKS cluster.
     *
     * @return the nodeName value.
     */
    public String nodeName() {
        return this.nodeName;
    }

    /**
     * Get the powerState property: The power state (On | Off) of the node.
     *
     * @return the powerState value.
     */
    public HybridAksClusterMachinePowerState powerState() {
        return this.powerState;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (networkAttachments() != null) {
            networkAttachments().forEach(e -> e.validate());
        }
    }
}