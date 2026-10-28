package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class avzy extends AtomicReference implements Runnable, avmn {
    private static final long serialVersionUID = 2875964065294031672L;
    final avln a;

    public avzy(avln avlnVar) {
        this.a = avlnVar;
    }

    @Override // defpackage.avmn
    public final void dispose() {
        avnr.b(this);
    }

    @Override // defpackage.avmn
    public final boolean f() {
        return avnr.c((avmn) get());
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.ki(0L);
    }
}
