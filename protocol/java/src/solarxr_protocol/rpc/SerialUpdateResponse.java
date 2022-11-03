// automatically generated by the FlatBuffers compiler, do not modify

package solarxr_protocol.rpc;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class SerialUpdateResponse extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_2_0_0(); }
  public static SerialUpdateResponse getRootAsSerialUpdateResponse(ByteBuffer _bb) { return getRootAsSerialUpdateResponse(_bb, new SerialUpdateResponse()); }
  public static SerialUpdateResponse getRootAsSerialUpdateResponse(ByteBuffer _bb, SerialUpdateResponse obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public SerialUpdateResponse __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public String log() { int o = __offset(4); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer logAsByteBuffer() { return __vector_as_bytebuffer(4, 1); }
  public ByteBuffer logInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 4, 1); }
  public boolean closed() { int o = __offset(6); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }

  public static int createSerialUpdateResponse(FlatBufferBuilder builder,
      int logOffset,
      boolean closed) {
    builder.startTable(2);
    SerialUpdateResponse.addLog(builder, logOffset);
    SerialUpdateResponse.addClosed(builder, closed);
    return SerialUpdateResponse.endSerialUpdateResponse(builder);
  }

  public static void startSerialUpdateResponse(FlatBufferBuilder builder) { builder.startTable(2); }
  public static void addLog(FlatBufferBuilder builder, int logOffset) { builder.addOffset(0, logOffset, 0); }
  public static void addClosed(FlatBufferBuilder builder, boolean closed) { builder.addBoolean(1, closed, false); }
  public static int endSerialUpdateResponse(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public SerialUpdateResponse get(int j) { return get(new SerialUpdateResponse(), j); }
    public SerialUpdateResponse get(SerialUpdateResponse obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
  public SerialUpdateResponseT unpack() {
    SerialUpdateResponseT _o = new SerialUpdateResponseT();
    unpackTo(_o);
    return _o;
  }
  public void unpackTo(SerialUpdateResponseT _o) {
    String _oLog = log();
    _o.setLog(_oLog);
    boolean _oClosed = closed();
    _o.setClosed(_oClosed);
  }
  public static int pack(FlatBufferBuilder builder, SerialUpdateResponseT _o) {
    if (_o == null) return 0;
    int _log = _o.getLog() == null ? 0 : builder.createString(_o.getLog());
    return createSerialUpdateResponse(
      builder,
      _log,
      _o.getClosed());
  }
}

