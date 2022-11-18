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
/// Frequency as 32 bit float
// struct HzF32, aligned to 4
#[repr(transparent)]
#[derive(Clone, Copy, PartialEq)]
pub struct HzF32(pub [u8; 4]);
impl Default for HzF32 { 
  fn default() -> Self { 
    Self([0; 4])
  }
}
impl core::fmt::Debug for HzF32 {
  fn fmt(&self, f: &mut core::fmt::Formatter) -> core::fmt::Result {
    f.debug_struct("HzF32")
      .field("f", &self.f())
      .finish()
  }
}

impl flatbuffers::SimpleToVerifyInSlice for HzF32 {}
impl<'a> flatbuffers::Follow<'a> for HzF32 {
  type Inner = &'a HzF32;
  #[inline]
  unsafe fn follow(buf: &'a [u8], loc: usize) -> Self::Inner {
    <&'a HzF32>::follow(buf, loc)
  }
}
impl<'a> flatbuffers::Follow<'a> for &'a HzF32 {
  type Inner = &'a HzF32;
  #[inline]
  unsafe fn follow(buf: &'a [u8], loc: usize) -> Self::Inner {
    flatbuffers::follow_cast_ref::<HzF32>(buf, loc)
  }
}
impl<'b> flatbuffers::Push for HzF32 {
    type Output = HzF32;
    #[inline]
    unsafe fn push(&self, dst: &mut [u8], _written_len: usize) {
        let src = ::core::slice::from_raw_parts(self as *const HzF32 as *const u8, Self::size());
        dst.copy_from_slice(src);
    }
}

impl<'a> flatbuffers::Verifiable for HzF32 {
  #[inline]
  fn run_verifier(
    v: &mut flatbuffers::Verifier, pos: usize
  ) -> Result<(), flatbuffers::InvalidFlatbuffer> {
    use self::flatbuffers::Verifiable;
    v.in_buffer::<Self>(pos)
  }
}

impl<'a> HzF32 {
  #[allow(clippy::too_many_arguments)]
  pub fn new(
    f: f32,
  ) -> Self {
    let mut s = Self([0; 4]);
    s.set_f(f);
    s
  }

  pub fn f(&self) -> f32 {
    let mut mem = core::mem::MaybeUninit::<<f32 as EndianScalar>::Scalar>::uninit();
    // Safety:
    // Created from a valid Table for this object
    // Which contains a valid value in this slot
    EndianScalar::from_little_endian(unsafe {
      core::ptr::copy_nonoverlapping(
        self.0[0..].as_ptr(),
        mem.as_mut_ptr() as *mut u8,
        core::mem::size_of::<<f32 as EndianScalar>::Scalar>(),
      );
      mem.assume_init()
    })
  }

  pub fn set_f(&mut self, x: f32) {
    let x_le = x.to_little_endian();
    // Safety:
    // Created from a valid Table for this object
    // Which contains a valid value in this slot
    unsafe {
      core::ptr::copy_nonoverlapping(
        &x_le as *const _ as *const u8,
        self.0[0..].as_mut_ptr(),
        core::mem::size_of::<<f32 as EndianScalar>::Scalar>(),
      );
    }
  }

}

