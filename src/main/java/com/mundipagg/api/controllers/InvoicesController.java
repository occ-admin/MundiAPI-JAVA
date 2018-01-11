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

public class InvoicesController extends BaseController {    
    //private static variables for the singleton pattern
    private static Object syncObject = new Object();
    private static InvoicesController instance = null;

    /**
     * Singleton pattern implementation 
     * @return The singleton instance of the InvoicesController class 
     */
    public static InvoicesController getInstance() {
        synchronized (syncObject) {
            if (null == instance) {
                instance = new InvoicesController();
            }
        }
        return instance;
    }

    /**
     * Gets an invoice
     * @param    invoiceId    Required parameter: Invoice Id
     * @return    Returns the GetInvoiceResponse response from the API call 
     */
    public GetInvoiceResponse getInvoice(
                final String invoiceId
    ) throws Throwable {
        APICallBackCatcher<GetInvoiceResponse> callback = new APICallBackCatcher<GetInvoiceResponse>();
        getInvoiceAsync(invoiceId, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Gets an invoice
     * @param    invoiceId    Required parameter: Invoice Id
     * @return    Returns the void response from the API call 
     */
    public void getInvoiceAsync(
                final String invoiceId,
                final APICallBack<GetInvoiceResponse> callBack
    ) {
        //the base uri for api requests
        String _baseUri = Configuration.baseUri;
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/invoices/{invoice_id}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5123353784460326684L;
            {
                    put( "invoice_id", invoiceId );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5706315520765739885L;
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
                            GetInvoiceResponse _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<GetInvoiceResponse>(){});

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
     * Cancels an invoice
     * @param    invoiceId    Required parameter: Invoice id
     * @return    Returns the GetInvoiceResponse response from the API call 
     */
    public GetInvoiceResponse cancelInvoice(
                final String invoiceId
    ) throws Throwable {
        APICallBackCatcher<GetInvoiceResponse> callback = new APICallBackCatcher<GetInvoiceResponse>();
        cancelInvoiceAsync(invoiceId, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Cancels an invoice
     * @param    invoiceId    Required parameter: Invoice id
     * @return    Returns the void response from the API call 
     */
    public void cancelInvoiceAsync(
                final String invoiceId,
                final APICallBack<GetInvoiceResponse> callBack
    ) {
        //the base uri for api requests
        String _baseUri = Configuration.baseUri;
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/invoices/{invoice_id}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5649873607082254090L;
            {
                    put( "invoice_id", invoiceId );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5007902271968365299L;
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
                            GetInvoiceResponse _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<GetInvoiceResponse>(){});

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
     * Updates the metadata from an invoice
     * @param    invoiceId    Required parameter: The invoice id
     * @param    request    Required parameter: Request for updating the invoice metadata
     * @return    Returns the GetInvoiceResponse response from the API call 
     */
    public GetInvoiceResponse updateInvoiceMetadata(
                final String invoiceId,
                final UpdateMetadataRequest request
    ) throws Throwable {
        APICallBackCatcher<GetInvoiceResponse> callback = new APICallBackCatcher<GetInvoiceResponse>();
        updateInvoiceMetadataAsync(invoiceId, request, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Updates the metadata from an invoice
     * @param    invoiceId    Required parameter: The invoice id
     * @param    request    Required parameter: Request for updating the invoice metadata
     * @return    Returns the void response from the API call 
     */
    public void updateInvoiceMetadataAsync(
                final String invoiceId,
                final UpdateMetadataRequest request,
                final APICallBack<GetInvoiceResponse> callBack
    ) throws JsonProcessingException {
        //the base uri for api requests
        String _baseUri = Configuration.baseUri;
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/invoices/{invoice_id}/metadata");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5199312004406723471L;
            {
                    put( "invoice_id", invoiceId );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5090067668038514315L;
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
                            GetInvoiceResponse _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<GetInvoiceResponse>(){});

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
     * Gets all invoices
     * @param    page    Optional parameter: Page number
     * @param    size    Optional parameter: Page size
     * @param    code    Optional parameter: Filter for Invoice's code
     * @param    customerId    Optional parameter: Filter for Invoice's customer id
     * @param    subscriptionId    Optional parameter: Filter for Invoice's subscription id
     * @param    createdSince    Optional parameter: Filter for Invoice's creation date start range
     * @param    createdUntil    Optional parameter: Filter for Invoices creation date end range
     * @param    status    Optional parameter: Filter for Invoice's status
     * @param    dueSince    Optional parameter: Filter for Invoice's due date start range
     * @param    dueUntil    Optional parameter: Filter for Invoice's due date end range
     * @return    Returns the ListInvoicesResponse response from the API call 
     */
    public ListInvoicesResponse getInvoices(
                final Integer page,
                final Integer size,
                final String code,
                final String customerId,
                final String subscriptionId,
                final DateTime createdSince,
                final DateTime createdUntil,
                final String status,
                final DateTime dueSince,
                final DateTime dueUntil
    ) throws Throwable {
        APICallBackCatcher<ListInvoicesResponse> callback = new APICallBackCatcher<ListInvoicesResponse>();
        getInvoicesAsync(page, size, code, customerId, subscriptionId, createdSince, createdUntil, status, dueSince, dueUntil, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Gets all invoices
     * @param    page    Optional parameter: Page number
     * @param    size    Optional parameter: Page size
     * @param    code    Optional parameter: Filter for Invoice's code
     * @param    customerId    Optional parameter: Filter for Invoice's customer id
     * @param    subscriptionId    Optional parameter: Filter for Invoice's subscription id
     * @param    createdSince    Optional parameter: Filter for Invoice's creation date start range
     * @param    createdUntil    Optional parameter: Filter for Invoices creation date end range
     * @param    status    Optional parameter: Filter for Invoice's status
     * @param    dueSince    Optional parameter: Filter for Invoice's due date start range
     * @param    dueUntil    Optional parameter: Filter for Invoice's due date end range
     * @return    Returns the void response from the API call 
     */
    public void getInvoicesAsync(
                final Integer page,
                final Integer size,
                final String code,
                final String customerId,
                final String subscriptionId,
                final DateTime createdSince,
                final DateTime createdUntil,
                final String status,
                final DateTime dueSince,
                final DateTime dueUntil,
                final APICallBack<ListInvoicesResponse> callBack
    ) {
        //the base uri for api requests
        String _baseUri = Configuration.baseUri;
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/invoices");

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5411443438613123313L;
            {
                    put( "page", page );
                    put( "size", size );
                    put( "code", code );
                    put( "customer_id", customerId );
                    put( "subscription_id", subscriptionId );
                    put( "created_since", DateTimeHelper.toRfc8601DateTime(createdSince) );
                    put( "created_until", DateTimeHelper.toRfc8601DateTime(createdUntil) );
                    put( "status", status );
                    put( "due_since", DateTimeHelper.toRfc8601DateTime(dueSince) );
                    put( "due_until", DateTimeHelper.toRfc8601DateTime(dueUntil) );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5553829853067354663L;
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
                            ListInvoicesResponse _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<ListInvoicesResponse>(){});

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
     * Create an Invoice
     * @param    subscriptionId    Required parameter: Subscription Id
     * @param    cycleId    Required parameter: Cycle Id
     * @return    Returns the GetInvoiceResponse response from the API call 
     */
    public GetInvoiceResponse createInvoice(
                final String subscriptionId,
                final String cycleId
    ) throws Throwable {
        APICallBackCatcher<GetInvoiceResponse> callback = new APICallBackCatcher<GetInvoiceResponse>();
        createInvoiceAsync(subscriptionId, cycleId, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Create an Invoice
     * @param    subscriptionId    Required parameter: Subscription Id
     * @param    cycleId    Required parameter: Cycle Id
     * @return    Returns the void response from the API call 
     */
    public void createInvoiceAsync(
                final String subscriptionId,
                final String cycleId,
                final APICallBack<GetInvoiceResponse> callBack
    ) {
        //the base uri for api requests
        String _baseUri = Configuration.baseUri;
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/subscriptions/{subscription_id}/cycles/{cycle_id}/pay");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5095515804258250690L;
            {
                    put( "subscription_id", subscriptionId );
                    put( "cycle_id", cycleId );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5008383194297569072L;
            {
                    put( "user-agent", "MundiSDK" );
                    put( "accept", "application/json" );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest _request = getClientInstance().post(_queryUrl, _headers, null,
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
                            GetInvoiceResponse _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<GetInvoiceResponse>(){});

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
     * Updates the status from an invoice
     * @param    invoiceId    Required parameter: Invoice Id
     * @param    request    Required parameter: Request for updating an invoice's status
     * @return    Returns the GetInvoiceResponse response from the API call 
     */
    public GetInvoiceResponse updateInvoiceStatus(
                final String invoiceId,
                final UpdateInvoiceStatusRequest request
    ) throws Throwable {
        APICallBackCatcher<GetInvoiceResponse> callback = new APICallBackCatcher<GetInvoiceResponse>();
        updateInvoiceStatusAsync(invoiceId, request, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Updates the status from an invoice
     * @param    invoiceId    Required parameter: Invoice Id
     * @param    request    Required parameter: Request for updating an invoice's status
     * @return    Returns the void response from the API call 
     */
    public void updateInvoiceStatusAsync(
                final String invoiceId,
                final UpdateInvoiceStatusRequest request,
                final APICallBack<GetInvoiceResponse> callBack
    ) throws JsonProcessingException {
        //the base uri for api requests
        String _baseUri = Configuration.baseUri;
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/invoices/{invoice_id}/status");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 4956889838073053981L;
            {
                    put( "invoice_id", invoiceId );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 4664128366741970775L;
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
                            GetInvoiceResponse _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<GetInvoiceResponse>(){});

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