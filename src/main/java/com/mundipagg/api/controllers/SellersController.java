/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.controllers;

import java.io.*;
import java.util.*;
import java.util.concurrent.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import org.joda.time.DateTime;

import com.mundipagg.api.*;
import com.mundipagg.api.models.*;
import com.mundipagg.api.exceptions.*;
import com.mundipagg.api.http.client.HttpClient;
import com.mundipagg.api.http.client.HttpContext;
import com.mundipagg.api.http.request.HttpRequest;
import com.mundipagg.api.http.response.HttpResponse;
import com.mundipagg.api.http.response.HttpStringResponse;
import com.mundipagg.api.http.client.APICallBack;
import com.mundipagg.api.controllers.syncwrapper.APICallBackCatcher;

public class SellersController extends BaseController {    
    //private static variables for the singleton pattern
    private static Object syncObject = new Object();
    private static SellersController instance = null;

    /**
     * Singleton pattern implementation 
     * @return The singleton instance of the SellersController class 
     */
    public static SellersController getInstance() {
        synchronized (syncObject) {
            if (null == instance) {
                instance = new SellersController();
            }
        }
        return instance;
    }

    /**
     * TODO: type endpoint description here
     * @param    request    Required parameter: Seller Model
     * @return    Returns the GetSellerResponse response from the API call 
     */
    public GetSellerResponse createSeller(
                final CreateSellerRequest request
    ) throws Throwable {
        APICallBackCatcher<GetSellerResponse> callback = new APICallBackCatcher<GetSellerResponse>();
        createSellerAsync(request, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * TODO: type endpoint description here
     * @param    request    Required parameter: Seller Model
     * @return    Returns the void response from the API call 
     */
    public void createSellerAsync(
                final CreateSellerRequest request,
                final APICallBack<GetSellerResponse> callBack
    ) throws JsonProcessingException {
        //the base uri for api requests
        String _baseUri = Configuration.baseUri;
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/sellers/");
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5326204636585253174L;
            {
                    put( "user-agent", "MundiSDK" );
                    put( "accept", "application/json" );
                    put( "content-type", "application/json" );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest _request = getClientInstance().postBody(_queryUrl, _headers, APIHelper.serialize(request),
                                        Configuration.basicAuthUserName, Configuration.basicAuthPassword);

        //invoke the callback before request if its not null
        if (getHttpCallBack() != null)
        {
            getHttpCallBack().OnBeforeRequest(_request);
        }

        //invoke request and get response
        Runnable _responseTask = new Runnable() {
            public void run() {
                //make the API call
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {

                            //invoke the callback after response if its not null
                            if (getHttpCallBack() != null)	
                            {
                                getHttpCallBack().OnAfterResponse(_context);
                            }

                            //handle errors defined at the API level
                            validateResponse(_response, _context);

                            //extract result from the http response
                            String _responseBody = ((HttpStringResponse)_response).getBody();
                            GetSellerResponse _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<GetSellerResponse>(){});

                            //let the caller know of the success
                            callBack.onSuccess(_context, _result);
                        } catch (APIException error) {
                            //let the caller know of the error
                            callBack.onFailure(_context, error);
                        } catch (IOException ioException) {
                            //let the caller know of the caught IO Exception
                            callBack.onFailure(_context, ioException);
                        } catch (Exception exception) {
                            //let the caller know of the caught Exception
                            callBack.onFailure(_context, exception);
                        }
                    }
                    public void onFailure(HttpContext _context, Throwable _error) {
                        //invoke the callback after response if its not null
                        if (getHttpCallBack() != null)
                        {
                            getHttpCallBack().OnAfterResponse(_context);
                        }

                        //let the caller know of the failure
                        callBack.onFailure(_context, _error);
                    }
                });
            }
        };

        //execute async using thread pool
        APIHelper.getScheduler().execute(_responseTask);
    }

    /**
     * TODO: type endpoint description here
     * @param    sellerId    Required parameter: Seller Id
     * @return    Returns the GetSellerResponse response from the API call 
     */
    public GetSellerResponse deleteSeller(
                final String sellerId
    ) throws Throwable {
        APICallBackCatcher<GetSellerResponse> callback = new APICallBackCatcher<GetSellerResponse>();
        deleteSellerAsync(sellerId, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * TODO: type endpoint description here
     * @param    sellerId    Required parameter: Seller Id
     * @return    Returns the void response from the API call 
     */
    public void deleteSellerAsync(
                final String sellerId,
                final APICallBack<GetSellerResponse> callBack
    ) {
        //the base uri for api requests
        String _baseUri = Configuration.baseUri;
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/sellers/{sellerId}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 4928433464074088736L;
            {
                    put( "sellerId", sellerId );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 4994054678611915413L;
            {
                    put( "user-agent", "MundiSDK" );
                    put( "accept", "application/json" );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest _request = getClientInstance().delete(_queryUrl, _headers, null,
                                        Configuration.basicAuthUserName, Configuration.basicAuthPassword);

        //invoke the callback before request if its not null
        if (getHttpCallBack() != null)
        {
            getHttpCallBack().OnBeforeRequest(_request);
        }

        //invoke request and get response
        Runnable _responseTask = new Runnable() {
            public void run() {
                //make the API call
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {

                            //invoke the callback after response if its not null
                            if (getHttpCallBack() != null)	
                            {
                                getHttpCallBack().OnAfterResponse(_context);
                            }

                            //handle errors defined at the API level
                            validateResponse(_response, _context);

                            //extract result from the http response
                            String _responseBody = ((HttpStringResponse)_response).getBody();
                            GetSellerResponse _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<GetSellerResponse>(){});

                            //let the caller know of the success
                            callBack.onSuccess(_context, _result);
                        } catch (APIException error) {
                            //let the caller know of the error
                            callBack.onFailure(_context, error);
                        } catch (IOException ioException) {
                            //let the caller know of the caught IO Exception
                            callBack.onFailure(_context, ioException);
                        } catch (Exception exception) {
                            //let the caller know of the caught Exception
                            callBack.onFailure(_context, exception);
                        }
                    }
                    public void onFailure(HttpContext _context, Throwable _error) {
                        //invoke the callback after response if its not null
                        if (getHttpCallBack() != null)
                        {
                            getHttpCallBack().OnAfterResponse(_context);
                        }

                        //let the caller know of the failure
                        callBack.onFailure(_context, _error);
                    }
                });
            }
        };

        //execute async using thread pool
        APIHelper.getScheduler().execute(_responseTask);
    }

    /**
     * TODO: type endpoint description here
     * @param    id    Required parameter: Seller Id
     * @return    Returns the GetSellerResponse response from the API call 
     */
    public GetSellerResponse getSellerById(
                final String id
    ) throws Throwable {
        APICallBackCatcher<GetSellerResponse> callback = new APICallBackCatcher<GetSellerResponse>();
        getSellerByIdAsync(id, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * TODO: type endpoint description here
     * @param    id    Required parameter: Seller Id
     * @return    Returns the void response from the API call 
     */
    public void getSellerByIdAsync(
                final String id,
                final APICallBack<GetSellerResponse> callBack
    ) {
        //the base uri for api requests
        String _baseUri = Configuration.baseUri;
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/sellers/{id}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5164182510732611179L;
            {
                    put( "id", id );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5701317903162569569L;
            {
                    put( "user-agent", "MundiSDK" );
                    put( "accept", "application/json" );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest _request = getClientInstance().get(_queryUrl, _headers, null,
                                        Configuration.basicAuthUserName, Configuration.basicAuthPassword);

        //invoke the callback before request if its not null
        if (getHttpCallBack() != null)
        {
            getHttpCallBack().OnBeforeRequest(_request);
        }

        //invoke request and get response
        Runnable _responseTask = new Runnable() {
            public void run() {
                //make the API call
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {

                            //invoke the callback after response if its not null
                            if (getHttpCallBack() != null)	
                            {
                                getHttpCallBack().OnAfterResponse(_context);
                            }

                            //handle errors defined at the API level
                            validateResponse(_response, _context);

                            //extract result from the http response
                            String _responseBody = ((HttpStringResponse)_response).getBody();
                            GetSellerResponse _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<GetSellerResponse>(){});

                            //let the caller know of the success
                            callBack.onSuccess(_context, _result);
                        } catch (APIException error) {
                            //let the caller know of the error
                            callBack.onFailure(_context, error);
                        } catch (IOException ioException) {
                            //let the caller know of the caught IO Exception
                            callBack.onFailure(_context, ioException);
                        } catch (Exception exception) {
                            //let the caller know of the caught Exception
                            callBack.onFailure(_context, exception);
                        }
                    }
                    public void onFailure(HttpContext _context, Throwable _error) {
                        //invoke the callback after response if its not null
                        if (getHttpCallBack() != null)
                        {
                            getHttpCallBack().OnAfterResponse(_context);
                        }

                        //let the caller know of the failure
                        callBack.onFailure(_context, _error);
                    }
                });
            }
        };

        //execute async using thread pool
        APIHelper.getScheduler().execute(_responseTask);
    }

    /**
     * TODO: type endpoint description here
     * @param    page    Optional parameter: Page number
     * @param    size    Optional parameter: Page size
     * @param    name    Optional parameter: Example: 
     * @param    document    Optional parameter: Example: 
     * @param    code    Optional parameter: Example: 
     * @param    status    Optional parameter: Example: 
     * @param    type    Optional parameter: Example: 
     * @param    createdSince    Optional parameter: Example: 
     * @param    createdUntil    Optional parameter: Example: 
     * @return    Returns the ListSellerResponse response from the API call 
     */
    public ListSellerResponse getSellers(
                final Integer page,
                final Integer size,
                final String name,
                final String document,
                final String code,
                final String status,
                final String type,
                final DateTime createdSince,
                final DateTime createdUntil
    ) throws Throwable {
        APICallBackCatcher<ListSellerResponse> callback = new APICallBackCatcher<ListSellerResponse>();
        getSellersAsync(page, size, name, document, code, status, type, createdSince, createdUntil, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * TODO: type endpoint description here
     * @param    page    Optional parameter: Page number
     * @param    size    Optional parameter: Page size
     * @param    name    Optional parameter: Example: 
     * @param    document    Optional parameter: Example: 
     * @param    code    Optional parameter: Example: 
     * @param    status    Optional parameter: Example: 
     * @param    type    Optional parameter: Example: 
     * @param    createdSince    Optional parameter: Example: 
     * @param    createdUntil    Optional parameter: Example: 
     * @return    Returns the void response from the API call 
     */
    public void getSellersAsync(
                final Integer page,
                final Integer size,
                final String name,
                final String document,
                final String code,
                final String status,
                final String type,
                final DateTime createdSince,
                final DateTime createdUntil,
                final APICallBack<ListSellerResponse> callBack
    ) {
        //the base uri for api requests
        String _baseUri = Configuration.baseUri;
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/sellers");

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5381450792679486435L;
            {
                    put( "page", page );
                    put( "size", size );
                    put( "name", name );
                    put( "document", document );
                    put( "code", code );
                    put( "status", status );
                    put( "type", type );
                    put( "created_Since", DateTimeHelper.toRfc8601DateTime(createdSince) );
                    put( "created_Until", DateTimeHelper.toRfc8601DateTime(createdUntil) );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5510607173817981876L;
            {
                    put( "user-agent", "MundiSDK" );
                    put( "accept", "application/json" );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest _request = getClientInstance().get(_queryUrl, _headers, null,
                                        Configuration.basicAuthUserName, Configuration.basicAuthPassword);

        //invoke the callback before request if its not null
        if (getHttpCallBack() != null)
        {
            getHttpCallBack().OnBeforeRequest(_request);
        }

        //invoke request and get response
        Runnable _responseTask = new Runnable() {
            public void run() {
                //make the API call
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {

                            //invoke the callback after response if its not null
                            if (getHttpCallBack() != null)	
                            {
                                getHttpCallBack().OnAfterResponse(_context);
                            }

                            //handle errors defined at the API level
                            validateResponse(_response, _context);

                            //extract result from the http response
                            String _responseBody = ((HttpStringResponse)_response).getBody();
                            ListSellerResponse _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<ListSellerResponse>(){});

                            //let the caller know of the success
                            callBack.onSuccess(_context, _result);
                        } catch (APIException error) {
                            //let the caller know of the error
                            callBack.onFailure(_context, error);
                        } catch (IOException ioException) {
                            //let the caller know of the caught IO Exception
                            callBack.onFailure(_context, ioException);
                        } catch (Exception exception) {
                            //let the caller know of the caught Exception
                            callBack.onFailure(_context, exception);
                        }
                    }
                    public void onFailure(HttpContext _context, Throwable _error) {
                        //invoke the callback after response if its not null
                        if (getHttpCallBack() != null)
                        {
                            getHttpCallBack().OnAfterResponse(_context);
                        }

                        //let the caller know of the failure
                        callBack.onFailure(_context, _error);
                    }
                });
            }
        };

        //execute async using thread pool
        APIHelper.getScheduler().execute(_responseTask);
    }

    /**
     * TODO: type endpoint description here
     * @param    id    Required parameter: Example: 
     * @param    request    Required parameter: Update Seller model
     * @return    Returns the GetSellerResponse response from the API call 
     */
    public GetSellerResponse updateSeller(
                final String id,
                final UpdateSellerRequest request
    ) throws Throwable {
        APICallBackCatcher<GetSellerResponse> callback = new APICallBackCatcher<GetSellerResponse>();
        updateSellerAsync(id, request, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * TODO: type endpoint description here
     * @param    id    Required parameter: Example: 
     * @param    request    Required parameter: Update Seller model
     * @return    Returns the void response from the API call 
     */
    public void updateSellerAsync(
                final String id,
                final UpdateSellerRequest request,
                final APICallBack<GetSellerResponse> callBack
    ) throws JsonProcessingException {
        //the base uri for api requests
        String _baseUri = Configuration.baseUri;
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/sellers/{id}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 4954246404433695691L;
            {
                    put( "id", id );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5619006542324773072L;
            {
                    put( "user-agent", "MundiSDK" );
                    put( "accept", "application/json" );
                    put( "content-type", "application/json" );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest _request = getClientInstance().putBody(_queryUrl, _headers, APIHelper.serialize(request),
                                        Configuration.basicAuthUserName, Configuration.basicAuthPassword);

        //invoke the callback before request if its not null
        if (getHttpCallBack() != null)
        {
            getHttpCallBack().OnBeforeRequest(_request);
        }

        //invoke request and get response
        Runnable _responseTask = new Runnable() {
            public void run() {
                //make the API call
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {

                            //invoke the callback after response if its not null
                            if (getHttpCallBack() != null)	
                            {
                                getHttpCallBack().OnAfterResponse(_context);
                            }

                            //handle errors defined at the API level
                            validateResponse(_response, _context);

                            //extract result from the http response
                            String _responseBody = ((HttpStringResponse)_response).getBody();
                            GetSellerResponse _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<GetSellerResponse>(){});

                            //let the caller know of the success
                            callBack.onSuccess(_context, _result);
                        } catch (APIException error) {
                            //let the caller know of the error
                            callBack.onFailure(_context, error);
                        } catch (IOException ioException) {
                            //let the caller know of the caught IO Exception
                            callBack.onFailure(_context, ioException);
                        } catch (Exception exception) {
                            //let the caller know of the caught Exception
                            callBack.onFailure(_context, exception);
                        }
                    }
                    public void onFailure(HttpContext _context, Throwable _error) {
                        //invoke the callback after response if its not null
                        if (getHttpCallBack() != null)
                        {
                            getHttpCallBack().OnAfterResponse(_context);
                        }

                        //let the caller know of the failure
                        callBack.onFailure(_context, _error);
                    }
                });
            }
        };

        //execute async using thread pool
        APIHelper.getScheduler().execute(_responseTask);
    }

    /**
     * TODO: type endpoint description here
     * @param    sellerId    Required parameter: Seller Id
     * @param    request    Required parameter: Request for updating the charge metadata
     * @return    Returns the GetSellerResponse response from the API call 
     */
    public GetSellerResponse updateSellerMetadata(
                final String sellerId,
                final UpdateMetadataRequest request
    ) throws Throwable {
        APICallBackCatcher<GetSellerResponse> callback = new APICallBackCatcher<GetSellerResponse>();
        updateSellerMetadataAsync(sellerId, request, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * TODO: type endpoint description here
     * @param    sellerId    Required parameter: Seller Id
     * @param    request    Required parameter: Request for updating the charge metadata
     * @return    Returns the void response from the API call 
     */
    public void updateSellerMetadataAsync(
                final String sellerId,
                final UpdateMetadataRequest request,
                final APICallBack<GetSellerResponse> callBack
    ) throws JsonProcessingException {
        //the base uri for api requests
        String _baseUri = Configuration.baseUri;
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/sellers/{seller_id}/metadata");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 4880579748673213834L;
            {
                    put( "seller_id", sellerId );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5184335607421642681L;
            {
                    put( "user-agent", "MundiSDK" );
                    put( "accept", "application/json" );
                    put( "content-type", "application/json" );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest _request = getClientInstance().patchBody(_queryUrl, _headers, APIHelper.serialize(request),
                                        Configuration.basicAuthUserName, Configuration.basicAuthPassword);

        //invoke the callback before request if its not null
        if (getHttpCallBack() != null)
        {
            getHttpCallBack().OnBeforeRequest(_request);
        }

        //invoke request and get response
        Runnable _responseTask = new Runnable() {
            public void run() {
                //make the API call
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {

                            //invoke the callback after response if its not null
                            if (getHttpCallBack() != null)	
                            {
                                getHttpCallBack().OnAfterResponse(_context);
                            }

                            //handle errors defined at the API level
                            validateResponse(_response, _context);

                            //extract result from the http response
                            String _responseBody = ((HttpStringResponse)_response).getBody();
                            GetSellerResponse _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<GetSellerResponse>(){});

                            //let the caller know of the success
                            callBack.onSuccess(_context, _result);
                        } catch (APIException error) {
                            //let the caller know of the error
                            callBack.onFailure(_context, error);
                        } catch (IOException ioException) {
                            //let the caller know of the caught IO Exception
                            callBack.onFailure(_context, ioException);
                        } catch (Exception exception) {
                            //let the caller know of the caught Exception
                            callBack.onFailure(_context, exception);
                        }
                    }
                    public void onFailure(HttpContext _context, Throwable _error) {
                        //invoke the callback after response if its not null
                        if (getHttpCallBack() != null)
                        {
                            getHttpCallBack().OnAfterResponse(_context);
                        }

                        //let the caller know of the failure
                        callBack.onFailure(_context, _error);
                    }
                });
            }
        };

        //execute async using thread pool
        APIHelper.getScheduler().execute(_responseTask);
    }

}