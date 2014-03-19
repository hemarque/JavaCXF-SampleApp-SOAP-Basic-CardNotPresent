
package com.evosnap.schemas.cws.v2_0.serviceinformation;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.7
 * 2013-11-21T11:20:06.354-07:00
 * Generated source version: 2.7.7
 */

@WebFault(name = "PasswordExpiredFault", targetNamespace = "http://schemas.evosnap.com/Identity/1.0/")
public class ICWSServiceInformationSignOnWithUsernamePasswordForServiceKeyPasswordExpiredFaultFaultFaultMessage extends Exception {
    
    private com.evosnap.schemas.identity._1.PasswordExpiredFault passwordExpiredFault;

    public ICWSServiceInformationSignOnWithUsernamePasswordForServiceKeyPasswordExpiredFaultFaultFaultMessage() {
        super();
    }
    
    public ICWSServiceInformationSignOnWithUsernamePasswordForServiceKeyPasswordExpiredFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICWSServiceInformationSignOnWithUsernamePasswordForServiceKeyPasswordExpiredFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICWSServiceInformationSignOnWithUsernamePasswordForServiceKeyPasswordExpiredFaultFaultFaultMessage(String message, com.evosnap.schemas.identity._1.PasswordExpiredFault passwordExpiredFault) {
        super(message);
        this.passwordExpiredFault = passwordExpiredFault;
    }

    public ICWSServiceInformationSignOnWithUsernamePasswordForServiceKeyPasswordExpiredFaultFaultFaultMessage(String message, com.evosnap.schemas.identity._1.PasswordExpiredFault passwordExpiredFault, Throwable cause) {
        super(message, cause);
        this.passwordExpiredFault = passwordExpiredFault;
    }

    public com.evosnap.schemas.identity._1.PasswordExpiredFault getFaultInfo() {
        return this.passwordExpiredFault;
    }
}
