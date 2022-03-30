// automatically generated by the FlatBuffers compiler, do not modify

package slimevr_protocol.firmware;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class SensorReport extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_2_0_0(); }
  public static SensorReport getRootAsSensorReport(ByteBuffer _bb) { return getRootAsSensorReport(_bb, new SensorReport()); }
  public static SensorReport getRootAsSensorReport(ByteBuffer _bb, SensorReport obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public SensorReport __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public slimevr_protocol.datatypes.Quat orientation(int j) { return orientation(new slimevr_protocol.datatypes.Quat(), j); }
  public slimevr_protocol.datatypes.Quat orientation(slimevr_protocol.datatypes.Quat obj, int j) { int o = __offset(4); return o != 0 ? obj.__assign(__vector(o) + j * 16, bb) : null; }
  public int orientationLength() { int o = __offset(4); return o != 0 ? __vector_len(o) : 0; }
  public slimevr_protocol.datatypes.Quat.Vector orientationVector() { return orientationVector(new slimevr_protocol.datatypes.Quat.Vector()); }
  public slimevr_protocol.datatypes.Quat.Vector orientationVector(slimevr_protocol.datatypes.Quat.Vector obj) { int o = __offset(4); return o != 0 ? obj.__assign(__vector(o), 16, bb) : null; }
  public slimevr_protocol.datatypes.Vec3f rawTransAccel(int j) { return rawTransAccel(new slimevr_protocol.datatypes.Vec3f(), j); }
  public slimevr_protocol.datatypes.Vec3f rawTransAccel(slimevr_protocol.datatypes.Vec3f obj, int j) { int o = __offset(6); return o != 0 ? obj.__assign(__vector(o) + j * 12, bb) : null; }
  public int rawTransAccelLength() { int o = __offset(6); return o != 0 ? __vector_len(o) : 0; }
  public slimevr_protocol.datatypes.Vec3f.Vector rawTransAccelVector() { return rawTransAccelVector(new slimevr_protocol.datatypes.Vec3f.Vector()); }
  public slimevr_protocol.datatypes.Vec3f.Vector rawTransAccelVector(slimevr_protocol.datatypes.Vec3f.Vector obj) { int o = __offset(6); return o != 0 ? obj.__assign(__vector(o), 12, bb) : null; }
  public slimevr_protocol.datatypes.Vec3f rawRotVel(int j) { return rawRotVel(new slimevr_protocol.datatypes.Vec3f(), j); }
  public slimevr_protocol.datatypes.Vec3f rawRotVel(slimevr_protocol.datatypes.Vec3f obj, int j) { int o = __offset(8); return o != 0 ? obj.__assign(__vector(o) + j * 12, bb) : null; }
  public int rawRotVelLength() { int o = __offset(8); return o != 0 ? __vector_len(o) : 0; }
  public slimevr_protocol.datatypes.Vec3f.Vector rawRotVelVector() { return rawRotVelVector(new slimevr_protocol.datatypes.Vec3f.Vector()); }
  public slimevr_protocol.datatypes.Vec3f.Vector rawRotVelVector(slimevr_protocol.datatypes.Vec3f.Vector obj) { int o = __offset(8); return o != 0 ? obj.__assign(__vector(o), 12, bb) : null; }

  public static int createSensorReport(FlatBufferBuilder builder,
      int orientationOffset,
      int rawTransAccelOffset,
      int rawRotVelOffset) {
    builder.startTable(3);
    SensorReport.addRawRotVel(builder, rawRotVelOffset);
    SensorReport.addRawTransAccel(builder, rawTransAccelOffset);
    SensorReport.addOrientation(builder, orientationOffset);
    return SensorReport.endSensorReport(builder);
  }

  public static void startSensorReport(FlatBufferBuilder builder) { builder.startTable(3); }
  public static void addOrientation(FlatBufferBuilder builder, int orientationOffset) { builder.addOffset(0, orientationOffset, 0); }
  public static void startOrientationVector(FlatBufferBuilder builder, int numElems) { builder.startVector(16, numElems, 4); }
  public static void addRawTransAccel(FlatBufferBuilder builder, int rawTransAccelOffset) { builder.addOffset(1, rawTransAccelOffset, 0); }
  public static void startRawTransAccelVector(FlatBufferBuilder builder, int numElems) { builder.startVector(12, numElems, 4); }
  public static void addRawRotVel(FlatBufferBuilder builder, int rawRotVelOffset) { builder.addOffset(2, rawRotVelOffset, 0); }
  public static void startRawRotVelVector(FlatBufferBuilder builder, int numElems) { builder.startVector(12, numElems, 4); }
  public static int endSensorReport(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public SensorReport get(int j) { return get(new SensorReport(), j); }
    public SensorReport get(SensorReport obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
}

