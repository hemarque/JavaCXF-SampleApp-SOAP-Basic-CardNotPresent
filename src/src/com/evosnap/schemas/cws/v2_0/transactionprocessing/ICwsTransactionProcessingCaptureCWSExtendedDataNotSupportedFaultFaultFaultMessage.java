
package com.evosnap.schemas.cws.v2_0.transactionprocessing;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.7
 * 2013-11-22T08:57:22.896-07:00
 * Generated source version: 2.7.7
 */

@WebFault(name = "CWSExtendedDataNotSupportedFault", targetNamespace = "http://schemas.evosnap.com/CWS/v2.0/Transactions/Faults")
public class ICwsTransactionProcessingCaptureCWSExtendedDataNotSupportedFaultFaultFaultMessage extends Exception {
    
    private com.evosnap.schemas.cws.v2_0.transactions.faults.CWSExtendedDataNotSupportedFault cwsExtendedDataNotSupportedFault;

    public ICwsTransactionProcessingCaptureCWSExtendedDataNotSupportedFaultFaultFaultMessage() {
        super();
    }
    
    public ICwsTransactionProcessingCaptureCWSExtendedDataNotSupportedFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICwsTransactionProcessingCaptureCWSExtendedDataNotSupportedFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICwsTransactionProcessingCaptureCWSExtendedDataNotSupportedFaultFaultFaultMessage(String message, com.evosnap.schemas.cws.v2_0.transactions.faults.CWSExtendedDataNotSupportedFault cwsExtendedDataNotSupportedFault) {
        super(message);
        this.cwsExtendedDataNotSupportedFault = cwsExtendedDataNotSupportedFault;
    }

    public ICwsTransactionProcessingCaptureCWSExtendedDataNotSupportedFaultFaultFaultMessage(String message, com.evosnap.schemas.cws.v2_0.transactions.faults.CWSExtendedDataNotSupportedFault cwsExtendedDataNotSupportedFault, Throwable cause) {
        super(message, cause);
        this.cwsExtendedDataNotSupportedFault = cwsExtendedDataNotSupportedFault;
    }

    public com.evosnap.schemas.cws.v2_0.transactions.faults.CWSExtendedDataNotSupportedFault getFaultInfo() {
        return this.cwsExtendedDataNotSupportedFault;
    }
}
