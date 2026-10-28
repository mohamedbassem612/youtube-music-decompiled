package j$.util.stream;

import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class q3 extends v3 implements j$.util.c0 {
    public final /* synthetic */ g1 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3(g1 g1Var, int i, int i2, int i3, int i4) {
        super(g1Var, i, i2, i3, i4);
        this.g = g1Var;
    }

    @Override // j$.util.stream.v3
    public final void a(int i, Object obj, Object obj2) {
        ((DoubleConsumer) obj2).accept(((double[]) obj)[i]);
    }

    @Override // j$.util.stream.v3
    public final j$.util.j0 c(int i, int i2, int i3, int i4) {
        return new q3(this.g, i, i2, i3, i4);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.desugar.sun.nio.fs.g.g(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.desugar.sun.nio.fs.g.u(this, consumer);
    }
}
