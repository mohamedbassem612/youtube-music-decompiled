package j$.util.stream;

import j$.util.OptionalInt;
import j$.util.function.IntConsumer$CC;
import java.util.function.IntConsumer;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class q extends s implements e3 {
    public static final p c;

    static {
        a4 a4Var = a4.INT_VALUE;
        c = new p(true, a4Var, OptionalInt.empty(), new n((byte) 2), new n((byte) 3));
        new p(false, a4Var, OptionalInt.empty(), new n((byte) 2), new n((byte) 3));
    }

    @Override // j$.util.stream.s, j$.util.stream.g3
    public final void accept(int i) {
        r(Integer.valueOf(i));
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.a) {
            return OptionalInt.of(((Integer) this.b).intValue());
        }
        return null;
    }
}
