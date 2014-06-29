/**
 * GetSportsTypeResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.hari.interviewprep.webserviceexample2;

public class GetSportsTypeResponse  implements java.io.Serializable {
    private java.lang.Object[] getSportsTypeReturn;

    public GetSportsTypeResponse() {
    }

    public GetSportsTypeResponse(
           java.lang.Object[] getSportsTypeReturn) {
           this.getSportsTypeReturn = getSportsTypeReturn;
    }


    /**
     * Gets the getSportsTypeReturn value for this GetSportsTypeResponse.
     * 
     * @return getSportsTypeReturn
     */
    public java.lang.Object[] getGetSportsTypeReturn() {
        return getSportsTypeReturn;
    }


    /**
     * Sets the getSportsTypeReturn value for this GetSportsTypeResponse.
     * 
     * @param getSportsTypeReturn
     */
    public void setGetSportsTypeReturn(java.lang.Object[] getSportsTypeReturn) {
        this.getSportsTypeReturn = getSportsTypeReturn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetSportsTypeResponse)) return false;
        GetSportsTypeResponse other = (GetSportsTypeResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getSportsTypeReturn==null && other.getGetSportsTypeReturn()==null) || 
             (this.getSportsTypeReturn!=null &&
              java.util.Arrays.equals(this.getSportsTypeReturn, other.getGetSportsTypeReturn())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getGetSportsTypeReturn() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGetSportsTypeReturn());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGetSportsTypeReturn(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetSportsTypeResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webserviceexample2.interviewprep.hari.com", ">getSportsTypeResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getSportsTypeReturn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webserviceexample2.interviewprep.hari.com", "getSportsTypeReturn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://webserviceexample2.interviewprep.hari.com", "item"));
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
