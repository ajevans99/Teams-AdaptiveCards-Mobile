/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.adaptivecards.objectmodel;

public class Container extends CollectionTypeElement {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected Container(long cPtr, boolean cMemoryOwn) {
    super(AdaptiveCardObjectModelJNI.Container_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Container obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void swigSetCMemOwn(boolean own) {
    swigCMemOwnDerived = own;
    super.swigSetCMemOwn(own);
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwnDerived) {
        swigCMemOwnDerived = false;
        AdaptiveCardObjectModelJNI.delete_Container(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public Container() {
    this(AdaptiveCardObjectModelJNI.new_Container__SWIG_0(), true);
  }

  public Container(Container arg0) {
    this(AdaptiveCardObjectModelJNI.new_Container__SWIG_1(Container.getCPtr(arg0), arg0), true);
  }

  public JsonValue SerializeToJsonValue() {
    return new JsonValue(AdaptiveCardObjectModelJNI.Container_SerializeToJsonValue(swigCPtr, this), true);
  }

  public void DeserializeChildren(ParseContext context, JsonValue value) {
    AdaptiveCardObjectModelJNI.Container_DeserializeChildren(swigCPtr, this, ParseContext.getCPtr(context), context, JsonValue.getCPtr(value), value);
  }

  public BaseCardElementVector GetItems() {
    return new BaseCardElementVector(AdaptiveCardObjectModelJNI.Container_GetItems__SWIG_0(swigCPtr, this), false);
  }

  public Boolean GetRtl() {
  return AdaptiveCardObjectModelJNI.Container_GetRtl(swigCPtr, this);
}

  public void SetRtl(Boolean value) {
    AdaptiveCardObjectModelJNI.Container_SetRtl(swigCPtr, this, value);
  }

  public void GetResourceInformation(RemoteResourceInformationVector resourceInfo) {
    AdaptiveCardObjectModelJNI.Container_GetResourceInformation(swigCPtr, this, RemoteResourceInformationVector.getCPtr(resourceInfo), resourceInfo);
  }

  public static Container dynamic_cast(BaseCardElement baseCardElement) {
    long cPtr = AdaptiveCardObjectModelJNI.Container_dynamic_cast(BaseCardElement.getCPtr(baseCardElement), baseCardElement);
    return (cPtr == 0) ? null : new Container(cPtr, true);
  }

}
