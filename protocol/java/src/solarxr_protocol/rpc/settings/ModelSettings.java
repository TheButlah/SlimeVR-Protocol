// automatically generated by the FlatBuffers compiler, do not modify

package solarxr_protocol.rpc.settings;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

/**
 * Settings for the skeletal model.
 */
@SuppressWarnings("unused")
public final class ModelSettings extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_22_10_26(); }
  public static ModelSettings getRootAsModelSettings(ByteBuffer _bb) { return getRootAsModelSettings(_bb, new ModelSettings()); }
  public static ModelSettings getRootAsModelSettings(ByteBuffer _bb, ModelSettings obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public ModelSettings __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public solarxr_protocol.rpc.settings.ModelToggles toggles() { return toggles(new solarxr_protocol.rpc.settings.ModelToggles()); }
  public solarxr_protocol.rpc.settings.ModelToggles toggles(solarxr_protocol.rpc.settings.ModelToggles obj) { int o = __offset(4); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }
  public solarxr_protocol.rpc.settings.ModelRatios ratios() { return ratios(new solarxr_protocol.rpc.settings.ModelRatios()); }
  public solarxr_protocol.rpc.settings.ModelRatios ratios(solarxr_protocol.rpc.settings.ModelRatios obj) { int o = __offset(6); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }
  public solarxr_protocol.rpc.settings.LegTweaksSettings legTweaks() { return legTweaks(new solarxr_protocol.rpc.settings.LegTweaksSettings()); }
  public solarxr_protocol.rpc.settings.LegTweaksSettings legTweaks(solarxr_protocol.rpc.settings.LegTweaksSettings obj) { int o = __offset(8); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }
  public boolean hasHmdHeight() { return 0 != __offset(10); }
  public float hmdHeight() { int o = __offset(10); return o != 0 ? bb.getFloat(o + bb_pos) : 0f; }

  public static int createModelSettings(FlatBufferBuilder builder,
      int togglesOffset,
      int ratiosOffset,
      int legTweaksOffset,
      float hmdHeight) {
    builder.startTable(4);
    ModelSettings.addHmdHeight(builder, hmdHeight);
    ModelSettings.addLegTweaks(builder, legTweaksOffset);
    ModelSettings.addRatios(builder, ratiosOffset);
    ModelSettings.addToggles(builder, togglesOffset);
    return ModelSettings.endModelSettings(builder);
  }

  public static void startModelSettings(FlatBufferBuilder builder) { builder.startTable(4); }
  public static void addToggles(FlatBufferBuilder builder, int togglesOffset) { builder.addOffset(0, togglesOffset, 0); }
  public static void addRatios(FlatBufferBuilder builder, int ratiosOffset) { builder.addOffset(1, ratiosOffset, 0); }
  public static void addLegTweaks(FlatBufferBuilder builder, int legTweaksOffset) { builder.addOffset(2, legTweaksOffset, 0); }
  public static void addHmdHeight(FlatBufferBuilder builder, float hmdHeight) { builder.addFloat(3, hmdHeight, 0f); }
  public static int endModelSettings(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public ModelSettings get(int j) { return get(new ModelSettings(), j); }
    public ModelSettings get(ModelSettings obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
  public ModelSettingsT unpack() {
    ModelSettingsT _o = new ModelSettingsT();
    unpackTo(_o);
    return _o;
  }
  public void unpackTo(ModelSettingsT _o) {
    if (toggles() != null) _o.setToggles(toggles().unpack());
    else _o.setToggles(null);
    if (ratios() != null) _o.setRatios(ratios().unpack());
    else _o.setRatios(null);
    if (legTweaks() != null) _o.setLegTweaks(legTweaks().unpack());
    else _o.setLegTweaks(null);
    Float _oHmdHeight = hasHmdHeight() ? hmdHeight() : null;
    _o.setHmdHeight(_oHmdHeight);
  }
  public static int pack(FlatBufferBuilder builder, ModelSettingsT _o) {
    if (_o == null) return 0;
    int _toggles = _o.getToggles() == null ? 0 : solarxr_protocol.rpc.settings.ModelToggles.pack(builder, _o.getToggles());
    int _ratios = _o.getRatios() == null ? 0 : solarxr_protocol.rpc.settings.ModelRatios.pack(builder, _o.getRatios());
    int _legTweaks = _o.getLegTweaks() == null ? 0 : solarxr_protocol.rpc.settings.LegTweaksSettings.pack(builder, _o.getLegTweaks());
    return createModelSettings(
      builder,
      _toggles,
      _ratios,
      _legTweaks,
      _o.getHmdHeight());
  }
}

