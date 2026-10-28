package defpackage;

import android.os.AsyncTask;
import app.rive.semantics.SemanticState;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class axjw extends ThreadPoolExecutor implements AutoCloseable {
    private static final int a;
    private static final int b;
    private static final int c;
    private static final ThreadFactory d;
    private static final BlockingQueue e;

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        a = iAvailableProcessors;
        b = Math.max(2, Math.min(iAvailableProcessors - 1, 4));
        c = (iAvailableProcessors << 1) + 1;
        d = new mdk(2, (byte[]) null);
        e = new ArrayBlockingQueue(SemanticState.Focused);
    }

    public axjw() {
        super(b, c, 30L, TimeUnit.SECONDS, (BlockingQueue<Runnable>) e, d);
        allowCoreThreadTimeOut(true);
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        a.ar(this);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        try {
            super.execute(runnable);
        } catch (RejectedExecutionException e2) {
            HashMap map = new HashMap();
            for (Runnable runnable2 : (Runnable[]) getQueue().toArray(new Runnable[0])) {
                Class<?> cls = runnable2.getClass();
                if (cls == axjv.class) {
                    throw null;
                }
                if (cls.getEnclosingClass() == AsyncTask.class) {
                    cls = AsyncTask.class;
                }
                String name = cls.getName();
                map.put(name, Integer.valueOf((map.containsKey(name) ? ((Integer) map.get(name)).intValue() : 0) + 1));
            }
            StringBuilder sb = new StringBuilder();
            for (Map.Entry entry : map.entrySet()) {
                if (((Integer) entry.getValue()).intValue() > 32) {
                    sb.append((String) entry.getKey());
                    sb.append(' ');
                }
            }
            throw new RejectedExecutionException("Prominent classes in AsyncTask: ".concat(sb.length() == 0 ? "NO CLASSES FOUND" : sb.toString()), e2);
        }
    }
}
