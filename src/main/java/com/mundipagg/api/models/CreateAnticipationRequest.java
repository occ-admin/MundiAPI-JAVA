/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.mundipagg.api.DateTimeHelper;
import org.joda.time.DateTime;

public class CreateAnticipationRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5433510646331521474L;
    private int amount;
    private String timeframe;
    private DateTime paymentDate;
    /** GETTER
     * Amount requested for the anticipation
     */
    @JsonGetter("amount")
    public int getAmount ( ) { 
        return this.amount;
    }
    
    /** SETTER
     * Amount requested for the anticipation
     */
    @JsonSetter("amount")
    public void setAmount (int value) { 
        this.amount = value;
    }
 
    /** GETTER
     * Timeframe
     */
    @JsonGetter("timeframe")
    public String getTimeframe ( ) { 
        return this.timeframe;
    }
    
    /** SETTER
     * Timeframe
     */
    @JsonSetter("timeframe")
    public void setTimeframe (String value) { 
        this.timeframe = value;
    }
 
    /** GETTER
     * Payment date
     */
    @JsonGetter("payment_date")
    @JsonSerialize(using=DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public DateTime getPaymentDate ( ) { 
        return this.paymentDate;
    }
    
    /** SETTER
     * Payment date
     */
    @JsonSetter("payment_date")
    @JsonDeserialize(using=DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setPaymentDate (DateTime value) { 
        this.paymentDate = value;
    }
 
}
 