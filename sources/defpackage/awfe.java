package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class awfe extends AtomicReference implements avlw {
    private static final long serialVersionUID = -8693423678067375039L;
    final /* synthetic */ awff a;

    public awfe(awff awffVar) {
        this.a = awffVar;
    }

    @Override // defpackage.avlw
    public final void b(Throwable th) {
        awff awffVar = this.a;
        avnr.b(awffVar.b);
        atqp.w(awffVar.a, th, awffVar, awffVar.d);
    }

    @Override // defpackage.avlw
    public final void d(avmn avmnVar) {
        avnr.d(this, avmnVar);
    }

    @Override // defpackage.avlw
    public final void kk(Object obj) {
        avnr.b(this);
        this.a.e();
    }

    @Override // defpackage.avlw
    public final void kn() {
        this.a.e();
    }
}
