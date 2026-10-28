package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class awgz extends AtomicReference implements avmd, avmn {
    private static final long serialVersionUID = 3258103020495908596L;
    final avmd a;
    final avnn b;

    public awgz(avmd avmdVar, avnn avnnVar) {
        this.a = avmdVar;
        this.b = avnnVar;
    }

    @Override // defpackage.avmd, defpackage.avlc, defpackage.avln
    public final void b(Throwable th) {
        this.a.b(th);
    }

    @Override // defpackage.avmd, defpackage.avlc, defpackage.avln
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

    @Override // defpackage.avmd, defpackage.avln
    public final void ki(Object obj) {
        try {
            avmf avmfVar = (avmf) this.b.a(obj);
            avmfVar.getClass();
            if (f()) {
                return;
            }
            avmfVar.F(new avzr((AtomicReference) this, this.a, 2));
        } catch (Throwable th) {
            avkz.a(th);
            this.a.b(th);
        }
    }
}
