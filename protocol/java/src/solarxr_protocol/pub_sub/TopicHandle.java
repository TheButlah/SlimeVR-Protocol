// automatically generated by the FlatBuffers compiler, do not modify

package solarxr_protocol.pub_sub;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

/**
 * A handle for the topic, allows referencing a topic without sending a huge
 * `TopicId`.
 */
@SuppressWarnings("unused")
public final class TopicHandle extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_2_0_0(); }
  public static TopicHandle getRootAsTopicHandle(ByteBuffer _bb) { return getRootAsTopicHandle(_bb, new TopicHandle()); }
  public static TopicHandle getRootAsTopicHandle(ByteBuffer _bb, TopicHandle obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public TopicHandle __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public int id() { int o = __offset(4); return o != 0 ? bb.getShort(o + bb_pos) & 0xFFFF : 0; }

  public static int createTopicHandle(FlatBufferBuilder builder,
      int id) {
    builder.startTable(1);
    TopicHandle.addId(builder, id);
    return TopicHandle.endTopicHandle(builder);
  }

  public static void startTopicHandle(FlatBufferBuilder builder) { builder.startTable(1); }
  public static void addId(FlatBufferBuilder builder, int id) { builder.addShort(0, (short) id, (short) 0); }
  public static int endTopicHandle(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public TopicHandle get(int j) { return get(new TopicHandle(), j); }
    public TopicHandle get(TopicHandle obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
  public TopicHandleT unpack() {
    TopicHandleT _o = new TopicHandleT();
    unpackTo(_o);
    return _o;
  }
  public void unpackTo(TopicHandleT _o) {
    int _oId = id();
    _o.setId(_oId);
  }
  public static int pack(FlatBufferBuilder builder, TopicHandleT _o) {
    if (_o == null) return 0;
    return createTopicHandle(
      builder,
      _o.getId());
  }
}

