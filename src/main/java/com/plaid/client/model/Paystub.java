/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.20.6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.plaid.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.plaid.client.model.Employee;
import com.plaid.client.model.IncomeBreakdown;
import com.plaid.client.model.PayPeriodDetails;
import com.plaid.client.model.PaystubEmployer;
import com.plaid.client.model.PaystubYTDDetails;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * An object representing data extracted from the end user&#39;s paystub.
 */
@ApiModel(description = "An object representing data extracted from the end user's paystub.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-08-13T23:02:46.991Z[GMT]")
public class Paystub {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_EMPLOYER = "employer";
  @SerializedName(SERIALIZED_NAME_EMPLOYER)
  private PaystubEmployer employer;

  public static final String SERIALIZED_NAME_EMPLOYEE = "employee";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE)
  private Employee employee;

  public static final String SERIALIZED_NAME_PAY_PERIOD_DETAILS = "pay_period_details";
  @SerializedName(SERIALIZED_NAME_PAY_PERIOD_DETAILS)
  private PayPeriodDetails payPeriodDetails;

  public static final String SERIALIZED_NAME_INCOME_BREAKDOWN = "income_breakdown";
  @SerializedName(SERIALIZED_NAME_INCOME_BREAKDOWN)
  private IncomeBreakdown incomeBreakdown;

  public static final String SERIALIZED_NAME_YTD_EARNINGS = "ytd_earnings";
  @SerializedName(SERIALIZED_NAME_YTD_EARNINGS)
  private PaystubYTDDetails ytdEarnings = null;


  public Paystub accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * The account identifier for the account associated with this paystub.
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The account identifier for the account associated with this paystub.")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public Paystub employer(PaystubEmployer employer) {
    
    this.employer = employer;
    return this;
  }

   /**
   * Get employer
   * @return employer
  **/
  @ApiModelProperty(required = true, value = "")

  public PaystubEmployer getEmployer() {
    return employer;
  }


  public void setEmployer(PaystubEmployer employer) {
    this.employer = employer;
  }


  public Paystub employee(Employee employee) {
    
    this.employee = employee;
    return this;
  }

   /**
   * Get employee
   * @return employee
  **/
  @ApiModelProperty(required = true, value = "")

  public Employee getEmployee() {
    return employee;
  }


  public void setEmployee(Employee employee) {
    this.employee = employee;
  }


  public Paystub payPeriodDetails(PayPeriodDetails payPeriodDetails) {
    
    this.payPeriodDetails = payPeriodDetails;
    return this;
  }

   /**
   * Get payPeriodDetails
   * @return payPeriodDetails
  **/
  @ApiModelProperty(required = true, value = "")

  public PayPeriodDetails getPayPeriodDetails() {
    return payPeriodDetails;
  }


  public void setPayPeriodDetails(PayPeriodDetails payPeriodDetails) {
    this.payPeriodDetails = payPeriodDetails;
  }


  public Paystub incomeBreakdown(IncomeBreakdown incomeBreakdown) {
    
    this.incomeBreakdown = incomeBreakdown;
    return this;
  }

   /**
   * Get incomeBreakdown
   * @return incomeBreakdown
  **/
  @ApiModelProperty(required = true, value = "")

  public IncomeBreakdown getIncomeBreakdown() {
    return incomeBreakdown;
  }


  public void setIncomeBreakdown(IncomeBreakdown incomeBreakdown) {
    this.incomeBreakdown = incomeBreakdown;
  }


  public Paystub ytdEarnings(PaystubYTDDetails ytdEarnings) {
    
    this.ytdEarnings = ytdEarnings;
    return this;
  }

   /**
   * Get ytdEarnings
   * @return ytdEarnings
  **/
  @ApiModelProperty(required = true, value = "")

  public PaystubYTDDetails getYtdEarnings() {
    return ytdEarnings;
  }


  public void setYtdEarnings(PaystubYTDDetails ytdEarnings) {
    this.ytdEarnings = ytdEarnings;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Paystub paystub = (Paystub) o;
    return Objects.equals(this.accountId, paystub.accountId) &&
        Objects.equals(this.employer, paystub.employer) &&
        Objects.equals(this.employee, paystub.employee) &&
        Objects.equals(this.payPeriodDetails, paystub.payPeriodDetails) &&
        Objects.equals(this.incomeBreakdown, paystub.incomeBreakdown) &&
        Objects.equals(this.ytdEarnings, paystub.ytdEarnings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, employer, employee, payPeriodDetails, incomeBreakdown, ytdEarnings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Paystub {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    employer: ").append(toIndentedString(employer)).append("\n");
    sb.append("    employee: ").append(toIndentedString(employee)).append("\n");
    sb.append("    payPeriodDetails: ").append(toIndentedString(payPeriodDetails)).append("\n");
    sb.append("    incomeBreakdown: ").append(toIndentedString(incomeBreakdown)).append("\n");
    sb.append("    ytdEarnings: ").append(toIndentedString(ytdEarnings)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

