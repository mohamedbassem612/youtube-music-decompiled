package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class awgd extends awgc {
    private static final long serialVersionUID = -5737965195918321883L;

    @Override // defpackage.awgc
    public final void b() {
        if (getAndIncrement() == 0) {
            h();
        }
    }

    @Override // defpackage.awgc
    public final void d() {
        this.f.decrementAndGet();
        b();
    }

    @Override // defpackage.awgc
    public final void f(Throwable th) {
        awkh.e(this.c, th);
        this.f.decrementAndGet();
        b();
    }

    @Override // defpackage.awgc
    public final void g(awgb awgbVar, Object obj) {
        if (get() == 0 && compareAndSet(0, 1)) {
            AtomicLong atomicLong = this.d;
            if (atomicLong.get() != 0) {
                this.a.kk(obj);
                if (atomicLong.get() != Long.MAX_VALUE) {
                    atomicLong.decrementAndGet();
                }
                long j = awgbVar.d + 1;
                if (j >= awgbVar.c) {
                    awgbVar.d = 0L;
                    ((axsq) awgbVar.get()).ko(j);
                } else {
                    awgbVar.d = j;
                }
            } else if (!awgbVar.d().j(obj)) {
                awka.f(awgbVar);
                awkh.e(this.c, new avmx("Queue full?!"));
                this.f.decrementAndGet();
                h();
                return;
            }
            if (decrementAndGet() == 0) {
                return;
            }
        } else {
            if (!awgbVar.d().j(obj) && awka.f(awgbVar)) {
                awkh.e(this.c, new avmx("Queue full?!"));
                this.f.decrementAndGet();
            }
            if (getAndIncrement() != 0) {
                return;
            }
        }
        h();
    }

    final void h() {
        axsp axspVar;
        long j;
        boolean z;
        Object objKm;
        awgb[] awgbVarArr = this.b;
        int length = awgbVarArr.length;
        int iAddAndGet = 1;
        while (true) {
            AtomicLong atomicLong = this.d;
            long j2 = atomicLong.get();
            long j3 = 0;
            while (true) {
                axspVar = this.a;
                if (j3 == j2) {
                    j = j2;
                    break;
                }
                if (this.e) {
                    a();
                    return;
                }
                int i = this.f.get();
                int i2 = 0;
                boolean z2 = true;
                while (i2 < length) {
                    awgb awgbVar = awgbVarArr[i2];
                    avos avosVar = awgbVar.e;
                    if (avosVar != null && (objKm = avosVar.km()) != null) {
                        axspVar.kk(objKm);
                        long j4 = awgbVar.d + 1;
                        j = j2;
                        if (j4 == awgbVar.c) {
                            awgbVar.d = 0L;
                            ((axsq) awgbVar.get()).ko(j4);
                        } else {
                            awgbVar.d = j4;
                        }
                        j3++;
                        if (j3 == j) {
                            break;
                        } else {
                            z2 = false;
                        }
                    } else {
                        j = j2;
                    }
                    i2++;
                    j2 = j;
                }
                j = j2;
                if (i != 0) {
                    if (z2) {
                        break;
                    }
                } else if (z2) {
                    awkd awkdVar = this.c;
                    if (((Throwable) awkdVar.get()) != null) {
                        axspVar.b(awkh.d(awkdVar));
                        return;
                    } else {
                        axspVar.kn();
                        return;
                    }
                }
                j2 = j;
            }
            if (j3 == j) {
                if (this.e) {
                    a();
                    return;
                }
                int i3 = this.f.get();
                int i4 = 0;
                while (true) {
                    if (i4 < length) {
                        avos avosVar2 = awgbVarArr[i4].e;
                        if (avosVar2 != null && !avosVar2.i()) {
                            z = false;
                            break;
                        }
                        i4++;
                    } else {
                        z = true;
                        break;
                    }
                }
                if (i3 == 0 && z) {
                    awkd awkdVar2 = this.c;
                    if (((Throwable) awkdVar2.get()) != null) {
                        axspVar.b(awkh.d(awkdVar2));
                        return;
                    } else {
                        axspVar.kn();
                        return;
                    }
                }
            }
            if (j3 != 0 && j != Long.MAX_VALUE) {
                atomicLong.addAndGet(-j3);
            }
            int i5 = get();
            if (i5 == iAddAndGet) {
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            } else {
                iAddAndGet = i5;
            }
        }
    }
}
