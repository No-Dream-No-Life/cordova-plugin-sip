/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua2;

public class CallMediaInfo {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    protected CallMediaInfo(long cPtr, boolean cMemoryOwn) {
        swigCMemOwn = cMemoryOwn;
        swigCPtr = cPtr;
    }

    public CallMediaInfo() {
        this(pjsua2JNI.new_CallMediaInfo(), true);
    }

    protected static long getCPtr(CallMediaInfo obj) {
        return (obj == null) ? 0 : obj.swigCPtr;
    }

    protected void finalize() {
        delete();
    }

    public synchronized void delete() {
        if (swigCPtr != 0) {
            if (swigCMemOwn) {
                swigCMemOwn = false;
                pjsua2JNI.delete_CallMediaInfo(swigCPtr);
            }
            swigCPtr = 0;
        }
    }

    public long getIndex() {
        return pjsua2JNI.CallMediaInfo_index_get(swigCPtr, this);
    }

    public void setIndex(long value) {
        pjsua2JNI.CallMediaInfo_index_set(swigCPtr, this, value);
    }

    public pjmedia_type getType() {
        return pjmedia_type.swigToEnum(pjsua2JNI.CallMediaInfo_type_get(swigCPtr, this));
    }

    public void setType(pjmedia_type value) {
        pjsua2JNI.CallMediaInfo_type_set(swigCPtr, this, value.swigValue());
    }

    public pjmedia_dir getDir() {
        return pjmedia_dir.swigToEnum(pjsua2JNI.CallMediaInfo_dir_get(swigCPtr, this));
    }

    public void setDir(pjmedia_dir value) {
        pjsua2JNI.CallMediaInfo_dir_set(swigCPtr, this, value.swigValue());
    }

    public pjsua_call_media_status getStatus() {
        return pjsua_call_media_status.swigToEnum(pjsua2JNI.CallMediaInfo_status_get(swigCPtr, this));
    }

    public void setStatus(pjsua_call_media_status value) {
        pjsua2JNI.CallMediaInfo_status_set(swigCPtr, this, value.swigValue());
    }

    public int getAudioConfSlot() {
        return pjsua2JNI.CallMediaInfo_audioConfSlot_get(swigCPtr, this);
    }

    public void setAudioConfSlot(int value) {
        pjsua2JNI.CallMediaInfo_audioConfSlot_set(swigCPtr, this, value);
    }

    public int getVideoIncomingWindowId() {
        return pjsua2JNI.CallMediaInfo_videoIncomingWindowId_get(swigCPtr, this);
    }

    public void setVideoIncomingWindowId(int value) {
        pjsua2JNI.CallMediaInfo_videoIncomingWindowId_set(swigCPtr, this, value);
    }

    public VideoWindow getVideoWindow() {
        long cPtr = pjsua2JNI.CallMediaInfo_videoWindow_get(swigCPtr, this);
        return (cPtr == 0) ? null : new VideoWindow(cPtr, false);
    }

    public void setVideoWindow(VideoWindow value) {
        pjsua2JNI.CallMediaInfo_videoWindow_set(swigCPtr, this, VideoWindow.getCPtr(value), value);
    }

    public int getVideoCapDev() {
        return pjsua2JNI.CallMediaInfo_videoCapDev_get(swigCPtr, this);
    }

    public void setVideoCapDev(int value) {
        pjsua2JNI.CallMediaInfo_videoCapDev_set(swigCPtr, this, value);
    }

}
