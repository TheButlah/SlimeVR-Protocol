// automatically generated by the FlatBuffers compiler, do not modify

package solarxr_protocol.rpc

import java.nio.*
import kotlin.math.sign
import com.google.flatbuffers.*

@Suppress("unused")
class SerialDevicesRequest : Table() {

    fun __init(_i: Int, _bb: ByteBuffer)  {
        __reset(_i, _bb)
    }
    fun __assign(_i: Int, _bb: ByteBuffer) : SerialDevicesRequest {
        __init(_i, _bb)
        return this
    }
    companion object {
        fun validateVersion() = Constants.FLATBUFFERS_22_10_26()
        fun getRootAsSerialDevicesRequest(_bb: ByteBuffer): SerialDevicesRequest = getRootAsSerialDevicesRequest(_bb, SerialDevicesRequest())
        fun getRootAsSerialDevicesRequest(_bb: ByteBuffer, obj: SerialDevicesRequest): SerialDevicesRequest {
            _bb.order(ByteOrder.LITTLE_ENDIAN)
            return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb))
        }
        fun startSerialDevicesRequest(builder: FlatBufferBuilder) = builder.startTable(0)
        fun endSerialDevicesRequest(builder: FlatBufferBuilder) : Int {
            val o = builder.endTable()
            return o
        }
    }
}
