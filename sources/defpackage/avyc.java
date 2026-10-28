package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class avyc extends AtomicReference implements avln, avmn {
    private static final long serialVersionUID = -6076952298809384986L;
    final avni a;
    final avni b;
    final avnd c;

    public avyc(avni avniVar, avni avniVar2, avnd avndVar) {
        this.a = avniVar;
        this.b = avniVar2;
        this.c = avndVar;
    }

    @Override // defpackage.avln
    public final void b(Throwable th) {
        lazySet(avnr.DISPOSED);
        try {
            this.b.a(th);
        } catch (Throwable th2) {
            avkz.a(th2);
            atqp.n(new avmw(th, th2));
        }
    }

    @Override // defpackage.avln
    public final void d(avmn avmnVar) {
        avnr.d(this, avmnVar);
    }

    @Override // defpackage.avmn
    public final void dispose() {
        avnr.b(this);
    }

    @Override // defpackage.avmn
    public final boolean f() {
        return avnr.c((avmn) get());
    }

    @Override // defpackage.avln
    public final void ki(Object obj) {
        lazySet(avnr.DISPOSED);
        try {
            this.a.a(obj);
        } catch (Throwable th) {
            avkz.a(th);
            atqp.n(th);
        }
    }

    @Override // defpackage.avln
    public final void kn() {
        lazySet(avnr.DISPOSED);
        try {
            this.c.a();
        } catch (Throwable th) {
            avkz.a(th);
            atqp.n(th);
        }
    }
}
