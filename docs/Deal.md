

# Deal


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**batchRootCid** | **String** |  |  [optional]
**lastChange** | **String** | This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: YYYY-MM-DDTHH:MM:SSZ. | 
**miner** | **String** | Miner ID |  [optional]
**network** | [**NetworkEnum**](#NetworkEnum) | Filecoin network for this Deal |  [optional]
**pieceCid** | **String** | Piece CID string |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Deal status | 
**statusText** | **String** | Deal status description. |  [optional]
**chainDealID** | **BigDecimal** | Identifier for the deal stored on chain. |  [optional]
**dealActivation** | **String** | This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: YYYY-MM-DDTHH:MM:SSZ. |  [optional]
**dealExpiration** | **String** | This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: YYYY-MM-DDTHH:MM:SSZ. |  [optional]



## Enum: NetworkEnum

Name | Value
---- | -----
NERPANET | &quot;nerpanet&quot;
MAINNET | &quot;mainnet&quot;



## Enum: StatusEnum

Name | Value
---- | -----
QUEUED | &quot;queued&quot;
PROPOSING | &quot;proposing&quot;
ACCEPTED | &quot;accepted&quot;
FAILED | &quot;failed&quot;
ACTIVE | &quot;active&quot;
PUBLISHED | &quot;published&quot;
TERMINATED | &quot;terminated&quot;



