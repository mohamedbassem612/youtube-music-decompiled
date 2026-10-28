package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.IntConsumer$CC;
import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public class s3 extends w3 implements IntConsumer {
    @Override // java.lang.Iterable, j$.lang.a, j$.util.Collection
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public Spliterator.OfInt spliterator() {
        return new r3(this, 0, this.b, 0, this.a);
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        z();
        int[] iArr = (int[]) this.d;
        int i2 = this.a;
        this.a = i2 + 1;
        iArr[i2] = i;
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // java.lang.Iterable, j$.lang.a
    public final void forEach(Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            e((IntConsumer) consumer);
        } else {
            if (c5.a) {
                c5.a(getClass(), "{0} calling SpinedBuffer.OfInt.forEach(Consumer)");
                throw null;
            }
            j$.desugar.sun.nio.fs.g.h((r3) spliterator(), consumer);
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new j$.util.n0(spliterator());
    }

    @Override // j$.util.stream.w3, j$.util.stream.s0
    public final Object newArray(int i) {
        return new int[i];
    }

    @Override // j$.util.stream.w3
    public final void t(Object obj, int i, int i2, Object obj2) {
        int[] iArr = (int[]) obj;
        IntConsumer intConsumer = (IntConsumer) obj2;
        while (i < i2) {
            intConsumer.accept(iArr[i]);
            i++;
        }
    }

    public final String toString() {
        int[] iArr = (int[]) b();
        if (iArr.length < 200) {
            return String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), Integer.valueOf(iArr.length), Integer.valueOf(this.b), Arrays.toString(iArr));
        }
        return String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), Integer.valueOf(iArr.length), Integer.valueOf(this.b), Arrays.toString(Arrays.copyOf(iArr, 200)));
    }

    @Override // j$.util.stream.w3
    public final int v(Object obj) {
        return ((int[]) obj).length;
    }

    @Override // j$.util.stream.w3
    public final Object[] y() {
        return new int[8][];
    }
}
