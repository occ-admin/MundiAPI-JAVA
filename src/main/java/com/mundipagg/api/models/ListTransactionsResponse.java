/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ListTransactionsResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5291632883204988347L;
    private List<GetTransactionResponse> data;
    private PagingResponse paging;
    /** GETTER
     * The transaction objects
     */
    @JsonGetter("data")
    public List<GetTransactionResponse> getData ( ) { 
        return this.data;
    }
    
    /** SETTER
     * The transaction objects
     */
    @JsonSetter("data")
    public void setData (List<GetTransactionResponse> value) { 
        this.data = value;
    }
 
    /** GETTER
     * Paging object
     */
    @JsonGetter("paging")
    public PagingResponse getPaging ( ) { 
        return this.paging;
    }
    
    /** SETTER
     * Paging object
     */
    @JsonSetter("paging")
    public void setPaging (PagingResponse value) { 
        this.paging = value;
    }
 
}
 