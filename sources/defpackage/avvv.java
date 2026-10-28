package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class avvv extends AtomicInteger implements avlk, avmn {
    static final avvu[] a = new avvu[0];
    static final avvu[] b = new avvu[0];
    private static final long serialVersionUID = -202316842419149694L;
    final AtomicReference c;
    final int d;
    volatile Object h;
    int i;
    volatile avot j;
    final AtomicReference g = new AtomicReference();
    final AtomicReference e = new AtomicReference(a);
    final AtomicBoolean f = new AtomicBoolean();

    public avvv(AtomicReference atomicReference, int i) {
        this.c = atomicReference;
        this.d = i;
    }

    @Override // defpackage.axsp
    public final void b(Throwable th) {
        if (this.h != null) {
            atqp.n(th);
        } else {
            this.h = new awkj(th);
            d();
        }
    }

    final void d() {
        boolean z;
        long j;
        Object objKm;
        avvu[] avvuVarArr;
        Object objKm2;
        if (getAndIncrement() != 0) {
            return;
        }
        AtomicReference atomicReference = this.e;
        boolean z2 = true;
        avvu[] avvuVarArr2 = (avvu[]) atomicReference.get();
        int iAddAndGet = 1;
        while (true) {
            Object obj = this.h;
            avot avotVar = this.j;
            boolean z3 = (avotVar == null || avotVar.i()) ? z2 : false;
            if (h(obj, z3)) {
                return;
            }
            if (z3) {
                z = z2;
            } else {
                int length = avvuVarArr2.length;
                int i = 0;
                int i2 = 0;
                long jMin = Long.MAX_VALUE;
                while (true) {
                    j = Long.MIN_VALUE;
                    if (i >= length) {
                        break;
                    }
                    avvu avvuVar = avvuVarArr2[i];
                    long j2 = avvuVar.get();
                    if (j2 != Long.MIN_VALUE) {
                        jMin = Math.min(jMin, j2 - avvuVar.c);
                    } else {
                        i2++;
                    }
                    i++;
                }
                if (length == i2) {
                    Object obj2 = this.h;
                    try {
                        objKm = avotVar.km();
                    } catch (Throwable th) {
                        avkz.a(th);
                        ((axsq) this.g.get()).kj();
                        awkj awkjVar = new awkj(th);
                        this.h = awkjVar;
                        obj2 = awkjVar;
                        objKm = null;
                    }
                    if (h(obj2, objKm == null ? z2 : false)) {
                        return;
                    }
                    if (this.i != z2) {
                        ((axsq) this.g.get()).ko(1L);
                    }
                    z = z2;
                    avvuVarArr = avvuVarArr2;
                } else {
                    boolean z4 = false;
                    int i3 = 0;
                    while (true) {
                        long j3 = i3;
                        if (j3 < jMin) {
                            Object obj3 = this.h;
                            try {
                                objKm2 = avotVar.km();
                            } catch (Throwable th2) {
                                avkz.a(th2);
                                ((axsq) this.g.get()).kj();
                                awkj awkjVar2 = new awkj(th2);
                                this.h = awkjVar2;
                                obj3 = awkjVar2;
                                objKm2 = null;
                            }
                            boolean z5 = objKm2 == null ? z2 : false;
                            if (h(obj3, z5)) {
                                return;
                            }
                            if (z5) {
                                z4 = z5;
                            } else {
                                int length2 = avvuVarArr2.length;
                                int i4 = 0;
                                boolean z6 = false;
                                while (i4 < length2) {
                                    long j4 = j;
                                    avvu avvuVar2 = avvuVarArr2[i4];
                                    long j5 = avvuVar2.get();
                                    if (j5 != j4) {
                                        if (j5 != Long.MAX_VALUE) {
                                            avvuVar2.c++;
                                        }
                                        avvuVar2.a.kk(objKm2);
                                    } else {
                                        z6 = true;
                                    }
                                    i4++;
                                    j = j4;
                                    avvuVarArr2 = avvuVarArr2;
                                }
                                avvu[] avvuVarArr3 = avvuVarArr2;
                                long j6 = j;
                                i3++;
                                avvu[] avvuVarArr4 = (avvu[]) atomicReference.get();
                                if (z6 || avvuVarArr4 != avvuVarArr3) {
                                    if (i3 != 0 && this.i != 1) {
                                        ((axsq) this.g.get()).ko(i3);
                                    }
                                    avvuVarArr2 = avvuVarArr4;
                                    z2 = true;
                                } else {
                                    avvuVarArr2 = avvuVarArr3;
                                    z4 = z5;
                                    j = j6;
                                    z2 = true;
                                }
                            }
                        }
                        avvuVarArr = avvuVarArr2;
                        if (i3 != 0) {
                            z = true;
                            if (this.i != 1) {
                                ((axsq) this.g.get()).ko(j3);
                            }
                        } else {
                            z = true;
                        }
                        if (jMin == 0 || z4) {
                        }
                        z2 = z;
                    }
                }
                avvuVarArr2 = avvuVarArr;
                z2 = z;
            }
            iAddAndGet = addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            }
            avvuVarArr2 = (avvu[]) atomicReference.get();
            z2 = z;
        }
    }

    @Override // defpackage.avmn
    public final void dispose() {
        AtomicReference atomicReference = this.e;
        Object obj = atomicReference.get();
        Object obj2 = b;
        if (obj == obj2 || ((avvu[]) atomicReference.getAndSet(obj2)) == obj2) {
            return;
        }
        a.av(this.c, this, null);
        awka.f(this.g);
    }

    @Override // defpackage.avlk, defpackage.axsp
    public final void e(axsq axsqVar) {
        if (awka.g(this.g, axsqVar)) {
            if (axsqVar instanceof avoq) {
                avoq avoqVar = (avoq) axsqVar;
                int iKl = avoqVar.kl(7);
                if (iKl == 1) {
                    this.i = 1;
                    this.j = avoqVar;
                    this.h = awkl.COMPLETE;
                    d();
                    return;
                }
                if (iKl == 2) {
                    this.i = 2;
                    this.j = avoqVar;
                    axsqVar.ko(this.d);
                    return;
                }
            }
            int i = this.d;
            this.j = new awif(i);
            axsqVar.ko(i);
        }
    }

    @Override // defpackage.avmn
    public final boolean f() {
        return this.e.get() == b;
    }

    final void g(avvu avvuVar) {
        AtomicReference atomicReference;
        avvu[] avvuVarArr;
        avvu[] avvuVarArr2;
        do {
            atomicReference = this.e;
            avvuVarArr = (avvu[]) atomicReference.get();
            int length = avvuVarArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (avvuVarArr[i].equals(avvuVar)) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                avvuVarArr2 = a;
            } else {
                avvu[] avvuVarArr3 = new avvu[length - 1];
                System.arraycopy(avvuVarArr, 0, avvuVarArr3, 0, i);
                System.arraycopy(avvuVarArr, i + 1, avvuVarArr3, i, (length - i) - 1);
                avvuVarArr2 = avvuVarArr3;
            }
        } while (!a.av(atomicReference, avvuVarArr, avvuVarArr2));
    }

    final boolean h(Object obj, boolean z) {
        int i = 0;
        if (obj == null) {
            return false;
        }
        if (!awkl.d(obj)) {
            Throwable thA = awkl.a(obj);
            a.av(this.c, this, null);
            avvu[] avvuVarArr = (avvu[]) this.e.getAndSet(b);
            int length = avvuVarArr.length;
            if (length != 0) {
                while (i < length) {
                    avvuVarArr[i].a.b(thA);
                    i++;
                }
            } else {
                atqp.n(thA);
            }
        } else {
            if (!z) {
                return false;
            }
            a.av(this.c, this, null);
            avvu[] avvuVarArr2 = (avvu[]) this.e.getAndSet(b);
            int length2 = avvuVarArr2.length;
            while (i < length2) {
                avvuVarArr2[i].a.kn();
                i++;
            }
        }
        return true;
    }

    @Override // defpackage.axsp
    public final void kk(Object obj) {
        if (this.i != 0 || this.j.j(obj)) {
            d();
        } else {
            b(new avmx("Prefetch queue is full?!"));
        }
    }

    @Override // defpackage.axsp
    public final void kn() {
        if (this.h == null) {
            this.h = awkl.COMPLETE;
            d();
        }
    }
}
