package defpackage;

import java.io.EOFException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class jts {
    private static final long[] b = {128, 64, 32, 16, 8, 4, 2, 1};
    public int a;
    private final byte[] c = new byte[8];
    private int d;

    public static int a(int i) {
        int i2 = 0;
        while (i2 < 8) {
            int i3 = i2 + 1;
            if ((b[i2] & ((long) i)) != 0) {
                return i3;
            }
            i2 = i3;
        }
        return -1;
    }

    public static long b(byte[] bArr, int i, boolean z) {
        long j = ((long) bArr[0]) & 255;
        if (z) {
            j &= ~b[i - 1];
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (((long) bArr[i2]) & 255);
        }
        return j;
    }

    public final long c(jtm jtmVar, boolean z, boolean z2, int i) throws EOFException {
        if (this.d == 0) {
            try {
                if (!jtmVar.j(this.c, 0, 1)) {
                    return -6L;
                }
                int iA = a(this.c[0] & 255);
                this.a = iA;
                if (iA == -1) {
                    throw new IllegalStateException("No valid varint length mask found");
                }
                this.d = 1;
            } catch (EOFException e) {
                if (z) {
                    return -1L;
                }
                throw e;
            }
        }
        int i2 = this.a;
        if (i2 > i) {
            this.d = 0;
            return -2L;
        }
        if (i2 != 1 && !jtmVar.j(this.c, 1, i2 - 1)) {
            return -6L;
        }
        this.d = 0;
        return b(this.c, this.a, z2);
    }

    public final void d() {
        this.d = 0;
        this.a = 0;
    }
}
