package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class awar extends AtomicInteger implements avlw, avmn {
    private static final long serialVersionUID = -9140123220065488293L;
    final avlw a;
    final avnn b;
    avmn f;
    volatile boolean g;
    volatile boolean h;
    Object i;
    volatile int j;
    final int k = 1;
    final awkd c = new awkd();
    final awaq d = new awaq(this);
    final avos e = new awig(2);

    public awar(avlw avlwVar, avnn avnnVar) {
        this.a = avlwVar;
        this.b = avnnVar;
    }

    @Override // defpackage.avlw
    public final void b(Throwable th) {
        if (!awkh.e(this.c, th)) {
            atqp.n(th);
            return;
        }
        if (this.k == 1) {
            avnr.b(this.d);
        }
        this.g = true;
        e();
    }

    @Override // defpackage.avlw
    public final void d(avmn avmnVar) {
        if (avnr.e(this.f, avmnVar)) {
            this.f = avmnVar;
            this.a.d(this);
        }
    }

    @Override // defpackage.avmn
    public final void dispose() {
        this.h = true;
        this.f.dispose();
        avnr.b(this.d);
        if (getAndIncrement() == 0) {
            this.e.c();
            this.i = null;
        }
    }

    /* JADX WARN: Type inference failed for: r6v4, types: [avlp, java.lang.Object] */
    final void e() {
        if (getAndIncrement() != 0) {
            return;
        }
        avlw avlwVar = this.a;
        int i = this.k;
        avos avosVar = this.e;
        awkd awkdVar = this.c;
        int iAddAndGet = 1;
        while (true) {
            if (this.h) {
                avosVar.c();
                this.i = null;
            } else {
                int i2 = this.j;
                if (awkdVar.get() != null && i == 1) {
                    avosVar.c();
                    this.i = null;
                    avlwVar.b(awkh.d(awkdVar));
                    return;
                }
                if (i2 == 0) {
                    boolean z = this.g;
                    Object objKm = avosVar.km();
                    if (z) {
                        if (objKm == null) {
                            Throwable thD = awkh.d(awkdVar);
                            if (thD == null) {
                                avlwVar.kn();
                                return;
                            } else {
                                avlwVar.b(thD);
                                return;
                            }
                        }
                    } else if (objKm != null) {
                    }
                    try {
                        ?? A = this.b.a(objKm);
                        this.j = 1;
                        A.F(this.d);
                    } catch (Throwable th) {
                        avkz.a(th);
                        this.f.dispose();
                        avosVar.c();
                        awkh.e(awkdVar, th);
                        avlwVar.b(awkh.d(awkdVar));
                        return;
                    }
                } else if (i2 == 2) {
                    Object obj = this.i;
                    this.i = null;
                    avlwVar.kk(obj);
                    this.j = 0;
                }
            }
            iAddAndGet = addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            }
        }
    }

    @Override // defpackage.avmn
    public final boolean f() {
        return this.h;
    }

    @Override // defpackage.avlw
    public final void kk(Object obj) {
        this.e.j(obj);
        e();
    }

    @Override // defpackage.avlw
    public final void kn() {
        this.g = true;
        e();
    }
}
