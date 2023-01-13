// automatically generated by the FlatBuffers compiler, do not modify

package solarxr_protocol.datatypes.hardware_info

import java.nio.*
import kotlin.math.sign
import com.google.flatbuffers.*

/**
 * Mostly-dynamic status info about a tracked device's firmware
 */
@Suppress("unused")
class HardwareStatus : Table() {

    fun __init(_i: Int, _bb: ByteBuffer)  {
        __reset(_i, _bb)
    }
    fun __assign(_i: Int, _bb: ByteBuffer) : HardwareStatus {
        __init(_i, _bb)
        return this
    }
    val errorStatus : UByte?
        get() {
            val o = __offset(4)
            return if(o != 0) bb.get(o + bb_pos).toUByte() else null
        }
    val tps : UByte?
        get() {
            val o = __offset(6)
            return if(o != 0) bb.get(o + bb_pos).toUByte() else null
        }
    val ping : UShort?
        get() {
            val o = __offset(8)
            return if(o != 0) bb.getShort(o + bb_pos).toUShort() else null
        }
    /**
     * “Received Signal Strength Indicator" between device and wifi adapter in dBm
     */
    val rssi : Short?
        get() {
            val o = __offset(10)
            return if(o != 0) bb.getShort(o + bb_pos) else null
        }
    /**
     * Temperature in degrees celsius
     */
    val mcuTemp : Float?
        get() {
            val o = __offset(12)
            return if(o != 0) bb.getFloat(o + bb_pos) else null
        }
    val batteryVoltage : Float?
        get() {
            val o = __offset(14)
            return if(o != 0) bb.getFloat(o + bb_pos) else null
        }
    val batteryPctEstimate : UByte?
        get() {
            val o = __offset(16)
            return if(o != 0) bb.get(o + bb_pos).toUByte() else null
        }
    val logData : solarxr_protocol.datatypes.LogData? get() = logData(solarxr_protocol.datatypes.LogData())
    fun logData(obj: solarxr_protocol.datatypes.LogData) : solarxr_protocol.datatypes.LogData? {
        val o = __offset(18)
        return if (o != 0) {
            obj.__assign(__indirect(o + bb_pos), bb)
        } else {
            null
        }
    }
    companion object {
        fun validateVersion() = Constants.FLATBUFFERS_22_10_26()
        fun getRootAsHardwareStatus(_bb: ByteBuffer): HardwareStatus = getRootAsHardwareStatus(_bb, HardwareStatus())
        fun getRootAsHardwareStatus(_bb: ByteBuffer, obj: HardwareStatus): HardwareStatus {
            _bb.order(ByteOrder.LITTLE_ENDIAN)
            return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb))
        }
        fun createHardwareStatus(builder: FlatBufferBuilder, errorStatus: UByte?, tps: UByte?, ping: UShort?, rssi: Short?, mcuTemp: Float?, batteryVoltage: Float?, batteryPctEstimate: UByte?, logDataOffset: Int) : Int {
            builder.startTable(8)
            addLogData(builder, logDataOffset)
            batteryVoltage?.run { addBatteryVoltage(builder, batteryVoltage) }
            mcuTemp?.run { addMcuTemp(builder, mcuTemp) }
            rssi?.run { addRssi(builder, rssi) }
            ping?.run { addPing(builder, ping) }
            batteryPctEstimate?.run { addBatteryPctEstimate(builder, batteryPctEstimate) }
            tps?.run { addTps(builder, tps) }
            errorStatus?.run { addErrorStatus(builder, errorStatus) }
            return endHardwareStatus(builder)
        }
        fun startHardwareStatus(builder: FlatBufferBuilder) = builder.startTable(8)
        fun addErrorStatus(builder: FlatBufferBuilder, errorStatus: UByte) = builder.addByte(0, errorStatus.toByte(), 0)
        fun addTps(builder: FlatBufferBuilder, tps: UByte) = builder.addByte(1, tps.toByte(), 0)
        fun addPing(builder: FlatBufferBuilder, ping: UShort) = builder.addShort(2, ping.toShort(), 0)
        fun addRssi(builder: FlatBufferBuilder, rssi: Short) = builder.addShort(3, rssi, 0)
        fun addMcuTemp(builder: FlatBufferBuilder, mcuTemp: Float) = builder.addFloat(4, mcuTemp, 0.0)
        fun addBatteryVoltage(builder: FlatBufferBuilder, batteryVoltage: Float) = builder.addFloat(5, batteryVoltage, 0.0)
        fun addBatteryPctEstimate(builder: FlatBufferBuilder, batteryPctEstimate: UByte) = builder.addByte(6, batteryPctEstimate.toByte(), 0)
        fun addLogData(builder: FlatBufferBuilder, logData: Int) = builder.addOffset(7, logData, 0)
        fun endHardwareStatus(builder: FlatBufferBuilder) : Int {
            val o = builder.endTable()
            return o
        }
    }
}
