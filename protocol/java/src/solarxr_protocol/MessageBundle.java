// automatically generated by the FlatBuffers compiler, do not modify

package solarxr_protocol;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

/**
 * MessageBundle contains all of the messages for the data feed system and the
 * rpc system that will be sent in one buffer.
 */
@SuppressWarnings("unused")
public final class MessageBundle extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_2_0_0(); }
  public static MessageBundle getRootAsMessageBundle(ByteBuffer _bb) { return getRootAsMessageBundle(_bb, new MessageBundle()); }
  public static MessageBundle getRootAsMessageBundle(ByteBuffer _bb, MessageBundle obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public MessageBundle __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public solarxr_protocol.data_feed.DataFeedMessageHeader dataFeedMsgs(int j) { return dataFeedMsgs(new solarxr_protocol.data_feed.DataFeedMessageHeader(), j); }
  public solarxr_protocol.data_feed.DataFeedMessageHeader dataFeedMsgs(solarxr_protocol.data_feed.DataFeedMessageHeader obj, int j) { int o = __offset(4); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int dataFeedMsgsLength() { int o = __offset(4); return o != 0 ? __vector_len(o) : 0; }
  public solarxr_protocol.data_feed.DataFeedMessageHeader.Vector dataFeedMsgsVector() { return dataFeedMsgsVector(new solarxr_protocol.data_feed.DataFeedMessageHeader.Vector()); }
  public solarxr_protocol.data_feed.DataFeedMessageHeader.Vector dataFeedMsgsVector(solarxr_protocol.data_feed.DataFeedMessageHeader.Vector obj) { int o = __offset(4); return o != 0 ? obj.__assign(__vector(o), 4, bb) : null; }
  public solarxr_protocol.rpc.RpcMessageHeader rpcMsgs(int j) { return rpcMsgs(new solarxr_protocol.rpc.RpcMessageHeader(), j); }
  public solarxr_protocol.rpc.RpcMessageHeader rpcMsgs(solarxr_protocol.rpc.RpcMessageHeader obj, int j) { int o = __offset(6); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int rpcMsgsLength() { int o = __offset(6); return o != 0 ? __vector_len(o) : 0; }
  public solarxr_protocol.rpc.RpcMessageHeader.Vector rpcMsgsVector() { return rpcMsgsVector(new solarxr_protocol.rpc.RpcMessageHeader.Vector()); }
  public solarxr_protocol.rpc.RpcMessageHeader.Vector rpcMsgsVector(solarxr_protocol.rpc.RpcMessageHeader.Vector obj) { int o = __offset(6); return o != 0 ? obj.__assign(__vector(o), 4, bb) : null; }
  public solarxr_protocol.pub_sub.PubSubHeader pubSubMsgs(int j) { return pubSubMsgs(new solarxr_protocol.pub_sub.PubSubHeader(), j); }
  public solarxr_protocol.pub_sub.PubSubHeader pubSubMsgs(solarxr_protocol.pub_sub.PubSubHeader obj, int j) { int o = __offset(8); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int pubSubMsgsLength() { int o = __offset(8); return o != 0 ? __vector_len(o) : 0; }
  public solarxr_protocol.pub_sub.PubSubHeader.Vector pubSubMsgsVector() { return pubSubMsgsVector(new solarxr_protocol.pub_sub.PubSubHeader.Vector()); }
  public solarxr_protocol.pub_sub.PubSubHeader.Vector pubSubMsgsVector(solarxr_protocol.pub_sub.PubSubHeader.Vector obj) { int o = __offset(8); return o != 0 ? obj.__assign(__vector(o), 4, bb) : null; }

  public static int createMessageBundle(FlatBufferBuilder builder,
      int dataFeedMsgsOffset,
      int rpcMsgsOffset,
      int pubSubMsgsOffset) {
    builder.startTable(3);
    MessageBundle.addPubSubMsgs(builder, pubSubMsgsOffset);
    MessageBundle.addRpcMsgs(builder, rpcMsgsOffset);
    MessageBundle.addDataFeedMsgs(builder, dataFeedMsgsOffset);
    return MessageBundle.endMessageBundle(builder);
  }

  public static void startMessageBundle(FlatBufferBuilder builder) { builder.startTable(3); }
  public static void addDataFeedMsgs(FlatBufferBuilder builder, int dataFeedMsgsOffset) { builder.addOffset(0, dataFeedMsgsOffset, 0); }
  public static int createDataFeedMsgsVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startDataFeedMsgsVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addRpcMsgs(FlatBufferBuilder builder, int rpcMsgsOffset) { builder.addOffset(1, rpcMsgsOffset, 0); }
  public static int createRpcMsgsVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startRpcMsgsVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addPubSubMsgs(FlatBufferBuilder builder, int pubSubMsgsOffset) { builder.addOffset(2, pubSubMsgsOffset, 0); }
  public static int createPubSubMsgsVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startPubSubMsgsVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static int endMessageBundle(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public MessageBundle get(int j) { return get(new MessageBundle(), j); }
    public MessageBundle get(MessageBundle obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
  public MessageBundleT unpack() {
    MessageBundleT _o = new MessageBundleT();
    unpackTo(_o);
    return _o;
  }
  public void unpackTo(MessageBundleT _o) {
    solarxr_protocol.data_feed.DataFeedMessageHeaderT[] _oDataFeedMsgs = new solarxr_protocol.data_feed.DataFeedMessageHeaderT[dataFeedMsgsLength()];
    for (int _j = 0; _j < dataFeedMsgsLength(); ++_j) {_oDataFeedMsgs[_j] = (dataFeedMsgs(_j) != null ? dataFeedMsgs(_j).unpack() : null);}
    _o.setDataFeedMsgs(_oDataFeedMsgs);
    solarxr_protocol.rpc.RpcMessageHeaderT[] _oRpcMsgs = new solarxr_protocol.rpc.RpcMessageHeaderT[rpcMsgsLength()];
    for (int _j = 0; _j < rpcMsgsLength(); ++_j) {_oRpcMsgs[_j] = (rpcMsgs(_j) != null ? rpcMsgs(_j).unpack() : null);}
    _o.setRpcMsgs(_oRpcMsgs);
    solarxr_protocol.pub_sub.PubSubHeaderT[] _oPubSubMsgs = new solarxr_protocol.pub_sub.PubSubHeaderT[pubSubMsgsLength()];
    for (int _j = 0; _j < pubSubMsgsLength(); ++_j) {_oPubSubMsgs[_j] = (pubSubMsgs(_j) != null ? pubSubMsgs(_j).unpack() : null);}
    _o.setPubSubMsgs(_oPubSubMsgs);
  }
  public static int pack(FlatBufferBuilder builder, MessageBundleT _o) {
    if (_o == null) return 0;
    int _dataFeedMsgs = 0;
    if (_o.getDataFeedMsgs() != null) {
      int[] __dataFeedMsgs = new int[_o.getDataFeedMsgs().length];
      int _j = 0;
      for (solarxr_protocol.data_feed.DataFeedMessageHeaderT _e : _o.getDataFeedMsgs()) { __dataFeedMsgs[_j] = solarxr_protocol.data_feed.DataFeedMessageHeader.pack(builder, _e); _j++;}
      _dataFeedMsgs = createDataFeedMsgsVector(builder, __dataFeedMsgs);
    }
    int _rpcMsgs = 0;
    if (_o.getRpcMsgs() != null) {
      int[] __rpcMsgs = new int[_o.getRpcMsgs().length];
      int _j = 0;
      for (solarxr_protocol.rpc.RpcMessageHeaderT _e : _o.getRpcMsgs()) { __rpcMsgs[_j] = solarxr_protocol.rpc.RpcMessageHeader.pack(builder, _e); _j++;}
      _rpcMsgs = createRpcMsgsVector(builder, __rpcMsgs);
    }
    int _pubSubMsgs = 0;
    if (_o.getPubSubMsgs() != null) {
      int[] __pubSubMsgs = new int[_o.getPubSubMsgs().length];
      int _j = 0;
      for (solarxr_protocol.pub_sub.PubSubHeaderT _e : _o.getPubSubMsgs()) { __pubSubMsgs[_j] = solarxr_protocol.pub_sub.PubSubHeader.pack(builder, _e); _j++;}
      _pubSubMsgs = createPubSubMsgsVector(builder, __pubSubMsgs);
    }
    return createMessageBundle(
      builder,
      _dataFeedMsgs,
      _rpcMsgs,
      _pubSubMsgs);
  }
}

