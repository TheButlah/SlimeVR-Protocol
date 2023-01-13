// automatically generated by the FlatBuffers compiler, do not modify

package solarxr_protocol.rpc

import java.nio.*
import kotlin.math.sign
import com.google.flatbuffers.*

/**
 * Sends the GET INFO cmd to the current tracker on the serial monitor
 */
@Suppress("unused")
class SerialTrackerGetInfoRequest : Table() {

    fun __init(_i: Int, _bb: ByteBuffer)  {
        __reset(_i, _bb)
    }
    fun __assign(_i: Int, _bb: ByteBuffer) : SerialTrackerGetInfoRequest {
        __init(_i, _bb)
        return this
    }
    companion object {
        fun validateVersion() = Constants.FLATBUFFERS_22_10_26()
        fun getRootAsSerialTrackerGetInfoRequest(_bb: ByteBuffer): SerialTrackerGetInfoRequest = getRootAsSerialTrackerGetInfoRequest(_bb, SerialTrackerGetInfoRequest())
        fun getRootAsSerialTrackerGetInfoRequest(_bb: ByteBuffer, obj: SerialTrackerGetInfoRequest): SerialTrackerGetInfoRequest {
            _bb.order(ByteOrder.LITTLE_ENDIAN)
            return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb))
        }
        fun startSerialTrackerGetInfoRequest(builder: FlatBufferBuilder) = builder.startTable(0)
        fun endSerialTrackerGetInfoRequest(builder: FlatBufferBuilder) : Int {
            val o = builder.endTable()
            return o
        }
    }
}
