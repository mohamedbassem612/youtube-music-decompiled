package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class axrm {
    public static final axrm a = new axrm(0, new int[0], new Object[0], false);
    public int b;
    public int[] c;
    public Object[] d;
    public int e;
    private boolean f;

    public axrm(int i, int[] iArr, Object[] objArr, boolean z) {
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
                iBr = axpk.a(i5, (axpo) this.d[i3]);
            } else if (i6 == 3) {
                iBr = (((352 - (Integer.numberOfLeadingZeros(i5 << 3) * 9)) >>> 6) << 1) + ((axrm) this.d[i3]).a();
            } else {
                if (i6 != 5) {
                    throw new IllegalStateException(new axql());
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

    public final void d() {
        if (this.f) {
            this.f = false;
        }
    }

    final void e(int i, Object obj) {
        b();
        c(this.b + 1);
        int[] iArr = this.c;
        int i2 = this.b;
        iArr[i2] = i;
        this.d[i2] = obj;
        this.b = i2 + 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof axrm)) {
            axrm axrmVar = (axrm) obj;
            int i = this.b;
            if (i == axrmVar.b && a.ac(this.c, axrmVar.c, i) && a.ab(this.d, axrmVar.d, this.b)) {
                return true;
            }
        }
        return false;
    }

    public final void f(axkl axklVar) throws axpu {
        if (this.b != 0) {
            for (int i = 0; i < this.b; i++) {
                int i2 = this.c[i];
                Object obj = this.d[i];
                int i3 = i2 >>> 3;
                int i4 = i2 & 7;
                if (i4 == 0) {
                    axklVar.q(i3, ((Long) obj).longValue());
                } else if (i4 == 1) {
                    axklVar.m(i3, ((Long) obj).longValue());
                } else if (i4 == 2) {
                    axklVar.i(i3, (axpo) obj);
                } else if (i4 == 3) {
                    int i5 = i3 << 3;
                    axpk axpkVar = (axpk) axklVar.a;
                    axpkVar.y(i5 | 3);
                    ((axrm) obj).f(axklVar);
                    axpkVar.y(i5 | 4);
                } else {
                    if (i4 != 5) {
                        throw new RuntimeException(new axql());
                    }
                    axklVar.l(i3, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final int hashCode() {
        int i = this.b;
        return ((((i + 527) * 31) + a.Z(this.c, i)) * 31) + a.aa(this.d, this.b);
    }

    public axrm() {
        this(0, new int[8], new Object[8], true);
    }
}
