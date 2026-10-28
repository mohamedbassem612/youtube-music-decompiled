package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class avzs extends AtomicReference implements avln, avmn {
    private static final long serialVersionUID = 4603919676453758899L;
    final avmd a;
    final avmf b;

    public avzs(avmd avmdVar, avmf avmfVar) {
        this.a = avmdVar;
        this.b = avmfVar;
    }

    @Override // defpackage.avln
    public final void b(Throwable th) {
        this.a.b(th);
    }

    @Override // defpackage.avln
    public final void d(avmn avmnVar) {
        if (avnr.d(this, avmnVar)) {
            this.a.d(this);
        }
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
        this.a.ki(obj);
    }

    @Override // defpackage.avln
    public final void kn() {
        avmn avmnVar = (avmn) get();
        if (avmnVar == avnr.DISPOSED || !compareAndSet(avmnVar, null)) {
            return;
        }
        this.b.F(new avzr(this.a, this, 0));
    }
}
