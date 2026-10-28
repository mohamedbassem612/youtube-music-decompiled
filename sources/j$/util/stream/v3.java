package j$.util.stream;

import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.Comparator;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class v3 implements j$.util.j0 {
    public int a;
    public final int b;
    public int c;
    public final int d;
    public Object e;
    public final /* synthetic */ w3 f;

    public v3(w3 w3Var, int i, int i2, int i3, int i4) {
        this.f = w3Var;
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        Object[] objArr = w3Var.e;
        this.e = objArr == null ? w3Var.d : objArr[i];
    }

    public abstract void a(int i, Object obj, Object obj2);

    public j$.util.j0 b(Object obj, int i, int i2) {
        double[] dArr = (double[]) obj;
        int i3 = i2 + i;
        dArr.getClass();
        Spliterators.a(dArr.length, i, i3);
        return new j$.util.s0(dArr, i, i3, 1040);
    }

    public abstract j$.util.j0 c(int i, int i2, int i3, int i4);

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 16464;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        int i = this.a;
        int i2 = this.d;
        int i3 = this.b;
        if (i == i3) {
            return ((long) i2) - ((long) this.c);
        }
        long[] jArr = this.f.c;
        return ((jArr[i3] + ((long) i2)) - jArr[i]) - ((long) this.c);
    }

    @Override // j$.util.j0
    public final void forEachRemaining(Object obj) {
        w3 w3Var;
        obj.getClass();
        int i = this.a;
        int i2 = this.d;
        int i3 = this.b;
        if (i < i3 || (i == i3 && this.c < i2)) {
            int i4 = this.c;
            while (true) {
                w3Var = this.f;
                if (i >= i3) {
                    break;
                }
                Object obj2 = w3Var.e[i];
                w3Var.t(obj2, i4, w3Var.v(obj2), obj);
                i++;
                i4 = 0;
            }
            w3Var.t(this.a == i3 ? this.e : w3Var.e[i3], i4, i2, obj);
            this.a = i3;
            this.c = i2;
        }
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        return Spliterator.CC.$default$getComparator(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return Spliterator.CC.$default$getExactSizeIfKnown(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return Spliterator.CC.$default$hasCharacteristics(this, i);
    }

    @Override // j$.util.j0
    public final boolean tryAdvance(Object obj) {
        obj.getClass();
        int i = this.a;
        int i2 = this.b;
        if (i >= i2 && (i != i2 || this.c >= this.d)) {
            return false;
        }
        Object obj2 = this.e;
        int i3 = this.c;
        this.c = i3 + 1;
        a(i3, obj2, obj);
        int i4 = this.c;
        Object obj3 = this.e;
        w3 w3Var = this.f;
        if (i4 == w3Var.v(obj3)) {
            this.c = 0;
            int i5 = this.a + 1;
            this.a = i5;
            Object[] objArr = w3Var.e;
            if (objArr != null && i5 <= i2) {
                this.e = objArr[i5];
            }
        }
        return true;
    }

    @Override // j$.util.Spliterator
    public final j$.util.j0 trySplit() {
        int i = this.a;
        int i2 = this.b;
        if (i < i2) {
            int i3 = i2 - 1;
            int i4 = this.c;
            w3 w3Var = this.f;
            j$.util.j0 j0VarC = c(i, i3, i4, w3Var.v(w3Var.e[i3]));
            this.a = i2;
            this.c = 0;
            this.e = w3Var.e[i2];
            return j0VarC;
        }
        if (i == i2) {
            int i5 = this.c;
            int i6 = (this.d - i5) / 2;
            if (i6 != 0) {
                j$.util.j0 j0VarB = b(this.e, i5, i6);
                this.c += i6;
                return j0VarB;
            }
        }
        return null;
    }

    public final /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((Object) intConsumer);
    }

    public final /* bridge */ /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        forEachRemaining((Object) longConsumer);
    }

    public final /* bridge */ /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        forEachRemaining((Object) doubleConsumer);
    }

    public final /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return tryAdvance((Object) intConsumer);
    }

    public final /* bridge */ /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        return tryAdvance((Object) longConsumer);
    }

    public final /* bridge */ /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
        return tryAdvance((Object) doubleConsumer);
    }

    @Override // j$.util.j0, j$.util.Spliterator
    public final /* bridge */ /* synthetic */ Spliterator.OfInt trySplit() {
        return (Spliterator.OfInt) trySplit();
    }

    @Override // j$.util.j0, j$.util.Spliterator
    public final /* bridge */ /* synthetic */ Spliterator.OfLong trySplit() {
        return (Spliterator.OfLong) trySplit();
    }

    @Override // j$.util.j0, j$.util.Spliterator
    public final /* bridge */ /* synthetic */ j$.util.c0 trySplit() {
        return (j$.util.c0) trySplit();
    }
}
