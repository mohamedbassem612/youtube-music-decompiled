package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class axro extends axrp {
    @Override // defpackage.axrp
    public final double a(Object obj, long j) {
        return Double.longBitsToDouble(h(obj, j));
    }

    @Override // defpackage.axrp
    public final float b(Object obj, long j) {
        return Float.intBitsToFloat(g(obj, j));
    }

    @Override // defpackage.axrp
    public final void c(Object obj, long j, boolean z) {
        if (axrq.b) {
            axrq.j(obj, j, z ? (byte) 1 : (byte) 0);
        } else {
            axrq.k(obj, j, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // defpackage.axrp
    public final void d(Object obj, long j, double d) {
        k(obj, j, Double.doubleToLongBits(d));
    }

    @Override // defpackage.axrp
    public final void e(Object obj, long j, float f) {
        j(obj, j, Float.floatToIntBits(f));
    }

    @Override // defpackage.axrp
    public final boolean f(Object obj, long j) {
        if (axrq.b) {
            return axrq.s(obj, j);
        }
        return axrq.a(obj, j) != 0;
    }
}
