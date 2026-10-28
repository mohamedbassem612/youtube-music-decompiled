package defpackage;

import androidx.car.app.model.Alert;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class qyu {
    private static final rdd a;

    static {
        rdc rdcVarA = rdd.a();
        rdcVarA.b(true);
        rdcVarA.d(6);
        rdcVarA.c(1);
        rdcVarA.e(3L);
        a = rdcVarA.a();
    }

    public static qyt a(qua quaVar) {
        qyq qyqVar = new qyq();
        if (quaVar == null) {
            throw new NullPointerException("Null experimentalFlags");
        }
        qyqVar.a = quaVar;
        rdd rddVar = a;
        if (rddVar == null) {
            throw new NullPointerException("Null frameDroppingConfig");
        }
        qyqVar.b = rddVar;
        qyqVar.c = 5;
        int i = qyqVar.k | 1;
        qyqVar.d = true;
        qyqVar.e = true;
        qyqVar.k = (short) (((short) (((short) (((short) i) | 2)) | 4)) | 8);
        qyqVar.b(Alert.DURATION_SHOW_INDEFINITELY);
        qyqVar.d(1);
        qyr qyrVarA = qys.a(quaVar);
        qyrVarA.b(false);
        qyrVarA.c();
        qyqVar.f = qyrVarA.a();
        qyqVar.c(10);
        qyqVar.g = true;
        int i2 = qyqVar.k | 128;
        qyqVar.h = true;
        qyqVar.k = (short) (((short) i2) | 256);
        qyqVar.e(quaVar.l);
        int i3 = qyqVar.k | 512;
        qyqVar.i = !quaVar.L;
        qyqVar.j = true;
        qyqVar.k = (short) (((short) (((short) (((short) (((short) (((short) i3) | 2048)) | 4096)) | 16384)) | 8192)) | Short.MIN_VALUE);
        return qyqVar.a();
    }
}
