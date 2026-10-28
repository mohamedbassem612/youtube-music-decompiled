package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class awhe extends AtomicReference implements avmd, avmn {
    private static final long serialVersionUID = -5843758257109742742L;
    final avln a;
    final avnn b;

    public awhe(avln avlnVar, avnn avnnVar) {
        this.a = avlnVar;
        this.b = avnnVar;
    }

    @Override // defpackage.avmd, defpackage.avlc, defpackage.avln
    public final void b(Throwable th) {
        this.a.b(th);
    }

    @Override // defpackage.avmd, defpackage.avlc, defpackage.avln
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

    @Override // defpackage.avmd, defpackage.avln
    public final void ki(Object obj) {
        try {
            avlp avlpVar = (avlp) this.b.a(obj);
            avlpVar.getClass();
            if (f()) {
                return;
            }
            avlpVar.F(new awhd(this, this.a, 0));
        } catch (Throwable th) {
            avkz.a(th);
            b(th);
        }
    }
}
