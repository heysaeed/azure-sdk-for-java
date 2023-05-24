// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** OsDisk represents configuration of the boot disk. */
@Fluent
public final class OsDisk {
    /*
     * The strategy for creating the OS disk.
     */
    @JsonProperty(value = "createOption")
    private OsDiskCreateOption createOption;

    /*
     * The strategy for deleting the OS disk.
     */
    @JsonProperty(value = "deleteOption")
    private OsDiskDeleteOption deleteOption;

    /*
     * The size of the disk in gigabytes. Required if the createOption is Ephemeral.
     */
    @JsonProperty(value = "diskSizeGB", required = true)
    private long diskSizeGB;

    /** Creates an instance of OsDisk class. */
    public OsDisk() {
    }

    /**
     * Get the createOption property: The strategy for creating the OS disk.
     *
     * @return the createOption value.
     */
    public OsDiskCreateOption createOption() {
        return this.createOption;
    }

    /**
     * Set the createOption property: The strategy for creating the OS disk.
     *
     * @param createOption the createOption value to set.
     * @return the OsDisk object itself.
     */
    public OsDisk withCreateOption(OsDiskCreateOption createOption) {
        this.createOption = createOption;
        return this;
    }

    /**
     * Get the deleteOption property: The strategy for deleting the OS disk.
     *
     * @return the deleteOption value.
     */
    public OsDiskDeleteOption deleteOption() {
        return this.deleteOption;
    }

    /**
     * Set the deleteOption property: The strategy for deleting the OS disk.
     *
     * @param deleteOption the deleteOption value to set.
     * @return the OsDisk object itself.
     */
    public OsDisk withDeleteOption(OsDiskDeleteOption deleteOption) {
        this.deleteOption = deleteOption;
        return this;
    }

    /**
     * Get the diskSizeGB property: The size of the disk in gigabytes. Required if the createOption is Ephemeral.
     *
     * @return the diskSizeGB value.
     */
    public long diskSizeGB() {
        return this.diskSizeGB;
    }

    /**
     * Set the diskSizeGB property: The size of the disk in gigabytes. Required if the createOption is Ephemeral.
     *
     * @param diskSizeGB the diskSizeGB value to set.
     * @return the OsDisk object itself.
     */
    public OsDisk withDiskSizeGB(long diskSizeGB) {
        this.diskSizeGB = diskSizeGB;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}