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
pub enum ResetResponseOffset {}
#[derive(Copy, Clone, PartialEq)]

pub struct ResetResponse<'a> {
  pub _tab: flatbuffers::Table<'a>,
}

impl<'a> flatbuffers::Follow<'a> for ResetResponse<'a> {
  type Inner = ResetResponse<'a>;
  #[inline]
  unsafe fn follow(buf: &'a [u8], loc: usize) -> Self::Inner {
    Self { _tab: flatbuffers::Table::new(buf, loc) }
  }
}

impl<'a> ResetResponse<'a> {
  pub const VT_RESET_TYPE: flatbuffers::VOffsetT = 4;
  pub const VT_STATUS: flatbuffers::VOffsetT = 6;

  #[inline]
  pub unsafe fn init_from_table(table: flatbuffers::Table<'a>) -> Self {
    ResetResponse { _tab: table }
  }
  #[allow(unused_mut)]
  pub fn create<'bldr: 'args, 'args: 'mut_bldr, 'mut_bldr>(
    _fbb: &'mut_bldr mut flatbuffers::FlatBufferBuilder<'bldr>,
    args: &'args ResetResponseArgs
  ) -> flatbuffers::WIPOffset<ResetResponse<'bldr>> {
    let mut builder = ResetResponseBuilder::new(_fbb);
    builder.add_status(args.status);
    builder.add_reset_type(args.reset_type);
    builder.finish()
  }


  #[inline]
  pub fn reset_type(&self) -> ResetType {
    // Safety:
    // Created from valid Table for this object
    // which contains a valid value in this slot
    unsafe { self._tab.get::<ResetType>(ResetResponse::VT_RESET_TYPE, Some(ResetType::Quick)).unwrap()}
  }
  #[inline]
  pub fn status(&self) -> ResetStatus {
    // Safety:
    // Created from valid Table for this object
    // which contains a valid value in this slot
    unsafe { self._tab.get::<ResetStatus>(ResetResponse::VT_STATUS, Some(ResetStatus::TRIGGERED)).unwrap()}
  }
}

impl flatbuffers::Verifiable for ResetResponse<'_> {
  #[inline]
  fn run_verifier(
    v: &mut flatbuffers::Verifier, pos: usize
  ) -> Result<(), flatbuffers::InvalidFlatbuffer> {
    use self::flatbuffers::Verifiable;
    v.visit_table(pos)?
     .visit_field::<ResetType>("reset_type", Self::VT_RESET_TYPE, false)?
     .visit_field::<ResetStatus>("status", Self::VT_STATUS, false)?
     .finish();
    Ok(())
  }
}
pub struct ResetResponseArgs {
    pub reset_type: ResetType,
    pub status: ResetStatus,
}
impl<'a> Default for ResetResponseArgs {
  #[inline]
  fn default() -> Self {
    ResetResponseArgs {
      reset_type: ResetType::Quick,
      status: ResetStatus::TRIGGERED,
    }
  }
}

pub struct ResetResponseBuilder<'a: 'b, 'b> {
  fbb_: &'b mut flatbuffers::FlatBufferBuilder<'a>,
  start_: flatbuffers::WIPOffset<flatbuffers::TableUnfinishedWIPOffset>,
}
impl<'a: 'b, 'b> ResetResponseBuilder<'a, 'b> {
  #[inline]
  pub fn add_reset_type(&mut self, reset_type: ResetType) {
    self.fbb_.push_slot::<ResetType>(ResetResponse::VT_RESET_TYPE, reset_type, ResetType::Quick);
  }
  #[inline]
  pub fn add_status(&mut self, status: ResetStatus) {
    self.fbb_.push_slot::<ResetStatus>(ResetResponse::VT_STATUS, status, ResetStatus::TRIGGERED);
  }
  #[inline]
  pub fn new(_fbb: &'b mut flatbuffers::FlatBufferBuilder<'a>) -> ResetResponseBuilder<'a, 'b> {
    let start = _fbb.start_table();
    ResetResponseBuilder {
      fbb_: _fbb,
      start_: start,
    }
  }
  #[inline]
  pub fn finish(self) -> flatbuffers::WIPOffset<ResetResponse<'a>> {
    let o = self.fbb_.end_table(self.start_);
    flatbuffers::WIPOffset::new(o.value())
  }
}

impl core::fmt::Debug for ResetResponse<'_> {
  fn fmt(&self, f: &mut core::fmt::Formatter<'_>) -> core::fmt::Result {
    let mut ds = f.debug_struct("ResetResponse");
      ds.field("reset_type", &self.reset_type());
      ds.field("status", &self.status());
      ds.finish()
  }
}
