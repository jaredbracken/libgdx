/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet;

import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;

public class btStackAlloc {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected btStackAlloc(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(btStackAlloc obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gdxBulletJNI.delete_btStackAlloc(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public btStackAlloc(long size) {
    this(gdxBulletJNI.new_btStackAlloc(size), true);
  }

  public void create(long size) {
    gdxBulletJNI.btStackAlloc_create(swigCPtr, this, size);
  }

  public void destroy() {
    gdxBulletJNI.btStackAlloc_destroy(swigCPtr, this);
  }

  public int getAvailableMemory() {
    return gdxBulletJNI.btStackAlloc_getAvailableMemory(swigCPtr, this);
  }

  public SWIGTYPE_p_unsigned_char allocate(long size) {
    long cPtr = gdxBulletJNI.btStackAlloc_allocate(swigCPtr, this, size);
    return (cPtr == 0) ? null : new SWIGTYPE_p_unsigned_char(cPtr, false);
  }

  public btBlock beginBlock() {
    long cPtr = gdxBulletJNI.btStackAlloc_beginBlock(swigCPtr, this);
    return (cPtr == 0) ? null : new btBlock(cPtr, false);
  }

  public void endBlock(btBlock block) {
    gdxBulletJNI.btStackAlloc_endBlock(swigCPtr, this, btBlock.getCPtr(block), block);
  }

}
