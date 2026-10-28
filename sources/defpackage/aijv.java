package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class aijv extends aijx {
    @Override // defpackage.aijx
    public final double a(Object obj, long j) {
        return Double.longBitsToDouble(h(obj, j));
    }

    @Override // defpackage.aijx
    public final float b(Object obj, long j) {
        return Float.intBitsToFloat(g(obj, j));
    }

    @Override // defpackage.aijx
    public final void c(Object obj, long j, boolean z) {
        if (aijy.b) {
            aijy.i(obj, j, z ? (byte) 1 : (byte) 0);
        } else {
            aijy.j(obj, j, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // defpackage.aijx
    public final void d(Object obj, long j, double d) {
        k(obj, j, Double.doubleToLongBits(d));
    }

    @Override // defpackage.aijx
    public final void e(Object obj, long j, float f) {
        j(obj, j, Float.floatToIntBits(f));
    }

    @Override // defpackage.aijx
    public final boolean f(Object obj, long j) {
        if (aijy.b) {
            return aijy.l(obj, j);
        }
        return aijy.a(obj, j) != 0;
    }
}
