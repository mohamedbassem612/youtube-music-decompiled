package defpackage;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class awci extends AtomicInteger implements avmn, avlw {
    static final awch[] a = new awch[0];
    static final awch[] b = new awch[0];
    private static final long serialVersionUID = -2117620485640801370L;
    final avlw c;
    final avnn d;
    final boolean e;
    final int f;
    final int g;
    volatile avos h;
    volatile boolean i;
    final awkd j = new awkd();
    volatile boolean k;
    final AtomicReference l;
    avmn m;
    long n;
    long o;
    int p;
    Queue q;
    int r;

    public awci(avlw avlwVar, avnn avnnVar, boolean z, int i, int i2) {
        this.c = avlwVar;
        this.d = avnnVar;
        this.e = z;
        this.f = i;
        this.g = i2;
        if (i != Integer.MAX_VALUE) {
            this.q = new ArrayDeque(i);
        }
        this.l = new AtomicReference(a);
    }

    @Override // defpackage.avlw
    public final void b(Throwable th) {
        if (this.i) {
            atqp.n(th);
        } else if (!awkh.e(this.j, th)) {
            atqp.n(th);
        } else {
            this.i = true;
            e();
        }
    }

    @Override // defpackage.avlw
    public final void d(avmn avmnVar) {
        if (avnr.e(this.m, avmnVar)) {
            this.m = avmnVar;
            this.c.d(this);
        }
    }

    @Override // defpackage.avmn
    public final void dispose() {
        Throwable thD;
        if (this.k) {
            return;
        }
        this.k = true;
        if (!k() || (thD = awkh.d(this.j)) == null || thD == awkh.a) {
            return;
        }
        atqp.n(thD);
    }

    final void e() {
        if (getAndIncrement() == 0) {
            g();
        }
    }

    @Override // defpackage.avmn
    public final boolean f() {
        return this.k;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x009f A[EXC_TOP_SPLITTER, LOOP:3: B:105:0x009f->B:128:?, LOOP_START, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:110:0x0122 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:0x0122 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:126:0x00e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:127:0x00cb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x0093  */
    /* JADX WARN: Code duplicated, block: B:56:0x0099  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:69:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:76:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e8 A[PHI: r3
      0x00e8: PHI (r3v5 int) = (r3v3 int), (r3v6 int) binds: [B:67:0x00c8, B:78:0x00e6] A[DONT_GENERATE, DONT_INLINE]] */
    final void g() {
        int size;
        int i;
        int i2;
        awch awchVar;
        avot avotVar;
        Object objKm;
        boolean z;
        int iAddAndGet = 1;
        while (!j()) {
            avlw avlwVar = this.c;
            avos avosVar = this.h;
            if (avosVar != null) {
                while (!j()) {
                    Object objKm2 = avosVar.km();
                    if (objKm2 != null) {
                        avlwVar.kk(objKm2);
                    }
                }
                return;
            }
            boolean z2 = this.i;
            avos avosVar2 = this.h;
            awch[] awchVarArr = (awch[]) this.l.get();
            int length = awchVarArr.length;
            int i3 = 0;
            if (this.f != Integer.MAX_VALUE) {
                synchronized (this) {
                    size = this.q.size();
                }
            } else {
                size = 0;
            }
            if (z2 && ((avosVar2 == null || avosVar2.i()) && length == 0 && size == 0)) {
                Throwable thD = awkh.d(this.j);
                if (thD != awkh.a) {
                    if (thD == null) {
                        avlwVar.kn();
                        return;
                    } else {
                        avlwVar.b(thD);
                        return;
                    }
                }
                return;
            }
            if (length != 0) {
                long j = this.o;
                int i4 = this.p;
                if (length > i4) {
                    if (awchVarArr[i4].a != j) {
                    }
                    i2 = 0;
                    for (i = 0; i < length; i++) {
                        if (!j()) {
                            return;
                        }
                        awchVar = awchVarArr[i4];
                        avotVar = awchVar.d;
                        if (avotVar != null) {
                            do {
                                try {
                                    objKm = avotVar.km();
                                    if (objKm != null) {
                                        avlwVar.kk(objKm);
                                    } else {
                                        z = awchVar.c;
                                        avot avotVar2 = awchVar.d;
                                        if (z && (avotVar2 == null || avotVar2.i())) {
                                            h(awchVar);
                                            if (!j()) {
                                                return;
                                            } else {
                                                i2++;
                                            }
                                        }
                                        i4++;
                                        if (i4 == length) {
                                            i4 = 0;
                                        }
                                    }
                                } catch (Throwable th) {
                                    avkz.a(th);
                                    avnr.b(awchVar);
                                    awkh.e(this.j, th);
                                    if (j()) {
                                        return;
                                    }
                                    i4++;
                                    i2++;
                                    h(awchVar);
                                    if (i4 == length) {
                                    }
                                }
                            } while (!j());
                            return;
                        }
                        z = awchVar.c;
                        avot avotVar3 = awchVar.d;
                        if (z) {
                            h(awchVar);
                            if (!j()) {
                                return;
                            } else {
                                i2++;
                            }
                        }
                        i4++;
                        if (i4 == length) {
                            i4 = 0;
                        }
                    }
                    this.p = i4;
                    this.o = awchVarArr[i4].a;
                    i3 = i2;
                } else {
                    i4 = 0;
                }
                for (int i5 = 0; i5 < length && awchVarArr[i4].a != j; i5++) {
                    i4++;
                    if (i4 == length) {
                        i4 = 0;
                    }
                }
                this.p = i4;
                this.o = awchVarArr[i4].a;
                i2 = 0;
                while (i < length) {
                    if (!j()) {
                        return;
                    }
                    awchVar = awchVarArr[i4];
                    avotVar = awchVar.d;
                    if (avotVar != null) {
                        do {
                            objKm = avotVar.km();
                            if (objKm != null) {
                                avlwVar.kk(objKm);
                            } else {
                                z = awchVar.c;
                                avot avotVar4 = awchVar.d;
                                if (z) {
                                    h(awchVar);
                                    if (!j()) {
                                        return;
                                    } else {
                                        i2++;
                                    }
                                }
                                i4++;
                                if (i4 == length) {
                                    i4 = 0;
                                }
                            }
                        } while (!j());
                        return;
                    }
                    z = awchVar.c;
                    avot avotVar5 = awchVar.d;
                    if (z) {
                        h(awchVar);
                        if (!j()) {
                            return;
                        } else {
                            i2++;
                        }
                    }
                    i4++;
                    if (i4 == length) {
                        i4 = 0;
                    }
                }
                this.p = i4;
                this.o = awchVarArr[i4].a;
                i3 = i2;
            }
            if (i3 == 0) {
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            } else if (this.f != Integer.MAX_VALUE) {
                while (i3 != 0) {
                    synchronized (this) {
                        avlu avluVar = (avlu) this.q.poll();
                        i3--;
                        if (avluVar == null) {
                            this.r--;
                        } else {
                            i(avluVar);
                        }
                    }
                }
            } else {
                continue;
            }
        }
    }

    final void h(awch awchVar) {
        AtomicReference atomicReference;
        awch[] awchVarArr;
        awch[] awchVarArr2;
        do {
            atomicReference = this.l;
            awchVarArr = (awch[]) atomicReference.get();
            int length = awchVarArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (awchVarArr[i] == awchVar) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                awchVarArr2 = a;
            } else {
                awch[] awchVarArr3 = new awch[length - 1];
                System.arraycopy(awchVarArr, 0, awchVarArr3, 0, i);
                System.arraycopy(awchVarArr, i + 1, awchVarArr3, i, (length - i) - 1);
                awchVarArr2 = awchVarArr3;
            }
        } while (!a.av(atomicReference, awchVarArr, awchVarArr2));
    }

    final void i(avlu avluVar) {
        boolean z;
        AtomicReference atomicReference;
        awch[] awchVarArr;
        awch[] awchVarArr2;
        do {
            z = false;
            if (!(avluVar instanceof Callable)) {
                long j = this.n;
                this.n = 1 + j;
                awch awchVar = new awch(this, j);
                do {
                    atomicReference = this.l;
                    awchVarArr = (awch[]) atomicReference.get();
                    if (awchVarArr == b) {
                        avnr.b(awchVar);
                        return;
                    }
                    int length = awchVarArr.length;
                    awchVarArr2 = new awch[length + 1];
                    System.arraycopy(awchVarArr, 0, awchVarArr2, 0, length);
                    awchVarArr2[length] = awchVar;
                } while (!a.av(atomicReference, awchVarArr, awchVarArr2));
                avluVar.ak(awchVar);
                return;
            }
            try {
                Object objCall = ((Callable) avluVar).call();
                if (objCall != null) {
                    if (get() == 0 && compareAndSet(0, 1)) {
                        this.c.kk(objCall);
                        if (decrementAndGet() != 0) {
                            g();
                        }
                    } else {
                        avos awigVar = this.h;
                        if (awigVar == null) {
                            int i = this.f;
                            awigVar = i == Integer.MAX_VALUE ? new awig(this.g) : new awif(i);
                            this.h = awigVar;
                        }
                        if (awigVar.j(objCall)) {
                            if (getAndIncrement() != 0) {
                                return;
                            }
                            g();
                        } else {
                            b(new IllegalStateException("Scalar queue full?!"));
                        }
                    }
                }
            } catch (Throwable th) {
                avkz.a(th);
                awkh.e(this.j, th);
                e();
            }
            if (this.f == Integer.MAX_VALUE) {
                return;
            }
            synchronized (this) {
                avluVar = (avlu) this.q.poll();
                if (avluVar == null) {
                    this.r--;
                    z = true;
                }
            }
        } while (!z);
        e();
    }

    final boolean j() {
        if (this.k) {
            return true;
        }
        awkd awkdVar = this.j;
        Throwable th = (Throwable) awkdVar.get();
        if (this.e || th == null) {
            return false;
        }
        k();
        Throwable thD = awkh.d(awkdVar);
        if (thD == awkh.a) {
            return true;
        }
        this.c.b(thD);
        return true;
    }

    final boolean k() {
        awch[] awchVarArr;
        this.m.dispose();
        AtomicReference atomicReference = this.l;
        awch[] awchVarArr2 = (awch[]) atomicReference.get();
        awch[] awchVarArr3 = b;
        if (awchVarArr2 == awchVarArr3 || (awchVarArr = (awch[]) atomicReference.getAndSet(awchVarArr3)) == awchVarArr3) {
            return false;
        }
        for (awch awchVar : awchVarArr) {
            avnr.b(awchVar);
        }
        return true;
    }

    @Override // defpackage.avlw
    public final void kk(Object obj) {
        if (this.i) {
            return;
        }
        try {
            avlu avluVar = (avlu) this.d.a(obj);
            avluVar.getClass();
            if (this.f != Integer.MAX_VALUE) {
                synchronized (this) {
                    int i = this.r;
                    if (i == this.f) {
                        this.q.offer(avluVar);
                        return;
                    }
                    this.r = i + 1;
                }
            }
            i(avluVar);
        } catch (Throwable th) {
            avkz.a(th);
            this.m.dispose();
            b(th);
        }
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
