// automatically generated by the FlatBuffers compiler, do not modify

package slimevr_protocol.datatypes.tracker;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

/**
 * Contains all the relevant sensor data about a tracker. A tracker is anything that
 * provides kinematic data about a particular body part.
 *
 * Trackers may be synthetic/computed or instead part of an actual hardware device.
 */
@SuppressWarnings("unused")
public final class TrackerStatus extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_2_0_0(); }
  public static TrackerStatus getRootAsTrackerStatus(ByteBuffer _bb) { return getRootAsTrackerStatus(_bb, new TrackerStatus()); }
  public static TrackerStatus getRootAsTrackerStatus(ByteBuffer _bb, TrackerStatus obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public TrackerStatus __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  /**
   * The user-assigned role of the tracker.
   */
  public boolean hasBodyPosition() { return 0 != __offset(4); }
  public int bodyPosition() { int o = __offset(4); return o != 0 ? bb.get(o + bb_pos) & 0xFF : 0; }
  public slimevr_protocol.datatypes.math.Quat orientation() { return orientation(new slimevr_protocol.datatypes.math.Quat()); }
  public slimevr_protocol.datatypes.math.Quat orientation(slimevr_protocol.datatypes.math.Quat obj) { int o = __offset(6); return o != 0 ? obj.__assign(o + bb_pos, bb) : null; }
  /**
   * Position, in meters
   */
  public slimevr_protocol.datatypes.math.Vec3f position() { return position(new slimevr_protocol.datatypes.math.Vec3f()); }
  public slimevr_protocol.datatypes.math.Vec3f position(slimevr_protocol.datatypes.math.Vec3f obj) { int o = __offset(8); return o != 0 ? obj.__assign(o + bb_pos, bb) : null; }
  /**
   * Raw rotational velocity, in euler angles
   */
  public slimevr_protocol.datatypes.math.Vec3f rawRotVel() { return rawRotVel(new slimevr_protocol.datatypes.math.Vec3f()); }
  public slimevr_protocol.datatypes.math.Vec3f rawRotVel(slimevr_protocol.datatypes.math.Vec3f obj) { int o = __offset(10); return o != 0 ? obj.__assign(o + bb_pos, bb) : null; }
  /**
   * Raw translational acceleration, in m/s^2
   */
  public slimevr_protocol.datatypes.math.Vec3f rawTransAccel() { return rawTransAccel(new slimevr_protocol.datatypes.math.Vec3f()); }
  public slimevr_protocol.datatypes.math.Vec3f rawTransAccel(slimevr_protocol.datatypes.math.Vec3f obj) { int o = __offset(12); return o != 0 ? obj.__assign(o + bb_pos, bb) : null; }
  /**
   * Temperature in degrees celsius
   */
  public boolean hasTemp() { return 0 != __offset(14); }
  public float temp() { int o = __offset(14); return o != 0 ? bb.getFloat(o + bb_pos) : 0f; }
  /**
   * average samples per second
   */
  public boolean hasPollRate() { return 0 != __offset(16); }
  public float pollRate() { int o = __offset(16); return o != 0 ? bb.getFloat(o + bb_pos) : 0f; }
  /**
   * The orientation of the tracker when mounted on the body
   */
  public slimevr_protocol.datatypes.math.Quat mountingOrientation() { return mountingOrientation(new slimevr_protocol.datatypes.math.Quat()); }
  public slimevr_protocol.datatypes.math.Quat mountingOrientation(slimevr_protocol.datatypes.math.Quat obj) { int o = __offset(18); return o != 0 ? obj.__assign(o + bb_pos, bb) : null; }

  public static void startTrackerStatus(FlatBufferBuilder builder) { builder.startTable(8); }
  public static void addBodyPosition(FlatBufferBuilder builder, int bodyPosition) { builder.addByte(0, (byte) bodyPosition, (byte) 0); }
  public static void addOrientation(FlatBufferBuilder builder, int orientationOffset) { builder.addStruct(1, orientationOffset, 0); }
  public static void addPosition(FlatBufferBuilder builder, int positionOffset) { builder.addStruct(2, positionOffset, 0); }
  public static void addRawRotVel(FlatBufferBuilder builder, int rawRotVelOffset) { builder.addStruct(3, rawRotVelOffset, 0); }
  public static void addRawTransAccel(FlatBufferBuilder builder, int rawTransAccelOffset) { builder.addStruct(4, rawTransAccelOffset, 0); }
  public static void addTemp(FlatBufferBuilder builder, float temp) { builder.addFloat(5, temp, 0f); }
  public static void addPollRate(FlatBufferBuilder builder, float pollRate) { builder.addFloat(6, pollRate, 0f); }
  public static void addMountingOrientation(FlatBufferBuilder builder, int mountingOrientationOffset) { builder.addStruct(7, mountingOrientationOffset, 0); }
  public static int endTrackerStatus(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public TrackerStatus get(int j) { return get(new TrackerStatus(), j); }
    public TrackerStatus get(TrackerStatus obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
  public TrackerStatusT unpack() {
    TrackerStatusT _o = new TrackerStatusT();
    unpackTo(_o);
    return _o;
  }
  public void unpackTo(TrackerStatusT _o) {
    Integer _oBodyPosition = hasBodyPosition() ? bodyPosition() : null;
    _o.setBodyPosition(_oBodyPosition);
    if (orientation() != null) orientation().unpackTo(_o.getOrientation());
    else _o.setOrientation(null);
    if (position() != null) position().unpackTo(_o.getPosition());
    else _o.setPosition(null);
    if (rawRotVel() != null) rawRotVel().unpackTo(_o.getRawRotVel());
    else _o.setRawRotVel(null);
    if (rawTransAccel() != null) rawTransAccel().unpackTo(_o.getRawTransAccel());
    else _o.setRawTransAccel(null);
    Float _oTemp = hasTemp() ? temp() : null;
    _o.setTemp(_oTemp);
    Float _oPollRate = hasPollRate() ? pollRate() : null;
    _o.setPollRate(_oPollRate);
    if (mountingOrientation() != null) mountingOrientation().unpackTo(_o.getMountingOrientation());
    else _o.setMountingOrientation(null);
  }
  public static int pack(FlatBufferBuilder builder, TrackerStatusT _o) {
    if (_o == null) return 0;
    startTrackerStatus(builder);
    if (_o.getBodyPosition() != null) { addBodyPosition(builder, _o.getBodyPosition()); }
    addOrientation(builder, slimevr_protocol.datatypes.math.Quat.pack(builder, _o.getOrientation()));
    addPosition(builder, slimevr_protocol.datatypes.math.Vec3f.pack(builder, _o.getPosition()));
    addRawRotVel(builder, slimevr_protocol.datatypes.math.Vec3f.pack(builder, _o.getRawRotVel()));
    addRawTransAccel(builder, slimevr_protocol.datatypes.math.Vec3f.pack(builder, _o.getRawTransAccel()));
    if (_o.getTemp() != null) { addTemp(builder, _o.getTemp()); }
    if (_o.getPollRate() != null) { addPollRate(builder, _o.getPollRate()); }
    addMountingOrientation(builder, slimevr_protocol.datatypes.math.Quat.pack(builder, _o.getMountingOrientation()));
    return endTrackerStatus(builder);
  }
}

