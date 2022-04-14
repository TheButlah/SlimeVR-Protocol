// automatically generated by the FlatBuffers compiler, do not modify

import * as flatbuffers from 'flatbuffers';



/**
 * A unique ID for the device. IDs are not guaranteed to be the same after
 * the connection is terminated.
 */
export class DeviceId {
  bb: flatbuffers.ByteBuffer|null = null;
  bb_pos = 0;
__init(i:number, bb:flatbuffers.ByteBuffer):DeviceId {
  this.bb_pos = i;
  this.bb = bb;
  return this;
}

id():number {
  return this.bb!.readUint8(this.bb_pos);
}

static sizeOf():number {
  return 1;
}

static createDeviceId(builder:flatbuffers.Builder, id: number):flatbuffers.Offset {
  builder.prep(1, 1);
  builder.writeInt8(id);
  return builder.offset();
}


unpack(): DeviceIdT {
  return new DeviceIdT(
    this.id()
  );
}


unpackTo(_o: DeviceIdT): void {
  _o.id = this.id();
}
}

export class DeviceIdT {
constructor(
  public id: number = 0
){}


pack(builder:flatbuffers.Builder): flatbuffers.Offset {
  return DeviceId.createDeviceId(builder,
    this.id
  );
}
}
