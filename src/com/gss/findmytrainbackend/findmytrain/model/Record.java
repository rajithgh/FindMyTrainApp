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
 * Model definition for Record.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the findmytrain. For a detailed explanation see:
 * <a href="http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Record extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String comment;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long id;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String station;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer status;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String timeStamp;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Train train;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getComment() {
    return comment;
  }

  /**
   * @param comment comment or {@code null} for none
   */
  public Record setComment(java.lang.String comment) {
    this.comment = comment;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getId() {
    return id;
  }

  /**
   * @param id id or {@code null} for none
   */
  public Record setId(java.lang.Long id) {
    this.id = id;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getStation() {
    return station;
  }

  /**
   * @param station station or {@code null} for none
   */
  public Record setStation(java.lang.String station) {
    this.station = station;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getStatus() {
    return status;
  }

  /**
   * @param status status or {@code null} for none
   */
  public Record setStatus(java.lang.Integer status) {
    this.status = status;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getTimeStamp() {
    return timeStamp;
  }

  /**
   * @param timeStamp timeStamp or {@code null} for none
   */
  public Record setTimeStamp(java.lang.String timeStamp) {
    this.timeStamp = timeStamp;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public Train getTrain() {
    return train;
  }

  /**
   * @param train train or {@code null} for none
   */
  public Record setTrain(Train train) {
    this.train = train;
    return this;
  }

  @Override
  public Record set(String fieldName, Object value) {
    return (Record) super.set(fieldName, value);
  }

  @Override
  public Record clone() {
    return (Record) super.clone();
  }

}
