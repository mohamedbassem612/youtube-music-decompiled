package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class avmr implements avmn {
    final AtomicReference a = new AtomicReference();

    public final void a(avmn avmnVar) {
        avnr.i(this.a, avmnVar);
    }

    @Override // defpackage.avmn
    public final void dispose() {
        avnr.b(this.a);
    }

    @Override // defpackage.avmn
    public final boolean f() {
        return avnr.c((avmn) this.a.get());
    }
}
