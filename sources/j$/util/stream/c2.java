package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.concurrent.CountedCompleter;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class c2 extends CountedCompleter implements g3 {
    public final Spliterator a;
    public final a b;
    public final long c;
    public final long d;
    public final long e;
    public int f;
    public int g;

    public c2(c2 c2Var, Spliterator spliterator, long j, long j2, int i) {
        super(c2Var);
        this.a = spliterator;
        this.b = c2Var.b;
        this.c = c2Var.c;
        this.d = j;
        this.e = j2;
        if (j < 0 || j2 < 0 || (j + j2) - 1 >= i) {
            throw new IllegalArgumentException(String.format("offset and length interval [%d, %d + %d) is not within array size interval [0, %d)", Long.valueOf(j), Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i)));
        }
    }

    public abstract c2 a(Spliterator spliterator, long j, long j2);

    @Override // j$.util.stream.g3
    public /* synthetic */ void accept(int i) {
        i2.d();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator spliteratorTrySplit;
        Spliterator spliterator = this.a;
        c2 c2VarA = this;
        while (spliterator.estimateSize() > c2VarA.c && (spliteratorTrySplit = spliterator.trySplit()) != null) {
            c2VarA.setPendingCount(1);
            long jEstimateSize = spliteratorTrySplit.estimateSize();
            c2VarA.a(spliteratorTrySplit, c2VarA.d, jEstimateSize).fork();
            c2VarA = c2VarA.a(spliterator, c2VarA.d + jEstimateSize, c2VarA.e - jEstimateSize);
        }
        c2VarA.b.s(spliterator, c2VarA);
        c2VarA.propagateCompletion();
    }

    @Override // j$.util.stream.g3
    public final void p(long j) {
        long j2 = this.e;
        if (j > j2) {
            throw new IllegalStateException("size passed to Sink.begin exceeds array length");
        }
        int i = (int) this.d;
        this.f = i;
        this.g = i + ((int) j2);
    }

    @Override // j$.util.stream.g3
    public final boolean s() {
        return false;
    }

    public /* synthetic */ void accept(long j) {
        i2.i();
        throw null;
    }

    public c2(Spliterator spliterator, a aVar, int i) {
        this.a = spliterator;
        this.b = aVar;
        this.c = d.g(spliterator.estimateSize());
        this.d = 0L;
        this.e = i;
    }

    @Override // j$.util.stream.g3
    public final void end() {
    }
}
