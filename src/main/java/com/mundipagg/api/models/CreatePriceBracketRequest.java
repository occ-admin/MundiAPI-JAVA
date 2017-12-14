/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CreatePriceBracketRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5714512478184917613L;
    private int startQuantity;
    private int price;
    private Integer endQuantity;
    private Integer overagePrice;
    /** GETTER
     * Start quantity
     */
    @JsonGetter("start_quantity")
    public int getStartQuantity ( ) { 
        return this.startQuantity;
    }
    
    /** SETTER
     * Start quantity
     */
    @JsonSetter("start_quantity")
    public void setStartQuantity (int value) { 
        this.startQuantity = value;
    }
 
    /** GETTER
     * Price
     */
    @JsonGetter("price")
    public int getPrice ( ) { 
        return this.price;
    }
    
    /** SETTER
     * Price
     */
    @JsonSetter("price")
    public void setPrice (int value) { 
        this.price = value;
    }
 
    /** GETTER
     * End quantity
     */
    @JsonGetter("end_quantity")
    public Integer getEndQuantity ( ) { 
        return this.endQuantity;
    }
    
    /** SETTER
     * End quantity
     */
    @JsonSetter("end_quantity")
    public void setEndQuantity (Integer value) { 
        this.endQuantity = value;
    }
 
    /** GETTER
     * Overage price
     */
    @JsonGetter("overage_price")
    public Integer getOveragePrice ( ) { 
        return this.overagePrice;
    }
    
    /** SETTER
     * Overage price
     */
    @JsonSetter("overage_price")
    public void setOveragePrice (Integer value) { 
        this.overagePrice = value;
    }
 
}
 