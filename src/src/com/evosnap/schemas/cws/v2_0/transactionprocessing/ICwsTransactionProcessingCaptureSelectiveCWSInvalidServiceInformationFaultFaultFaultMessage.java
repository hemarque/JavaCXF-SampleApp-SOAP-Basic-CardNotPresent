
package com.evosnap.schemas.cws.v2_0.transactionprocessing;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.7
 * 2013-11-22T08:57:22.985-07:00
 * Generated source version: 2.7.7
 */

@WebFault(name = "CWSInvalidServiceInformationFault", targetNamespace = "http://schemas.evosnap.com/CWS/v2.0/Transactions/Faults")
public class ICwsTransactionProcessingCaptureSelectiveCWSInvalidServiceInformationFaultFaultFaultMessage extends Exception {
    
    private com.evosnap.schemas.cws.v2_0.transactions.faults.CWSInvalidServiceInformationFault cwsInvalidServiceInformationFault;

    public ICwsTransactionProcessingCaptureSelectiveCWSInvalidServiceInformationFaultFaultFaultMessage() {
        super();
    }
    
    public ICwsTransactionProcessingCaptureSelectiveCWSInvalidServiceInformationFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICwsTransactionProcessingCaptureSelectiveCWSInvalidServiceInformationFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICwsTransactionProcessingCaptureSelectiveCWSInvalidServiceInformationFaultFaultFaultMessage(String message, com.evosnap.schemas.cws.v2_0.transactions.faults.CWSInvalidServiceInformationFault cwsInvalidServiceInformationFault) {
        super(message);
        this.cwsInvalidServiceInformationFault = cwsInvalidServiceInformationFault;
    }

    public ICwsTransactionProcessingCaptureSelectiveCWSInvalidServiceInformationFaultFaultFaultMessage(String message, com.evosnap.schemas.cws.v2_0.transactions.faults.CWSInvalidServiceInformationFault cwsInvalidServiceInformationFault, Throwable cause) {
        super(message, cause);
        this.cwsInvalidServiceInformationFault = cwsInvalidServiceInformationFault;
    }

    public com.evosnap.schemas.cws.v2_0.transactions.faults.CWSInvalidServiceInformationFault getFaultInfo() {
        return this.cwsInvalidServiceInformationFault;
    }
}
