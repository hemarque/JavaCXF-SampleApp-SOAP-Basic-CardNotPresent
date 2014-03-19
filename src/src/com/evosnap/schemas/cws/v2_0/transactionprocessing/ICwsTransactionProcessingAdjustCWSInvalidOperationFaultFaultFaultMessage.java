
package com.evosnap.schemas.cws.v2_0.transactionprocessing;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.7
 * 2013-11-22T08:57:23.435-07:00
 * Generated source version: 2.7.7
 */

@WebFault(name = "CWSInvalidOperationFault", targetNamespace = "http://schemas.evosnap.com/CWS/v2.0/Transactions/Faults")
public class ICwsTransactionProcessingAdjustCWSInvalidOperationFaultFaultFaultMessage extends Exception {
    
    private com.evosnap.schemas.cws.v2_0.transactions.faults.CWSInvalidOperationFault cwsInvalidOperationFault;

    public ICwsTransactionProcessingAdjustCWSInvalidOperationFaultFaultFaultMessage() {
        super();
    }
    
    public ICwsTransactionProcessingAdjustCWSInvalidOperationFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICwsTransactionProcessingAdjustCWSInvalidOperationFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICwsTransactionProcessingAdjustCWSInvalidOperationFaultFaultFaultMessage(String message, com.evosnap.schemas.cws.v2_0.transactions.faults.CWSInvalidOperationFault cwsInvalidOperationFault) {
        super(message);
        this.cwsInvalidOperationFault = cwsInvalidOperationFault;
    }

    public ICwsTransactionProcessingAdjustCWSInvalidOperationFaultFaultFaultMessage(String message, com.evosnap.schemas.cws.v2_0.transactions.faults.CWSInvalidOperationFault cwsInvalidOperationFault, Throwable cause) {
        super(message, cause);
        this.cwsInvalidOperationFault = cwsInvalidOperationFault;
    }

    public com.evosnap.schemas.cws.v2_0.transactions.faults.CWSInvalidOperationFault getFaultInfo() {
        return this.cwsInvalidOperationFault;
    }
}