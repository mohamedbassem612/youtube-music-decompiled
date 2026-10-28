package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bkb extends bkd {
    @Override // defpackage.bkd
    public final double a(Object obj, long j) {
        return Double.longBitsToDouble(j(obj, j));
    }

    @Override // defpackage.bkd
    public final float b(Object obj, long j) {
        return Float.intBitsToFloat(i(obj, j));
    }

    @Override // defpackage.bkd
    public final void c(Object obj, long j, boolean z) {
        if (bke.b) {
            bke.k(obj, j, z ? (byte) 1 : (byte) 0);
        } else {
            bke.l(obj, j, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // defpackage.bkd
    public final void d(Object obj, long j, double d) {
        m(obj, j, Double.doubleToLongBits(d));
    }

    @Override // defpackage.bkd
    public final void e(Object obj, long j, float f) {
        l(obj, j, Float.floatToIntBits(f));
    }

    @Override // defpackage.bkd
    public final boolean f(Object obj, long j) {
        return bke.b ? bke.t(obj, j) : bke.u(obj, j);
    }

    @Override // defpackage.bkd
    public final void g() {
    }
}
