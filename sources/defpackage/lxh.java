package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public abstract class lxh extends lwt {
    public Object b;

    public static int B(int i, lxa lxaVar) {
        return ((352 - (Integer.numberOfLeadingZeros(i << 3) * 9)) >>> 6) + C(lxaVar);
    }

    public static int C(lxa lxaVar) {
        int iB = lxaVar.b();
        return ((352 - (Integer.numberOfLeadingZeros(iB) * 9)) >>> 6) + iB;
    }

    public static int D(int i, String str) {
        return ((352 - (Integer.numberOfLeadingZeros(i << 3) * 9)) >>> 6) + E(str);
    }

    public static int E(String str) {
        int iB = lzt.b(str);
        return ((352 - (Integer.numberOfLeadingZeros(iB) * 9)) >>> 6) + iB;
    }

    public static lxh F(byte[] bArr) {
        return new lxe(bArr, bArr.length);
    }

    public final void G() {
        if (b() > 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
        if (b() < 0) {
            throw new IllegalStateException("Wrote more data than expected.");
        }
    }

    public final void H(int i, double d) {
        i(i, Double.doubleToRawLongBits(d));
    }

    public final void I(double d) {
        j(Double.doubleToRawLongBits(d));
    }

    public final void J(int i, float f) {
        g(i, Float.floatToRawIntBits(f));
    }

    public final void K(float f) {
        h(Float.floatToRawIntBits(f));
    }

    public abstract int b();

    public abstract void c(byte b);

    public abstract void e(int i, boolean z);

    public abstract void f(int i, lxa lxaVar);

    public abstract void g(int i, int i2);

    public abstract void h(int i);

    public abstract void i(int i, long j);

    public abstract void j(long j);

    public abstract void k(int i, int i2);

    public abstract void l(int i);

    public abstract void m(int i, lyp lypVar);

    public abstract void n(int i, lxa lxaVar);

    public abstract void o(int i, String str);

    public abstract void q(int i, int i2);

    public abstract void r(int i, int i2);

    public abstract void s(int i);

    public abstract void t(int i, long j);

    public abstract void u(long j);
}
