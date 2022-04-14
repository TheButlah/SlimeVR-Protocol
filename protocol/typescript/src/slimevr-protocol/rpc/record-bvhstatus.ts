// automatically generated by the FlatBuffers compiler, do not modify

import * as flatbuffers from 'flatbuffers';



export class RecordBVHStatus {
  bb: flatbuffers.ByteBuffer|null = null;
  bb_pos = 0;
__init(i:number, bb:flatbuffers.ByteBuffer):RecordBVHStatus {
  this.bb_pos = i;
  this.bb = bb;
  return this;
}

static getRootAsRecordBVHStatus(bb:flatbuffers.ByteBuffer, obj?:RecordBVHStatus):RecordBVHStatus {
  return (obj || new RecordBVHStatus()).__init(bb.readInt32(bb.position()) + bb.position(), bb);
}

static getSizePrefixedRootAsRecordBVHStatus(bb:flatbuffers.ByteBuffer, obj?:RecordBVHStatus):RecordBVHStatus {
  bb.setPosition(bb.position() + flatbuffers.SIZE_PREFIX_LENGTH);
  return (obj || new RecordBVHStatus()).__init(bb.readInt32(bb.position()) + bb.position(), bb);
}

recording():boolean {
  const offset = this.bb!.__offset(this.bb_pos, 4);
  return offset ? !!this.bb!.readInt8(this.bb_pos + offset) : false;
}

static startRecordBVHStatus(builder:flatbuffers.Builder) {
  builder.startObject(1);
}

static addRecording(builder:flatbuffers.Builder, recording:boolean) {
  builder.addFieldInt8(0, +recording, +false);
}

static endRecordBVHStatus(builder:flatbuffers.Builder):flatbuffers.Offset {
  const offset = builder.endObject();
  return offset;
}

static createRecordBVHStatus(builder:flatbuffers.Builder, recording:boolean):flatbuffers.Offset {
  RecordBVHStatus.startRecordBVHStatus(builder);
  RecordBVHStatus.addRecording(builder, recording);
  return RecordBVHStatus.endRecordBVHStatus(builder);
}

unpack(): RecordBVHStatusT {
  return new RecordBVHStatusT(
    this.recording()
  );
}


unpackTo(_o: RecordBVHStatusT): void {
  _o.recording = this.recording();
}
}

export class RecordBVHStatusT {
constructor(
  public recording: boolean = false
){}


pack(builder:flatbuffers.Builder): flatbuffers.Offset {
  return RecordBVHStatus.createRecordBVHStatus(builder,
    this.recording
  );
}
}
