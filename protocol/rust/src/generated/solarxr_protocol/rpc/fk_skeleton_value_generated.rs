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
pub enum FkSkeletonValueOffset {}
#[derive(Copy, Clone, PartialEq)]

pub struct FkSkeletonValue<'a> {
  pub _tab: flatbuffers::Table<'a>,
}

impl<'a> flatbuffers::Follow<'a> for FkSkeletonValue<'a> {
  type Inner = FkSkeletonValue<'a>;
  #[inline]
  fn follow(buf: &'a [u8], loc: usize) -> Self::Inner {
    Self { _tab: flatbuffers::Table { buf, loc } }
  }
}

impl<'a> FkSkeletonValue<'a> {
  pub const VT_SKELETONVALUE: flatbuffers::VOffsetT = 4;
  pub const VT_VALUE: flatbuffers::VOffsetT = 6;

  #[inline]
  pub fn init_from_table(table: flatbuffers::Table<'a>) -> Self {
    FkSkeletonValue { _tab: table }
  }
  #[allow(unused_mut)]
  pub fn create<'bldr: 'args, 'args: 'mut_bldr, 'mut_bldr>(
    _fbb: &'mut_bldr mut flatbuffers::FlatBufferBuilder<'bldr>,
    args: &'args FkSkeletonValueArgs
  ) -> flatbuffers::WIPOffset<FkSkeletonValue<'bldr>> {
    let mut builder = FkSkeletonValueBuilder::new(_fbb);
    builder.add_value(args.value);
    builder.add_skeletonValue(args.skeletonValue);
    builder.finish()
  }


  #[inline]
  pub fn skeletonValue(&self) -> FkValue {
    self._tab.get::<FkValue>(FkSkeletonValue::VT_SKELETONVALUE, Some(FkValue::NONE)).unwrap()
  }
  #[inline]
  pub fn value(&self) -> f32 {
    self._tab.get::<f32>(FkSkeletonValue::VT_VALUE, Some(0.0)).unwrap()
  }
}

impl flatbuffers::Verifiable for FkSkeletonValue<'_> {
  #[inline]
  fn run_verifier(
    v: &mut flatbuffers::Verifier, pos: usize
  ) -> Result<(), flatbuffers::InvalidFlatbuffer> {
    use self::flatbuffers::Verifiable;
    v.visit_table(pos)?
     .visit_field::<FkValue>("skeletonValue", Self::VT_SKELETONVALUE, false)?
     .visit_field::<f32>("value", Self::VT_VALUE, false)?
     .finish();
    Ok(())
  }
}
pub struct FkSkeletonValueArgs {
    pub skeletonValue: FkValue,
    pub value: f32,
}
impl<'a> Default for FkSkeletonValueArgs {
  #[inline]
  fn default() -> Self {
    FkSkeletonValueArgs {
      skeletonValue: FkValue::NONE,
      value: 0.0,
    }
  }
}

pub struct FkSkeletonValueBuilder<'a: 'b, 'b> {
  fbb_: &'b mut flatbuffers::FlatBufferBuilder<'a>,
  start_: flatbuffers::WIPOffset<flatbuffers::TableUnfinishedWIPOffset>,
}
impl<'a: 'b, 'b> FkSkeletonValueBuilder<'a, 'b> {
  #[inline]
  pub fn add_skeletonValue(&mut self, skeletonValue: FkValue) {
    self.fbb_.push_slot::<FkValue>(FkSkeletonValue::VT_SKELETONVALUE, skeletonValue, FkValue::NONE);
  }
  #[inline]
  pub fn add_value(&mut self, value: f32) {
    self.fbb_.push_slot::<f32>(FkSkeletonValue::VT_VALUE, value, 0.0);
  }
  #[inline]
  pub fn new(_fbb: &'b mut flatbuffers::FlatBufferBuilder<'a>) -> FkSkeletonValueBuilder<'a, 'b> {
    let start = _fbb.start_table();
    FkSkeletonValueBuilder {
      fbb_: _fbb,
      start_: start,
    }
  }
  #[inline]
  pub fn finish(self) -> flatbuffers::WIPOffset<FkSkeletonValue<'a>> {
    let o = self.fbb_.end_table(self.start_);
    flatbuffers::WIPOffset::new(o.value())
  }
}

impl core::fmt::Debug for FkSkeletonValue<'_> {
  fn fmt(&self, f: &mut core::fmt::Formatter<'_>) -> core::fmt::Result {
    let mut ds = f.debug_struct("FkSkeletonValue");
      ds.field("skeletonValue", &self.skeletonValue());
      ds.field("value", &self.value());
      ds.finish()
  }
}
