// automatically generated by the FlatBuffers compiler, do not modify

package solarxr_protocol.rpc

import java.nio.*
import kotlin.math.sign
import com.google.flatbuffers.*

/**
 * Requests the current state of `OverlayDisplayModeResponse`.
 */
@Suppress("unused")
class OverlayDisplayModeRequest : Table() {

    fun __init(_i: Int, _bb: ByteBuffer)  {
        __reset(_i, _bb)
    }
    fun __assign(_i: Int, _bb: ByteBuffer) : OverlayDisplayModeRequest {
        __init(_i, _bb)
        return this
    }
    companion object {
        fun validateVersion() = Constants.FLATBUFFERS_22_10_26()
        fun getRootAsOverlayDisplayModeRequest(_bb: ByteBuffer): OverlayDisplayModeRequest = getRootAsOverlayDisplayModeRequest(_bb, OverlayDisplayModeRequest())
        fun getRootAsOverlayDisplayModeRequest(_bb: ByteBuffer, obj: OverlayDisplayModeRequest): OverlayDisplayModeRequest {
            _bb.order(ByteOrder.LITTLE_ENDIAN)
            return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb))
        }
        fun startOverlayDisplayModeRequest(builder: FlatBufferBuilder) = builder.startTable(0)
        fun endOverlayDisplayModeRequest(builder: FlatBufferBuilder) : Int {
            val o = builder.endTable()
            return o
        }
    }
}
