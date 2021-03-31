

# NFT


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cid** | **String** | Self-describing content-addressed identifiers for distributed systems. Check [spec](https://github.com/multiformats/cid) for more info. |  [optional]
**size** | **BigDecimal** | Size in bytes of the NFT data. |  [optional]
**created** | **java.util.Date** |  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | MIME type of the upload file or &#39;directory&#39; when uploading multiple files. |  [optional]
**scope** | **String** | Name of the JWT token used to create this NFT. |  [optional]
**pin** | [**Pin**](Pin.md) |  |  [optional]
**files** | [**List&lt;Object&gt;**](Object.md) | Files in the directory (only if this NFT is a directory). |  [optional]
**deals** | [**NFTDeals**](NFTDeals.md) |  |  [optional]



## Enum: TypeEnum

Name | Value
---- | -----
DIRECTORY | &quot;directory&quot;
IMAGE_JPEG | &quot;image/jpeg&quot;
APPLICATION_JSON | &quot;application/json&quot;
OTHER_MIME_TYPES | &quot;other mime types&quot;



