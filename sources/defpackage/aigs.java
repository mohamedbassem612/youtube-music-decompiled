package defpackage;

import com.google.protobuf.MessageLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class aigs extends aigb {
    public Object a;

    public static int G(byte[] bArr) {
        int length = bArr.length;
        return ((352 - (Integer.numberOfLeadingZeros(length) * 9)) >>> 6) + length;
    }

    public static int H(int i, aigj aigjVar) {
        int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(i << 3) * 9;
        int iD = aigjVar.d();
        return ((352 - iNumberOfLeadingZeros) >>> 6) + ((352 - (Integer.numberOfLeadingZeros(iD) * 9)) >>> 6) + iD;
    }

    public static int I(int i, int i2) {
        return ((352 - (Integer.numberOfLeadingZeros(i << 3) * 9)) >>> 6) + ((640 - (Long.numberOfLeadingZeros(i2) * 9)) >>> 6);
    }

    public static int J(int i, int i2) {
        return ((352 - (Integer.numberOfLeadingZeros(i << 3) * 9)) >>> 6) + ((640 - (Long.numberOfLeadingZeros(i2) * 9)) >>> 6);
    }

    public static int K(int i, long j) {
        return ((352 - (Integer.numberOfLeadingZeros(i << 3) * 9)) >>> 6) + ((640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6);
    }

    public static int L(int i, String str) {
        int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(i << 3) * 9;
        int iAN = ahng.aN(str);
        return ((352 - iNumberOfLeadingZeros) >>> 6) + ((352 - (Integer.numberOfLeadingZeros(iAN) * 9)) >>> 6) + iAN;
    }

    public static int M(int i, int i2) {
        return ((352 - (Integer.numberOfLeadingZeros(i << 3) * 9)) >>> 6) + ((352 - (Integer.numberOfLeadingZeros(i2) * 9)) >>> 6);
    }

    public static int N(int i, long j) {
        return ((352 - (Integer.numberOfLeadingZeros(i << 3) * 9)) >>> 6) + ((640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6);
    }

    public static aigs O(byte[] bArr) {
        return new aigo(bArr, 0, bArr.length, null);
    }

    public abstract void A(long j);

    public abstract void B(byte[] bArr, int i);

    public final void P() {
        if (c() > 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
        if (c() < 0) {
            throw new IllegalStateException("Wrote more data than expected.");
        }
    }

    public final void Q(int i, double d) {
        m(i, Double.doubleToRawLongBits(d));
    }

    public final void R(double d) {
        n(Double.doubleToRawLongBits(d));
    }

    public final void S(int i, float f) {
        k(i, Float.floatToRawIntBits(f));
    }

    public final void T(float f) {
        l(Float.floatToRawIntBits(f));
    }

    public abstract int b();

    public abstract int c();

    public abstract void d();

    public abstract void e(byte b);

    public abstract void h(int i, boolean z);

    public abstract void i(int i, aigj aigjVar);

    public abstract void j(aigj aigjVar);

    public abstract void k(int i, int i2);

    public abstract void l(int i);

    public abstract void m(int i, long j);

    public abstract void n(long j);

    public abstract void o(int i, int i2);

    public abstract void p(int i);

    public abstract void q(int i, MessageLite messageLite);

    public abstract void r(MessageLite messageLite);

    public abstract void s(int i, MessageLite messageLite);

    public abstract void t(int i, aigj aigjVar);

    public abstract void u(int i, String str);

    public abstract void v(String str);

    public abstract void w(int i, int i2);

    public abstract void x(int i, int i2);

    public abstract void y(int i);

    public abstract void z(int i, long j);
}
