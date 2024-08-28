//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.01.24 at 09:03:09 AM CET 
//


package com.ericsson.eniq.stats.user.input.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Simulation" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="network" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="node_type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="node_release" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="sim_mim_ver" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="no_of_nodes" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="no_of_cells" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="nb_iot_cell" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="enableBulkCmData" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="oss_dir" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="sim_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="node_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="nodes_ON" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="stats_dir" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="trace_dir" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    "simulation"
})
@XmlRootElement(name = "SimulationData")
public class SimulationData {

    @XmlElement(name = "Simulation")
    protected List<SimulationData.Simulation> simulation;

    /**
     * Gets the value of the simulation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the simulation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSimulation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SimulationData.Simulation }
     * 
     * 
     */
    public List<SimulationData.Simulation> getSimulation() {
        if (simulation == null) {
            simulation = new ArrayList<SimulationData.Simulation>();
        }
        return this.simulation;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="network" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="node_type" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="node_release" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="sim_mim_ver" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="no_of_nodes" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="no_of_cells" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="nb_iot_cell" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="enableBulkCmData" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="oss_dir" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="sim_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="node_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="nodes_ON" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="stats_dir" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="trace_dir" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "network",
        "nodeType",
        "nodeRelease",
        "simMimVer",
        "noOfNodes",
        "noOfCells",
        "nbIotCell",
        "enableBulkCmData",
        "ossDir",
        "simName",
        "nodeName",
        "nodesON",
        "statsDir",
        "traceDir"
    })
    public static class Simulation {

        @XmlElement(required = true)
        protected String network;
        @XmlElement(name = "node_type", required = true)
        protected String nodeType;
        @XmlElement(name = "node_release", required = true)
        protected String nodeRelease;
        @XmlElement(name = "sim_mim_ver", required = true)
        protected String simMimVer;
        @XmlElement(name = "no_of_nodes", required = true)
        protected String noOfNodes;
        @XmlElement(name = "no_of_cells", required = true)
        protected String noOfCells;
        @XmlElement(name = "nb_iot_cell", required = true)
        protected String nbIotCell;
        @XmlElement(required = true)
        protected String enableBulkCmData;
        @XmlElement(name = "oss_dir", required = true)
        protected String ossDir;
        @XmlElement(name = "sim_name", required = true)
        protected String simName;
        @XmlElement(name = "node_name", required = true)
        protected String nodeName;
        @XmlElement(name = "nodes_ON", required = true)
        protected String nodesON;
        @XmlElement(name = "stats_dir", required = true)
        protected String statsDir;
        @XmlElement(name = "trace_dir", required = true)
        protected String traceDir;
        @XmlAttribute(name = "name")
        protected String name;

        /**
         * Gets the value of the network property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNetwork() {
            return network;
        }

        /**
         * Sets the value of the network property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNetwork(String value) {
            this.network = value;
        }

        /**
         * Gets the value of the nodeType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNodeType() {
            return nodeType;
        }

        /**
         * Sets the value of the nodeType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNodeType(String value) {
            this.nodeType = value;
        }

        /**
         * Gets the value of the nodeRelease property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNodeRelease() {
            return nodeRelease;
        }

        /**
         * Sets the value of the nodeRelease property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNodeRelease(String value) {
            this.nodeRelease = value;
        }

        /**
         * Gets the value of the simMimVer property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSimMimVer() {
            return simMimVer;
        }

        /**
         * Sets the value of the simMimVer property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSimMimVer(String value) {
            this.simMimVer = value;
        }

        /**
         * Gets the value of the noOfNodes property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNoOfNodes() {
            return noOfNodes;
        }

        /**
         * Sets the value of the noOfNodes property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNoOfNodes(String value) {
            this.noOfNodes = value;
        }

        /**
         * Gets the value of the noOfCells property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNoOfCells() {
            return noOfCells;
        }

        /**
         * Sets the value of the noOfCells property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNoOfCells(String value) {
            this.noOfCells = value;
        }

        /**
         * Gets the value of the nbIotCell property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNbIotCell() {
            return nbIotCell;
        }

        /**
         * Sets the value of the nbIotCell property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNbIotCell(String value) {
            this.nbIotCell = value;
        }

        /**
         * Gets the value of the enableBulkCmData property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEnableBulkCmData() {
            return enableBulkCmData;
        }

        /**
         * Sets the value of the enableBulkCmData property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEnableBulkCmData(String value) {
            this.enableBulkCmData = value;
        }

        /**
         * Gets the value of the ossDir property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOssDir() {
            return ossDir;
        }

        /**
         * Sets the value of the ossDir property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOssDir(String value) {
            this.ossDir = value;
        }

        /**
         * Gets the value of the simName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSimName() {
            return simName;
        }

        /**
         * Sets the value of the simName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSimName(String value) {
            this.simName = value;
        }

        /**
         * Gets the value of the nodeName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNodeName() {
            return nodeName;
        }

        /**
         * Sets the value of the nodeName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNodeName(String value) {
            this.nodeName = value;
        }

        /**
         * Gets the value of the nodesON property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNodesON() {
            return nodesON;
        }

        /**
         * Sets the value of the nodesON property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNodesON(String value) {
            this.nodesON = value;
        }

        /**
         * Gets the value of the statsDir property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStatsDir() {
            return statsDir;
        }

        /**
         * Sets the value of the statsDir property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStatsDir(String value) {
            this.statsDir = value;
        }

        /**
         * Gets the value of the traceDir property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTraceDir() {
            return traceDir;
        }

        /**
         * Sets the value of the traceDir property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTraceDir(String value) {
            this.traceDir = value;
        }

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

    }

}
