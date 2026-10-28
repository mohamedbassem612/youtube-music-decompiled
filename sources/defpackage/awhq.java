package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class awhq extends AtomicReference implements Runnable, avmd, avmn {
    private static final long serialVersionUID = 7000911171163930287L;
    final avmd a;
    final avnv b = new avnv();
    final avmf c;

    public awhq(avmd avmdVar, avmf avmfVar) {
        this.a = avmdVar;
        this.c = avmfVar;
    }

    @Override // defpackage.avmd, defpackage.avlc, defpackage.avln
    public final void b(Throwable th) {
        this.a.b(th);
    }

    @Override // defpackage.avmd, defpackage.avlc, defpackage.avln
    public final void d(avmn avmnVar) {
        avnr.d(this, avmnVar);
    }

    @Override // defpackage.avmn
    public final void dispose() {
        avnr.b(this);
        avnr.b(this.b);
    }

    @Override // defpackage.avmn
    public final boolean f() {
        return avnr.c((avmn) get());
    }

    @Override // defpackage.avmd, defpackage.avln
    public final void ki(Object obj) {
        this.a.ki(obj);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.F(this);
    }
}
