package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class awai extends AtomicReference implements avmd {
    private static final long serialVersionUID = -3051469169682093892L;
    final awaj a;

    public awai(awaj awajVar) {
        this.a = awajVar;
    }

    @Override // defpackage.avmd, defpackage.avlc, defpackage.avln
    public final void b(Throwable th) {
        awaj awajVar = this.a;
        if (!awkh.e(awajVar.e, th)) {
            atqp.n(th);
            return;
        }
        int i = awajVar.o;
        awajVar.h.kj();
        awajVar.n = 0;
        awajVar.d();
    }

    @Override // defpackage.avmd, defpackage.avlc, defpackage.avln
    public final void d(avmn avmnVar) {
        avnr.g(this, avmnVar);
    }

    @Override // defpackage.avmd, defpackage.avln
    public final void ki(Object obj) {
        awaj awajVar = this.a;
        awajVar.m = obj;
        awajVar.n = 2;
        awajVar.d();
    }
}
