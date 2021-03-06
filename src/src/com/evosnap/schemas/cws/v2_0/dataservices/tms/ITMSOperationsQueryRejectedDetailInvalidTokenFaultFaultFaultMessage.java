
package com.evosnap.schemas.cws.v2_0.dataservices.tms;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.7
 * 2013-11-22T08:24:52.453-07:00
 * Generated source version: 2.7.7
 */

@WebFault(name = "InvalidTokenFault", targetNamespace = "http://schemas.evosnap.com/Identity/1.0/")
public class ITMSOperationsQueryRejectedDetailInvalidTokenFaultFaultFaultMessage extends Exception {
    
    private com.evosnap.schemas.identity._1.InvalidTokenFault invalidTokenFault;

    public ITMSOperationsQueryRejectedDetailInvalidTokenFaultFaultFaultMessage() {
        super();
    }
    
    public ITMSOperationsQueryRejectedDetailInvalidTokenFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ITMSOperationsQueryRejectedDetailInvalidTokenFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ITMSOperationsQueryRejectedDetailInvalidTokenFaultFaultFaultMessage(String message, com.evosnap.schemas.identity._1.InvalidTokenFault invalidTokenFault) {
        super(message);
        this.invalidTokenFault = invalidTokenFault;
    }

    public ITMSOperationsQueryRejectedDetailInvalidTokenFaultFaultFaultMessage(String message, com.evosnap.schemas.identity._1.InvalidTokenFault invalidTokenFault, Throwable cause) {
        super(message, cause);
        this.invalidTokenFault = invalidTokenFault;
    }

    public com.evosnap.schemas.identity._1.InvalidTokenFault getFaultInfo() {
        return this.invalidTokenFault;
    }
}
