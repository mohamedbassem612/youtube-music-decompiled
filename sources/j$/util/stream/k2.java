package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class k2 extends w2 implements v2, f3 {
    public final /* synthetic */ n b;
    public final /* synthetic */ n c;
    public final /* synthetic */ j$.desugar.sun.nio.fs.h d;

    public k2(n nVar, n nVar2, j$.desugar.sun.nio.fs.h hVar) {
        this.b = nVar;
        this.c = nVar2;
        this.d = hVar;
    }

    @Override // j$.util.stream.v2
    public final void A(v2 v2Var) {
        this.a = this.d.apply(this.a, ((k2) v2Var).a);
    }

    @Override // j$.util.stream.f3
    public final /* synthetic */ void B(Long l) {
        i2.g(this, l);
    }

    @Override // j$.util.stream.w2, j$.util.stream.g3
    public final void accept(long j) {
        this.c.accept(this.a, j);
    }

    @Override // j$.util.stream.w2
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.w2, j$.util.stream.g3
    public final void p(long j) {
        this.a = this.b.get();
    }

    @Override // j$.util.stream.w2, j$.util.stream.g3
    public final boolean s() {
        return false;
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.desugar.sun.nio.fs.g.c(this, longConsumer);
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void r(Object obj) {
        B((Long) obj);
    }

    @Override // j$.util.stream.w2, j$.util.stream.g3
    public final /* synthetic */ void accept(int i) {
        i2.d();
        throw null;
    }

    @Override // j$.util.stream.w2, j$.util.stream.g3
    public final void end() {
    }
}
