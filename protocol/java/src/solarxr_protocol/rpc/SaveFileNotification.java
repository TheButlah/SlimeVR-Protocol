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
   * MIME type of file if one exists, use `file_extension` otherwise
   */
  public String mimeType() { int o = __offset(4); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer mimeTypeAsByteBuffer() { return __vector_as_bytebuffer(4, 1); }
  public ByteBuffer mimeTypeInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 4, 1); }
  /**
   * Use MIME type preferably if one exists
   */
  public String fileExtension() { int o = __offset(6); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer fileExtensionAsByteBuffer() { return __vector_as_bytebuffer(6, 1); }
  public ByteBuffer fileExtensionInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 6, 1); }
  /**
   * Directory recommended to save the file on
   */
  public boolean hasExpectedDir() { return 0 != __offset(8); }
  public int expectedDir() { int o = __offset(8); return o != 0 ? bb.get(o + bb_pos) & 0xFF : 0; }
  /**
   * Recommended filename
   */
  public String expectedFilename() { int o = __offset(10); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer expectedFilenameAsByteBuffer() { return __vector_as_bytebuffer(10, 1); }
  public ByteBuffer expectedFilenameInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 10, 1); }

  public static int createSaveFileNotification(FlatBufferBuilder builder,
      int mimeTypeOffset,
      int fileExtensionOffset,
      int expectedDir,
      int expectedFilenameOffset) {
    builder.startTable(4);
    SaveFileNotification.addExpectedFilename(builder, expectedFilenameOffset);
    SaveFileNotification.addFileExtension(builder, fileExtensionOffset);
    SaveFileNotification.addMimeType(builder, mimeTypeOffset);
    SaveFileNotification.addExpectedDir(builder, expectedDir);
    return SaveFileNotification.endSaveFileNotification(builder);
  }

  public static void startSaveFileNotification(FlatBufferBuilder builder) { builder.startTable(4); }
  public static void addMimeType(FlatBufferBuilder builder, int mimeTypeOffset) { builder.addOffset(0, mimeTypeOffset, 0); }
  public static void addFileExtension(FlatBufferBuilder builder, int fileExtensionOffset) { builder.addOffset(1, fileExtensionOffset, 0); }
  public static void addExpectedDir(FlatBufferBuilder builder, int expectedDir) { builder.addByte(2, (byte) expectedDir, (byte) 0); }
  public static void addExpectedFilename(FlatBufferBuilder builder, int expectedFilenameOffset) { builder.addOffset(3, expectedFilenameOffset, 0); }
  public static int endSaveFileNotification(FlatBufferBuilder builder) {
    int o = builder.endTable();
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
    String _oMimeType = mimeType();
    _o.setMimeType(_oMimeType);
    String _oFileExtension = fileExtension();
    _o.setFileExtension(_oFileExtension);
    Integer _oExpectedDir = hasExpectedDir() ? expectedDir() : null;
    _o.setExpectedDir(_oExpectedDir);
    String _oExpectedFilename = expectedFilename();
    _o.setExpectedFilename(_oExpectedFilename);
  }
  public static int pack(FlatBufferBuilder builder, SaveFileNotificationT _o) {
    if (_o == null) return 0;
    int _mimeType = _o.getMimeType() == null ? 0 : builder.createString(_o.getMimeType());
    int _fileExtension = _o.getFileExtension() == null ? 0 : builder.createString(_o.getFileExtension());
    int _expectedFilename = _o.getExpectedFilename() == null ? 0 : builder.createString(_o.getExpectedFilename());
    return createSaveFileNotification(
      builder,
      _mimeType,
      _fileExtension,
      _o.getExpectedDir(),
      _expectedFilename);
  }
}

