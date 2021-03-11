/*
 * Regula Face Recognition Web API
 * Regula Face Recognition Web API
 *
 * The version of the OpenAPI document: 0.1.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.regula.facerecognition.webclient.gen.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.Objects;

/** CompareImageResult */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CompareImageResult {
  public static final String SERIALIZED_NAME_FIRST_INDEX = "firstIndex";

  @SerializedName(SERIALIZED_NAME_FIRST_INDEX)
  private Integer firstIndex;

  public static final String SERIALIZED_NAME_FIRST_FACE_INDEX = "firstFaceIndex";

  @SerializedName(SERIALIZED_NAME_FIRST_FACE_INDEX)
  private Integer firstFaceIndex;

  public static final String SERIALIZED_NAME_SECOND_INDEX = "secondIndex";

  @SerializedName(SERIALIZED_NAME_SECOND_INDEX)
  private Integer secondIndex;

  public static final String SERIALIZED_NAME_SECOND_FACE_INDEX = "secondFaceIndex";

  @SerializedName(SERIALIZED_NAME_SECOND_FACE_INDEX)
  private Integer secondFaceIndex;

  public static final String SERIALIZED_NAME_SCORE = "score";

  @SerializedName(SERIALIZED_NAME_SCORE)
  private BigDecimal score;

  public static final String SERIALIZED_NAME_SIMILARITY = "similarity";

  @SerializedName(SERIALIZED_NAME_SIMILARITY)
  private BigDecimal similarity;

  public static final String SERIALIZED_NAME_ERROR_CODE = "errorCode";

  @SerializedName(SERIALIZED_NAME_ERROR_CODE)
  private Integer errorCode;

  public static final String SERIALIZED_NAME_ERROR_MSG = "errorMsg";

  @SerializedName(SERIALIZED_NAME_ERROR_MSG)
  private String errorMsg;

  public CompareImageResult firstIndex(Integer firstIndex) {

    this.firstIndex = firstIndex;
    return this;
  }

  /**
   * Image index used to identify input photos between themselves. If not specified, than input list
   * index is used
   *
   * @return firstIndex
   */
  @ApiModelProperty(
      required = true,
      value =
          "Image index used to identify input photos between themselves. If not specified, than input list index is used")
  public Integer getFirstIndex() {
    return firstIndex;
  }

  public void setFirstIndex(Integer firstIndex) {
    this.firstIndex = firstIndex;
  }

  public CompareImageResult firstFaceIndex(Integer firstFaceIndex) {

    this.firstFaceIndex = firstFaceIndex;
    return this;
  }

  /**
   * Faces index used to identify faces in scope of one photo.
   *
   * @return firstFaceIndex
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Faces index used to identify faces in scope of one photo.")
  public Integer getFirstFaceIndex() {
    return firstFaceIndex;
  }

  public void setFirstFaceIndex(Integer firstFaceIndex) {
    this.firstFaceIndex = firstFaceIndex;
  }

  public CompareImageResult secondIndex(Integer secondIndex) {

    this.secondIndex = secondIndex;
    return this;
  }

  /**
   * Image index used to identify input photos between themselves. If not specified, than input list
   * index is used
   *
   * @return secondIndex
   */
  @ApiModelProperty(
      required = true,
      value =
          "Image index used to identify input photos between themselves. If not specified, than input list index is used")
  public Integer getSecondIndex() {
    return secondIndex;
  }

  public void setSecondIndex(Integer secondIndex) {
    this.secondIndex = secondIndex;
  }

  public CompareImageResult secondFaceIndex(Integer secondFaceIndex) {

    this.secondFaceIndex = secondFaceIndex;
    return this;
  }

  /**
   * Faces index used to identify faces in scope of one photo.
   *
   * @return secondFaceIndex
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Faces index used to identify faces in scope of one photo.")
  public Integer getSecondFaceIndex() {
    return secondFaceIndex;
  }

  public void setSecondFaceIndex(Integer secondFaceIndex) {
    this.secondFaceIndex = secondFaceIndex;
  }

  public CompareImageResult score(BigDecimal score) {

    this.score = score;
    return this;
  }

  /**
   * Get score
   *
   * @return score
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public BigDecimal getScore() {
    return score;
  }

  public void setScore(BigDecimal score) {
    this.score = score;
  }

  public CompareImageResult similarity(BigDecimal similarity) {

    this.similarity = similarity;
    return this;
  }

  /**
   * Get similarity
   *
   * @return similarity
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public BigDecimal getSimilarity() {
    return similarity;
  }

  public void setSimilarity(BigDecimal similarity) {
    this.similarity = similarity;
  }

  public CompareImageResult errorCode(Integer errorCode) {

    this.errorCode = errorCode;
    return this;
  }

  /**
   * Get errorCode
   *
   * @return errorCode
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public Integer getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(Integer errorCode) {
    this.errorCode = errorCode;
  }

  public CompareImageResult errorMsg(String errorMsg) {

    this.errorMsg = errorMsg;
    return this;
  }

  /**
   * Get errorMsg
   *
   * @return errorMsg
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getErrorMsg() {
    return errorMsg;
  }

  public void setErrorMsg(String errorMsg) {
    this.errorMsg = errorMsg;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompareImageResult compareImageResult = (CompareImageResult) o;
    return Objects.equals(this.firstIndex, compareImageResult.firstIndex)
        && Objects.equals(this.firstFaceIndex, compareImageResult.firstFaceIndex)
        && Objects.equals(this.secondIndex, compareImageResult.secondIndex)
        && Objects.equals(this.secondFaceIndex, compareImageResult.secondFaceIndex)
        && Objects.equals(this.score, compareImageResult.score)
        && Objects.equals(this.similarity, compareImageResult.similarity)
        && Objects.equals(this.errorCode, compareImageResult.errorCode)
        && Objects.equals(this.errorMsg, compareImageResult.errorMsg);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        firstIndex,
        firstFaceIndex,
        secondIndex,
        secondFaceIndex,
        score,
        similarity,
        errorCode,
        errorMsg);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompareImageResult {\n");
    sb.append("    firstIndex: ").append(toIndentedString(firstIndex)).append("\n");
    sb.append("    firstFaceIndex: ").append(toIndentedString(firstFaceIndex)).append("\n");
    sb.append("    secondIndex: ").append(toIndentedString(secondIndex)).append("\n");
    sb.append("    secondFaceIndex: ").append(toIndentedString(secondFaceIndex)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    similarity: ").append(toIndentedString(similarity)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    errorMsg: ").append(toIndentedString(errorMsg)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
