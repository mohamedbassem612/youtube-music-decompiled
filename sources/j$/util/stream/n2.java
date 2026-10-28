package j$.util.stream;

import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class n2 extends i2 {
    public final /* synthetic */ BinaryOperator h;
    public final /* synthetic */ BiConsumer i;
    public final /* synthetic */ Supplier j;
    public final /* synthetic */ Collector k;

    public n2(a4 a4Var, BinaryOperator binaryOperator, BiConsumer biConsumer, Supplier supplier, Collector collector) {
        this.h = binaryOperator;
        this.i = biConsumer;
        this.j = supplier;
        this.k = collector;
    }

    @Override // j$.util.stream.i2
    public final v2 C() {
        return new o2(this.j, this.i, this.h);
    }

    @Override // j$.util.stream.i2, j$.util.stream.a5
    public final int c() {
        if (this.k.characteristics().contains(Collector.Characteristics.UNORDERED)) {
            return z3.r;
        }
        return 0;
    }
}
