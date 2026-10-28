package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class awfa extends AtomicInteger implements avlw, avmn {
    static final awez a;
    private static final long serialVersionUID = -3491074160481096299L;
    final avlw b;
    final avnn c;
    final int d;
    volatile boolean f;
    volatile boolean g;
    avmn h;
    volatile long j;
    final AtomicReference i = new AtomicReference();
    final awkd e = new awkd();

    static {
        awez awezVar = new awez(null, -1L, 1);
        a = awezVar;
        avnr.b(awezVar);
    }

    public awfa(avlw avlwVar, avnn avnnVar, int i) {
        this.b = avlwVar;
        this.c = avnnVar;
        this.d = i;
    }

    @Override // defpackage.avlw
    public final void b(Throwable th) {
        if (this.f || !awkh.e(this.e, th)) {
            atqp.n(th);
            return;
        }
        e();
        this.f = true;
        g();
    }

    @Override // defpackage.avlw
    public final void d(avmn avmnVar) {
        if (avnr.e(this.h, avmnVar)) {
            this.h = avmnVar;
            this.b.d(this);
        }
    }

    @Override // defpackage.avmn
    public final void dispose() {
        if (this.g) {
            return;
        }
        this.g = true;
        this.h.dispose();
        e();
    }

    final void e() {
        awez awezVar;
        AtomicReference atomicReference = this.i;
        awez awezVar2 = (awez) atomicReference.get();
        awez awezVar3 = a;
        if (awezVar2 == awezVar3 || (awezVar = (awez) atomicReference.getAndSet(awezVar3)) == awezVar3 || awezVar == null) {
            return;
        }
        avnr.b(awezVar);
    }

    @Override // defpackage.avmn
    public final boolean f() {
        return this.g;
    }

    final void g() {
        avot avotVar;
        Object objKm;
        if (getAndIncrement() == 0) {
            avlw avlwVar = this.b;
            AtomicReference atomicReference = this.i;
            int iAddAndGet = 1;
            while (!this.g) {
                if (this.f) {
                    Object obj = atomicReference.get();
                    if (((Throwable) this.e.get()) != null) {
                        avlwVar.b(awkh.d(this.e));
                        return;
                    } else if (obj == null) {
                        avlwVar.kn();
                        return;
                    }
                }
                awez awezVar = (awez) atomicReference.get();
                if (awezVar != null && (avotVar = awezVar.d) != null) {
                    boolean z = false;
                    if (awezVar.e) {
                        boolean zI = avotVar.i();
                        if (((Throwable) this.e.get()) != null) {
                            avlwVar.b(awkh.d(this.e));
                            return;
                        } else if (zI) {
                            a.av(atomicReference, awezVar, null);
                        }
                    }
                    while (!this.g) {
                        if (awezVar != atomicReference.get()) {
                            continue;
                        } else {
                            if (((Throwable) this.e.get()) != null) {
                                avlwVar.b(awkh.d(this.e));
                                return;
                            }
                            boolean z2 = awezVar.e;
                            try {
                                objKm = avotVar.km();
                            } catch (Throwable th) {
                                avkz.a(th);
                                awkh.e(this.e, th);
                                a.av(atomicReference, awezVar, null);
                                e();
                                this.h.dispose();
                                this.f = true;
                                z = true;
                                objKm = null;
                            }
                            if (z2) {
                                if (objKm == null) {
                                    a.av(atomicReference, awezVar, null);
                                } else {
                                    avlwVar.kk(objKm);
                                }
                            } else if (objKm != null) {
                                avlwVar.kk(objKm);
                            } else if (z) {
                                continue;
                            }
                        }
                    }
                    return;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }
    }

    @Override // defpackage.avlw
    public final void kk(Object obj) {
        AtomicReference atomicReference;
        awez awezVar;
        long j = this.j + 1;
        this.j = j;
        awez awezVar2 = (awez) this.i.get();
        if (awezVar2 != null) {
            avnr.b(awezVar2);
        }
        try {
            avlu avluVar = (avlu) this.c.a(obj);
            avluVar.getClass();
            awez awezVar3 = new awez(this, j, this.d);
            do {
                atomicReference = this.i;
                awezVar = (awez) atomicReference.get();
                if (awezVar == a) {
                    return;
                }
            } while (!a.av(atomicReference, awezVar, awezVar3));
            avluVar.ak(awezVar3);
        } catch (Throwable th) {
            avkz.a(th);
            this.h.dispose();
            b(th);
        }
    }

    @Override // defpackage.avlw
    public final void kn() {
        if (this.f) {
            return;
        }
        this.f = true;
        g();
    }
}
