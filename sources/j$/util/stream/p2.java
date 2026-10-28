package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class p2 extends w2 implements v2 {
    public final /* synthetic */ j$.desugar.sun.nio.fs.o b;
    public final /* synthetic */ n c;
    public final /* synthetic */ n d;

    public p2(j$.desugar.sun.nio.fs.o oVar, n nVar, n nVar2) {
        this.b = oVar;
        this.c = nVar;
        this.d = nVar2;
    }

    @Override // j$.util.stream.v2
    public final void A(v2 v2Var) {
        this.d.accept(this.a, ((p2) v2Var).a);
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void r(Object obj) {
        this.c.accept(this.a, obj);
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

    @Override // j$.util.stream.w2, j$.util.stream.g3
    public final /* synthetic */ void accept(long j) {
        i2.i();
        throw null;
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
