// automatically generated by the FlatBuffers compiler, do not modify

package solarxr_protocol.device;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

public class PairingInfoT {
  private solarxr_protocol.datatypes.hardware_info.HardwareAddressT hardwareAddress;
  private boolean paired;

  public solarxr_protocol.datatypes.hardware_info.HardwareAddressT getHardwareAddress() { return hardwareAddress; }

  public void setHardwareAddress(solarxr_protocol.datatypes.hardware_info.HardwareAddressT hardwareAddress) { this.hardwareAddress = hardwareAddress; }

  public boolean getPaired() { return paired; }

  public void setPaired(boolean paired) { this.paired = paired; }


  public PairingInfoT() {
    this.hardwareAddress = new solarxr_protocol.datatypes.hardware_info.HardwareAddressT();
    this.paired = false;
  }
}

