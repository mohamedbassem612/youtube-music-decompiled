package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class avtp extends AtomicInteger implements avlk, axsq {
    static final avto[] a = new avto[0];
    static final avto[] b = new avto[0];
    private static final long serialVersionUID = -2117620485640801370L;
    final axsp c;
    final avnn d;
    final int e;
    final int f;
    volatile avos g;
    volatile boolean h;
    final awkd i = new awkd();
    volatile boolean j;
    final AtomicReference k;
    final AtomicLong l;
    axsq m;
    long n;
    long o;
    int p;
    int q;
    final int r;

    public avtp(axsp axspVar, avnn avnnVar, int i, int i2) {
        AtomicReference atomicReference = new AtomicReference();
        this.k = atomicReference;
        this.l = new AtomicLong();
        this.c = axspVar;
        this.d = avnnVar;
        this.e = i;
        this.f = i2;
        this.r = Math.max(1, i >> 1);
        atomicReference.lazySet(a);
    }

    @Override // defpackage.axsp
    public final void b(Throwable th) {
        if (this.h) {
            atqp.n(th);
        } else if (!awkh.e(this.i, th)) {
            atqp.n(th);
        } else {
            this.h = true;
            g();
        }
    }

    final avot d() {
        avos awigVar = this.g;
        if (awigVar == null) {
            int i = this.e;
            awigVar = i == Integer.MAX_VALUE ? new awig(this.f) : new awif(i);
            this.g = awigVar;
        }
        return awigVar;
    }

    @Override // defpackage.avlk, defpackage.axsp
    public final void e(axsq axsqVar) {
        if (awka.i(this.m, axsqVar)) {
            this.m = axsqVar;
            this.c.e(this);
            if (this.j) {
                return;
            }
            int i = this.e;
            if (i == Integer.MAX_VALUE) {
                axsqVar.ko(Long.MAX_VALUE);
            } else {
                axsqVar.ko(i);
            }
        }
    }

    final void f() {
        avos avosVar = this.g;
        if (avosVar != null) {
            avosVar.c();
        }
    }

    final void g() {
        if (getAndIncrement() == 0) {
            h();
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x015a  */
    /* JADX WARN: Code duplicated, block: B:103:0x015e  */
    /* JADX WARN: Code duplicated, block: B:120:0x00eb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:0x018f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:127:0x018f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:129:0x018f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:141:0x0167 A[EDGE_INSN: B:141:0x0167->B:106:0x0167 BREAK  A[LOOP:3: B:61:0x00ce->B:104:0x015f], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:142:0x0165 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:145:0x015f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:146:0x013b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:150:0x011e A[EDGE_INSN: B:150:0x011e->B:81:0x011e BREAK  A[LOOP:5: B:70:0x00e7->B:76:0x00fa], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:64:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:67:0x00df  */
    /* JADX WARN: Code duplicated, block: B:69:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:74:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:76:0x00fa A[LOOP:5: B:70:0x00e7->B:76:0x00fa, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:83:0x0122 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x0124  */
    /* JADX WARN: Code duplicated, block: B:85:0x012a  */
    /* JADX WARN: Code duplicated, block: B:98:0x0152  */
    final void h() {
        boolean z;
        long j;
        int i;
        boolean z2;
        long j2;
        long jAddAndGet;
        int i2;
        int i3;
        boolean z3;
        avto avtoVar;
        Object objKm;
        avot avotVar;
        boolean z4;
        long j3;
        Object obj;
        int iAddAndGet = 1;
        while (!j()) {
            axsp axspVar = this.c;
            avos avosVar = this.g;
            AtomicLong atomicLong = this.l;
            long jAddAndGet2 = atomicLong.get();
            boolean z5 = jAddAndGet2 == Long.MAX_VALUE;
            if (avosVar != null) {
                j = 0;
                do {
                    long j4 = 0;
                    obj = null;
                    while (true) {
                        if (jAddAndGet2 == 0) {
                            z = true;
                            break;
                        }
                        z = true;
                        Object objKm2 = avosVar.km();
                        if (j()) {
                            return;
                        }
                        if (objKm2 == null) {
                            obj = objKm2;
                            break;
                        }
                        axspVar.kk(objKm2);
                        j++;
                        j4++;
                        jAddAndGet2--;
                        obj = objKm2;
                    }
                    if (j4 != 0) {
                        jAddAndGet2 = z5 ? Long.MAX_VALUE : atomicLong.addAndGet(-j4);
                    }
                    if (jAddAndGet2 == 0) {
                        break;
                    }
                } while (obj != null);
            } else {
                z = true;
                j = 0;
            }
            boolean z6 = this.h;
            avos avosVar2 = this.g;
            avto[] avtoVarArr = (avto[]) this.k.get();
            int length = avtoVarArr.length;
            if (z6 && ((avosVar2 == null || avosVar2.i()) && length == 0)) {
                Throwable thD = awkh.d(this.i);
                if (thD != awkh.a) {
                    if (thD == null) {
                        axspVar.kn();
                        return;
                    } else {
                        axspVar.b(thD);
                        return;
                    }
                }
                return;
            }
            if (length != 0) {
                long j5 = this.o;
                int i4 = this.p;
                if (length > i4) {
                    j2 = 1;
                    if (avtoVarArr[i4].a != j5) {
                    }
                    jAddAndGet = jAddAndGet2;
                    i2 = 0;
                    i3 = i4;
                    z3 = false;
                    while (true) {
                        if (i2 < length) {
                            i = iAddAndGet;
                            break;
                        }
                        if (j()) {
                            return;
                        }
                        avtoVar = avtoVarArr[i3];
                        objKm = null;
                        while (!j()) {
                            avotVar = avtoVar.f;
                            i = iAddAndGet;
                            if (avotVar != null) {
                                j3 = 0;
                                while (jAddAndGet != 0) {
                                    try {
                                        objKm = avotVar.km();
                                        if (objKm != null) {
                                            break;
                                        }
                                        axspVar.kk(objKm);
                                        if (!j()) {
                                            return;
                                        }
                                        jAddAndGet--;
                                        j3 += j2;
                                    } catch (Throwable th) {
                                        avkz.a(th);
                                        awka.f(avtoVar);
                                        awkh.e(this.i, th);
                                        this.m.kj();
                                        if (j()) {
                                            return;
                                        }
                                        i(avtoVar);
                                        i2++;
                                        z3 = z;
                                    }
                                }
                                if (j3 != 0) {
                                    if (z5) {
                                        jAddAndGet = Long.MAX_VALUE;
                                    } else {
                                        jAddAndGet = atomicLong.addAndGet(-j3);
                                    }
                                    avtoVar.d(j3);
                                }
                                if (jAddAndGet == 0 && objKm != null) {
                                    iAddAndGet = i;
                                }
                            }
                            z4 = avtoVar.e;
                            avot avotVar2 = avtoVar.f;
                            if (z4 && (avotVar2 == null || avotVar2.i())) {
                                i(avtoVar);
                                if (!j()) {
                                    return;
                                }
                                j += j2;
                                z3 = z;
                            }
                            if (jAddAndGet != 0) {
                                break;
                            }
                            i3++;
                            if (i3 == length) {
                                i3 = 0;
                            }
                            i2++;
                            iAddAndGet = i;
                        }
                        return;
                    }
                    z2 = z3;
                    this.p = i3;
                    this.o = avtoVarArr[i3].a;
                } else {
                    j2 = 1;
                    i4 = 0;
                }
                for (int i5 = 0; i5 < length && avtoVarArr[i4].a != j5; i5++) {
                    i4++;
                    if (i4 == length) {
                        i4 = 0;
                    }
                }
                this.p = i4;
                this.o = avtoVarArr[i4].a;
                jAddAndGet = jAddAndGet2;
                i2 = 0;
                i3 = i4;
                z3 = false;
                while (true) {
                    if (i2 < length) {
                        i = iAddAndGet;
                        break;
                    }
                    if (j()) {
                        avtoVar = avtoVarArr[i3];
                        objKm = null;
                        while (!j()) {
                            avotVar = avtoVar.f;
                            i = iAddAndGet;
                            if (avotVar != null) {
                                j3 = 0;
                                while (jAddAndGet != 0) {
                                    objKm = avotVar.km();
                                    if (objKm != null) {
                                        break;
                                        break;
                                    }
                                    axspVar.kk(objKm);
                                    if (!j()) {
                                        return;
                                    }
                                    jAddAndGet--;
                                    j3 += j2;
                                }
                                if (j3 != 0) {
                                    if (z5) {
                                        jAddAndGet = atomicLong.addAndGet(-j3);
                                    } else {
                                        jAddAndGet = Long.MAX_VALUE;
                                    }
                                    avtoVar.d(j3);
                                }
                                if (jAddAndGet == 0) {
                                }
                            }
                            z4 = avtoVar.e;
                            avot avotVar3 = avtoVar.f;
                            if (z4) {
                                i(avtoVar);
                                if (!j()) {
                                    return;
                                }
                                j += j2;
                                z3 = z;
                            }
                            if (jAddAndGet != 0) {
                                break;
                                break;
                            }
                            i3++;
                            if (i3 == length) {
                                i3 = 0;
                            }
                            i2++;
                            iAddAndGet = i;
                        }
                        return;
                    }
                    return;
                }
                z2 = z3;
                this.p = i3;
                this.o = avtoVarArr[i3].a;
            } else {
                i = iAddAndGet;
                z2 = false;
            }
            long j6 = j;
            if (j6 != 0 && !this.j) {
                this.m.ko(j6);
            }
            int i6 = i;
            if (z2) {
                iAddAndGet = i6;
            } else {
                iAddAndGet = addAndGet(-i6);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }
    }

    final void i(avto avtoVar) {
        AtomicReference atomicReference;
        avto[] avtoVarArr;
        avto[] avtoVarArr2;
        do {
            atomicReference = this.k;
            avtoVarArr = (avto[]) atomicReference.get();
            int length = avtoVarArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (avtoVarArr[i] == avtoVar) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                avtoVarArr2 = a;
            } else {
                avto[] avtoVarArr3 = new avto[length - 1];
                System.arraycopy(avtoVarArr, 0, avtoVarArr3, 0, i);
                System.arraycopy(avtoVarArr, i + 1, avtoVarArr3, i, (length - i) - 1);
                avtoVarArr2 = avtoVarArr3;
            }
        } while (!a.av(atomicReference, avtoVarArr, avtoVarArr2));
    }

    final boolean j() {
        if (this.j) {
            f();
            return true;
        }
        awkd awkdVar = this.i;
        if (awkdVar.get() == null) {
            return false;
        }
        f();
        Throwable thD = awkh.d(awkdVar);
        if (thD == awkh.a) {
            return true;
        }
        this.c.b(thD);
        return true;
    }

    @Override // defpackage.axsq
    public final void kj() {
        avos avosVar;
        avto[] avtoVarArr;
        if (this.j) {
            return;
        }
        this.j = true;
        this.m.kj();
        AtomicReference atomicReference = this.k;
        avto[] avtoVarArr2 = (avto[]) atomicReference.get();
        avto[] avtoVarArr3 = b;
        if (avtoVarArr2 != avtoVarArr3 && (avtoVarArr = (avto[]) atomicReference.getAndSet(avtoVarArr3)) != avtoVarArr3) {
            for (avto avtoVar : avtoVarArr) {
                awka.f(avtoVar);
            }
            Throwable thD = awkh.d(this.i);
            if (thD != null && thD != awkh.a) {
                atqp.n(thD);
            }
        }
        if (getAndIncrement() != 0 || (avosVar = this.g) == null) {
            return;
        }
        avosVar.c();
    }

    @Override // defpackage.axsp
    public final void kk(Object obj) {
        AtomicReference atomicReference;
        avto[] avtoVarArr;
        avto[] avtoVarArr2;
        if (this.h) {
            return;
        }
        try {
            axso axsoVar = (axso) this.d.a(obj);
            axsoVar.getClass();
            if (!(axsoVar instanceof Callable)) {
                long j = this.n;
                this.n = 1 + j;
                avto avtoVar = new avto(this, j);
                do {
                    atomicReference = this.k;
                    avtoVarArr = (avto[]) atomicReference.get();
                    if (avtoVarArr == b) {
                        awka.f(avtoVar);
                        return;
                    }
                    int length = avtoVarArr.length;
                    avtoVarArr2 = new avto[length + 1];
                    System.arraycopy(avtoVarArr, 0, avtoVarArr2, 0, length);
                    avtoVarArr2[length] = avtoVar;
                } while (!a.av(atomicReference, avtoVarArr, avtoVarArr2));
                axsoVar.aq(avtoVar);
                return;
            }
            try {
                Object objCall = ((Callable) axsoVar).call();
                if (objCall == null) {
                    if (this.e == Integer.MAX_VALUE || this.j) {
                        return;
                    }
                    int i = this.q + 1;
                    this.q = i;
                    int i2 = this.r;
                    if (i == i2) {
                        this.q = 0;
                        this.m.ko(i2);
                        return;
                    }
                    return;
                }
                if (get() == 0 && compareAndSet(0, 1)) {
                    AtomicLong atomicLong = this.l;
                    long j2 = atomicLong.get();
                    avot avotVarD = this.g;
                    if (j2 == 0 || !(avotVarD == null || avotVarD.i())) {
                        if (avotVarD == null) {
                            avotVarD = d();
                        }
                        if (!avotVarD.j(objCall)) {
                            b(new IllegalStateException("Scalar queue full?!"));
                            return;
                        }
                    } else {
                        this.c.kk(objCall);
                        if (j2 != Long.MAX_VALUE) {
                            atomicLong.decrementAndGet();
                        }
                        if (this.e != Integer.MAX_VALUE && !this.j) {
                            int i3 = this.q + 1;
                            this.q = i3;
                            int i4 = this.r;
                            if (i3 == i4) {
                                this.q = 0;
                                this.m.ko(i4);
                            }
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                } else if (!d().j(objCall)) {
                    b(new IllegalStateException("Scalar queue full?!"));
                    return;
                } else if (getAndIncrement() != 0) {
                    return;
                }
                h();
            } catch (Throwable th) {
                avkz.a(th);
                awkh.e(this.i, th);
                g();
            }
        } catch (Throwable th2) {
            avkz.a(th2);
            this.m.kj();
            b(th2);
        }
    }

    @Override // defpackage.axsp
    public final void kn() {
        if (this.h) {
            return;
        }
        this.h = true;
        g();
    }

    @Override // defpackage.axsq
    public final void ko(long j) {
        if (awka.h(j)) {
            atqp.B(this.l, j);
            g();
        }
    }
}
