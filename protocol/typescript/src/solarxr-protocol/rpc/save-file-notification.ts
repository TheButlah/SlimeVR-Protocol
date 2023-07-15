// automatically generated by the FlatBuffers compiler, do not modify

import * as flatbuffers from 'flatbuffers';

import { ComputerDirectory } from '../../solarxr-protocol/rpc/computer-directory.js';


/**
 * Used for the server to save a file and have it prompt in the user side
 */
export class SaveFileNotification implements flatbuffers.IUnpackableObject<SaveFileNotificationT> {
  bb: flatbuffers.ByteBuffer|null = null;
  bb_pos = 0;
  __init(i:number, bb:flatbuffers.ByteBuffer):SaveFileNotification {
  this.bb_pos = i;
  this.bb = bb;
  return this;
}

static getRootAsSaveFileNotification(bb:flatbuffers.ByteBuffer, obj?:SaveFileNotification):SaveFileNotification {
  return (obj || new SaveFileNotification()).__init(bb.readInt32(bb.position()) + bb.position(), bb);
}

static getSizePrefixedRootAsSaveFileNotification(bb:flatbuffers.ByteBuffer, obj?:SaveFileNotification):SaveFileNotification {
  bb.setPosition(bb.position() + flatbuffers.SIZE_PREFIX_LENGTH);
  return (obj || new SaveFileNotification()).__init(bb.readInt32(bb.position()) + bb.position(), bb);
}

/**
 * Binary data of the file
 */
data(index: number):number|null {
  const offset = this.bb!.__offset(this.bb_pos, 4);
  return offset ? this.bb!.readUint8(this.bb!.__vector(this.bb_pos + offset) + index) : 0;
}

dataLength():number {
  const offset = this.bb!.__offset(this.bb_pos, 4);
  return offset ? this.bb!.__vector_len(this.bb_pos + offset) : 0;
}

dataArray():Uint8Array|null {
  const offset = this.bb!.__offset(this.bb_pos, 4);
  return offset ? new Uint8Array(this.bb!.bytes().buffer, this.bb!.bytes().byteOffset + this.bb!.__vector(this.bb_pos + offset), this.bb!.__vector_len(this.bb_pos + offset)) : null;
}

/**
 * MIME type of file if one exists, use `file_extension` otherwise
 */
mimeType():string|null
mimeType(optionalEncoding:flatbuffers.Encoding):string|Uint8Array|null
mimeType(optionalEncoding?:any):string|Uint8Array|null {
  const offset = this.bb!.__offset(this.bb_pos, 6);
  return offset ? this.bb!.__string(this.bb_pos + offset, optionalEncoding) : null;
}

/**
 * Use MIME type preferably if one exists
 */
fileExtension():string|null
fileExtension(optionalEncoding:flatbuffers.Encoding):string|Uint8Array|null
fileExtension(optionalEncoding?:any):string|Uint8Array|null {
  const offset = this.bb!.__offset(this.bb_pos, 8);
  return offset ? this.bb!.__string(this.bb_pos + offset, optionalEncoding) : null;
}

/**
 * Directory recommended to save the file on
 */
expectedDir():ComputerDirectory|null {
  const offset = this.bb!.__offset(this.bb_pos, 10);
  return offset ? this.bb!.readUint8(this.bb_pos + offset) : null;
}

/**
 * Recommended filename
 */
expectedFilename():string|null
expectedFilename(optionalEncoding:flatbuffers.Encoding):string|Uint8Array|null
expectedFilename(optionalEncoding?:any):string|Uint8Array|null {
  const offset = this.bb!.__offset(this.bb_pos, 12);
  return offset ? this.bb!.__string(this.bb_pos + offset, optionalEncoding) : null;
}

static startSaveFileNotification(builder:flatbuffers.Builder) {
  builder.startObject(5);
}

static addData(builder:flatbuffers.Builder, dataOffset:flatbuffers.Offset) {
  builder.addFieldOffset(0, dataOffset, 0);
}

static createDataVector(builder:flatbuffers.Builder, data:number[]|Uint8Array):flatbuffers.Offset {
  builder.startVector(1, data.length, 1);
  for (let i = data.length - 1; i >= 0; i--) {
    builder.addInt8(data[i]!);
  }
  return builder.endVector();
}

static startDataVector(builder:flatbuffers.Builder, numElems:number) {
  builder.startVector(1, numElems, 1);
}

static addMimeType(builder:flatbuffers.Builder, mimeTypeOffset:flatbuffers.Offset) {
  builder.addFieldOffset(1, mimeTypeOffset, 0);
}

static addFileExtension(builder:flatbuffers.Builder, fileExtensionOffset:flatbuffers.Offset) {
  builder.addFieldOffset(2, fileExtensionOffset, 0);
}

static addExpectedDir(builder:flatbuffers.Builder, expectedDir:ComputerDirectory) {
  builder.addFieldInt8(3, expectedDir, 0);
}

static addExpectedFilename(builder:flatbuffers.Builder, expectedFilenameOffset:flatbuffers.Offset) {
  builder.addFieldOffset(4, expectedFilenameOffset, 0);
}

static endSaveFileNotification(builder:flatbuffers.Builder):flatbuffers.Offset {
  const offset = builder.endObject();
  builder.requiredField(offset, 4) // data
  return offset;
}

static createSaveFileNotification(builder:flatbuffers.Builder, dataOffset:flatbuffers.Offset, mimeTypeOffset:flatbuffers.Offset, fileExtensionOffset:flatbuffers.Offset, expectedDir:ComputerDirectory|null, expectedFilenameOffset:flatbuffers.Offset):flatbuffers.Offset {
  SaveFileNotification.startSaveFileNotification(builder);
  SaveFileNotification.addData(builder, dataOffset);
  SaveFileNotification.addMimeType(builder, mimeTypeOffset);
  SaveFileNotification.addFileExtension(builder, fileExtensionOffset);
  if (expectedDir !== null)
    SaveFileNotification.addExpectedDir(builder, expectedDir);
  SaveFileNotification.addExpectedFilename(builder, expectedFilenameOffset);
  return SaveFileNotification.endSaveFileNotification(builder);
}

unpack(): SaveFileNotificationT {
  return new SaveFileNotificationT(
    this.bb!.createScalarList<number>(this.data.bind(this), this.dataLength()),
    this.mimeType(),
    this.fileExtension(),
    this.expectedDir(),
    this.expectedFilename()
  );
}


unpackTo(_o: SaveFileNotificationT): void {
  _o.data = this.bb!.createScalarList<number>(this.data.bind(this), this.dataLength());
  _o.mimeType = this.mimeType();
  _o.fileExtension = this.fileExtension();
  _o.expectedDir = this.expectedDir();
  _o.expectedFilename = this.expectedFilename();
}
}

export class SaveFileNotificationT implements flatbuffers.IGeneratedObject {
constructor(
  public data: (number)[] = [],
  public mimeType: string|Uint8Array|null = null,
  public fileExtension: string|Uint8Array|null = null,
  public expectedDir: ComputerDirectory|null = null,
  public expectedFilename: string|Uint8Array|null = null
){}


pack(builder:flatbuffers.Builder): flatbuffers.Offset {
  const data = SaveFileNotification.createDataVector(builder, this.data);
  const mimeType = (this.mimeType !== null ? builder.createString(this.mimeType!) : 0);
  const fileExtension = (this.fileExtension !== null ? builder.createString(this.fileExtension!) : 0);
  const expectedFilename = (this.expectedFilename !== null ? builder.createString(this.expectedFilename!) : 0);

  return SaveFileNotification.createSaveFileNotification(builder,
    data,
    mimeType,
    fileExtension,
    this.expectedDir,
    expectedFilename
  );
}
}
