package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class b extends d {
    public final AtomicReference h;
    public volatile boolean i;

    public b(a aVar, Spliterator spliterator) {
        super(aVar, spliterator);
        this.h = new AtomicReference(null);
    }

    @Override // j$.util.stream.d, java.util.concurrent.CountedCompleter
    public final void compute() {
        Object objJ;
        Spliterator spliteratorTrySplit;
        Spliterator spliterator = this.b;
        long jEstimateSize = spliterator.estimateSize();
        long jG = this.c;
        if (jG == 0) {
            jG = d.g(jEstimateSize);
            this.c = jG;
        }
        AtomicReference atomicReference = this.h;
        boolean z = false;
        while (true) {
            objJ = atomicReference.get();
            if (objJ != null) {
                break;
            }
            boolean z2 = this.i;
            if (!z2) {
                CountedCompleter<?> completer = this.getCompleter();
                while (true) {
                    b bVar = (b) ((d) completer);
                    if (z2 || bVar == null) {
                        break;
                    }
                    z2 = bVar.i;
                    completer = bVar.getCompleter();
                }
            }
            if (z2) {
                objJ = this.j();
                break;
            }
            if (jEstimateSize <= jG || (spliteratorTrySplit = spliterator.trySplit()) == null) {
                objJ = this.a();
                break;
            }
            b bVar2 = (b) this.e(spliteratorTrySplit);
            this.d = bVar2;
            b bVar3 = (b) this.e(spliterator);
            this.e = bVar3;
            this.setPendingCount(1);
            if (z) {
                spliterator = spliteratorTrySplit;
                this = bVar2;
                bVar2 = bVar3;
            } else {
                this = bVar3;
            }
            z = !z;
            bVar2.fork();
            jEstimateSize = spliterator.estimateSize();
        }
        this.f(objJ);
        this.tryComplete();
    }

    @Override // j$.util.stream.d
    public final void f(Object obj) {
        if (!d()) {
            this.f = obj;
        } else if (obj != null) {
            j$.desugar.sun.nio.fs.g.E(this.h, null, obj);
        }
    }

    @Override // j$.util.stream.d, java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public final Object getRawResult() {
        return k();
    }

    public void h() {
        this.i = true;
    }

    public final void i() {
        d dVarB = b();
        while (true) {
            b bVar = (b) dVarB;
            b bVar2 = this;
            this = bVar;
            if (this == null) {
                return;
            }
            if (this.d == bVar2) {
                b bVar3 = (b) this.e;
                if (!bVar3.i) {
                    bVar3.h();
                }
            }
            dVarB = this.b();
        }
    }

    public abstract Object j();

    public final Object k() {
        if (!d()) {
            return this.f;
        }
        Object obj = this.h.get();
        return obj == null ? j() : obj;
    }

    public b(b bVar, Spliterator spliterator) {
        super(bVar, spliterator);
        this.h = bVar.h;
    }
}
