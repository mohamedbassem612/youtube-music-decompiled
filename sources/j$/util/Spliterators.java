package j$.util;

import app.rive.semantics.SemanticState;
import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class Spliterators {
    public static final w0 a = new w0();
    public static final u0 b = new u0();
    public static final v0 c = new v0();
    public static final t0 d = new t0();

    /* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
    public static abstract class AbstractSpliterator<T> implements Spliterator<T> {
        public final int a;
        public long b;
        public int c;

        public AbstractSpliterator(long j, int i) {
            this.b = j;
            this.a = (i & 64) != 0 ? i | 16384 : i;
        }

        @Override // j$.util.Spliterator
        public final int characteristics() {
            return this.a;
        }

        @Override // j$.util.Spliterator
        public final long estimateSize() {
            return this.b;
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            Spliterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ Comparator getComparator() {
            return Spliterator.CC.$default$getComparator(this);
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ long getExactSizeIfKnown() {
            return Spliterator.CC.$default$getExactSizeIfKnown(this);
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ boolean hasCharacteristics(int i) {
            return Spliterator.CC.$default$hasCharacteristics(this, i);
        }

        @Override // j$.util.Spliterator
        public final Spliterator trySplit() {
            q0 q0Var = new q0();
            long j = this.b;
            if (j <= 1 || !tryAdvance(q0Var)) {
                return null;
            }
            int i = this.c + SemanticState.ReadOnly;
            if (i > j) {
                i = (int) j;
            }
            if (i > 33554432) {
                i = 33554432;
            }
            Object[] objArr = new Object[i];
            int i2 = 0;
            do {
                objArr[i2] = q0Var.a;
                i2++;
                if (i2 >= i) {
                    break;
                }
            } while (tryAdvance(q0Var));
            this.c = i2;
            long j2 = this.b;
            if (j2 != Long.MAX_VALUE) {
                this.b = j2 - ((long) i2);
            }
            return new r0(objArr, 0, i2, this.a);
        }
    }

    public static void a(int i, int i2, int i3) {
        if (i2 <= i3) {
            if (i2 < 0) {
                throw new ArrayIndexOutOfBoundsException(i2);
            }
            if (i3 > i) {
                throw new ArrayIndexOutOfBoundsException(i3);
            }
            return;
        }
        throw new ArrayIndexOutOfBoundsException("origin(" + i2 + ") > fence(" + i3 + ")");
    }

    public static r0 b(Object[] objArr, int i, int i2, int i3) {
        objArr.getClass();
        a(objArr.length, i, i2);
        return new r0(objArr, i, i2, i3);
    }

    public static Spliterator.OfInt spliterator(int[] iArr, int i, int i2, int i3) {
        iArr.getClass();
        a(iArr.length, i, i2);
        return new x0(iArr, i, i2, i3);
    }

    public static Spliterator.OfLong spliterator(long[] jArr, int i, int i2, int i3) {
        jArr.getClass();
        a(jArr.length, i, i2);
        return new z0(jArr, i, i2, i3);
    }

    public static <T> Spliterator<T> spliterator(java.util.Collection<? extends T> collection, int i) {
        collection.getClass();
        return new y0(collection, i);
    }
}
