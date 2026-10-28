package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class awew extends AtomicReference implements avlw, avmn {
    private static final long serialVersionUID = 8094547886072529208L;
    final avlw a;
    final AtomicReference b = new AtomicReference();

    public awew(avlw avlwVar) {
        this.a = avlwVar;
    }

    @Override // defpackage.avlw
    public final void b(Throwable th) {
        this.a.b(th);
    }

    @Override // defpackage.avlw
    public final void d(avmn avmnVar) {
        avnr.d(this.b, avmnVar);
    }

    @Override // defpackage.avmn
    public final void dispose() {
        avnr.b(this.b);
        avnr.b(this);
    }

    @Override // defpackage.avmn
    public final boolean f() {
        return avnr.c((avmn) get());
    }

    @Override // defpackage.avlw
    public final void kk(Object obj) {
        this.a.kk(obj);
    }

    @Override // defpackage.avlw
    public final void kn() {
        this.a.kn();
    }
}
