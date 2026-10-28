package defpackage;

import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class vq extends dl {
    public static final Executor a = new vp(0);
    private static volatile vq c;
    public final dl b;
    private final dl d;

    private vq() {
        super(null, null);
        vr vrVar = new vr();
        this.d = vrVar;
        this.b = vrVar;
    }

    public static vq q() {
        if (c == null) {
            synchronized (vq.class) {
                if (c == null) {
                    c = new vq();
                }
            }
        }
        return c;
    }

    public final boolean r() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}
