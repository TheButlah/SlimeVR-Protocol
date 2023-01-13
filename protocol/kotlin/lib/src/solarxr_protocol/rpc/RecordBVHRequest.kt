// automatically generated by the FlatBuffers compiler, do not modify

package solarxr_protocol.rpc

import java.nio.*
import kotlin.math.sign
import com.google.flatbuffers.*

@Suppress("unused")
class RecordBVHRequest : Table() {

    fun __init(_i: Int, _bb: ByteBuffer)  {
        __reset(_i, _bb)
    }
    fun __assign(_i: Int, _bb: ByteBuffer) : RecordBVHRequest {
        __init(_i, _bb)
        return this
    }
    val stop : Boolean
        get() {
            val o = __offset(4)
            return if(o != 0) 0.toByte() != bb.get(o + bb_pos) else false
        }
    companion object {
        fun validateVersion() = Constants.FLATBUFFERS_22_10_26()
        fun getRootAsRecordBVHRequest(_bb: ByteBuffer): RecordBVHRequest = getRootAsRecordBVHRequest(_bb, RecordBVHRequest())
        fun getRootAsRecordBVHRequest(_bb: ByteBuffer, obj: RecordBVHRequest): RecordBVHRequest {
            _bb.order(ByteOrder.LITTLE_ENDIAN)
            return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb))
        }
        fun createRecordBVHRequest(builder: FlatBufferBuilder, stop: Boolean) : Int {
            builder.startTable(1)
            addStop(builder, stop)
            return endRecordBVHRequest(builder)
        }
        fun startRecordBVHRequest(builder: FlatBufferBuilder) = builder.startTable(1)
        fun addStop(builder: FlatBufferBuilder, stop: Boolean) = builder.addBoolean(0, stop, false)
        fun endRecordBVHRequest(builder: FlatBufferBuilder) : Int {
            val o = builder.endTable()
            return o
        }
    }
}
