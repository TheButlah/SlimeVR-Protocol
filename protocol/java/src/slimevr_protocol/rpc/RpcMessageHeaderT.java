// automatically generated by the FlatBuffers compiler, do not modify

package slimevr_protocol.rpc;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

public class RpcMessageHeaderT {
  private slimevr_protocol.datatypes.TransactionIdT txId;
  private slimevr_protocol.rpc.RpcMessageUnion message;

  public slimevr_protocol.datatypes.TransactionIdT getTxId() { return txId; }

  public void setTxId(slimevr_protocol.datatypes.TransactionIdT txId) { this.txId = txId; }

  public slimevr_protocol.rpc.RpcMessageUnion getMessage() { return message; }

  public void setMessage(slimevr_protocol.rpc.RpcMessageUnion message) { this.message = message; }


  public RpcMessageHeaderT() {
    this.txId = new slimevr_protocol.datatypes.TransactionIdT();
    this.message = null;
  }
}

