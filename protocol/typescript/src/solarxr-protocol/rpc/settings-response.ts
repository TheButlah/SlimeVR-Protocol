// automatically generated by the FlatBuffers compiler, do not modify

import * as flatbuffers from 'flatbuffers';

import { FilteringSettings, FilteringSettingsT } from '../../solarxr-protocol/rpc/filtering-settings';
import { SteamVRTrackersSetting, SteamVRTrackersSettingT } from '../../solarxr-protocol/rpc/steam-vrtrackers-setting';
import { VRCOSCSettings, VRCOSCSettingsT } from '../../solarxr-protocol/rpc/vrcoscsettings';
import { ModelSettings, ModelSettingsT } from '../../solarxr-protocol/rpc/settings/model-settings';


export class SettingsResponse {
  bb: flatbuffers.ByteBuffer|null = null;
  bb_pos = 0;
__init(i:number, bb:flatbuffers.ByteBuffer):SettingsResponse {
  this.bb_pos = i;
  this.bb = bb;
  return this;
}

static getRootAsSettingsResponse(bb:flatbuffers.ByteBuffer, obj?:SettingsResponse):SettingsResponse {
  return (obj || new SettingsResponse()).__init(bb.readInt32(bb.position()) + bb.position(), bb);
}

static getSizePrefixedRootAsSettingsResponse(bb:flatbuffers.ByteBuffer, obj?:SettingsResponse):SettingsResponse {
  bb.setPosition(bb.position() + flatbuffers.SIZE_PREFIX_LENGTH);
  return (obj || new SettingsResponse()).__init(bb.readInt32(bb.position()) + bb.position(), bb);
}

steamVrTrackers(obj?:SteamVRTrackersSetting):SteamVRTrackersSetting|null {
  const offset = this.bb!.__offset(this.bb_pos, 4);
  return offset ? (obj || new SteamVRTrackersSetting()).__init(this.bb!.__indirect(this.bb_pos + offset), this.bb!) : null;
}

filtering(obj?:FilteringSettings):FilteringSettings|null {
  const offset = this.bb!.__offset(this.bb_pos, 6);
  return offset ? (obj || new FilteringSettings()).__init(this.bb!.__indirect(this.bb_pos + offset), this.bb!) : null;
}

vrcOsc(obj?:VRCOSCSettings):VRCOSCSettings|null {
  const offset = this.bb!.__offset(this.bb_pos, 8);
  return offset ? (obj || new VRCOSCSettings()).__init(this.bb!.__indirect(this.bb_pos + offset), this.bb!) : null;
}

modelSettings(obj?:ModelSettings):ModelSettings|null {
  const offset = this.bb!.__offset(this.bb_pos, 10);
  return offset ? (obj || new ModelSettings()).__init(this.bb!.__indirect(this.bb_pos + offset), this.bb!) : null;
}

static startSettingsResponse(builder:flatbuffers.Builder) {
  builder.startObject(4);
}

static addSteamVrTrackers(builder:flatbuffers.Builder, steamVrTrackersOffset:flatbuffers.Offset) {
  builder.addFieldOffset(0, steamVrTrackersOffset, 0);
}

static addFiltering(builder:flatbuffers.Builder, filteringOffset:flatbuffers.Offset) {
  builder.addFieldOffset(1, filteringOffset, 0);
}

static addVrcOsc(builder:flatbuffers.Builder, vrcOscOffset:flatbuffers.Offset) {
  builder.addFieldOffset(2, vrcOscOffset, 0);
}

static addModelSettings(builder:flatbuffers.Builder, modelSettingsOffset:flatbuffers.Offset) {
  builder.addFieldOffset(3, modelSettingsOffset, 0);
}

static endSettingsResponse(builder:flatbuffers.Builder):flatbuffers.Offset {
  const offset = builder.endObject();
  return offset;
}


unpack(): SettingsResponseT {
  return new SettingsResponseT(
    (this.steamVrTrackers() !== null ? this.steamVrTrackers()!.unpack() : null),
    (this.filtering() !== null ? this.filtering()!.unpack() : null),
    (this.vrcOsc() !== null ? this.vrcOsc()!.unpack() : null),
    (this.modelSettings() !== null ? this.modelSettings()!.unpack() : null)
  );
}


unpackTo(_o: SettingsResponseT): void {
  _o.steamVrTrackers = (this.steamVrTrackers() !== null ? this.steamVrTrackers()!.unpack() : null);
  _o.filtering = (this.filtering() !== null ? this.filtering()!.unpack() : null);
  _o.vrcOsc = (this.vrcOsc() !== null ? this.vrcOsc()!.unpack() : null);
  _o.modelSettings = (this.modelSettings() !== null ? this.modelSettings()!.unpack() : null);
}
}

export class SettingsResponseT {
constructor(
  public steamVrTrackers: SteamVRTrackersSettingT|null = null,
  public filtering: FilteringSettingsT|null = null,
  public vrcOsc: VRCOSCSettingsT|null = null,
  public modelSettings: ModelSettingsT|null = null
){}


pack(builder:flatbuffers.Builder): flatbuffers.Offset {
  const steamVrTrackers = (this.steamVrTrackers !== null ? this.steamVrTrackers!.pack(builder) : 0);
  const filtering = (this.filtering !== null ? this.filtering!.pack(builder) : 0);
  const vrcOsc = (this.vrcOsc !== null ? this.vrcOsc!.pack(builder) : 0);
  const modelSettings = (this.modelSettings !== null ? this.modelSettings!.pack(builder) : 0);

  SettingsResponse.startSettingsResponse(builder);
  SettingsResponse.addSteamVrTrackers(builder, steamVrTrackers);
  SettingsResponse.addFiltering(builder, filtering);
  SettingsResponse.addVrcOsc(builder, vrcOsc);
  SettingsResponse.addModelSettings(builder, modelSettings);

  return SettingsResponse.endSettingsResponse(builder);
}
}
