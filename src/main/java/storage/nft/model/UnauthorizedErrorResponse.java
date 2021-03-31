/*
 * NFT Storage API
 * # API Reference 
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package storage.nft.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import storage.nft.model.UnauthorizedErrorResponseError;

/**
 * UnauthorizedErrorResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-03-31T14:52:04.337Z[GMT]")
public class UnauthorizedErrorResponse {
  public static final String SERIALIZED_NAME_OK = "ok";
  @SerializedName(SERIALIZED_NAME_OK)
  private Boolean ok = false;

  public static final String SERIALIZED_NAME_ERROR = "error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private UnauthorizedErrorResponseError error;


  public UnauthorizedErrorResponse ok(Boolean ok) {
    
    this.ok = ok;
    return this;
  }

   /**
   * Get ok
   * @return ok
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getOk() {
    return ok;
  }


  public void setOk(Boolean ok) {
    this.ok = ok;
  }


  public UnauthorizedErrorResponse error(UnauthorizedErrorResponseError error) {
    
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UnauthorizedErrorResponseError getError() {
    return error;
  }


  public void setError(UnauthorizedErrorResponseError error) {
    this.error = error;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UnauthorizedErrorResponse unauthorizedErrorResponse = (UnauthorizedErrorResponse) o;
    return Objects.equals(this.ok, unauthorizedErrorResponse.ok) &&
        Objects.equals(this.error, unauthorizedErrorResponse.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ok, error);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UnauthorizedErrorResponse {\n");
    sb.append("    ok: ").append(toIndentedString(ok)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

