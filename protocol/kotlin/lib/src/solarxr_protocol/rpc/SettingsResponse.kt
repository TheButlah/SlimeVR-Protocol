// automatically generated by the FlatBuffers compiler, do not modify

package solarxr_protocol.rpc

import java.nio.*
import kotlin.math.sign
import com.google.flatbuffers.*

@Suppress("unused")
class SettingsResponse : Table() {

    fun __init(_i: Int, _bb: ByteBuffer)  {
        __reset(_i, _bb)
    }
    fun __assign(_i: Int, _bb: ByteBuffer) : SettingsResponse {
        __init(_i, _bb)
        return this
    }
    val steamVrTrackers : solarxr_protocol.rpc.SteamVRTrackersSetting? get() = steamVrTrackers(solarxr_protocol.rpc.SteamVRTrackersSetting())
    fun steamVrTrackers(obj: solarxr_protocol.rpc.SteamVRTrackersSetting) : solarxr_protocol.rpc.SteamVRTrackersSetting? {
        val o = __offset(4)
        return if (o != 0) {
            obj.__assign(__indirect(o + bb_pos), bb)
        } else {
            null
        }
    }
    val filtering : solarxr_protocol.rpc.FilteringSettings? get() = filtering(solarxr_protocol.rpc.FilteringSettings())
    fun filtering(obj: solarxr_protocol.rpc.FilteringSettings) : solarxr_protocol.rpc.FilteringSettings? {
        val o = __offset(6)
        return if (o != 0) {
            obj.__assign(__indirect(o + bb_pos), bb)
        } else {
            null
        }
    }
    val driftCompensation : solarxr_protocol.rpc.DriftCompensationSettings? get() = driftCompensation(solarxr_protocol.rpc.DriftCompensationSettings())
    fun driftCompensation(obj: solarxr_protocol.rpc.DriftCompensationSettings) : solarxr_protocol.rpc.DriftCompensationSettings? {
        val o = __offset(8)
        return if (o != 0) {
            obj.__assign(__indirect(o + bb_pos), bb)
        } else {
            null
        }
    }
    val oscRouter : solarxr_protocol.rpc.OSCRouterSettings? get() = oscRouter(solarxr_protocol.rpc.OSCRouterSettings())
    fun oscRouter(obj: solarxr_protocol.rpc.OSCRouterSettings) : solarxr_protocol.rpc.OSCRouterSettings? {
        val o = __offset(10)
        return if (o != 0) {
            obj.__assign(__indirect(o + bb_pos), bb)
        } else {
            null
        }
    }
    val vrcOsc : solarxr_protocol.rpc.VRCOSCSettings? get() = vrcOsc(solarxr_protocol.rpc.VRCOSCSettings())
    fun vrcOsc(obj: solarxr_protocol.rpc.VRCOSCSettings) : solarxr_protocol.rpc.VRCOSCSettings? {
        val o = __offset(12)
        return if (o != 0) {
            obj.__assign(__indirect(o + bb_pos), bb)
        } else {
            null
        }
    }
    val modelSettings : solarxr_protocol.rpc.settings.ModelSettings? get() = modelSettings(solarxr_protocol.rpc.settings.ModelSettings())
    fun modelSettings(obj: solarxr_protocol.rpc.settings.ModelSettings) : solarxr_protocol.rpc.settings.ModelSettings? {
        val o = __offset(14)
        return if (o != 0) {
            obj.__assign(__indirect(o + bb_pos), bb)
        } else {
            null
        }
    }
    val tapDetectionSettings : solarxr_protocol.rpc.TapDetectionSettings? get() = tapDetectionSettings(solarxr_protocol.rpc.TapDetectionSettings())
    fun tapDetectionSettings(obj: solarxr_protocol.rpc.TapDetectionSettings) : solarxr_protocol.rpc.TapDetectionSettings? {
        val o = __offset(16)
        return if (o != 0) {
            obj.__assign(__indirect(o + bb_pos), bb)
        } else {
            null
        }
    }
    companion object {
        fun validateVersion() = Constants.FLATBUFFERS_22_10_26()
        fun getRootAsSettingsResponse(_bb: ByteBuffer): SettingsResponse = getRootAsSettingsResponse(_bb, SettingsResponse())
        fun getRootAsSettingsResponse(_bb: ByteBuffer, obj: SettingsResponse): SettingsResponse {
            _bb.order(ByteOrder.LITTLE_ENDIAN)
            return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb))
        }
        fun createSettingsResponse(builder: FlatBufferBuilder, steamVrTrackersOffset: Int, filteringOffset: Int, driftCompensationOffset: Int, oscRouterOffset: Int, vrcOscOffset: Int, modelSettingsOffset: Int, tapDetectionSettingsOffset: Int) : Int {
            builder.startTable(7)
            addTapDetectionSettings(builder, tapDetectionSettingsOffset)
            addModelSettings(builder, modelSettingsOffset)
            addVrcOsc(builder, vrcOscOffset)
            addOscRouter(builder, oscRouterOffset)
            addDriftCompensation(builder, driftCompensationOffset)
            addFiltering(builder, filteringOffset)
            addSteamVrTrackers(builder, steamVrTrackersOffset)
            return endSettingsResponse(builder)
        }
        fun startSettingsResponse(builder: FlatBufferBuilder) = builder.startTable(7)
        fun addSteamVrTrackers(builder: FlatBufferBuilder, steamVrTrackers: Int) = builder.addOffset(0, steamVrTrackers, 0)
        fun addFiltering(builder: FlatBufferBuilder, filtering: Int) = builder.addOffset(1, filtering, 0)
        fun addDriftCompensation(builder: FlatBufferBuilder, driftCompensation: Int) = builder.addOffset(2, driftCompensation, 0)
        fun addOscRouter(builder: FlatBufferBuilder, oscRouter: Int) = builder.addOffset(3, oscRouter, 0)
        fun addVrcOsc(builder: FlatBufferBuilder, vrcOsc: Int) = builder.addOffset(4, vrcOsc, 0)
        fun addModelSettings(builder: FlatBufferBuilder, modelSettings: Int) = builder.addOffset(5, modelSettings, 0)
        fun addTapDetectionSettings(builder: FlatBufferBuilder, tapDetectionSettings: Int) = builder.addOffset(6, tapDetectionSettings, 0)
        fun endSettingsResponse(builder: FlatBufferBuilder) : Int {
            val o = builder.endTable()
            return o
        }
    }
}
