
package com.evosnap.schemas.cws.v2_0.dataservices.tms;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.7
 * 2013-11-22T08:24:52.254-07:00
 * Generated source version: 2.7.7
 */

@WebFault(name = "ExpiredTokenFault", targetNamespace = "http://schemas.evosnap.com/Identity/1.0/")
public class ITMSOperationsQueryTransactionFamiliesExpiredTokenFaultFaultFaultMessage extends Exception {
    
    private com.evosnap.schemas.identity._1.ExpiredTokenFault expiredTokenFault;

    public ITMSOperationsQueryTransactionFamiliesExpiredTokenFaultFaultFaultMessage() {
        super();
    }
    
    public ITMSOperationsQueryTransactionFamiliesExpiredTokenFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ITMSOperationsQueryTransactionFamiliesExpiredTokenFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ITMSOperationsQueryTransactionFamiliesExpiredTokenFaultFaultFaultMessage(String message, com.evosnap.schemas.identity._1.ExpiredTokenFault expiredTokenFault) {
        super(message);
        this.expiredTokenFault = expiredTokenFault;
    }

    public ITMSOperationsQueryTransactionFamiliesExpiredTokenFaultFaultFaultMessage(String message, com.evosnap.schemas.identity._1.ExpiredTokenFault expiredTokenFault, Throwable cause) {
        super(message, cause);
        this.expiredTokenFault = expiredTokenFault;
    }

    public com.evosnap.schemas.identity._1.ExpiredTokenFault getFaultInfo() {
        return this.expiredTokenFault;
    }
}
