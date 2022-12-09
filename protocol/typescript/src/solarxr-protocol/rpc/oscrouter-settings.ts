// automatically generated by the FlatBuffers compiler, do not modify

import * as flatbuffers from 'flatbuffers';

import { OSCSettings, OSCSettingsT } from '../../solarxr-protocol/rpc/oscsettings.js';


/**
 * Forward OSC messages to allow the usage of 2 OSC programs for the same app
 */
export class OSCRouterSettings implements flatbuffers.IUnpackableObject<OSCRouterSettingsT> {
  bb: flatbuffers.ByteBuffer|null = null;
  bb_pos = 0;
  __init(i:number, bb:flatbuffers.ByteBuffer):OSCRouterSettings {
  this.bb_pos = i;
  this.bb = bb;
  return this;
}

static getRootAsOSCRouterSettings(bb:flatbuffers.ByteBuffer, obj?:OSCRouterSettings):OSCRouterSettings {
  return (obj || new OSCRouterSettings()).__init(bb.readInt32(bb.position()) + bb.position(), bb);
}

static getSizePrefixedRootAsOSCRouterSettings(bb:flatbuffers.ByteBuffer, obj?:OSCRouterSettings):OSCRouterSettings {
  bb.setPosition(bb.position() + flatbuffers.SIZE_PREFIX_LENGTH);
  return (obj || new OSCRouterSettings()).__init(bb.readInt32(bb.position()) + bb.position(), bb);
}

generalSettings(obj?:OSCSettings):OSCSettings|null {
  const offset = this.bb!.__offset(this.bb_pos, 4);
  return offset ? (obj || new OSCSettings()).__init(this.bb!.__indirect(this.bb_pos + offset), this.bb!) : null;
}

static startOSCRouterSettings(builder:flatbuffers.Builder) {
  builder.startObject(1);
}

static addGeneralSettings(builder:flatbuffers.Builder, generalSettingsOffset:flatbuffers.Offset) {
  builder.addFieldOffset(0, generalSettingsOffset, 0);
}

static endOSCRouterSettings(builder:flatbuffers.Builder):flatbuffers.Offset {
  const offset = builder.endObject();
  return offset;
}

static createOSCRouterSettings(builder:flatbuffers.Builder, generalSettingsOffset:flatbuffers.Offset):flatbuffers.Offset {
  OSCRouterSettings.startOSCRouterSettings(builder);
  OSCRouterSettings.addGeneralSettings(builder, generalSettingsOffset);
  return OSCRouterSettings.endOSCRouterSettings(builder);
}

unpack(): OSCRouterSettingsT {
  return new OSCRouterSettingsT(
    (this.generalSettings() !== null ? this.generalSettings()!.unpack() : null)
  );
}


unpackTo(_o: OSCRouterSettingsT): void {
  _o.generalSettings = (this.generalSettings() !== null ? this.generalSettings()!.unpack() : null);
}
}

export class OSCRouterSettingsT implements flatbuffers.IGeneratedObject {
constructor(
  public generalSettings: OSCSettingsT|null = null
){}


pack(builder:flatbuffers.Builder): flatbuffers.Offset {
  const generalSettings = (this.generalSettings !== null ? this.generalSettings!.pack(builder) : 0);

  return OSCRouterSettings.createOSCRouterSettings(builder,
    generalSettings
  );
}
}
