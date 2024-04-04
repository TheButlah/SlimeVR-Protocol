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
pub enum AutoBoneSettingsOffset {}
#[derive(Copy, Clone, PartialEq)]

/// https://github.com/SlimeVR/SlimeVR-Server/blob/v0.8.3/server/src/main/java/dev/slimevr/config/AutoBoneConfig.kt
pub struct AutoBoneSettings<'a> {
  pub _tab: flatbuffers::Table<'a>,
}

impl<'a> flatbuffers::Follow<'a> for AutoBoneSettings<'a> {
  type Inner = AutoBoneSettings<'a>;
  #[inline]
  unsafe fn follow(buf: &'a [u8], loc: usize) -> Self::Inner {
    Self { _tab: flatbuffers::Table::new(buf, loc) }
  }
}

impl<'a> AutoBoneSettings<'a> {
  pub const VT_CURSOR_INCREMENT: flatbuffers::VOffsetT = 4;
  pub const VT_MIN_DATA_DISTANCE: flatbuffers::VOffsetT = 6;
  pub const VT_MAX_DATA_DISTANCE: flatbuffers::VOffsetT = 8;
  pub const VT_NUM_EPOCHS: flatbuffers::VOffsetT = 10;
  pub const VT_PRINT_EVERY_NUM_EPOCHS: flatbuffers::VOffsetT = 12;
  pub const VT_INITIAL_ADJUST_RATE: flatbuffers::VOffsetT = 14;
  pub const VT_ADJUST_RATE_DECAY: flatbuffers::VOffsetT = 16;
  pub const VT_SLIDE_ERROR_FACTOR: flatbuffers::VOffsetT = 18;
  pub const VT_OFFSET_SLIDE_ERROR_FACTOR: flatbuffers::VOffsetT = 20;
  pub const VT_FOOT_HEIGHT_OFFSET_ERROR_FACTOR: flatbuffers::VOffsetT = 22;
  pub const VT_BODY_PROPORTION_ERROR_FACTOR: flatbuffers::VOffsetT = 24;
  pub const VT_HEIGHT_ERROR_FACTOR: flatbuffers::VOffsetT = 26;
  pub const VT_POSITION_ERROR_FACTOR: flatbuffers::VOffsetT = 28;
  pub const VT_POSITION_OFFSET_ERROR_FACTOR: flatbuffers::VOffsetT = 30;
  pub const VT_CALC_INIT_ERROR: flatbuffers::VOffsetT = 32;
  pub const VT_RANDOMIZE_FRAME_ORDER: flatbuffers::VOffsetT = 34;
  pub const VT_SCALE_EACH_STEP: flatbuffers::VOffsetT = 36;
  pub const VT_SAMPLE_COUNT: flatbuffers::VOffsetT = 38;
  pub const VT_SAMPLE_RATE_MS: flatbuffers::VOffsetT = 40;
  pub const VT_SAVE_RECORDINGS: flatbuffers::VOffsetT = 42;
  pub const VT_USE_SKELETON_HEIGHT: flatbuffers::VOffsetT = 44;
  pub const VT_RAND_SEED: flatbuffers::VOffsetT = 46;

  #[inline]
  pub unsafe fn init_from_table(table: flatbuffers::Table<'a>) -> Self {
    AutoBoneSettings { _tab: table }
  }
  #[allow(unused_mut)]
  pub fn create<'bldr: 'args, 'args: 'mut_bldr, 'mut_bldr>(
    _fbb: &'mut_bldr mut flatbuffers::FlatBufferBuilder<'bldr>,
    args: &'args AutoBoneSettingsArgs
  ) -> flatbuffers::WIPOffset<AutoBoneSettings<'bldr>> {
    let mut builder = AutoBoneSettingsBuilder::new(_fbb);
    if let Some(x) = args.rand_seed { builder.add_rand_seed(x); }
    if let Some(x) = args.sample_rate_ms { builder.add_sample_rate_ms(x); }
    if let Some(x) = args.sample_count { builder.add_sample_count(x); }
    if let Some(x) = args.position_offset_error_factor { builder.add_position_offset_error_factor(x); }
    if let Some(x) = args.position_error_factor { builder.add_position_error_factor(x); }
    if let Some(x) = args.height_error_factor { builder.add_height_error_factor(x); }
    if let Some(x) = args.body_proportion_error_factor { builder.add_body_proportion_error_factor(x); }
    if let Some(x) = args.foot_height_offset_error_factor { builder.add_foot_height_offset_error_factor(x); }
    if let Some(x) = args.offset_slide_error_factor { builder.add_offset_slide_error_factor(x); }
    if let Some(x) = args.slide_error_factor { builder.add_slide_error_factor(x); }
    if let Some(x) = args.adjust_rate_decay { builder.add_adjust_rate_decay(x); }
    if let Some(x) = args.initial_adjust_rate { builder.add_initial_adjust_rate(x); }
    if let Some(x) = args.print_every_num_epochs { builder.add_print_every_num_epochs(x); }
    if let Some(x) = args.num_epochs { builder.add_num_epochs(x); }
    if let Some(x) = args.max_data_distance { builder.add_max_data_distance(x); }
    if let Some(x) = args.min_data_distance { builder.add_min_data_distance(x); }
    if let Some(x) = args.cursor_increment { builder.add_cursor_increment(x); }
    if let Some(x) = args.use_skeleton_height { builder.add_use_skeleton_height(x); }
    if let Some(x) = args.save_recordings { builder.add_save_recordings(x); }
    if let Some(x) = args.scale_each_step { builder.add_scale_each_step(x); }
    if let Some(x) = args.randomize_frame_order { builder.add_randomize_frame_order(x); }
    if let Some(x) = args.calc_init_error { builder.add_calc_init_error(x); }
    builder.finish()
  }


  #[inline]
  pub fn cursor_increment(&self) -> Option<i32> {
    // Safety:
    // Created from valid Table for this object
    // which contains a valid value in this slot
    unsafe { self._tab.get::<i32>(AutoBoneSettings::VT_CURSOR_INCREMENT, None)}
  }
  #[inline]
  pub fn min_data_distance(&self) -> Option<i32> {
    // Safety:
    // Created from valid Table for this object
    // which contains a valid value in this slot
    unsafe { self._tab.get::<i32>(AutoBoneSettings::VT_MIN_DATA_DISTANCE, None)}
  }
  #[inline]
  pub fn max_data_distance(&self) -> Option<i32> {
    // Safety:
    // Created from valid Table for this object
    // which contains a valid value in this slot
    unsafe { self._tab.get::<i32>(AutoBoneSettings::VT_MAX_DATA_DISTANCE, None)}
  }
  #[inline]
  pub fn num_epochs(&self) -> Option<i32> {
    // Safety:
    // Created from valid Table for this object
    // which contains a valid value in this slot
    unsafe { self._tab.get::<i32>(AutoBoneSettings::VT_NUM_EPOCHS, None)}
  }
  #[inline]
  pub fn print_every_num_epochs(&self) -> Option<i32> {
    // Safety:
    // Created from valid Table for this object
    // which contains a valid value in this slot
    unsafe { self._tab.get::<i32>(AutoBoneSettings::VT_PRINT_EVERY_NUM_EPOCHS, None)}
  }
  #[inline]
  pub fn initial_adjust_rate(&self) -> Option<f32> {
    // Safety:
    // Created from valid Table for this object
    // which contains a valid value in this slot
    unsafe { self._tab.get::<f32>(AutoBoneSettings::VT_INITIAL_ADJUST_RATE, None)}
  }
  #[inline]
  pub fn adjust_rate_decay(&self) -> Option<f32> {
    // Safety:
    // Created from valid Table for this object
    // which contains a valid value in this slot
    unsafe { self._tab.get::<f32>(AutoBoneSettings::VT_ADJUST_RATE_DECAY, None)}
  }
  #[inline]
  pub fn slide_error_factor(&self) -> Option<f32> {
    // Safety:
    // Created from valid Table for this object
    // which contains a valid value in this slot
    unsafe { self._tab.get::<f32>(AutoBoneSettings::VT_SLIDE_ERROR_FACTOR, None)}
  }
  #[inline]
  pub fn offset_slide_error_factor(&self) -> Option<f32> {
    // Safety:
    // Created from valid Table for this object
    // which contains a valid value in this slot
    unsafe { self._tab.get::<f32>(AutoBoneSettings::VT_OFFSET_SLIDE_ERROR_FACTOR, None)}
  }
  #[inline]
  pub fn foot_height_offset_error_factor(&self) -> Option<f32> {
    // Safety:
    // Created from valid Table for this object
    // which contains a valid value in this slot
    unsafe { self._tab.get::<f32>(AutoBoneSettings::VT_FOOT_HEIGHT_OFFSET_ERROR_FACTOR, None)}
  }
  #[inline]
  pub fn body_proportion_error_factor(&self) -> Option<f32> {
    // Safety:
    // Created from valid Table for this object
    // which contains a valid value in this slot
    unsafe { self._tab.get::<f32>(AutoBoneSettings::VT_BODY_PROPORTION_ERROR_FACTOR, None)}
  }
  #[inline]
  pub fn height_error_factor(&self) -> Option<f32> {
    // Safety:
    // Created from valid Table for this object
    // which contains a valid value in this slot
    unsafe { self._tab.get::<f32>(AutoBoneSettings::VT_HEIGHT_ERROR_FACTOR, None)}
  }
  #[inline]
  pub fn position_error_factor(&self) -> Option<f32> {
    // Safety:
    // Created from valid Table for this object
    // which contains a valid value in this slot
    unsafe { self._tab.get::<f32>(AutoBoneSettings::VT_POSITION_ERROR_FACTOR, None)}
  }
  #[inline]
  pub fn position_offset_error_factor(&self) -> Option<f32> {
    // Safety:
    // Created from valid Table for this object
    // which contains a valid value in this slot
    unsafe { self._tab.get::<f32>(AutoBoneSettings::VT_POSITION_OFFSET_ERROR_FACTOR, None)}
  }
  #[inline]
  pub fn calc_init_error(&self) -> Option<bool> {
    // Safety:
    // Created from valid Table for this object
    // which contains a valid value in this slot
    unsafe { self._tab.get::<bool>(AutoBoneSettings::VT_CALC_INIT_ERROR, None)}
  }
  #[inline]
  pub fn randomize_frame_order(&self) -> Option<bool> {
    // Safety:
    // Created from valid Table for this object
    // which contains a valid value in this slot
    unsafe { self._tab.get::<bool>(AutoBoneSettings::VT_RANDOMIZE_FRAME_ORDER, None)}
  }
  #[inline]
  pub fn scale_each_step(&self) -> Option<bool> {
    // Safety:
    // Created from valid Table for this object
    // which contains a valid value in this slot
    unsafe { self._tab.get::<bool>(AutoBoneSettings::VT_SCALE_EACH_STEP, None)}
  }
  #[inline]
  pub fn sample_count(&self) -> Option<i32> {
    // Safety:
    // Created from valid Table for this object
    // which contains a valid value in this slot
    unsafe { self._tab.get::<i32>(AutoBoneSettings::VT_SAMPLE_COUNT, None)}
  }
  #[inline]
  pub fn sample_rate_ms(&self) -> Option<i64> {
    // Safety:
    // Created from valid Table for this object
    // which contains a valid value in this slot
    unsafe { self._tab.get::<i64>(AutoBoneSettings::VT_SAMPLE_RATE_MS, None)}
  }
  #[inline]
  pub fn save_recordings(&self) -> Option<bool> {
    // Safety:
    // Created from valid Table for this object
    // which contains a valid value in this slot
    unsafe { self._tab.get::<bool>(AutoBoneSettings::VT_SAVE_RECORDINGS, None)}
  }
  #[inline]
  pub fn use_skeleton_height(&self) -> Option<bool> {
    // Safety:
    // Created from valid Table for this object
    // which contains a valid value in this slot
    unsafe { self._tab.get::<bool>(AutoBoneSettings::VT_USE_SKELETON_HEIGHT, None)}
  }
  #[inline]
  pub fn rand_seed(&self) -> Option<i64> {
    // Safety:
    // Created from valid Table for this object
    // which contains a valid value in this slot
    unsafe { self._tab.get::<i64>(AutoBoneSettings::VT_RAND_SEED, None)}
  }
}

impl flatbuffers::Verifiable for AutoBoneSettings<'_> {
  #[inline]
  fn run_verifier(
    v: &mut flatbuffers::Verifier, pos: usize
  ) -> Result<(), flatbuffers::InvalidFlatbuffer> {
    use self::flatbuffers::Verifiable;
    v.visit_table(pos)?
     .visit_field::<i32>("cursor_increment", Self::VT_CURSOR_INCREMENT, false)?
     .visit_field::<i32>("min_data_distance", Self::VT_MIN_DATA_DISTANCE, false)?
     .visit_field::<i32>("max_data_distance", Self::VT_MAX_DATA_DISTANCE, false)?
     .visit_field::<i32>("num_epochs", Self::VT_NUM_EPOCHS, false)?
     .visit_field::<i32>("print_every_num_epochs", Self::VT_PRINT_EVERY_NUM_EPOCHS, false)?
     .visit_field::<f32>("initial_adjust_rate", Self::VT_INITIAL_ADJUST_RATE, false)?
     .visit_field::<f32>("adjust_rate_decay", Self::VT_ADJUST_RATE_DECAY, false)?
     .visit_field::<f32>("slide_error_factor", Self::VT_SLIDE_ERROR_FACTOR, false)?
     .visit_field::<f32>("offset_slide_error_factor", Self::VT_OFFSET_SLIDE_ERROR_FACTOR, false)?
     .visit_field::<f32>("foot_height_offset_error_factor", Self::VT_FOOT_HEIGHT_OFFSET_ERROR_FACTOR, false)?
     .visit_field::<f32>("body_proportion_error_factor", Self::VT_BODY_PROPORTION_ERROR_FACTOR, false)?
     .visit_field::<f32>("height_error_factor", Self::VT_HEIGHT_ERROR_FACTOR, false)?
     .visit_field::<f32>("position_error_factor", Self::VT_POSITION_ERROR_FACTOR, false)?
     .visit_field::<f32>("position_offset_error_factor", Self::VT_POSITION_OFFSET_ERROR_FACTOR, false)?
     .visit_field::<bool>("calc_init_error", Self::VT_CALC_INIT_ERROR, false)?
     .visit_field::<bool>("randomize_frame_order", Self::VT_RANDOMIZE_FRAME_ORDER, false)?
     .visit_field::<bool>("scale_each_step", Self::VT_SCALE_EACH_STEP, false)?
     .visit_field::<i32>("sample_count", Self::VT_SAMPLE_COUNT, false)?
     .visit_field::<i64>("sample_rate_ms", Self::VT_SAMPLE_RATE_MS, false)?
     .visit_field::<bool>("save_recordings", Self::VT_SAVE_RECORDINGS, false)?
     .visit_field::<bool>("use_skeleton_height", Self::VT_USE_SKELETON_HEIGHT, false)?
     .visit_field::<i64>("rand_seed", Self::VT_RAND_SEED, false)?
     .finish();
    Ok(())
  }
}
pub struct AutoBoneSettingsArgs {
    pub cursor_increment: Option<i32>,
    pub min_data_distance: Option<i32>,
    pub max_data_distance: Option<i32>,
    pub num_epochs: Option<i32>,
    pub print_every_num_epochs: Option<i32>,
    pub initial_adjust_rate: Option<f32>,
    pub adjust_rate_decay: Option<f32>,
    pub slide_error_factor: Option<f32>,
    pub offset_slide_error_factor: Option<f32>,
    pub foot_height_offset_error_factor: Option<f32>,
    pub body_proportion_error_factor: Option<f32>,
    pub height_error_factor: Option<f32>,
    pub position_error_factor: Option<f32>,
    pub position_offset_error_factor: Option<f32>,
    pub calc_init_error: Option<bool>,
    pub randomize_frame_order: Option<bool>,
    pub scale_each_step: Option<bool>,
    pub sample_count: Option<i32>,
    pub sample_rate_ms: Option<i64>,
    pub save_recordings: Option<bool>,
    pub use_skeleton_height: Option<bool>,
    pub rand_seed: Option<i64>,
}
impl<'a> Default for AutoBoneSettingsArgs {
  #[inline]
  fn default() -> Self {
    AutoBoneSettingsArgs {
      cursor_increment: None,
      min_data_distance: None,
      max_data_distance: None,
      num_epochs: None,
      print_every_num_epochs: None,
      initial_adjust_rate: None,
      adjust_rate_decay: None,
      slide_error_factor: None,
      offset_slide_error_factor: None,
      foot_height_offset_error_factor: None,
      body_proportion_error_factor: None,
      height_error_factor: None,
      position_error_factor: None,
      position_offset_error_factor: None,
      calc_init_error: None,
      randomize_frame_order: None,
      scale_each_step: None,
      sample_count: None,
      sample_rate_ms: None,
      save_recordings: None,
      use_skeleton_height: None,
      rand_seed: None,
    }
  }
}

pub struct AutoBoneSettingsBuilder<'a: 'b, 'b> {
  fbb_: &'b mut flatbuffers::FlatBufferBuilder<'a>,
  start_: flatbuffers::WIPOffset<flatbuffers::TableUnfinishedWIPOffset>,
}
impl<'a: 'b, 'b> AutoBoneSettingsBuilder<'a, 'b> {
  #[inline]
  pub fn add_cursor_increment(&mut self, cursor_increment: i32) {
    self.fbb_.push_slot_always::<i32>(AutoBoneSettings::VT_CURSOR_INCREMENT, cursor_increment);
  }
  #[inline]
  pub fn add_min_data_distance(&mut self, min_data_distance: i32) {
    self.fbb_.push_slot_always::<i32>(AutoBoneSettings::VT_MIN_DATA_DISTANCE, min_data_distance);
  }
  #[inline]
  pub fn add_max_data_distance(&mut self, max_data_distance: i32) {
    self.fbb_.push_slot_always::<i32>(AutoBoneSettings::VT_MAX_DATA_DISTANCE, max_data_distance);
  }
  #[inline]
  pub fn add_num_epochs(&mut self, num_epochs: i32) {
    self.fbb_.push_slot_always::<i32>(AutoBoneSettings::VT_NUM_EPOCHS, num_epochs);
  }
  #[inline]
  pub fn add_print_every_num_epochs(&mut self, print_every_num_epochs: i32) {
    self.fbb_.push_slot_always::<i32>(AutoBoneSettings::VT_PRINT_EVERY_NUM_EPOCHS, print_every_num_epochs);
  }
  #[inline]
  pub fn add_initial_adjust_rate(&mut self, initial_adjust_rate: f32) {
    self.fbb_.push_slot_always::<f32>(AutoBoneSettings::VT_INITIAL_ADJUST_RATE, initial_adjust_rate);
  }
  #[inline]
  pub fn add_adjust_rate_decay(&mut self, adjust_rate_decay: f32) {
    self.fbb_.push_slot_always::<f32>(AutoBoneSettings::VT_ADJUST_RATE_DECAY, adjust_rate_decay);
  }
  #[inline]
  pub fn add_slide_error_factor(&mut self, slide_error_factor: f32) {
    self.fbb_.push_slot_always::<f32>(AutoBoneSettings::VT_SLIDE_ERROR_FACTOR, slide_error_factor);
  }
  #[inline]
  pub fn add_offset_slide_error_factor(&mut self, offset_slide_error_factor: f32) {
    self.fbb_.push_slot_always::<f32>(AutoBoneSettings::VT_OFFSET_SLIDE_ERROR_FACTOR, offset_slide_error_factor);
  }
  #[inline]
  pub fn add_foot_height_offset_error_factor(&mut self, foot_height_offset_error_factor: f32) {
    self.fbb_.push_slot_always::<f32>(AutoBoneSettings::VT_FOOT_HEIGHT_OFFSET_ERROR_FACTOR, foot_height_offset_error_factor);
  }
  #[inline]
  pub fn add_body_proportion_error_factor(&mut self, body_proportion_error_factor: f32) {
    self.fbb_.push_slot_always::<f32>(AutoBoneSettings::VT_BODY_PROPORTION_ERROR_FACTOR, body_proportion_error_factor);
  }
  #[inline]
  pub fn add_height_error_factor(&mut self, height_error_factor: f32) {
    self.fbb_.push_slot_always::<f32>(AutoBoneSettings::VT_HEIGHT_ERROR_FACTOR, height_error_factor);
  }
  #[inline]
  pub fn add_position_error_factor(&mut self, position_error_factor: f32) {
    self.fbb_.push_slot_always::<f32>(AutoBoneSettings::VT_POSITION_ERROR_FACTOR, position_error_factor);
  }
  #[inline]
  pub fn add_position_offset_error_factor(&mut self, position_offset_error_factor: f32) {
    self.fbb_.push_slot_always::<f32>(AutoBoneSettings::VT_POSITION_OFFSET_ERROR_FACTOR, position_offset_error_factor);
  }
  #[inline]
  pub fn add_calc_init_error(&mut self, calc_init_error: bool) {
    self.fbb_.push_slot_always::<bool>(AutoBoneSettings::VT_CALC_INIT_ERROR, calc_init_error);
  }
  #[inline]
  pub fn add_randomize_frame_order(&mut self, randomize_frame_order: bool) {
    self.fbb_.push_slot_always::<bool>(AutoBoneSettings::VT_RANDOMIZE_FRAME_ORDER, randomize_frame_order);
  }
  #[inline]
  pub fn add_scale_each_step(&mut self, scale_each_step: bool) {
    self.fbb_.push_slot_always::<bool>(AutoBoneSettings::VT_SCALE_EACH_STEP, scale_each_step);
  }
  #[inline]
  pub fn add_sample_count(&mut self, sample_count: i32) {
    self.fbb_.push_slot_always::<i32>(AutoBoneSettings::VT_SAMPLE_COUNT, sample_count);
  }
  #[inline]
  pub fn add_sample_rate_ms(&mut self, sample_rate_ms: i64) {
    self.fbb_.push_slot_always::<i64>(AutoBoneSettings::VT_SAMPLE_RATE_MS, sample_rate_ms);
  }
  #[inline]
  pub fn add_save_recordings(&mut self, save_recordings: bool) {
    self.fbb_.push_slot_always::<bool>(AutoBoneSettings::VT_SAVE_RECORDINGS, save_recordings);
  }
  #[inline]
  pub fn add_use_skeleton_height(&mut self, use_skeleton_height: bool) {
    self.fbb_.push_slot_always::<bool>(AutoBoneSettings::VT_USE_SKELETON_HEIGHT, use_skeleton_height);
  }
  #[inline]
  pub fn add_rand_seed(&mut self, rand_seed: i64) {
    self.fbb_.push_slot_always::<i64>(AutoBoneSettings::VT_RAND_SEED, rand_seed);
  }
  #[inline]
  pub fn new(_fbb: &'b mut flatbuffers::FlatBufferBuilder<'a>) -> AutoBoneSettingsBuilder<'a, 'b> {
    let start = _fbb.start_table();
    AutoBoneSettingsBuilder {
      fbb_: _fbb,
      start_: start,
    }
  }
  #[inline]
  pub fn finish(self) -> flatbuffers::WIPOffset<AutoBoneSettings<'a>> {
    let o = self.fbb_.end_table(self.start_);
    flatbuffers::WIPOffset::new(o.value())
  }
}

impl core::fmt::Debug for AutoBoneSettings<'_> {
  fn fmt(&self, f: &mut core::fmt::Formatter<'_>) -> core::fmt::Result {
    let mut ds = f.debug_struct("AutoBoneSettings");
      ds.field("cursor_increment", &self.cursor_increment());
      ds.field("min_data_distance", &self.min_data_distance());
      ds.field("max_data_distance", &self.max_data_distance());
      ds.field("num_epochs", &self.num_epochs());
      ds.field("print_every_num_epochs", &self.print_every_num_epochs());
      ds.field("initial_adjust_rate", &self.initial_adjust_rate());
      ds.field("adjust_rate_decay", &self.adjust_rate_decay());
      ds.field("slide_error_factor", &self.slide_error_factor());
      ds.field("offset_slide_error_factor", &self.offset_slide_error_factor());
      ds.field("foot_height_offset_error_factor", &self.foot_height_offset_error_factor());
      ds.field("body_proportion_error_factor", &self.body_proportion_error_factor());
      ds.field("height_error_factor", &self.height_error_factor());
      ds.field("position_error_factor", &self.position_error_factor());
      ds.field("position_offset_error_factor", &self.position_offset_error_factor());
      ds.field("calc_init_error", &self.calc_init_error());
      ds.field("randomize_frame_order", &self.randomize_frame_order());
      ds.field("scale_each_step", &self.scale_each_step());
      ds.field("sample_count", &self.sample_count());
      ds.field("sample_rate_ms", &self.sample_rate_ms());
      ds.field("save_recordings", &self.save_recordings());
      ds.field("use_skeleton_height", &self.use_skeleton_height());
      ds.field("rand_seed", &self.rand_seed());
      ds.finish()
  }
}
