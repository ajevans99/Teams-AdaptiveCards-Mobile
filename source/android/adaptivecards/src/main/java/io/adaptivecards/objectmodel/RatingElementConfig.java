/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.adaptivecards.objectmodel;

public class RatingElementConfig {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected RatingElementConfig(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RatingElementConfig obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        AdaptiveCardObjectModelJNI.delete_RatingElementConfig(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setFilledStar(RatingStarCofig value) {
    AdaptiveCardObjectModelJNI.RatingElementConfig_filledStar_set(swigCPtr, this, RatingStarCofig.getCPtr(value), value);
  }

  public RatingStarCofig getFilledStar() {
    long cPtr = AdaptiveCardObjectModelJNI.RatingElementConfig_filledStar_get(swigCPtr, this);
    return (cPtr == 0) ? null : new RatingStarCofig(cPtr, false);
  }

  public void setEmptyStar(RatingStarCofig value) {
    AdaptiveCardObjectModelJNI.RatingElementConfig_emptyStar_set(swigCPtr, this, RatingStarCofig.getCPtr(value), value);
  }

  public RatingStarCofig getEmptyStar() {
    long cPtr = AdaptiveCardObjectModelJNI.RatingElementConfig_emptyStar_get(swigCPtr, this);
    return (cPtr == 0) ? null : new RatingStarCofig(cPtr, false);
  }

  public void setRatingTextColor(String value) {
    AdaptiveCardObjectModelJNI.RatingElementConfig_ratingTextColor_set(swigCPtr, this, value);
  }

  public String getRatingTextColor() {
    return AdaptiveCardObjectModelJNI.RatingElementConfig_ratingTextColor_get(swigCPtr, this);
  }

  public void setCountTextColor(String value) {
    AdaptiveCardObjectModelJNI.RatingElementConfig_countTextColor_set(swigCPtr, this, value);
  }

  public String getCountTextColor() {
    return AdaptiveCardObjectModelJNI.RatingElementConfig_countTextColor_get(swigCPtr, this);
  }

  public static RatingElementConfig Deserialize(JsonValue json, RatingElementConfig defaultValue) {
    return new RatingElementConfig(AdaptiveCardObjectModelJNI.RatingElementConfig_Deserialize(JsonValue.getCPtr(json), json, RatingElementConfig.getCPtr(defaultValue), defaultValue), true);
  }

  public RatingElementConfig() {
    this(AdaptiveCardObjectModelJNI.new_RatingElementConfig(), true);
  }

}
