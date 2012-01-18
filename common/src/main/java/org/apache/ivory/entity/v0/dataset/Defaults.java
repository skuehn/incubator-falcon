/*******************************************************************************
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package org.apache.ivory.entity.v0.dataset;

import java.util.Map;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.apache.ivory.entity.common.Configuration;
import org.apache.ivory.entity.v0.dataset.adapter.ConfigurationTypeAdapter;
import org.apache.ivory.entity.v0.dataset.adapter.PathsMapAdapter;
import org.apache.ivory.entity.v0.dataset.adapter.PoliciesMapAdapter;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = { "acl", "authentication", "dateRange", "frequency","periodicity","paths", "policies", "configuration" })
@XmlRootElement(name = "Defaults")
public class Defaults {

  @XmlElement(name = "ACL")
  protected ACL acl;

  @XmlElement(name = "Authentication")
  protected Authentication authentication;

  @XmlElement(name = "DateRange")
  protected DateRange dateRange;
  
  @XmlElement(name = "Frequency")
  protected String frequency;
  
  @XmlElement(name = "Periodicity")
  protected String periodicity;

  @XmlJavaTypeAdapter(PathsMapAdapter.class)
  @XmlElement(name = "Path", required = true)
  protected Map<String, String> paths;

  @XmlJavaTypeAdapter(PoliciesMapAdapter.class)
  @XmlElement(name = "Policy")
  protected Map<String, Policy> policies;

  @XmlJavaTypeAdapter(ConfigurationTypeAdapter.class)
  @XmlElement(name = "Configuration")
  protected Configuration configuration;

  public ACL getACL() {
    return acl;
  }

  public void setACL(ACL value) {
    acl = value;
  }

  public Authentication getAuthentication() {
    return authentication;
  }

  public void setAuthentication(Authentication value) {
    authentication = value;
  }

  public DateRange getDateRange() {
    return dateRange;
  }

  public void setDateRange(DateRange value) {
    dateRange = value;
  }

  public Map<String, String> getPaths() {
    return paths;
  }

  public void setPaths(Map<String, String> paths) {
    this.paths = paths;
  }

  public Map<String, Policy> getPolicies() {
    return policies;
  }

  public void setPolicies(Map<String, Policy> policies) {
    this.policies = policies;
  }

  public Configuration getConfiguration() {
    return configuration;
  }

  public void setConfiguration(Configuration value) {
    configuration = value;
  }
  
  /**
   * Gets the value of the frequency property.
   * 
   * @return
   *     possible object is
   *     {@link String }
   *     
   */
  public String getFrequency() {
      return frequency;
  }

  /**
   * Sets the value of the frequency property.
   * 
   * @param value
   *     allowed object is
   *     {@link String }
   *     
   */
  public void setFrequency(String value) {
      this.frequency = value;
  }

  /**
   * Gets the value of the periodicity property.
   * 
   * @return
   *     possible object is
   *     {@link String }
   *     
   */
  public String getPeriodicity() {
      return periodicity;
  }

  /**
   * Sets the value of the periodicity property.
   * 
   * @param value
   *     allowed object is
   *     {@link String }
   *     
   */
  public void setPeriodicity(String value) {
      this.periodicity = value;
  }


}
