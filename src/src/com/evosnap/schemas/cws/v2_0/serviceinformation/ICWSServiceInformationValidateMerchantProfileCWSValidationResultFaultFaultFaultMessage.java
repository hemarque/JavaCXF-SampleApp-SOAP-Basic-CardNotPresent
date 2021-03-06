
package com.evosnap.schemas.cws.v2_0.serviceinformation;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.7
 * 2013-11-21T11:20:06.831-07:00
 * Generated source version: 2.7.7
 */

@WebFault(name = "CWSValidationResultFault", targetNamespace = "http://schemas.evosnap.com/CWS/v2.0/ServiceInformation/Faults")
public class ICWSServiceInformationValidateMerchantProfileCWSValidationResultFaultFaultFaultMessage extends Exception {
    
    private com.evosnap.schemas.cws.v2_0.serviceinformation.faults.CWSValidationResultFault cwsValidationResultFault;

    public ICWSServiceInformationValidateMerchantProfileCWSValidationResultFaultFaultFaultMessage() {
        super();
    }
    
    public ICWSServiceInformationValidateMerchantProfileCWSValidationResultFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICWSServiceInformationValidateMerchantProfileCWSValidationResultFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICWSServiceInformationValidateMerchantProfileCWSValidationResultFaultFaultFaultMessage(String message, com.evosnap.schemas.cws.v2_0.serviceinformation.faults.CWSValidationResultFault cwsValidationResultFault) {
        super(message);
        this.cwsValidationResultFault = cwsValidationResultFault;
    }

    public ICWSServiceInformationValidateMerchantProfileCWSValidationResultFaultFaultFaultMessage(String message, com.evosnap.schemas.cws.v2_0.serviceinformation.faults.CWSValidationResultFault cwsValidationResultFault, Throwable cause) {
        super(message, cause);
        this.cwsValidationResultFault = cwsValidationResultFault;
    }

    public com.evosnap.schemas.cws.v2_0.serviceinformation.faults.CWSValidationResultFault getFaultInfo() {
        return this.cwsValidationResultFault;
    }
}
