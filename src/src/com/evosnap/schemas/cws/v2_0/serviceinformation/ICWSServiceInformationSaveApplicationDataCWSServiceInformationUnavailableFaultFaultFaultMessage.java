
package com.evosnap.schemas.cws.v2_0.serviceinformation;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.7
 * 2013-11-21T11:20:06.643-07:00
 * Generated source version: 2.7.7
 */

@WebFault(name = "CWSServiceInformationUnavailableFault", targetNamespace = "http://schemas.evosnap.com/CWS/v2.0/ServiceInformation/Faults")
public class ICWSServiceInformationSaveApplicationDataCWSServiceInformationUnavailableFaultFaultFaultMessage extends Exception {
    
    private com.evosnap.schemas.cws.v2_0.serviceinformation.faults.CWSServiceInformationUnavailableFault cwsServiceInformationUnavailableFault;

    public ICWSServiceInformationSaveApplicationDataCWSServiceInformationUnavailableFaultFaultFaultMessage() {
        super();
    }
    
    public ICWSServiceInformationSaveApplicationDataCWSServiceInformationUnavailableFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICWSServiceInformationSaveApplicationDataCWSServiceInformationUnavailableFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICWSServiceInformationSaveApplicationDataCWSServiceInformationUnavailableFaultFaultFaultMessage(String message, com.evosnap.schemas.cws.v2_0.serviceinformation.faults.CWSServiceInformationUnavailableFault cwsServiceInformationUnavailableFault) {
        super(message);
        this.cwsServiceInformationUnavailableFault = cwsServiceInformationUnavailableFault;
    }

    public ICWSServiceInformationSaveApplicationDataCWSServiceInformationUnavailableFaultFaultFaultMessage(String message, com.evosnap.schemas.cws.v2_0.serviceinformation.faults.CWSServiceInformationUnavailableFault cwsServiceInformationUnavailableFault, Throwable cause) {
        super(message, cause);
        this.cwsServiceInformationUnavailableFault = cwsServiceInformationUnavailableFault;
    }

    public com.evosnap.schemas.cws.v2_0.serviceinformation.faults.CWSServiceInformationUnavailableFault getFaultInfo() {
        return this.cwsServiceInformationUnavailableFault;
    }
}
