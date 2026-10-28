package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class avyq extends AtomicReference implements avln, avmn {
    private static final long serialVersionUID = 4375739915521278546L;
    final avln a;
    final avnn b;
    final avnn c;
    final Callable d;
    avmn e;

    public avyq(avln avlnVar, avnn avnnVar, avnn avnnVar2, Callable callable) {
        this.a = avlnVar;
        this.b = avnnVar;
        this.c = avnnVar2;
        this.d = callable;
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [avlp, java.lang.Object] */
    @Override // defpackage.avln
    public final void b(Throwable th) {
        try {
            this.c.a(th).F(new avys(this, 1));
        } catch (Exception e) {
            avkz.a(e);
            this.a.b(new avmw(th, e));
        }
    }

    @Override // defpackage.avln
    public final void d(avmn avmnVar) {
        if (avnr.e(this.e, avmnVar)) {
            this.e = avmnVar;
            this.a.d(this);
        }
    }

    @Override // defpackage.avmn
    public final void dispose() {
        avnr.b(this);
        this.e.dispose();
    }

    @Override // defpackage.avmn
    public final boolean f() {
        return avnr.c((avmn) get());
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [avlp, java.lang.Object] */
    @Override // defpackage.avln
    public final void ki(Object obj) {
        try {
            this.b.a(obj).F(new avys(this, 1));
        } catch (Exception e) {
            avkz.a(e);
            this.a.b(e);
        }
    }

    @Override // defpackage.avln
    public final void kn() {
        try {
            avlp avlpVar = (avlp) this.d.call();
            avlpVar.getClass();
            avlpVar.F(new avys(this, 1));
        } catch (Exception e) {
            avkz.a(e);
            this.a.b(e);
        }
    }
}
