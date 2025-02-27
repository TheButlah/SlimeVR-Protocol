// automatically generated by the FlatBuffers compiler, do not modify

package solarxr_protocol.datatypes;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

/**
 * To be used inside unions
 */
@SuppressWarnings("unused")
public final class DeviceIdTable extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_22_10_26(); }
  public static DeviceIdTable getRootAsDeviceIdTable(ByteBuffer _bb) { return getRootAsDeviceIdTable(_bb, new DeviceIdTable()); }
  public static DeviceIdTable getRootAsDeviceIdTable(ByteBuffer _bb, DeviceIdTable obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public DeviceIdTable __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public solarxr_protocol.datatypes.DeviceId id() { return id(new solarxr_protocol.datatypes.DeviceId()); }
  public solarxr_protocol.datatypes.DeviceId id(solarxr_protocol.datatypes.DeviceId obj) { int o = __offset(4); return o != 0 ? obj.__assign(o + bb_pos, bb) : null; }

  public static void startDeviceIdTable(FlatBufferBuilder builder) { builder.startTable(1); }
  public static void addId(FlatBufferBuilder builder, int idOffset) { builder.addStruct(0, idOffset, 0); }
  public static int endDeviceIdTable(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public DeviceIdTable get(int j) { return get(new DeviceIdTable(), j); }
    public DeviceIdTable get(DeviceIdTable obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
  public DeviceIdTableT unpack() {
    DeviceIdTableT _o = new DeviceIdTableT();
    unpackTo(_o);
    return _o;
  }
  public void unpackTo(DeviceIdTableT _o) {
    if (id() != null) id().unpackTo(_o.getId());
    else _o.setId(null);
  }
  public static int pack(FlatBufferBuilder builder, DeviceIdTableT _o) {
    if (_o == null) return 0;
    startDeviceIdTable(builder);
    addId(builder, solarxr_protocol.datatypes.DeviceId.pack(builder, _o.getId()));
    return endDeviceIdTable(builder);
  }
}

