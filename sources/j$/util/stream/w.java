package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class w extends CountedCompleter {
    public Spliterator a;
    public final g3 b;
    public final a c;
    public long d;

    public w(w wVar, Spliterator spliterator) {
        super(wVar);
        this.a = spliterator;
        this.b = wVar.b;
        this.d = wVar.d;
        this.c = wVar.c;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator spliteratorTrySplit;
        Spliterator spliterator = this.a;
        long jEstimateSize = spliterator.estimateSize();
        long jG = this.d;
        if (jG == 0) {
            jG = d.g(jEstimateSize);
            this.d = jG;
        }
        boolean zP = z3.SHORT_CIRCUIT.p(this.c.f);
        g3 g3Var = this.b;
        boolean z = false;
        while (true) {
            if (zP && g3Var.s()) {
                break;
            }
            if (jEstimateSize <= jG || (spliteratorTrySplit = spliterator.trySplit()) == null) {
                this.c.a(spliterator, g3Var);
                break;
            }
            w wVar = new w(this, spliteratorTrySplit);
            this.addToPendingCount(1);
            if (z) {
                spliterator = spliteratorTrySplit;
            } else {
                wVar = this;
                this = wVar;
            }
            z = !z;
            this.fork();
            this = wVar;
            jEstimateSize = spliterator.estimateSize();
        }
        this.a = null;
        this.propagateCompletion();
    }

    public w(a aVar, Spliterator spliterator, g3 g3Var) {
        super(null);
        this.b = g3Var;
        this.c = aVar;
        this.a = spliterator;
        this.d = 0L;
    }
}
