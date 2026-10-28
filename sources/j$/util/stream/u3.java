package j$.util.stream;

import j$.util.Spliterator;
import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public class u3 extends w3 implements LongConsumer {
    @Override // java.lang.Iterable, j$.lang.a, j$.util.Collection
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public Spliterator.OfLong spliterator() {
        return new t3(this, 0, this.b, 0, this.a);
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j) {
        z();
        long[] jArr = (long[]) this.d;
        int i = this.a;
        this.a = i + 1;
        jArr[i] = j;
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.desugar.sun.nio.fs.g.c(this, longConsumer);
    }

    @Override // java.lang.Iterable, j$.lang.a
    public final void forEach(Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            e((LongConsumer) consumer);
        } else {
            if (c5.a) {
                c5.a(getClass(), "{0} calling SpinedBuffer.OfLong.forEach(Consumer)");
                throw null;
            }
            j$.desugar.sun.nio.fs.g.i((t3) spliterator(), consumer);
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new j$.util.o0(spliterator());
    }

    @Override // j$.util.stream.w3
    public final void t(Object obj, int i, int i2, Object obj2) {
        long[] jArr = (long[]) obj;
        LongConsumer longConsumer = (LongConsumer) obj2;
        while (i < i2) {
            longConsumer.accept(jArr[i]);
            i++;
        }
    }

    public final String toString() {
        long[] jArr = (long[]) b();
        if (jArr.length < 200) {
            return String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), Integer.valueOf(jArr.length), Integer.valueOf(this.b), Arrays.toString(jArr));
        }
        return String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), Integer.valueOf(jArr.length), Integer.valueOf(this.b), Arrays.toString(Arrays.copyOf(jArr, 200)));
    }
}
