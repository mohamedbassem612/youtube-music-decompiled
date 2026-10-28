package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class lzk extends lzm {
    @Override // defpackage.lzm
    public final double a(Object obj, long j) {
        return Double.longBitsToDouble(j(obj, j));
    }

    @Override // defpackage.lzm
    public final float b(Object obj, long j) {
        return Float.intBitsToFloat(i(obj, j));
    }

    @Override // defpackage.lzm
    public final void c(Object obj, long j, boolean z) {
        if (lzn.a) {
            lzn.k(obj, j, z ? (byte) 1 : (byte) 0);
        } else {
            lzn.l(obj, j, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // defpackage.lzm
    public final void d(Object obj, long j, double d) {
        l(obj, j, Double.doubleToLongBits(d));
    }

    @Override // defpackage.lzm
    public final void e(Object obj, long j, float f) {
        k(obj, j, Float.floatToIntBits(f));
    }

    @Override // defpackage.lzm
    public final boolean f(Object obj, long j) {
        return lzn.a ? lzn.t(obj, j) : lzn.u(obj, j);
    }

    @Override // defpackage.lzm
    public final void g() {
    }
}
