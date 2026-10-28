package j$.util.stream;

import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class t3 extends v3 implements Spliterator.OfLong {
    public final /* synthetic */ u3 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3(u3 u3Var, int i, int i2, int i3, int i4) {
        super(u3Var, i, i2, i3, i4);
        this.g = u3Var;
    }

    @Override // j$.util.stream.v3
    public final void a(int i, Object obj, Object obj2) {
        ((LongConsumer) obj2).accept(((long[]) obj)[i]);
    }

    @Override // j$.util.stream.v3
    public final j$.util.j0 b(Object obj, int i, int i2) {
        return Spliterators.spliterator((long[]) obj, i, i2 + i, 1040);
    }

    @Override // j$.util.stream.v3
    public final j$.util.j0 c(int i, int i2, int i3, int i4) {
        return new t3(this.g, i, i2, i3, i4);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.desugar.sun.nio.fs.g.i(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.desugar.sun.nio.fs.g.w(this, consumer);
    }
}
