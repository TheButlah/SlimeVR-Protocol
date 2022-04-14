// automatically generated by the FlatBuffers compiler, do not modify

import * as flatbuffers from 'flatbuffers';



export class TransactionId {
  bb: flatbuffers.ByteBuffer|null = null;
  bb_pos = 0;
__init(i:number, bb:flatbuffers.ByteBuffer):TransactionId {
  this.bb_pos = i;
  this.bb = bb;
  return this;
}

/**
 * This is expected to overflow, networking logic should handle this case.
 */
id():number {
  return this.bb!.readUint32(this.bb_pos);
}

static sizeOf():number {
  return 4;
}

static createTransactionId(builder:flatbuffers.Builder, id: number):flatbuffers.Offset {
  builder.prep(4, 4);
  builder.writeInt32(id);
  return builder.offset();
}


unpack(): TransactionIdT {
  return new TransactionIdT(
    this.id()
  );
}


unpackTo(_o: TransactionIdT): void {
  _o.id = this.id();
}
}

export class TransactionIdT {
constructor(
  public id: number = 0
){}


pack(builder:flatbuffers.Builder): flatbuffers.Offset {
  return TransactionId.createTransactionId(builder,
    this.id
  );
}
}
