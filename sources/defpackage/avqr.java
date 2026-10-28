package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class avqr extends AtomicReference implements avlc, avmn {
    private static final long serialVersionUID = 5018523762564524046L;
    final avlc a;
    final avnn b;
    boolean c;

    public avqr(avlc avlcVar, avnn avnnVar) {
        this.a = avlcVar;
        this.b = avnnVar;
    }

    @Override // defpackage.avlc, defpackage.avln
    public final void b(Throwable th) {
        if (this.c) {
            this.a.b(th);
            return;
        }
        this.c = true;
        try {
            avle avleVar = (avle) this.b.a(th);
            avleVar.getClass();
            avleVar.kp(this);
        } catch (Throwable th2) {
            avkz.a(th2);
            this.a.b(new avmw(th, th2));
        }
    }

    @Override // defpackage.avlc, defpackage.avln
    public final void d(avmn avmnVar) {
        avnr.g(this, avmnVar);
    }

    @Override // defpackage.avmn
    public final void dispose() {
        avnr.b(this);
    }

    @Override // defpackage.avmn
    public final boolean f() {
        return avnr.c((avmn) get());
    }

    @Override // defpackage.avlc, defpackage.avln
    public final void kn() {
        this.a.kn();
    }
}
