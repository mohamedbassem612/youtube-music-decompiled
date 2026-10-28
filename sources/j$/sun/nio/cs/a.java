package j$.sun.nio.cs;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class a extends CharsetDecoder {
    public a(c cVar) {
        super(cVar, 1.0f, 1.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.nio.Buffer, java.nio.ByteBuffer] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.nio.CharBuffer] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.nio.ByteBuffer] */
    @Override // java.nio.charset.CharsetDecoder
    public final CoderResult decodeLoop(ByteBuffer byteBuffer, CharBuffer charBuffer) throws Throwable {
        CoderResult coderResult;
        CoderResult coderResult2;
        if (!byteBuffer.hasArray() || !charBuffer.hasArray()) {
            int iPosition = byteBuffer.position();
            while (byteBuffer.hasRemaining()) {
                try {
                    byte b = byteBuffer.get();
                    if (!charBuffer.hasRemaining()) {
                        coderResult = CoderResult.OVERFLOW;
                        return coderResult;
                    }
                    charBuffer.put((char) (b & 255));
                    iPosition++;
                } catch (Throwable th) {
                    throw th;
                }
            }
            coderResult = CoderResult.UNDERFLOW;
            return coderResult;
        }
        byte[] bArrArray = byteBuffer.array();
        int iPosition2 = byteBuffer.position() + byteBuffer.arrayOffset();
        int iLimit = byteBuffer.limit() + byteBuffer.arrayOffset();
        if (iPosition2 > iLimit) {
            iPosition2 = iLimit;
        }
        char[] cArrArray = charBuffer.array();
        int iPosition3 = charBuffer.position() + charBuffer.arrayOffset();
        int iLimit2 = charBuffer.limit() + charBuffer.arrayOffset();
        if (iPosition3 > iLimit2) {
            iPosition3 = iLimit2;
        }
        while (iPosition2 < iLimit) {
            try {
                byte b2 = bArrArray[iPosition2];
                if (iPosition3 >= iLimit2) {
                    coderResult2 = CoderResult.OVERFLOW;
                    iPosition2 -= byteBuffer.arrayOffset();
                    iPosition3 -= charBuffer.arrayOffset();
                    byteBuffer = (CharBuffer) charBuffer.position(iPosition3);
                    return coderResult2;
                }
                int i = iPosition3 + 1;
                try {
                    cArrArray[iPosition3] = (char) (b2 & 255);
                    iPosition2++;
                    iPosition3 = i;
                } catch (Throwable th2) {
                    th = th2;
                    iPosition3 = i;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
        coderResult2 = CoderResult.UNDERFLOW;
        iPosition2 -= byteBuffer.arrayOffset();
        iPosition3 -= charBuffer.arrayOffset();
        byteBuffer = (CharBuffer) charBuffer.position(iPosition3);
        return coderResult2;
    }
}
