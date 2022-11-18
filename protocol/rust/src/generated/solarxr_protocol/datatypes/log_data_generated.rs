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
pub enum LogDataOffset {}
#[derive(Copy, Clone, PartialEq)]

/// General purpose logging datatype
pub struct LogData<'a> {
  pub _tab: flatbuffers::Table<'a>,
}

impl<'a> flatbuffers::Follow<'a> for LogData<'a> {
  type Inner = LogData<'a>;
  #[inline]
  unsafe fn follow(buf: &'a [u8], loc: usize) -> Self::Inner {
    Self { _tab: flatbuffers::Table::new(buf, loc) }
  }
}

impl<'a> LogData<'a> {
  pub const VT_MESSAGE: flatbuffers::VOffsetT = 4;
  pub const VT_DATA: flatbuffers::VOffsetT = 6;

  #[inline]
  pub unsafe fn init_from_table(table: flatbuffers::Table<'a>) -> Self {
    LogData { _tab: table }
  }
  #[allow(unused_mut)]
  pub fn create<'bldr: 'args, 'args: 'mut_bldr, 'mut_bldr>(
    _fbb: &'mut_bldr mut flatbuffers::FlatBufferBuilder<'bldr>,
    args: &'args LogDataArgs<'args>
  ) -> flatbuffers::WIPOffset<LogData<'bldr>> {
    let mut builder = LogDataBuilder::new(_fbb);
    if let Some(x) = args.data { builder.add_data(x); }
    if let Some(x) = args.message { builder.add_message(x); }
    builder.finish()
  }


  #[inline]
  pub fn message(&self) -> Option<&'a str> {
    // Safety:
    // Created from valid Table for this object
    // which contains a valid value in this slot
    unsafe { self._tab.get::<flatbuffers::ForwardsUOffset<&str>>(LogData::VT_MESSAGE, None)}
  }
  #[inline]
  pub fn data(&self) -> Option<flatbuffers::Vector<'a, u8>> {
    // Safety:
    // Created from valid Table for this object
    // which contains a valid value in this slot
    unsafe { self._tab.get::<flatbuffers::ForwardsUOffset<flatbuffers::Vector<'a, u8>>>(LogData::VT_DATA, None)}
  }
}

impl flatbuffers::Verifiable for LogData<'_> {
  #[inline]
  fn run_verifier(
    v: &mut flatbuffers::Verifier, pos: usize
  ) -> Result<(), flatbuffers::InvalidFlatbuffer> {
    use self::flatbuffers::Verifiable;
    v.visit_table(pos)?
     .visit_field::<flatbuffers::ForwardsUOffset<&str>>("message", Self::VT_MESSAGE, false)?
     .visit_field::<flatbuffers::ForwardsUOffset<flatbuffers::Vector<'_, u8>>>("data", Self::VT_DATA, false)?
     .finish();
    Ok(())
  }
}
pub struct LogDataArgs<'a> {
    pub message: Option<flatbuffers::WIPOffset<&'a str>>,
    pub data: Option<flatbuffers::WIPOffset<flatbuffers::Vector<'a, u8>>>,
}
impl<'a> Default for LogDataArgs<'a> {
  #[inline]
  fn default() -> Self {
    LogDataArgs {
      message: None,
      data: None,
    }
  }
}

pub struct LogDataBuilder<'a: 'b, 'b> {
  fbb_: &'b mut flatbuffers::FlatBufferBuilder<'a>,
  start_: flatbuffers::WIPOffset<flatbuffers::TableUnfinishedWIPOffset>,
}
impl<'a: 'b, 'b> LogDataBuilder<'a, 'b> {
  #[inline]
  pub fn add_message(&mut self, message: flatbuffers::WIPOffset<&'b  str>) {
    self.fbb_.push_slot_always::<flatbuffers::WIPOffset<_>>(LogData::VT_MESSAGE, message);
  }
  #[inline]
  pub fn add_data(&mut self, data: flatbuffers::WIPOffset<flatbuffers::Vector<'b , u8>>) {
    self.fbb_.push_slot_always::<flatbuffers::WIPOffset<_>>(LogData::VT_DATA, data);
  }
  #[inline]
  pub fn new(_fbb: &'b mut flatbuffers::FlatBufferBuilder<'a>) -> LogDataBuilder<'a, 'b> {
    let start = _fbb.start_table();
    LogDataBuilder {
      fbb_: _fbb,
      start_: start,
    }
  }
  #[inline]
  pub fn finish(self) -> flatbuffers::WIPOffset<LogData<'a>> {
    let o = self.fbb_.end_table(self.start_);
    flatbuffers::WIPOffset::new(o.value())
  }
}

impl core::fmt::Debug for LogData<'_> {
  fn fmt(&self, f: &mut core::fmt::Formatter<'_>) -> core::fmt::Result {
    let mut ds = f.debug_struct("LogData");
      ds.field("message", &self.message());
      ds.field("data", &self.data());
      ds.finish()
  }
}
