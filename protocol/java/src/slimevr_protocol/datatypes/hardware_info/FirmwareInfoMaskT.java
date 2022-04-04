// automatically generated by the FlatBuffers compiler, do not modify

package slimevr_protocol.datatypes.hardware_info;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

public class FirmwareInfoMaskT {
  private boolean mcuId;
  private boolean imuIds;
  private boolean displayName;
  private boolean model;
  private boolean manufacturer;
  private boolean hardwareRevision;
  private boolean firmwareVersion;
  private boolean macAddress;

  public boolean getMcuId() { return mcuId; }

  public void setMcuId(boolean mcuId) { this.mcuId = mcuId; }

  public boolean getImuIds() { return imuIds; }

  public void setImuIds(boolean imuIds) { this.imuIds = imuIds; }

  public boolean getDisplayName() { return displayName; }

  public void setDisplayName(boolean displayName) { this.displayName = displayName; }

  public boolean getModel() { return model; }

  public void setModel(boolean model) { this.model = model; }

  public boolean getManufacturer() { return manufacturer; }

  public void setManufacturer(boolean manufacturer) { this.manufacturer = manufacturer; }

  public boolean getHardwareRevision() { return hardwareRevision; }

  public void setHardwareRevision(boolean hardwareRevision) { this.hardwareRevision = hardwareRevision; }

  public boolean getFirmwareVersion() { return firmwareVersion; }

  public void setFirmwareVersion(boolean firmwareVersion) { this.firmwareVersion = firmwareVersion; }

  public boolean getMacAddress() { return macAddress; }

  public void setMacAddress(boolean macAddress) { this.macAddress = macAddress; }


  public FirmwareInfoMaskT() {
    this.mcuId = false;
    this.imuIds = false;
    this.displayName = false;
    this.model = false;
    this.manufacturer = false;
    this.hardwareRevision = false;
    this.firmwareVersion = false;
    this.macAddress = false;
  }
}

