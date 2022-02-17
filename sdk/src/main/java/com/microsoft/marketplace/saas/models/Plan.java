// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.microsoft.marketplace.saas.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The Plan model. */
@Fluent
public final class Plan {
    /*
     * The planId property.
     */
    @JsonProperty(value = "planId")
    private String planId;

    /*
     * The displayName property.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * The isPrivate property.
     */
    @JsonProperty(value = "isPrivate")
    private Boolean isPrivate;

    /*
     * The description property.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * The hasFreeTrials property.
     */
    @JsonProperty(value = "hasFreeTrials")
    private Boolean hasFreeTrials;

    /*
     * The isPricePerSeat property.
     */
    @JsonProperty(value = "isPricePerSeat")
    private Boolean isPricePerSeat;

    /*
     * The isStopSell property.
     */
    @JsonProperty(value = "isStopSell")
    private Boolean isStopSell;

    /*
     * The market property.
     */
    @JsonProperty(value = "market")
    private String market;

    /*
     * The planComponents property.
     */
    @JsonProperty(value = "planComponents")
    private PlanComponents planComponents;

    /**
     * Get the planId property: The planId property.
     *
     * @return the planId value.
     */
    public String getPlanId() {
        return this.planId;
    }

    /**
     * Set the planId property: The planId property.
     *
     * @param planId the planId value to set.
     * @return the Plan object itself.
     */
    public Plan setPlanId(String planId) {
        this.planId = planId;
        return this;
    }

    /**
     * Get the displayName property: The displayName property.
     *
     * @return the displayName value.
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: The displayName property.
     *
     * @param displayName the displayName value to set.
     * @return the Plan object itself.
     */
    public Plan setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the isPrivate property: The isPrivate property.
     *
     * @return the isPrivate value.
     */
    public Boolean isPrivate() {
        return this.isPrivate;
    }

    /**
     * Set the isPrivate property: The isPrivate property.
     *
     * @param isPrivate the isPrivate value to set.
     * @return the Plan object itself.
     */
    public Plan setIsPrivate(Boolean isPrivate) {
        this.isPrivate = isPrivate;
        return this;
    }

    /**
     * Get the description property: The description property.
     *
     * @return the description value.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Set the description property: The description property.
     *
     * @param description the description value to set.
     * @return the Plan object itself.
     */
    public Plan setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the hasFreeTrials property: The hasFreeTrials property.
     *
     * @return the hasFreeTrials value.
     */
    public Boolean isHasFreeTrials() {
        return this.hasFreeTrials;
    }

    /**
     * Set the hasFreeTrials property: The hasFreeTrials property.
     *
     * @param hasFreeTrials the hasFreeTrials value to set.
     * @return the Plan object itself.
     */
    public Plan setHasFreeTrials(Boolean hasFreeTrials) {
        this.hasFreeTrials = hasFreeTrials;
        return this;
    }

    /**
     * Get the isPricePerSeat property: The isPricePerSeat property.
     *
     * @return the isPricePerSeat value.
     */
    public Boolean isPricePerSeat() {
        return this.isPricePerSeat;
    }

    /**
     * Set the isPricePerSeat property: The isPricePerSeat property.
     *
     * @param isPricePerSeat the isPricePerSeat value to set.
     * @return the Plan object itself.
     */
    public Plan setIsPricePerSeat(Boolean isPricePerSeat) {
        this.isPricePerSeat = isPricePerSeat;
        return this;
    }

    /**
     * Get the isStopSell property: The isStopSell property.
     *
     * @return the isStopSell value.
     */
    public Boolean isStopSell() {
        return this.isStopSell;
    }

    /**
     * Set the isStopSell property: The isStopSell property.
     *
     * @param isStopSell the isStopSell value to set.
     * @return the Plan object itself.
     */
    public Plan setIsStopSell(Boolean isStopSell) {
        this.isStopSell = isStopSell;
        return this;
    }

    /**
     * Get the market property: The market property.
     *
     * @return the market value.
     */
    public String getMarket() {
        return this.market;
    }

    /**
     * Set the market property: The market property.
     *
     * @param market the market value to set.
     * @return the Plan object itself.
     */
    public Plan setMarket(String market) {
        this.market = market;
        return this;
    }

    /**
     * Get the planComponents property: The planComponents property.
     *
     * @return the planComponents value.
     */
    public PlanComponents getPlanComponents() {
        return this.planComponents;
    }

    /**
     * Set the planComponents property: The planComponents property.
     *
     * @param planComponents the planComponents value to set.
     * @return the Plan object itself.
     */
    public Plan setPlanComponents(PlanComponents planComponents) {
        this.planComponents = planComponents;
        return this;
    }
}