//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2022.06.20 às 03:10:31 PM IRKT 
//


package dev.smartdata.gar;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="STEAD" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="ID" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                       &lt;totalDigits value="19"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="OBJECTID" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                       &lt;totalDigits value="19"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="OBJECTGUID" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;length value="36"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="CHANGEID" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                       &lt;totalDigits value="19"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="NUMBER" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;minLength value="1"/>
 *                       &lt;maxLength value="250"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="OPERTYPEID" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;minLength value="1"/>
 *                       &lt;maxLength value="2"/>
 *                       &lt;pattern value="[0-9]{1,2}"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="PREVID">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                       &lt;totalDigits value="19"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="NEXTID">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                       &lt;totalDigits value="19"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="UPDATEDATE" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                 &lt;attribute name="STARTDATE" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                 &lt;attribute name="ENDDATE" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                 &lt;attribute name="ISACTUAL" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                       &lt;enumeration value="0"/>
 *                       &lt;enumeration value="1"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="ISACTIVE" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                       &lt;enumeration value="0"/>
 *                       &lt;enumeration value="1"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "stead"
})
@XmlRootElement(name = "STEADS")
public class STEADS {

    @XmlElement(name = "STEAD")
    protected List<STEADS.STEAD> stead;

    /**
     * Gets the value of the stead property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stead property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSTEAD().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link STEADS.STEAD }
     * 
     * 
     */
    public List<STEADS.STEAD> getSTEAD() {
        if (stead == null) {
            stead = new ArrayList<STEADS.STEAD>();
        }
        return this.stead;
    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="ID" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *             &lt;totalDigits value="19"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="OBJECTID" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *             &lt;totalDigits value="19"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="OBJECTGUID" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;length value="36"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="CHANGEID" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *             &lt;totalDigits value="19"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="NUMBER" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;minLength value="1"/>
     *             &lt;maxLength value="250"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="OPERTYPEID" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;minLength value="1"/>
     *             &lt;maxLength value="2"/>
     *             &lt;pattern value="[0-9]{1,2}"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="PREVID">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *             &lt;totalDigits value="19"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="NEXTID">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *             &lt;totalDigits value="19"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="UPDATEDATE" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
     *       &lt;attribute name="STARTDATE" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
     *       &lt;attribute name="ENDDATE" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
     *       &lt;attribute name="ISACTUAL" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *             &lt;enumeration value="0"/>
     *             &lt;enumeration value="1"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="ISACTIVE" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *             &lt;enumeration value="0"/>
     *             &lt;enumeration value="1"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class STEAD {

        @XmlAttribute(name = "ID", required = true)
        protected BigInteger id;
        @XmlAttribute(name = "OBJECTID", required = true)
        protected BigInteger objectid;
        @XmlAttribute(name = "OBJECTGUID", required = true)
        protected String objectguid;
        @XmlAttribute(name = "CHANGEID", required = true)
        protected BigInteger changeid;
        @XmlAttribute(name = "NUMBER", required = true)
        protected String number;
        @XmlAttribute(name = "OPERTYPEID", required = true)
        protected String opertypeid;
        @XmlAttribute(name = "PREVID")
        protected BigInteger previd;
        @XmlAttribute(name = "NEXTID")
        protected BigInteger nextid;
        @XmlAttribute(name = "UPDATEDATE", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar updatedate;
        @XmlAttribute(name = "STARTDATE", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar startdate;
        @XmlAttribute(name = "ENDDATE", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar enddate;
        @XmlAttribute(name = "ISACTUAL", required = true)
        protected BigInteger isactual;
        @XmlAttribute(name = "ISACTIVE", required = true)
        protected BigInteger isactive;

        /**
         * Obtém o valor da propriedade id.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getID() {
            return id;
        }

        /**
         * Define o valor da propriedade id.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setID(BigInteger value) {
            this.id = value;
        }

        /**
         * Obtém o valor da propriedade objectid.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getOBJECTID() {
            return objectid;
        }

        /**
         * Define o valor da propriedade objectid.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setOBJECTID(BigInteger value) {
            this.objectid = value;
        }

        /**
         * Obtém o valor da propriedade objectguid.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOBJECTGUID() {
            return objectguid;
        }

        /**
         * Define o valor da propriedade objectguid.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOBJECTGUID(String value) {
            this.objectguid = value;
        }

        /**
         * Obtém o valor da propriedade changeid.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getCHANGEID() {
            return changeid;
        }

        /**
         * Define o valor da propriedade changeid.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setCHANGEID(BigInteger value) {
            this.changeid = value;
        }

        /**
         * Obtém o valor da propriedade number.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNUMBER() {
            return number;
        }

        /**
         * Define o valor da propriedade number.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNUMBER(String value) {
            this.number = value;
        }

        /**
         * Obtém o valor da propriedade opertypeid.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOPERTYPEID() {
            return opertypeid;
        }

        /**
         * Define o valor da propriedade opertypeid.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOPERTYPEID(String value) {
            this.opertypeid = value;
        }

        /**
         * Obtém o valor da propriedade previd.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getPREVID() {
            return previd;
        }

        /**
         * Define o valor da propriedade previd.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setPREVID(BigInteger value) {
            this.previd = value;
        }

        /**
         * Obtém o valor da propriedade nextid.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getNEXTID() {
            return nextid;
        }

        /**
         * Define o valor da propriedade nextid.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setNEXTID(BigInteger value) {
            this.nextid = value;
        }

        /**
         * Obtém o valor da propriedade updatedate.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getUPDATEDATE() {
            return updatedate;
        }

        /**
         * Define o valor da propriedade updatedate.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setUPDATEDATE(XMLGregorianCalendar value) {
            this.updatedate = value;
        }

        /**
         * Obtém o valor da propriedade startdate.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getSTARTDATE() {
            return startdate;
        }

        /**
         * Define o valor da propriedade startdate.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setSTARTDATE(XMLGregorianCalendar value) {
            this.startdate = value;
        }

        /**
         * Obtém o valor da propriedade enddate.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getENDDATE() {
            return enddate;
        }

        /**
         * Define o valor da propriedade enddate.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setENDDATE(XMLGregorianCalendar value) {
            this.enddate = value;
        }

        /**
         * Obtém o valor da propriedade isactual.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getISACTUAL() {
            return isactual;
        }

        /**
         * Define o valor da propriedade isactual.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setISACTUAL(BigInteger value) {
            this.isactual = value;
        }

        /**
         * Obtém o valor da propriedade isactive.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getISACTIVE() {
            return isactive;
        }

        /**
         * Define o valor da propriedade isactive.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setISACTIVE(BigInteger value) {
            this.isactive = value;
        }

    }

}
