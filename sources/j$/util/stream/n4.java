package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class n4 extends p4 implements Spliterator.OfInt {
    @Override // j$.util.stream.r4
    public final Spliterator a(Spliterator spliterator, long j, long j2, long j3, long j4) {
        return new n4((Spliterator.OfInt) spliterator, j, j2, j3, j4);
    }

    @Override // j$.util.stream.p4
    public final Object b() {
        return new o0((byte) 1);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.desugar.sun.nio.fs.g.h(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.desugar.sun.nio.fs.g.v(this, consumer);
    }
}
