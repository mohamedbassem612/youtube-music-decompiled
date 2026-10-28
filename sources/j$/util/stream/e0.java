package j$.util.stream;

import j$.util.function.IntConsumer$CC;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class e0 extends f0 implements e3 {
    public final /* synthetic */ g0 c;
    public final /* synthetic */ IntPredicate d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(g0 g0Var, IntPredicate intPredicate) {
        super(g0Var);
        this.c = g0Var;
        this.d = intPredicate;
    }

    @Override // j$.util.stream.f0, j$.util.stream.g3
    public final void accept(int i) {
        if (this.a) {
            return;
        }
        boolean zTest = this.d.test(i);
        g0 g0Var = this.c;
        if (zTest == g0Var.a) {
            this.a = true;
            this.b = g0Var.b;
        }
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // j$.util.stream.e3
    public final /* synthetic */ void r(Integer num) {
        i2.e(this, num);
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void r(Object obj) {
        r((Integer) obj);
    }
}
