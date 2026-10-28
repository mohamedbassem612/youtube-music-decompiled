package defpackage;

import androidx.car.app.model.Alert;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
abstract class axpp extends axps {
    private final byte[] f;
    private int j;
    private int k = Alert.DURATION_SHOW_INDEFINITELY;
    private final int g = 0;
    private int h = 0;
    private int i = 0;

    public axpp(byte[] bArr, int i) {
        this.f = bArr;
    }

    private final void D(int i) {
        this.k = i;
        if (i > 0) {
            i = 0;
        }
        this.h = i;
    }

    @Override // defpackage.axps
    public final boolean A() {
        return this.i == this.h;
    }

    @Override // defpackage.axps
    public final boolean B() {
        throw null;
    }

    @Override // defpackage.axps
    public final boolean C(int i) throws axqm {
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            if (this.h - this.i < 10) {
                while (i3 < 10) {
                    if (a() < 0) {
                        i3++;
                    }
                }
                throw new axqm("CodedInputStream encountered a malformed varint.");
            }
            while (i3 < 10) {
                byte[] bArr = this.f;
                int i4 = this.i;
                this.i = i4 + 1;
                if (bArr[i4] < 0) {
                    i3++;
                }
            }
            throw new axqm("CodedInputStream encountered a malformed varint.");
        }
        if (i2 == 1) {
            z(8);
        } else if (i2 == 2) {
            z(i());
        } else if (i2 == 3) {
            H();
            x(((i >>> 3) << 3) | 4);
        } else {
            if (i2 == 4) {
                G();
                return false;
            }
            if (i2 != 5) {
                throw new axql();
            }
            z(4);
        }
        return true;
    }

    public final byte a() throws axqm {
        int i = this.i;
        if (i == this.h) {
            throw new axqm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.f;
        this.i = i + 1;
        return bArr[i];
    }

    @Override // defpackage.axps
    public final double b() {
        throw null;
    }

    @Override // defpackage.axps
    public final float c() {
        throw null;
    }

    @Override // defpackage.axps
    public final int d() {
        throw null;
    }

    @Override // defpackage.axps
    public final int e(int i) throws axqm {
        if (i < 0) {
            throw new axqm("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i2 = this.i;
        int i3 = i2 + i;
        if (i3 < 0) {
            i3 = Alert.DURATION_SHOW_INDEFINITELY;
            if (i > Alert.DURATION_SHOW_INDEFINITELY - i2) {
                throw new axqm("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
            }
        }
        int i4 = this.k;
        if (i3 > i4) {
            throw new axqm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        D(i3);
        return i4;
    }

    @Override // defpackage.axps
    public final int f() {
        throw null;
    }

    @Override // defpackage.axps
    public final int g() {
        throw null;
    }

    @Override // defpackage.axps
    public final int h() {
        throw null;
    }

    protected abstract int i();

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0066, code lost:
    
        if (r2[r3] >= 0) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final int j() {
        /*
            r6 = this;
            int r0 = r6.i
            int r1 = r6.h
            if (r1 == r0) goto L6b
            byte[] r2 = r6.f
            int r3 = r0 + 1
            r4 = r2[r0]
            if (r4 < 0) goto L11
            r6.i = r3
            goto L70
        L11:
            int r1 = r1 - r3
            r5 = 9
            if (r1 < r5) goto L6b
            int r1 = r0 + 2
            r3 = r2[r3]
            int r3 = r3 << 7
            r4 = r4 ^ r3
            if (r4 >= 0) goto L22
            r4 = r4 ^ (-128(0xffffffffffffff80, float:NaN))
            goto L68
        L22:
            int r3 = r0 + 3
            r1 = r2[r1]
            int r1 = r1 << 14
            r4 = r4 ^ r1
            if (r4 < 0) goto L2f
            r4 = r4 ^ 16256(0x3f80, float:2.278E-41)
        L2d:
            r1 = r3
            goto L68
        L2f:
            int r1 = r0 + 4
            r3 = r2[r3]
            int r3 = r3 << 21
            r4 = r4 ^ r3
            if (r4 >= 0) goto L3d
            r0 = -2080896(0xffffffffffe03f80, float:NaN)
            r4 = r4 ^ r0
            goto L68
        L3d:
            int r3 = r0 + 5
            r1 = r2[r1]
            int r5 = r1 << 28
            r4 = r4 ^ r5
            r5 = 266354560(0xfe03f80, float:2.2112565E-29)
            r4 = r4 ^ r5
            if (r1 >= 0) goto L2d
            int r1 = r0 + 6
            r3 = r2[r3]
            if (r3 >= 0) goto L68
            int r3 = r0 + 7
            r1 = r2[r1]
            if (r1 >= 0) goto L2d
            int r1 = r0 + 8
            r3 = r2[r3]
            if (r3 >= 0) goto L68
            int r3 = r0 + 9
            r1 = r2[r1]
            if (r1 >= 0) goto L2d
            int r1 = r0 + 10
            r0 = r2[r3]
            if (r0 < 0) goto L6b
        L68:
            r6.i = r1
            goto L70
        L6b:
            long r0 = r6.q()
            int r4 = (int) r0
        L70:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axpp.j():int");
    }

    @Override // defpackage.axps
    public final int k() {
        throw null;
    }

    @Override // defpackage.axps
    public final int l() {
        throw null;
    }

    @Override // defpackage.axps
    public final int m() throws axqm {
        if (A()) {
            this.j = 0;
            return 0;
        }
        int i = i();
        this.j = i;
        if ((i >>> 3) != 0) {
            return i;
        }
        throw new axqm("Protocol message contained an invalid tag (zero).");
    }

    @Override // defpackage.axps
    public final int n() {
        throw null;
    }

    @Override // defpackage.axps
    public final long o() {
        throw null;
    }

    @Override // defpackage.axps
    public final long p() {
        throw null;
    }

    final long q() throws axqm {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte bA = a();
            j |= ((long) (bA & 127)) << i;
            if ((bA & 128) == 0) {
                return j;
            }
        }
        throw new axqm("CodedInputStream encountered a malformed varint.");
    }

    @Override // defpackage.axps
    public final long r() {
        throw null;
    }

    @Override // defpackage.axps
    public final long s() {
        throw null;
    }

    @Override // defpackage.axps
    public final long t() {
        throw null;
    }

    @Override // defpackage.axps
    public final String u() {
        throw null;
    }

    @Override // defpackage.axps
    public final String v() {
        throw null;
    }

    @Override // defpackage.axps
    public final axpo w() {
        throw null;
    }

    @Override // defpackage.axps
    public final void x(int i) throws axqm {
        if (this.j != i) {
            throw new axqm("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // defpackage.axps
    public final void y(int i) {
        throw null;
    }

    public final void z(int i) throws axqm {
        if (i < 0) {
            throw new axqm("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i2 = this.h;
        int i3 = this.i;
        if (i > i2 - i3) {
            throw new axqm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.i = i3 + i;
    }
}
