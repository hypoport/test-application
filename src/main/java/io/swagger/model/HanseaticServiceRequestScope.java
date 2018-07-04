package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * HanseaticServiceRequestScope
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-11-13T15:17:19.449Z")

public class HanseaticServiceRequestScope   {
  @JsonProperty("fallnummer")
  private String fallnummer = null;

  @JsonProperty("featureParameters")
  private Map<String, String> featureParameters = null;

  @JsonProperty("features")
  private List<String> features = null;

  @JsonProperty("frontendKey")
  private String frontendKey = null;

  @JsonProperty("frontendToken")
  private String frontendToken = null;

  @JsonProperty("tokenId")
  private String tokenId = null;

  public HanseaticServiceRequestScope fallnummer(String fallnummer) {
    this.fallnummer = fallnummer;
    return this;
  }

   /**
   * Get fallnummer
   * @return fallnummer
  **/
  @ApiModelProperty(value = "")


  public String getFallnummer() {
    return fallnummer;
  }

  public void setFallnummer(String fallnummer) {
    this.fallnummer = fallnummer;
  }

  public HanseaticServiceRequestScope featureParameters(Map<String, String> featureParameters) {
    this.featureParameters = featureParameters;
    return this;
  }

  public HanseaticServiceRequestScope putFeatureParametersItem(String key, String featureParametersItem) {
    if (this.featureParameters == null) {
      this.featureParameters = new HashMap<String, String>();
    }
    this.featureParameters.put(key, featureParametersItem);
    return this;
  }

   /**
   * Get featureParameters
   * @return featureParameters
  **/
  @ApiModelProperty(value = "")


  public Map<String, String> getFeatureParameters() {
    return featureParameters;
  }

  public void setFeatureParameters(Map<String, String> featureParameters) {
    this.featureParameters = featureParameters;
  }

  public HanseaticServiceRequestScope features(List<String> features) {
    this.features = features;
    return this;
  }

  public HanseaticServiceRequestScope addFeaturesItem(String featuresItem) {
    if (this.features == null) {
      this.features = new ArrayList<String>();
    }
    this.features.add(featuresItem);
    return this;
  }

   /**
   * Get features
   * @return features
  **/
  @ApiModelProperty(value = "")


  public List<String> getFeatures() {
    return features;
  }

  public void setFeatures(List<String> features) {
    this.features = features;
  }

  public HanseaticServiceRequestScope frontendKey(String frontendKey) {
    this.frontendKey = frontendKey;
    return this;
  }

   /**
   * Get frontendKey
   * @return frontendKey
  **/
  @ApiModelProperty(value = "")


  public String getFrontendKey() {
    return frontendKey;
  }

  public void setFrontendKey(String frontendKey) {
    this.frontendKey = frontendKey;
  }

  public HanseaticServiceRequestScope frontendToken(String frontendToken) {
    this.frontendToken = frontendToken;
    return this;
  }

   /**
   * Get frontendToken
   * @return frontendToken
  **/
  @ApiModelProperty(value = "")


  public String getFrontendToken() {
    return frontendToken;
  }

  public void setFrontendToken(String frontendToken) {
    this.frontendToken = frontendToken;
  }

  public HanseaticServiceRequestScope tokenId(String tokenId) {
    this.tokenId = tokenId;
    return this;
  }

   /**
   * Get tokenId
   * @return tokenId
  **/
  @ApiModelProperty(value = "")


  public String getTokenId() {
    return tokenId;
  }

  public void setTokenId(String tokenId) {
    this.tokenId = tokenId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HanseaticServiceRequestScope hanseaticServiceRequestScope = (HanseaticServiceRequestScope) o;
    return Objects.equals(this.fallnummer, hanseaticServiceRequestScope.fallnummer) &&
        Objects.equals(this.featureParameters, hanseaticServiceRequestScope.featureParameters) &&
        Objects.equals(this.features, hanseaticServiceRequestScope.features) &&
        Objects.equals(this.frontendKey, hanseaticServiceRequestScope.frontendKey) &&
        Objects.equals(this.frontendToken, hanseaticServiceRequestScope.frontendToken) &&
        Objects.equals(this.tokenId, hanseaticServiceRequestScope.tokenId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fallnummer, featureParameters, features, frontendKey, frontendToken, tokenId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HanseaticServiceRequestScope {\n");
    
    sb.append("    fallnummer: ").append(toIndentedString(fallnummer)).append("\n");
    sb.append("    featureParameters: ").append(toIndentedString(featureParameters)).append("\n");
    sb.append("    features: ").append(toIndentedString(features)).append("\n");
    sb.append("    frontendKey: ").append(toIndentedString(frontendKey)).append("\n");
    sb.append("    frontendToken: ").append(toIndentedString(frontendToken)).append("\n");
    sb.append("    tokenId: ").append(toIndentedString(tokenId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

