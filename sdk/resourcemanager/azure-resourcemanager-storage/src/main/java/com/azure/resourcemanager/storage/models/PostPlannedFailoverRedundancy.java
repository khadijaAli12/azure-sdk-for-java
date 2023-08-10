// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The redundancy type of the account after a planned account failover is performed. */
public final class PostPlannedFailoverRedundancy extends ExpandableStringEnum<PostPlannedFailoverRedundancy> {
    /** Static value Standard_GRS for PostPlannedFailoverRedundancy. */
    public static final PostPlannedFailoverRedundancy STANDARD_GRS = fromString("Standard_GRS");

    /** Static value Standard_GZRS for PostPlannedFailoverRedundancy. */
    public static final PostPlannedFailoverRedundancy STANDARD_GZRS = fromString("Standard_GZRS");

    /** Static value Standard_RAGRS for PostPlannedFailoverRedundancy. */
    public static final PostPlannedFailoverRedundancy STANDARD_RAGRS = fromString("Standard_RAGRS");

    /** Static value Standard_RAGZRS for PostPlannedFailoverRedundancy. */
    public static final PostPlannedFailoverRedundancy STANDARD_RAGZRS = fromString("Standard_RAGZRS");

    /**
     * Creates a new instance of PostPlannedFailoverRedundancy value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public PostPlannedFailoverRedundancy() {
    }

    /**
     * Creates or finds a PostPlannedFailoverRedundancy from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding PostPlannedFailoverRedundancy.
     */
    @JsonCreator
    public static PostPlannedFailoverRedundancy fromString(String name) {
        return fromString(name, PostPlannedFailoverRedundancy.class);
    }

    /**
     * Gets known PostPlannedFailoverRedundancy values.
     *
     * @return known PostPlannedFailoverRedundancy values.
     */
    public static Collection<PostPlannedFailoverRedundancy> values() {
        return values(PostPlannedFailoverRedundancy.class);
    }
}