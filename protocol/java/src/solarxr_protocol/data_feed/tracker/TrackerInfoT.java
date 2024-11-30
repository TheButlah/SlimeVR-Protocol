// automatically generated by the FlatBuffers compiler, do not modify

package solarxr_protocol.data_feed.tracker;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

public class TrackerInfoT {
  private int imuType;
  private int bodyPart;
  private solarxr_protocol.datatypes.HzF32T pollRate;
  private solarxr_protocol.datatypes.math.QuatT mountingOrientation;
  private boolean editable;
  private boolean isComputed;
  private boolean isImu;
  private String displayName;
  private String customName;
  private boolean allowDriftCompensation;
  private solarxr_protocol.datatypes.math.QuatT mountingResetOrientation;
  private boolean isHmd;
  private int magnetometer;
  private int dataSupport;

  public int getImuType() { return imuType; }

  public void setImuType(int imuType) { this.imuType = imuType; }

  public int getBodyPart() { return bodyPart; }

  public void setBodyPart(int bodyPart) { this.bodyPart = bodyPart; }

  public solarxr_protocol.datatypes.HzF32T getPollRate() { return pollRate; }

  public void setPollRate(solarxr_protocol.datatypes.HzF32T pollRate) { this.pollRate = pollRate; }

  public solarxr_protocol.datatypes.math.QuatT getMountingOrientation() { return mountingOrientation; }

  public void setMountingOrientation(solarxr_protocol.datatypes.math.QuatT mountingOrientation) { this.mountingOrientation = mountingOrientation; }

  public boolean getEditable() { return editable; }

  public void setEditable(boolean editable) { this.editable = editable; }

  public boolean getIsComputed() { return isComputed; }

  public void setIsComputed(boolean isComputed) { this.isComputed = isComputed; }

  public boolean getIsImu() { return isImu; }

  public void setIsImu(boolean isImu) { this.isImu = isImu; }

  public String getDisplayName() { return displayName; }

  public void setDisplayName(String displayName) { this.displayName = displayName; }

  public String getCustomName() { return customName; }

  public void setCustomName(String customName) { this.customName = customName; }

  public boolean getAllowDriftCompensation() { return allowDriftCompensation; }

  public void setAllowDriftCompensation(boolean allowDriftCompensation) { this.allowDriftCompensation = allowDriftCompensation; }

  public solarxr_protocol.datatypes.math.QuatT getMountingResetOrientation() { return mountingResetOrientation; }

  public void setMountingResetOrientation(solarxr_protocol.datatypes.math.QuatT mountingResetOrientation) { this.mountingResetOrientation = mountingResetOrientation; }

  public boolean getIsHmd() { return isHmd; }

  public void setIsHmd(boolean isHmd) { this.isHmd = isHmd; }

  public int getMagnetometer() { return magnetometer; }

  public void setMagnetometer(int magnetometer) { this.magnetometer = magnetometer; }

  public int getDataSupport() { return dataSupport; }

  public void setDataSupport(int dataSupport) { this.dataSupport = dataSupport; }


  public TrackerInfoT() {
    this.imuType = 0;
    this.bodyPart = 0;
    this.pollRate = new solarxr_protocol.datatypes.HzF32T();
    this.mountingOrientation = new solarxr_protocol.datatypes.math.QuatT();
    this.editable = false;
    this.isComputed = false;
    this.isImu = false;
    this.displayName = null;
    this.customName = null;
    this.allowDriftCompensation = false;
    this.mountingResetOrientation = new solarxr_protocol.datatypes.math.QuatT();
    this.isHmd = false;
    this.magnetometer = 0;
    this.dataSupport = 0;
  }
}

