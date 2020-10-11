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

/**
 * DepthLivenessItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DepthLivenessItem {
  public static final String SERIALIZED_NAME_DATA_SCENE = "dataScene";
  @SerializedName(SERIALIZED_NAME_DATA_SCENE)
  private byte[] dataScene;

  public static final String SERIALIZED_NAME_DATA_DEPTH = "dataDepth";
  @SerializedName(SERIALIZED_NAME_DATA_DEPTH)
  private byte[] dataDepth;

  public static final String SERIALIZED_NAME_DEPTH_SCALE = "depthScale";
  @SerializedName(SERIALIZED_NAME_DEPTH_SCALE)
  private Float depthScale;


  public DepthLivenessItem dataScene(byte[] dataScene) {
    
    this.dataScene = dataScene;
    return this;
  }

   /**
   * Base64 encoded image
   * @return dataScene
  **/
  @ApiModelProperty(required = true, value = "Base64 encoded image")

  public byte[] getDataScene() {
    return dataScene;
  }


  public void setDataScene(byte[] dataScene) {
    this.dataScene = dataScene;
  }


  public DepthLivenessItem dataDepth(byte[] dataDepth) {
    
    this.dataDepth = dataDepth;
    return this;
  }

   /**
   * Base64 encoded image
   * @return dataDepth
  **/
  @ApiModelProperty(required = true, value = "Base64 encoded image")

  public byte[] getDataDepth() {
    return dataDepth;
  }


  public void setDataDepth(byte[] dataDepth) {
    this.dataDepth = dataDepth;
  }


  public DepthLivenessItem depthScale(Float depthScale) {
    
    this.depthScale = depthScale;
    return this;
  }

   /**
   * Normalized factor for color depth.
   * @return depthScale
  **/
  @ApiModelProperty(required = true, value = "Normalized factor for color depth.")

  public Float getDepthScale() {
    return depthScale;
  }


  public void setDepthScale(Float depthScale) {
    this.depthScale = depthScale;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DepthLivenessItem depthLivenessItem = (DepthLivenessItem) o;
    return Arrays.equals(this.dataScene, depthLivenessItem.dataScene) &&
        Arrays.equals(this.dataDepth, depthLivenessItem.dataDepth) &&
        Objects.equals(this.depthScale, depthLivenessItem.depthScale);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Arrays.hashCode(dataScene), Arrays.hashCode(dataDepth), depthScale);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DepthLivenessItem {\n");
    sb.append("    dataScene: ").append(toIndentedString(dataScene)).append("\n");
    sb.append("    dataDepth: ").append(toIndentedString(dataDepth)).append("\n");
    sb.append("    depthScale: ").append(toIndentedString(depthScale)).append("\n");
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
