
package com.employees.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per getEmployeeById complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="getEmployeeById">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getEmployeeById", propOrder = {
    "arg0"
})
public class GetEmployeeById {

    protected int arg0;

    /**
     * Recupera il valore della proprietÓ arg0.
     * 
     */
    public int getArg0() {
        return arg0;
    }

    /**
     * Imposta il valore della proprietÓ arg0.
     * 
     */
    public void setArg0(int value) {
        this.arg0 = value;
    }

}
