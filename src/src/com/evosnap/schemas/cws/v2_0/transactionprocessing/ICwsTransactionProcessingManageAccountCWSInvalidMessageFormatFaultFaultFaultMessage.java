
package com.evosnap.schemas.cws.v2_0.transactionprocessing;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.7
 * 2013-11-22T08:57:22.607-07:00
 * Generated source version: 2.7.7
 */

@WebFault(name = "CWSInvalidMessageFormatFault", targetNamespace = "http://schemas.evosnap.com/CWS/v2.0/Transactions/Faults")
public class ICwsTransactionProcessingManageAccountCWSInvalidMessageFormatFaultFaultFaultMessage extends Exception {
    
    private com.evosnap.schemas.cws.v2_0.transactions.faults.CWSInvalidMessageFormatFault cwsInvalidMessageFormatFault;

    public ICwsTransactionProcessingManageAccountCWSInvalidMessageFormatFaultFaultFaultMessage() {
        super();
    }
    
    public ICwsTransactionProcessingManageAccountCWSInvalidMessageFormatFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICwsTransactionProcessingManageAccountCWSInvalidMessageFormatFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICwsTransactionProcessingManageAccountCWSInvalidMessageFormatFaultFaultFaultMessage(String message, com.evosnap.schemas.cws.v2_0.transactions.faults.CWSInvalidMessageFormatFault cwsInvalidMessageFormatFault) {
        super(message);
        this.cwsInvalidMessageFormatFault = cwsInvalidMessageFormatFault;
    }

    public ICwsTransactionProcessingManageAccountCWSInvalidMessageFormatFaultFaultFaultMessage(String message, com.evosnap.schemas.cws.v2_0.transactions.faults.CWSInvalidMessageFormatFault cwsInvalidMessageFormatFault, Throwable cause) {
        super(message, cause);
        this.cwsInvalidMessageFormatFault = cwsInvalidMessageFormatFault;
    }

    public com.evosnap.schemas.cws.v2_0.transactions.faults.CWSInvalidMessageFormatFault getFaultInfo() {
        return this.cwsInvalidMessageFormatFault;
    }
}
