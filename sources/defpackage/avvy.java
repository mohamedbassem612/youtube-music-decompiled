package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class avvy extends AtomicInteger implements avlk, avmn {
    static final avvx[] a = new avvx[0];
    static final avvx[] b = new avvx[0];
    private static final long serialVersionUID = -1672047311619175801L;
    final AtomicReference c;
    final AtomicReference d = new AtomicReference();
    final AtomicBoolean e = new AtomicBoolean();
    final AtomicReference f = new AtomicReference(a);
    final int g;
    volatile avot h;
    int i;
    volatile boolean j;
    Throwable k;
    int l;

    public avvy(AtomicReference atomicReference, int i) {
        this.c = atomicReference;
        this.g = i;
    }

    @Override // defpackage.axsp
    public final void b(Throwable th) {
        if (this.j) {
            atqp.n(th);
            return;
        }
        this.k = th;
        this.j = true;
        d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    final void d() {
        int i;
        int i2;
        if (getAndIncrement() != 0) {
            return;
        }
        avot avotVar = this.h;
        int i3 = this.l;
        int i4 = this.g;
        int i5 = this.i;
        avot avotVar2 = avotVar;
        int i6 = i3;
        int iAddAndGet = 1;
        while (true) {
            if (avotVar2 != null) {
                AtomicReference atomicReference = this.f;
                avvx[] avvxVarArr = (avvx[]) atomicReference.get();
                long jMin = Long.MAX_VALUE;
                boolean z = false;
                for (avvx avvxVar : avvxVarArr) {
                    long j = avvxVar.get();
                    if (j != Long.MIN_VALUE) {
                        jMin = Math.min(j - avvxVar.c, jMin);
                        z = true;
                    }
                }
                long j2 = 0;
                if (!z) {
                    jMin = 0;
                }
                while (true) {
                    if (jMin != j2) {
                        boolean z2 = this.j;
                        try {
                            Object objKm = avotVar2.km();
                            boolean z3 = objKm == null;
                            if (i(z2, z3)) {
                                return;
                            }
                            if (!z3) {
                                int length = avvxVarArr.length;
                                int i7 = 0;
                                while (i7 < length) {
                                    avvx avvxVar2 = avvxVarArr[i7];
                                    if (!avvxVar2.a()) {
                                        avvxVar2.a.kk(objKm);
                                        avvxVar2.c++;
                                    }
                                    i7++;
                                    iAddAndGet = iAddAndGet;
                                }
                                int i8 = iAddAndGet;
                                if (i5 != 1 && (i6 = i6 + 1) == (i2 = i4 - (i4 >> 2))) {
                                    ((axsq) this.d.get()).ko(i2);
                                    i6 = 0;
                                }
                                jMin--;
                                iAddAndGet = i8;
                                if (avvxVarArr == atomicReference.get()) {
                                    j2 = 0;
                                }
                            }
                        } catch (Throwable th) {
                            avkz.a(th);
                            ((axsq) this.d.get()).kj();
                            avotVar2.c();
                            this.j = true;
                            h(th);
                            return;
                        }
                    }
                    i = iAddAndGet;
                    if (i(this.j, avotVar2.i())) {
                        return;
                    }
                }
            } else {
                i = iAddAndGet;
            }
            this.l = i6;
            iAddAndGet = addAndGet(-i);
            if (iAddAndGet == 0) {
                return;
            }
            if (avotVar2 == null) {
                avotVar2 = this.h;
            }
        }
    }

    @Override // defpackage.avmn
    public final void dispose() {
        this.f.getAndSet(b);
        a.av(this.c, this, null);
        awka.f(this.d);
    }

    @Override // defpackage.avlk, defpackage.axsp
    public final void e(axsq axsqVar) {
        if (awka.g(this.d, axsqVar)) {
            if (axsqVar instanceof avoq) {
                avoq avoqVar = (avoq) axsqVar;
                int iKl = avoqVar.kl(7);
                if (iKl == 1) {
                    this.i = 1;
                    this.h = avoqVar;
                    this.j = true;
                    d();
                    return;
                }
                if (iKl == 2) {
                    this.i = 2;
                    this.h = avoqVar;
                    axsqVar.ko(this.g);
                    return;
                }
            }
            int i = this.g;
            this.h = new awif(i);
            axsqVar.ko(i);
        }
    }

    @Override // defpackage.avmn
    public final boolean f() {
        return this.f.get() == b;
    }

    final void g(avvx avvxVar) {
        AtomicReference atomicReference;
        avvx[] avvxVarArr;
        avvx[] avvxVarArr2;
        do {
            atomicReference = this.f;
            avvxVarArr = (avvx[]) atomicReference.get();
            int length = avvxVarArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (avvxVarArr[i] == avvxVar) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                avvxVarArr2 = a;
            } else {
                avvx[] avvxVarArr3 = new avvx[length - 1];
                System.arraycopy(avvxVarArr, 0, avvxVarArr3, 0, i);
                System.arraycopy(avvxVarArr, i + 1, avvxVarArr3, i, (length - i) - 1);
                avvxVarArr2 = avvxVarArr3;
            }
        } while (!a.av(atomicReference, avvxVarArr, avvxVarArr2));
    }

    final void h(Throwable th) {
        for (avvx avvxVar : (avvx[]) this.f.getAndSet(b)) {
            if (!avvxVar.a()) {
                avvxVar.a.b(th);
            }
        }
    }

    final boolean i(boolean z, boolean z2) {
        if (!z || !z2) {
            return false;
        }
        Throwable th = this.k;
        if (th != null) {
            h(th);
        } else {
            for (avvx avvxVar : (avvx[]) this.f.getAndSet(b)) {
                if (!avvxVar.a()) {
                    avvxVar.a.kn();
                }
            }
        }
        return true;
    }

    @Override // defpackage.axsp
    public final void kk(Object obj) {
        if (this.i != 0 || this.h.j(obj)) {
            d();
        } else {
            b(new avmx("Prefetch queue is full?!"));
        }
    }

    @Override // defpackage.axsp
    public final void kn() {
        this.j = true;
        d();
    }
}
