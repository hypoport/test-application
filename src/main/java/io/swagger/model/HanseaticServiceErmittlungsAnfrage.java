package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.HanseaticServiceRequestScope;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * HanseaticServiceErmittlungsAnfrage
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-11-13T15:17:19.449Z")

public class HanseaticServiceErmittlungsAnfrage   {
  @JsonProperty("frontendAnfrage")
  private Object frontendAnfrage = null;

  /**
   * Gets or Sets frontendId
   */
  public enum FrontendIdEnum {
    OM_CLASSIC("OM_CLASSIC"),
    
    BAUFISMART("BAUFISMART"),
    
    BOXL("BOXL");

    private String value;

    FrontendIdEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static FrontendIdEnum fromValue(String text) {
      for (FrontendIdEnum b : FrontendIdEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("frontendId")
  private FrontendIdEnum frontendId = null;

  @JsonProperty("requestId")
  private String requestId = null;

  @JsonProperty("requestScope")
  private HanseaticServiceRequestScope requestScope = null;

  public HanseaticServiceErmittlungsAnfrage frontendAnfrage(Object frontendAnfrage) {
    this.frontendAnfrage = frontendAnfrage;
    return this;
  }

   /**
   * Get frontendAnfrage
   * @return frontendAnfrage
  **/
  @ApiModelProperty(value = "")


  public Object getFrontendAnfrage() {
    return frontendAnfrage;
  }

  public void setFrontendAnfrage(Object frontendAnfrage) {
    this.frontendAnfrage = frontendAnfrage;
  }

  public HanseaticServiceErmittlungsAnfrage frontendId(FrontendIdEnum frontendId) {
    this.frontendId = frontendId;
    return this;
  }

   /**
   * Get frontendId
   * @return frontendId
  **/
  @ApiModelProperty(value = "")


  public FrontendIdEnum getFrontendId() {
    return frontendId;
  }

  public void setFrontendId(FrontendIdEnum frontendId) {
    this.frontendId = frontendId;
  }

  public HanseaticServiceErmittlungsAnfrage requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * Get requestId
   * @return requestId
  **/
  @ApiModelProperty(value = "")


  public String getRequestId() {
    return requestId;
  }

  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  public HanseaticServiceErmittlungsAnfrage requestScope(HanseaticServiceRequestScope requestScope) {
    this.requestScope = requestScope;
    return this;
  }

   /**
   * Get requestScope
   * @return requestScope
  **/
  @ApiModelProperty(value = "")

  @Valid

  public HanseaticServiceRequestScope getRequestScope() {
    return requestScope;
  }

  public void setRequestScope(HanseaticServiceRequestScope requestScope) {
    this.requestScope = requestScope;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HanseaticServiceErmittlungsAnfrage hanseaticServiceErmittlungsAnfrage = (HanseaticServiceErmittlungsAnfrage) o;
    return Objects.equals(this.frontendAnfrage, hanseaticServiceErmittlungsAnfrage.frontendAnfrage) &&
        Objects.equals(this.frontendId, hanseaticServiceErmittlungsAnfrage.frontendId) &&
        Objects.equals(this.requestId, hanseaticServiceErmittlungsAnfrage.requestId) &&
        Objects.equals(this.requestScope, hanseaticServiceErmittlungsAnfrage.requestScope);
  }

  @Override
  public int hashCode() {
    return Objects.hash(frontendAnfrage, frontendId, requestId, requestScope);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HanseaticServiceErmittlungsAnfrage {\n");
    
    sb.append("    frontendAnfrage: ").append(toIndentedString(frontendAnfrage)).append("\n");
    sb.append("    frontendId: ").append(toIndentedString(frontendId)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    requestScope: ").append(toIndentedString(requestScope)).append("\n");
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

