package j$.util.stream;

import java.util.function.BinaryOperator;
import java.util.function.LongBinaryOperator;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class j2 extends i2 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ Object i;

    public /* synthetic */ j2(a4 a4Var, Object obj, byte b) {
        this.h = b;
        this.i = obj;
    }

    @Override // j$.util.stream.i2
    public final v2 C() {
        byte b = this.h;
        Object obj = this.i;
        switch (b) {
            case 0:
                return new t2((n) obj);
            case 1:
                return new u2((LongBinaryOperator) obj);
            case 2:
                return new m2((BinaryOperator) obj);
            case 3:
                return new r2((n) obj);
            default:
                return new s2((n) obj);
        }
    }
}
