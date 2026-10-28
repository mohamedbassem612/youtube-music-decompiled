package j$.util.stream;

import j$.util.Spliterator;
import java.util.ArrayDeque;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class v1 implements Spliterator {
    public t0 a;
    public int b;
    public Spliterator c;
    public Spliterator d;
    public ArrayDeque e;

    public v1(v0 v0Var) {
        this.a = v0Var;
    }

    public static t0 a(ArrayDeque arrayDeque) {
        while (true) {
            t0 t0Var = (t0) arrayDeque.pollFirst();
            if (t0Var == null) {
                return null;
            }
            if (t0Var.l() != 0) {
                for (int iL = t0Var.l() - 1; iL >= 0; iL--) {
                    arrayDeque.addFirst(t0Var.a(iL));
                }
            } else if (t0Var.count() > 0) {
                return t0Var;
            }
        }
    }

    public final ArrayDeque b() {
        ArrayDeque arrayDeque = new ArrayDeque(8);
        int iL = this.a.l();
        while (true) {
            iL--;
            if (iL < this.b) {
                return arrayDeque;
            }
            arrayDeque.addFirst(this.a.a(iL));
        }
    }

    public final boolean c() {
        if (this.a == null) {
            return false;
        }
        if (this.d == null) {
            Spliterator spliterator = this.c;
            if (spliterator == null) {
                ArrayDeque arrayDequeB = b();
                this.e = arrayDequeB;
                t0 t0VarA = a(arrayDequeB);
                if (t0VarA == null) {
                    this.a = null;
                    return false;
                }
                this.d = t0VarA.spliterator();
            } else {
                this.d = spliterator;
            }
        }
        return true;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 64;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        long jCount = 0;
        if (this.a == null) {
            return 0L;
        }
        Spliterator spliterator = this.c;
        if (spliterator != null) {
            return spliterator.estimateSize();
        }
        for (int i = this.b; i < this.a.l(); i++) {
            jCount += this.a.a(i).count();
        }
        return jCount;
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

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        t0 t0Var = this.a;
        if (t0Var == null || this.d != null) {
            return null;
        }
        Spliterator spliterator = this.c;
        if (spliterator != null) {
            return spliterator.trySplit();
        }
        int i = this.b;
        int iL = t0Var.l() - 1;
        t0 t0Var2 = this.a;
        int i2 = this.b;
        if (i < iL) {
            this.b = i2 + 1;
            return t0Var2.a(i2).spliterator();
        }
        t0 t0VarA = t0Var2.a(i2);
        this.a = t0VarA;
        int iL2 = t0VarA.l();
        t0 t0Var3 = this.a;
        if (iL2 != 0) {
            this.b = 1;
            return t0Var3.a(0).spliterator();
        }
        Spliterator spliterator2 = t0Var3.spliterator();
        this.c = spliterator2;
        return spliterator2.trySplit();
    }

    @Override // j$.util.Spliterator
    public final /* bridge */ /* synthetic */ j$.util.j0 trySplit() {
        return (j$.util.j0) trySplit();
    }

    @Override // j$.util.Spliterator
    public final /* bridge */ /* synthetic */ Spliterator.OfInt trySplit() {
        return (Spliterator.OfInt) trySplit();
    }

    @Override // j$.util.Spliterator
    public final /* bridge */ /* synthetic */ Spliterator.OfLong trySplit() {
        return (Spliterator.OfLong) trySplit();
    }

    @Override // j$.util.Spliterator
    public final /* bridge */ /* synthetic */ j$.util.c0 trySplit() {
        return (j$.util.c0) trySplit();
    }
}
