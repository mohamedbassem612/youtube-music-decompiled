package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class buq extends buk {
    /* JADX WARN: Code duplicated, block: B:18:0x0046  */
    @Override // defpackage.buj
    public final void f(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        int i2 = this.b.d;
        if (i2 == 3) {
            i <<= 1;
        } else if (i2 == 4) {
            i /= 2;
        } else {
            if (i2 != 21) {
                if (i2 == 22) {
                    i /= 2;
                } else if (i2 != 268435456) {
                    if (i2 != 1342177280) {
                        if (i2 == 1610612736) {
                            i /= 2;
                        } else {
                            if (i2 != 1879048192) {
                                if (i2 == 1895825408) {
                                    i /= 2;
                                } else if (i2 != 1912602624) {
                                    throw new IllegalStateException();
                                }
                            }
                            i /= 4;
                        }
                    }
                }
            }
            i /= 3;
            i <<= 1;
        }
        ByteBuffer byteBufferL = l(i);
        int i3 = this.b.d;
        if (i3 == 3) {
            while (iPosition < iLimit) {
                byteBufferL.put((byte) 0);
                byteBufferL.put((byte) ((byteBuffer.get(iPosition) & 255) - 128));
                iPosition++;
            }
        } else if (i3 == 4) {
            while (iPosition < iLimit) {
                short sA = (short) (bwp.a(byteBuffer.getFloat(iPosition), -1.0f, 1.0f) * 32767.0f);
                byteBufferL.put((byte) (sA & 255));
                byteBufferL.put((byte) ((sA >> 8) & 255));
                iPosition += 4;
            }
        } else if (i3 == 21) {
            while (iPosition < iLimit) {
                byteBufferL.put(byteBuffer.get(iPosition + 1));
                byteBufferL.put(byteBuffer.get(iPosition + 2));
                iPosition += 3;
            }
        } else if (i3 == 22) {
            while (iPosition < iLimit) {
                byteBufferL.put(byteBuffer.get(iPosition + 2));
                byteBufferL.put(byteBuffer.get(iPosition + 3));
                iPosition += 4;
            }
        } else if (i3 == 268435456) {
            while (iPosition < iLimit) {
                byteBufferL.put(byteBuffer.get(iPosition + 1));
                byteBufferL.put(byteBuffer.get(iPosition));
                iPosition += 2;
            }
        } else if (i3 == 1342177280) {
            while (iPosition < iLimit) {
                byteBufferL.put(byteBuffer.get(iPosition + 1));
                byteBufferL.put(byteBuffer.get(iPosition));
                iPosition += 3;
            }
        } else if (i3 == 1610612736) {
            while (iPosition < iLimit) {
                byteBufferL.put(byteBuffer.get(iPosition + 1));
                byteBufferL.put(byteBuffer.get(iPosition));
                iPosition += 4;
            }
        } else if (i3 == 1879048192) {
            while (iPosition < iLimit) {
                short sAo = (short) (bwp.ao(byteBuffer.getDouble(iPosition)) * 32767.0d);
                byteBufferL.put((byte) (sAo & 255));
                byteBufferL.put((byte) ((sAo >> 8) & 255));
                iPosition += 8;
            }
        } else if (i3 == 1895825408) {
            while (iPosition < iLimit) {
                short sA2 = (short) (bwp.a(Float.intBitsToFloat(Integer.reverseBytes(byteBuffer.getInt(iPosition))), -1.0f, 1.0f) * 32767.0f);
                byteBufferL.put((byte) (sA2 & 255));
                byteBufferL.put((byte) ((sA2 >> 8) & 255));
                iPosition += 4;
            }
        } else {
            if (i3 != 1912602624) {
                throw new IllegalStateException();
            }
            while (iPosition < iLimit) {
                short sAo2 = (short) (bwp.ao(Double.longBitsToDouble(Long.reverseBytes(byteBuffer.getLong(iPosition)))) * 32767.0d);
                byteBufferL.put((byte) (sAo2 & 255));
                byteBufferL.put((byte) ((sAo2 >> 8) & 255));
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
            return i != 2 ? new bug(bugVar.b, bugVar.c, 2) : bug.a;
        }
        throw new bui("Unhandled input format:", bugVar);
    }
}
