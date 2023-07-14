// automatically generated by the FlatBuffers compiler, do not modify

package solarxr_protocol.rpc;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

/**
 * Used for the server to save a file and have it prompt in the user side
 */
@SuppressWarnings("unused")
public final class SaveFileNotification extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_22_10_26(); }
  public static SaveFileNotification getRootAsSaveFileNotification(ByteBuffer _bb) { return getRootAsSaveFileNotification(_bb, new SaveFileNotification()); }
  public static SaveFileNotification getRootAsSaveFileNotification(ByteBuffer _bb, SaveFileNotification obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public SaveFileNotification __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  /**
   * Binary data of the file
   */
  public int data(int j) { int o = __offset(4); return o != 0 ? bb.get(__vector(o) + j * 1) & 0xFF : 0; }
  public int dataLength() { int o = __offset(4); return o != 0 ? __vector_len(o) : 0; }
  public ByteVector dataVector() { return dataVector(new ByteVector()); }
  public ByteVector dataVector(ByteVector obj) { int o = __offset(4); return o != 0 ? obj.__assign(__vector(o), bb) : null; }
  public ByteBuffer dataAsByteBuffer() { return __vector_as_bytebuffer(4, 1); }
  public ByteBuffer dataInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 4, 1); }
  /**
   * MIME type of file if one exists, use `file_extension` otherwise
   */
  public String mimeType() { int o = __offset(6); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer mimeTypeAsByteBuffer() { return __vector_as_bytebuffer(6, 1); }
  public ByteBuffer mimeTypeInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 6, 1); }
  /**
   * Use MIME type preferably if one exists
   */
  public String fileExtension() { int o = __offset(8); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer fileExtensionAsByteBuffer() { return __vector_as_bytebuffer(8, 1); }
  public ByteBuffer fileExtensionInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 8, 1); }
  /**
   * Directory recommended to save the file on
   */
  public int expectedDir() { int o = __offset(10); return o != 0 ? bb.get(o + bb_pos) & 0xFF : 0; }
  /**
   * Recommended filename
   */
  public String expectedFilename() { int o = __offset(12); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer expectedFilenameAsByteBuffer() { return __vector_as_bytebuffer(12, 1); }
  public ByteBuffer expectedFilenameInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 12, 1); }

  public static int createSaveFileNotification(FlatBufferBuilder builder,
      int dataOffset,
      int mimeTypeOffset,
      int fileExtensionOffset,
      int expectedDir,
      int expectedFilenameOffset) {
    builder.startTable(5);
    SaveFileNotification.addExpectedFilename(builder, expectedFilenameOffset);
    SaveFileNotification.addFileExtension(builder, fileExtensionOffset);
    SaveFileNotification.addMimeType(builder, mimeTypeOffset);
    SaveFileNotification.addData(builder, dataOffset);
    SaveFileNotification.addExpectedDir(builder, expectedDir);
    return SaveFileNotification.endSaveFileNotification(builder);
  }

  public static void startSaveFileNotification(FlatBufferBuilder builder) { builder.startTable(5); }
  public static void addData(FlatBufferBuilder builder, int dataOffset) { builder.addOffset(0, dataOffset, 0); }
  public static int createDataVector(FlatBufferBuilder builder, byte[] data) { return builder.createByteVector(data); }
  public static int createDataVector(FlatBufferBuilder builder, ByteBuffer data) { return builder.createByteVector(data); }
  public static void startDataVector(FlatBufferBuilder builder, int numElems) { builder.startVector(1, numElems, 1); }
  public static void addMimeType(FlatBufferBuilder builder, int mimeTypeOffset) { builder.addOffset(1, mimeTypeOffset, 0); }
  public static void addFileExtension(FlatBufferBuilder builder, int fileExtensionOffset) { builder.addOffset(2, fileExtensionOffset, 0); }
  public static void addExpectedDir(FlatBufferBuilder builder, int expectedDir) { builder.addByte(3, (byte) expectedDir, (byte) 0); }
  public static void addExpectedFilename(FlatBufferBuilder builder, int expectedFilenameOffset) { builder.addOffset(4, expectedFilenameOffset, 0); }
  public static int endSaveFileNotification(FlatBufferBuilder builder) {
    int o = builder.endTable();
    builder.required(o, 4);  // data
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public SaveFileNotification get(int j) { return get(new SaveFileNotification(), j); }
    public SaveFileNotification get(SaveFileNotification obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
  public SaveFileNotificationT unpack() {
    SaveFileNotificationT _o = new SaveFileNotificationT();
    unpackTo(_o);
    return _o;
  }
  public void unpackTo(SaveFileNotificationT _o) {
    int[] _oData = new int[dataLength()];
    for (int _j = 0; _j < dataLength(); ++_j) {_oData[_j] = data(_j);}
    _o.setData(_oData);
    String _oMimeType = mimeType();
    _o.setMimeType(_oMimeType);
    String _oFileExtension = fileExtension();
    _o.setFileExtension(_oFileExtension);
    int _oExpectedDir = expectedDir();
    _o.setExpectedDir(_oExpectedDir);
    String _oExpectedFilename = expectedFilename();
    _o.setExpectedFilename(_oExpectedFilename);
  }
  public static int pack(FlatBufferBuilder builder, SaveFileNotificationT _o) {
    if (_o == null) return 0;
    int _data = 0;
    if (_o.getData() != null) {
      byte[] __data = new byte[_o.getData().length];
      int _j = 0;
      for (int _e : _o.getData()) { __data[_j] = (byte) _e; _j++;}
      _data = createDataVector(builder, __data);
    }
    int _mimeType = _o.getMimeType() == null ? 0 : builder.createString(_o.getMimeType());
    int _fileExtension = _o.getFileExtension() == null ? 0 : builder.createString(_o.getFileExtension());
    int _expectedFilename = _o.getExpectedFilename() == null ? 0 : builder.createString(_o.getExpectedFilename());
    return createSaveFileNotification(
      builder,
      _data,
      _mimeType,
      _fileExtension,
      _o.getExpectedDir(),
      _expectedFilename);
  }
}

