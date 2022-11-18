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
pub enum SteamVRTrackersSettingOffset {}
#[derive(Copy, Clone, PartialEq)]

pub struct SteamVRTrackersSetting<'a> {
  pub _tab: flatbuffers::Table<'a>,
}

impl<'a> flatbuffers::Follow<'a> for SteamVRTrackersSetting<'a> {
  type Inner = SteamVRTrackersSetting<'a>;
  #[inline]
  unsafe fn follow(buf: &'a [u8], loc: usize) -> Self::Inner {
    Self { _tab: flatbuffers::Table::new(buf, loc) }
  }
}

impl<'a> SteamVRTrackersSetting<'a> {
  pub const VT_WAIST: flatbuffers::VOffsetT = 4;
  pub const VT_CHEST: flatbuffers::VOffsetT = 6;
  pub const VT_FEET: flatbuffers::VOffsetT = 8;
  pub const VT_KNEES: flatbuffers::VOffsetT = 10;
  pub const VT_ELBOWS: flatbuffers::VOffsetT = 12;

  #[inline]
  pub unsafe fn init_from_table(table: flatbuffers::Table<'a>) -> Self {
    SteamVRTrackersSetting { _tab: table }
  }
  #[allow(unused_mut)]
  pub fn create<'bldr: 'args, 'args: 'mut_bldr, 'mut_bldr>(
    _fbb: &'mut_bldr mut flatbuffers::FlatBufferBuilder<'bldr>,
    args: &'args SteamVRTrackersSettingArgs
  ) -> flatbuffers::WIPOffset<SteamVRTrackersSetting<'bldr>> {
    let mut builder = SteamVRTrackersSettingBuilder::new(_fbb);
    builder.add_elbows(args.elbows);
    builder.add_knees(args.knees);
    builder.add_feet(args.feet);
    builder.add_chest(args.chest);
    builder.add_waist(args.waist);
    builder.finish()
  }


  #[inline]
  pub fn waist(&self) -> bool {
    // Safety:
    // Created from valid Table for this object
    // which contains a valid value in this slot
    unsafe { self._tab.get::<bool>(SteamVRTrackersSetting::VT_WAIST, Some(false)).unwrap()}
  }
  #[inline]
  pub fn chest(&self) -> bool {
    // Safety:
    // Created from valid Table for this object
    // which contains a valid value in this slot
    unsafe { self._tab.get::<bool>(SteamVRTrackersSetting::VT_CHEST, Some(false)).unwrap()}
  }
  #[inline]
  pub fn feet(&self) -> bool {
    // Safety:
    // Created from valid Table for this object
    // which contains a valid value in this slot
    unsafe { self._tab.get::<bool>(SteamVRTrackersSetting::VT_FEET, Some(false)).unwrap()}
  }
  #[inline]
  pub fn knees(&self) -> bool {
    // Safety:
    // Created from valid Table for this object
    // which contains a valid value in this slot
    unsafe { self._tab.get::<bool>(SteamVRTrackersSetting::VT_KNEES, Some(false)).unwrap()}
  }
  #[inline]
  pub fn elbows(&self) -> bool {
    // Safety:
    // Created from valid Table for this object
    // which contains a valid value in this slot
    unsafe { self._tab.get::<bool>(SteamVRTrackersSetting::VT_ELBOWS, Some(false)).unwrap()}
  }
}

impl flatbuffers::Verifiable for SteamVRTrackersSetting<'_> {
  #[inline]
  fn run_verifier(
    v: &mut flatbuffers::Verifier, pos: usize
  ) -> Result<(), flatbuffers::InvalidFlatbuffer> {
    use self::flatbuffers::Verifiable;
    v.visit_table(pos)?
     .visit_field::<bool>("waist", Self::VT_WAIST, false)?
     .visit_field::<bool>("chest", Self::VT_CHEST, false)?
     .visit_field::<bool>("feet", Self::VT_FEET, false)?
     .visit_field::<bool>("knees", Self::VT_KNEES, false)?
     .visit_field::<bool>("elbows", Self::VT_ELBOWS, false)?
     .finish();
    Ok(())
  }
}
pub struct SteamVRTrackersSettingArgs {
    pub waist: bool,
    pub chest: bool,
    pub feet: bool,
    pub knees: bool,
    pub elbows: bool,
}
impl<'a> Default for SteamVRTrackersSettingArgs {
  #[inline]
  fn default() -> Self {
    SteamVRTrackersSettingArgs {
      waist: false,
      chest: false,
      feet: false,
      knees: false,
      elbows: false,
    }
  }
}

pub struct SteamVRTrackersSettingBuilder<'a: 'b, 'b> {
  fbb_: &'b mut flatbuffers::FlatBufferBuilder<'a>,
  start_: flatbuffers::WIPOffset<flatbuffers::TableUnfinishedWIPOffset>,
}
impl<'a: 'b, 'b> SteamVRTrackersSettingBuilder<'a, 'b> {
  #[inline]
  pub fn add_waist(&mut self, waist: bool) {
    self.fbb_.push_slot::<bool>(SteamVRTrackersSetting::VT_WAIST, waist, false);
  }
  #[inline]
  pub fn add_chest(&mut self, chest: bool) {
    self.fbb_.push_slot::<bool>(SteamVRTrackersSetting::VT_CHEST, chest, false);
  }
  #[inline]
  pub fn add_feet(&mut self, feet: bool) {
    self.fbb_.push_slot::<bool>(SteamVRTrackersSetting::VT_FEET, feet, false);
  }
  #[inline]
  pub fn add_knees(&mut self, knees: bool) {
    self.fbb_.push_slot::<bool>(SteamVRTrackersSetting::VT_KNEES, knees, false);
  }
  #[inline]
  pub fn add_elbows(&mut self, elbows: bool) {
    self.fbb_.push_slot::<bool>(SteamVRTrackersSetting::VT_ELBOWS, elbows, false);
  }
  #[inline]
  pub fn new(_fbb: &'b mut flatbuffers::FlatBufferBuilder<'a>) -> SteamVRTrackersSettingBuilder<'a, 'b> {
    let start = _fbb.start_table();
    SteamVRTrackersSettingBuilder {
      fbb_: _fbb,
      start_: start,
    }
  }
  #[inline]
  pub fn finish(self) -> flatbuffers::WIPOffset<SteamVRTrackersSetting<'a>> {
    let o = self.fbb_.end_table(self.start_);
    flatbuffers::WIPOffset::new(o.value())
  }
}

impl core::fmt::Debug for SteamVRTrackersSetting<'_> {
  fn fmt(&self, f: &mut core::fmt::Formatter<'_>) -> core::fmt::Result {
    let mut ds = f.debug_struct("SteamVRTrackersSetting");
      ds.field("waist", &self.waist());
      ds.field("chest", &self.chest());
      ds.field("feet", &self.feet());
      ds.field("knees", &self.knees());
      ds.field("elbows", &self.elbows());
      ds.finish()
  }
}
