
package com.evosnap.schemas.cws.v2_0.transactionprocessing;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.7
 * 2013-11-22T08:57:23.061-07:00
 * Generated source version: 2.7.7
 */

@WebFault(name = "CWSConnectionFault", targetNamespace = "http://schemas.evosnap.com/CWS/v2.0/Transactions/Faults")
public class ICwsTransactionProcessingCaptureAllCWSConnectionFaultFaultFaultMessage extends Exception {
    
    private com.evosnap.schemas.cws.v2_0.transactions.faults.CWSConnectionFault cwsConnectionFault;

    public ICwsTransactionProcessingCaptureAllCWSConnectionFaultFaultFaultMessage() {
        super();
    }
    
    public ICwsTransactionProcessingCaptureAllCWSConnectionFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICwsTransactionProcessingCaptureAllCWSConnectionFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICwsTransactionProcessingCaptureAllCWSConnectionFaultFaultFaultMessage(String message, com.evosnap.schemas.cws.v2_0.transactions.faults.CWSConnectionFault cwsConnectionFault) {
        super(message);
        this.cwsConnectionFault = cwsConnectionFault;
    }

    public ICwsTransactionProcessingCaptureAllCWSConnectionFaultFaultFaultMessage(String message, com.evosnap.schemas.cws.v2_0.transactions.faults.CWSConnectionFault cwsConnectionFault, Throwable cause) {
        super(message, cause);
        this.cwsConnectionFault = cwsConnectionFault;
    }

    public com.evosnap.schemas.cws.v2_0.transactions.faults.CWSConnectionFault getFaultInfo() {
        return this.cwsConnectionFault;
    }
}