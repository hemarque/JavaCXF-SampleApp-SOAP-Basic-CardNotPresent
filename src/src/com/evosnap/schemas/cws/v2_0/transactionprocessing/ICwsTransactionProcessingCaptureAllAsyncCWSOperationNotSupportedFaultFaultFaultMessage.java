
package com.evosnap.schemas.cws.v2_0.transactionprocessing;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.7
 * 2013-11-22T08:57:23.486-07:00
 * Generated source version: 2.7.7
 */

@WebFault(name = "CWSOperationNotSupportedFault", targetNamespace = "http://schemas.evosnap.com/CWS/v2.0/Transactions/Faults")
public class ICwsTransactionProcessingCaptureAllAsyncCWSOperationNotSupportedFaultFaultFaultMessage extends Exception {
    
    private com.evosnap.schemas.cws.v2_0.transactions.faults.CWSOperationNotSupportedFault cwsOperationNotSupportedFault;

    public ICwsTransactionProcessingCaptureAllAsyncCWSOperationNotSupportedFaultFaultFaultMessage() {
        super();
    }
    
    public ICwsTransactionProcessingCaptureAllAsyncCWSOperationNotSupportedFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICwsTransactionProcessingCaptureAllAsyncCWSOperationNotSupportedFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICwsTransactionProcessingCaptureAllAsyncCWSOperationNotSupportedFaultFaultFaultMessage(String message, com.evosnap.schemas.cws.v2_0.transactions.faults.CWSOperationNotSupportedFault cwsOperationNotSupportedFault) {
        super(message);
        this.cwsOperationNotSupportedFault = cwsOperationNotSupportedFault;
    }

    public ICwsTransactionProcessingCaptureAllAsyncCWSOperationNotSupportedFaultFaultFaultMessage(String message, com.evosnap.schemas.cws.v2_0.transactions.faults.CWSOperationNotSupportedFault cwsOperationNotSupportedFault, Throwable cause) {
        super(message, cause);
        this.cwsOperationNotSupportedFault = cwsOperationNotSupportedFault;
    }

    public com.evosnap.schemas.cws.v2_0.transactions.faults.CWSOperationNotSupportedFault getFaultInfo() {
        return this.cwsOperationNotSupportedFault;
    }
}
