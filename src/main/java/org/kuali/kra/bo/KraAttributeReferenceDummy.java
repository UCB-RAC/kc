/*
 * Copyright 2006-2008 The Kuali Foundation
 * 
 * Licensed under the Educational Community License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.osedu.org/licenses/ECL-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.kuali.kra.bo;


import java.sql.Timestamp;

import org.kuali.kra.budget.BudgetDecimal;
import org.kuali.rice.kns.bo.AttributeReferenceDummy;

/**
 * Attribute Reference Dummy Business Object
 */
public class KraAttributeReferenceDummy extends AttributeReferenceDummy {

    private String description;
    private String bigDescription;
    private String city;
    private String county;
    private String state;
    private String countryCode;
    private String updateUser;
    private Timestamp updateTimestamp;
    private String principalInvestigator;
    private BudgetDecimal genericRate;
    private String budgetName;


    /**
     * Gets the value of city
     *
     * @return the value of city
     */
    public final String getCity() {
        return this.city;
    }

    /**
     * Sets the value of city
     *
     * @param argCity Value to assign to this.city
     */
    public final void setCity(final String argCity) {
        this.city = argCity;
    }

    /**
     * Gets the value of county
     *
     * @return the value of county
     */
    public final String getCounty() {
        return this.county;
    }

    /**
     * Sets the value of county
     *
     * @param argCounty Value to assign to this.county
     */
    public final void setCounty(final String argCounty) {
        this.county = argCounty;
    }

    /**
     * Gets the value of state
     *
     * @return the value of state
     */
    public final String getState() {
        return this.state;
    }

    /**
     * Sets the value of state
     *
     * @param argState Value to assign to this.state
     */
    public final void setState(final String argState) {
        this.state = argState;
    }

    /**
     * Gets the value of countryCode
     *
     * @return the value of countryCode
     */
    public final String getCountryCode() {
        return this.countryCode;
    }

    /**
     * Sets the value of countryCode
     *
     * @param argCountryCode Value to assign to this.countryCode
     */
    public final void setCountryCode(final String argCountryCode) {
        this.countryCode = argCountryCode;
    }


    /**
     * Gets the value of description
     *
     * @return the value of description
     */
    public final String getDescription() {
        return this.description;
    }

    /**
     * Sets the value of description
     *
     * @param argDescription Value to assign to this.description
     */
    public final void setDescription(final String argDescription) {
        this.description = argDescription;
    }

    public String getBigDescription() {
        return bigDescription;
    }

    public void setBigDescription(String bigDescription) {
        this.bigDescription = bigDescription;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public Timestamp getUpdateTimestamp() {
        return updateTimestamp;
    }

    public void setUpdateTimestamp(Timestamp updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
    }

    public String getPrincipalInvestigator() {
        return principalInvestigator;
    }

    public void setPrincipalInvestigator(String principalInvestigator) {
        this.principalInvestigator = principalInvestigator;
    }

    public final BudgetDecimal getGenericRate() {
        return genericRate;
    }

    public final void setGenericRate(BudgetDecimal genericRate) {
        this.genericRate = genericRate;
    }

    public String getBudgetName() {
        return budgetName;
    }

    public void setBudgetName(String budgetName) {
        this.budgetName = budgetName;
    }
}
