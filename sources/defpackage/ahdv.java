package defpackage;

import java.util.concurrent.Executor;
import java.util.logging.Level;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ahdv {
    private static final aheu d = new aheu(ahdv.class);
    public final agga a = new agga();
    public boolean b;
    public ahto c;

    public static void a(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            d.a().logp(Level.SEVERE, "com.google.common.util.concurrent.ExecutionList", "executeListener", a.cc(executor, runnable, "RuntimeException while executing runnable ", " with executor "), (Throwable) e);
        }
    }
}
