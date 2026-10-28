package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class avvd extends avvb implements avlk {
    private static final long serialVersionUID = -4547113800637756442L;
    final axsp m;

    public avvd(axsp axspVar, avma avmaVar, int i) {
        super(avmaVar, i);
        this.m = axspVar;
    }

    @Override // defpackage.avvb
    public final void d() {
        axsp axspVar;
        avot avotVar = this.f;
        long j = this.k;
        int iAddAndGet = 1;
        while (true) {
            AtomicLong atomicLong = this.d;
            long jAddAndGet = atomicLong.get();
            while (true) {
                axspVar = this.m;
                if (j == jAddAndGet) {
                    break;
                }
                boolean z = this.h;
                try {
                    Object objKm = avotVar.km();
                    boolean z2 = objKm == null;
                    if (!k(z, z2, axspVar)) {
                        if (z2) {
                            break;
                        }
                        axspVar.kk(objKm);
                        j++;
                        if (j == this.c) {
                            if (jAddAndGet != Long.MAX_VALUE) {
                                jAddAndGet = atomicLong.addAndGet(-j);
                            }
                            this.e.ko(j);
                            j = 0;
                        }
                    } else {
                        return;
                    }
                } catch (Throwable th) {
                    avkz.a(th);
                    this.g = true;
                    this.e.kj();
                    avotVar.c();
                    axspVar.b(th);
                    this.a.dispose();
                    return;
                }
            }
            if (j == jAddAndGet && k(this.h, avotVar.i(), axspVar)) {
                return;
            }
            int i = get();
            if (iAddAndGet == i) {
                this.k = j;
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            } else {
                iAddAndGet = i;
            }
        }
    }

    @Override // defpackage.avlk, defpackage.axsp
    public final void e(axsq axsqVar) {
        if (awka.i(this.e, axsqVar)) {
            this.e = axsqVar;
            if (axsqVar instanceof avoq) {
                avoq avoqVar = (avoq) axsqVar;
                int iKl = avoqVar.kl(7);
                if (iKl == 1) {
                    this.j = 1;
                    this.f = avoqVar;
                    this.h = true;
                    this.m.e(this);
                    return;
                }
                if (iKl == 2) {
                    this.j = 2;
                    this.f = avoqVar;
                    this.m.e(this);
                    axsqVar.ko(this.b);
                    return;
                }
            }
            int i = this.b;
            this.f = new awif(i);
            this.m.e(this);
            axsqVar.ko(i);
        }
    }

    @Override // defpackage.avvb
    public final void f() {
        int iAddAndGet = 1;
        while (!this.g) {
            boolean z = this.h;
            axsp axspVar = this.m;
            axspVar.kk(null);
            if (z) {
                this.g = true;
                Throwable th = this.i;
                if (th != null) {
                    axspVar.b(th);
                } else {
                    axspVar.kn();
                }
                this.a.dispose();
                return;
            }
            iAddAndGet = addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            }
        }
    }

    @Override // defpackage.avvb
    public final void g() {
        axsp axspVar;
        avot avotVar = this.f;
        long j = this.k;
        int iAddAndGet = 1;
        while (true) {
            long j2 = this.d.get();
            while (true) {
                axspVar = this.m;
                if (j != j2) {
                    try {
                        Object objKm = avotVar.km();
                        if (this.g) {
                            return;
                        }
                        if (objKm == null) {
                            this.g = true;
                            axspVar.kn();
                            this.a.dispose();
                            return;
                        }
                        axspVar.kk(objKm);
                        j++;
                    } catch (Throwable th) {
                        avkz.a(th);
                        this.g = true;
                        this.e.kj();
                        axspVar.b(th);
                        this.a.dispose();
                        return;
                    }
                }
            }
            if (this.g) {
                return;
            }
            if (avotVar.i()) {
                this.g = true;
                axspVar.kn();
                this.a.dispose();
                return;
            } else {
                int i = get();
                if (iAddAndGet == i) {
                    this.k = j;
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    iAddAndGet = i;
                }
            }
        }
    }

    @Override // defpackage.avot
    public final Object km() {
        Object objKm = this.f.km();
        if (objKm != null && this.j != 1) {
            long j = this.k + 1;
            if (j == this.c) {
                this.k = 0L;
                this.e.ko(j);
            } else {
                this.k = j;
            }
        }
        return objKm;
    }
}
