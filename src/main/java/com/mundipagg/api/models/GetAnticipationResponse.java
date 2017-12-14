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

public class GetAnticipationResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5485488391876489416L;
    private String id;
    private int requestedAmount;
    private int approvedAmount;
    private GetRecipientResponse recipient;
    private String pgid;
    private DateTime createdAt;
    private DateTime updatedAt;
    private DateTime paymentDate;
    private String status;
    private String timeframe;
    /** GETTER
     * Id
     */
    @JsonGetter("id")
    public String getId ( ) { 
        return this.id;
    }
    
    /** SETTER
     * Id
     */
    @JsonSetter("id")
    public void setId (String value) { 
        this.id = value;
    }
 
    /** GETTER
     * Requested amount
     */
    @JsonGetter("requested_amount")
    public int getRequestedAmount ( ) { 
        return this.requestedAmount;
    }
    
    /** SETTER
     * Requested amount
     */
    @JsonSetter("requested_amount")
    public void setRequestedAmount (int value) { 
        this.requestedAmount = value;
    }
 
    /** GETTER
     * Approved amount
     */
    @JsonGetter("approved_amount")
    public int getApprovedAmount ( ) { 
        return this.approvedAmount;
    }
    
    /** SETTER
     * Approved amount
     */
    @JsonSetter("approved_amount")
    public void setApprovedAmount (int value) { 
        this.approvedAmount = value;
    }
 
    /** GETTER
     * Recipient
     */
    @JsonGetter("recipient")
    public GetRecipientResponse getRecipient ( ) { 
        return this.recipient;
    }
    
    /** SETTER
     * Recipient
     */
    @JsonSetter("recipient")
    public void setRecipient (GetRecipientResponse value) { 
        this.recipient = value;
    }
 
    /** GETTER
     * Anticipation id on the gateway
     */
    @JsonGetter("pgid")
    public String getPgid ( ) { 
        return this.pgid;
    }
    
    /** SETTER
     * Anticipation id on the gateway
     */
    @JsonSetter("pgid")
    public void setPgid (String value) { 
        this.pgid = value;
    }
 
    /** GETTER
     * Creation date
     */
    @JsonGetter("created_at")
    @JsonSerialize(using=DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public DateTime getCreatedAt ( ) { 
        return this.createdAt;
    }
    
    /** SETTER
     * Creation date
     */
    @JsonSetter("created_at")
    @JsonDeserialize(using=DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setCreatedAt (DateTime value) { 
        this.createdAt = value;
    }
 
    /** GETTER
     * Last update date
     */
    @JsonGetter("updated_at")
    @JsonSerialize(using=DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public DateTime getUpdatedAt ( ) { 
        return this.updatedAt;
    }
    
    /** SETTER
     * Last update date
     */
    @JsonSetter("updated_at")
    @JsonDeserialize(using=DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setUpdatedAt (DateTime value) { 
        this.updatedAt = value;
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
 
    /** GETTER
     * Status
     */
    @JsonGetter("status")
    public String getStatus ( ) { 
        return this.status;
    }
    
    /** SETTER
     * Status
     */
    @JsonSetter("status")
    public void setStatus (String value) { 
        this.status = value;
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
 
}
 