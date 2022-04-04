// automatically generated by the FlatBuffers compiler, do not modify

package slimevr_protocol;

import com.google.flatbuffers.FlatBufferBuilder;

public class OutboundUnionUnion {
  private byte type;
  private Object value;

  public byte getType() { return type; }

  public void setType(byte type) { this.type = type; }

  public Object getValue() { return value; }

  public void setValue(Object value) { this.value = value; }

  public OutboundUnionUnion() {
    this.type = OutboundUnion.NONE;
    this.value = null;
  }

  public slimevr_protocol.rpc.HeartbeatRequestT asslimevr_protocol_rpc_HeartbeatRequest() { return (slimevr_protocol.rpc.HeartbeatRequestT) value; }
  public slimevr_protocol.rpc.SettingsResponseT asslimevr_protocol_rpc_SettingsResponse() { return (slimevr_protocol.rpc.SettingsResponseT) value; }
  public slimevr_protocol.data_feed.PollDataFeedT asslimevr_protocol_data_feed_PollDataFeed() { return (slimevr_protocol.data_feed.PollDataFeedT) value; }
  public slimevr_protocol.data_feed.DataFeedRequestT asslimevr_protocol_data_feed_DataFeedRequest() { return (slimevr_protocol.data_feed.DataFeedRequestT) value; }
  public slimevr_protocol.data_feed.DataFeedUpdateT asslimevr_protocol_data_feed_DataFeedUpdate() { return (slimevr_protocol.data_feed.DataFeedUpdateT) value; }

  public static int pack(FlatBufferBuilder builder, OutboundUnionUnion _o) {
    switch (_o.type) {
      case OutboundUnion.slimevr_protocol_rpc_HeartbeatRequest: return slimevr_protocol.rpc.HeartbeatRequest.pack(builder, _o.asslimevr_protocol_rpc_HeartbeatRequest());
      case OutboundUnion.slimevr_protocol_rpc_SettingsResponse: return slimevr_protocol.rpc.SettingsResponse.pack(builder, _o.asslimevr_protocol_rpc_SettingsResponse());
      case OutboundUnion.slimevr_protocol_data_feed_PollDataFeed: return slimevr_protocol.data_feed.PollDataFeed.pack(builder, _o.asslimevr_protocol_data_feed_PollDataFeed());
      case OutboundUnion.slimevr_protocol_data_feed_DataFeedRequest: return slimevr_protocol.data_feed.DataFeedRequest.pack(builder, _o.asslimevr_protocol_data_feed_DataFeedRequest());
      case OutboundUnion.slimevr_protocol_data_feed_DataFeedUpdate: return slimevr_protocol.data_feed.DataFeedUpdate.pack(builder, _o.asslimevr_protocol_data_feed_DataFeedUpdate());
      default: return 0;
    }
  }
}

