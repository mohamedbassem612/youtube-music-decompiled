package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLongArray;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class awfz extends AtomicInteger implements avlk {
    private static final long serialVersionUID = -4470634016609963609L;
    final axsp[] a;
    final AtomicLongArray b;
    final long[] c;
    final int d;
    final int e;
    axsq f;
    avot g;
    Throwable h;
    volatile boolean i;
    int j;
    volatile boolean k;
    final AtomicInteger l = new AtomicInteger();
    int m;
    int n;

    public awfz(axsp[] axspVarArr, int i) {
        this.a = axspVarArr;
        this.d = i;
        this.e = i - (i >> 2);
        int length = axspVarArr.length;
        int i2 = length << 1;
        AtomicLongArray atomicLongArray = new AtomicLongArray(i2 + 1);
        this.b = atomicLongArray;
        atomicLongArray.lazySet(i2, length);
        this.c = new long[length];
    }

    @Override // defpackage.axsp
    public final void b(Throwable th) {
        this.h = th;
        this.i = true;
        d();
    }

    final void d() {
        Throwable th;
        if (getAndIncrement() != 0) {
            return;
        }
        int i = this.n;
        avot avotVar = this.g;
        long j = 1;
        long j2 = 0;
        int i2 = 0;
        if (i == 1) {
            axsp[] axspVarArr = this.a;
            AtomicLongArray atomicLongArray = this.b;
            long[] jArr = this.c;
            int length = jArr.length;
            int i3 = this.j;
            int iAddAndGet = 1;
            while (true) {
                int i4 = 0;
                do {
                    if (this.k) {
                        avotVar.c();
                        return;
                    }
                    if (avotVar.i()) {
                        int length2 = axspVarArr.length;
                        while (i2 < length2) {
                            axspVarArr[i2].kn();
                            i2++;
                        }
                        return;
                    }
                    long j3 = atomicLongArray.get(i3);
                    long j4 = jArr[i3];
                    if (j3 == j4 || atomicLongArray.get(length + i3) != 0) {
                        i4++;
                    } else {
                        try {
                            Object objKm = avotVar.km();
                            if (objKm == null) {
                                int length3 = axspVarArr.length;
                                while (i2 < length3) {
                                    axspVarArr[i2].kn();
                                    i2++;
                                }
                                return;
                            }
                            axspVarArr[i3].kk(objKm);
                            jArr[i3] = j4 + 1;
                            i4 = 0;
                        } catch (Throwable th2) {
                            avkz.a(th2);
                            this.f.kj();
                            int length4 = axspVarArr.length;
                            while (i2 < length4) {
                                axspVarArr[i2].b(th2);
                                i2++;
                            }
                            return;
                        }
                    }
                    i3++;
                    if (i3 == length) {
                        i3 = 0;
                    }
                } while (i4 != length);
                int i5 = get();
                if (i5 == iAddAndGet) {
                    this.j = i3;
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    iAddAndGet = i5;
                }
            }
        } else {
            axsp[] axspVarArr2 = this.a;
            AtomicLongArray atomicLongArray2 = this.b;
            long[] jArr2 = this.c;
            int length5 = jArr2.length;
            int i6 = this.j;
            int i7 = this.m;
            int iAddAndGet2 = 1;
            while (true) {
                long j5 = j;
                int i8 = 0;
                while (true) {
                    if (this.k) {
                        avotVar.c();
                        return;
                    }
                    boolean z = this.i;
                    if (z && (th = this.h) != null) {
                        avotVar.c();
                        int length6 = axspVarArr2.length;
                        while (i2 < length6) {
                            axspVarArr2[i2].b(th);
                            i2++;
                        }
                        return;
                    }
                    boolean zI = avotVar.i();
                    if (!z) {
                        if (zI) {
                            break;
                        }
                    } else if (zI) {
                        int length7 = axspVarArr2.length;
                        while (i2 < length7) {
                            axspVarArr2[i2].kn();
                            i2++;
                        }
                        return;
                    }
                    long j6 = atomicLongArray2.get(i6);
                    long j7 = jArr2[i6];
                    if (j6 == j7 || atomicLongArray2.get(length5 + i6) != j2) {
                        i8++;
                    } else {
                        try {
                            Object objKm2 = avotVar.km();
                            if (objKm2 == null) {
                                break;
                            }
                            axspVarArr2[i6].kk(objKm2);
                            jArr2[i6] = j7 + j5;
                            i7++;
                            if (i7 == this.e) {
                                this.f.ko(i7);
                                i7 = 0;
                            }
                            i8 = 0;
                        } catch (Throwable th3) {
                            avkz.a(th3);
                            this.f.kj();
                            int length8 = axspVarArr2.length;
                            while (i2 < length8) {
                                axspVarArr2[i2].b(th3);
                                i2++;
                            }
                            return;
                        }
                    }
                    i6++;
                    if (i6 == length5) {
                        i6 = 0;
                    }
                    if (i8 == length5) {
                        break;
                    } else {
                        j2 = 0;
                    }
                }
                int i9 = get();
                if (i9 == iAddAndGet2) {
                    this.j = i6;
                    this.m = i7;
                    iAddAndGet2 = addAndGet(-iAddAndGet2);
                    if (iAddAndGet2 == 0) {
                        return;
                    }
                } else {
                    iAddAndGet2 = i9;
                }
                j = j5;
                j2 = 0;
            }
        }
    }

    @Override // defpackage.avlk, defpackage.axsp
    public final void e(axsq axsqVar) {
        if (awka.i(this.f, axsqVar)) {
            this.f = axsqVar;
            if (axsqVar instanceof avoq) {
                avoq avoqVar = (avoq) axsqVar;
                int iKl = avoqVar.kl(7);
                if (iKl == 1) {
                    this.n = 1;
                    this.g = avoqVar;
                    this.i = true;
                    f();
                    d();
                    return;
                }
                if (iKl == 2) {
                    this.n = 2;
                    this.g = avoqVar;
                    f();
                    axsqVar.ko(this.d);
                    return;
                }
            }
            int i = this.d;
            this.g = new awif(i);
            f();
            axsqVar.ko(i);
        }
    }

    final void f() {
        axsp[] axspVarArr = this.a;
        int length = axspVarArr.length;
        int i = 0;
        while (i < length && !this.k) {
            int i2 = i + 1;
            this.l.lazySet(i2);
            axspVarArr[i].e(new awfy(this, i, length));
            i = i2;
        }
    }

    @Override // defpackage.axsp
    public final void kk(Object obj) {
        if (this.n != 0 || this.g.j(obj)) {
            d();
        } else {
            this.f.kj();
            b(new avmx("Queue is full?"));
        }
    }

    @Override // defpackage.axsp
    public final void kn() {
        this.i = true;
        d();
    }
}
