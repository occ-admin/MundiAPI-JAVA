/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CreateLocationRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4757751325660959208L;
    private String latitude;
    private String longitude;
    /** GETTER
     * Latitude
     */
    @JsonGetter("latitude")
    public String getLatitude ( ) { 
        return this.latitude;
    }
    
    /** SETTER
     * Latitude
     */
    @JsonSetter("latitude")
    public void setLatitude (String value) { 
        this.latitude = value;
    }
 
    /** GETTER
     * Longitude
     */
    @JsonGetter("longitude")
    public String getLongitude ( ) { 
        return this.longitude;
    }
    
    /** SETTER
     * Longitude
     */
    @JsonSetter("longitude")
    public void setLongitude (String value) { 
        this.longitude = value;
    }
 
}
 