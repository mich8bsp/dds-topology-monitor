
/*
WARNING: THIS FILE IS AUTO-GENERATED. DO NOT MODIFY.

This file was generated from .idl using "rtiddsgen".
The rtiddsgen tool is part of the RTI Connext distribution.
For more information, type 'rtiddsgen -help' at a command shell
or consult the RTI Connext manual.
*/

package DDSMonitoring;

import com.rti.dds.typecode.*;

public class  AvailabilityQosPolicyTypeCode {
    public static final TypeCode VALUE = getTypeCode();

    private static TypeCode getTypeCode() {
        TypeCode tc = null;
        int __i=0;
        StructMember sm[]=new StructMember[4];

        sm[__i]=new  StructMember("enable_required_subscriptions", false, (short)-1,  false,(TypeCode) TypeCode.TC_BOOLEAN,0 , false);__i++;
        sm[__i]=new  StructMember("max_data_availability_waiting_time", false, (short)-1,  false,(TypeCode) DDSMonitoring.Duration_tTypeCode.VALUE,1 , false);__i++;
        sm[__i]=new  StructMember("max_endpoint_availability_waiting_time", false, (short)-1,  false,(TypeCode) DDSMonitoring.Duration_tTypeCode.VALUE,2 , false);__i++;
        sm[__i]=new  StructMember("required_matched_endpoint_groups", false, (short)-1,  false,(TypeCode) new TypeCode(256, DDSMonitoring.EndpointGroup_tTypeCode.VALUE),3 , false);__i++;

        tc = TypeCodeFactory.TheTypeCodeFactory.create_struct_tc("DDSMonitoring::AvailabilityQosPolicy",ExtensibilityKind.EXTENSIBLE_EXTENSIBILITY,  sm);        
        return tc;
    }
}
