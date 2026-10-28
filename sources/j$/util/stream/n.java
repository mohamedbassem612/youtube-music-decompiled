package j$.util.stream;

import j$.util.Optional;
import j$.util.OptionalInt;
import j$.util.function.BiConsumer$CC;
import j$.util.function.BiFunction$CC;
import j$.util.function.Consumer$CC;
import j$.util.function.Predicate$CC;
import java.util.LinkedHashSet;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.IntFunction;
import java.util.function.LongBinaryOperator;
import java.util.function.LongFunction;
import java.util.function.ObjLongConsumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class n implements BiConsumer, Predicate, Supplier, IntFunction, IntBinaryOperator, ObjLongConsumer, LongBinaryOperator, Consumer, LongFunction, BinaryOperator {
    public final /* synthetic */ byte a;

    public /* synthetic */ n(byte b) {
        this.a = b;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((LinkedHashSet) obj).add(obj2);
                break;
            case 1:
                ((LinkedHashSet) obj).addAll((LinkedHashSet) obj2);
                break;
            default:
                long[] jArr = (long[]) obj;
                long[] jArr2 = (long[]) obj2;
                jArr[0] = jArr[0] + jArr2[0];
                jArr[1] = jArr[1] + jArr2[1];
                break;
        }
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.a) {
            case 2:
                break;
            default:
                break;
        }
        return Predicate$CC.$default$and(this, predicate);
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        switch (this.a) {
            case 20:
                break;
            case 21:
            default:
                break;
            case 22:
                break;
        }
        return BiFunction$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        switch (this.a) {
            case 20:
                return new b1((p0) obj, (p0) obj2);
            case 21:
            default:
                return new e1((t0) obj, (t0) obj2);
            case 22:
                return new c1((r0) obj, (r0) obj2);
        }
    }

    @Override // java.util.function.IntBinaryOperator
    public final int applyAsInt(int i, int i2) {
        switch (this.a) {
            case 8:
                return i + i2;
            default:
                return Math.max(i, i2);
        }
    }

    @Override // java.util.function.LongBinaryOperator
    public final long applyAsLong(long j, long j2) {
        switch (this.a) {
            case 14:
                return Math.max(j, j2);
            case 15:
                return j + j2;
            default:
                return Math.min(j, j2);
        }
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.a) {
            case 3:
                return new q();
            case 4:
            default:
                return new long[2];
            case 5:
                return new r();
        }
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public final /* synthetic */ Predicate mo841negate() {
        switch (this.a) {
            case 2:
                break;
            default:
                break;
        }
        return Predicate$CC.$default$negate(this);
    }

    public final /* synthetic */ Predicate or(Predicate predicate) {
        switch (this.a) {
            case 2:
                break;
            default:
                break;
        }
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.a) {
            case 2:
                return ((OptionalInt) obj).isPresent();
            default:
                return ((Optional) obj).isPresent();
        }
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            default:
                break;
        }
        return BiConsumer$CC.$default$andThen(this, biConsumer);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.a) {
            case 17:
                break;
            case 25:
                break;
            default:
                break;
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // java.util.function.IntFunction
    public final Object apply(int i) {
        switch (this.a) {
            case 6:
                return new Object[i];
            case 7:
                return new Integer[i];
            case 10:
                return Integer.valueOf(i);
            case 18:
                return new Object[i];
            default:
                return new Object[i];
        }
    }

    @Override // java.util.function.ObjLongConsumer
    public final void accept(Object obj, long j) {
        long[] jArr = (long[]) obj;
        jArr[0] = jArr[0] + 1;
        jArr[1] = jArr[1] + j;
    }

    @Override // java.util.function.LongFunction
    public final Object apply(long j) {
        switch (this.a) {
            case 19:
                return i2.z(j);
            default:
                return i2.A(j);
        }
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        byte b = this.a;
    }

    private final void accept$j$$util$stream$Node$0(Object obj) {
    }

    private final void accept$j$$util$stream$StreamSpliterators$SliceSpliterator$OfRef$0(Object obj) {
    }

    private final void accept$j$$util$stream$StreamSpliterators$SliceSpliterator$OfRef$1(Object obj) {
    }
}
