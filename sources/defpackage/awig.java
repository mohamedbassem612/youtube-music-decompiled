package defpackage;

import app.rive.semantics.SemanticState;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awig implements avos {
    static final int a = Integer.getInteger("jctools.spsc.max.lookahead.step", SemanticState.Obscured).intValue();
    public static final Object b = new Object();
    final int d;
    long e;
    public final int f;
    public AtomicReferenceArray g;
    final int h;
    AtomicReferenceArray i;
    final AtomicLong c = new AtomicLong();
    final AtomicLong j = new AtomicLong();

    public awig(int i) {
        int iNumberOfLeadingZeros = 1 << (32 - Integer.numberOfLeadingZeros(Math.max(8, i) - 1));
        AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(iNumberOfLeadingZeros + 1);
        this.g = atomicReferenceArray;
        int i2 = iNumberOfLeadingZeros - 1;
        this.f = i2;
        this.d = Math.min(iNumberOfLeadingZeros / 4, a);
        this.i = atomicReferenceArray;
        this.h = i2;
        this.e = iNumberOfLeadingZeros - 2;
        e(0L);
    }

    private final void f(long j) {
        this.j.lazySet(j);
    }

    private final void g(AtomicReferenceArray atomicReferenceArray, Object obj, long j, int i) {
        atomicReferenceArray.lazySet(i, obj);
        e(j + 1);
    }

    public final long a() {
        return this.c.get();
    }

    @Override // defpackage.avot
    public final void c() {
        while (true) {
            if (km() == null && i()) {
                return;
            }
        }
    }

    public final void d(AtomicReferenceArray atomicReferenceArray, AtomicReferenceArray atomicReferenceArray2) {
        atomicReferenceArray.lazySet(atomicReferenceArray.length() - 1, atomicReferenceArray2);
    }

    public final void e(long j) {
        this.c.lazySet(j);
    }

    @Override // defpackage.avot
    public final boolean i() {
        return a() == this.j.get();
    }

    @Override // defpackage.avot
    public final boolean j(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        AtomicReferenceArray atomicReferenceArray = this.g;
        AtomicLong atomicLong = this.c;
        int i = this.f;
        long j = atomicLong.get();
        int i2 = ((int) j) & i;
        if (j < this.e) {
            g(atomicReferenceArray, obj, j, i2);
        } else {
            long j2 = ((long) this.d) + j;
            if (atomicReferenceArray.get(((int) j2) & i) == null) {
                this.e = j2 - 1;
                g(atomicReferenceArray, obj, j, i2);
            } else {
                long j3 = 1 + j;
                if (atomicReferenceArray.get(((int) j3) & i) == null) {
                    g(atomicReferenceArray, obj, j, i2);
                } else {
                    AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(atomicReferenceArray.length());
                    this.g = atomicReferenceArray2;
                    this.e = (j + ((long) i)) - 1;
                    atomicReferenceArray2.lazySet(i2, obj);
                    d(atomicReferenceArray, atomicReferenceArray2);
                    atomicReferenceArray.lazySet(i2, b);
                    e(j3);
                }
            }
        }
        return true;
    }

    @Override // defpackage.avos, defpackage.avot
    public final Object km() {
        AtomicLong atomicLong = this.j;
        AtomicReferenceArray atomicReferenceArray = this.i;
        long j = atomicLong.get();
        int i = this.h;
        int i2 = ((int) j) & i;
        Object obj = atomicReferenceArray.get(i2);
        Object obj2 = b;
        if (obj != null) {
            if (obj != obj2) {
                atomicReferenceArray.lazySet(i2, null);
                f(j + 1);
                return obj;
            }
        } else if (obj2 != null) {
            return null;
        }
        int i3 = i + 1;
        AtomicReferenceArray atomicReferenceArray2 = (AtomicReferenceArray) atomicReferenceArray.get(i3);
        atomicReferenceArray.lazySet(i3, null);
        this.i = atomicReferenceArray2;
        Object obj3 = atomicReferenceArray2.get(i2);
        if (obj3 != null) {
            atomicReferenceArray2.lazySet(i2, null);
            f(j + 1);
        }
        return obj3;
    }
}
