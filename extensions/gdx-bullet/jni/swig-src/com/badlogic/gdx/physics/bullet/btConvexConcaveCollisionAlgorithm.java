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

public class btConvexConcaveCollisionAlgorithm extends btActivatingCollisionAlgorithm {
  private long swigCPtr;

  protected btConvexConcaveCollisionAlgorithm(long cPtr, boolean cMemoryOwn) {
    super(gdxBulletJNI.btConvexConcaveCollisionAlgorithm_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(btConvexConcaveCollisionAlgorithm obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gdxBulletJNI.delete_btConvexConcaveCollisionAlgorithm(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public btConvexConcaveCollisionAlgorithm(btCollisionAlgorithmConstructionInfo ci, SWIGTYPE_p_btCollisionObjectWrapper body0Wrap, SWIGTYPE_p_btCollisionObjectWrapper body1Wrap, boolean isSwapped) {
    this(gdxBulletJNI.new_btConvexConcaveCollisionAlgorithm(btCollisionAlgorithmConstructionInfo.getCPtr(ci), ci, SWIGTYPE_p_btCollisionObjectWrapper.getCPtr(body0Wrap), SWIGTYPE_p_btCollisionObjectWrapper.getCPtr(body1Wrap), isSwapped), true);
  }

  public void clearCache() {
    gdxBulletJNI.btConvexConcaveCollisionAlgorithm_clearCache(swigCPtr, this);
  }

}
