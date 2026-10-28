package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import android.util.LruCache;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class yqf extends yqg {
    public static final /* synthetic */ int m = 0;
    public final agfr a;
    public final long b;
    public final mbc c;
    public final ScheduledExecutorService d;
    public final long e;
    public final boolean f;
    public final long g;
    public final ArrayList h;
    public final Set i;
    public boolean j;
    public final tgr k;
    public final hed l;
    private final long p;
    private final zjr q;
    private long r;
    private long s;
    private final int t;
    private final boolean u;
    private String v;
    private boolean w;
    private final tfq x;

    /* JADX WARN: Code duplicated, block: B:10:0x0069  */
    public yqf(agfr agfrVar, String str, List list, long j, long j2, int i, mbc mbcVar, ScheduledExecutorService scheduledExecutorService, tfq tfqVar, hed hedVar, wis wisVar, tgr tgrVar, Set set, int i2, zjr zjrVar, int i3) {
        boolean z;
        zkf.d(agfrVar);
        this.a = agfrVar;
        this.b = j <= 0 ? 25000L : j;
        this.g = j2;
        zkf.d(mbcVar);
        this.c = mbcVar;
        this.p = mbcVar.b();
        zkf.d(scheduledExecutorService);
        this.d = scheduledExecutorService;
        this.l = hedVar;
        this.w = false;
        this.v = "ns";
        this.x = tfqVar;
        this.t = i;
        this.k = tgrVar;
        this.i = set;
        ArrayList arrayList = new ArrayList();
        this.h = arrayList;
        this.e = TimeUnit.SECONDS.toMillis(i2);
        this.q = zjrVar;
        if (zjrVar != null) {
            tqj tqjVar = zjrVar.v;
            int i4 = tqr.a;
            if (tqjVar.k(1073830453)) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        this.f = z;
        if (!list.isEmpty()) {
            this.u = false;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.h.add(new yqd(this, Uri.parse((String) it.next()), wisVar));
                if (i3 > 0 && i3 <= this.h.size()) {
                    return;
                }
            }
            return;
        }
        this.u = true;
        int i5 = typ.a;
        if (ahno.aa(str)) {
            throw new IllegalArgumentException();
        }
        Uri uri = Uri.parse(str);
        arrayList.add(new yqd(this, uri, wisVar));
        if (i3 <= 0 || i3 > arrayList.size()) {
            arrayList.add(new yqd(this, k(uri), wisVar));
            if (i3 <= 0 || i3 > arrayList.size()) {
                arrayList.add(new yqd(this, uri.buildUpon().appendQueryParameter("cmo", "pf=1").build(), wisVar));
            }
        }
    }

    @Override // defpackage.yqg
    public final synchronized long a() {
        return ((yqd) this.h.get(0)).c;
    }

    @Override // defpackage.yqg
    public final long b() {
        return this.p;
    }

    @Override // defpackage.yqg
    public final long c() {
        return this.r;
    }

    @Override // defpackage.yqg
    public final synchronized yth d() {
        yth ythVarT;
        ythVarT = this.l.t();
        if (ythVarT == null) {
            ArrayList arrayList = this.h;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                yqd yqdVar = (yqd) arrayList.get(i);
                String strC = yqdVar.c();
                if (strC != null && !TextUtils.equals(strC, null)) {
                    ythVarT = new yth(strC, -1, yqdVar.a());
                }
            }
            ythVarT = null;
        }
        return ythVarT;
    }

    @Override // defpackage.yqg
    public final String e() {
        return this.v;
    }

    @Override // defpackage.yqg
    public final void f(Uri uri) {
        String host = uri == null ? null : uri.getHost();
        if (host != null) {
            hed hedVar = this.l;
            ((LruCache) hedVar.b).put(host, uri);
            yrg yrgVar = (yrg) ((HashMap) hedVar.a).get(host);
            if (yrgVar != null) {
                yrgVar.b = uri;
            }
        }
    }

    @Override // defpackage.yqg
    public final synchronized void g(String str) {
        this.v = str;
        this.j = false;
    }

    public final synchronized void h() {
        long j = this.e;
        if (j > 0 && this.c.b() - this.s > j) {
            g("li");
        }
    }

    @Override // defpackage.yqg
    public final synchronized void j() throws Throwable {
        yqf yqfVar;
        try {
            try {
                this.v = null;
                this.j = true;
                mbc mbcVar = this.c;
                this.s = mbcVar.b();
                if (this.w) {
                    yqfVar = this;
                } else {
                    this.r = mbcVar.b();
                    this.w = true;
                    yqfVar = this;
                    this.d.schedule(new yqe(yqfVar, this.x, this.u, this.t, this.q), 1500L, TimeUnit.MILLISECONDS);
                }
                return;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        throw th;
    }
}
