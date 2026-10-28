package defpackage;

import android.os.Looper;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class bkq {
    private static final ThreadLocal i = new ThreadLocal();
    public ere f;
    public final eol g;
    public final aha a = new aha(0);
    final ArrayList b = new ArrayList();
    public final qcb h = new qcb(this);
    public final Runnable c = new bkn(this, 0);
    public boolean d = false;
    public float e = 1.0f;

    public bkq(eol eolVar) {
        this.g = eolVar;
    }

    static bkq a() {
        ThreadLocal threadLocal = i;
        if (threadLocal.get() == null) {
            threadLocal.set(new bkq(new eol((char[]) null, (byte[]) null)));
        }
        return (bkq) threadLocal.get();
    }

    final boolean b() {
        return Thread.currentThread() == ((Looper) this.g.b).getThread();
    }
}
