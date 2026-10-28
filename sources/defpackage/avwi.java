package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class avwi extends AtomicReference implements avlk, avmn {
    static final avwe[] a = new avwe[0];
    static final avwe[] b = new avwe[0];
    private static final long serialVersionUID = 7224554242710036740L;
    boolean c;
    long g;
    long h;
    final avwd i;
    final AtomicInteger f = new AtomicInteger();
    final AtomicReference d = new AtomicReference(a);
    final AtomicBoolean e = new AtomicBoolean();

    public avwi(avwd avwdVar) {
        this.i = avwdVar;
    }

    @Override // defpackage.axsp
    public final void b(Throwable th) {
        if (this.c) {
            atqp.n(th);
            return;
        }
        this.c = true;
        avwd avwdVar = this.i;
        awkj awkjVar = new awkj(th);
        long j = avwdVar.c + 1;
        avwdVar.c = j;
        avwdVar.a(new avwf(awkjVar, j));
        avwdVar.c();
        for (avwe avweVar : (avwe[]) this.d.getAndSet(b)) {
            avwdVar.b(avweVar);
        }
    }

    final void d() {
        AtomicInteger atomicInteger = this.f;
        if (atomicInteger.getAndIncrement() == 0) {
            int iAddAndGet = 1;
            while (!f()) {
                avwe[] avweVarArr = (avwe[]) this.d.get();
                long j = this.g;
                long jMax = j;
                for (avwe avweVar : avweVarArr) {
                    jMax = Math.max(jMax, avweVar.d.get());
                }
                long j2 = this.h;
                axsq axsqVar = (axsq) get();
                long j3 = jMax - j;
                if (j3 != 0) {
                    this.g = jMax;
                    if (axsqVar == null) {
                        long j4 = j2 + j3;
                        if (j4 < 0) {
                            j4 = Long.MAX_VALUE;
                        }
                        this.h = j4;
                    } else if (j2 != 0) {
                        this.h = 0L;
                        axsqVar.ko(j2 + j3);
                    } else {
                        axsqVar.ko(j3);
                    }
                } else if (j2 != 0 && axsqVar != null) {
                    this.h = 0L;
                    axsqVar.ko(j2);
                }
                iAddAndGet = atomicInteger.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }
    }

    @Override // defpackage.avmn
    public final void dispose() {
        this.d.set(b);
        awka.f(this);
    }

    @Override // defpackage.avlk, defpackage.axsp
    public final void e(axsq axsqVar) {
        if (awka.g(this, axsqVar)) {
            d();
            for (avwe avweVar : (avwe[]) this.d.get()) {
                this.i.b(avweVar);
            }
        }
    }

    @Override // defpackage.avmn
    public final boolean f() {
        return this.d.get() == b;
    }

    final void g(avwe avweVar) {
        AtomicReference atomicReference;
        avwe[] avweVarArr;
        avwe[] avweVarArr2;
        do {
            atomicReference = this.d;
            avweVarArr = (avwe[]) atomicReference.get();
            int length = avweVarArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (avweVarArr[i].equals(avweVar)) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                avweVarArr2 = a;
            } else {
                avwe[] avweVarArr3 = new avwe[length - 1];
                System.arraycopy(avweVarArr, 0, avweVarArr3, 0, i);
                System.arraycopy(avweVarArr, i + 1, avweVarArr3, i, (length - i) - 1);
                avweVarArr2 = avweVarArr3;
            }
        } while (!a.av(atomicReference, avweVarArr, avweVarArr2));
    }

    @Override // defpackage.axsp
    public final void kk(Object obj) {
        if (this.c) {
            return;
        }
        avwd avwdVar = this.i;
        long j = avwdVar.c + 1;
        avwdVar.c = j;
        avwdVar.a(new avwf(obj, j));
        avwdVar.d();
        for (avwe avweVar : (avwe[]) this.d.get()) {
            avwdVar.b(avweVar);
        }
    }

    @Override // defpackage.axsp
    public final void kn() {
        if (this.c) {
            return;
        }
        this.c = true;
        avwd avwdVar = this.i;
        awkl awklVar = awkl.COMPLETE;
        long j = avwdVar.c + 1;
        avwdVar.c = j;
        avwdVar.a(new avwf(awklVar, j));
        avwdVar.c();
        for (avwe avweVar : (avwe[]) this.d.getAndSet(b)) {
            avwdVar.b(avweVar);
        }
    }
}
