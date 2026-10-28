package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class awaq extends AtomicReference implements avln {
    private static final long serialVersionUID = -3051469169682093892L;
    final awar a;

    public awaq(awar awarVar) {
        this.a = awarVar;
    }

    @Override // defpackage.avln
    public final void b(Throwable th) {
        awar awarVar = this.a;
        if (!awkh.e(awarVar.c, th)) {
            atqp.n(th);
            return;
        }
        int i = awarVar.k;
        awarVar.f.dispose();
        awarVar.j = 0;
        awarVar.e();
    }

    @Override // defpackage.avln
    public final void d(avmn avmnVar) {
        avnr.g(this, avmnVar);
    }

    @Override // defpackage.avln
    public final void ki(Object obj) {
        awar awarVar = this.a;
        awarVar.i = obj;
        awarVar.j = 2;
        awarVar.e();
    }

    @Override // defpackage.avln
    public final void kn() {
        awar awarVar = this.a;
        awarVar.j = 0;
        awarVar.e();
    }
}
