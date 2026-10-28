package defpackage;

import android.util.LruCache;
import android.util.Pair;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abom {
    public static final long a;
    public final LruCache b;
    public final mbc c;
    public final tbt d;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        a = 10000L;
    }

    public abom(mbc mbcVar, tbt tbtVar) {
        mbcVar.getClass();
        this.c = mbcVar;
        tbtVar.getClass();
        this.d = tbtVar;
        this.b = new LruCache(5);
    }

    public final Object a(String str, agfr agfrVar, xir xirVar) {
        if (str == null) {
            return agfrVar.io();
        }
        LruCache lruCache = this.b;
        synchronized (lruCache) {
            Pair pair = (Pair) lruCache.remove(str);
            if (pair == null || !c(pair)) {
                return agfrVar.io();
            }
            this.d.c(new aaxq());
            if (xirVar != null) {
                xirVar.f(tau.PLAYER_EARLY_FETCH_CACHE_HIT);
            }
            return pair.first;
        }
    }

    public final void b(String str, agfr agfrVar, xir xirVar, Executor executor) {
        executor.execute(afwl.i(new aasv(this, str, xirVar, agfrVar, 6, null)));
    }

    public final boolean c(Pair pair) {
        return (pair == null || pair.first == null || this.c.b() >= ((Long) pair.second).longValue()) ? false : true;
    }
}
