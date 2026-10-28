package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kqu implements Executor {
    public static Context a;
    private static volatile kqu b;

    private kqu() {
    }

    public static kqu a(Context context) {
        kqu kquVar = b;
        if (kquVar == null) {
            synchronized (kqu.class) {
                kquVar = b;
                if (kquVar == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext == null) {
                        throw new NullPointerException("null reference");
                    }
                    a = applicationContext;
                    kqu kquVar2 = new kqu();
                    b = kquVar2;
                    kquVar = kquVar2;
                }
            }
        }
        return kquVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        kqt.a.post(runnable);
    }
}
