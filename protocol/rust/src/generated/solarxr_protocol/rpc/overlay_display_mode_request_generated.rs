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
pub enum OverlayDisplayModeRequestOffset {}
#[derive(Copy, Clone, PartialEq)]

/// Requests the current state of `OverlayDisplayModeResponse`.
pub struct OverlayDisplayModeRequest<'a> {
  pub _tab: flatbuffers::Table<'a>,
}

impl<'a> flatbuffers::Follow<'a> for OverlayDisplayModeRequest<'a> {
  type Inner = OverlayDisplayModeRequest<'a>;
  #[inline]
  unsafe fn follow(buf: &'a [u8], loc: usize) -> Self::Inner {
    Self { _tab: flatbuffers::Table::new(buf, loc) }
  }
}

impl<'a> OverlayDisplayModeRequest<'a> {

  #[inline]
  pub unsafe fn init_from_table(table: flatbuffers::Table<'a>) -> Self {
    OverlayDisplayModeRequest { _tab: table }
  }
  #[allow(unused_mut)]
  pub fn create<'bldr: 'args, 'args: 'mut_bldr, 'mut_bldr>(
    _fbb: &'mut_bldr mut flatbuffers::FlatBufferBuilder<'bldr>,
    _args: &'args OverlayDisplayModeRequestArgs
  ) -> flatbuffers::WIPOffset<OverlayDisplayModeRequest<'bldr>> {
    let mut builder = OverlayDisplayModeRequestBuilder::new(_fbb);
    builder.finish()
  }

}

impl flatbuffers::Verifiable for OverlayDisplayModeRequest<'_> {
  #[inline]
  fn run_verifier(
    v: &mut flatbuffers::Verifier, pos: usize
  ) -> Result<(), flatbuffers::InvalidFlatbuffer> {
    use self::flatbuffers::Verifiable;
    v.visit_table(pos)?
     .finish();
    Ok(())
  }
}
pub struct OverlayDisplayModeRequestArgs {
}
impl<'a> Default for OverlayDisplayModeRequestArgs {
  #[inline]
  fn default() -> Self {
    OverlayDisplayModeRequestArgs {
    }
  }
}

pub struct OverlayDisplayModeRequestBuilder<'a: 'b, 'b> {
  fbb_: &'b mut flatbuffers::FlatBufferBuilder<'a>,
  start_: flatbuffers::WIPOffset<flatbuffers::TableUnfinishedWIPOffset>,
}
impl<'a: 'b, 'b> OverlayDisplayModeRequestBuilder<'a, 'b> {
  #[inline]
  pub fn new(_fbb: &'b mut flatbuffers::FlatBufferBuilder<'a>) -> OverlayDisplayModeRequestBuilder<'a, 'b> {
    let start = _fbb.start_table();
    OverlayDisplayModeRequestBuilder {
      fbb_: _fbb,
      start_: start,
    }
  }
  #[inline]
  pub fn finish(self) -> flatbuffers::WIPOffset<OverlayDisplayModeRequest<'a>> {
    let o = self.fbb_.end_table(self.start_);
    flatbuffers::WIPOffset::new(o.value())
  }
}

impl core::fmt::Debug for OverlayDisplayModeRequest<'_> {
  fn fmt(&self, f: &mut core::fmt::Formatter<'_>) -> core::fmt::Result {
    let mut ds = f.debug_struct("OverlayDisplayModeRequest");
      ds.finish()
  }
}
