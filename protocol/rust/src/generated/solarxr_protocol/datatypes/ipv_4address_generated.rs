// automatically generated by the FlatBuffers compiler, do not modify
extern crate flatbuffers;
use std::mem;
use std::cmp::Ordering;
use self::flatbuffers::{EndianScalar, Follow};
use super::*;
/// The 4 bytes of an ip address are stored in 32 bits in big endian order.
/// We will switch over to fixed size arrays when they are supported better.
// struct Ipv4Address, aligned to 4
#[repr(transparent)]
#[derive(Clone, Copy, PartialEq)]
pub struct Ipv4Address(pub [u8; 4]);
impl Default for Ipv4Address { 
  fn default() -> Self { 
    Self([0; 4])
  }
}
impl std::fmt::Debug for Ipv4Address {
  fn fmt(&self, f: &mut std::fmt::Formatter) -> std::fmt::Result {
    f.debug_struct("Ipv4Address")
      .field("addr", &self.addr())
      .finish()
  }
}

impl flatbuffers::SimpleToVerifyInSlice for Ipv4Address {}
impl flatbuffers::SafeSliceAccess for Ipv4Address {}
impl<'a> flatbuffers::Follow<'a> for Ipv4Address {
  type Inner = &'a Ipv4Address;
  #[inline]
  fn follow(buf: &'a [u8], loc: usize) -> Self::Inner {
    <&'a Ipv4Address>::follow(buf, loc)
  }
}
impl<'a> flatbuffers::Follow<'a> for &'a Ipv4Address {
  type Inner = &'a Ipv4Address;
  #[inline]
  fn follow(buf: &'a [u8], loc: usize) -> Self::Inner {
    flatbuffers::follow_cast_ref::<Ipv4Address>(buf, loc)
  }
}
impl<'b> flatbuffers::Push for Ipv4Address {
    type Output = Ipv4Address;
    #[inline]
    fn push(&self, dst: &mut [u8], _rest: &[u8]) {
        let src = unsafe {
            ::std::slice::from_raw_parts(self as *const Ipv4Address as *const u8, Self::size())
        };
        dst.copy_from_slice(src);
    }
}
impl<'b> flatbuffers::Push for &'b Ipv4Address {
    type Output = Ipv4Address;

    #[inline]
    fn push(&self, dst: &mut [u8], _rest: &[u8]) {
        let src = unsafe {
            ::std::slice::from_raw_parts(*self as *const Ipv4Address as *const u8, Self::size())
        };
        dst.copy_from_slice(src);
    }
}

impl<'a> flatbuffers::Verifiable for Ipv4Address {
  #[inline]
  fn run_verifier(
    v: &mut flatbuffers::Verifier, pos: usize
  ) -> Result<(), flatbuffers::InvalidFlatbuffer> {
    use self::flatbuffers::Verifiable;
    v.in_buffer::<Self>(pos)
  }
}

impl<'a> Ipv4Address {
  #[allow(clippy::too_many_arguments)]
  pub fn new(
    addr: u32,
  ) -> Self {
    let mut s = Self([0; 4]);
    s.set_addr(addr);
    s
  }

  pub fn addr(&self) -> u32 {
    let mut mem = core::mem::MaybeUninit::<u32>::uninit();
    unsafe {
      core::ptr::copy_nonoverlapping(
        self.0[0..].as_ptr(),
        mem.as_mut_ptr() as *mut u8,
        core::mem::size_of::<u32>(),
      );
      mem.assume_init()
    }.from_little_endian()
  }

  pub fn set_addr(&mut self, x: u32) {
    let x_le = x.to_little_endian();
    unsafe {
      core::ptr::copy_nonoverlapping(
        &x_le as *const u32 as *const u8,
        self.0[0..].as_mut_ptr(),
        core::mem::size_of::<u32>(),
      );
    }
  }

}

