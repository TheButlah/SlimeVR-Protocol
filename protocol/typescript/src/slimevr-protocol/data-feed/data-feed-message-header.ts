// automatically generated by the FlatBuffers compiler, do not modify

import * as flatbuffers from 'flatbuffers';

import { DataFeedConfig, DataFeedConfigT } from '../../slimevr-protocol/data-feed/data-feed-config';
import { DataFeedMessage, unionToDataFeedMessage, unionListToDataFeedMessage } from '../../slimevr-protocol/data-feed/data-feed-message';
import { DataFeedUpdate, DataFeedUpdateT } from '../../slimevr-protocol/data-feed/data-feed-update';
import { PollDataFeed, PollDataFeedT } from '../../slimevr-protocol/data-feed/poll-data-feed';
import { StartDataFeed, StartDataFeedT } from '../../slimevr-protocol/data-feed/start-data-feed';


export class DataFeedMessageHeader {
  bb: flatbuffers.ByteBuffer|null = null;
  bb_pos = 0;
__init(i:number, bb:flatbuffers.ByteBuffer):DataFeedMessageHeader {
  this.bb_pos = i;
  this.bb = bb;
  return this;
}

static getRootAsDataFeedMessageHeader(bb:flatbuffers.ByteBuffer, obj?:DataFeedMessageHeader):DataFeedMessageHeader {
  return (obj || new DataFeedMessageHeader()).__init(bb.readInt32(bb.position()) + bb.position(), bb);
}

static getSizePrefixedRootAsDataFeedMessageHeader(bb:flatbuffers.ByteBuffer, obj?:DataFeedMessageHeader):DataFeedMessageHeader {
  bb.setPosition(bb.position() + flatbuffers.SIZE_PREFIX_LENGTH);
  return (obj || new DataFeedMessageHeader()).__init(bb.readInt32(bb.position()) + bb.position(), bb);
}

messageType():DataFeedMessage {
  const offset = this.bb!.__offset(this.bb_pos, 4);
  return offset ? this.bb!.readUint8(this.bb_pos + offset) : DataFeedMessage.NONE;
}

message<T extends flatbuffers.Table>(obj:any):any|null {
  const offset = this.bb!.__offset(this.bb_pos, 6);
  return offset ? this.bb!.__union(obj, this.bb_pos + offset) : null;
}

static startDataFeedMessageHeader(builder:flatbuffers.Builder) {
  builder.startObject(2);
}

static addMessageType(builder:flatbuffers.Builder, messageType:DataFeedMessage) {
  builder.addFieldInt8(0, messageType, DataFeedMessage.NONE);
}

static addMessage(builder:flatbuffers.Builder, messageOffset:flatbuffers.Offset) {
  builder.addFieldOffset(1, messageOffset, 0);
}

static endDataFeedMessageHeader(builder:flatbuffers.Builder):flatbuffers.Offset {
  const offset = builder.endObject();
  return offset;
}

static createDataFeedMessageHeader(builder:flatbuffers.Builder, messageType:DataFeedMessage, messageOffset:flatbuffers.Offset):flatbuffers.Offset {
  DataFeedMessageHeader.startDataFeedMessageHeader(builder);
  DataFeedMessageHeader.addMessageType(builder, messageType);
  DataFeedMessageHeader.addMessage(builder, messageOffset);
  return DataFeedMessageHeader.endDataFeedMessageHeader(builder);
}

unpack(): DataFeedMessageHeaderT {
  return new DataFeedMessageHeaderT(
    this.messageType(),
    (() => {
      let temp = unionToDataFeedMessage(this.messageType(), this.message.bind(this));
      if(temp === null) { return null; }
      return temp.unpack()
  })()
  );
}


unpackTo(_o: DataFeedMessageHeaderT): void {
  _o.messageType = this.messageType();
  _o.message = (() => {
      let temp = unionToDataFeedMessage(this.messageType(), this.message.bind(this));
      if(temp === null) { return null; }
      return temp.unpack()
  })();
}
}

export class DataFeedMessageHeaderT {
constructor(
  public messageType: DataFeedMessage = DataFeedMessage.NONE,
  public message: DataFeedConfigT|DataFeedUpdateT|PollDataFeedT|StartDataFeedT|null = null
){}


pack(builder:flatbuffers.Builder): flatbuffers.Offset {
  const message = builder.createObjectOffset(this.message);

  return DataFeedMessageHeader.createDataFeedMessageHeader(builder,
    this.messageType,
    message
  );
}
}
