package j$.util.stream;

import j$.util.Spliterator;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountedCompleter;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class v extends CountedCompleter {
    public final a a;
    public Spliterator b;
    public final long c;
    public final ConcurrentHashMap d;
    public final u e;
    public final v f;
    public t0 g;

    public v(a aVar, Spliterator spliterator, u uVar) {
        super(null);
        this.a = aVar;
        this.b = spliterator;
        this.c = d.g(spliterator.estimateSize());
        this.d = new ConcurrentHashMap(Math.max(16, d.g << 1));
        this.e = uVar;
        this.f = null;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator spliteratorTrySplit;
        Spliterator spliterator = this.b;
        long j = this.c;
        boolean z = false;
        while (spliterator.estimateSize() > j && (spliteratorTrySplit = spliterator.trySplit()) != null) {
            v vVar = new v(this, spliteratorTrySplit, this.f);
            v vVar2 = new v(this, spliterator, vVar);
            this.addToPendingCount(1);
            vVar2.addToPendingCount(1);
            this.d.put(vVar, vVar2);
            if (this.f != null) {
                vVar.addToPendingCount(1);
                if (this.d.replace(this.f, this, vVar)) {
                    this.addToPendingCount(-1);
                } else {
                    vVar.addToPendingCount(-1);
                }
            }
            if (z) {
                spliterator = spliteratorTrySplit;
                this = vVar;
                vVar = vVar2;
            } else {
                this = vVar2;
            }
            z = !z;
            vVar.fork();
        }
        if (this.getPendingCount() > 0) {
            n nVar = new n((byte) 6);
            a aVar = this.a;
            l0 l0VarK = aVar.k(aVar.g(spliterator), nVar);
            this.a.s(spliterator, l0VarK);
            this.g = l0VarK.build();
            this.b = null;
        }
        this.tryComplete();
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        t0 t0Var = this.g;
        if (t0Var != null) {
            t0Var.forEach(this.e);
            this.g = null;
        } else {
            Spliterator spliterator = this.b;
            if (spliterator != null) {
                this.a.s(spliterator, this.e);
                this.b = null;
            }
        }
        v vVar = (v) this.d.remove(this);
        if (vVar != null) {
            vVar.tryComplete();
        }
    }

    public v(v vVar, Spliterator spliterator, v vVar2) {
        super(vVar);
        this.a = vVar.a;
        this.b = spliterator;
        this.c = vVar.c;
        this.d = vVar.d;
        this.e = vVar.e;
        this.f = vVar2;
    }
}
