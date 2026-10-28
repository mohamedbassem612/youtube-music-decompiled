package j$.sun.nio.cs;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class b extends CharsetEncoder {
    public final e a;

    public b(c cVar) {
        super(cVar, 1.0f, 1.0f);
        e eVar = new e();
        eVar.a = CoderResult.UNDERFLOW;
        this.a = eVar;
    }

    public static int a(char[] cArr, int i, byte[] bArr, int i2, int i3) {
        int i4 = 0;
        if (i3 > 0) {
            cArr.getClass();
            bArr.getClass();
            if (i >= 0 && i < cArr.length) {
                if (i2 >= 0 && i2 < bArr.length) {
                    int i5 = (i + i3) - 1;
                    if (i5 >= 0 && i5 < cArr.length) {
                        int i6 = (i2 + i3) - 1;
                        if (i6 >= 0 && i6 < bArr.length) {
                            while (i4 < i3) {
                                int i7 = i + 1;
                                char c = cArr[i];
                                if (c > 255) {
                                    break;
                                }
                                bArr[i2] = (byte) c;
                                i4++;
                                i = i7;
                                i2++;
                            }
                        } else {
                            throw new ArrayIndexOutOfBoundsException(i6);
                        }
                    } else {
                        throw new ArrayIndexOutOfBoundsException(i5);
                    }
                } else {
                    throw new ArrayIndexOutOfBoundsException(i2);
                }
            } else {
                throw new ArrayIndexOutOfBoundsException(i);
            }
        }
        return i4;
    }

    @Override // java.nio.charset.CharsetEncoder
    public final boolean canEncode(char c) {
        return c <= 255;
    }

    @Override // java.nio.charset.CharsetEncoder
    public final CoderResult encodeLoop(CharBuffer charBuffer, ByteBuffer byteBuffer) {
        CoderResult coderResultUnmappableForLength;
        boolean zHasArray = charBuffer.hasArray();
        e eVar = this.a;
        if (zHasArray && byteBuffer.hasArray()) {
            char[] cArrArray = charBuffer.array();
            int iArrayOffset = charBuffer.arrayOffset();
            int iPosition = charBuffer.position() + iArrayOffset;
            int iLimit = charBuffer.limit() + iArrayOffset;
            if (iPosition > iLimit) {
                iPosition = iLimit;
            }
            byte[] bArrArray = byteBuffer.array();
            int iArrayOffset2 = byteBuffer.arrayOffset();
            int iPosition2 = byteBuffer.position() + iArrayOffset2;
            int iLimit2 = byteBuffer.limit() + iArrayOffset2;
            if (iPosition2 > iLimit2) {
                iPosition2 = iLimit2;
            }
            int i = iLimit2 - iPosition2;
            int i2 = iLimit - iPosition;
            if (i >= i2) {
                i = i2;
            }
            try {
                int iA = a(cArrArray, iPosition, bArrArray, iPosition2, i);
                int i3 = iPosition + iA;
                int i4 = iPosition2 + iA;
                if (iA != i) {
                    coderResultUnmappableForLength = eVar.b(cArrArray[i3], cArrArray, i3, iLimit) < 0 ? eVar.a : CoderResult.unmappableForLength(1 << (eVar.b ? 1 : 0));
                } else {
                    coderResultUnmappableForLength = i < i2 ? CoderResult.OVERFLOW : CoderResult.UNDERFLOW;
                }
                int i5 = i4 - iArrayOffset2;
            } finally {
            }
        } else {
            int iPosition3 = charBuffer.position();
            while (charBuffer.hasRemaining()) {
                try {
                    char c = charBuffer.get();
                    if (c > 255) {
                        coderResultUnmappableForLength = eVar.a(c, charBuffer) < 0 ? eVar.a : CoderResult.unmappableForLength(1 << (eVar.b ? 1 : 0));
                    } else if (byteBuffer.hasRemaining()) {
                        byteBuffer.put((byte) c);
                        iPosition3++;
                    } else {
                        coderResultUnmappableForLength = CoderResult.OVERFLOW;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            coderResultUnmappableForLength = CoderResult.UNDERFLOW;
        }
        return coderResultUnmappableForLength;
    }

    @Override // java.nio.charset.CharsetEncoder
    public final boolean isLegalReplacement(byte[] bArr) {
        return true;
    }
}
