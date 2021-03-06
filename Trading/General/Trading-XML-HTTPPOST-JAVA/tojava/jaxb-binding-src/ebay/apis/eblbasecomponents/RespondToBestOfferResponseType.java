//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-661 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.27 at 04:06:26 PM PDT 
//


package ebay.apis.eblbasecomponents;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Contains a list of BestOffers that were either accepted or declined.
 * 			
 * 
 * <p>Java class for RespondToBestOfferResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RespondToBestOfferResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="RespondToBestOffer" type="{urn:ebay:apis:eBLBaseComponents}BestOfferArrayType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RespondToBestOfferResponseType", propOrder = {
    "respondToBestOffer"
})
public class RespondToBestOfferResponseType
    extends AbstractResponseType
{

    @XmlElement(name = "RespondToBestOffer")
    protected BestOfferArrayType respondToBestOffer;

    /**
     * Gets the value of the respondToBestOffer property.
     * 
     * @return
     *     possible object is
     *     {@link BestOfferArrayType }
     *     
     */
    public BestOfferArrayType getRespondToBestOffer() {
        return respondToBestOffer;
    }

    /**
     * Sets the value of the respondToBestOffer property.
     * 
     * @param value
     *     allowed object is
     *     {@link BestOfferArrayType }
     *     
     */
    public void setRespondToBestOffer(BestOfferArrayType value) {
        this.respondToBestOffer = value;
    }

}
