package defpackage;

import android.app.Activity;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dxs implements dxp {
    public final ReentrantLock a = new ReentrantLock();
    public final WeakHashMap b = new WeakHashMap();
    private final dxp c;

    public dxs(dxp dxpVar) {
        this.c = dxpVar;
    }

    public final void a(Activity activity, dwy dwyVar) {
        activity.getClass();
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            WeakHashMap weakHashMap = this.b;
            if (awrc.c(dwyVar, (dwy) weakHashMap.get(activity))) {
                reentrantLock.unlock();
                return;
            }
            reentrantLock.unlock();
            Iterator it = ((dxv) this.c).a.c.iterator();
            it.getClass();
            while (it.hasNext()) {
                aeiv aeivVar = (aeiv) it.next();
                if (awrc.c(aeivVar.a, activity)) {
                    aeivVar.x(dwyVar);
                }
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
