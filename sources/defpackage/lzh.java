package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lzh {
    public static final lzh a = new lzh(0, new int[0], new Object[0], false);
    public int b;
    public int[] c;
    public Object[] d;
    public int e;
    public boolean f;

    public lzh(int i, int[] iArr, Object[] objArr, boolean z) {
        this.e = -1;
        this.b = i;
        this.c = iArr;
        this.d = objArr;
        this.f = z;
    }

    public final int a() {
        int iBr;
        int i = this.e;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.b; i3++) {
            int i4 = this.c[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 == 0) {
                iBr = a.br(i5, ((Long) this.d[i3]).longValue());
            } else if (i6 == 1) {
                ((Long) this.d[i3]).longValue();
                iBr = ((352 - (Integer.numberOfLeadingZeros(i5 << 3) * 9)) >>> 6) + 8;
            } else if (i6 == 2) {
                iBr = lxh.B(i5, (lxa) this.d[i3]);
            } else if (i6 == 3) {
                iBr = (((352 - (Integer.numberOfLeadingZeros(i5 << 3) * 9)) >>> 6) << 1) + ((lzh) this.d[i3]).a();
            } else {
                if (i6 != 5) {
                    throw new IllegalStateException(new lyg());
                }
                ((Integer) this.d[i3]).intValue();
                iBr = ((352 - (Integer.numberOfLeadingZeros(i5 << 3) * 9)) >>> 6) + 4;
            }
            i2 += iBr;
        }
        this.e = i2;
        return i2;
    }

    final void b() {
        if (!this.f) {
            throw new UnsupportedOperationException();
        }
    }

    public final void c(int i) {
        int[] iArr = this.c;
        if (i > iArr.length) {
            int i2 = this.b;
            int i3 = i2 + (i2 / 2);
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.c = Arrays.copyOf(iArr, i);
            this.d = Arrays.copyOf(this.d, i);
        }
    }

    final void d(int i, Object obj) {
        b();
        c(this.b + 1);
        int[] iArr = this.c;
        int i2 = this.b;
        iArr[i2] = i;
        this.d[i2] = obj;
        this.b = i2 + 1;
    }

    public final void e(lqa lqaVar) {
        if (this.b != 0) {
            for (int i = 0; i < this.b; i++) {
                int i2 = this.c[i];
                Object obj = this.d[i];
                int i3 = i2 >>> 3;
                int i4 = i2 & 7;
                if (i4 == 0) {
                    lqaVar.j(i3, ((Long) obj).longValue());
                } else if (i4 == 1) {
                    lqaVar.f(i3, ((Long) obj).longValue());
                } else if (i4 == 2) {
                    lqaVar.b(i3, (lxa) obj);
                } else if (i4 == 3) {
                    lxh lxhVar = (lxh) lqaVar.a;
                    lxhVar.q(i3, 3);
                    ((lzh) obj).e(lqaVar);
                    lxhVar.q(i3, 4);
                } else {
                    if (i4 != 5) {
                        throw new RuntimeException(new lyg());
                    }
                    lqaVar.e(i3, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof lzh)) {
            lzh lzhVar = (lzh) obj;
            int i = this.b;
            if (i == lzhVar.b && a.ac(this.c, lzhVar.c, i) && a.ab(this.d, lzhVar.d, this.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.b;
        return ((((i + 527) * 31) + a.Z(this.c, i)) * 31) + a.aa(this.d, this.b);
    }

    public lzh() {
        this(0, new int[8], new Object[8], true);
    }
}
