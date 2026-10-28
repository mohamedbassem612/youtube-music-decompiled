package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class x1 extends w1 implements k0 {
    @Override // j$.util.stream.f3
    public final /* synthetic */ void B(Long l) {
        i2.g(this, l);
    }

    @Override // j$.util.stream.g3
    public final void accept(long j) {
        int i = this.b;
        long[] jArr = this.a;
        if (i >= jArr.length) {
            j$.time.g.d("Accept exceeded fixed size of %d", new Object[]{Integer.valueOf(jArr.length)});
        } else {
            this.b = i + 1;
            jArr[i] = j;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.k0, j$.util.stream.l0
    public final r0 build() {
        int i = this.b;
        long[] jArr = this.a;
        if (i >= jArr.length) {
            return this;
        }
        j$.time.g.d("Current size %d is less than fixed size %d", new Object[]{Integer.valueOf(i), Integer.valueOf(jArr.length)});
        return null;
    }

    @Override // j$.util.stream.g3
    public final void end() {
        int i = this.b;
        long[] jArr = this.a;
        if (i < jArr.length) {
            j$.time.g.d("End size %d is less than fixed size %d", new Object[]{Integer.valueOf(i), Integer.valueOf(jArr.length)});
        }
    }

    @Override // j$.util.stream.g3
    public final void p(long j) {
        long[] jArr = this.a;
        if (j == jArr.length) {
            this.b = 0;
        } else {
            j$.time.g.d("Begin size %d is not equal to fixed size %d", new Object[]{Long.valueOf(j), Integer.valueOf(jArr.length)});
        }
    }

    @Override // j$.util.stream.g3
    public final boolean s() {
        return false;
    }

    @Override // j$.util.stream.w1
    public final String toString() {
        long[] jArr = this.a;
        return String.format("LongFixedNodeBuilder[%d][%s]", Integer.valueOf(jArr.length - this.b), Arrays.toString(jArr));
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.desugar.sun.nio.fs.g.c(this, longConsumer);
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void r(Object obj) {
        B((Long) obj);
    }

    @Override // j$.util.stream.g3
    public final /* synthetic */ void accept(int i) {
        i2.d();
        throw null;
    }

    @Override // j$.util.stream.l0
    public final /* bridge */ /* synthetic */ t0 build() {
        build();
        return this;
    }
}
