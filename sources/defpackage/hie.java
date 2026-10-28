package defpackage;

import android.content.Context;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class hie {
    private static final agrf v = agrf.h("com/google/android/apps/youtube/music/mediabrowser/content/LocalContentService");
    public final Context a;
    public final mbc b;
    public final aunn c;
    public final aunn d;
    public final aunn e;
    public final aunn f;
    public final aunn g;
    public final aunn h;
    public final aunn i;
    public final aunn j;
    public final Executor k;
    public final aunn l;
    public final ReentrantLock m;
    public final ReentrantLock n;
    public volatile boolean o;
    public volatile boolean p;
    public final ConcurrentHashMap q;
    public final ConcurrentHashMap r;
    public final avmm s;
    public final awkv t;
    public afml u;
    private final aunn w;

    public hie(Context context, mbc mbcVar, aunn aunnVar, aunn aunnVar2, aunn aunnVar3, aunn aunnVar4, aunn aunnVar5, aunn aunnVar6, aunn aunnVar7, aunn aunnVar8, Executor executor, aunn aunnVar9, Executor executor2, aunn aunnVar10) {
        context.getClass();
        mbcVar.getClass();
        aunnVar.getClass();
        aunnVar2.getClass();
        aunnVar3.getClass();
        aunnVar4.getClass();
        aunnVar5.getClass();
        aunnVar6.getClass();
        aunnVar7.getClass();
        aunnVar8.getClass();
        executor.getClass();
        aunnVar9.getClass();
        executor2.getClass();
        aunnVar10.getClass();
        this.a = context;
        this.b = mbcVar;
        this.c = aunnVar;
        this.d = aunnVar2;
        this.e = aunnVar3;
        this.f = aunnVar4;
        this.w = aunnVar5;
        this.g = aunnVar6;
        this.h = aunnVar7;
        this.i = aunnVar8;
        this.j = aunnVar9;
        this.k = executor2;
        this.l = aunnVar10;
        this.m = new ReentrantLock();
        this.n = new ReentrantLock();
        this.q = new ConcurrentHashMap();
        this.r = new ConcurrentHashMap();
        this.s = new avmm();
        this.t = new awkx().aI();
    }

    private final boolean e() {
        return this.o || this.p;
    }

    public final him a(znf znfVar, ConcurrentMap concurrentMap) {
        ReentrantLock reentrantLock = this.m;
        reentrantLock.lock();
        try {
            agrf agrfVar = him.a;
            return hmy.D(znfVar, null, concurrentMap);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void b(hjn hjnVar) {
        zot zotVar = hjnVar.e;
        if (zotVar.b()) {
            return;
        }
        try {
            ((jgc) this.d.io()).k(zotVar.b);
        } catch (Exception e) {
            ((agrc) ((agrc) v.c()).j(e).k("com/google/android/apps/youtube/music/mediabrowser/content/LocalContentService", "grantDownloadedPermission", 445, "LocalContentService.kt")).w("Failed to grant downloaded permissions to %s", zotVar.b);
        }
    }

    public final void c(hjn hjnVar) {
        zot zotVar = hjnVar.e;
        if (zotVar.b()) {
            return;
        }
        try {
            ((isr) this.e.io()).d(zotVar.b);
        } catch (Exception e) {
            ((agrc) ((agrc) v.c()).j(e).k("com/google/android/apps/youtube/music/mediabrowser/content/LocalContentService", "grantSideloadedPermission", 429, "LocalContentService.kt")).w("Failed to grant sideloaded permissions to %s", zotVar.b);
        }
    }

    public final void d(ConcurrentMap concurrentMap, Map map) {
        if (e()) {
            Set setAv = atqq.av(concurrentMap.keySet());
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                List list = (List) entry.getValue();
                if (!e()) {
                    break;
                }
                znf znfVar = znf.a;
                Object objAh = yno.ah(str);
                if (true == (objAh instanceof awmm)) {
                    objAh = null;
                }
                znf znfVar2 = (znf) objAh;
                if (znfVar2 != null) {
                    a(znfVar2, concurrentMap).o(list, this.b, this.w);
                    setAv.remove(znfVar2);
                }
            }
            for (Object obj : setAv) {
                obj.getClass();
                znf znfVar3 = (znf) obj;
                if (!e()) {
                    break;
                }
                a(znfVar3, concurrentMap).o(awno.a, this.b, this.w);
            }
            if (e()) {
                return;
            }
            concurrentMap.clear();
        }
    }
}
