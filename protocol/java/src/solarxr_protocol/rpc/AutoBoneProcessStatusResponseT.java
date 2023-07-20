// automatically generated by the FlatBuffers compiler, do not modify

package solarxr_protocol.rpc;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

public class AutoBoneProcessStatusResponseT {
  private int processType;
  private long current;
  private long total;
  private boolean completed;
  private boolean success;
  private float eta;

  public int getProcessType() { return processType; }

  public void setProcessType(int processType) { this.processType = processType; }

  public long getCurrent() { return current; }

  public void setCurrent(long current) { this.current = current; }

  public long getTotal() { return total; }

  public void setTotal(long total) { this.total = total; }

  public boolean getCompleted() { return completed; }

  public void setCompleted(boolean completed) { this.completed = completed; }

  public boolean getSuccess() { return success; }

  public void setSuccess(boolean success) { this.success = success; }

  public float getEta() { return eta; }

  public void setEta(float eta) { this.eta = eta; }


  public AutoBoneProcessStatusResponseT() {
    this.processType = 0;
    this.current = 0L;
    this.total = 0L;
    this.completed = false;
    this.success = false;
    this.eta = 0.0f;
  }
}

