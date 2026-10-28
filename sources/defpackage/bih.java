package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public abstract class bih extends bhr {
    public Object b;

    public static int E(int i, bhy bhyVar) {
        return ((352 - (Integer.numberOfLeadingZeros(i << 3) * 9)) >>> 6) + F(bhyVar);
    }

    public static int F(bhy bhyVar) {
        int iB = bhyVar.b();
        return ((352 - (Integer.numberOfLeadingZeros(iB) * 9)) >>> 6) + iB;
    }

    public static int G(int i, String str) {
        return ((352 - (Integer.numberOfLeadingZeros(i << 3) * 9)) >>> 6) + H(str);
    }

    public static int H(String str) {
        int iB = bkk.b(str);
        return ((352 - (Integer.numberOfLeadingZeros(iB) * 9)) >>> 6) + iB;
    }

    public final void I(int i, double d) {
        j(i, Double.doubleToRawLongBits(d));
    }

    public final void J(double d) {
        k(Double.doubleToRawLongBits(d));
    }

    public final void K(int i, float f) {
        h(i, Float.floatToRawIntBits(f));
    }

    public final void L(float f) {
        i(Float.floatToRawIntBits(f));
    }

    public abstract int b();

    public abstract void c(byte b);

    public abstract void e(int i, boolean z);

    public abstract void f(int i, bhy bhyVar);

    public abstract void g(bhy bhyVar);

    public abstract void h(int i, int i2);

    public abstract void i(int i);

    public abstract void j(int i, long j);

    public abstract void k(long j);

    public abstract void l(int i, int i2);

    public abstract void m(int i);

    public abstract void n(bji bjiVar);

    public abstract void o(int i, bji bjiVar);

    public abstract void p(int i, bhy bhyVar);

    public abstract void q(int i, String str);

    public abstract void r(String str);

    public abstract void s(int i, int i2);

    public abstract void t(int i, int i2);

    public abstract void u(int i);

    public abstract void v(int i, long j);

    public abstract void w(long j);

    public abstract void x(byte[] bArr, int i);
}
