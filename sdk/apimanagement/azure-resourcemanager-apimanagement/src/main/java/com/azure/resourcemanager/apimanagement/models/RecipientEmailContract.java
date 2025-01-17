// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.resourcemanager.apimanagement.fluent.models.RecipientEmailContractInner;

/**
 * An immutable client-side representation of RecipientEmailContract.
 */
public interface RecipientEmailContract {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     * 
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     * 
     * @return the type value.
     */
    String type();

    /**
     * Gets the email property: User Email subscribed to notification.
     * 
     * @return the email value.
     */
    String email();

    /**
     * Gets the inner com.azure.resourcemanager.apimanagement.fluent.models.RecipientEmailContractInner object.
     * 
     * @return the inner object.
     */
    RecipientEmailContractInner innerModel();
}
