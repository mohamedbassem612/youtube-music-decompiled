package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class j4 extends b4 implements Spliterator.OfInt {
    @Override // j$.util.j0
    public final void forEachRemaining(IntConsumer intConsumer) {
        if (this.h != null || this.i) {
            while (tryAdvance(intConsumer)) {
            }
            return;
        }
        intConsumer.getClass();
        c();
        i4 i4Var = new i4(intConsumer, (byte) 0);
        this.b.s(this.d, i4Var);
        this.i = true;
    }

    @Override // j$.util.j0
    public final boolean tryAdvance(IntConsumer intConsumer) {
        intConsumer.getClass();
        boolean zA = a();
        if (zA) {
            s3 s3Var = (s3) this.h;
            long j = this.g;
            int iW = s3Var.w(j);
            intConsumer.accept((s3Var.b == 0 && iW == 0) ? ((int[]) s3Var.d)[(int) j] : ((int[][]) s3Var.e)[iW][(int) (j - s3Var.c[iW])]);
        }
        return zA;
    }

    @Override // j$.util.stream.b4, j$.util.Spliterator
    public final Spliterator.OfInt trySplit() {
        return (Spliterator.OfInt) super.trySplit();
    }

    @Override // j$.util.stream.b4, j$.util.Spliterator
    public final j$.util.j0 trySplit() {
        return (Spliterator.OfInt) super.trySplit();
    }

    @Override // j$.util.stream.b4, j$.util.Spliterator
    public final Spliterator trySplit() {
        return (Spliterator.OfInt) super.trySplit();
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
