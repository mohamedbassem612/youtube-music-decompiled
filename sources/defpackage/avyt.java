package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class avyt extends AtomicReference implements avln, avmn {
    private static final long serialVersionUID = 4375739915521278546L;
    final avln a;
    final avnn b;
    avmn c;

    public avyt(avln avlnVar, avnn avnnVar) {
        this.a = avlnVar;
        this.b = avnnVar;
    }

    @Override // defpackage.avln
    public final void b(Throwable th) {
        this.a.b(th);
    }

    @Override // defpackage.avln
    public final void d(avmn avmnVar) {
        if (avnr.e(this.c, avmnVar)) {
            this.c = avmnVar;
            this.a.d(this);
        }
    }

    @Override // defpackage.avmn
    public final void dispose() {
        avnr.b(this);
        this.c.dispose();
    }

    @Override // defpackage.avmn
    public final boolean f() {
        return avnr.c((avmn) get());
    }

    @Override // defpackage.avln
    public final void ki(Object obj) {
        try {
            avlp avlpVar = (avlp) this.b.a(obj);
            avlpVar.getClass();
            if (f()) {
                return;
            }
            avlpVar.F(new avys(this, 0));
        } catch (Exception e) {
            avkz.a(e);
            this.a.b(e);
        }
    }

    @Override // defpackage.avln
    public final void kn() {
        this.a.kn();
    }
}
