/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CreateShippingRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5576091082953496919L;
    private int amount;
    private String description;
    private String recipientName;
    private String recipientPhone;
    private String addressId;
    private CreateAddressRequest address;
    /** GETTER
     * Shipping amount
     */
    @JsonGetter("amount")
    public int getAmount ( ) { 
        return this.amount;
    }
    
    /** SETTER
     * Shipping amount
     */
    @JsonSetter("amount")
    public void setAmount (int value) { 
        this.amount = value;
    }
 
    /** GETTER
     * Description
     */
    @JsonGetter("description")
    public String getDescription ( ) { 
        return this.description;
    }
    
    /** SETTER
     * Description
     */
    @JsonSetter("description")
    public void setDescription (String value) { 
        this.description = value;
    }
 
    /** GETTER
     * Recipient name
     */
    @JsonGetter("recipient_name")
    public String getRecipientName ( ) { 
        return this.recipientName;
    }
    
    /** SETTER
     * Recipient name
     */
    @JsonSetter("recipient_name")
    public void setRecipientName (String value) { 
        this.recipientName = value;
    }
 
    /** GETTER
     * Recipient phone number
     */
    @JsonGetter("recipient_phone")
    public String getRecipientPhone ( ) { 
        return this.recipientPhone;
    }
    
    /** SETTER
     * Recipient phone number
     */
    @JsonSetter("recipient_phone")
    public void setRecipientPhone (String value) { 
        this.recipientPhone = value;
    }
 
    /** GETTER
     * The id of the address that will be used for shipping
     */
    @JsonGetter("address_id")
    public String getAddressId ( ) { 
        return this.addressId;
    }
    
    /** SETTER
     * The id of the address that will be used for shipping
     */
    @JsonSetter("address_id")
    public void setAddressId (String value) { 
        this.addressId = value;
    }
 
    /** GETTER
     * Address data
     */
    @JsonGetter("address")
    public CreateAddressRequest getAddress ( ) { 
        return this.address;
    }
    
    /** SETTER
     * Address data
     */
    @JsonSetter("address")
    public void setAddress (CreateAddressRequest value) { 
        this.address = value;
    }
 
}
 