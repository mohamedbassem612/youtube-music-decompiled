package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class avvc extends avvb {
    private static final long serialVersionUID = 644624475404284533L;
    final avok m;
    long n;

    public avvc(avok avokVar, avma avmaVar, int i) {
        super(avmaVar, i);
        this.m = avokVar;
    }

    @Override // defpackage.avvb
    public final void d() {
        avok avokVar;
        avot avotVar = this.f;
        long j = this.k;
        long j2 = this.n;
        int iAddAndGet = 1;
        while (true) {
            long j3 = this.d.get();
            while (true) {
                avokVar = this.m;
                if (j == j3) {
                    break;
                }
                boolean z = this.h;
                try {
                    Object objKm = avotVar.km();
                    boolean z2 = objKm == null;
                    if (!k(z, z2, avokVar)) {
                        if (z2) {
                            break;
                        }
                        if (avokVar.d(objKm)) {
                            j++;
                        }
                        j2++;
                        if (j2 == this.c) {
                            this.e.ko(j2);
                            j2 = 0;
                        }
                    } else {
                        return;
                    }
                } catch (Throwable th) {
                    avkz.a(th);
                    this.g = true;
                    this.e.kj();
                    avotVar.c();
                    avokVar.b(th);
                    this.a.dispose();
                    return;
                }
            }
            if (j == j3 && k(this.h, avotVar.i(), avokVar)) {
                return;
            }
            int i = get();
            if (iAddAndGet == i) {
                this.k = j;
                this.n = j2;
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
            avok avokVar = this.m;
            avokVar.kk(null);
            if (z) {
                this.g = true;
                Throwable th = this.i;
                if (th != null) {
                    avokVar.b(th);
                } else {
                    avokVar.kn();
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
        avok avokVar;
        avot avotVar = this.f;
        long j = this.k;
        int iAddAndGet = 1;
        while (true) {
            long j2 = this.d.get();
            while (true) {
                avokVar = this.m;
                if (j != j2) {
                    try {
                        Object objKm = avotVar.km();
                        if (this.g) {
                            return;
                        }
                        if (objKm == null) {
                            this.g = true;
                            avokVar.kn();
                            this.a.dispose();
                            return;
                        } else if (avokVar.d(objKm)) {
                            j++;
                        }
                    } catch (Throwable th) {
                        avkz.a(th);
                        this.g = true;
                        this.e.kj();
                        avokVar.b(th);
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
                avokVar.kn();
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
            long j = this.n + 1;
            if (j == this.c) {
                this.n = 0L;
                this.e.ko(j);
            } else {
                this.n = j;
            }
        }
        return objKm;
    }
}
