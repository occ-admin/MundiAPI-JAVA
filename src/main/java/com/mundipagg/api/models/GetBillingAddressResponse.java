/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class GetBillingAddressResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5227584906077830458L;
    private String street;
    private String number;
    private String zipCode;
    private String neighborhood;
    private String city;
    private String state;
    private String country;
    private String complement;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("street")
    public String getStreet ( ) { 
        return this.street;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("street")
    public void setStreet (String value) { 
        this.street = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("number")
    public String getNumber ( ) { 
        return this.number;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("number")
    public void setNumber (String value) { 
        this.number = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("zip_code")
    public String getZipCode ( ) { 
        return this.zipCode;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("zip_code")
    public void setZipCode (String value) { 
        this.zipCode = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("neighborhood")
    public String getNeighborhood ( ) { 
        return this.neighborhood;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("neighborhood")
    public void setNeighborhood (String value) { 
        this.neighborhood = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("city")
    public String getCity ( ) { 
        return this.city;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("city")
    public void setCity (String value) { 
        this.city = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("state")
    public String getState ( ) { 
        return this.state;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("state")
    public void setState (String value) { 
        this.state = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("country")
    public String getCountry ( ) { 
        return this.country;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("country")
    public void setCountry (String value) { 
        this.country = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("complement")
    public String getComplement ( ) { 
        return this.complement;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("complement")
    public void setComplement (String value) { 
        this.complement = value;
    }
 
}
 