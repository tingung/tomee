/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.openejb.jee.wls;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for column-map complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="column-map">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="foreign-key-column" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="key-column" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "column-map", propOrder = {
    "foreignKeyColumn",
    "keyColumn"
})
public class ColumnMap {

    @XmlElement(name = "foreign-key-column", required = true)
    protected String foreignKeyColumn;
    @XmlElement(name = "key-column", required = true)
    protected String keyColumn;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;

    /**
     * Gets the value of the foreignKeyColumn property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getForeignKeyColumn() {
        return foreignKeyColumn;
    }

    /**
     * Sets the value of the foreignKeyColumn property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setForeignKeyColumn(final String value) {
        this.foreignKeyColumn = value;
    }

    /**
     * Gets the value of the keyColumn property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getKeyColumn() {
        return keyColumn;
    }

    /**
     * Sets the value of the keyColumn property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setKeyColumn(final String value) {
        this.keyColumn = value;
    }

    /**
     * Gets the value of the id property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setId(final String value) {
        this.id = value;
    }

}
