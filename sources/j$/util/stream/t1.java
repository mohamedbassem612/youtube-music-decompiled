package j$.util.stream;

import j$.util.Spliterator;
import java.util.ArrayDeque;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class t1 extends v1 implements j$.util.j0 {
    @Override // j$.util.j0
    public final void forEachRemaining(Object obj) {
        if (this.a == null) {
            return;
        }
        if (this.d != null) {
            while (tryAdvance(obj)) {
            }
            return;
        }
        Spliterator spliterator = this.c;
        if (spliterator != null) {
            ((j$.util.j0) spliterator).forEachRemaining(obj);
            return;
        }
        ArrayDeque arrayDequeB = b();
        while (true) {
            s0 s0Var = (s0) v1.a(arrayDequeB);
            if (s0Var == null) {
                this.a = null;
                return;
            }
            s0Var.e(obj);
        }
    }

    @Override // j$.util.j0
    public final boolean tryAdvance(Object obj) {
        s0 s0Var;
        if (!c()) {
            return false;
        }
        boolean zTryAdvance = ((j$.util.j0) this.d).tryAdvance(obj);
        if (!zTryAdvance) {
            if (this.c == null && (s0Var = (s0) v1.a(this.e)) != null) {
                j$.util.j0 j0VarSpliterator = s0Var.spliterator();
                this.d = j0VarSpliterator;
                return j0VarSpliterator.tryAdvance(obj);
            }
            this.a = null;
        }
        return zTryAdvance;
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
}
