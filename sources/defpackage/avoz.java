package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class avoz extends AtomicReference implements avlc, avmn, avni {
    private static final long serialVersionUID = -4361286194466301354L;
    final avni a;
    final avnd b;

    public avoz(avnd avndVar) {
        this.a = this;
        this.b = avndVar;
    }

    @Override // defpackage.avni
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        atqp.n(new avmy((Throwable) obj));
    }

    @Override // defpackage.avlc, defpackage.avln
    public final void b(Throwable th) {
        try {
            this.a.a(th);
        } catch (Throwable th2) {
            avkz.a(th2);
            atqp.n(th2);
        }
        lazySet(avnr.DISPOSED);
    }

    @Override // defpackage.avlc, defpackage.avln
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

    @Override // defpackage.avlc, defpackage.avln
    public final void kn() {
        try {
            this.b.a();
        } catch (Throwable th) {
            avkz.a(th);
            atqp.n(th);
        }
        lazySet(avnr.DISPOSED);
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        return String.valueOf(this.b);
    }

    public avoz(avni avniVar, avnd avndVar) {
        this.a = avniVar;
        this.b = avndVar;
    }
}
