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
pub enum ServerInfosResponseOffset {}
#[derive(Copy, Clone, PartialEq)]

/// Holds the Server informations, this is a basic table holding various informations about the currently running server
/// like its local ip address (usefull for standalone users so they can specify the ip of the server more easilly) and any more
/// infos we might want to add in the future. (like java version, working dir, server version ....)
/// This only holds the local ip for now. But there will be other informations added as we chose to display them on the gui for instance
pub struct ServerInfosResponse<'a> {
  pub _tab: flatbuffers::Table<'a>,
}

impl<'a> flatbuffers::Follow<'a> for ServerInfosResponse<'a> {
  type Inner = ServerInfosResponse<'a>;
  #[inline]
  unsafe fn follow(buf: &'a [u8], loc: usize) -> Self::Inner {
    Self { _tab: flatbuffers::Table::new(buf, loc) }
  }
}

impl<'a> ServerInfosResponse<'a> {
  pub const VT_LOCALIP: flatbuffers::VOffsetT = 4;

  #[inline]
  pub unsafe fn init_from_table(table: flatbuffers::Table<'a>) -> Self {
    ServerInfosResponse { _tab: table }
  }
  #[allow(unused_mut)]
  pub fn create<'bldr: 'args, 'args: 'mut_bldr, 'mut_bldr>(
    _fbb: &'mut_bldr mut flatbuffers::FlatBufferBuilder<'bldr>,
    args: &'args ServerInfosResponseArgs<'args>
  ) -> flatbuffers::WIPOffset<ServerInfosResponse<'bldr>> {
    let mut builder = ServerInfosResponseBuilder::new(_fbb);
    if let Some(x) = args.localIp { builder.add_localIp(x); }
    builder.finish()
  }


  #[inline]
  pub fn localIp(&self) -> Option<&'a str> {
    // Safety:
    // Created from valid Table for this object
    // which contains a valid value in this slot
    unsafe { self._tab.get::<flatbuffers::ForwardsUOffset<&str>>(ServerInfosResponse::VT_LOCALIP, None)}
  }
}

impl flatbuffers::Verifiable for ServerInfosResponse<'_> {
  #[inline]
  fn run_verifier(
    v: &mut flatbuffers::Verifier, pos: usize
  ) -> Result<(), flatbuffers::InvalidFlatbuffer> {
    use self::flatbuffers::Verifiable;
    v.visit_table(pos)?
     .visit_field::<flatbuffers::ForwardsUOffset<&str>>("localIp", Self::VT_LOCALIP, false)?
     .finish();
    Ok(())
  }
}
pub struct ServerInfosResponseArgs<'a> {
    pub localIp: Option<flatbuffers::WIPOffset<&'a str>>,
}
impl<'a> Default for ServerInfosResponseArgs<'a> {
  #[inline]
  fn default() -> Self {
    ServerInfosResponseArgs {
      localIp: None,
    }
  }
}

pub struct ServerInfosResponseBuilder<'a: 'b, 'b> {
  fbb_: &'b mut flatbuffers::FlatBufferBuilder<'a>,
  start_: flatbuffers::WIPOffset<flatbuffers::TableUnfinishedWIPOffset>,
}
impl<'a: 'b, 'b> ServerInfosResponseBuilder<'a, 'b> {
  #[inline]
  pub fn add_localIp(&mut self, localIp: flatbuffers::WIPOffset<&'b  str>) {
    self.fbb_.push_slot_always::<flatbuffers::WIPOffset<_>>(ServerInfosResponse::VT_LOCALIP, localIp);
  }
  #[inline]
  pub fn new(_fbb: &'b mut flatbuffers::FlatBufferBuilder<'a>) -> ServerInfosResponseBuilder<'a, 'b> {
    let start = _fbb.start_table();
    ServerInfosResponseBuilder {
      fbb_: _fbb,
      start_: start,
    }
  }
  #[inline]
  pub fn finish(self) -> flatbuffers::WIPOffset<ServerInfosResponse<'a>> {
    let o = self.fbb_.end_table(self.start_);
    flatbuffers::WIPOffset::new(o.value())
  }
}

impl core::fmt::Debug for ServerInfosResponse<'_> {
  fn fmt(&self, f: &mut core::fmt::Formatter<'_>) -> core::fmt::Result {
    let mut ds = f.debug_struct("ServerInfosResponse");
      ds.field("localIp", &self.localIp());
      ds.finish()
  }
}
