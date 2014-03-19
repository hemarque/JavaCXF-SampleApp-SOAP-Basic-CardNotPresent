
package com.evosnap.schemas.cws.v2_0.transactionprocessing;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.7
 * 2013-11-22T08:57:23.397-07:00
 * Generated source version: 2.7.7
 */

@WebFault(name = "AuthenticationFault", targetNamespace = "http://schemas.evosnap.com/Identity/1.0/")
public class ICwsTransactionProcessingUndoAuthenticationFaultFaultFaultMessage extends Exception {
    
    private com.evosnap.schemas.identity._1.AuthenticationFault authenticationFault;

    public ICwsTransactionProcessingUndoAuthenticationFaultFaultFaultMessage() {
        super();
    }
    
    public ICwsTransactionProcessingUndoAuthenticationFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICwsTransactionProcessingUndoAuthenticationFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICwsTransactionProcessingUndoAuthenticationFaultFaultFaultMessage(String message, com.evosnap.schemas.identity._1.AuthenticationFault authenticationFault) {
        super(message);
        this.authenticationFault = authenticationFault;
    }

    public ICwsTransactionProcessingUndoAuthenticationFaultFaultFaultMessage(String message, com.evosnap.schemas.identity._1.AuthenticationFault authenticationFault, Throwable cause) {
        super(message, cause);
        this.authenticationFault = authenticationFault;
    }

    public com.evosnap.schemas.identity._1.AuthenticationFault getFaultInfo() {
        return this.authenticationFault;
    }
}
