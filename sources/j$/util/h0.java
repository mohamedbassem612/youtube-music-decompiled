package j$.util;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class h0 implements j0 {
    public final /* synthetic */ java.util.Spliterator.OfPrimitive a;

    public /* synthetic */ h0(java.util.Spliterator.OfPrimitive ofPrimitive) {
        this.a = ofPrimitive;
    }

    public static /* synthetic */ j0 a(java.util.Spliterator.OfPrimitive ofPrimitive) {
        j0 h0Var;
        if (ofPrimitive == null) {
            return null;
        }
        if (ofPrimitive instanceof i0) {
            return ((i0) ofPrimitive).a;
        }
        if (ofPrimitive instanceof java.util.Spliterator.OfDouble) {
            java.util.Spliterator.OfDouble ofDouble = (java.util.Spliterator.OfDouble) ofPrimitive;
            if (ofDouble instanceof b0) {
                return ((b0) ofDouble).a;
            }
            h0Var = new a0(ofDouble);
        } else if (ofPrimitive instanceof java.util.Spliterator.OfInt) {
            java.util.Spliterator.OfInt ofInt = (java.util.Spliterator.OfInt) ofPrimitive;
            if (ofInt instanceof e0) {
                return ((e0) ofInt).a;
            }
            h0Var = new d0(ofInt);
        } else if (ofPrimitive instanceof java.util.Spliterator.OfLong) {
            java.util.Spliterator.OfLong ofLong = (java.util.Spliterator.OfLong) ofPrimitive;
            if (ofLong instanceof g0) {
                return ((g0) ofLong).a;
            }
            h0Var = new f0(ofLong);
        } else {
            h0Var = new h0(ofPrimitive);
        }
        return h0Var;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        java.util.Spliterator.OfPrimitive ofPrimitive = this.a;
        if (obj instanceof h0) {
            obj = ((h0) obj).a;
        }
        return ofPrimitive.equals(obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.a.estimateSize();
    }

    @Override // j$.util.j0
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.a.forEachRemaining(obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        return this.a.getComparator();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.a.getExactSizeIfKnown();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return this.a.hasCharacteristics(i);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.util.j0
    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return this.a.tryAdvance(obj);
    }

    @Override // j$.util.j0, j$.util.Spliterator
    public final /* synthetic */ j0 trySplit() {
        return a(this.a.trySplit());
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.a.forEachRemaining(consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.a.tryAdvance(consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ Spliterator trySplit() {
        return k0.a(this.a.trySplit());
    }
}
