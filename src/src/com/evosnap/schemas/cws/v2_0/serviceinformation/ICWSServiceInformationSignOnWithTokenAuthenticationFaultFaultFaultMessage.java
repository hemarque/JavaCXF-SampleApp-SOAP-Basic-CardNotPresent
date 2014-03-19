
package com.evosnap.schemas.cws.v2_0.serviceinformation;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.7
 * 2013-11-21T11:20:06.522-07:00
 * Generated source version: 2.7.7
 */

@WebFault(name = "AuthenticationFault", targetNamespace = "http://schemas.evosnap.com/Identity/1.0/")
public class ICWSServiceInformationSignOnWithTokenAuthenticationFaultFaultFaultMessage extends Exception {
    
    private com.evosnap.schemas.identity._1.AuthenticationFault authenticationFault;

    public ICWSServiceInformationSignOnWithTokenAuthenticationFaultFaultFaultMessage() {
        super();
    }
    
    public ICWSServiceInformationSignOnWithTokenAuthenticationFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICWSServiceInformationSignOnWithTokenAuthenticationFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICWSServiceInformationSignOnWithTokenAuthenticationFaultFaultFaultMessage(String message, com.evosnap.schemas.identity._1.AuthenticationFault authenticationFault) {
        super(message);
        this.authenticationFault = authenticationFault;
    }

    public ICWSServiceInformationSignOnWithTokenAuthenticationFaultFaultFaultMessage(String message, com.evosnap.schemas.identity._1.AuthenticationFault authenticationFault, Throwable cause) {
        super(message, cause);
        this.authenticationFault = authenticationFault;
    }

    public com.evosnap.schemas.identity._1.AuthenticationFault getFaultInfo() {
        return this.authenticationFault;
    }
}
