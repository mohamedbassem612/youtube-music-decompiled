package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cgs extends buk {
    public ahbo e;
    private ahbo f;

    /* JADX WARN: Code duplicated, block: B:32:0x0075  */
    /* JADX WARN: Code duplicated, block: B:33:0x007e  */
    /* JADX WARN: Code duplicated, block: B:35:0x0086  */
    /* JADX WARN: Code duplicated, block: B:36:0x0088  */
    /* JADX WARN: Code duplicated, block: B:39:0x009c  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:51:0x00de  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:56:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:59:0x0109  */
    /* JADX WARN: Code duplicated, block: B:61:0x0119  */
    @Override // defpackage.buj
    public final void f(ByteBuffer byteBuffer) {
        int i;
        int i2;
        int i3;
        boolean z;
        int i4;
        byte b;
        ahbo ahboVar = this.f;
        ahboVar.getClass();
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferL = l(((iLimit - iPosition) / this.b.e) * this.c.e);
        while (iPosition < iLimit) {
            for (int i5 = 0; i5 < ahboVar.b; i5++) {
                int iJ = (bwp.j(this.b.d) * ahboVar.a(i5)) + iPosition;
                int i6 = this.b.d;
                if (i6 == 2) {
                    byteBufferL.putShort(byteBuffer.getShort(iJ));
                } else if (i6 == 3) {
                    byteBufferL.put(byteBuffer.get(iJ));
                } else if (i6 == 4) {
                    byteBufferL.putFloat(byteBuffer.getFloat(iJ));
                } else if (i6 == 21) {
                    if (byteBuffer.order() == ByteOrder.BIG_ENDIAN) {
                        i = iJ;
                    } else {
                        i = iJ + 2;
                    }
                    byte b2 = byteBuffer.get(i);
                    byte b3 = byteBuffer.get(iJ + 1);
                    if (byteBuffer.order() == ByteOrder.BIG_ENDIAN) {
                        iJ += 2;
                    }
                    i2 = ((b2 << 24) & (-16777216)) | ((b3 << 16) & 16711680) | ((byteBuffer.get(iJ) << 8) & 65280);
                    i3 = i2 >> 8;
                    if (((-16777216) & i3) != 0 || (i3 & (-8388608)) == -8388608) {
                        z = true;
                    } else {
                        z = false;
                    }
                    ahno.K(z, "Value out of range of 24-bit integer: %s", Integer.toHexString(i3));
                    ahno.F(byteBufferL.remaining() >= 3);
                    if (byteBufferL.order() == ByteOrder.BIG_ENDIAN) {
                        i4 = (i2 >> 24) & 255;
                    } else {
                        i4 = i3 & 255;
                    }
                    byte b4 = (byte) i4;
                    int i7 = (i2 >> 16) & 255;
                    if (byteBufferL.order() == ByteOrder.BIG_ENDIAN) {
                        b = (byte) (i3 & 255);
                    } else {
                        b = (byte) ((i2 >> 24) & 255);
                    }
                    byteBufferL.put(b4).put((byte) i7).put(b);
                } else if (i6 == 22) {
                    byteBufferL.putInt(byteBuffer.getInt(iJ));
                } else if (i6 == 268435456) {
                    byteBufferL.putShort(byteBuffer.getShort(iJ));
                } else if (i6 == 1342177280) {
                    if (byteBuffer.order() == ByteOrder.BIG_ENDIAN) {
                        i = iJ;
                    } else {
                        i = iJ + 2;
                    }
                    byte b5 = byteBuffer.get(i);
                    byte b6 = byteBuffer.get(iJ + 1);
                    if (byteBuffer.order() == ByteOrder.BIG_ENDIAN) {
                        iJ += 2;
                    }
                    i2 = ((b5 << 24) & (-16777216)) | ((b6 << 16) & 16711680) | ((byteBuffer.get(iJ) << 8) & 65280);
                    i3 = i2 >> 8;
                    if (((-16777216) & i3) != 0) {
                        z = true;
                    } else {
                        z = true;
                    }
                    ahno.K(z, "Value out of range of 24-bit integer: %s", Integer.toHexString(i3));
                    ahno.F(byteBufferL.remaining() >= 3);
                    if (byteBufferL.order() == ByteOrder.BIG_ENDIAN) {
                        i4 = (i2 >> 24) & 255;
                    } else {
                        i4 = i3 & 255;
                    }
                    byte b7 = (byte) i4;
                    int i8 = (i2 >> 16) & 255;
                    if (byteBufferL.order() == ByteOrder.BIG_ENDIAN) {
                        b = (byte) (i3 & 255);
                    } else {
                        b = (byte) ((i2 >> 24) & 255);
                    }
                    byteBufferL.put(b7).put((byte) i8).put(b);
                } else if (i6 != 1610612736) {
                    if (i6 != 1879048192) {
                        if (i6 == 1895825408) {
                            byteBufferL.putFloat(byteBuffer.getFloat(iJ));
                        } else if (i6 != 1912602624) {
                            throw new IllegalStateException(a.bR(i6, "Unexpected encoding: "));
                        }
                    }
                    byteBufferL.putDouble(byteBuffer.getDouble(iJ));
                } else {
                    byteBufferL.putInt(byteBuffer.getInt(iJ));
                }
            }
            iPosition += this.b.e;
        }
        byteBuffer.position(iLimit);
        byteBufferL.flip();
    }

    @Override // defpackage.buk
    public final bug k(bug bugVar) throws bui {
        ahbo ahboVar = this.e;
        if (ahboVar == null) {
            return bug.a;
        }
        int i = bugVar.d;
        if (!bwp.ab(i)) {
            throw new bui("Unhandled input format:", bugVar);
        }
        int i2 = ahboVar.b;
        int i3 = bugVar.c;
        boolean z = i3 != i2;
        int i4 = 0;
        while (i4 < i2) {
            int iA = ahboVar.a(i4);
            if (iA >= i3) {
                throw new bui(a.cs(ahboVar, "Channel map (", ") trying to access non-existent input channel."), bugVar);
            }
            z |= iA != i4;
            i4++;
        }
        return z ? new bug(bugVar.b, i2, i) : bug.a;
    }

    @Override // defpackage.buk
    protected final void o() {
        this.f = null;
        this.e = null;
    }

    @Override // defpackage.buk
    protected final void p() {
        this.f = this.e;
    }
}
