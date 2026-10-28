package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class avpa extends AtomicReference implements avmd, avmn {
    private static final long serialVersionUID = -7012088219455310787L;
    final avni a;
    final avni b;

    public avpa(avni avniVar, avni avniVar2) {
        this.a = avniVar;
        this.b = avniVar2;
    }

    @Override // defpackage.avmd, defpackage.avlc, defpackage.avln
    public final void b(Throwable th) {
        lazySet(avnr.DISPOSED);
        try {
            this.b.a(th);
        } catch (Throwable th2) {
            avkz.a(th2);
            atqp.n(new avmw(th, th2));
        }
    }

    @Override // defpackage.avmd, defpackage.avlc, defpackage.avln
    public final void d(avmn avmnVar) {
        avnr.d(this, avmnVar);
    }

    @Override // defpackage.avmn
    public final void dispose() {
        avnr.b(this);
    }

    @Override // defpackage.avmn
    public final boolean f() {
        return get() == avnr.DISPOSED;
    }

    @Override // defpackage.avmd, defpackage.avln
    public final void ki(Object obj) {
        lazySet(avnr.DISPOSED);
        try {
            this.a.a(obj);
        } catch (Throwable th) {
            avkz.a(th);
            atqp.n(th);
        }
    }
}
