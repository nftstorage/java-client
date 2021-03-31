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

/**
 * LinksFile
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-03-31T14:52:04.337Z[GMT]")
public class LinksFile {
  public static final String SERIALIZED_NAME_IPFS = "ipfs";
  @SerializedName(SERIALIZED_NAME_IPFS)
  private String ipfs;

  public static final String SERIALIZED_NAME_HTTP = "http";
  @SerializedName(SERIALIZED_NAME_HTTP)
  private String http;


  public LinksFile ipfs(String ipfs) {
    
    this.ipfs = ipfs;
    return this;
  }

   /**
   * Get ipfs
   * @return ipfs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ipfs://bafkreidivzimqfqtoqxkrpge6bjyhlvxqs3rhe73owtmdulaxr5do5in7u/image.jpg", value = "")

  public String getIpfs() {
    return ipfs;
  }


  public void setIpfs(String ipfs) {
    this.ipfs = ipfs;
  }


  public LinksFile http(String http) {
    
    this.http = http;
    return this;
  }

   /**
   * Get http
   * @return http
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "http://bafkreidivzimqfqtoqxkrpge6bjyhlvxqs3rhe73owtmdulaxr5do5in7u.ipfs.dweb.link/image.jpg", value = "")

  public String getHttp() {
    return http;
  }


  public void setHttp(String http) {
    this.http = http;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinksFile linksFile = (LinksFile) o;
    return Objects.equals(this.ipfs, linksFile.ipfs) &&
        Objects.equals(this.http, linksFile.http);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipfs, http);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinksFile {\n");
    sb.append("    ipfs: ").append(toIndentedString(ipfs)).append("\n");
    sb.append("    http: ").append(toIndentedString(http)).append("\n");
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
