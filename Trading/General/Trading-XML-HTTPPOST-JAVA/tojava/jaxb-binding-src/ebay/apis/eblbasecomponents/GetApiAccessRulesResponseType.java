//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-661 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.27 at 04:06:26 PM PDT 
//


package ebay.apis.eblbasecomponents;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Responds to a call to GetApiAccessRules.
 * 			
 * 
 * <p>Java class for GetApiAccessRulesResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetApiAccessRulesResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="ApiAccessRule" type="{urn:ebay:apis:eBLBaseComponents}ApiAccessRuleType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetApiAccessRulesResponseType", propOrder = {
    "apiAccessRule"
})
public class GetApiAccessRulesResponseType
    extends AbstractResponseType
{

    @XmlElement(name = "ApiAccessRule")
    protected List<ApiAccessRuleType> apiAccessRule;

    /**
     * Gets the value of the apiAccessRule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the apiAccessRule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApiAccessRule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ApiAccessRuleType }
     * 
     * 
     */
    public List<ApiAccessRuleType> getApiAccessRule() {
        if (apiAccessRule == null) {
            apiAccessRule = new ArrayList<ApiAccessRuleType>();
        }
        return this.apiAccessRule;
    }

}
