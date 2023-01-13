// automatically generated by the FlatBuffers compiler, do not modify

package solarxr_protocol.rpc

import java.nio.*
import kotlin.math.sign
import com.google.flatbuffers.*

/**
 * OSC router forwards messages it receives, to allow the usage of multiple OSC programs for the same app.
 */
@Suppress("unused")
class OSCRouterSettings : Table() {

    fun __init(_i: Int, _bb: ByteBuffer)  {
        __reset(_i, _bb)
    }
    fun __assign(_i: Int, _bb: ByteBuffer) : OSCRouterSettings {
        __init(_i, _bb)
        return this
    }
    val oscSettings : solarxr_protocol.rpc.OSCSettings? get() = oscSettings(solarxr_protocol.rpc.OSCSettings())
    fun oscSettings(obj: solarxr_protocol.rpc.OSCSettings) : solarxr_protocol.rpc.OSCSettings? {
        val o = __offset(4)
        return if (o != 0) {
            obj.__assign(__indirect(o + bb_pos), bb)
        } else {
            null
        }
    }
    companion object {
        fun validateVersion() = Constants.FLATBUFFERS_22_10_26()
        fun getRootAsOSCRouterSettings(_bb: ByteBuffer): OSCRouterSettings = getRootAsOSCRouterSettings(_bb, OSCRouterSettings())
        fun getRootAsOSCRouterSettings(_bb: ByteBuffer, obj: OSCRouterSettings): OSCRouterSettings {
            _bb.order(ByteOrder.LITTLE_ENDIAN)
            return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb))
        }
        fun createOSCRouterSettings(builder: FlatBufferBuilder, oscSettingsOffset: Int) : Int {
            builder.startTable(1)
            addOscSettings(builder, oscSettingsOffset)
            return endOSCRouterSettings(builder)
        }
        fun startOSCRouterSettings(builder: FlatBufferBuilder) = builder.startTable(1)
        fun addOscSettings(builder: FlatBufferBuilder, oscSettings: Int) = builder.addOffset(0, oscSettings, 0)
        fun endOSCRouterSettings(builder: FlatBufferBuilder) : Int {
            val o = builder.endTable()
            return o
        }
    }
}
