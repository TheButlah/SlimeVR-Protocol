// automatically generated by the FlatBuffers compiler, do not modify

package slimevr_protocol.rpc;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class AssignTrackerRequest extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_2_0_0(); }
  public static AssignTrackerRequest getRootAsAssignTrackerRequest(ByteBuffer _bb) { return getRootAsAssignTrackerRequest(_bb, new AssignTrackerRequest()); }
  public static AssignTrackerRequest getRootAsAssignTrackerRequest(ByteBuffer _bb, AssignTrackerRequest obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public AssignTrackerRequest __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public int id() { int o = __offset(4); return o != 0 ? bb.get(o + bb_pos) & 0xFF : 0; }
  public int role() { int o = __offset(6); return o != 0 ? bb.get(o + bb_pos) & 0xFF : 0; }
  public int mountingRotation() { int o = __offset(8); return o != 0 ? bb.getShort(o + bb_pos) & 0xFFFF : 0; }

  public static int createAssignTrackerRequest(FlatBufferBuilder builder,
      int id,
      int role,
      int mountingRotation) {
    builder.startTable(3);
    AssignTrackerRequest.addMountingRotation(builder, mountingRotation);
    AssignTrackerRequest.addRole(builder, role);
    AssignTrackerRequest.addId(builder, id);
    return AssignTrackerRequest.endAssignTrackerRequest(builder);
  }

  public static void startAssignTrackerRequest(FlatBufferBuilder builder) { builder.startTable(3); }
  public static void addId(FlatBufferBuilder builder, int id) { builder.addByte(0, (byte) id, (byte) 0); }
  public static void addRole(FlatBufferBuilder builder, int role) { builder.addByte(1, (byte) role, (byte) 0); }
  public static void addMountingRotation(FlatBufferBuilder builder, int mountingRotation) { builder.addShort(2, (short) mountingRotation, (short) 0); }
  public static int endAssignTrackerRequest(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public AssignTrackerRequest get(int j) { return get(new AssignTrackerRequest(), j); }
    public AssignTrackerRequest get(AssignTrackerRequest obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
  public AssignTrackerRequestT unpack() {
    AssignTrackerRequestT _o = new AssignTrackerRequestT();
    unpackTo(_o);
    return _o;
  }
  public void unpackTo(AssignTrackerRequestT _o) {
    int _oId = id();
    _o.setId(_oId);
    int _oRole = role();
    _o.setRole(_oRole);
    int _oMountingRotation = mountingRotation();
    _o.setMountingRotation(_oMountingRotation);
  }
  public static int pack(FlatBufferBuilder builder, AssignTrackerRequestT _o) {
    if (_o == null) return 0;
    return createAssignTrackerRequest(
      builder,
      _o.getId(),
      _o.getRole(),
      _o.getMountingRotation());
  }
}

