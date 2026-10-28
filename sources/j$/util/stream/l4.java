package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class l4 extends b4 implements Spliterator.OfLong {
    @Override // j$.util.stream.b4
    public final void d() {
        u3 u3Var = new u3();
        this.h = u3Var;
        this.e = this.b.t(new k4(u3Var, (byte) 1));
        this.f = new j$.desugar.sun.nio.fs.h((byte) 15, this);
    }

    @Override // j$.util.stream.b4
    public final b4 e(Spliterator spliterator) {
        return new l4(this.b, spliterator, this.a);
    }

    @Override // j$.util.j0
    public final void forEachRemaining(LongConsumer longConsumer) {
        if (this.h != null || this.i) {
            while (tryAdvance(longConsumer)) {
            }
            return;
        }
        longConsumer.getClass();
        c();
        k4 k4Var = new k4(longConsumer, (byte) 0);
        this.b.s(this.d, k4Var);
        this.i = true;
    }

    @Override // j$.util.j0
    public final boolean tryAdvance(LongConsumer longConsumer) {
        longConsumer.getClass();
        boolean zA = a();
        if (zA) {
            u3 u3Var = (u3) this.h;
            long j = this.g;
            int iW = u3Var.w(j);
            longConsumer.accept((u3Var.b == 0 && iW == 0) ? ((long[]) u3Var.d)[(int) j] : ((long[][]) u3Var.e)[iW][(int) (j - u3Var.c[iW])]);
        }
        return zA;
    }

    @Override // j$.util.stream.b4, j$.util.Spliterator
    public final Spliterator.OfLong trySplit() {
        return (Spliterator.OfLong) super.trySplit();
    }

    @Override // j$.util.stream.b4, j$.util.Spliterator
    public final j$.util.j0 trySplit() {
        return (Spliterator.OfLong) super.trySplit();
    }

    @Override // j$.util.stream.b4, j$.util.Spliterator
    public final Spliterator trySplit() {
        return (Spliterator.OfLong) super.trySplit();
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
