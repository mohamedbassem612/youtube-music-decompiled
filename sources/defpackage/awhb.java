package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class awhb extends AtomicReference implements avmd, avlc, avmn {
    private static final long serialVersionUID = -2177128922851101253L;
    final avlc a;
    final avnn b;

    public awhb(avlc avlcVar, avnn avnnVar) {
        this.a = avlcVar;
        this.b = avnnVar;
    }

    @Override // defpackage.avmd, defpackage.avlc, defpackage.avln
    public final void b(Throwable th) {
        this.a.b(th);
    }

    @Override // defpackage.avmd, defpackage.avlc, defpackage.avln
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

    @Override // defpackage.avmd, defpackage.avln
    public final void ki(Object obj) {
        try {
            avle avleVar = (avle) this.b.a(obj);
            avleVar.getClass();
            if (f()) {
                return;
            }
            avleVar.kp(this);
        } catch (Throwable th) {
            avkz.a(th);
            b(th);
        }
    }

    @Override // defpackage.avlc, defpackage.avln
    public final void kn() {
        this.a.kn();
    }
}
