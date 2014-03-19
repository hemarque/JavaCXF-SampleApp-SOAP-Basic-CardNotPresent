
package com.evosnap.schemas.cws.v2_0.transactionprocessing;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.7
 * 2013-11-22T08:57:23.374-07:00
 * Generated source version: 2.7.7
 */

@WebFault(name = "CWSDeserializationFault", targetNamespace = "http://schemas.evosnap.com/CWS/v2.0/Transactions/Faults")
public class ICwsTransactionProcessingCaptureSelectiveAsyncCWSDeserializationFaultFaultFaultMessage extends Exception {
    
    private com.evosnap.schemas.cws.v2_0.transactions.faults.CWSDeserializationFault cwsDeserializationFault;

    public ICwsTransactionProcessingCaptureSelectiveAsyncCWSDeserializationFaultFaultFaultMessage() {
        super();
    }
    
    public ICwsTransactionProcessingCaptureSelectiveAsyncCWSDeserializationFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICwsTransactionProcessingCaptureSelectiveAsyncCWSDeserializationFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICwsTransactionProcessingCaptureSelectiveAsyncCWSDeserializationFaultFaultFaultMessage(String message, com.evosnap.schemas.cws.v2_0.transactions.faults.CWSDeserializationFault cwsDeserializationFault) {
        super(message);
        this.cwsDeserializationFault = cwsDeserializationFault;
    }

    public ICwsTransactionProcessingCaptureSelectiveAsyncCWSDeserializationFaultFaultFaultMessage(String message, com.evosnap.schemas.cws.v2_0.transactions.faults.CWSDeserializationFault cwsDeserializationFault, Throwable cause) {
        super(message, cause);
        this.cwsDeserializationFault = cwsDeserializationFault;
    }

    public com.evosnap.schemas.cws.v2_0.transactions.faults.CWSDeserializationFault getFaultInfo() {
        return this.cwsDeserializationFault;
    }
}
