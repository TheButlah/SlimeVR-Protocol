// automatically generated by the FlatBuffers compiler, do not modify

import * as flatbuffers from 'flatbuffers';

import { TrackerData, TrackerDataT } from '../../../solarxr-protocol/data-feed/tracker/tracker-data.js';
import { DeviceId, DeviceIdT } from '../../../solarxr-protocol/datatypes/device-id.js';
import { HardwareInfo, HardwareInfoT } from '../../../solarxr-protocol/datatypes/hardware-info/hardware-info.js';
import { HardwareStatus, HardwareStatusT } from '../../../solarxr-protocol/datatypes/hardware-info/hardware-status.js';


/**
 * Describes all possible information about a hardware device. For example, a
 * vive tracker is a  single hardware device, and a slime tracker with two
 * extensions is a single hardware device but two trackers.
 */
export class DeviceData implements flatbuffers.IUnpackableObject<DeviceDataT> {
  bb: flatbuffers.ByteBuffer|null = null;
  bb_pos = 0;
  __init(i:number, bb:flatbuffers.ByteBuffer):DeviceData {
  this.bb_pos = i;
  this.bb = bb;
  return this;
}

static getRootAsDeviceData(bb:flatbuffers.ByteBuffer, obj?:DeviceData):DeviceData {
  return (obj || new DeviceData()).__init(bb.readInt32(bb.position()) + bb.position(), bb);
}

static getSizePrefixedRootAsDeviceData(bb:flatbuffers.ByteBuffer, obj?:DeviceData):DeviceData {
  bb.setPosition(bb.position() + flatbuffers.SIZE_PREFIX_LENGTH);
  return (obj || new DeviceData()).__init(bb.readInt32(bb.position()) + bb.position(), bb);
}

id(obj?:DeviceId):DeviceId|null {
  const offset = this.bb!.__offset(this.bb_pos, 4);
  return offset ? (obj || new DeviceId()).__init(this.bb_pos + offset, this.bb!) : null;
}

/**
 * The dynamically changeable name of the device. This might be set by the
 * user to help them remember which tracker is which.
 */
customName():string|null
customName(optionalEncoding:flatbuffers.Encoding):string|Uint8Array|null
customName(optionalEncoding?:any):string|Uint8Array|null {
  const offset = this.bb!.__offset(this.bb_pos, 6);
  return offset ? this.bb!.__string(this.bb_pos + offset, optionalEncoding) : null;
}

/**
 * Mostly-static info about the device hardware
 */
hardwareInfo(obj?:HardwareInfo):HardwareInfo|null {
  const offset = this.bb!.__offset(this.bb_pos, 8);
  return offset ? (obj || new HardwareInfo()).__init(this.bb!.__indirect(this.bb_pos + offset), this.bb!) : null;
}

/**
 * General info about the status of the device
 */
hardwareStatus(obj?:HardwareStatus):HardwareStatus|null {
  const offset = this.bb!.__offset(this.bb_pos, 10);
  return offset ? (obj || new HardwareStatus()).__init(this.bb!.__indirect(this.bb_pos + offset), this.bb!) : null;
}

/**
 * Info about all trackers attached to this device
 */
trackers(index: number, obj?:TrackerData):TrackerData|null {
  const offset = this.bb!.__offset(this.bb_pos, 12);
  return offset ? (obj || new TrackerData()).__init(this.bb!.__indirect(this.bb!.__vector(this.bb_pos + offset) + index * 4), this.bb!) : null;
}

trackersLength():number {
  const offset = this.bb!.__offset(this.bb_pos, 12);
  return offset ? this.bb!.__vector_len(this.bb_pos + offset) : 0;
}

static startDeviceData(builder:flatbuffers.Builder) {
  builder.startObject(5);
}

static addId(builder:flatbuffers.Builder, idOffset:flatbuffers.Offset) {
  builder.addFieldStruct(0, idOffset, 0);
}

static addCustomName(builder:flatbuffers.Builder, customNameOffset:flatbuffers.Offset) {
  builder.addFieldOffset(1, customNameOffset, 0);
}

static addHardwareInfo(builder:flatbuffers.Builder, hardwareInfoOffset:flatbuffers.Offset) {
  builder.addFieldOffset(2, hardwareInfoOffset, 0);
}

static addHardwareStatus(builder:flatbuffers.Builder, hardwareStatusOffset:flatbuffers.Offset) {
  builder.addFieldOffset(3, hardwareStatusOffset, 0);
}

static addTrackers(builder:flatbuffers.Builder, trackersOffset:flatbuffers.Offset) {
  builder.addFieldOffset(4, trackersOffset, 0);
}

static createTrackersVector(builder:flatbuffers.Builder, data:flatbuffers.Offset[]):flatbuffers.Offset {
  builder.startVector(4, data.length, 4);
  for (let i = data.length - 1; i >= 0; i--) {
    builder.addOffset(data[i]!);
  }
  return builder.endVector();
}

static startTrackersVector(builder:flatbuffers.Builder, numElems:number) {
  builder.startVector(4, numElems, 4);
}

static endDeviceData(builder:flatbuffers.Builder):flatbuffers.Offset {
  const offset = builder.endObject();
  return offset;
}


unpack(): DeviceDataT {
  return new DeviceDataT(
    (this.id() !== null ? this.id()!.unpack() : null),
    this.customName(),
    (this.hardwareInfo() !== null ? this.hardwareInfo()!.unpack() : null),
    (this.hardwareStatus() !== null ? this.hardwareStatus()!.unpack() : null),
    this.bb!.createObjList<TrackerData, TrackerDataT>(this.trackers.bind(this), this.trackersLength())
  );
}


unpackTo(_o: DeviceDataT): void {
  _o.id = (this.id() !== null ? this.id()!.unpack() : null);
  _o.customName = this.customName();
  _o.hardwareInfo = (this.hardwareInfo() !== null ? this.hardwareInfo()!.unpack() : null);
  _o.hardwareStatus = (this.hardwareStatus() !== null ? this.hardwareStatus()!.unpack() : null);
  _o.trackers = this.bb!.createObjList<TrackerData, TrackerDataT>(this.trackers.bind(this), this.trackersLength());
}
}

export class DeviceDataT implements flatbuffers.IGeneratedObject {
constructor(
  public id: DeviceIdT|null = null,
  public customName: string|Uint8Array|null = null,
  public hardwareInfo: HardwareInfoT|null = null,
  public hardwareStatus: HardwareStatusT|null = null,
  public trackers: (TrackerDataT)[] = []
){}


pack(builder:flatbuffers.Builder): flatbuffers.Offset {
  const customName = (this.customName !== null ? builder.createString(this.customName!) : 0);
  const hardwareInfo = (this.hardwareInfo !== null ? this.hardwareInfo!.pack(builder) : 0);
  const hardwareStatus = (this.hardwareStatus !== null ? this.hardwareStatus!.pack(builder) : 0);
  const trackers = DeviceData.createTrackersVector(builder, builder.createObjectOffsetList(this.trackers));

  DeviceData.startDeviceData(builder);
  DeviceData.addId(builder, (this.id !== null ? this.id!.pack(builder) : 0));
  DeviceData.addCustomName(builder, customName);
  DeviceData.addHardwareInfo(builder, hardwareInfo);
  DeviceData.addHardwareStatus(builder, hardwareStatus);
  DeviceData.addTrackers(builder, trackers);

  return DeviceData.endDeviceData(builder);
}
}
