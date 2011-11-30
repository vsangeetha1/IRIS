//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b26-ea3 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.07.05 at 11:33:47 AM IST 
//

package com.temenos.messagingLayer.mappingpojo;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * <p>
 * Java class for group element declaration.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="group">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element ref="{}fieldMapping" maxOccurs="unbounded"/>
 *           &lt;element ref="{}t24Constant" maxOccurs="unbounded"/>
 *         &lt;/sequence>
 *         &lt;attribute name="condition" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *         &lt;attribute name="operand" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *         &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *         &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;/restriction>
 *     &lt;/complexContent>
 *   &lt;/complexType>
 * &lt;/element>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "fieldMapping", "t24Constant" })
@XmlRootElement(name = "group")
public class Group {

	protected List<FieldMapping> fieldMapping;
	protected List<T24Constant> t24Constant;
	@XmlAttribute
	protected String condition;
	@XmlAttribute
	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	protected String operand;
	@XmlAttribute(required = true)
	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	protected String type;
	@XmlAttribute
	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	protected String value;

	/**
	 * Gets the value of the fieldMapping property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to
	 * the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for
	 * the fieldMapping property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getFieldMapping().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link FieldMapping }
	 * 
	 * 
	 */
	public List<FieldMapping> getFieldMapping() {
		if (fieldMapping == null) {
			fieldMapping = new ArrayList<FieldMapping>();
		}
		return this.fieldMapping;
	}

	/**
	 * Gets the value of the t24Constant property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to
	 * the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for
	 * the t24Constant property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getT24Constant().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link T24Constant }
	 * 
	 * 
	 */
	public List<T24Constant> getT24Constant() {
		if (t24Constant == null) {
			t24Constant = new ArrayList<T24Constant>();
		}
		return this.t24Constant;
	}

	/**
	 * Gets the value of the condition property.
	 * 
	 * @return
	 *         possible object is {@link String }
	 * 
	 */
	public String getCondition() {
		return condition;
	}

	/**
	 * Sets the value of the condition property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCondition(String value) {
		this.condition = value;
	}

	/**
	 * Gets the value of the operand property.
	 * 
	 * @return
	 *         possible object is {@link String }
	 * 
	 */
	public String getOperand() {
		return operand;
	}

	/**
	 * Sets the value of the operand property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setOperand(String value) {
		this.operand = value;
	}

	/**
	 * Gets the value of the type property.
	 * 
	 * @return
	 *         possible object is {@link String }
	 * 
	 */
	public String getType() {
		return type;
	}

	/**
	 * Sets the value of the type property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setType(String value) {
		this.type = value;
	}

	/**
	 * Gets the value of the value property.
	 * 
	 * @return
	 *         possible object is {@link String }
	 * 
	 */
	public String getValue() {
		return value;
	}

	/**
	 * Sets the value of the value property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValue(String value) {
		this.value = value;
	}

}
