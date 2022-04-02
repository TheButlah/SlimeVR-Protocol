// automatically generated by the FlatBuffers compiler, do not modify

package slimevr_protocol.server;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class DeviceStatusFeatures extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_2_0_0(); }
  public static DeviceStatusFeatures getRootAsDeviceStatusFeatures(ByteBuffer _bb) { return getRootAsDeviceStatusFeatures(_bb, new DeviceStatusFeatures()); }
  public static DeviceStatusFeatures getRootAsDeviceStatusFeatures(ByteBuffer _bb, DeviceStatusFeatures obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public DeviceStatusFeatures __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public boolean name() { int o = __offset(4); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }
  public boolean role() { int o = __offset(6); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }
  public boolean mountingRotation() { int o = __offset(8); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }
  public boolean rotation() { int o = __offset(10); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }
  public boolean position() { int o = __offset(12); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }
  public boolean status() { int o = __offset(14); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }
  public boolean battery() { int o = __offset(16); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }
  public boolean computed() { int o = __offset(18); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }
  public boolean signal() { int o = __offset(20); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }
  public boolean tps() { int o = __offset(22); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }
  public boolean ping() { int o = __offset(24); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }
  public boolean editable() { int o = __offset(26); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }

  public static int createDeviceStatusFeatures(FlatBufferBuilder builder,
      boolean name,
      boolean role,
      boolean mountingRotation,
      boolean rotation,
      boolean position,
      boolean status,
      boolean battery,
      boolean computed,
      boolean signal,
      boolean tps,
      boolean ping,
      boolean editable) {
    builder.startTable(12);
    DeviceStatusFeatures.addEditable(builder, editable);
    DeviceStatusFeatures.addPing(builder, ping);
    DeviceStatusFeatures.addTps(builder, tps);
    DeviceStatusFeatures.addSignal(builder, signal);
    DeviceStatusFeatures.addComputed(builder, computed);
    DeviceStatusFeatures.addBattery(builder, battery);
    DeviceStatusFeatures.addStatus(builder, status);
    DeviceStatusFeatures.addPosition(builder, position);
    DeviceStatusFeatures.addRotation(builder, rotation);
    DeviceStatusFeatures.addMountingRotation(builder, mountingRotation);
    DeviceStatusFeatures.addRole(builder, role);
    DeviceStatusFeatures.addName(builder, name);
    return DeviceStatusFeatures.endDeviceStatusFeatures(builder);
  }

  public static void startDeviceStatusFeatures(FlatBufferBuilder builder) { builder.startTable(12); }
  public static void addName(FlatBufferBuilder builder, boolean name) { builder.addBoolean(0, name, false); }
  public static void addRole(FlatBufferBuilder builder, boolean role) { builder.addBoolean(1, role, false); }
  public static void addMountingRotation(FlatBufferBuilder builder, boolean mountingRotation) { builder.addBoolean(2, mountingRotation, false); }
  public static void addRotation(FlatBufferBuilder builder, boolean rotation) { builder.addBoolean(3, rotation, false); }
  public static void addPosition(FlatBufferBuilder builder, boolean position) { builder.addBoolean(4, position, false); }
  public static void addStatus(FlatBufferBuilder builder, boolean status) { builder.addBoolean(5, status, false); }
  public static void addBattery(FlatBufferBuilder builder, boolean battery) { builder.addBoolean(6, battery, false); }
  public static void addComputed(FlatBufferBuilder builder, boolean computed) { builder.addBoolean(7, computed, false); }
  public static void addSignal(FlatBufferBuilder builder, boolean signal) { builder.addBoolean(8, signal, false); }
  public static void addTps(FlatBufferBuilder builder, boolean tps) { builder.addBoolean(9, tps, false); }
  public static void addPing(FlatBufferBuilder builder, boolean ping) { builder.addBoolean(10, ping, false); }
  public static void addEditable(FlatBufferBuilder builder, boolean editable) { builder.addBoolean(11, editable, false); }
  public static int endDeviceStatusFeatures(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public DeviceStatusFeatures get(int j) { return get(new DeviceStatusFeatures(), j); }
    public DeviceStatusFeatures get(DeviceStatusFeatures obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
}

