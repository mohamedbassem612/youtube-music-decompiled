package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class avry extends AtomicReference implements avlk {
    private static final long serialVersionUID = -8730235182291002949L;
    final avrx a;
    final int b;
    final int c;
    final int d;
    int e;

    public avry(avrx avrxVar, int i, int i2) {
        this.a = avrxVar;
        this.b = i;
        this.c = i2;
        this.d = i2 - (i2 >> 2);
    }

    @Override // defpackage.axsp
    public final void b(Throwable th) {
        avrx avrxVar = this.a;
        if (!awkh.e(avrxVar.l, th)) {
            atqp.n(th);
            return;
        }
        avrxVar.d();
        avrxVar.k = true;
        avrxVar.f();
    }

    public final void d() {
        int i = this.e + 1;
        if (i != this.d) {
            this.e = i;
        } else {
            this.e = 0;
            ((axsq) get()).ko(i);
        }
    }

    @Override // defpackage.avlk, defpackage.axsp
    public final void e(axsq axsqVar) {
        awka.k(this, axsqVar, this.c);
    }

    @Override // defpackage.axsp
    public final void kk(Object obj) {
        boolean z;
        int i = this.b;
        avrx avrxVar = this.a;
        synchronized (avrxVar) {
            Object[] objArr = avrxVar.e;
            int i2 = avrxVar.g;
            if (objArr[i] == null) {
                i2++;
                avrxVar.g = i2;
            }
            objArr[i] = obj;
            if (objArr.length == i2) {
                awig awigVar = avrxVar.d;
                avry avryVar = avrxVar.c[i];
                Object objClone = objArr.clone();
                AtomicReferenceArray atomicReferenceArray = awigVar.g;
                long jA = awigVar.a();
                int i3 = awigVar.f;
                long j = 2 + jA;
                z = false;
                if (atomicReferenceArray.get(((int) j) & i3) == null) {
                    int i4 = ((int) jA) & i3;
                    atomicReferenceArray.lazySet(i4 + 1, objClone);
                    atomicReferenceArray.lazySet(i4, avryVar);
                    awigVar.e(j);
                } else {
                    AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(atomicReferenceArray.length());
                    awigVar.g = atomicReferenceArray2;
                    int i5 = ((int) jA) & i3;
                    atomicReferenceArray2.lazySet(i5 + 1, objClone);
                    atomicReferenceArray2.lazySet(i5, avryVar);
                    awigVar.d(atomicReferenceArray, atomicReferenceArray2);
                    atomicReferenceArray.lazySet(i5, awig.b);
                    awigVar.e(j);
                }
            } else {
                z = true;
            }
        }
        if (z) {
            avrxVar.c[i].d();
        } else {
            avrxVar.f();
        }
    }

    @Override // defpackage.axsp
    public final void kn() {
        int i;
        int i2 = this.b;
        avrx avrxVar = this.a;
        synchronized (avrxVar) {
            Object[] objArr = avrxVar.e;
            if (objArr[i2] != null && (i = avrxVar.h + 1) != objArr.length) {
                avrxVar.h = i;
            } else {
                avrxVar.k = true;
                avrxVar.f();
            }
        }
    }
}
