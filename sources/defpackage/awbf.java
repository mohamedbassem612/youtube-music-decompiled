package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class awbf extends AtomicInteger implements avlw, avmn {
    private static final long serialVersionUID = 8828587559905699186L;
    final avlw a;
    final avnn b;
    final awbe c;
    final int d;
    avot e;
    avmn f;
    volatile boolean g;
    volatile boolean h;
    volatile boolean i;
    int j;

    public awbf(avlw avlwVar, avnn avnnVar, int i) {
        this.a = avlwVar;
        this.b = avnnVar;
        this.d = i;
        this.c = new awbe(avlwVar, this);
    }

    @Override // defpackage.avlw
    public final void b(Throwable th) {
        if (this.i) {
            atqp.n(th);
            return;
        }
        this.i = true;
        dispose();
        this.a.b(th);
    }

    @Override // defpackage.avlw
    public final void d(avmn avmnVar) {
        if (avnr.e(this.f, avmnVar)) {
            this.f = avmnVar;
            if (avmnVar instanceof avoo) {
                avoo avooVar = (avoo) avmnVar;
                int iKl = avooVar.kl(3);
                if (iKl == 1) {
                    this.j = 1;
                    this.e = avooVar;
                    this.i = true;
                    this.a.d(this);
                    e();
                    return;
                }
                if (iKl == 2) {
                    this.j = 2;
                    this.e = avooVar;
                    this.a.d(this);
                    return;
                }
            }
            this.e = new awig(this.d);
            this.a.d(this);
        }
    }

    @Override // defpackage.avmn
    public final void dispose() {
        this.h = true;
        avnr.b(this.c);
        this.f.dispose();
        if (getAndIncrement() == 0) {
            this.e.c();
        }
    }

    final void e() {
        if (getAndIncrement() == 0) {
            while (!this.h) {
                if (!this.g) {
                    boolean z = this.i;
                    try {
                        Object objKm = this.e.km();
                        if (z) {
                            if (objKm == null) {
                                this.h = true;
                                this.a.kn();
                                return;
                            }
                        } else if (objKm != null) {
                        }
                        try {
                            avlu avluVar = (avlu) this.b.a(objKm);
                            avluVar.getClass();
                            this.g = true;
                            avluVar.ak(this.c);
                        } catch (Throwable th) {
                            avkz.a(th);
                            dispose();
                            this.e.c();
                            this.a.b(th);
                            return;
                        }
                    } catch (Throwable th2) {
                        avkz.a(th2);
                        dispose();
                        this.e.c();
                        this.a.b(th2);
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
            this.e.c();
        }
    }

    @Override // defpackage.avmn
    public final boolean f() {
        return this.h;
    }

    @Override // defpackage.avlw
    public final void kk(Object obj) {
        if (this.i) {
            return;
        }
        if (this.j == 0) {
            this.e.j(obj);
        }
        e();
    }

    @Override // defpackage.avlw
    public final void kn() {
        if (this.i) {
            return;
        }
        this.i = true;
        e();
    }
}
