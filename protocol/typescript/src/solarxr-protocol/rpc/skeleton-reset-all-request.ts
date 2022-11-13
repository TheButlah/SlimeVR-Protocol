// automatically generated by the FlatBuffers compiler, do not modify

import * as flatbuffers from 'flatbuffers';



export class SkeletonResetAllRequest implements flatbuffers.IUnpackableObject<SkeletonResetAllRequestT> {
  bb: flatbuffers.ByteBuffer|null = null;
  bb_pos = 0;
  __init(i:number, bb:flatbuffers.ByteBuffer):SkeletonResetAllRequest {
  this.bb_pos = i;
  this.bb = bb;
  return this;
}

static getRootAsSkeletonResetAllRequest(bb:flatbuffers.ByteBuffer, obj?:SkeletonResetAllRequest):SkeletonResetAllRequest {
  return (obj || new SkeletonResetAllRequest()).__init(bb.readInt32(bb.position()) + bb.position(), bb);
}

static getSizePrefixedRootAsSkeletonResetAllRequest(bb:flatbuffers.ByteBuffer, obj?:SkeletonResetAllRequest):SkeletonResetAllRequest {
  bb.setPosition(bb.position() + flatbuffers.SIZE_PREFIX_LENGTH);
  return (obj || new SkeletonResetAllRequest()).__init(bb.readInt32(bb.position()) + bb.position(), bb);
}

static startSkeletonResetAllRequest(builder:flatbuffers.Builder) {
  builder.startObject(0);
}

static endSkeletonResetAllRequest(builder:flatbuffers.Builder):flatbuffers.Offset {
  const offset = builder.endObject();
  return offset;
}

static createSkeletonResetAllRequest(builder:flatbuffers.Builder):flatbuffers.Offset {
  SkeletonResetAllRequest.startSkeletonResetAllRequest(builder);
  return SkeletonResetAllRequest.endSkeletonResetAllRequest(builder);
}

unpack(): SkeletonResetAllRequestT {
  return new SkeletonResetAllRequestT();
}


unpackTo(_o: SkeletonResetAllRequestT): void {}
}

export class SkeletonResetAllRequestT implements flatbuffers.IGeneratedObject {
constructor(){}


pack(builder:flatbuffers.Builder): flatbuffers.Offset {
  return SkeletonResetAllRequest.createSkeletonResetAllRequest(builder);
}
}
