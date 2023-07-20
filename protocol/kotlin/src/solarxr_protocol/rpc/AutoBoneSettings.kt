// automatically generated by the FlatBuffers compiler, do not modify

package solarxr_protocol.rpc

import java.nio.*
import kotlin.math.sign
import com.google.flatbuffers.*

/**
 * https://github.com/SlimeVR/SlimeVR-Server/blob/v0.8.3/server/src/main/java/dev/slimevr/config/AutoBoneConfig.kt
 */
@Suppress("unused")
class AutoBoneSettings : Table() {

    fun __init(_i: Int, _bb: ByteBuffer)  {
        __reset(_i, _bb)
    }
    fun __assign(_i: Int, _bb: ByteBuffer) : AutoBoneSettings {
        __init(_i, _bb)
        return this
    }
    val cursorIncrement : Int?
        get() {
            val o = __offset(4)
            return if(o != 0) bb.getInt(o + bb_pos) else null
        }
    val minDataDistance : Int?
        get() {
            val o = __offset(6)
            return if(o != 0) bb.getInt(o + bb_pos) else null
        }
    val maxDataDistance : Int?
        get() {
            val o = __offset(8)
            return if(o != 0) bb.getInt(o + bb_pos) else null
        }
    val numEpochs : Int?
        get() {
            val o = __offset(10)
            return if(o != 0) bb.getInt(o + bb_pos) else null
        }
    val printEveryNumEpochs : Int?
        get() {
            val o = __offset(12)
            return if(o != 0) bb.getInt(o + bb_pos) else null
        }
    val initialAdjustRate : Float?
        get() {
            val o = __offset(14)
            return if(o != 0) bb.getFloat(o + bb_pos) else null
        }
    val adjustRateDecay : Float?
        get() {
            val o = __offset(16)
            return if(o != 0) bb.getFloat(o + bb_pos) else null
        }
    val slideErrorFactor : Float?
        get() {
            val o = __offset(18)
            return if(o != 0) bb.getFloat(o + bb_pos) else null
        }
    val offsetSlideErrorFactor : Float?
        get() {
            val o = __offset(20)
            return if(o != 0) bb.getFloat(o + bb_pos) else null
        }
    val footHeightOffsetErrorFactor : Float?
        get() {
            val o = __offset(22)
            return if(o != 0) bb.getFloat(o + bb_pos) else null
        }
    val bodyProportionErrorFactor : Float?
        get() {
            val o = __offset(24)
            return if(o != 0) bb.getFloat(o + bb_pos) else null
        }
    val heightErrorFactor : Float?
        get() {
            val o = __offset(26)
            return if(o != 0) bb.getFloat(o + bb_pos) else null
        }
    val positionErrorFactor : Float?
        get() {
            val o = __offset(28)
            return if(o != 0) bb.getFloat(o + bb_pos) else null
        }
    val positionOffsetErrorFactor : Float?
        get() {
            val o = __offset(30)
            return if(o != 0) bb.getFloat(o + bb_pos) else null
        }
    val calcInitError : Boolean?
        get() {
            val o = __offset(32)
            return if(o != 0) 0.toByte() != bb.get(o + bb_pos) else null
        }
    val targetHmdHeight : Float?
        get() {
            val o = __offset(34)
            return if(o != 0) bb.getFloat(o + bb_pos) else null
        }
    val targetFullHeight : Float?
        get() {
            val o = __offset(36)
            return if(o != 0) bb.getFloat(o + bb_pos) else null
        }
    val randomizeFrameOrder : Boolean?
        get() {
            val o = __offset(38)
            return if(o != 0) 0.toByte() != bb.get(o + bb_pos) else null
        }
    val scaleEachStep : Boolean?
        get() {
            val o = __offset(40)
            return if(o != 0) 0.toByte() != bb.get(o + bb_pos) else null
        }
    val sampleCount : Int?
        get() {
            val o = __offset(42)
            return if(o != 0) bb.getInt(o + bb_pos) else null
        }
    val sampleRateMs : Long?
        get() {
            val o = __offset(44)
            return if(o != 0) bb.getLong(o + bb_pos) else null
        }
    val saveRecordings : Boolean?
        get() {
            val o = __offset(46)
            return if(o != 0) 0.toByte() != bb.get(o + bb_pos) else null
        }
    val useSkeletonHeight : Boolean?
        get() {
            val o = __offset(48)
            return if(o != 0) 0.toByte() != bb.get(o + bb_pos) else null
        }
    val randSeed : Long?
        get() {
            val o = __offset(50)
            return if(o != 0) bb.getLong(o + bb_pos) else null
        }
    companion object {
        @JvmStatic
        fun validateVersion() = Constants.FLATBUFFERS_22_10_26()
        @JvmStatic
        fun getRootAsAutoBoneSettings(_bb: ByteBuffer): AutoBoneSettings = getRootAsAutoBoneSettings(_bb, AutoBoneSettings())
        @JvmStatic
        fun getRootAsAutoBoneSettings(_bb: ByteBuffer, obj: AutoBoneSettings): AutoBoneSettings {
            _bb.order(ByteOrder.LITTLE_ENDIAN)
            return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb))
        }
        @JvmStatic
        fun createAutoBoneSettings(builder: FlatBufferBuilder, cursorIncrement: Int?, minDataDistance: Int?, maxDataDistance: Int?, numEpochs: Int?, printEveryNumEpochs: Int?, initialAdjustRate: Float?, adjustRateDecay: Float?, slideErrorFactor: Float?, offsetSlideErrorFactor: Float?, footHeightOffsetErrorFactor: Float?, bodyProportionErrorFactor: Float?, heightErrorFactor: Float?, positionErrorFactor: Float?, positionOffsetErrorFactor: Float?, calcInitError: Boolean?, targetHmdHeight: Float?, targetFullHeight: Float?, randomizeFrameOrder: Boolean?, scaleEachStep: Boolean?, sampleCount: Int?, sampleRateMs: Long?, saveRecordings: Boolean?, useSkeletonHeight: Boolean?, randSeed: Long?) : Int {
            builder.startTable(24)
            randSeed?.run { addRandSeed(builder, randSeed) }
            sampleRateMs?.run { addSampleRateMs(builder, sampleRateMs) }
            sampleCount?.run { addSampleCount(builder, sampleCount) }
            targetFullHeight?.run { addTargetFullHeight(builder, targetFullHeight) }
            targetHmdHeight?.run { addTargetHmdHeight(builder, targetHmdHeight) }
            positionOffsetErrorFactor?.run { addPositionOffsetErrorFactor(builder, positionOffsetErrorFactor) }
            positionErrorFactor?.run { addPositionErrorFactor(builder, positionErrorFactor) }
            heightErrorFactor?.run { addHeightErrorFactor(builder, heightErrorFactor) }
            bodyProportionErrorFactor?.run { addBodyProportionErrorFactor(builder, bodyProportionErrorFactor) }
            footHeightOffsetErrorFactor?.run { addFootHeightOffsetErrorFactor(builder, footHeightOffsetErrorFactor) }
            offsetSlideErrorFactor?.run { addOffsetSlideErrorFactor(builder, offsetSlideErrorFactor) }
            slideErrorFactor?.run { addSlideErrorFactor(builder, slideErrorFactor) }
            adjustRateDecay?.run { addAdjustRateDecay(builder, adjustRateDecay) }
            initialAdjustRate?.run { addInitialAdjustRate(builder, initialAdjustRate) }
            printEveryNumEpochs?.run { addPrintEveryNumEpochs(builder, printEveryNumEpochs) }
            numEpochs?.run { addNumEpochs(builder, numEpochs) }
            maxDataDistance?.run { addMaxDataDistance(builder, maxDataDistance) }
            minDataDistance?.run { addMinDataDistance(builder, minDataDistance) }
            cursorIncrement?.run { addCursorIncrement(builder, cursorIncrement) }
            useSkeletonHeight?.run { addUseSkeletonHeight(builder, useSkeletonHeight) }
            saveRecordings?.run { addSaveRecordings(builder, saveRecordings) }
            scaleEachStep?.run { addScaleEachStep(builder, scaleEachStep) }
            randomizeFrameOrder?.run { addRandomizeFrameOrder(builder, randomizeFrameOrder) }
            calcInitError?.run { addCalcInitError(builder, calcInitError) }
            return endAutoBoneSettings(builder)
        }
        @JvmStatic
        fun startAutoBoneSettings(builder: FlatBufferBuilder) = builder.startTable(24)
        @JvmStatic
        fun addCursorIncrement(builder: FlatBufferBuilder, cursorIncrement: Int) = builder.addInt(0, cursorIncrement, 0)
        @JvmStatic
        fun addMinDataDistance(builder: FlatBufferBuilder, minDataDistance: Int) = builder.addInt(1, minDataDistance, 0)
        @JvmStatic
        fun addMaxDataDistance(builder: FlatBufferBuilder, maxDataDistance: Int) = builder.addInt(2, maxDataDistance, 0)
        @JvmStatic
        fun addNumEpochs(builder: FlatBufferBuilder, numEpochs: Int) = builder.addInt(3, numEpochs, 0)
        @JvmStatic
        fun addPrintEveryNumEpochs(builder: FlatBufferBuilder, printEveryNumEpochs: Int) = builder.addInt(4, printEveryNumEpochs, 0)
        @JvmStatic
        fun addInitialAdjustRate(builder: FlatBufferBuilder, initialAdjustRate: Float) = builder.addFloat(5, initialAdjustRate, 0.0)
        @JvmStatic
        fun addAdjustRateDecay(builder: FlatBufferBuilder, adjustRateDecay: Float) = builder.addFloat(6, adjustRateDecay, 0.0)
        @JvmStatic
        fun addSlideErrorFactor(builder: FlatBufferBuilder, slideErrorFactor: Float) = builder.addFloat(7, slideErrorFactor, 0.0)
        @JvmStatic
        fun addOffsetSlideErrorFactor(builder: FlatBufferBuilder, offsetSlideErrorFactor: Float) = builder.addFloat(8, offsetSlideErrorFactor, 0.0)
        @JvmStatic
        fun addFootHeightOffsetErrorFactor(builder: FlatBufferBuilder, footHeightOffsetErrorFactor: Float) = builder.addFloat(9, footHeightOffsetErrorFactor, 0.0)
        @JvmStatic
        fun addBodyProportionErrorFactor(builder: FlatBufferBuilder, bodyProportionErrorFactor: Float) = builder.addFloat(10, bodyProportionErrorFactor, 0.0)
        @JvmStatic
        fun addHeightErrorFactor(builder: FlatBufferBuilder, heightErrorFactor: Float) = builder.addFloat(11, heightErrorFactor, 0.0)
        @JvmStatic
        fun addPositionErrorFactor(builder: FlatBufferBuilder, positionErrorFactor: Float) = builder.addFloat(12, positionErrorFactor, 0.0)
        @JvmStatic
        fun addPositionOffsetErrorFactor(builder: FlatBufferBuilder, positionOffsetErrorFactor: Float) = builder.addFloat(13, positionOffsetErrorFactor, 0.0)
        @JvmStatic
        fun addCalcInitError(builder: FlatBufferBuilder, calcInitError: Boolean) = builder.addBoolean(14, calcInitError, false)
        @JvmStatic
        fun addTargetHmdHeight(builder: FlatBufferBuilder, targetHmdHeight: Float) = builder.addFloat(15, targetHmdHeight, 0.0)
        @JvmStatic
        fun addTargetFullHeight(builder: FlatBufferBuilder, targetFullHeight: Float) = builder.addFloat(16, targetFullHeight, 0.0)
        @JvmStatic
        fun addRandomizeFrameOrder(builder: FlatBufferBuilder, randomizeFrameOrder: Boolean) = builder.addBoolean(17, randomizeFrameOrder, false)
        @JvmStatic
        fun addScaleEachStep(builder: FlatBufferBuilder, scaleEachStep: Boolean) = builder.addBoolean(18, scaleEachStep, false)
        @JvmStatic
        fun addSampleCount(builder: FlatBufferBuilder, sampleCount: Int) = builder.addInt(19, sampleCount, 0)
        @JvmStatic
        fun addSampleRateMs(builder: FlatBufferBuilder, sampleRateMs: Long) = builder.addLong(20, sampleRateMs, 0)
        @JvmStatic
        fun addSaveRecordings(builder: FlatBufferBuilder, saveRecordings: Boolean) = builder.addBoolean(21, saveRecordings, false)
        @JvmStatic
        fun addUseSkeletonHeight(builder: FlatBufferBuilder, useSkeletonHeight: Boolean) = builder.addBoolean(22, useSkeletonHeight, false)
        @JvmStatic
        fun addRandSeed(builder: FlatBufferBuilder, randSeed: Long) = builder.addLong(23, randSeed, 0)
        @JvmStatic
        fun endAutoBoneSettings(builder: FlatBufferBuilder) : Int {
            val o = builder.endTable()
            return o
        }
    }
}
