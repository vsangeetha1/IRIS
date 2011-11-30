//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b26-ea3 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.06.20 at 02:21:10 PM IST 
//

package com.temenos.messagingLayer.pojo;

import java.math.BigInteger;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * 
 * OFSML 1.3+ model group. The corresponding OFSML 1.1 & 1.2 model group definitions are no longer supported.
 * The main header of any OFSML instance document, used for all service requests and responses. Note no grammar rules
 * enforce
 * the usage of this header for requests and responses. Only the FIRST FOUR elements are supported for a request;
 * unrequired information
 * supplied on a request (requestTimeStamp, responseTimeStamp, requestChannel, userName, company) will be disposed. On a
 * service
 * request, a nil element may be sent denoting a request by the caller to generate all possible header information on
 * the response.
 * Optionally, for requests the request id, correlation id, request expiry time and response expiry time may be
 * supplied. If any
 * of these elements are supplied on a request, TOCF will attempt to use their values to override any associated
 * parameters for that
 * specific request. On a service response, the header provides values for all elements in the model group where
 * possible. For expiry times,
 * where the duration is set to zero or no expiry duration was specified is taken as an instruction to the TOCF to use
 * its configured defaults.
 * Generally, this header is generated on request by sending a nil ofsmlHeader element on the request message or is
 * automatically generated in
 * the event of a fault response.
 * 
 * 
 * <p>
 * Java class for ofsml13Header complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ofsml13Header">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="requestId" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="correlationId" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="requestExpiryTime" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
 *         &lt;element name="responseExpiryTime" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
 *         &lt;element name="requestTimeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="responseTimeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="requestChannel" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="userName" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="company" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ofsmlMajor" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" fixed="3" />
 *       &lt;attribute name="ofsmlMinor" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" fixed="0" />
 *       &lt;attribute name="ofsmlRelease" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" fixed="1" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ofsml13Header", propOrder = { "requestId", "correlationId", "requestExpiryTime", "responseExpiryTime",
		"requestTimeStamp", "responseTimeStamp", "requestChannel", "userName", "company" })
public class Ofsml13Header {

	@XmlElement(namespace = "http://www.temenos.com/T24/OFSML/130")
	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	protected String requestId;
	@XmlElement(namespace = "http://www.temenos.com/T24/OFSML/130")
	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	protected String correlationId;
	@XmlElement(namespace = "http://www.temenos.com/T24/OFSML/130")
	protected Duration requestExpiryTime;
	@XmlElement(namespace = "http://www.temenos.com/T24/OFSML/130")
	protected Duration responseExpiryTime;
	@XmlElement(namespace = "http://www.temenos.com/T24/OFSML/130")
	protected XMLGregorianCalendar requestTimeStamp;
	@XmlElement(namespace = "http://www.temenos.com/T24/OFSML/130")
	protected XMLGregorianCalendar responseTimeStamp;
	@XmlElement(namespace = "http://www.temenos.com/T24/OFSML/130")
	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	protected String requestChannel;
	@XmlElement(namespace = "http://www.temenos.com/T24/OFSML/130")
	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	protected String userName;
	@XmlElement(namespace = "http://www.temenos.com/T24/OFSML/130")
	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	protected String company;
	@XmlAttribute
	protected BigInteger ofsmlMajor;
	@XmlAttribute
	protected BigInteger ofsmlMinor;
	@XmlAttribute
	protected BigInteger ofsmlRelease;

	/**
	 * Gets the value of the requestId property.
	 * 
	 * @return
	 *         possible object is {@link String }
	 * 
	 */
	public String getRequestId() {
		return requestId;
	}

	/**
	 * Sets the value of the requestId property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setRequestId(String value) {
		this.requestId = value;
	}

	/**
	 * Gets the value of the correlationId property.
	 * 
	 * @return
	 *         possible object is {@link String }
	 * 
	 */
	public String getCorrelationId() {
		return correlationId;
	}

	/**
	 * Sets the value of the correlationId property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCorrelationId(String value) {
		this.correlationId = value;
	}

	/**
	 * Gets the value of the requestExpiryTime property.
	 * 
	 * @return
	 *         possible object is {@link Duration }
	 * 
	 */
	public Duration getRequestExpiryTime() {
		return requestExpiryTime;
	}

	/**
	 * Sets the value of the requestExpiryTime property.
	 * 
	 * @param value
	 *            allowed object is {@link Duration }
	 * 
	 */
	public void setRequestExpiryTime(Duration value) {
		this.requestExpiryTime = value;
	}

	/**
	 * Gets the value of the responseExpiryTime property.
	 * 
	 * @return
	 *         possible object is {@link Duration }
	 * 
	 */
	public Duration getResponseExpiryTime() {
		return responseExpiryTime;
	}

	/**
	 * Sets the value of the responseExpiryTime property.
	 * 
	 * @param value
	 *            allowed object is {@link Duration }
	 * 
	 */
	public void setResponseExpiryTime(Duration value) {
		this.responseExpiryTime = value;
	}

	/**
	 * Gets the value of the requestTimeStamp property.
	 * 
	 * @return
	 *         possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getRequestTimeStamp() {
		return requestTimeStamp;
	}

	/**
	 * Sets the value of the requestTimeStamp property.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setRequestTimeStamp(XMLGregorianCalendar value) {
		this.requestTimeStamp = value;
	}

	/**
	 * Gets the value of the responseTimeStamp property.
	 * 
	 * @return
	 *         possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getResponseTimeStamp() {
		return responseTimeStamp;
	}

	/**
	 * Sets the value of the responseTimeStamp property.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setResponseTimeStamp(XMLGregorianCalendar value) {
		this.responseTimeStamp = value;
	}

	/**
	 * Gets the value of the requestChannel property.
	 * 
	 * @return
	 *         possible object is {@link String }
	 * 
	 */
	public String getRequestChannel() {
		return requestChannel;
	}

	/**
	 * Sets the value of the requestChannel property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setRequestChannel(String value) {
		this.requestChannel = value;
	}

	/**
	 * Gets the value of the userName property.
	 * 
	 * @return
	 *         possible object is {@link String }
	 * 
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * Sets the value of the userName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setUserName(String value) {
		this.userName = value;
	}

	/**
	 * Gets the value of the company property.
	 * 
	 * @return
	 *         possible object is {@link String }
	 * 
	 */
	public String getCompany() {
		return company;
	}

	/**
	 * Sets the value of the company property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCompany(String value) {
		this.company = value;
	}

	/**
	 * Gets the value of the ofsmlMajor property.
	 * 
	 * @return
	 *         possible object is {@link BigInteger }
	 * 
	 */
	public BigInteger getOfsmlMajor() {
		if (ofsmlMajor == null) {
			return new BigInteger("3");
		} else {
			return ofsmlMajor;
		}
	}

	/**
	 * Sets the value of the ofsmlMajor property.
	 * 
	 * @param value
	 *            allowed object is {@link BigInteger }
	 * 
	 */
	public void setOfsmlMajor(BigInteger value) {
		this.ofsmlMajor = value;
	}

	/**
	 * Gets the value of the ofsmlMinor property.
	 * 
	 * @return
	 *         possible object is {@link BigInteger }
	 * 
	 */
	public  BigInteger getOfsmlMinor() {
		if (ofsmlMinor == null) {
			return BigInteger.ZERO;
		} else {
			return ofsmlMinor;
		}
	}

	/**
	 * Sets the value of the ofsmlMinor property.
	 * 
	 * @param value
	 *            allowed object is {@link BigInteger }
	 * 
	 */
	public void setOfsmlMinor(BigInteger value) {
		this.ofsmlMinor = value;
	}

	/**
	 * Gets the value of the ofsmlRelease property.
	 * 
	 * @return
	 *         possible object is {@link BigInteger }
	 * 
	 */
	public BigInteger getOfsmlRelease() {
		if (ofsmlRelease == null) {		
			return BigInteger.ONE;
		} else {
			return ofsmlRelease;
		}
	}

	/**
	 * Sets the value of the ofsmlRelease property.
	 * 
	 * @param value
	 *            allowed object is {@link BigInteger }
	 * 
	 */
	public void setOfsmlRelease(BigInteger value) {
		this.ofsmlRelease = value;
	}

}
