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

/**
 * 
 * OFSML 1.3+ model group. The corresponding OFSML 1.1 & 1.2 model group definitions are no longer supported.
 * When present consists of optional members and attributes denoting (technical) request handling directives to the
 * TOCF.
 * The messagePort element denotes the target message port in the TAG (note: TAG only). The t24Service element denotes
 * the target T24 service instance for processing the message (note: TAG only). The fireAndForget directive specifies
 * how
 * to handle responses (to supply or to dispose of responses). In the event of an error during processing of a request,
 * the
 * retryCount attribute is incremented each time the message is seen. This provides a retry mechanism that extends
 * beyond
 * the boundry of the TOCF, up to the maxRetry limit.
 * 
 * 
 * <p>
 * Java class for ofsml13RequestProcessing complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ofsml13RequestProcessing">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="messagePort" type="{http://www.w3.org/2001/XMLSchema}token"/>
 *           &lt;element name="t24Service" type="{http://www.w3.org/2001/XMLSchema}token"/>
 *         &lt;/choice>
 *         &lt;element name="signatureHandling" type="{http://www.temenos.com/T24/OFSML/130}ofsml13SignatureDirective" minOccurs="0"/>
 *         &lt;element name="fireAndForget" type="{http://www.temenos.com/T24/OFSML/130}ofsml13FireAndForgetDirective" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="maxRetry" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" default="5" />
 *       &lt;attribute name="retryCount" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ofsml13RequestProcessing", propOrder = { "messagePort", "t24Service", "signatureHandling",
		"fireAndForget" })
public class Ofsml13RequestProcessing {

	@XmlElement(namespace = "http://www.temenos.com/T24/OFSML/130")
	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	protected String messagePort;
	@XmlElement(namespace = "http://www.temenos.com/T24/OFSML/130")
	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	protected String t24Service;
	@XmlElement(namespace = "http://www.temenos.com/T24/OFSML/130", defaultValue = "NONE")
	protected Ofsml13SignatureDirective signatureHandling;
	@XmlElement(namespace = "http://www.temenos.com/T24/OFSML/130", defaultValue = "NEVER")
	protected Ofsml13FireAndForgetDirective fireAndForget;
	@XmlAttribute
	protected BigInteger maxRetry;
	@XmlAttribute
	protected BigInteger retryCount;

	/**
	 * Gets the value of the messagePort property.
	 * 
	 * @return
	 *         possible object is {@link String }
	 * 
	 */
	public String getMessagePort() {
		return messagePort;
	}

	/**
	 * Sets the value of the messagePort property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setMessagePort(String value) {
		this.messagePort = value;
	}

	/**
	 * Gets the value of the t24Service property.
	 * 
	 * @return
	 *         possible object is {@link String }
	 * 
	 */
	public String getT24Service() {
		return t24Service;
	}

	/**
	 * Sets the value of the t24Service property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setT24Service(String value) {
		this.t24Service = value;
	}

	/**
	 * Gets the value of the signatureHandling property.
	 * 
	 * @return
	 *         possible object is {@link Ofsml13SignatureDirective }
	 * 
	 */
	public Ofsml13SignatureDirective getSignatureHandling() {
		return signatureHandling;
	}

	/**
	 * Sets the value of the signatureHandling property.
	 * 
	 * @param value
	 *            allowed object is {@link Ofsml13SignatureDirective }
	 * 
	 */
	public void setSignatureHandling(Ofsml13SignatureDirective value) {
		this.signatureHandling = value;
	}

	/**
	 * Gets the value of the fireAndForget property.
	 * 
	 * @return
	 *         possible object is {@link Ofsml13FireAndForgetDirective }
	 * 
	 */
	public Ofsml13FireAndForgetDirective getFireAndForget() {
		return fireAndForget;
	}

	/**
	 * Sets the value of the fireAndForget property.
	 * 
	 * @param value
	 *            allowed object is {@link Ofsml13FireAndForgetDirective }
	 * 
	 */
	public void setFireAndForget(Ofsml13FireAndForgetDirective value) {
		this.fireAndForget = value;
	}

	/**
	 * Gets the value of the maxRetry property.
	 * 
	 * @return
	 *         possible object is {@link BigInteger }
	 * 
	 */
	public BigInteger getMaxRetry() {
		if (maxRetry == null) {
			return new BigInteger("5");
		} else {
			return maxRetry;
		}
	}

	/**
	 * Sets the value of the maxRetry property.
	 * 
	 * @param value
	 *            allowed object is {@link BigInteger }
	 * 
	 */
	public void setMaxRetry(BigInteger value) {
		this.maxRetry = value;
	}

	/**
	 * Gets the value of the retryCount property.
	 * 
	 * @return
	 *         possible object is {@link BigInteger }
	 * 
	 */
	public BigInteger getRetryCount() {
		return retryCount;
	}

	/**
	 * Sets the value of the retryCount property.
	 * 
	 * @param value
	 *            allowed object is {@link BigInteger }
	 * 
	 */
	public void setRetryCount(BigInteger value) {
		this.retryCount = value;
	}

}
