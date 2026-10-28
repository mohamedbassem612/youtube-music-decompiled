package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class awat extends AtomicReference implements avlw, avmd, avmn {
    private static final long serialVersionUID = -8948264376121066672L;
    final avlw a;
    final avnn b;

    public awat(avlw avlwVar, avnn avnnVar) {
        this.a = avlwVar;
        this.b = avnnVar;
    }

    @Override // defpackage.avlw
    public final void b(Throwable th) {
        this.a.b(th);
    }

    @Override // defpackage.avlw
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

    /* JADX WARN: Type inference failed for: r2v2, types: [avlu, java.lang.Object] */
    @Override // defpackage.avmd, defpackage.avln
    public final void ki(Object obj) {
        try {
            this.b.a(obj).ak(this);
        } catch (Throwable th) {
            avkz.a(th);
            this.a.b(th);
        }
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
