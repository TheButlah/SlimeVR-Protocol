// automatically generated by the FlatBuffers compiler, do not modify

import * as flatbuffers from 'flatbuffers';

import { Message, MessageT } from '../../solarxr_protocol/pub_sub/message';
import { PubSubUnion, unionToPubSubUnion, unionListToPubSubUnion } from '../../solarxr_protocol/pub_sub/pub-sub-union';
import { SubscriptionRequest, SubscriptionRequestT } from '../../solarxr_protocol/pub_sub/subscription-request';
import { TopicHandleRequest, TopicHandleRequestT } from '../../solarxr_protocol/pub_sub/topic-handle-request';
import { TopicHandleResponse, TopicHandleResponseT } from '../../solarxr_protocol/pub_sub/topic-handle-response';


export class PubSubHeader {
  bb: flatbuffers.ByteBuffer|null = null;
  bb_pos = 0;
__init(i:number, bb:flatbuffers.ByteBuffer):PubSubHeader {
  this.bb_pos = i;
  this.bb = bb;
  return this;
}

static getRootAsPubSubHeader(bb:flatbuffers.ByteBuffer, obj?:PubSubHeader):PubSubHeader {
  return (obj || new PubSubHeader()).__init(bb.readInt32(bb.position()) + bb.position(), bb);
}

static getSizePrefixedRootAsPubSubHeader(bb:flatbuffers.ByteBuffer, obj?:PubSubHeader):PubSubHeader {
  bb.setPosition(bb.position() + flatbuffers.SIZE_PREFIX_LENGTH);
  return (obj || new PubSubHeader()).__init(bb.readInt32(bb.position()) + bb.position(), bb);
}

uType():PubSubUnion {
  const offset = this.bb!.__offset(this.bb_pos, 4);
  return offset ? this.bb!.readUint8(this.bb_pos + offset) : PubSubUnion.NONE;
}

u<T extends flatbuffers.Table>(obj:any):any|null {
  const offset = this.bb!.__offset(this.bb_pos, 6);
  return offset ? this.bb!.__union(obj, this.bb_pos + offset) : null;
}

static startPubSubHeader(builder:flatbuffers.Builder) {
  builder.startObject(2);
}

static addUType(builder:flatbuffers.Builder, uType:PubSubUnion) {
  builder.addFieldInt8(0, uType, PubSubUnion.NONE);
}

static addU(builder:flatbuffers.Builder, uOffset:flatbuffers.Offset) {
  builder.addFieldOffset(1, uOffset, 0);
}

static endPubSubHeader(builder:flatbuffers.Builder):flatbuffers.Offset {
  const offset = builder.endObject();
  return offset;
}

static createPubSubHeader(builder:flatbuffers.Builder, uType:PubSubUnion, uOffset:flatbuffers.Offset):flatbuffers.Offset {
  PubSubHeader.startPubSubHeader(builder);
  PubSubHeader.addUType(builder, uType);
  PubSubHeader.addU(builder, uOffset);
  return PubSubHeader.endPubSubHeader(builder);
}

unpack(): PubSubHeaderT {
  return new PubSubHeaderT(
    this.uType(),
    (() => {
      let temp = unionToPubSubUnion(this.uType(), this.u.bind(this));
      if(temp === null) { return null; }
      return temp.unpack()
  })()
  );
}


unpackTo(_o: PubSubHeaderT): void {
  _o.uType = this.uType();
  _o.u = (() => {
      let temp = unionToPubSubUnion(this.uType(), this.u.bind(this));
      if(temp === null) { return null; }
      return temp.unpack()
  })();
}
}

export class PubSubHeaderT {
constructor(
  public uType: PubSubUnion = PubSubUnion.NONE,
  public u: MessageT|SubscriptionRequestT|TopicHandleRequestT|TopicHandleResponseT|null = null
){}


pack(builder:flatbuffers.Builder): flatbuffers.Offset {
  const u = builder.createObjectOffset(this.u);

  return PubSubHeader.createPubSubHeader(builder,
    this.uType,
    u
  );
}
}
