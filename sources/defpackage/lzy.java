package defpackage;

import android.content.Context;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lzy {
    public static final lzy a = new lzy();
    private static volatile rrq b;

    public final rrq a(Context context, ExecutorService executorService) {
        rrq rrqVar = b;
        if (rrqVar == null) {
            synchronized (this) {
                rrqVar = b;
                if (rrqVar == null) {
                    qsb qsbVar = qsb.a;
                    HashMap map = new HashMap();
                    ayq ayqVar = new ayq(atqq.H(new qpp(new afwv(context.getApplicationContext()))));
                    rmp.C(qrr.a, map);
                    rrq rrqVar2 = new rrq(executorService, ayqVar, qsbVar, map);
                    b = rrqVar2;
                    rrqVar = rrqVar2;
                }
            }
        }
        return rrqVar;
    }
}
