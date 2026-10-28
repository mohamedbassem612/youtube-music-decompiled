package j$.util.stream;

import java.util.function.IntFunction;
import java.util.function.Predicate;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class y extends c3 {
    public final /* synthetic */ byte n;
    public final /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(a aVar, int i, Object obj, byte b) {
        super(aVar, i, (byte) 1);
        this.n = b;
        this.o = obj;
    }

    @Override // j$.util.stream.a
    public final g3 o(int i, g3 g3Var) {
        byte b = this.n;
        Object obj = this.o;
        switch (b) {
            case 0:
                return new x(g3Var, (IntFunction) obj, (byte) 0);
            default:
                return new m(g3Var, (Predicate) obj, (byte) 1);
        }
    }
}
