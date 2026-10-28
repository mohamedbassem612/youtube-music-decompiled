package defpackage;

import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.protobuf.MessageLite;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class vwi {
    private static final agrf d = agrf.h("com/google/android/libraries/youtube/innertube/cache/AbstractDiskCacheManager");
    public final tmo a;
    public final Executor b;
    public volatile boolean c;
    private final zwb e;
    private final mbc f;
    private final vwk g;
    private final vxz h;
    private final wjr i;

    public vwi(zwb zwbVar, tmo tmoVar, mbc mbcVar, Executor executor, vwk vwkVar, wjr wjrVar, vxz vxzVar) {
        this.e = zwbVar;
        this.a = tmoVar;
        this.f = mbcVar;
        this.b = executor;
        this.g = vwkVar;
        this.i = wjrVar;
        this.h = vxzVar;
    }

    protected abstract int a(MessageLite messageLite);

    protected abstract int b(MessageLite messageLite);

    protected abstract MessageLite c();

    protected abstract alop d(MessageLite messageLite);

    public final synchronized ListenableFuture e(String str, MessageLite messageLite) {
        ListenableFuture listenableFutureQ;
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Invalid cache key: ".concat(str));
        }
        if (messageLite == null) {
            return ahng.l();
        }
        if (!i()) {
            ((agrc) ((agrc) d.c()).k("com/google/android/libraries/youtube/innertube/cache/AbstractDiskCacheManager", "putAsync", 145, "AbstractDiskCacheManager.java")).t("Couldn't store browse response due to uninitialized disk cache");
            return ahng.l();
        }
        if (a(messageLite) <= 0 && b(messageLite) <= 0) {
            f(str);
            return ahng.l();
        }
        HashMap map = new HashMap();
        zwb zwbVar = this.e;
        if (zwbVar.u()) {
            map.put("Identity-Id", zwbVar.e().k());
        }
        byte[] byteArray = messageLite.toByteArray();
        alop alopVarD = d(messageLite);
        mbc mbcVar = this.f;
        int i = 0;
        tmt tmtVarEe = yno.ee(map, alopVarD, mbcVar, this.h.l(38, 45686717L, false));
        tmr tmrVarI = null;
        if (byteArray != null && tmtVarEe != null) {
            long epochMilli = mbcVar.f().toEpochMilli() + TimeUnit.SECONDS.toMillis(a(messageLite));
            long millis = TimeUnit.SECONDS.toMillis(b(messageLite)) + epochMilli;
            aftj aftjVar = new aftj();
            aftjVar.j(tmt.a);
            aftjVar.a = tym.aI(byteArray);
            tms tmsVar = new tms(tmtVarEe);
            tmsVar.g(millis);
            tmsVar.f(epochMilli);
            tmsVar.b(mbcVar.f().toEpochMilli());
            aftjVar.j(tmsVar.a());
            tmrVarI = aftjVar.i();
        }
        if (tmrVarI == null) {
            ((agrc) ((agrc) d.c()).k("com/google/android/libraries/youtube/innertube/cache/AbstractDiskCacheManager", "putAsync", 158, "AbstractDiskCacheManager.java")).t("Failed to generate cache entry for browse response");
            listenableFutureQ = ahng.l();
        } else {
            listenableFutureQ = ahng.q(afwl.i(new vwh(this, str, tmrVarI, i)), this.b);
        }
        return listenableFutureQ;
    }

    public final ListenableFuture f(String str) {
        if (i()) {
            return ahng.q(afwl.i(new uqd(this, str, 12)), this.b);
        }
        ((agrc) ((agrc) d.c()).k("com/google/android/libraries/youtube/innertube/cache/AbstractDiskCacheManager", "removeAsync", 236, "AbstractDiskCacheManager.java")).t("Couldn't remove entry due to uninitialized disk cache");
        return ahng.m(new IllegalStateException("Couldn't remove entry due to uninitialized disk cache"));
    }

    public final void g() {
        this.b.execute(afwl.i(new vlj(this, 13)));
    }

    public final synchronized void h(String str) {
        if (i()) {
            this.b.execute(afwl.i(new uqd(this, str, 11)));
        } else {
            ((agrc) ((agrc) d.c()).k("com/google/android/libraries/youtube/innertube/cache/AbstractDiskCacheManager", "invalidate", 181, "AbstractDiskCacheManager.java")).t("Couldn't invalidate cache due to uninitialized disk cache");
        }
    }

    public final boolean i() {
        boolean z = true;
        if (!this.c) {
            synchronized (this) {
                try {
                    if (!this.c) {
                        try {
                            this.a.f();
                            this.c = true;
                        } catch (RuntimeException e) {
                            zvp.b(zvn.b, zvm.e, "Couldn't initialize disk cache", e);
                            ((agrc) ((agrc) ((agrc) d.b()).j(e)).k("com/google/android/libraries/youtube/innertube/cache/AbstractDiskCacheManager", "init", 99, "AbstractDiskCacheManager.java")).t("Couldn't initialize disk cache");
                            z = false;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return z;
    }

    public final synchronized boolean j(String str, MessageLite messageLite) {
        return !e(str, messageLite).isCancelled();
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0065 A[Catch: all -> 0x00d0, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0009, B:8:0x002b, B:10:0x0033, B:13:0x003c, B:15:0x0050, B:23:0x006e, B:25:0x0080, B:28:0x00aa, B:30:0x00b9, B:31:0x00c5, B:20:0x0065, B:18:0x005f), top: B:38:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x0080 A[Catch: all -> 0x00d0, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0009, B:8:0x002b, B:10:0x0033, B:13:0x003c, B:15:0x0050, B:23:0x006e, B:25:0x0080, B:28:0x00aa, B:30:0x00b9, B:31:0x00c5, B:20:0x0065, B:18:0x005f), top: B:38:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x00aa A[Catch: all -> 0x00d0, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0009, B:8:0x002b, B:10:0x0033, B:13:0x003c, B:15:0x0050, B:23:0x006e, B:25:0x0080, B:28:0x00aa, B:30:0x00b9, B:31:0x00c5, B:20:0x0065, B:18:0x005f), top: B:38:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x00b9 A[Catch: all -> 0x00d0, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0009, B:8:0x002b, B:10:0x0033, B:13:0x003c, B:15:0x0050, B:23:0x006e, B:25:0x0080, B:28:0x00aa, B:30:0x00b9, B:31:0x00c5, B:20:0x0065, B:18:0x005f), top: B:38:0x0001 }] */
    public final synchronized axnp k(String str) {
        axnp axnpVarE;
        MessageLite messageLiteC;
        MessageLite messageLiteD;
        vwj vwjVarA;
        if (!i()) {
            ((agrc) ((agrc) d.c()).k("com/google/android/libraries/youtube/innertube/cache/AbstractDiskCacheManager", "get", 199, "AbstractDiskCacheManager.java")).t("Couldn't fetch browse response due to uninitialized disk cache");
            c();
            return axnp.e();
        }
        tmr tmrVarD = this.a.d(str);
        if (tmrVarD == null) {
            c();
            return axnp.e();
        }
        tmt tmtVar = tmrVarD.b;
        String str2 = (String) tmtVar.c.get("Identity-Id");
        zwb zwbVar = this.e;
        if (zwbVar.u()) {
            if (TextUtils.equals(zwbVar.e().k(), str2)) {
                messageLiteC = c();
                messageLiteD = this.i.D(tmrVarD.a.a(), messageLiteC);
                if (messageLiteD == null) {
                    ((agrc) ((agrc) d.b()).k("com/google/android/libraries/youtube/innertube/cache/AbstractDiskCacheManager", "get", 215, "AbstractDiskCacheManager.java")).w("Failed to deserialize %s from cache", messageLiteC.getClass().getSimpleName());
                    c();
                    axnpVarE = axnp.e();
                } else {
                    vwjVarA = this.g.a(tmrVarD);
                    if (((vwl) vwjVarA).b == vwn.EXPIRED) {
                        f(str);
                        ((vwl) vwjVarA).a.cancel(true);
                    }
                    axnpVarE = new axnp(messageLiteD, vwjVarA, tmtVar.f);
                }
            } else {
                c();
                axnpVarE = axnp.e();
            }
        } else if (TextUtils.isEmpty(str2)) {
            messageLiteC = c();
            messageLiteD = this.i.D(tmrVarD.a.a(), messageLiteC);
            if (messageLiteD == null) {
                ((agrc) ((agrc) d.b()).k("com/google/android/libraries/youtube/innertube/cache/AbstractDiskCacheManager", "get", 215, "AbstractDiskCacheManager.java")).w("Failed to deserialize %s from cache", messageLiteC.getClass().getSimpleName());
                c();
                axnpVarE = axnp.e();
            } else {
                vwjVarA = this.g.a(tmrVarD);
                if (((vwl) vwjVarA).b == vwn.EXPIRED) {
                    f(str);
                    ((vwl) vwjVarA).a.cancel(true);
                }
                axnpVarE = new axnp(messageLiteD, vwjVarA, tmtVar.f);
            }
        } else {
            c();
            axnpVarE = axnp.e();
        }
        return axnpVarE;
    }
}
