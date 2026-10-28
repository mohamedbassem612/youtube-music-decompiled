package j$.util.stream;

import j$.util.function.Consumer$CC;
import j$.util.function.IntConsumer$CC;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class x implements e3 {
    public final g3 a;
    public final /* synthetic */ byte b;
    public final /* synthetic */ Object c;

    public x(g3 g3Var, Object obj, byte b) {
        this.b = b;
        this.c = obj;
        g3Var.getClass();
        this.a = g3Var;
    }

    @Override // j$.util.stream.e3, j$.util.stream.g3
    public final void accept(int i) {
        byte b = this.b;
        g3 g3Var = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                g3Var.r(((IntFunction) obj).apply(i));
                break;
            default:
                if (((IntPredicate) obj).test(i)) {
                    g3Var.accept(i);
                }
                break;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.g3
    public final void end() {
        this.a.end();
    }

    @Override // j$.util.stream.g3
    public final void p(long j) {
        switch (this.b) {
            case 1:
                this.a.p(-1L);
                break;
            default:
                this.a.p(j);
                break;
        }
    }

    @Override // j$.util.stream.e3
    public final /* synthetic */ void r(Integer num) {
        i2.e(this, num);
    }

    @Override // j$.util.stream.g3
    public final boolean s() {
        return this.a.s();
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
}
