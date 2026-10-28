package j$.util.stream;

import java.util.function.IntPredicate;
import java.util.function.ToIntFunction;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class z extends b0 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(a aVar, int i, Object obj, byte b) {
        super(aVar, i);
        this.m = b;
        this.n = obj;
    }

    @Override // j$.util.stream.a
    public final g3 o(int i, g3 g3Var) {
        byte b = this.m;
        Object obj = this.n;
        switch (b) {
            case 0:
                return new x(g3Var, (IntPredicate) obj, (byte) 1);
            default:
                return new m(g3Var, (ToIntFunction) obj, (byte) 3);
        }
    }
}
