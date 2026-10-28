package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.concurrent.ForkJoinPool;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class d extends CountedCompleter {
    public static final int g = ForkJoinPool.getCommonPoolParallelism() << 2;
    public final a a;
    public Spliterator b;
    public long c;
    public d d;
    public d e;
    public Object f;

    public d(d dVar, Spliterator spliterator) {
        super(dVar);
        this.b = spliterator;
        this.a = dVar.a;
        this.c = dVar.c;
    }

    public static long g(long j) {
        long j2 = j / ((long) g);
        if (j2 <= 0) {
            return 1L;
        }
        return j2;
    }

    public abstract Object a();

    public final d b() {
        return (d) getCompleter();
    }

    public final boolean c() {
        while (this != null) {
            d dVar = (d) this.getCompleter();
            if (dVar != null && dVar.d != this) {
                return false;
            }
            this = dVar;
        }
        return true;
    }

    @Override // java.util.concurrent.CountedCompleter
    public void compute() {
        Spliterator spliteratorTrySplit;
        Spliterator spliterator = this.b;
        long jEstimateSize = spliterator.estimateSize();
        long jG = this.c;
        if (jG == 0) {
            jG = g(jEstimateSize);
            this.c = jG;
        }
        boolean z = false;
        while (jEstimateSize > jG && (spliteratorTrySplit = spliterator.trySplit()) != null) {
            d dVarE = this.e(spliteratorTrySplit);
            this.d = dVarE;
            d dVarE2 = this.e(spliterator);
            this.e = dVarE2;
            this.setPendingCount(1);
            if (z) {
                spliterator = spliteratorTrySplit;
                this = dVarE;
                dVarE = dVarE2;
            } else {
                this = dVarE2;
            }
            z = !z;
            dVarE.fork();
            jEstimateSize = spliterator.estimateSize();
        }
        this.f(this.a());
        this.tryComplete();
    }

    public final boolean d() {
        return ((d) getCompleter()) == null;
    }

    public abstract d e(Spliterator spliterator);

    public void f(Object obj) {
        this.f = obj;
    }

    @Override // java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public Object getRawResult() {
        return this.f;
    }

    @Override // java.util.concurrent.CountedCompleter
    public void onCompletion(CountedCompleter countedCompleter) {
        this.b = null;
        this.e = null;
        this.d = null;
    }

    @Override // java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public final void setRawResult(Object obj) {
        if (obj != null) {
            throw new IllegalStateException();
        }
    }

    public d(a aVar, Spliterator spliterator) {
        super(null);
        this.a = aVar;
        this.b = spliterator;
        this.c = 0L;
    }
}
