// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.monitor.query.implementation.metricsbatch.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The metrics result for a resource. */
@Fluent
public final class MetricResultsResponse {
    /*
     * The collection of metric data responses per resource, per metric.
     */
    @JsonProperty(value = "values")
    private List<MetricResultsResponseValuesItem> values;

    /** Creates an instance of MetricResultsResponse class. */
    public MetricResultsResponse() {}

    /**
     * Get the values property: The collection of metric data responses per resource, per metric.
     *
     * @return the values value.
     */
    public List<MetricResultsResponseValuesItem> getValues() {
        return this.values;
    }

    /**
     * Set the values property: The collection of metric data responses per resource, per metric.
     *
     * @param values the values value to set.
     * @return the MetricResultsResponse object itself.
     */
    public MetricResultsResponse setValues(List<MetricResultsResponseValuesItem> values) {
        this.values = values;
        return this;
    }
}