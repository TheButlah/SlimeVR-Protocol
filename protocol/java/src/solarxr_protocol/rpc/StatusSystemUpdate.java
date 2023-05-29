// automatically generated by the FlatBuffers compiler, do not modify

package solarxr_protocol.rpc;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

/**
 * When a new status appears, it's sent alone
 */
@SuppressWarnings("unused")
public final class StatusSystemUpdate extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_22_10_26(); }
  public static StatusSystemUpdate getRootAsStatusSystemUpdate(ByteBuffer _bb) { return getRootAsStatusSystemUpdate(_bb, new StatusSystemUpdate()); }
  public static StatusSystemUpdate getRootAsStatusSystemUpdate(ByteBuffer _bb, StatusSystemUpdate obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public StatusSystemUpdate __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public solarxr_protocol.rpc.StatusMessage newStatus() { return newStatus(new solarxr_protocol.rpc.StatusMessage()); }
  public solarxr_protocol.rpc.StatusMessage newStatus(solarxr_protocol.rpc.StatusMessage obj) { int o = __offset(4); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }

  public static int createStatusSystemUpdate(FlatBufferBuilder builder,
      int newStatusOffset) {
    builder.startTable(1);
    StatusSystemUpdate.addNewStatus(builder, newStatusOffset);
    return StatusSystemUpdate.endStatusSystemUpdate(builder);
  }

  public static void startStatusSystemUpdate(FlatBufferBuilder builder) { builder.startTable(1); }
  public static void addNewStatus(FlatBufferBuilder builder, int newStatusOffset) { builder.addOffset(0, newStatusOffset, 0); }
  public static int endStatusSystemUpdate(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public StatusSystemUpdate get(int j) { return get(new StatusSystemUpdate(), j); }
    public StatusSystemUpdate get(StatusSystemUpdate obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
  public StatusSystemUpdateT unpack() {
    StatusSystemUpdateT _o = new StatusSystemUpdateT();
    unpackTo(_o);
    return _o;
  }
  public void unpackTo(StatusSystemUpdateT _o) {
    if (newStatus() != null) _o.setNewStatus(newStatus().unpack());
    else _o.setNewStatus(null);
  }
  public static int pack(FlatBufferBuilder builder, StatusSystemUpdateT _o) {
    if (_o == null) return 0;
    int _newStatus = _o.getNewStatus() == null ? 0 : solarxr_protocol.rpc.StatusMessage.pack(builder, _o.getNewStatus());
    return createStatusSystemUpdate(
      builder,
      _newStatus);
  }
}

