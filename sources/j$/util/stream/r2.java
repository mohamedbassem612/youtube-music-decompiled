package j$.util.stream;

import j$.util.function.Consumer$CC;
import j$.util.function.IntConsumer$CC;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class r2 implements v2, e3 {
    public int a;
    public final /* synthetic */ n b;

    public r2(n nVar) {
        this.b = nVar;
    }

    @Override // j$.util.stream.v2
    public final void A(v2 v2Var) {
        accept(((r2) v2Var).a);
    }

    @Override // j$.util.stream.g3
    public final void accept(int i) {
        this.a = this.b.applyAsInt(this.a, i);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return Integer.valueOf(this.a);
    }

    @Override // j$.util.stream.g3
    public final void p(long j) {
        this.a = 0;
    }

    @Override // j$.util.stream.e3
    public final /* synthetic */ void r(Integer num) {
        i2.e(this, num);
    }

    @Override // j$.util.stream.g3
    public final boolean s() {
        return false;
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void r(Object obj) {
        r((Integer) obj);
    }

    @Override // j$.util.stream.g3
    public final /* synthetic */ void accept(long j) {
        i2.i();
        throw null;
    }

    @Override // j$.util.stream.g3
    public final void end() {
    }
}
