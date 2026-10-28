package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class chn extends buk {
    private static void q(int i, ByteBuffer byteBuffer) {
        float f = (float) (((double) i) * 4.656612875245797E-10d);
        byteBuffer.putInt(Float.isNaN(f) ? 0 : Float.floatToIntBits(f));
    }

    @Override // defpackage.buj
    public final void f(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferL;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        int i2 = this.b.d;
        if (i2 == 2) {
            byteBufferL = l(i << 1);
            while (iPosition < iLimit) {
                q(byteBuffer.getShort(iPosition) << 16, byteBufferL);
                iPosition += 2;
            }
        } else if (i2 == 3) {
            byteBufferL = l(i << 2);
            while (iPosition < iLimit) {
                q(((byteBuffer.get(iPosition) & 255) - 128) << 24, byteBufferL);
                iPosition++;
            }
        } else if (i2 == 21) {
            byteBufferL = l((i / 3) << 2);
            while (iPosition < iLimit) {
                q((byteBuffer.get(iPosition + 2) << 24) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition) & 255) << 8), byteBufferL);
                iPosition += 3;
            }
        } else if (i2 == 22) {
            byteBufferL = l(i);
            while (iPosition < iLimit) {
                q(byteBuffer.getInt(iPosition), byteBufferL);
                iPosition += 4;
            }
        } else if (i2 == 268435456) {
            byteBufferL = l(i << 1);
            while (iPosition < iLimit) {
                q(Short.reverseBytes(byteBuffer.getShort(iPosition)) << 16, byteBufferL);
                iPosition += 2;
            }
        } else if (i2 == 1342177280) {
            byteBufferL = l((i / 3) << 2);
            while (iPosition < iLimit) {
                q((byteBuffer.get(iPosition) << 24) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition + 2) & 255) << 8), byteBufferL);
                iPosition += 3;
            }
        } else if (i2 == 1610612736) {
            byteBufferL = l(i);
            while (iPosition < iLimit) {
                q(Integer.reverseBytes(byteBuffer.getInt(iPosition)), byteBufferL);
                iPosition += 4;
            }
        } else if (i2 == 1879048192) {
            byteBufferL = l(i / 2);
            while (iPosition < iLimit) {
                byteBufferL.putFloat((float) byteBuffer.getDouble(iPosition));
                iPosition += 8;
            }
        } else if (i2 == 1895825408) {
            byteBufferL = l(i);
            while (iPosition < iLimit) {
                byteBufferL.putFloat(Float.intBitsToFloat(Integer.reverseBytes(byteBuffer.getInt(iPosition))));
                iPosition += 4;
            }
        } else {
            if (i2 != 1912602624) {
                throw new IllegalStateException();
            }
            byteBufferL = l(i / 2);
            while (iPosition < iLimit) {
                byteBufferL.putFloat((float) Double.longBitsToDouble(Long.reverseBytes(byteBuffer.getLong(iPosition))));
                iPosition += 8;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferL.flip();
    }

    @Override // defpackage.buk
    public final bug k(bug bugVar) throws bui {
        int i = bugVar.d;
        if (bwp.ab(i)) {
            return i != 4 ? new bug(bugVar.b, bugVar.c, 4) : bug.a;
        }
        throw new bui("Unhandled input format:", bugVar);
    }
}
