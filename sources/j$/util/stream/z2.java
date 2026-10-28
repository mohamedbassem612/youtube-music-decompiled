package j$.util.stream;

import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class z2 extends c3 {
    public final /* synthetic */ byte n;
    public final /* synthetic */ Function o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z2(d3 d3Var, int i, Function function, byte b) {
        super(d3Var, i, (byte) 1);
        this.n = b;
        this.o = function;
    }

    @Override // j$.util.stream.a
    public final g3 o(int i, g3 g3Var) {
        byte b = this.n;
        Function function = this.o;
        switch (b) {
            case 0:
                return new m(g3Var, function, (byte) 2);
            default:
                return new l(g3Var, function);
        }
    }
}
