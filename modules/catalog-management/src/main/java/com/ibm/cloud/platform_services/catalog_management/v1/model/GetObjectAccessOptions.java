/*
 * (C) Copyright IBM Corp. 2021.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.ibm.cloud.platform_services.catalog_management.v1.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The getObjectAccess options.
 */
public class GetObjectAccessOptions extends GenericModel {

  protected String catalogIdentifier;
  protected String objectIdentifier;
  protected String accountIdentifier;

  /**
   * Builder.
   */
  public static class Builder {
    private String catalogIdentifier;
    private String objectIdentifier;
    private String accountIdentifier;

    private Builder(GetObjectAccessOptions getObjectAccessOptions) {
      this.catalogIdentifier = getObjectAccessOptions.catalogIdentifier;
      this.objectIdentifier = getObjectAccessOptions.objectIdentifier;
      this.accountIdentifier = getObjectAccessOptions.accountIdentifier;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param catalogIdentifier the catalogIdentifier
     * @param objectIdentifier the objectIdentifier
     * @param accountIdentifier the accountIdentifier
     */
    public Builder(String catalogIdentifier, String objectIdentifier, String accountIdentifier) {
      this.catalogIdentifier = catalogIdentifier;
      this.objectIdentifier = objectIdentifier;
      this.accountIdentifier = accountIdentifier;
    }

    /**
     * Builds a GetObjectAccessOptions.
     *
     * @return the new GetObjectAccessOptions instance
     */
    public GetObjectAccessOptions build() {
      return new GetObjectAccessOptions(this);
    }

    /**
     * Set the catalogIdentifier.
     *
     * @param catalogIdentifier the catalogIdentifier
     * @return the GetObjectAccessOptions builder
     */
    public Builder catalogIdentifier(String catalogIdentifier) {
      this.catalogIdentifier = catalogIdentifier;
      return this;
    }

    /**
     * Set the objectIdentifier.
     *
     * @param objectIdentifier the objectIdentifier
     * @return the GetObjectAccessOptions builder
     */
    public Builder objectIdentifier(String objectIdentifier) {
      this.objectIdentifier = objectIdentifier;
      return this;
    }

    /**
     * Set the accountIdentifier.
     *
     * @param accountIdentifier the accountIdentifier
     * @return the GetObjectAccessOptions builder
     */
    public Builder accountIdentifier(String accountIdentifier) {
      this.accountIdentifier = accountIdentifier;
      return this;
    }
  }

  protected GetObjectAccessOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.catalogIdentifier,
      "catalogIdentifier cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.objectIdentifier,
      "objectIdentifier cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.accountIdentifier,
      "accountIdentifier cannot be empty");
    catalogIdentifier = builder.catalogIdentifier;
    objectIdentifier = builder.objectIdentifier;
    accountIdentifier = builder.accountIdentifier;
  }

  /**
   * New builder.
   *
   * @return a GetObjectAccessOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the catalogIdentifier.
   *
   * Catalog identifier.
   *
   * @return the catalogIdentifier
   */
  public String catalogIdentifier() {
    return catalogIdentifier;
  }

  /**
   * Gets the objectIdentifier.
   *
   * Object identifier.
   *
   * @return the objectIdentifier
   */
  public String objectIdentifier() {
    return objectIdentifier;
  }

  /**
   * Gets the accountIdentifier.
   *
   * Account identifier.
   *
   * @return the accountIdentifier
   */
  public String accountIdentifier() {
    return accountIdentifier;
  }
}

