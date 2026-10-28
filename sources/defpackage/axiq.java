package defpackage;

import org.chromium.base.AndroidInfo;
import org.chromium.base.Callback;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class axiq extends axii {
    public final transient byte[][] e;
    public final transient int[] f;

    public axiq(byte[][] bArr, int[] iArr) {
        super(axii.a.b);
        this.e = bArr;
        this.f = iArr;
    }

    private final axii i() {
        return new axii(h());
    }

    private final Object writeReplace() {
        return i();
    }

    @Override // defpackage.axii
    public final byte a(int i) {
        byte[][] bArr = this.e;
        int length = bArr.length;
        int[] iArr = this.f;
        AndroidInfo.c(iArr[length - 1], i, 1L);
        int iE = Callback.Helper.e(this, i);
        return bArr[iE][(i - (iE == 0 ? 0 : iArr[iE - 1])) + iArr[length + iE]];
    }

    @Override // defpackage.axii
    public final int b() {
        return this.f[this.e.length - 1];
    }

    @Override // defpackage.axii
    public final String c() {
        return i().c();
    }

    @Override // defpackage.axii
    public final boolean e(int i, byte[] bArr, int i2, int i3) {
        int i4;
        bArr.getClass();
        if (i < 0 || i > b() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int i5 = i3 + i;
        int iE = Callback.Helper.e(this, i);
        while (i < i5) {
            if (iE == 0) {
                iE = 0;
                i4 = 0;
            } else {
                i4 = this.f[iE - 1];
            }
            int[] iArr = this.f;
            int i6 = iArr[iE] - i4;
            byte[][] bArr2 = this.e;
            int i7 = iArr[bArr2.length + iE];
            int iMin = Math.min(i5, i6 + i4) - i;
            if (!AndroidInfo.d(bArr2[iE], i7 + (i - i4), bArr, i2, iMin)) {
                return false;
            }
            i2 += iMin;
            i += iMin;
            iE++;
        }
        return true;
    }

    @Override // defpackage.axii
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof axii) {
            axii axiiVar = (axii) obj;
            if (axiiVar.b() == b() && g(axiiVar, b())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.axii
    public final byte[] f() {
        return h();
    }

    @Override // defpackage.axii
    public final boolean g(axii axiiVar, int i) {
        int i2;
        axiiVar.getClass();
        if (b() - i < 0) {
            return false;
        }
        int iE = Callback.Helper.e(this, 0);
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            if (iE == 0) {
                iE = 0;
                i2 = 0;
            } else {
                i2 = this.f[iE - 1];
            }
            int[] iArr = this.f;
            int i5 = iArr[iE] - i2;
            byte[][] bArr = this.e;
            int i6 = iArr[bArr.length + iE];
            int iMin = Math.min(i, i5 + i2) - i3;
            if (!axiiVar.e(i4, bArr[iE], i6 + (i3 - i2), iMin)) {
                return false;
            }
            i4 += iMin;
            i3 += iMin;
            iE++;
        }
        return true;
    }

    public final byte[] h() {
        byte[] bArr = new byte[b()];
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            byte[][] bArr2 = this.e;
            int length = bArr2.length;
            if (i >= length) {
                return bArr;
            }
            int[] iArr = this.f;
            int i4 = iArr[length + i];
            int i5 = iArr[i];
            int i6 = i5 - i2;
            atqq.aV(bArr2[i], bArr, i3, i4, i4 + i6);
            i3 += i6;
            i++;
            i2 = i5;
        }
    }

    @Override // defpackage.axii
    public final int hashCode() {
        int i = this.c;
        if (i != 0) {
            return i;
        }
        byte[][] bArr = this.e;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (true) {
            int length = bArr.length;
            if (i2 >= length) {
                this.c = i3;
                return i3;
            }
            int[] iArr = this.f;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            byte[] bArr2 = bArr[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr2[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
    }

    @Override // defpackage.axii
    public final String toString() {
        return i().toString();
    }
}
