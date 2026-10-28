package defpackage;

import androidx.car.app.model.Alert;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class lxb extends lxd {
    public final byte[] a;
    public final int b;
    public int c;
    public int d;
    public int e;

    public lxb(byte[] bArr, int i) {
        this.e = Alert.DURATION_SHOW_INDEFINITELY;
        this.a = bArr;
        this.b = 0;
        this.c = 0;
        this.d = 0;
    }

    @Override // defpackage.lxd
    public final boolean a() {
        return this.d == this.c;
    }

    @Override // defpackage.lxd
    public final byte[] b() throws lyh {
        int iC = c();
        if (iC <= 0) {
            if (iC == 0) {
                return lyf.a;
            }
            throw new lyh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i = this.c;
        int i2 = this.d;
        if (iC > i - i2) {
            throw new lyh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i3 = iC + i2;
        this.d = i3;
        return Arrays.copyOfRange(this.a, i2, i3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0066, code lost:
    
        if (r2[r3] >= 0) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final int c() throws defpackage.lyh {
        /*
            r6 = this;
            int r0 = r6.d
            int r1 = r6.c
            if (r1 == r0) goto L6b
            byte[] r2 = r6.a
            int r3 = r0 + 1
            r4 = r2[r0]
            if (r4 < 0) goto L11
            r6.d = r3
            goto L8a
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
            r6.d = r1
            goto L8a
        L6b:
            r0 = 0
            r1 = 0
        L6e:
            r3 = 64
            if (r0 >= r3) goto L96
            int r3 = r6.d
            int r4 = r6.c
            if (r3 == r4) goto L8e
            byte[] r4 = r6.a
            int r5 = r3 + 1
            r6.d = r5
            r3 = r4[r3]
            r4 = r3 & 127(0x7f, float:1.78E-43)
            long r4 = (long) r4
            long r4 = r4 << r0
            long r1 = r1 | r4
            r3 = r3 & 128(0x80, float:1.8E-43)
            if (r3 != 0) goto L8b
            int r4 = (int) r1
        L8a:
            return r4
        L8b:
            int r0 = r0 + 7
            goto L6e
        L8e:
            lyh r6 = new lyh
            java.lang.String r0 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."
            r6.<init>(r0)
            throw r6
        L96:
            lyh r6 = new lyh
            java.lang.String r0 = "CodedInputStream encountered a malformed varint."
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lxb.c():int");
    }

    public lxb(byte[] bArr, int i, byte[] bArr2) {
        this(bArr, 0);
    }
}
