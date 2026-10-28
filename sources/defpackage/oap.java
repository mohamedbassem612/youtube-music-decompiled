package defpackage;

import android.content.Context;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class oap {
    private static final Object b = new Object();
    private static oap c;
    public final oao a;

    private oap(Context context, ExecutorService executorService, oaq oaqVar) {
        executorService.getClass();
        this.a = (oao) new oat(executorService, context, oaqVar).J.io();
    }

    public static oap a(Context context, ExecutorService executorService, oaq oaqVar) {
        oap oapVar;
        synchronized (b) {
            oapVar = c;
            if (oapVar == null) {
                oapVar = new oap(context, executorService, oaqVar);
                c = oapVar;
            }
        }
        return oapVar;
    }
}
