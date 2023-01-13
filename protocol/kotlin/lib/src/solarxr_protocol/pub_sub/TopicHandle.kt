// automatically generated by the FlatBuffers compiler, do not modify

package solarxr_protocol.pub_sub

import java.nio.*
import kotlin.math.sign
import com.google.flatbuffers.*

/**
 * A handle for the topic, allows referencing a topic without sending a huge
 * `TopicId`.
 */
@Suppress("unused")
class TopicHandle : Table() {

    fun __init(_i: Int, _bb: ByteBuffer)  {
        __reset(_i, _bb)
    }
    fun __assign(_i: Int, _bb: ByteBuffer) : TopicHandle {
        __init(_i, _bb)
        return this
    }
    val id : UShort
        get() {
            val o = __offset(4)
            return if(o != 0) bb.getShort(o + bb_pos).toUShort() else 0u
        }
    companion object {
        fun validateVersion() = Constants.FLATBUFFERS_22_10_26()
        fun getRootAsTopicHandle(_bb: ByteBuffer): TopicHandle = getRootAsTopicHandle(_bb, TopicHandle())
        fun getRootAsTopicHandle(_bb: ByteBuffer, obj: TopicHandle): TopicHandle {
            _bb.order(ByteOrder.LITTLE_ENDIAN)
            return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb))
        }
        fun createTopicHandle(builder: FlatBufferBuilder, id: UShort) : Int {
            builder.startTable(1)
            addId(builder, id)
            return endTopicHandle(builder)
        }
        fun startTopicHandle(builder: FlatBufferBuilder) = builder.startTable(1)
        fun addId(builder: FlatBufferBuilder, id: UShort) = builder.addShort(0, id.toShort(), 0)
        fun endTopicHandle(builder: FlatBufferBuilder) : Int {
            val o = builder.endTable()
            return o
        }
    }
}
