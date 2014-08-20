/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://code.google.com/p/google-apis-client-generator/
 * (build: 2014-07-22 21:53:01 UTC)
 * on 2014-08-20 at 13:15:14 UTC 
 * Modify at your own risk.
 */

package com.gss.findmytrainbackend.findmytrain.model;

/**
 * Model definition for Train.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the findmytrain. For a detailed explanation see:
 * <a href="http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Train extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String destination;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String start;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Stop> stops;

  static {
    // hack to force ProGuard to consider Stop used, since otherwise it would be stripped out
    // see http://code.google.com/p/google-api-java-client/issues/detail?id=528
    com.google.api.client.util.Data.nullOf(Stop.class);
  }

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String trainid;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getDestination() {
    return destination;
  }

  /**
   * @param destination destination or {@code null} for none
   */
  public Train setDestination(java.lang.String destination) {
    this.destination = destination;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getStart() {
    return start;
  }

  /**
   * @param start start or {@code null} for none
   */
  public Train setStart(java.lang.String start) {
    this.start = start;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<Stop> getStops() {
    return stops;
  }

  /**
   * @param stops stops or {@code null} for none
   */
  public Train setStops(java.util.List<Stop> stops) {
    this.stops = stops;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getTrainid() {
    return trainid;
  }

  /**
   * @param trainid trainid or {@code null} for none
   */
  public Train setTrainid(java.lang.String trainid) {
    this.trainid = trainid;
    return this;
  }

  @Override
  public Train set(String fieldName, Object value) {
    return (Train) super.set(fieldName, value);
  }

  @Override
  public Train clone() {
    return (Train) super.clone();
  }

}
