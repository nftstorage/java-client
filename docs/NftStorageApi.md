# NftStorageApi

All URIs are relative to *https://api.nft.storage*

Method | HTTP request | Description
------------- | ------------- | -------------
[**delete**](NftStorageApi.md#delete) | **DELETE** /{cid} | Stop storing the content with the passed CID
[**list**](NftStorageApi.md#list) | **GET** / | List all stored files
[**status**](NftStorageApi.md#status) | **GET** /{cid} | Get information for the stored file CID
[**store**](NftStorageApi.md#store) | **POST** /upload | Store a file


<a name="delete"></a>
# **delete**
> DeleteResponse delete(cid)

Stop storing the content with the passed CID

Stop storing the content with the passed CID on nft.storage. - Unpin the item from the underlying IPFS pinning service. - Cease renewals for expired Filecoin deals involving the CID.    ⚠️ This does not remove the content from the network.  - Does not terminate any established Filecoin deal. - Does not remove the content from other IPFS nodes in the network that already cached or pinned the CID.    Note: the content will remain available if another user has stored the CID with nft.storage. 

### Example
```java
// Import classes:
import storage.nft.ApiClient;
import storage.nft.ApiException;
import storage.nft.Configuration;
import storage.nft.auth.*;
import storage.nft.models.*;
import storage.nft.api.NftStorageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.nft.storage");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    NftStorageApi apiInstance = new NftStorageApi(defaultClient);
    String cid = "cid_example"; // String | CID for the NFT
    try {
      DeleteResponse result = apiInstance.delete(cid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NftStorageApi#delete");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cid** | **String**| CID for the NFT |

### Return type

[**DeleteResponse**](DeleteResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**5XX** | Internal Server Error |  -  |

<a name="list"></a>
# **list**
> ListResponse list(before, limit)

List all stored files

### Example
```java
// Import classes:
import storage.nft.ApiClient;
import storage.nft.ApiException;
import storage.nft.Configuration;
import storage.nft.auth.*;
import storage.nft.models.*;
import storage.nft.api.NftStorageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.nft.storage");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    NftStorageApi apiInstance = new NftStorageApi(defaultClient);
    OffsetDateTime before = OffsetDateTime.now(); // OffsetDateTime | Return results created before provided timestamp
    Integer limit = 10; // Integer | Max records to return
    try {
      ListResponse result = apiInstance.list(before, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NftStorageApi#list");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **before** | **OffsetDateTime**| Return results created before provided timestamp | [optional]
 **limit** | **Integer**| Max records to return | [optional] [default to 10]

### Return type

[**ListResponse**](ListResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**5XX** | Internal Server Error |  -  |

<a name="status"></a>
# **status**
> GetResponse status(cid)

Get information for the stored file CID

Includes the IPFS pinning state and the Filecoin deal state.

### Example
```java
// Import classes:
import storage.nft.ApiClient;
import storage.nft.ApiException;
import storage.nft.Configuration;
import storage.nft.auth.*;
import storage.nft.models.*;
import storage.nft.api.NftStorageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.nft.storage");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    NftStorageApi apiInstance = new NftStorageApi(defaultClient);
    String cid = "cid_example"; // String | CID for the NFT
    try {
      GetResponse result = apiInstance.status(cid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NftStorageApi#status");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cid** | **String**| CID for the NFT |

### Return type

[**GetResponse**](GetResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**5XX** | Internal Server Error |  -  |

<a name="store"></a>
# **store**
> UploadResponse store(body)

Store a file

Store a file with nft.storage.  - Submit a HTTP &#x60;POST&#x60; request passing the file data in the request body. - To store multiple files in a directory, submit a &#x60;multipart/form-data&#x60; HTTP &#x60;POST&#x60; request.  Use the &#x60;Content-Disposition&#x60; header for each part to specify a filename. 

### Example
```java
// Import classes:
import storage.nft.ApiClient;
import storage.nft.ApiException;
import storage.nft.Configuration;
import storage.nft.auth.*;
import storage.nft.models.*;
import storage.nft.api.NftStorageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.nft.storage");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    NftStorageApi apiInstance = new NftStorageApi(defaultClient);
    File body = new File("/path/to/file"); // File | 
    try {
      UploadResponse result = apiInstance.store(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NftStorageApi#store");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **File**|  |

### Return type

[**UploadResponse**](UploadResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: image/png, application/octet-stream, multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**5XX** | Internal Server Error |  -  |

