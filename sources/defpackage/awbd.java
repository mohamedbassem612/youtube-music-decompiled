package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class awbd extends AtomicInteger implements avlw, avmn {
    private static final long serialVersionUID = -6951100001833242599L;
    final avlw a;
    final avnn b;
    final int c;
    final awkd d = new awkd();
    final awbc e;
    final boolean f;
    avot g;
    avmn h;
    volatile boolean i;
    volatile boolean j;
    volatile boolean k;
    int l;

    public awbd(avlw avlwVar, avnn avnnVar, int i, boolean z) {
        this.a = avlwVar;
        this.b = avnnVar;
        this.c = i;
        this.f = z;
        this.e = new awbc(avlwVar, this);
    }

    @Override // defpackage.avlw
    public final void b(Throwable th) {
        if (!awkh.e(this.d, th)) {
            atqp.n(th);
        } else {
            this.j = true;
            e();
        }
    }

    @Override // defpackage.avlw
    public final void d(avmn avmnVar) {
        if (avnr.e(this.h, avmnVar)) {
            this.h = avmnVar;
            if (avmnVar instanceof avoo) {
                avoo avooVar = (avoo) avmnVar;
                int iKl = avooVar.kl(3);
                if (iKl == 1) {
                    this.l = 1;
                    this.g = avooVar;
                    this.j = true;
                    this.a.d(this);
                    e();
                    return;
                }
                if (iKl == 2) {
                    this.l = 2;
                    this.g = avooVar;
                    this.a.d(this);
                    return;
                }
            }
            this.g = new awig(this.c);
            this.a.d(this);
        }
    }

    @Override // defpackage.avmn
    public final void dispose() {
        this.k = true;
        this.h.dispose();
        avnr.b(this.e);
    }

    final void e() {
        if (getAndIncrement() != 0) {
            return;
        }
        avlw avlwVar = this.a;
        avot avotVar = this.g;
        awkd awkdVar = this.d;
        while (true) {
            if (!this.i) {
                if (this.k) {
                    avotVar.c();
                    return;
                }
                if (!this.f && ((Throwable) awkdVar.get()) != null) {
                    avotVar.c();
                    this.k = true;
                    avlwVar.b(awkh.d(awkdVar));
                    return;
                }
                boolean z = this.j;
                try {
                    Object objKm = avotVar.km();
                    if (z) {
                        if (objKm == null) {
                            this.k = true;
                            Throwable thD = awkh.d(awkdVar);
                            if (thD != null) {
                                avlwVar.b(thD);
                                return;
                            } else {
                                avlwVar.kn();
                                return;
                            }
                        }
                    } else if (objKm != null) {
                    }
                    try {
                        avlu avluVar = (avlu) this.b.a(objKm);
                        avluVar.getClass();
                        if (avluVar instanceof Callable) {
                            try {
                                Object objCall = ((Callable) avluVar).call();
                                if (objCall != null && !this.k) {
                                    avlwVar.kk(objCall);
                                }
                            } catch (Throwable th) {
                                avkz.a(th);
                                awkh.e(awkdVar, th);
                            }
                        } else {
                            this.i = true;
                            avluVar.ak(this.e);
                        }
                    } catch (Throwable th2) {
                        avkz.a(th2);
                        this.k = true;
                        this.h.dispose();
                        avotVar.c();
                        awkh.e(awkdVar, th2);
                        avlwVar.b(awkh.d(awkdVar));
                        return;
                    }
                } catch (Throwable th3) {
                    avkz.a(th3);
                    this.k = true;
                    this.h.dispose();
                    awkh.e(awkdVar, th3);
                    avlwVar.b(awkh.d(awkdVar));
                    return;
                }
            }
            if (decrementAndGet() == 0) {
                return;
            }
        }
    }

    @Override // defpackage.avmn
    public final boolean f() {
        return this.k;
    }

    @Override // defpackage.avlw
    public final void kk(Object obj) {
        if (this.l == 0) {
            this.g.j(obj);
        }
        e();
    }

    @Override // defpackage.avlw
    public final void kn() {
        this.j = true;
        e();
    }
}
