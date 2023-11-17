// automatically generated by the FlatBuffers compiler, do not modify
// @generated
extern crate alloc;
extern crate flatbuffers;
use alloc::boxed::Box;
use alloc::string::{String, ToString};
use alloc::vec::Vec;
use core::mem;
use core::cmp::Ordering;
use self::flatbuffers::{EndianScalar, Follow};
use super::*;
#[deprecated(since = "2.0.0", note = "Use associated constants instead. This will no longer be generated in 2021.")]
pub const ENUM_MIN_RPC_MESSAGE: u8 = 0;
#[deprecated(since = "2.0.0", note = "Use associated constants instead. This will no longer be generated in 2021.")]
pub const ENUM_MAX_RPC_MESSAGE: u8 = 56;
#[deprecated(since = "2.0.0", note = "Use associated constants instead. This will no longer be generated in 2021.")]
#[allow(non_camel_case_types)]
pub const ENUM_VALUES_RPC_MESSAGE: [RpcMessage; 57] = [
  RpcMessage::NONE,
  RpcMessage::HeartbeatRequest,
  RpcMessage::HeartbeatResponse,
  RpcMessage::ResetRequest,
  RpcMessage::ResetResponse,
  RpcMessage::AssignTrackerRequest,
  RpcMessage::SettingsRequest,
  RpcMessage::SettingsResponse,
  RpcMessage::ChangeSettingsRequest,
  RpcMessage::ClearDriftCompensationRequest,
  RpcMessage::RecordBVHRequest,
  RpcMessage::RecordBVHStatus,
  RpcMessage::SkeletonConfigRequest,
  RpcMessage::ChangeSkeletonConfigRequest,
  RpcMessage::SkeletonResetAllRequest,
  RpcMessage::SkeletonConfigResponse,
  RpcMessage::OpenSerialRequest,
  RpcMessage::CloseSerialRequest,
  RpcMessage::SetWifiRequest,
  RpcMessage::SerialUpdateResponse,
  RpcMessage::AutoBoneProcessRequest,
  RpcMessage::AutoBoneProcessStatusResponse,
  RpcMessage::AutoBoneEpochResponse,
  RpcMessage::OverlayDisplayModeRequest,
  RpcMessage::OverlayDisplayModeChangeRequest,
  RpcMessage::OverlayDisplayModeResponse,
  RpcMessage::SerialTrackerRebootRequest,
  RpcMessage::SerialTrackerGetInfoRequest,
  RpcMessage::SerialTrackerFactoryResetRequest,
  RpcMessage::SerialDevicesRequest,
  RpcMessage::SerialDevicesResponse,
  RpcMessage::NewSerialDeviceResponse,
  RpcMessage::StartWifiProvisioningRequest,
  RpcMessage::StopWifiProvisioningRequest,
  RpcMessage::WifiProvisioningStatusResponse,
  RpcMessage::ServerInfosRequest,
  RpcMessage::ServerInfosResponse,
  RpcMessage::LegTweaksTmpChange,
  RpcMessage::LegTweaksTmpClear,
  RpcMessage::TapDetectionSetupNotification,
  RpcMessage::SetPauseTrackingRequest,
  RpcMessage::StatusSystemRequest,
  RpcMessage::StatusSystemResponse,
  RpcMessage::StatusSystemUpdate,
  RpcMessage::StatusSystemFixed,
  RpcMessage::ClearMountingResetRequest,
  RpcMessage::HeightRequest,
  RpcMessage::HeightResponse,
  RpcMessage::AutoBoneApplyRequest,
  RpcMessage::AutoBoneStopRecordingRequest,
  RpcMessage::AutoBoneCancelRecordingRequest,
  RpcMessage::SaveFileNotification,
  RpcMessage::TrackingPauseStateRequest,
  RpcMessage::TrackingPauseStateResponse,
  RpcMessage::UnknownDeviceHandshakeNotification,
  RpcMessage::AddUnknownDeviceRequest,
  RpcMessage::ForgetDeviceRequest,
];

#[derive(Clone, Copy, PartialEq, Eq, PartialOrd, Ord, Hash, Default)]
#[repr(transparent)]
pub struct RpcMessage(pub u8);
#[allow(non_upper_case_globals)]
impl RpcMessage {
  pub const NONE: Self = Self(0);
  pub const HeartbeatRequest: Self = Self(1);
  pub const HeartbeatResponse: Self = Self(2);
  pub const ResetRequest: Self = Self(3);
  pub const ResetResponse: Self = Self(4);
  pub const AssignTrackerRequest: Self = Self(5);
  pub const SettingsRequest: Self = Self(6);
  pub const SettingsResponse: Self = Self(7);
  pub const ChangeSettingsRequest: Self = Self(8);
  pub const ClearDriftCompensationRequest: Self = Self(9);
  pub const RecordBVHRequest: Self = Self(10);
  pub const RecordBVHStatus: Self = Self(11);
  pub const SkeletonConfigRequest: Self = Self(12);
  pub const ChangeSkeletonConfigRequest: Self = Self(13);
  pub const SkeletonResetAllRequest: Self = Self(14);
  pub const SkeletonConfigResponse: Self = Self(15);
  pub const OpenSerialRequest: Self = Self(16);
  pub const CloseSerialRequest: Self = Self(17);
  pub const SetWifiRequest: Self = Self(18);
  pub const SerialUpdateResponse: Self = Self(19);
  pub const AutoBoneProcessRequest: Self = Self(20);
  pub const AutoBoneProcessStatusResponse: Self = Self(21);
  pub const AutoBoneEpochResponse: Self = Self(22);
  pub const OverlayDisplayModeRequest: Self = Self(23);
  pub const OverlayDisplayModeChangeRequest: Self = Self(24);
  pub const OverlayDisplayModeResponse: Self = Self(25);
  pub const SerialTrackerRebootRequest: Self = Self(26);
  pub const SerialTrackerGetInfoRequest: Self = Self(27);
  pub const SerialTrackerFactoryResetRequest: Self = Self(28);
  pub const SerialDevicesRequest: Self = Self(29);
  pub const SerialDevicesResponse: Self = Self(30);
  pub const NewSerialDeviceResponse: Self = Self(31);
  pub const StartWifiProvisioningRequest: Self = Self(32);
  pub const StopWifiProvisioningRequest: Self = Self(33);
  pub const WifiProvisioningStatusResponse: Self = Self(34);
  pub const ServerInfosRequest: Self = Self(35);
  pub const ServerInfosResponse: Self = Self(36);
  pub const LegTweaksTmpChange: Self = Self(37);
  pub const LegTweaksTmpClear: Self = Self(38);
  pub const TapDetectionSetupNotification: Self = Self(39);
  pub const SetPauseTrackingRequest: Self = Self(40);
  pub const StatusSystemRequest: Self = Self(41);
  pub const StatusSystemResponse: Self = Self(42);
  pub const StatusSystemUpdate: Self = Self(43);
  pub const StatusSystemFixed: Self = Self(44);
  pub const ClearMountingResetRequest: Self = Self(45);
  pub const HeightRequest: Self = Self(46);
  pub const HeightResponse: Self = Self(47);
  pub const AutoBoneApplyRequest: Self = Self(48);
  pub const AutoBoneStopRecordingRequest: Self = Self(49);
  pub const AutoBoneCancelRecordingRequest: Self = Self(50);
  pub const SaveFileNotification: Self = Self(51);
  pub const TrackingPauseStateRequest: Self = Self(52);
  pub const TrackingPauseStateResponse: Self = Self(53);
  pub const UnknownDeviceHandshakeNotification: Self = Self(54);
  pub const AddUnknownDeviceRequest: Self = Self(55);
  pub const ForgetDeviceRequest: Self = Self(56);

  pub const ENUM_MIN: u8 = 0;
  pub const ENUM_MAX: u8 = 56;
  pub const ENUM_VALUES: &'static [Self] = &[
    Self::NONE,
    Self::HeartbeatRequest,
    Self::HeartbeatResponse,
    Self::ResetRequest,
    Self::ResetResponse,
    Self::AssignTrackerRequest,
    Self::SettingsRequest,
    Self::SettingsResponse,
    Self::ChangeSettingsRequest,
    Self::ClearDriftCompensationRequest,
    Self::RecordBVHRequest,
    Self::RecordBVHStatus,
    Self::SkeletonConfigRequest,
    Self::ChangeSkeletonConfigRequest,
    Self::SkeletonResetAllRequest,
    Self::SkeletonConfigResponse,
    Self::OpenSerialRequest,
    Self::CloseSerialRequest,
    Self::SetWifiRequest,
    Self::SerialUpdateResponse,
    Self::AutoBoneProcessRequest,
    Self::AutoBoneProcessStatusResponse,
    Self::AutoBoneEpochResponse,
    Self::OverlayDisplayModeRequest,
    Self::OverlayDisplayModeChangeRequest,
    Self::OverlayDisplayModeResponse,
    Self::SerialTrackerRebootRequest,
    Self::SerialTrackerGetInfoRequest,
    Self::SerialTrackerFactoryResetRequest,
    Self::SerialDevicesRequest,
    Self::SerialDevicesResponse,
    Self::NewSerialDeviceResponse,
    Self::StartWifiProvisioningRequest,
    Self::StopWifiProvisioningRequest,
    Self::WifiProvisioningStatusResponse,
    Self::ServerInfosRequest,
    Self::ServerInfosResponse,
    Self::LegTweaksTmpChange,
    Self::LegTweaksTmpClear,
    Self::TapDetectionSetupNotification,
    Self::SetPauseTrackingRequest,
    Self::StatusSystemRequest,
    Self::StatusSystemResponse,
    Self::StatusSystemUpdate,
    Self::StatusSystemFixed,
    Self::ClearMountingResetRequest,
    Self::HeightRequest,
    Self::HeightResponse,
    Self::AutoBoneApplyRequest,
    Self::AutoBoneStopRecordingRequest,
    Self::AutoBoneCancelRecordingRequest,
    Self::SaveFileNotification,
    Self::TrackingPauseStateRequest,
    Self::TrackingPauseStateResponse,
    Self::UnknownDeviceHandshakeNotification,
    Self::AddUnknownDeviceRequest,
    Self::ForgetDeviceRequest,
  ];
  /// Returns the variant's name or "" if unknown.
  pub fn variant_name(self) -> Option<&'static str> {
    match self {
      Self::NONE => Some("NONE"),
      Self::HeartbeatRequest => Some("HeartbeatRequest"),
      Self::HeartbeatResponse => Some("HeartbeatResponse"),
      Self::ResetRequest => Some("ResetRequest"),
      Self::ResetResponse => Some("ResetResponse"),
      Self::AssignTrackerRequest => Some("AssignTrackerRequest"),
      Self::SettingsRequest => Some("SettingsRequest"),
      Self::SettingsResponse => Some("SettingsResponse"),
      Self::ChangeSettingsRequest => Some("ChangeSettingsRequest"),
      Self::ClearDriftCompensationRequest => Some("ClearDriftCompensationRequest"),
      Self::RecordBVHRequest => Some("RecordBVHRequest"),
      Self::RecordBVHStatus => Some("RecordBVHStatus"),
      Self::SkeletonConfigRequest => Some("SkeletonConfigRequest"),
      Self::ChangeSkeletonConfigRequest => Some("ChangeSkeletonConfigRequest"),
      Self::SkeletonResetAllRequest => Some("SkeletonResetAllRequest"),
      Self::SkeletonConfigResponse => Some("SkeletonConfigResponse"),
      Self::OpenSerialRequest => Some("OpenSerialRequest"),
      Self::CloseSerialRequest => Some("CloseSerialRequest"),
      Self::SetWifiRequest => Some("SetWifiRequest"),
      Self::SerialUpdateResponse => Some("SerialUpdateResponse"),
      Self::AutoBoneProcessRequest => Some("AutoBoneProcessRequest"),
      Self::AutoBoneProcessStatusResponse => Some("AutoBoneProcessStatusResponse"),
      Self::AutoBoneEpochResponse => Some("AutoBoneEpochResponse"),
      Self::OverlayDisplayModeRequest => Some("OverlayDisplayModeRequest"),
      Self::OverlayDisplayModeChangeRequest => Some("OverlayDisplayModeChangeRequest"),
      Self::OverlayDisplayModeResponse => Some("OverlayDisplayModeResponse"),
      Self::SerialTrackerRebootRequest => Some("SerialTrackerRebootRequest"),
      Self::SerialTrackerGetInfoRequest => Some("SerialTrackerGetInfoRequest"),
      Self::SerialTrackerFactoryResetRequest => Some("SerialTrackerFactoryResetRequest"),
      Self::SerialDevicesRequest => Some("SerialDevicesRequest"),
      Self::SerialDevicesResponse => Some("SerialDevicesResponse"),
      Self::NewSerialDeviceResponse => Some("NewSerialDeviceResponse"),
      Self::StartWifiProvisioningRequest => Some("StartWifiProvisioningRequest"),
      Self::StopWifiProvisioningRequest => Some("StopWifiProvisioningRequest"),
      Self::WifiProvisioningStatusResponse => Some("WifiProvisioningStatusResponse"),
      Self::ServerInfosRequest => Some("ServerInfosRequest"),
      Self::ServerInfosResponse => Some("ServerInfosResponse"),
      Self::LegTweaksTmpChange => Some("LegTweaksTmpChange"),
      Self::LegTweaksTmpClear => Some("LegTweaksTmpClear"),
      Self::TapDetectionSetupNotification => Some("TapDetectionSetupNotification"),
      Self::SetPauseTrackingRequest => Some("SetPauseTrackingRequest"),
      Self::StatusSystemRequest => Some("StatusSystemRequest"),
      Self::StatusSystemResponse => Some("StatusSystemResponse"),
      Self::StatusSystemUpdate => Some("StatusSystemUpdate"),
      Self::StatusSystemFixed => Some("StatusSystemFixed"),
      Self::ClearMountingResetRequest => Some("ClearMountingResetRequest"),
      Self::HeightRequest => Some("HeightRequest"),
      Self::HeightResponse => Some("HeightResponse"),
      Self::AutoBoneApplyRequest => Some("AutoBoneApplyRequest"),
      Self::AutoBoneStopRecordingRequest => Some("AutoBoneStopRecordingRequest"),
      Self::AutoBoneCancelRecordingRequest => Some("AutoBoneCancelRecordingRequest"),
      Self::SaveFileNotification => Some("SaveFileNotification"),
      Self::TrackingPauseStateRequest => Some("TrackingPauseStateRequest"),
      Self::TrackingPauseStateResponse => Some("TrackingPauseStateResponse"),
      Self::UnknownDeviceHandshakeNotification => Some("UnknownDeviceHandshakeNotification"),
      Self::AddUnknownDeviceRequest => Some("AddUnknownDeviceRequest"),
      Self::ForgetDeviceRequest => Some("ForgetDeviceRequest"),
      _ => None,
    }
  }
}
impl core::fmt::Debug for RpcMessage {
  fn fmt(&self, f: &mut core::fmt::Formatter) -> core::fmt::Result {
    if let Some(name) = self.variant_name() {
      f.write_str(name)
    } else {
      f.write_fmt(format_args!("<UNKNOWN {:?}>", self.0))
    }
  }
}
impl<'a> flatbuffers::Follow<'a> for RpcMessage {
  type Inner = Self;
  #[inline]
  unsafe fn follow(buf: &'a [u8], loc: usize) -> Self::Inner {
    let b = flatbuffers::read_scalar_at::<u8>(buf, loc);
    Self(b)
  }
}

impl flatbuffers::Push for RpcMessage {
    type Output = RpcMessage;
    #[inline]
    unsafe fn push(&self, dst: &mut [u8], _written_len: usize) {
        flatbuffers::emplace_scalar::<u8>(dst, self.0);
    }
}

impl flatbuffers::EndianScalar for RpcMessage {
  type Scalar = u8;
  #[inline]
  fn to_little_endian(self) -> u8 {
    self.0.to_le()
  }
  #[inline]
  #[allow(clippy::wrong_self_convention)]
  fn from_little_endian(v: u8) -> Self {
    let b = u8::from_le(v);
    Self(b)
  }
}

impl<'a> flatbuffers::Verifiable for RpcMessage {
  #[inline]
  fn run_verifier(
    v: &mut flatbuffers::Verifier, pos: usize
  ) -> Result<(), flatbuffers::InvalidFlatbuffer> {
    use self::flatbuffers::Verifiable;
    u8::run_verifier(v, pos)
  }
}

impl flatbuffers::SimpleToVerifyInSlice for RpcMessage {}
pub struct RpcMessageUnionTableOffset {}

