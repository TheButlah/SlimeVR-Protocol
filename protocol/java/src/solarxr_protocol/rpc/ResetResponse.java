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

  public int resetType() { int o = __offset(4); return o != 0 ? bb.get(o + bb_pos) & 0xFF : 0; }
  public int status() { int o = __offset(6); return o != 0 ? bb.get(o + bb_pos) & 0xFF : 0; }

  public static int createResetResponse(FlatBufferBuilder builder,
      int resetType,
      int status) {
    builder.startTable(2);
    ResetResponse.addStatus(builder, status);
    ResetResponse.addResetType(builder, resetType);
    return ResetResponse.endResetResponse(builder);
  }

  public static void startResetResponse(FlatBufferBuilder builder) { builder.startTable(2); }
  public static void addResetType(FlatBufferBuilder builder, int resetType) { builder.addByte(0, (byte) resetType, (byte) 0); }
  public static void addStatus(FlatBufferBuilder builder, int status) { builder.addByte(1, (byte) status, (byte) 0); }
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
    int _oResetType = resetType();
    _o.setResetType(_oResetType);
    int _oStatus = status();
    _o.setStatus(_oStatus);
  }
  public static int pack(FlatBufferBuilder builder, ResetResponseT _o) {
    if (_o == null) return 0;
    return createResetResponse(
      builder,
      _o.getResetType(),
      _o.getStatus());
  }
}

