
package com.evosnap.schemas.cws.v2_0.dataservices.tms;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.7
 * 2013-11-22T08:24:52.584-07:00
 * Generated source version: 2.7.7
 */

@WebFault(name = "TMSValidationResultFault", targetNamespace = "http://schemas.evosnap.com/CWS/v2.0/DataServices/TMS/Fault")
public class ITMSOperationsQueryRejectedSummaryTMSValidationResultFaultFaultFaultMessage extends Exception {
    
    private com.evosnap.schemas.cws.v2_0.dataservices.tms.fault.TMSValidationResultFault tmsValidationResultFault;

    public ITMSOperationsQueryRejectedSummaryTMSValidationResultFaultFaultFaultMessage() {
        super();
    }
    
    public ITMSOperationsQueryRejectedSummaryTMSValidationResultFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ITMSOperationsQueryRejectedSummaryTMSValidationResultFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ITMSOperationsQueryRejectedSummaryTMSValidationResultFaultFaultFaultMessage(String message, com.evosnap.schemas.cws.v2_0.dataservices.tms.fault.TMSValidationResultFault tmsValidationResultFault) {
        super(message);
        this.tmsValidationResultFault = tmsValidationResultFault;
    }

    public ITMSOperationsQueryRejectedSummaryTMSValidationResultFaultFaultFaultMessage(String message, com.evosnap.schemas.cws.v2_0.dataservices.tms.fault.TMSValidationResultFault tmsValidationResultFault, Throwable cause) {
        super(message, cause);
        this.tmsValidationResultFault = tmsValidationResultFault;
    }

    public com.evosnap.schemas.cws.v2_0.dataservices.tms.fault.TMSValidationResultFault getFaultInfo() {
        return this.tmsValidationResultFault;
    }
}