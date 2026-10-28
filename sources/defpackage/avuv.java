package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class avuv extends awjl {
    final avnn a;

    public avuv(avok avokVar, avnn avnnVar) {
        super(avokVar);
        this.a = avnnVar;
    }

    @Override // defpackage.avok
    public final boolean d(Object obj) {
        if (this.h) {
            return false;
        }
        try {
            Object objA = this.a.a(obj);
            objA.getClass();
            return this.e.d(objA);
        } catch (Throwable th) {
            g(th);
            return true;
        }
    }

    @Override // defpackage.axsp
    public final void kk(Object obj) {
        if (this.h) {
            return;
        }
        if (this.i != 0) {
            this.e.kk(null);
            return;
        }
        try {
            Object objA = this.a.a(obj);
            objA.getClass();
            this.e.kk(objA);
        } catch (Throwable th) {
            g(th);
        }
    }

    @Override // defpackage.avop
    public final int kl(int i) {
        return f(i);
    }

    @Override // defpackage.avot
    public final Object km() {
        Object objKm = this.g.km();
        if (objKm == null) {
            return null;
        }
        Object objA = this.a.a(objKm);
        objA.getClass();
        return objA;
    }
}
