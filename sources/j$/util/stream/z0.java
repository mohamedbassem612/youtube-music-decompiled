package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.function.BinaryOperator;
import java.util.function.LongFunction;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public class z0 extends d {
    public final a h;
    public final LongFunction i;
    public final BinaryOperator j;

    public z0(z0 z0Var, Spliterator spliterator) {
        super(z0Var, spliterator);
        this.h = z0Var.h;
        this.i = z0Var.i;
        this.j = z0Var.j;
    }

    @Override // j$.util.stream.d
    public final Object a() {
        l0 l0Var = (l0) this.i.apply(this.h.g(this.b));
        this.h.s(this.b, l0Var);
        return l0Var.build();
    }

    @Override // j$.util.stream.d
    public final d e(Spliterator spliterator) {
        return new z0(this, spliterator);
    }

    @Override // j$.util.stream.d, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        d dVar = this.d;
        if (dVar != null) {
            this.f = (t0) this.j.apply((t0) ((z0) dVar).f, (t0) ((z0) this.e).f);
        }
        super.onCompletion(countedCompleter);
    }

    public z0(a aVar, Spliterator spliterator, LongFunction longFunction, BinaryOperator binaryOperator) {
        super(aVar, spliterator);
        this.h = aVar;
        this.i = longFunction;
        this.j = binaryOperator;
    }
}
