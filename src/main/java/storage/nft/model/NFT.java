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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import storage.nft.model.NFTDeals;
import storage.nft.model.Pin;

/**
 * NFT
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-03-31T14:52:04.337Z[GMT]")
public class NFT {
  public static final String SERIALIZED_NAME_CID = "cid";
  @SerializedName(SERIALIZED_NAME_CID)
  private String cid;

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private BigDecimal size = new BigDecimal("132614");

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private java.util.Date created;

  /**
   * MIME type of the upload file or &#39;directory&#39; when uploading multiple files.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    DIRECTORY("directory"),
    
    IMAGE_JPEG("image/jpeg"),
    
    APPLICATION_JSON("application/json"),
    
    OTHER_MIME_TYPES("other mime types");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public static final String SERIALIZED_NAME_SCOPE = "scope";
  @SerializedName(SERIALIZED_NAME_SCOPE)
  private String scope = "default";

  public static final String SERIALIZED_NAME_PIN = "pin";
  @SerializedName(SERIALIZED_NAME_PIN)
  private Pin pin;

  public static final String SERIALIZED_NAME_FILES = "files";
  @SerializedName(SERIALIZED_NAME_FILES)
  private List<Object> files = null;

  public static final String SERIALIZED_NAME_DEALS = "deals";
  @SerializedName(SERIALIZED_NAME_DEALS)
  private NFTDeals deals;


  public NFT cid(String cid) {
    
    this.cid = cid;
    return this;
  }

   /**
   * Self-describing content-addressed identifiers for distributed systems. Check [spec](https://github.com/multiformats/cid) for more info.
   * @return cid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "bafkreidivzimqfqtoqxkrpge6bjyhlvxqs3rhe73owtmdulaxr5do5in7u", value = "Self-describing content-addressed identifiers for distributed systems. Check [spec](https://github.com/multiformats/cid) for more info.")

  public String getCid() {
    return cid;
  }


  public void setCid(String cid) {
    this.cid = cid;
  }


  public NFT size(BigDecimal size) {
    
    this.size = size;
    return this;
  }

   /**
   * Size in bytes of the NFT data.
   * @return size
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Size in bytes of the NFT data.")

  public BigDecimal getSize() {
    return size;
  }


  public void setSize(BigDecimal size) {
    this.size = size;
  }


  public NFT created(java.util.Date created) {
    
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public java.util.Date getCreated() {
    return created;
  }


  public void setCreated(java.util.Date created) {
    this.created = created;
  }


  public NFT type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * MIME type of the upload file or &#39;directory&#39; when uploading multiple files.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "image/jpeg", value = "MIME type of the upload file or 'directory' when uploading multiple files.")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public NFT scope(String scope) {
    
    this.scope = scope;
    return this;
  }

   /**
   * Name of the JWT token used to create this NFT.
   * @return scope
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the JWT token used to create this NFT.")

  public String getScope() {
    return scope;
  }


  public void setScope(String scope) {
    this.scope = scope;
  }


  public NFT pin(Pin pin) {
    
    this.pin = pin;
    return this;
  }

   /**
   * Get pin
   * @return pin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Pin getPin() {
    return pin;
  }


  public void setPin(Pin pin) {
    this.pin = pin;
  }


  public NFT files(List<Object> files) {
    
    this.files = files;
    return this;
  }

  public NFT addFilesItem(Object filesItem) {
    if (this.files == null) {
      this.files = new ArrayList<Object>();
    }
    this.files.add(filesItem);
    return this;
  }

   /**
   * Files in the directory (only if this NFT is a directory).
   * @return files
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Files in the directory (only if this NFT is a directory).")

  public List<Object> getFiles() {
    return files;
  }


  public void setFiles(List<Object> files) {
    this.files = files;
  }


  public NFT deals(NFTDeals deals) {
    
    this.deals = deals;
    return this;
  }

   /**
   * Get deals
   * @return deals
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NFTDeals getDeals() {
    return deals;
  }


  public void setDeals(NFTDeals deals) {
    this.deals = deals;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NFT NFT = (NFT) o;
    return Objects.equals(this.cid, NFT.cid) &&
        Objects.equals(this.size, NFT.size) &&
        Objects.equals(this.created, NFT.created) &&
        Objects.equals(this.type, NFT.type) &&
        Objects.equals(this.scope, NFT.scope) &&
        Objects.equals(this.pin, NFT.pin) &&
        Objects.equals(this.files, NFT.files) &&
        Objects.equals(this.deals, NFT.deals);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cid, size, created, type, scope, pin, files, deals);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NFT {\n");
    sb.append("    cid: ").append(toIndentedString(cid)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    pin: ").append(toIndentedString(pin)).append("\n");
    sb.append("    files: ").append(toIndentedString(files)).append("\n");
    sb.append("    deals: ").append(toIndentedString(deals)).append("\n");
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

