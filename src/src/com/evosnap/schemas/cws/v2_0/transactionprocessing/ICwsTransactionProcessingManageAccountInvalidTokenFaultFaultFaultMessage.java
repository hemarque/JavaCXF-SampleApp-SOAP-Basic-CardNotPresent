
package com.evosnap.schemas.cws.v2_0.transactionprocessing;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.7
 * 2013-11-22T08:57:22.593-07:00
 * Generated source version: 2.7.7
 */

@WebFault(name = "InvalidTokenFault", targetNamespace = "http://schemas.evosnap.com/Identity/1.0/")
public class ICwsTransactionProcessingManageAccountInvalidTokenFaultFaultFaultMessage extends Exception {
    
    private com.evosnap.schemas.identity._1.InvalidTokenFault invalidTokenFault;

    public ICwsTransactionProcessingManageAccountInvalidTokenFaultFaultFaultMessage() {
        super();
    }
    
    public ICwsTransactionProcessingManageAccountInvalidTokenFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICwsTransactionProcessingManageAccountInvalidTokenFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICwsTransactionProcessingManageAccountInvalidTokenFaultFaultFaultMessage(String message, com.evosnap.schemas.identity._1.InvalidTokenFault invalidTokenFault) {
        super(message);
        this.invalidTokenFault = invalidTokenFault;
    }

    public ICwsTransactionProcessingManageAccountInvalidTokenFaultFaultFaultMessage(String message, com.evosnap.schemas.identity._1.InvalidTokenFault invalidTokenFault, Throwable cause) {
        super(message, cause);
        this.invalidTokenFault = invalidTokenFault;
    }

    public com.evosnap.schemas.identity._1.InvalidTokenFault getFaultInfo() {
        return this.invalidTokenFault;
    }
}
