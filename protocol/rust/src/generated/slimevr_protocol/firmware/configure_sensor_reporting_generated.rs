// automatically generated by the FlatBuffers compiler, do not modify
extern crate flatbuffers;
use std::mem;
use std::cmp::Ordering;
use self::flatbuffers::{EndianScalar, Follow};
use super::*;
pub enum ConfigureSensorReportingOffset {}
#[derive(Copy, Clone, PartialEq)]

pub struct ConfigureSensorReporting<'a> {
  pub _tab: flatbuffers::Table<'a>,
}

impl<'a> flatbuffers::Follow<'a> for ConfigureSensorReporting<'a> {
  type Inner = ConfigureSensorReporting<'a>;
  #[inline]
  fn follow(buf: &'a [u8], loc: usize) -> Self::Inner {
    Self { _tab: flatbuffers::Table { buf, loc } }
  }
}

impl<'a> ConfigureSensorReporting<'a> {
  pub const VT_ORIENTATION: flatbuffers::VOffsetT = 4;
  pub const VT_RAW_TRANS_ACCEL: flatbuffers::VOffsetT = 6;
  pub const VT_RAW_ROT_VEL: flatbuffers::VOffsetT = 8;

  #[inline]
  pub fn init_from_table(table: flatbuffers::Table<'a>) -> Self {
    ConfigureSensorReporting { _tab: table }
  }
  #[allow(unused_mut)]
  pub fn create<'bldr: 'args, 'args: 'mut_bldr, 'mut_bldr>(
    _fbb: &'mut_bldr mut flatbuffers::FlatBufferBuilder<'bldr>,
    args: &'args ConfigureSensorReportingArgs
  ) -> flatbuffers::WIPOffset<ConfigureSensorReporting<'bldr>> {
    let mut builder = ConfigureSensorReportingBuilder::new(_fbb);
    builder.add_raw_rot_vel(args.raw_rot_vel);
    builder.add_raw_trans_accel(args.raw_trans_accel);
    builder.add_orientation(args.orientation);
    builder.finish()
  }


  #[inline]
  pub fn orientation(&self) -> bool {
    self._tab.get::<bool>(ConfigureSensorReporting::VT_ORIENTATION, Some(false)).unwrap()
  }
  #[inline]
  pub fn raw_trans_accel(&self) -> bool {
    self._tab.get::<bool>(ConfigureSensorReporting::VT_RAW_TRANS_ACCEL, Some(false)).unwrap()
  }
  #[inline]
  pub fn raw_rot_vel(&self) -> bool {
    self._tab.get::<bool>(ConfigureSensorReporting::VT_RAW_ROT_VEL, Some(false)).unwrap()
  }
}

impl flatbuffers::Verifiable for ConfigureSensorReporting<'_> {
  #[inline]
  fn run_verifier(
    v: &mut flatbuffers::Verifier, pos: usize
  ) -> Result<(), flatbuffers::InvalidFlatbuffer> {
    use self::flatbuffers::Verifiable;
    v.visit_table(pos)?
     .visit_field::<bool>("orientation", Self::VT_ORIENTATION, false)?
     .visit_field::<bool>("raw_trans_accel", Self::VT_RAW_TRANS_ACCEL, false)?
     .visit_field::<bool>("raw_rot_vel", Self::VT_RAW_ROT_VEL, false)?
     .finish();
    Ok(())
  }
}
pub struct ConfigureSensorReportingArgs {
    pub orientation: bool,
    pub raw_trans_accel: bool,
    pub raw_rot_vel: bool,
}
impl<'a> Default for ConfigureSensorReportingArgs {
  #[inline]
  fn default() -> Self {
    ConfigureSensorReportingArgs {
      orientation: false,
      raw_trans_accel: false,
      raw_rot_vel: false,
    }
  }
}

pub struct ConfigureSensorReportingBuilder<'a: 'b, 'b> {
  fbb_: &'b mut flatbuffers::FlatBufferBuilder<'a>,
  start_: flatbuffers::WIPOffset<flatbuffers::TableUnfinishedWIPOffset>,
}
impl<'a: 'b, 'b> ConfigureSensorReportingBuilder<'a, 'b> {
  #[inline]
  pub fn add_orientation(&mut self, orientation: bool) {
    self.fbb_.push_slot::<bool>(ConfigureSensorReporting::VT_ORIENTATION, orientation, false);
  }
  #[inline]
  pub fn add_raw_trans_accel(&mut self, raw_trans_accel: bool) {
    self.fbb_.push_slot::<bool>(ConfigureSensorReporting::VT_RAW_TRANS_ACCEL, raw_trans_accel, false);
  }
  #[inline]
  pub fn add_raw_rot_vel(&mut self, raw_rot_vel: bool) {
    self.fbb_.push_slot::<bool>(ConfigureSensorReporting::VT_RAW_ROT_VEL, raw_rot_vel, false);
  }
  #[inline]
  pub fn new(_fbb: &'b mut flatbuffers::FlatBufferBuilder<'a>) -> ConfigureSensorReportingBuilder<'a, 'b> {
    let start = _fbb.start_table();
    ConfigureSensorReportingBuilder {
      fbb_: _fbb,
      start_: start,
    }
  }
  #[inline]
  pub fn finish(self) -> flatbuffers::WIPOffset<ConfigureSensorReporting<'a>> {
    let o = self.fbb_.end_table(self.start_);
    flatbuffers::WIPOffset::new(o.value())
  }
}

impl std::fmt::Debug for ConfigureSensorReporting<'_> {
  fn fmt(&self, f: &mut std::fmt::Formatter<'_>) -> std::fmt::Result {
    let mut ds = f.debug_struct("ConfigureSensorReporting");
      ds.field("orientation", &self.orientation());
      ds.field("raw_trans_accel", &self.raw_trans_accel());
      ds.field("raw_rot_vel", &self.raw_rot_vel());
      ds.finish()
  }
}
