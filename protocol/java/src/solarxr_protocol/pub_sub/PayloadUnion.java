// automatically generated by the FlatBuffers compiler, do not modify

package solarxr_protocol.pub_sub;

import com.google.flatbuffers.FlatBufferBuilder;

public class PayloadUnion {
  private byte type;
  private Object value;

  public byte getType() { return type; }

  public void setType(byte type) { this.type = type; }

  public Object getValue() { return value; }

  public void setValue(Object value) { this.value = value; }

  public PayloadUnion() {
    this.type = Payload.NONE;
    this.value = null;
  }

  public solarxr_protocol.datatypes.StringT assolarxr_protocol_datatypes_String() { return (solarxr_protocol.datatypes.StringT) value; }
  public solarxr_protocol.datatypes.BytesT assolarxr_protocol_datatypes_Bytes() { return (solarxr_protocol.datatypes.BytesT) value; }
  public solarxr_protocol.pub_sub.KeyValuesT asKeyValues() { return (solarxr_protocol.pub_sub.KeyValuesT) value; }

  public static int pack(FlatBufferBuilder builder, PayloadUnion _o) {
    switch (_o.type) {
      case Payload.solarxr_protocol_datatypes_String: return solarxr_protocol.datatypes.String.pack(builder, _o.assolarxr_protocol_datatypes_String());
      case Payload.solarxr_protocol_datatypes_Bytes: return solarxr_protocol.datatypes.Bytes.pack(builder, _o.assolarxr_protocol_datatypes_Bytes());
      case Payload.KeyValues: return solarxr_protocol.pub_sub.KeyValues.pack(builder, _o.asKeyValues());
      default: return 0;
    }
  }
}

