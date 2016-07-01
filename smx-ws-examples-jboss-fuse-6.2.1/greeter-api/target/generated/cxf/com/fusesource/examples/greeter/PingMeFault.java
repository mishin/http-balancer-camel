
package com.fusesource.examples.greeter;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.0.4.redhat-621084
 * 2016-06-29T14:57:14.188+04:00
 * Generated source version: 3.0.4.redhat-621084
 */

@WebFault(name = "faultDetail", targetNamespace = "http://examples.fusesource.com/greeter/model")
public class PingMeFault extends Exception {
    
    private com.fusesource.examples.greeter.model.FaultDetail faultDetail;

    public PingMeFault() {
        super();
    }
    
    public PingMeFault(String message) {
        super(message);
    }
    
    public PingMeFault(String message, Throwable cause) {
        super(message, cause);
    }

    public PingMeFault(String message, com.fusesource.examples.greeter.model.FaultDetail faultDetail) {
        super(message);
        this.faultDetail = faultDetail;
    }

    public PingMeFault(String message, com.fusesource.examples.greeter.model.FaultDetail faultDetail, Throwable cause) {
        super(message, cause);
        this.faultDetail = faultDetail;
    }

    public com.fusesource.examples.greeter.model.FaultDetail getFaultInfo() {
        return this.faultDetail;
    }
}
