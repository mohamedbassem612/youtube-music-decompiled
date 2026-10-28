package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class avzw extends AtomicReference implements avln {
    private static final long serialVersionUID = 8663801314800248617L;
    final avzv a;

    public avzw(avzv avzvVar) {
        this.a = avzvVar;
    }

    @Override // defpackage.avln
    public final void b(Throwable th) {
        avzv avzvVar = this.a;
        if (avnr.b(avzvVar)) {
            avzvVar.a.b(th);
        } else {
            atqp.n(th);
        }
    }

    @Override // defpackage.avln
    public final void d(avmn avmnVar) {
        avnr.d(this, avmnVar);
    }

    @Override // defpackage.avln
    public final void ki(Object obj) {
        this.a.c();
    }

    @Override // defpackage.avln
    public final void kn() {
        this.a.c();
    }
}
