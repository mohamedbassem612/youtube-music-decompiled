package defpackage;

import android.net.Uri;
import android.util.LruCache;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adkp {
    private final mbc d;
    private final Map b = new HashMap();
    private final WeakHashMap c = new WeakHashMap();
    public final LruCache a = new LruCache(1000);

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        new Uri.Builder().scheme("yt").authority("reactr").build();
    }

    public adkp(mbc mbcVar, tbt tbtVar) {
        mbcVar.getClass();
        this.d = mbcVar;
        tbtVar.f(this);
    }

    @tcc
    public void handleSignOutEvent(zwu zwuVar) {
        this.a.evictAll();
        this.b.clear();
        this.c.clear();
        this.d.b();
    }
}
