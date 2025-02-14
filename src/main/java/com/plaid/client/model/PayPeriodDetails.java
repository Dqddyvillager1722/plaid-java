/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.33.0
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * Details about the pay period.
 */
@ApiModel(description = "Details about the pay period.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-09-15T21:50:59.429Z[GMT]")
public class PayPeriodDetails {
  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private LocalDate startDate;

  public static final String SERIALIZED_NAME_END_DATE = "end_date";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private LocalDate endDate;

  public static final String SERIALIZED_NAME_PAY_DAY = "pay_day";
  @SerializedName(SERIALIZED_NAME_PAY_DAY)
  private LocalDate payDay;

  public static final String SERIALIZED_NAME_GROSS_EARNINGS = "gross_earnings";
  @SerializedName(SERIALIZED_NAME_GROSS_EARNINGS)
  private Double grossEarnings;

  public static final String SERIALIZED_NAME_CHECK_AMOUNT = "check_amount";
  @SerializedName(SERIALIZED_NAME_CHECK_AMOUNT)
  private Double checkAmount;


  public PayPeriodDetails startDate(LocalDate startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * The pay period start date, in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format: \&quot;yyyy-mm-dd\&quot;.
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The pay period start date, in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format: \"yyyy-mm-dd\".")

  public LocalDate getStartDate() {
    return startDate;
  }


  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }


  public PayPeriodDetails endDate(LocalDate endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * The pay period end date, in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format: \&quot;yyyy-mm-dd\&quot;.
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The pay period end date, in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format: \"yyyy-mm-dd\".")

  public LocalDate getEndDate() {
    return endDate;
  }


  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }


  public PayPeriodDetails payDay(LocalDate payDay) {
    
    this.payDay = payDay;
    return this;
  }

   /**
   * The date on which the paystub was issued, in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format (\&quot;yyyy-mm-dd\&quot;).
   * @return payDay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The date on which the paystub was issued, in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format (\"yyyy-mm-dd\").")

  public LocalDate getPayDay() {
    return payDay;
  }


  public void setPayDay(LocalDate payDay) {
    this.payDay = payDay;
  }


  public PayPeriodDetails grossEarnings(Double grossEarnings) {
    
    this.grossEarnings = grossEarnings;
    return this;
  }

   /**
   * Total earnings before tax.
   * @return grossEarnings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Total earnings before tax.")

  public Double getGrossEarnings() {
    return grossEarnings;
  }


  public void setGrossEarnings(Double grossEarnings) {
    this.grossEarnings = grossEarnings;
  }


  public PayPeriodDetails checkAmount(Double checkAmount) {
    
    this.checkAmount = checkAmount;
    return this;
  }

   /**
   * The net amount of the paycheck.
   * @return checkAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The net amount of the paycheck.")

  public Double getCheckAmount() {
    return checkAmount;
  }


  public void setCheckAmount(Double checkAmount) {
    this.checkAmount = checkAmount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayPeriodDetails payPeriodDetails = (PayPeriodDetails) o;
    return Objects.equals(this.startDate, payPeriodDetails.startDate) &&
        Objects.equals(this.endDate, payPeriodDetails.endDate) &&
        Objects.equals(this.payDay, payPeriodDetails.payDay) &&
        Objects.equals(this.grossEarnings, payPeriodDetails.grossEarnings) &&
        Objects.equals(this.checkAmount, payPeriodDetails.checkAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDate, endDate, payDay, grossEarnings, checkAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayPeriodDetails {\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    payDay: ").append(toIndentedString(payDay)).append("\n");
    sb.append("    grossEarnings: ").append(toIndentedString(grossEarnings)).append("\n");
    sb.append("    checkAmount: ").append(toIndentedString(checkAmount)).append("\n");
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

