package com.biplab.poc.jpa.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @author Biplab Nayak [Created on 4/5/2016].
 */

@Entity
@Table(name = "product_plan_definition")
public class ProductPlanDefination {

    @Id
    @Column(name = "coverage_Id")
    private Integer coverageId;

    @Column(name = "planorder")
    private Integer planOrder;

    @Column(name = "coverage")
    private String coverage;

    @Column(name = "coverage_code")
    private String coverageCode;

    @Column(name = "coveragedisplayorder")
    private String coverageDisplayOrder;

    @Column(name = "coverage_desc")
    private String coverageDesc;

    @Column(name = "limits")
    private String limits;

    @Column(name = "limt_code")
    private String limtCode;

    @Column(name = "limit_desc")
    private String limitDesc;

    @Column(name = "limitorder")
    private Integer limitorder;

    @Column(name = "options")
    private String options;

    @Column(name = "option_code")
    private String optionCode;

    @Column(name = "option_desc")
    private String optionDesc;

    @Column(name = "option_order")
    private Integer optionOrder;

    @Column(name = "deductibles")
    private String deductibles;

    @Column(name = "deductible_code")
    private String deductibleCode;

    @Column(name = "deductible_desc")
    private String deductibleDesc;

    @Column(name = "deductible_order")
    private Integer deductibleOrder;

    @Column(name = "product_id")
    private String productId;
/*
    @Column(name = "user_type")
    private String userType;*/

    @Column(name = "vehicle_type")
    private String vehicleType;

    @Column(name = "plans")
    private String plans;

    @Column(name = "coverage_type")
    private String coverageType;

    @Column(name = "state")
    private String state;

    @Column(name = "vehicle_code")
    private String vehicleCode;

    @Column(name = "line")
    private String line;

    @Column(name = "subline")
    private String subLine;

    @Column(name = "new_business_eff_date")
    private Date newBusinessEffDate;

    @Column(name = "renewal_eff_date")
    private Date renewalEffDate;

    @Column(name = "comb_deductible")
    private String combDeductible;

    @Column(name = "comb_limit")
    private String combLimit;

    @Column(name = "comb_option")
    private String combOption;

    @Column(name = "isreduced")
    private String isReduced;

    @Column(name = "isliablityminimum")
    private String isLiablityMinimum;

    @Column(name = "DISPLAY_ONLY")
    private String displayOnly;

    public String getCombCoverageType() {
        return combCoverageType;
    }

    public void setCombCoverageType(String combCoverageType) {
        this.combCoverageType = combCoverageType;
    }

    @Column(name = "comb_coverage_type")

    private String combCoverageType;

    public String getCovCodeRate() {
        return covCodeRate;
    }

    public void setCovCodeRate(String covCodeRate) {
        this.covCodeRate = covCodeRate;
    }

    @Column(name = "cov_code_rate")

    private String covCodeRate;

    public String getToolTip() {
        return toolTip;
    }

    public void setToolTip(String toolTip) {
        this.toolTip = toolTip;
    }

    public Integer getPlanOrder() {
        return planOrder;
    }

    public void setPlanOrder(Integer planOrder) {
        this.planOrder = planOrder;
    }

    @Column(name ="tooltip")

    private String toolTip;

    public String getCoverageType() {
        return coverageType;
    }

    public void setCoverageType(String coverageType) {
        this.coverageType = coverageType;
    }

    public Integer getCoverageId() {
        return coverageId;
    }

    public void setCoverageId(Integer coverageId) {
        this.coverageId = coverageId;
    }

    public String getCoverage() {
        return coverage;
    }

    public void setCoverage(String coverage) {
        this.coverage = coverage;
    }

    public String getCoverageCode() {
        return coverageCode;
    }

    public void setCoverageCode(String coverageCode) {
        this.coverageCode = coverageCode;
    }

    public String getCoverageDesc() {
        return coverageDesc;
    }

    public void setCoverageDesc(String coverageDesc) {
        this.coverageDesc = coverageDesc;
    }

    public String getLimits() {
        return limits;
    }

    public void setLimits(String limits) {
        this.limits = limits;
    }

    public String getLimtCode() {
        return limtCode;
    }

    public void setLimtCode(String limtCode) {
        this.limtCode = limtCode;
    }

    public String getLimitDesc() {
        return limitDesc;
    }

    public void setLimitDesc(String limitDesc) {
        this.limitDesc = limitDesc;
    }

    public Integer getLimitorder() {
        return limitorder;
    }

    public void setLimitorder(Integer limitorder) {
        this.limitorder = limitorder;
    }

    public String getOptions() {
        return options;
    }

    public void setOptions(String options) {
        this.options = options;
    }

    public String getOptionCode() {
        return optionCode;
    }

    public void setOptionCode(String optionCode) {
        this.optionCode = optionCode;
    }

    public String getOptionDesc() {
        return optionDesc;
    }

    public void setOptionDesc(String optionDesc) {
        this.optionDesc = optionDesc;
    }

    public Integer getOptionOrder() {
        return optionOrder;
    }

    public void setOptionOrder(Integer optionOrder) {
        this.optionOrder = optionOrder;
    }

    public String getDeductibles() {
        return deductibles;
    }

    public void setDeductibles(String deductibles) {
        this.deductibles = deductibles;
    }

    public String getDeductibleCode() {
        return deductibleCode;
    }

    public void setDeductibleCode(String deductibleCode) {
        this.deductibleCode = deductibleCode;
    }

    public String getDeductibleDesc() {
        return deductibleDesc;
    }

    public void setDeductibleDesc(String deductibleDesc) {
        this.deductibleDesc = deductibleDesc;
    }

    public Integer getDeductibleOrder() {
        return deductibleOrder;
    }

    public void setDeductibleOrder(Integer deductibleOrder) {
        this.deductibleOrder = deductibleOrder;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

  /*  public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }*/

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getPlans() {
        return plans;
    }

    public void setPlans(String plans) {
        this.plans = plans;
    }

    /**
     * @return the state
     */
    public String getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * @return the vehicleCode
     */
    public String getVehicleCode() {
        return vehicleCode;
    }

    /**
     * @param vehicleCode the vehicleCode to set
     */
    public void setVehicleCode(String vehicleCode) {
        this.vehicleCode = vehicleCode;
    }

    /**
     * @return the line
     */
    public String getLine() {
        return line;
    }

    /**
     * @param line the line to set
     */
    public void setLine(String line) {
        this.line = line;
    }

    /**
     * @return the subLine
     */
    public String getSubLine() {
        return subLine;
    }

    /**
     * @param subLine the subLine to set
     */
    public void setSubLine(String subLine) {
        this.subLine = subLine;
    }

    /**
     * @return the newBusinessEffDate
     */
    public Date getNewBusinessEffDate() {
        return newBusinessEffDate;
    }

    /**
     * @param newBusinessEffDate the newBusinessEffDate to set
     */
    public void setNewBusinessEffDate(Date newBusinessEffDate) {
        this.newBusinessEffDate = newBusinessEffDate;
    }

    /**
     * @return the renewalEffDate
     */
    public Date getRenewalEffDate() {
        return renewalEffDate;
    }

    /**
     * @param renewalEffDate the renewalEffDate to set
     */
    public void setRenewalEffDate(Date renewalEffDate) {
        this.renewalEffDate = renewalEffDate;
    }

    /**
     * @return the combDeductible
     */
    public String getCombDeductible() {
        return combDeductible;
    }

    /**
     * @param combDeductible the combDeductible to set
     */
    public void setCombDeductible(String combDeductible) {
        this.combDeductible = combDeductible;
    }

    /**
     * @return the combLimit
     */
    public String getCombLimit() {
        return combLimit;
    }

    /**
     * @param combLimit the combLimit to set
     */
    public void setCombLimit(String combLimit) {
        this.combLimit = combLimit;
    }

    /**
     * @return the combOption
     */
    public String getCombOption() {
        return combOption;
    }

    /**
     * @param combOption the combOption to set
     */
    public void setCombOption(String combOption) {
        this.combOption = combOption;
    }

    /**
     * @return the isReduced
     */
    public String getIsReduced() {
        return isReduced;
    }

    /**
     * @param isReduced the isReduced to set
     */
    public void setIsReduced(String isReduced) {
        this.isReduced = isReduced;
    }

    /**
     * @return the displayOnly
     */
    public String getDisplayOnly() {
        return displayOnly;
    }

    /**
     * @param displayOnly the displayOnly to set
     */
    public void setDisplayOnly(String displayOnly) {
        this.displayOnly = displayOnly;
    }

    public String getCoverageDisplayOrder() {
        return coverageDisplayOrder;
    }

    public void setCoverageDisplayOrder(String coverageDisplayOrder) {
        this.coverageDisplayOrder = coverageDisplayOrder;
    }

    public String getIsLiablityMinimum() {
        return isLiablityMinimum;
    }

    public void setIsLiablityMinimum(String isLiablityMinimum) {
        this.isLiablityMinimum = isLiablityMinimum;
    }
}
