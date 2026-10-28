package j$.util.stream;

import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class l2 extends i2 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ ObjLongConsumer j;
    public final /* synthetic */ Supplier k;

    public /* synthetic */ l2(a4 a4Var, Object obj, ObjLongConsumer objLongConsumer, Supplier supplier, byte b) {
        this.h = b;
        this.i = obj;
        this.j = objLongConsumer;
        this.k = supplier;
    }

    @Override // j$.util.stream.i2
    public final v2 C() {
        byte b = this.h;
        Object obj = this.i;
        ObjLongConsumer objLongConsumer = this.j;
        Supplier supplier = this.k;
        switch (b) {
            case 0:
                return new k2((n) supplier, (n) objLongConsumer, (j$.desugar.sun.nio.fs.h) obj);
            default:
                return new p2((j$.desugar.sun.nio.fs.o) supplier, (n) objLongConsumer, (n) obj);
        }
    }
}
