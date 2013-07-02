//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-661 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.27 at 04:06:26 PM PDT 
//


package ebay.apis.eblbasecomponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShippingCostPaidByOptionsCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ShippingCostPaidByOptionsCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Buyer"/>
 *     &lt;enumeration value="Seller"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ShippingCostPaidByOptionsCodeType")
@XmlEnum
public enum ShippingCostPaidByOptionsCodeType {


    /**
     * 
     * 						Buyer pays return shipping cost.
     * 					
     * 
     */
    @XmlEnumValue("Buyer")
    BUYER("Buyer"),

    /**
     * 
     * 						Seller pays return shipping cost.
     * 					
     * 
     */
    @XmlEnumValue("Seller")
    SELLER("Seller"),

    /**
     * 
     * 						(out) Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    ShippingCostPaidByOptionsCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ShippingCostPaidByOptionsCodeType fromValue(String v) {
        for (ShippingCostPaidByOptionsCodeType c: ShippingCostPaidByOptionsCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}