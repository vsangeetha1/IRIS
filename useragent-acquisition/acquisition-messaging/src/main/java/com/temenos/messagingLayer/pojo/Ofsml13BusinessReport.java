//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b26-ea3 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.06.20 at 02:21:10 PM IST 
//

package com.temenos.messagingLayer.pojo;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * 
 * Denotes a multiple data set business report, generated from T24.
 * 
 * 
 * <p>
 * Java class for ofsml13BusinessReport complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ofsml13BusinessReport">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reportDestination" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="errorDestination" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="dataSet" type="{http://www.temenos.com/T24/OFSML/130}ofsml13DataSet" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="docType" use="required" type="{http://www.w3.org/2001/XMLSchema}token" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ofsml13BusinessReport", propOrder = { "reportDestination", "errorDestination", "dataSet" })
public class Ofsml13BusinessReport {

	@XmlElement(namespace = "http://www.temenos.com/T24/OFSML/130")
	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	protected String reportDestination;
	@XmlElement(namespace = "http://www.temenos.com/T24/OFSML/130")
	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	protected String errorDestination;
	@XmlElement(namespace = "http://www.temenos.com/T24/OFSML/130")
	protected List<Ofsml13DataSet> dataSet;
	@XmlAttribute(required = true)
	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	protected String docType;

	/**
	 * Gets the value of the reportDestination property.
	 * 
	 * @return
	 *         possible object is {@link String }
	 * 
	 */
	public String getReportDestination() {
		return reportDestination;
	}

	/**
	 * Sets the value of the reportDestination property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setReportDestination(String value) {
		this.reportDestination = value;
	}

	/**
	 * Gets the value of the errorDestination property.
	 * 
	 * @return
	 *         possible object is {@link String }
	 * 
	 */
	public String getErrorDestination() {
		return errorDestination;
	}

	/**
	 * Sets the value of the errorDestination property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setErrorDestination(String value) {
		this.errorDestination = value;
	}

	/**
	 * Gets the value of the dataSet property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to
	 * the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for
	 * the dataSet property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getDataSet().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link Ofsml13DataSet }
	 * 
	 * 
	 */
	public List<Ofsml13DataSet> getDataSet() {
		if (dataSet == null) {
			dataSet = new ArrayList<Ofsml13DataSet>();
		}
		return this.dataSet;
	}

	/**
	 * Gets the value of the docType property.
	 * 
	 * @return
	 *         possible object is {@link String }
	 * 
	 */
	public String getDocType() {
		return docType;
	}

	/**
	 * Sets the value of the docType property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDocType(String value) {
		this.docType = value;
	}

}
