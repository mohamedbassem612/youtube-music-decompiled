package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class avzm extends AtomicReference implements avln, avmn {
    private static final long serialVersionUID = 8571289934935992137L;
    final avnv a = new avnv();
    final avln b;

    public avzm(avln avlnVar) {
        this.b = avlnVar;
    }

    @Override // defpackage.avln
    public final void b(Throwable th) {
        this.b.b(th);
    }

    @Override // defpackage.avln
    public final void d(avmn avmnVar) {
        avnr.d(this, avmnVar);
    }

    @Override // defpackage.avmn
    public final void dispose() {
        avnr.b(this);
        avnr.b(this.a);
    }

    @Override // defpackage.avmn
    public final boolean f() {
        return avnr.c((avmn) get());
    }

    @Override // defpackage.avln
    public final void ki(Object obj) {
        this.b.ki(obj);
    }

    @Override // defpackage.avln
    public final void kn() {
        this.b.kn();
    }
}
