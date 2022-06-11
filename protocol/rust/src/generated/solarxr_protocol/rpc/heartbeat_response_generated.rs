// automatically generated by the FlatBuffers compiler, do not modify
extern crate alloc;
extern crate flatbuffers;
use alloc::boxed::Box;
use alloc::string::{String, ToString};
use alloc::vec::Vec;
use core::mem;
use core::cmp::Ordering;
use self::flatbuffers::{EndianScalar, Follow};
use super::*;
pub enum HeartbeatResponseOffset {}
#[derive(Copy, Clone, PartialEq)]

pub struct HeartbeatResponse<'a> {
  pub _tab: flatbuffers::Table<'a>,
}

impl<'a> flatbuffers::Follow<'a> for HeartbeatResponse<'a> {
  type Inner = HeartbeatResponse<'a>;
  #[inline]
  fn follow(buf: &'a [u8], loc: usize) -> Self::Inner {
    Self { _tab: flatbuffers::Table { buf, loc } }
  }
}

impl<'a> HeartbeatResponse<'a> {

  #[inline]
  pub fn init_from_table(table: flatbuffers::Table<'a>) -> Self {
    HeartbeatResponse { _tab: table }
  }
  #[allow(unused_mut)]
  pub fn create<'bldr: 'args, 'args: 'mut_bldr, 'mut_bldr>(
    _fbb: &'mut_bldr mut flatbuffers::FlatBufferBuilder<'bldr>,
    _args: &'args HeartbeatResponseArgs
  ) -> flatbuffers::WIPOffset<HeartbeatResponse<'bldr>> {
    let mut builder = HeartbeatResponseBuilder::new(_fbb);
    builder.finish()
  }

}

impl flatbuffers::Verifiable for HeartbeatResponse<'_> {
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
pub struct HeartbeatResponseArgs {
}
impl<'a> Default for HeartbeatResponseArgs {
  #[inline]
  fn default() -> Self {
    HeartbeatResponseArgs {
    }
  }
}

pub struct HeartbeatResponseBuilder<'a: 'b, 'b> {
  fbb_: &'b mut flatbuffers::FlatBufferBuilder<'a>,
  start_: flatbuffers::WIPOffset<flatbuffers::TableUnfinishedWIPOffset>,
}
impl<'a: 'b, 'b> HeartbeatResponseBuilder<'a, 'b> {
  #[inline]
  pub fn new(_fbb: &'b mut flatbuffers::FlatBufferBuilder<'a>) -> HeartbeatResponseBuilder<'a, 'b> {
    let start = _fbb.start_table();
    HeartbeatResponseBuilder {
      fbb_: _fbb,
      start_: start,
    }
  }
  #[inline]
  pub fn finish(self) -> flatbuffers::WIPOffset<HeartbeatResponse<'a>> {
    let o = self.fbb_.end_table(self.start_);
    flatbuffers::WIPOffset::new(o.value())
  }
}

impl core::fmt::Debug for HeartbeatResponse<'_> {
  fn fmt(&self, f: &mut core::fmt::Formatter<'_>) -> core::fmt::Result {
    let mut ds = f.debug_struct("HeartbeatResponse");
      ds.finish()
  }
}
