// automatically generated by the FlatBuffers compiler, do not modify

package solarxr_protocol.rpc;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class ResetResponse extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_22_10_26(); }
  public static ResetResponse getRootAsResetResponse(ByteBuffer _bb) { return getRootAsResetResponse(_bb, new ResetResponse()); }
  public static ResetResponse getRootAsResetResponse(ByteBuffer _bb, ResetResponse obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public ResetResponse __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }


  public static void startResetResponse(FlatBufferBuilder builder) { builder.startTable(0); }
  public static int endResetResponse(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public ResetResponse get(int j) { return get(new ResetResponse(), j); }
    public ResetResponse get(ResetResponse obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
  public ResetResponseT unpack() {
    ResetResponseT _o = new ResetResponseT();
    unpackTo(_o);
    return _o;
  }
  public void unpackTo(ResetResponseT _o) {
  }
  public static int pack(FlatBufferBuilder builder, ResetResponseT _o) {
    if (_o == null) return 0;
    startResetResponse(builder);
    return endResetResponse(builder);
  }
}

