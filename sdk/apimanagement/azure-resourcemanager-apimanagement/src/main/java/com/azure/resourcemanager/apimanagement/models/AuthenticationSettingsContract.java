// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** API Authentication Settings. */
@Fluent
public final class AuthenticationSettingsContract {
    /*
     * OAuth2 Authentication settings
     */
    @JsonProperty(value = "oAuth2")
    private OAuth2AuthenticationSettingsContract oAuth2;

    /*
     * OpenID Connect Authentication Settings
     */
    @JsonProperty(value = "openid")
    private OpenIdAuthenticationSettingsContract openid;

    /*
     * Collection of OAuth2 authentication settings included into this API.
     */
    @JsonProperty(value = "oAuth2AuthenticationSettings")
    private List<OAuth2AuthenticationSettingsContract> oAuth2AuthenticationSettings;

    /*
     * Collection of Open ID Connect authentication settings included into this API.
     */
    @JsonProperty(value = "openidAuthenticationSettings")
    private List<OpenIdAuthenticationSettingsContract> openidAuthenticationSettings;

    /** Creates an instance of AuthenticationSettingsContract class. */
    public AuthenticationSettingsContract() {
    }

    /**
     * Get the oAuth2 property: OAuth2 Authentication settings.
     *
     * @return the oAuth2 value.
     */
    public OAuth2AuthenticationSettingsContract oAuth2() {
        return this.oAuth2;
    }

    /**
     * Set the oAuth2 property: OAuth2 Authentication settings.
     *
     * @param oAuth2 the oAuth2 value to set.
     * @return the AuthenticationSettingsContract object itself.
     */
    public AuthenticationSettingsContract withOAuth2(OAuth2AuthenticationSettingsContract oAuth2) {
        this.oAuth2 = oAuth2;
        return this;
    }

    /**
     * Get the openid property: OpenID Connect Authentication Settings.
     *
     * @return the openid value.
     */
    public OpenIdAuthenticationSettingsContract openid() {
        return this.openid;
    }

    /**
     * Set the openid property: OpenID Connect Authentication Settings.
     *
     * @param openid the openid value to set.
     * @return the AuthenticationSettingsContract object itself.
     */
    public AuthenticationSettingsContract withOpenid(OpenIdAuthenticationSettingsContract openid) {
        this.openid = openid;
        return this;
    }

    /**
     * Get the oAuth2AuthenticationSettings property: Collection of OAuth2 authentication settings included into this
     * API.
     *
     * @return the oAuth2AuthenticationSettings value.
     */
    public List<OAuth2AuthenticationSettingsContract> oAuth2AuthenticationSettings() {
        return this.oAuth2AuthenticationSettings;
    }

    /**
     * Set the oAuth2AuthenticationSettings property: Collection of OAuth2 authentication settings included into this
     * API.
     *
     * @param oAuth2AuthenticationSettings the oAuth2AuthenticationSettings value to set.
     * @return the AuthenticationSettingsContract object itself.
     */
    public AuthenticationSettingsContract
        withOAuth2AuthenticationSettings(List<OAuth2AuthenticationSettingsContract> oAuth2AuthenticationSettings) {
        this.oAuth2AuthenticationSettings = oAuth2AuthenticationSettings;
        return this;
    }

    /**
     * Get the openidAuthenticationSettings property: Collection of Open ID Connect authentication settings included
     * into this API.
     *
     * @return the openidAuthenticationSettings value.
     */
    public List<OpenIdAuthenticationSettingsContract> openidAuthenticationSettings() {
        return this.openidAuthenticationSettings;
    }

    /**
     * Set the openidAuthenticationSettings property: Collection of Open ID Connect authentication settings included
     * into this API.
     *
     * @param openidAuthenticationSettings the openidAuthenticationSettings value to set.
     * @return the AuthenticationSettingsContract object itself.
     */
    public AuthenticationSettingsContract
        withOpenidAuthenticationSettings(List<OpenIdAuthenticationSettingsContract> openidAuthenticationSettings) {
        this.openidAuthenticationSettings = openidAuthenticationSettings;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (oAuth2() != null) {
            oAuth2().validate();
        }
        if (openid() != null) {
            openid().validate();
        }
        if (oAuth2AuthenticationSettings() != null) {
            oAuth2AuthenticationSettings().forEach(e -> e.validate());
        }
        if (openidAuthenticationSettings() != null) {
            openidAuthenticationSettings().forEach(e -> e.validate());
        }
    }
}
