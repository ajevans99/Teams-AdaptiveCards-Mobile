/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.microsoft.adaptivecards.objectmodel;

public class TextInputConfig {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected TextInputConfig(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(TextInputConfig obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        AdaptiveCardObjectModelJNI.delete_TextInputConfig(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setSeparation(SeparationConfig value) {
    AdaptiveCardObjectModelJNI.TextInputConfig_separation_set(swigCPtr, this, SeparationConfig.getCPtr(value), value);
  }

  public SeparationConfig getSeparation() {
    long cPtr = AdaptiveCardObjectModelJNI.TextInputConfig_separation_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SeparationConfig(cPtr, false);
  }

  public TextInputConfig() {
    this(AdaptiveCardObjectModelJNI.new_TextInputConfig(), true);
  }

}
