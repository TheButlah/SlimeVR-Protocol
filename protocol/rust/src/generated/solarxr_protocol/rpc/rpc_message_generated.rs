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
pub const ENUM_MAX_RPC_MESSAGE: u8 = 28;
#[deprecated(since = "2.0.0", note = "Use associated constants instead. This will no longer be generated in 2021.")]
#[allow(non_camel_case_types)]
pub const ENUM_VALUES_RPC_MESSAGE: [RpcMessage; 29] = [
  RpcMessage::NONE,
  RpcMessage::HeartbeatRequest,
  RpcMessage::HeartbeatResponse,
  RpcMessage::ResetRequest,
  RpcMessage::AssignTrackerRequest,
  RpcMessage::SettingsRequest,
  RpcMessage::SettingsResponse,
  RpcMessage::ChangeSettingsRequest,
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
  pub const AssignTrackerRequest: Self = Self(4);
  pub const SettingsRequest: Self = Self(5);
  pub const SettingsResponse: Self = Self(6);
  pub const ChangeSettingsRequest: Self = Self(7);
  pub const RecordBVHRequest: Self = Self(8);
  pub const RecordBVHStatus: Self = Self(9);
  pub const SkeletonConfigRequest: Self = Self(10);
  pub const ChangeSkeletonConfigRequest: Self = Self(11);
  pub const SkeletonResetAllRequest: Self = Self(12);
  pub const SkeletonConfigResponse: Self = Self(13);
  pub const OpenSerialRequest: Self = Self(14);
  pub const CloseSerialRequest: Self = Self(15);
  pub const SetWifiRequest: Self = Self(16);
  pub const SerialUpdateResponse: Self = Self(17);
  pub const AutoBoneProcessRequest: Self = Self(18);
  pub const AutoBoneProcessStatusResponse: Self = Self(19);
  pub const AutoBoneEpochResponse: Self = Self(20);
  pub const OverlayDisplayModeRequest: Self = Self(21);
  pub const OverlayDisplayModeChangeRequest: Self = Self(22);
  pub const OverlayDisplayModeResponse: Self = Self(23);
  pub const SerialTrackerRebootRequest: Self = Self(24);
  pub const SerialTrackerGetInfoRequest: Self = Self(25);
  pub const SerialTrackerFactoryResetRequest: Self = Self(26);
  pub const SerialDevicesRequest: Self = Self(27);
  pub const SerialDevicesResponse: Self = Self(28);

  pub const ENUM_MIN: u8 = 0;
  pub const ENUM_MAX: u8 = 28;
  pub const ENUM_VALUES: &'static [Self] = &[
    Self::NONE,
    Self::HeartbeatRequest,
    Self::HeartbeatResponse,
    Self::ResetRequest,
    Self::AssignTrackerRequest,
    Self::SettingsRequest,
    Self::SettingsResponse,
    Self::ChangeSettingsRequest,
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
  ];
  /// Returns the variant's name or "" if unknown.
  pub fn variant_name(self) -> Option<&'static str> {
    match self {
      Self::NONE => Some("NONE"),
      Self::HeartbeatRequest => Some("HeartbeatRequest"),
      Self::HeartbeatResponse => Some("HeartbeatResponse"),
      Self::ResetRequest => Some("ResetRequest"),
      Self::AssignTrackerRequest => Some("AssignTrackerRequest"),
      Self::SettingsRequest => Some("SettingsRequest"),
      Self::SettingsResponse => Some("SettingsResponse"),
      Self::ChangeSettingsRequest => Some("ChangeSettingsRequest"),
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

