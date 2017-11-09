/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class GetPriceBracketResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5494595237259253976L;
    private int startQuantity;
    private int price;
    private Integer endQuantity;
    private Integer overagePrice;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("start_quantity")
    public int getStartQuantity ( ) { 
        return this.startQuantity;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("start_quantity")
    public void setStartQuantity (int value) { 
        this.startQuantity = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("price")
    public int getPrice ( ) { 
        return this.price;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("price")
    public void setPrice (int value) { 
        this.price = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("end_quantity")
    public Integer getEndQuantity ( ) { 
        return this.endQuantity;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("end_quantity")
    public void setEndQuantity (Integer value) { 
        this.endQuantity = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("overage_price")
    public Integer getOveragePrice ( ) { 
        return this.overagePrice;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("overage_price")
    public void setOveragePrice (Integer value) { 
        this.overagePrice = value;
    }
 
}
 