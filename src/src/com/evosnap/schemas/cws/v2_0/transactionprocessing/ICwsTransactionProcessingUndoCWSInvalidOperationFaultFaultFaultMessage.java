
package com.evosnap.schemas.cws.v2_0.transactionprocessing;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.7
 * 2013-11-22T08:57:23.388-07:00
 * Generated source version: 2.7.7
 */

@WebFault(name = "CWSInvalidOperationFault", targetNamespace = "http://schemas.evosnap.com/CWS/v2.0/Transactions/Faults")
public class ICwsTransactionProcessingUndoCWSInvalidOperationFaultFaultFaultMessage extends Exception {
    
    private com.evosnap.schemas.cws.v2_0.transactions.faults.CWSInvalidOperationFault cwsInvalidOperationFault;

    public ICwsTransactionProcessingUndoCWSInvalidOperationFaultFaultFaultMessage() {
        super();
    }
    
    public ICwsTransactionProcessingUndoCWSInvalidOperationFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICwsTransactionProcessingUndoCWSInvalidOperationFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICwsTransactionProcessingUndoCWSInvalidOperationFaultFaultFaultMessage(String message, com.evosnap.schemas.cws.v2_0.transactions.faults.CWSInvalidOperationFault cwsInvalidOperationFault) {
        super(message);
        this.cwsInvalidOperationFault = cwsInvalidOperationFault;
    }

    public ICwsTransactionProcessingUndoCWSInvalidOperationFaultFaultFaultMessage(String message, com.evosnap.schemas.cws.v2_0.transactions.faults.CWSInvalidOperationFault cwsInvalidOperationFault, Throwable cause) {
        super(message, cause);
        this.cwsInvalidOperationFault = cwsInvalidOperationFault;
    }

    public com.evosnap.schemas.cws.v2_0.transactions.faults.CWSInvalidOperationFault getFaultInfo() {
        return this.cwsInvalidOperationFault;
    }
}
