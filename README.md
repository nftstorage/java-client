# nft.storage-client

_This client was generated via the OpenAPI schema and is experimental, unsupported, and may not work at all!_

NFT Storage API
- API version: 1.0
  - Build date: 2021-04-29T12:41:03.666Z[GMT]

No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>nft.storage</groupId>
  <artifactId>nft.storage-client</artifactId>
  <version>1.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "nft.storage:nft.storage-client:1.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/nft.storage-client-1.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

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

## Documentation for API Endpoints

All URIs are relative to *https://api.nft.storage*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*NftStorageApi* | [**delete**](docs/NftStorageApi.md#delete) | **DELETE** /{cid} | Stop storing the content with the passed CID
*NftStorageApi* | [**list**](docs/NftStorageApi.md#list) | **GET** / | List all stored files
*NftStorageApi* | [**status**](docs/NftStorageApi.md#status) | **GET** /{cid} | Get information for the stored file CID
*NftStorageApi* | [**store**](docs/NftStorageApi.md#store) | **POST** /upload | Store a file


## Documentation for Models

 - [Deal](docs/Deal.md)
 - [DeleteResponse](docs/DeleteResponse.md)
 - [ErrorResponse](docs/ErrorResponse.md)
 - [ErrorResponseError](docs/ErrorResponseError.md)
 - [ForbiddenErrorResponse](docs/ForbiddenErrorResponse.md)
 - [ForbiddenErrorResponseError](docs/ForbiddenErrorResponseError.md)
 - [GetResponse](docs/GetResponse.md)
 - [Links](docs/Links.md)
 - [LinksFile](docs/LinksFile.md)
 - [ListResponse](docs/ListResponse.md)
 - [NFT](docs/NFT.md)
 - [Pin](docs/Pin.md)
 - [PinStatus](docs/PinStatus.md)
 - [UnauthorizedErrorResponse](docs/UnauthorizedErrorResponse.md)
 - [UnauthorizedErrorResponseError](docs/UnauthorizedErrorResponseError.md)
 - [UploadResponse](docs/UploadResponse.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### bearerAuth

- **Type**: HTTP basic authentication


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



