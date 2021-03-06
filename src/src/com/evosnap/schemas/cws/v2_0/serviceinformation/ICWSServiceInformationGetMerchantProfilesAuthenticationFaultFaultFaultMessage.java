
package com.evosnap.schemas.cws.v2_0.serviceinformation;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.7
 * 2013-11-21T11:20:06.862-07:00
 * Generated source version: 2.7.7
 */

@WebFault(name = "AuthenticationFault", targetNamespace = "http://schemas.evosnap.com/Identity/1.0/")
public class ICWSServiceInformationGetMerchantProfilesAuthenticationFaultFaultFaultMessage extends Exception {
    
    private com.evosnap.schemas.identity._1.AuthenticationFault authenticationFault;

    public ICWSServiceInformationGetMerchantProfilesAuthenticationFaultFaultFaultMessage() {
        super();
    }
    
    public ICWSServiceInformationGetMerchantProfilesAuthenticationFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICWSServiceInformationGetMerchantProfilesAuthenticationFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICWSServiceInformationGetMerchantProfilesAuthenticationFaultFaultFaultMessage(String message, com.evosnap.schemas.identity._1.AuthenticationFault authenticationFault) {
        super(message);
        this.authenticationFault = authenticationFault;
    }

    public ICWSServiceInformationGetMerchantProfilesAuthenticationFaultFaultFaultMessage(String message, com.evosnap.schemas.identity._1.AuthenticationFault authenticationFault, Throwable cause) {
        super(message, cause);
        this.authenticationFault = authenticationFault;
    }

    public com.evosnap.schemas.identity._1.AuthenticationFault getFaultInfo() {
        return this.authenticationFault;
    }
}
