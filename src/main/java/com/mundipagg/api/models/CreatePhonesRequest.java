/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CreatePhonesRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5604102097473288516L;
    private CreatePhoneRequest homePhone;
    private CreatePhoneRequest mobilePhone;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("home_phone")
    public CreatePhoneRequest getHomePhone ( ) { 
        return this.homePhone;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("home_phone")
    public void setHomePhone (CreatePhoneRequest value) { 
        this.homePhone = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("mobile_phone")
    public CreatePhoneRequest getMobilePhone ( ) { 
        return this.mobilePhone;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("mobile_phone")
    public void setMobilePhone (CreatePhoneRequest value) { 
        this.mobilePhone = value;
    }
 
}
 