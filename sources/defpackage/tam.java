package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class tam {
    public final agkz a;
    public volatile boolean b;
    public final abss c;
    public final ajwo d;
    public final tbt e;
    public final abvc f;
    public final xit g;
    public final abmt h;
    public final boolean i;
    public final boolean j;
    public final abiv k;
    public final agev l;
    public final abvn m;
    public avmn n;
    public final abis o;
    public volatile boolean p;
    private final Executor q;
    private volatile boolean r;
    private final int s;
    private final wjv t;

    public tam(Executor executor, agkz agkzVar, wjv wjvVar, abss abssVar, ajwo ajwoVar, aoow aoowVar, abis abisVar, tbt tbtVar, agev agevVar, abvn abvnVar, abvc abvcVar, xit xitVar, abmt abmtVar) {
        this.q = executor;
        agkzVar.getClass();
        this.a = agkzVar;
        this.t = wjvVar;
        agqr it = agkzVar.iterator();
        while (it.hasNext()) {
            ((tal) it.next()).c = this;
        }
        abssVar.getClass();
        this.c = abssVar;
        ajwoVar.getClass();
        this.d = ajwoVar;
        this.e = tbtVar;
        this.f = abvcVar;
        this.g = xitVar;
        this.h = abmtVar;
        boolean zT = grj.t(aoowVar);
        boolean z = true;
        if (!aoowVar.e && !zT) {
            z = false;
        }
        this.i = z;
        this.j = zT;
        this.s = grj.t(aoowVar) ? Math.max(Math.abs(aoowVar.c), Math.abs(aoowVar.d)) : -1;
        this.o = abisVar;
        this.l = agevVar;
        this.m = abvnVar;
        this.k = new abiv(this);
    }

    public final void a() {
        agqr it = this.a.iterator();
        while (it.hasNext()) {
            tal talVar = (tal) it.next();
            ahno.O(!talVar.a);
            if (!talVar.b) {
                return;
            }
        }
        if (this.b || this.r) {
            return;
        }
        this.r = true;
        this.q.execute(new abiu(this));
        wjv wjvVar = this.t;
        synchronized (wjvVar.c) {
            wjvVar.a.remove(this);
        }
    }

    public final abns b() {
        aclr aclrVarB = abns.b();
        int i = this.s;
        if (i > 0) {
            aclrVarB.b = 7;
            aclrVarB.d(i);
        } else {
            aclrVarB.b = 8;
        }
        return aclrVarB.c();
    }
}
