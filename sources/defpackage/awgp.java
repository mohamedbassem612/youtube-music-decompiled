package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class awgp extends AtomicReference implements avlc, avmn {
    private static final long serialVersionUID = -8565274649390031272L;
    final avmd a;
    final avmf b;

    public awgp(avmd avmdVar, avmf avmfVar) {
        this.a = avmdVar;
        this.b = avmfVar;
    }

    @Override // defpackage.avlc, defpackage.avln
    public final void b(Throwable th) {
        this.a.b(th);
    }

    @Override // defpackage.avlc, defpackage.avln
    public final void d(avmn avmnVar) {
        if (avnr.d(this, avmnVar)) {
            this.a.d(this);
        }
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
        this.b.F(new avzr(this, this.a, 1));
    }
}
