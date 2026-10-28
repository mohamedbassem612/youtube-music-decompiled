package j$.util.stream;

import java.util.function.ToLongFunction;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class a3 extends c0 {
    public final /* synthetic */ ToLongFunction m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(d3 d3Var, int i, ToLongFunction toLongFunction) {
        super(d3Var, i);
        this.m = toLongFunction;
    }

    @Override // j$.util.stream.a
    public final boolean n() {
        return false;
    }

    @Override // j$.util.stream.a
    public final g3 o(int i, g3 g3Var) {
        return new m(g3Var, this.m, (byte) 4);
    }
}
