package j$.util.stream;

import j$.util.OptionalInt;
import j$.util.function.Consumer$CC;
import j$.util.function.IntConsumer$CC;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class s2 implements v2, e3 {
    public boolean a;
    public int b;
    public final /* synthetic */ n c;

    public s2(n nVar) {
        this.c = nVar;
    }

    @Override // j$.util.stream.v2
    public final void A(v2 v2Var) {
        s2 s2Var = (s2) v2Var;
        if (s2Var.a) {
            return;
        }
        accept(s2Var.b);
    }

    @Override // j$.util.stream.g3
    public final void accept(int i) {
        if (!this.a) {
            this.b = this.c.applyAsInt(this.b, i);
        } else {
            this.a = false;
            this.b = i;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return this.a ? OptionalInt.empty() : OptionalInt.of(this.b);
    }

    @Override // j$.util.stream.g3
    public final void p(long j) {
        this.a = true;
        this.b = 0;
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
