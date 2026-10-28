package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class awbh extends AtomicInteger implements avlw, avmn {
    private static final long serialVersionUID = 8080567949447303262L;
    final avlw a;
    final int b;
    final int c;
    avot f;
    public avmn g;
    volatile boolean h;
    int i;
    volatile boolean j;
    avpe k;
    int l;
    public final int m = 2;
    public final awkd d = new awkd();
    final ArrayDeque e = new ArrayDeque();

    public awbh(avlw avlwVar, int i, int i2) {
        this.a = avlwVar;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.avlw
    public final void b(Throwable th) {
        if (!awkh.e(this.d, th)) {
            atqp.n(th);
        } else {
            this.h = true;
            g();
        }
    }

    @Override // defpackage.avlw
    public final void d(avmn avmnVar) {
        if (avnr.e(this.g, avmnVar)) {
            this.g = avmnVar;
            if (avmnVar instanceof avoo) {
                avoo avooVar = (avoo) avmnVar;
                int iKl = avooVar.kl(3);
                if (iKl == 1) {
                    this.i = 1;
                    this.f = avooVar;
                    this.h = true;
                    this.a.d(this);
                    g();
                    return;
                }
                if (iKl == 2) {
                    this.i = 2;
                    this.f = avooVar;
                    this.a.d(this);
                    return;
                }
            }
            this.f = new awig(this.c);
            this.a.d(this);
        }
    }

    @Override // defpackage.avmn
    public final void dispose() {
        if (this.j) {
            return;
        }
        this.j = true;
        this.g.dispose();
        if (getAndIncrement() == 0) {
            do {
                this.f.c();
                e();
            } while (decrementAndGet() != 0);
        }
    }

    final void e() {
        avpe avpeVar = this.k;
        if (avpeVar != null) {
            avnr.b(avpeVar);
        }
        while (true) {
            avpe avpeVar2 = (avpe) this.e.poll();
            if (avpeVar2 == null) {
                return;
            } else {
                avnr.b(avpeVar2);
            }
        }
    }

    @Override // defpackage.avmn
    public final boolean f() {
        return this.j;
    }

    public final void g() {
        int i;
        if (getAndIncrement() != 0) {
            return;
        }
        avot avotVar = this.f;
        ArrayDeque arrayDeque = this.e;
        avlw avlwVar = this.a;
        int i2 = this.m;
        int iAddAndGet = 1;
        while (true) {
            int i3 = this.l;
            while (true) {
                if (i3 == this.b) {
                    i = i2;
                    break;
                }
                if (this.j) {
                    avotVar.c();
                    e();
                    return;
                }
                if (i2 != 1) {
                    i = i2;
                } else {
                    if (((Throwable) this.d.get()) != null) {
                        avotVar.c();
                        e();
                        avlwVar.b(awkh.d(this.d));
                        return;
                    }
                    i = 1;
                }
                try {
                    Object objKm = avotVar.km();
                    if (objKm == null) {
                        break;
                    }
                    avlu avluVar = (avlu) objKm;
                    avpe avpeVar = new avpe(this, this.c);
                    arrayDeque.offer(avpeVar);
                    avluVar.ak(avpeVar);
                    i3++;
                } catch (Throwable th) {
                    avkz.a(th);
                    this.g.dispose();
                    avotVar.c();
                    e();
                    awkd awkdVar = this.d;
                    awkh.e(awkdVar, th);
                    avlwVar.b(awkh.d(awkdVar));
                    return;
                }
            }
            this.l = i3;
            if (this.j) {
                avotVar.c();
                e();
                return;
            }
            if (i == 1) {
                if (((Throwable) this.d.get()) != null) {
                    avotVar.c();
                    e();
                    avlwVar.b(awkh.d(this.d));
                    return;
                }
                i = 1;
            }
            avpe avpeVar2 = this.k;
            if (avpeVar2 == null) {
                if (i == 2 && ((Throwable) this.d.get()) != null) {
                    avotVar.c();
                    e();
                    avlwVar.b(awkh.d(this.d));
                    return;
                }
                boolean z = this.h;
                avpe avpeVar3 = (avpe) arrayDeque.poll();
                if (!z) {
                    if (avpeVar3 != null) {
                    }
                    avpeVar2 = avpeVar3;
                } else if (avpeVar3 == null) {
                    awkd awkdVar2 = this.d;
                    if (((Throwable) awkdVar2.get()) == null) {
                        avlwVar.kn();
                        return;
                    }
                    avotVar.c();
                    e();
                    avlwVar.b(awkh.d(awkdVar2));
                    return;
                }
                this.k = avpeVar3;
                avpeVar2 = avpeVar3;
            }
            if (avpeVar2 != null) {
                avot avotVar2 = avpeVar2.b;
                while (true) {
                    if (this.j) {
                        avotVar.c();
                        e();
                        return;
                    }
                    boolean z2 = avpeVar2.c;
                    if (i == 1 && ((Throwable) this.d.get()) != null) {
                        avotVar.c();
                        e();
                        avlwVar.b(awkh.d(this.d));
                        return;
                    }
                    try {
                        Object objKm2 = avotVar2.km();
                        if (z2) {
                            if (objKm2 == null) {
                                this.k = null;
                                this.l--;
                            }
                        } else if (objKm2 != null) {
                        }
                        avlwVar.kk(objKm2);
                    } catch (Throwable th2) {
                        avkz.a(th2);
                        awkh.e(this.d, th2);
                        this.k = null;
                        this.l--;
                    }
                }
            }
            iAddAndGet = addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            }
        }
    }

    public final void h(avpe avpeVar) {
        avpeVar.e();
        g();
    }

    @Override // defpackage.avlw
    public final void kk(Object obj) {
        if (this.i == 0) {
            this.f.j(obj);
        }
        g();
    }

    @Override // defpackage.avlw
    public final void kn() {
        this.h = true;
        g();
    }
}
