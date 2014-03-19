
package com.evosnap.schemas.cws.v2_0.transactionprocessing;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.7
 * 2013-11-22T08:57:22.930-07:00
 * Generated source version: 2.7.7
 */

@WebFault(name = "CWSTransactionAlreadySettledFault", targetNamespace = "http://schemas.evosnap.com/CWS/v2.0/Transactions/Faults")
public class ICwsTransactionProcessingCaptureSelectiveCWSTransactionAlreadySettledFaultFaultFaultMessage extends Exception {
    
    private com.evosnap.schemas.cws.v2_0.transactions.faults.CWSTransactionAlreadySettledFault cwsTransactionAlreadySettledFault;

    public ICwsTransactionProcessingCaptureSelectiveCWSTransactionAlreadySettledFaultFaultFaultMessage() {
        super();
    }
    
    public ICwsTransactionProcessingCaptureSelectiveCWSTransactionAlreadySettledFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICwsTransactionProcessingCaptureSelectiveCWSTransactionAlreadySettledFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICwsTransactionProcessingCaptureSelectiveCWSTransactionAlreadySettledFaultFaultFaultMessage(String message, com.evosnap.schemas.cws.v2_0.transactions.faults.CWSTransactionAlreadySettledFault cwsTransactionAlreadySettledFault) {
        super(message);
        this.cwsTransactionAlreadySettledFault = cwsTransactionAlreadySettledFault;
    }

    public ICwsTransactionProcessingCaptureSelectiveCWSTransactionAlreadySettledFaultFaultFaultMessage(String message, com.evosnap.schemas.cws.v2_0.transactions.faults.CWSTransactionAlreadySettledFault cwsTransactionAlreadySettledFault, Throwable cause) {
        super(message, cause);
        this.cwsTransactionAlreadySettledFault = cwsTransactionAlreadySettledFault;
    }

    public com.evosnap.schemas.cws.v2_0.transactions.faults.CWSTransactionAlreadySettledFault getFaultInfo() {
        return this.cwsTransactionAlreadySettledFault;
    }
}
