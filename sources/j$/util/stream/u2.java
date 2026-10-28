package j$.util.stream;

import j$.util.OptionalLong;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class u2 implements v2, f3 {
    public boolean a;
    public long b;
    public final /* synthetic */ LongBinaryOperator c;

    public u2(LongBinaryOperator longBinaryOperator) {
        this.c = longBinaryOperator;
    }

    @Override // j$.util.stream.v2
    public final void A(v2 v2Var) {
        u2 u2Var = (u2) v2Var;
        if (u2Var.a) {
            return;
        }
        accept(u2Var.b);
    }

    @Override // j$.util.stream.f3
    public final /* synthetic */ void B(Long l) {
        i2.g(this, l);
    }

    @Override // j$.util.stream.g3
    public final void accept(long j) {
        if (!this.a) {
            this.b = this.c.applyAsLong(this.b, j);
        } else {
            this.a = false;
            this.b = j;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return this.a ? OptionalLong.empty() : OptionalLong.of(this.b);
    }

    @Override // j$.util.stream.g3
    public final void p(long j) {
        this.a = true;
        this.b = 0L;
    }

    @Override // j$.util.stream.g3
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

    @Override // j$.util.stream.g3
    public final /* synthetic */ void accept(int i) {
        i2.d();
        throw null;
    }

    @Override // j$.util.stream.g3
    public final void end() {
    }
}
