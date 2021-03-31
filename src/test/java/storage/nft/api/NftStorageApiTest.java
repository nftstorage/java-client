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


package storage.nft.api;

import storage.nft.ApiException;
import storage.nft.model.DeleteResponse;
import storage.nft.model.ErrorResponse;
import java.io.File;
import storage.nft.model.ForbiddenErrorResponse;
import storage.nft.model.GetResponse;
import storage.nft.model.ListResponse;
import storage.nft.model.UnauthorizedErrorResponse;
import storage.nft.model.UploadResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for NftStorageApi
 */
@Ignore
public class NftStorageApiTest {

    private final NftStorageApi api = new NftStorageApi();

    
    /**
     * Stop storing the content with the passed CID
     *
     * Stop storing the content with the passed CID on nft.storage. - Unpin the item from the underlying IPFS pinning service. - Cease renewals for expired Filecoin deals involving the CID.    ⚠️ This does not remove the content from the network.  - Does not terminate any established Filecoin deal. - Does not remove the content from other IPFS nodes in the network that already cached or pinned the CID.    Note: the content will remain available if another user has stored the CID with nft.storage. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteTest() throws ApiException {
        String cid = null;
        DeleteResponse response = api.delete(cid);

        // TODO: test validations
    }
    
    /**
     * List all stored files
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listTest() throws ApiException {
        ListResponse response = api.list();

        // TODO: test validations
    }
    
    /**
     * Get information for the stored file CID
     *
     * Includes the IPFS pinning state and the Filecoin deal state.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void statusTest() throws ApiException {
        String cid = null;
        GetResponse response = api.status(cid);

        // TODO: test validations
    }
    
    /**
     * Store a file
     *
     * Store a file with nft.storage.  - Submit a HTTP &#x60;POST&#x60; request passing the file data in the request body. - To store multiple files in a directory, submit a &#x60;multipart/form-data&#x60; HTTP &#x60;POST&#x60; request.  Use the &#x60;Content-Disposition&#x60; header for each part to specify a filename. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void storeTest() throws ApiException {
        File body = null;
        UploadResponse response = api.store(body);

        // TODO: test validations
    }
    
}