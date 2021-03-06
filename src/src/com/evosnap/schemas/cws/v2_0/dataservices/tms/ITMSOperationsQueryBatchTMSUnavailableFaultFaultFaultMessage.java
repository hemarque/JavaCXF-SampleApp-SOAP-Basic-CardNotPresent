
package com.evosnap.schemas.cws.v2_0.dataservices.tms;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.7
 * 2013-11-22T08:24:52.332-07:00
 * Generated source version: 2.7.7
 */

@WebFault(name = "TMSUnavailableFault", targetNamespace = "http://schemas.evosnap.com/CWS/v2.0/DataServices/TMS/Faults")
public class ITMSOperationsQueryBatchTMSUnavailableFaultFaultFaultMessage extends Exception {
    
    private com.evosnap.schemas.cws.v2_0.dataservices.tms.faults.TMSUnavailableFault tmsUnavailableFault;

    public ITMSOperationsQueryBatchTMSUnavailableFaultFaultFaultMessage() {
        super();
    }
    
    public ITMSOperationsQueryBatchTMSUnavailableFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ITMSOperationsQueryBatchTMSUnavailableFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ITMSOperationsQueryBatchTMSUnavailableFaultFaultFaultMessage(String message, com.evosnap.schemas.cws.v2_0.dataservices.tms.faults.TMSUnavailableFault tmsUnavailableFault) {
        super(message);
        this.tmsUnavailableFault = tmsUnavailableFault;
    }

    public ITMSOperationsQueryBatchTMSUnavailableFaultFaultFaultMessage(String message, com.evosnap.schemas.cws.v2_0.dataservices.tms.faults.TMSUnavailableFault tmsUnavailableFault, Throwable cause) {
        super(message, cause);
        this.tmsUnavailableFault = tmsUnavailableFault;
    }

    public com.evosnap.schemas.cws.v2_0.dataservices.tms.faults.TMSUnavailableFault getFaultInfo() {
        return this.tmsUnavailableFault;
    }
}
