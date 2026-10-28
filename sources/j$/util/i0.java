package j$.util;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class i0 implements java.util.Spliterator.OfPrimitive {
    public final /* synthetic */ j0 a;

    public /* synthetic */ i0(j0 j0Var) {
        this.a = j0Var;
    }

    public static /* synthetic */ java.util.Spliterator.OfPrimitive a(j0 j0Var) {
        java.util.Spliterator.OfPrimitive i0Var;
        if (j0Var == null) {
            return null;
        }
        if (j0Var instanceof h0) {
            return ((h0) j0Var).a;
        }
        if (j0Var instanceof c0) {
            c0 c0Var = (c0) j0Var;
            if (c0Var instanceof a0) {
                return ((a0) c0Var).a;
            }
            i0Var = new b0(c0Var);
        } else if (j0Var instanceof Spliterator.OfInt) {
            Spliterator.OfInt ofInt = (Spliterator.OfInt) j0Var;
            if (ofInt instanceof d0) {
                return ((d0) ofInt).a;
            }
            i0Var = new e0(ofInt);
        } else if (j0Var instanceof Spliterator.OfLong) {
            Spliterator.OfLong ofLong = (Spliterator.OfLong) j0Var;
            if (ofLong instanceof f0) {
                return ((f0) ofLong).a;
            }
            i0Var = new g0(ofLong);
        } else {
            i0Var = new i0(j0Var);
        }
        return i0Var;
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        j0 j0Var = this.a;
        if (obj instanceof i0) {
            obj = ((i0) obj).a;
        }
        return j0Var.equals(obj);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.a.estimateSize();
    }

    @Override // java.util.Spliterator.OfPrimitive
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.a.forEachRemaining(obj);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        return this.a.getComparator();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.a.getExactSizeIfKnown();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return this.a.hasCharacteristics(i);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.util.Spliterator.OfPrimitive
    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return this.a.tryAdvance(obj);
    }

    @Override // java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ java.util.Spliterator.OfPrimitive trySplit() {
        return a(this.a.trySplit());
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.a.forEachRemaining(consumer);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.a.tryAdvance(consumer);
    }

    @Override // java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ java.util.Spliterator trySplit() {
        return l0.a(this.a.trySplit());
    }
}
