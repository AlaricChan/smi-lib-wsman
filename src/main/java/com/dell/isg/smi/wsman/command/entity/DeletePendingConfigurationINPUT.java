/**
 * Copyright � 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-146 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.10.18 at 11:10:55 AM CDT 
//

package com.dell.isg.smi.wsman.command.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Target" type="{http://schemas.dmtf.org/wbem/wscim/1/common}cimString"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "target" })
@XmlRootElement(name = "DeletePendingConfiguration_INPUT")
public class DeletePendingConfigurationINPUT {

    @XmlElement(name = "Target", required = true)
    protected CimString target;


    /**
     * Gets the value of the target property.
     * 
     * @return possible object is {@link CimString }
     * 
     */
    public CimString getTarget() {
        return target;
    }


    /**
     * Sets the value of the target property.
     * 
     * @param value allowed object is {@link CimString }
     * 
     */
    public void setTarget(CimString value) {
        this.target = value;
    }

}
