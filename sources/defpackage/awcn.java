package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class awcn extends AtomicReference implements avlc, avmn {
    private static final long serialVersionUID = 8606673141535671828L;
    final /* synthetic */ awco a;

    public awcn(awco awcoVar) {
        this.a = awcoVar;
    }

    @Override // defpackage.avlc, defpackage.avln
    public final void b(Throwable th) {
        awco awcoVar = this.a;
        awcoVar.d.d(this);
        awcoVar.b(th);
    }

    @Override // defpackage.avlc, defpackage.avln
    public final void d(avmn avmnVar) {
        avnr.d(this, avmnVar);
    }

    @Override // defpackage.avmn
    public final void dispose() {
        avnr.b(this);
    }

    @Override // defpackage.avmn
    public final boolean f() {
        return avnr.c((avmn) get());
    }

    @Override // defpackage.avlc, defpackage.avln
    public final void kn() {
        awco awcoVar = this.a;
        awcoVar.d.d(this);
        awcoVar.kn();
    }
}
