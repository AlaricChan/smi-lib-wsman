/**
 * Copyright � 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-146 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.08.19 at 02:43:52 AM CDT 
//

package com.dell.isg.smi.wsman.command.entity;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.namespace.QName;

/**
 * <p>
 * Java class for cimAnySimpleType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cimAnySimpleType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>anySimpleType">
 *       &lt;anyAttribute processContents='lax'/>
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cimAnySimpleType", namespace = "http://schemas.dmtf.org/wbem/wscim/1/common", propOrder = { "value" })
@XmlSeeAlso({ com.dell.isg.smi.wsman.command.entity.SetBIOSAttributeEmbeddedInstanceOUTPUT.SetResult.class, com.dell.isg.smi.wsman.command.entity.SetBIOSAttributeEmbeddedInstanceOUTPUT.ReturnValue.class, com.dell.isg.smi.wsman.command.entity.ReadRawBIOSDataOUTPUT.ReturnValue.class, DetailedStatus.class, com.dell.isg.smi.wsman.command.entity.RestoreBIOSDefaultsINPUT.PasswordEncoding.class, com.dell.isg.smi.wsman.command.entity.WriteRawBIOSDataOUTPUT.ReturnValue.class, com.dell.isg.smi.wsman.command.entity.SetBIOSAttributesINPUT.PasswordEncoding.class, com.dell.isg.smi.wsman.command.entity.RequestedState.class, com.dell.isg.smi.wsman.command.entity.SetBIOSAttributeOUTPUT.SetResult.class, com.dell.isg.smi.wsman.command.entity.SetBIOSAttributeOUTPUT.ReturnValue.class, EnabledState.class, com.dell.isg.smi.wsman.command.entity.WriteRawBIOSDataINPUT.PasswordEncoding.class, com.dell.isg.smi.wsman.command.entity.ChangeAffectedElementsAssignedSequenceOUTPUT.ReturnValue.class, CommunicationStatus.class, com.dell.isg.smi.wsman.command.entity.SetBIOSAttributeINPUT.PasswordEncoding.class, com.dell.isg.smi.wsman.command.entity.RestoreBIOSDefaultsOUTPUT.ReturnValue.class, TransitioningToState.class, PrimaryStatus.class, OperationalStatus.class, com.dell.isg.smi.wsman.command.entity.SetAttributeOUTPUT.ReturnValue.class, EnabledDefault.class, com.dell.isg.smi.wsman.command.entity.RequestStateChangeINPUT.RequestedState.class, HealthState.class, com.dell.isg.smi.wsman.command.entity.SetAttributesOUTPUT.ReturnValue.class, AvailableRequestedStates.class, com.dell.isg.smi.wsman.command.entity.RequestStateChangeOUTPUT.ReturnValue.class, OperatingStatus.class, com.dell.isg.smi.wsman.command.entity.SetBIOSAttributesOUTPUT.SetResult.class, com.dell.isg.smi.wsman.command.entity.SetBIOSAttributesOUTPUT.ReturnValue.class, com.dell.isg.smi.wsman.command.entity.SetBIOSAttributeEmbeddedInstanceINPUT.PasswordEncoding.class })
public class CimAnySimpleType {

    @XmlValue
    @XmlSchemaType(name = "anySimpleType")
    protected Object value;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();


    /**
     * Gets the value of the value property.
     * 
     * @return possible object is {@link Object }
     * 
     */
    public Object getValue() {
        return value;
    }


    /**
     * Sets the value of the value property.
     * 
     * @param value allowed object is {@link Object }
     * 
     */
    public void setValue(Object value) {
        this.value = value;
    }


    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
