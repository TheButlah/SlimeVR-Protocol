// automatically generated by the FlatBuffers compiler, do not modify

import * as flatbuffers from 'flatbuffers';

import { TransactionId, TransactionIdT } from '../../solarxr-protocol/datatypes/transaction-id.js';
import { AddUnknownDeviceRequest, AddUnknownDeviceRequestT } from '../../solarxr-protocol/rpc/add-unknown-device-request.js';
import { AssignTrackerRequest, AssignTrackerRequestT } from '../../solarxr-protocol/rpc/assign-tracker-request.js';
import { AutoBoneApplyRequest, AutoBoneApplyRequestT } from '../../solarxr-protocol/rpc/auto-bone-apply-request.js';
import { AutoBoneCancelRecordingRequest, AutoBoneCancelRecordingRequestT } from '../../solarxr-protocol/rpc/auto-bone-cancel-recording-request.js';
import { AutoBoneEpochResponse, AutoBoneEpochResponseT } from '../../solarxr-protocol/rpc/auto-bone-epoch-response.js';
import { AutoBoneProcessRequest, AutoBoneProcessRequestT } from '../../solarxr-protocol/rpc/auto-bone-process-request.js';
import { AutoBoneProcessStatusResponse, AutoBoneProcessStatusResponseT } from '../../solarxr-protocol/rpc/auto-bone-process-status-response.js';
import { AutoBoneStopRecordingRequest, AutoBoneStopRecordingRequestT } from '../../solarxr-protocol/rpc/auto-bone-stop-recording-request.js';
import { ChangeSettingsRequest, ChangeSettingsRequestT } from '../../solarxr-protocol/rpc/change-settings-request.js';
import { ChangeSkeletonConfigRequest, ChangeSkeletonConfigRequestT } from '../../solarxr-protocol/rpc/change-skeleton-config-request.js';
import { ClearDriftCompensationRequest, ClearDriftCompensationRequestT } from '../../solarxr-protocol/rpc/clear-drift-compensation-request.js';
import { ClearMountingResetRequest, ClearMountingResetRequestT } from '../../solarxr-protocol/rpc/clear-mounting-reset-request.js';
import { CloseSerialRequest, CloseSerialRequestT } from '../../solarxr-protocol/rpc/close-serial-request.js';
import { FirmwareUpdateRequest, FirmwareUpdateRequestT } from '../../solarxr-protocol/rpc/firmware-update-request.js';
import { FirmwareUpdateStatusResponse, FirmwareUpdateStatusResponseT } from '../../solarxr-protocol/rpc/firmware-update-status-response.js';
import { FirmwareUpdateStopQueuesRequest, FirmwareUpdateStopQueuesRequestT } from '../../solarxr-protocol/rpc/firmware-update-stop-queues-request.js';
import { ForgetDeviceRequest, ForgetDeviceRequestT } from '../../solarxr-protocol/rpc/forget-device-request.js';
import { HeartbeatRequest, HeartbeatRequestT } from '../../solarxr-protocol/rpc/heartbeat-request.js';
import { HeartbeatResponse, HeartbeatResponseT } from '../../solarxr-protocol/rpc/heartbeat-response.js';
import { HeightRequest, HeightRequestT } from '../../solarxr-protocol/rpc/height-request.js';
import { HeightResponse, HeightResponseT } from '../../solarxr-protocol/rpc/height-response.js';
import { LegTweaksTmpChange, LegTweaksTmpChangeT } from '../../solarxr-protocol/rpc/leg-tweaks-tmp-change.js';
import { LegTweaksTmpClear, LegTweaksTmpClearT } from '../../solarxr-protocol/rpc/leg-tweaks-tmp-clear.js';
import { NewSerialDeviceResponse, NewSerialDeviceResponseT } from '../../solarxr-protocol/rpc/new-serial-device-response.js';
import { OpenSerialRequest, OpenSerialRequestT } from '../../solarxr-protocol/rpc/open-serial-request.js';
import { OverlayDisplayModeChangeRequest, OverlayDisplayModeChangeRequestT } from '../../solarxr-protocol/rpc/overlay-display-mode-change-request.js';
import { OverlayDisplayModeRequest, OverlayDisplayModeRequestT } from '../../solarxr-protocol/rpc/overlay-display-mode-request.js';
import { OverlayDisplayModeResponse, OverlayDisplayModeResponseT } from '../../solarxr-protocol/rpc/overlay-display-mode-response.js';
import { RecordBVHRequest, RecordBVHRequestT } from '../../solarxr-protocol/rpc/record-bvhrequest.js';
import { RecordBVHStatus, RecordBVHStatusT } from '../../solarxr-protocol/rpc/record-bvhstatus.js';
import { ResetRequest, ResetRequestT } from '../../solarxr-protocol/rpc/reset-request.js';
import { ResetResponse, ResetResponseT } from '../../solarxr-protocol/rpc/reset-response.js';
import { RpcMessage, unionToRpcMessage, unionListToRpcMessage } from '../../solarxr-protocol/rpc/rpc-message.js';
import { SaveFileNotification, SaveFileNotificationT } from '../../solarxr-protocol/rpc/save-file-notification.js';
import { SerialDevicesRequest, SerialDevicesRequestT } from '../../solarxr-protocol/rpc/serial-devices-request.js';
import { SerialDevicesResponse, SerialDevicesResponseT } from '../../solarxr-protocol/rpc/serial-devices-response.js';
import { SerialTrackerFactoryResetRequest, SerialTrackerFactoryResetRequestT } from '../../solarxr-protocol/rpc/serial-tracker-factory-reset-request.js';
import { SerialTrackerGetInfoRequest, SerialTrackerGetInfoRequestT } from '../../solarxr-protocol/rpc/serial-tracker-get-info-request.js';
import { SerialTrackerGetWifiScanRequest, SerialTrackerGetWifiScanRequestT } from '../../solarxr-protocol/rpc/serial-tracker-get-wifi-scan-request.js';
import { SerialTrackerRebootRequest, SerialTrackerRebootRequestT } from '../../solarxr-protocol/rpc/serial-tracker-reboot-request.js';
import { SerialUpdateResponse, SerialUpdateResponseT } from '../../solarxr-protocol/rpc/serial-update-response.js';
import { ServerInfosRequest, ServerInfosRequestT } from '../../solarxr-protocol/rpc/server-infos-request.js';
import { ServerInfosResponse, ServerInfosResponseT } from '../../solarxr-protocol/rpc/server-infos-response.js';
import { SetPauseTrackingRequest, SetPauseTrackingRequestT } from '../../solarxr-protocol/rpc/set-pause-tracking-request.js';
import { SetWifiRequest, SetWifiRequestT } from '../../solarxr-protocol/rpc/set-wifi-request.js';
import { SettingsRequest, SettingsRequestT } from '../../solarxr-protocol/rpc/settings-request.js';
import { SettingsResponse, SettingsResponseT } from '../../solarxr-protocol/rpc/settings-response.js';
import { SkeletonConfigRequest, SkeletonConfigRequestT } from '../../solarxr-protocol/rpc/skeleton-config-request.js';
import { SkeletonConfigResponse, SkeletonConfigResponseT } from '../../solarxr-protocol/rpc/skeleton-config-response.js';
import { SkeletonResetAllRequest, SkeletonResetAllRequestT } from '../../solarxr-protocol/rpc/skeleton-reset-all-request.js';
import { StartWifiProvisioningRequest, StartWifiProvisioningRequestT } from '../../solarxr-protocol/rpc/start-wifi-provisioning-request.js';
import { StatusSystemFixed, StatusSystemFixedT } from '../../solarxr-protocol/rpc/status-system-fixed.js';
import { StatusSystemRequest, StatusSystemRequestT } from '../../solarxr-protocol/rpc/status-system-request.js';
import { StatusSystemResponse, StatusSystemResponseT } from '../../solarxr-protocol/rpc/status-system-response.js';
import { StatusSystemUpdate, StatusSystemUpdateT } from '../../solarxr-protocol/rpc/status-system-update.js';
import { StopWifiProvisioningRequest, StopWifiProvisioningRequestT } from '../../solarxr-protocol/rpc/stop-wifi-provisioning-request.js';
import { TapDetectionSetupNotification, TapDetectionSetupNotificationT } from '../../solarxr-protocol/rpc/tap-detection-setup-notification.js';
import { TrackingPauseStateRequest, TrackingPauseStateRequestT } from '../../solarxr-protocol/rpc/tracking-pause-state-request.js';
import { TrackingPauseStateResponse, TrackingPauseStateResponseT } from '../../solarxr-protocol/rpc/tracking-pause-state-response.js';
import { UnknownDeviceHandshakeNotification, UnknownDeviceHandshakeNotificationT } from '../../solarxr-protocol/rpc/unknown-device-handshake-notification.js';
import { WifiProvisioningStatusResponse, WifiProvisioningStatusResponseT } from '../../solarxr-protocol/rpc/wifi-provisioning-status-response.js';


export class RpcMessageHeader implements flatbuffers.IUnpackableObject<RpcMessageHeaderT> {
  bb: flatbuffers.ByteBuffer|null = null;
  bb_pos = 0;
  __init(i:number, bb:flatbuffers.ByteBuffer):RpcMessageHeader {
  this.bb_pos = i;
  this.bb = bb;
  return this;
}

static getRootAsRpcMessageHeader(bb:flatbuffers.ByteBuffer, obj?:RpcMessageHeader):RpcMessageHeader {
  return (obj || new RpcMessageHeader()).__init(bb.readInt32(bb.position()) + bb.position(), bb);
}

static getSizePrefixedRootAsRpcMessageHeader(bb:flatbuffers.ByteBuffer, obj?:RpcMessageHeader):RpcMessageHeader {
  bb.setPosition(bb.position() + flatbuffers.SIZE_PREFIX_LENGTH);
  return (obj || new RpcMessageHeader()).__init(bb.readInt32(bb.position()) + bb.position(), bb);
}

/**
 * For a request, this identifies the request. For a response, this corresponds
 * to the request that it is responding to.
 */
txId(obj?:TransactionId):TransactionId|null {
  const offset = this.bb!.__offset(this.bb_pos, 4);
  return offset ? (obj || new TransactionId()).__init(this.bb_pos + offset, this.bb!) : null;
}

messageType():RpcMessage {
  const offset = this.bb!.__offset(this.bb_pos, 6);
  return offset ? this.bb!.readUint8(this.bb_pos + offset) : RpcMessage.NONE;
}

message<T extends flatbuffers.Table>(obj:any):any|null {
  const offset = this.bb!.__offset(this.bb_pos, 8);
  return offset ? this.bb!.__union(obj, this.bb_pos + offset) : null;
}

static startRpcMessageHeader(builder:flatbuffers.Builder) {
  builder.startObject(3);
}

static addTxId(builder:flatbuffers.Builder, txIdOffset:flatbuffers.Offset) {
  builder.addFieldStruct(0, txIdOffset, 0);
}

static addMessageType(builder:flatbuffers.Builder, messageType:RpcMessage) {
  builder.addFieldInt8(1, messageType, RpcMessage.NONE);
}

static addMessage(builder:flatbuffers.Builder, messageOffset:flatbuffers.Offset) {
  builder.addFieldOffset(2, messageOffset, 0);
}

static endRpcMessageHeader(builder:flatbuffers.Builder):flatbuffers.Offset {
  const offset = builder.endObject();
  return offset;
}

static createRpcMessageHeader(builder:flatbuffers.Builder, txIdOffset:flatbuffers.Offset, messageType:RpcMessage, messageOffset:flatbuffers.Offset):flatbuffers.Offset {
  RpcMessageHeader.startRpcMessageHeader(builder);
  RpcMessageHeader.addTxId(builder, txIdOffset);
  RpcMessageHeader.addMessageType(builder, messageType);
  RpcMessageHeader.addMessage(builder, messageOffset);
  return RpcMessageHeader.endRpcMessageHeader(builder);
}

unpack(): RpcMessageHeaderT {
  return new RpcMessageHeaderT(
    (this.txId() !== null ? this.txId()!.unpack() : null),
    this.messageType(),
    (() => {
      const temp = unionToRpcMessage(this.messageType(), this.message.bind(this));
      if(temp === null) { return null; }
      return temp.unpack()
  })()
  );
}


unpackTo(_o: RpcMessageHeaderT): void {
  _o.txId = (this.txId() !== null ? this.txId()!.unpack() : null);
  _o.messageType = this.messageType();
  _o.message = (() => {
      const temp = unionToRpcMessage(this.messageType(), this.message.bind(this));
      if(temp === null) { return null; }
      return temp.unpack()
  })();
}
}

export class RpcMessageHeaderT implements flatbuffers.IGeneratedObject {
constructor(
  public txId: TransactionIdT|null = null,
  public messageType: RpcMessage = RpcMessage.NONE,
  public message: AddUnknownDeviceRequestT|AssignTrackerRequestT|AutoBoneApplyRequestT|AutoBoneCancelRecordingRequestT|AutoBoneEpochResponseT|AutoBoneProcessRequestT|AutoBoneProcessStatusResponseT|AutoBoneStopRecordingRequestT|ChangeSettingsRequestT|ChangeSkeletonConfigRequestT|ClearDriftCompensationRequestT|ClearMountingResetRequestT|CloseSerialRequestT|FirmwareUpdateRequestT|FirmwareUpdateStatusResponseT|FirmwareUpdateStopQueuesRequestT|ForgetDeviceRequestT|HeartbeatRequestT|HeartbeatResponseT|HeightRequestT|HeightResponseT|LegTweaksTmpChangeT|LegTweaksTmpClearT|NewSerialDeviceResponseT|OpenSerialRequestT|OverlayDisplayModeChangeRequestT|OverlayDisplayModeRequestT|OverlayDisplayModeResponseT|RecordBVHRequestT|RecordBVHStatusT|ResetRequestT|ResetResponseT|SaveFileNotificationT|SerialDevicesRequestT|SerialDevicesResponseT|SerialTrackerFactoryResetRequestT|SerialTrackerGetInfoRequestT|SerialTrackerGetWifiScanRequestT|SerialTrackerRebootRequestT|SerialUpdateResponseT|ServerInfosRequestT|ServerInfosResponseT|SetPauseTrackingRequestT|SetWifiRequestT|SettingsRequestT|SettingsResponseT|SkeletonConfigRequestT|SkeletonConfigResponseT|SkeletonResetAllRequestT|StartWifiProvisioningRequestT|StatusSystemFixedT|StatusSystemRequestT|StatusSystemResponseT|StatusSystemUpdateT|StopWifiProvisioningRequestT|TapDetectionSetupNotificationT|TrackingPauseStateRequestT|TrackingPauseStateResponseT|UnknownDeviceHandshakeNotificationT|WifiProvisioningStatusResponseT|null = null
){}


pack(builder:flatbuffers.Builder): flatbuffers.Offset {
  const message = builder.createObjectOffset(this.message);

  return RpcMessageHeader.createRpcMessageHeader(builder,
    (this.txId !== null ? this.txId!.pack(builder) : 0),
    this.messageType,
    message
  );
}
}
