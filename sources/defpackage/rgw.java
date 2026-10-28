package defpackage;

import android.util.Size;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.research.aimatter.drishti.DrishtiCache;
import com.google.research.xeno.effect.InputFrameSource;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Collectors;
import java.util.List;
import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class rgw extends rhc implements rig, rhr {
    public static final rbm j = new rbm("rgw");
    public final Object c;
    public final Optional d;
    public final qug e;
    public final UUID f;
    public final qua g;
    public agke h;
    public rht i;
    private final qyy n;
    private final ahxp o;
    private final DrishtiCache p;
    private final Size q;
    private final Optional r;
    private final rhh s;
    private final rjb t;
    private final rjc u;
    private final InputFrameSource v;
    private agke w;

    public rgw(rgu rguVar) {
        super(rguVar.a);
        this.c = new Object();
        agke agkeVar = agpi.a;
        this.w = agkeVar;
        this.h = agkeVar;
        this.i = null;
        this.n = rguVar.b;
        this.o = rguVar.c;
        this.p = rguVar.d;
        this.r = rguVar.f;
        this.q = rguVar.e;
        this.e = rguVar.g;
        this.f = rguVar.h;
        this.d = rguVar.i;
        this.g = rguVar.j;
        this.s = rguVar.k;
        this.t = rguVar.l;
        this.u = rguVar.a;
        this.v = rguVar.m;
    }

    public static rgu i() {
        rgu rguVar = new rgu();
        rguVar.e = atvp.c;
        rguVar.f = Optional.empty();
        return rguVar;
    }

    private final void p(boolean z) {
        rht rhtVar = this.i;
        if (!z) {
            if (rhtVar != null) {
                rhtVar.close();
                this.i = null;
                return;
            }
            return;
        }
        if (rhtVar == null) {
            rhp rhpVar = new rhp();
            rhpVar.d(this.o);
            rhpVar.b(this.p);
            rhpVar.c(this.r);
            rhpVar.b = this;
            rhpVar.c = this.d;
            rhpVar.h = this.t;
            rhpVar.i = this.u;
            rhpVar.a = this.q;
            rhpVar.d = this.g;
            rhpVar.e = this.s;
            rhpVar.f = this.v;
            rht rhtVarA = rhpVar.a();
            this.i = rhtVarA;
            rhtVarA.b(new rgs(this, 0));
            this.i.a = new rgt(this, 0);
        }
    }

    @Override // defpackage.rhc, defpackage.rgr, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            super.close();
        }
        rht rhtVar = this.i;
        if (rhtVar != null) {
            rhtVar.close();
            this.i = null;
        }
        Optional optional = this.d;
        if (true == optional.isPresent()) {
            ((rbr) optional.get()).i();
        }
    }

    @Override // defpackage.rhr
    public final void h(String str) {
        UUID uuid;
        String str2 = (String) Collection.EL.stream(this.w).map(new rcs(15)).collect(Collectors.joining(","));
        rbc rbcVar = new rbc(j, rbd.c);
        rbcVar.c();
        rbcVar.a("EffectsTextureProcessor onFrameError: %s effectNames are : %s", str, str2);
        qug qugVar = this.e;
        if (qugVar == null || (uuid = this.f) == null) {
            return;
        }
        tge tgeVarA = quk.a();
        tgeVarA.e = str;
        tgeVarA.c = new quh(uuid, 3);
        qugVar.a(tgeVarA.e());
    }

    public final rgv j(List list) {
        agke agkeVarN = agke.n(list);
        qzg qzgVarJ = nqy.j(this.w, agkeVarN);
        int i = 2;
        boolean z = false;
        new rbc(j, rbd.a).a("Effect update action: %s, appliedEffects=%d", qzgVarJ, Integer.valueOf(agkeVarN.size()));
        ListenableFuture listenableFutureA = aher.a;
        int iOrdinal = qzgVarJ.ordinal();
        if (iOrdinal == 0) {
            p(false);
        } else if (iOrdinal == 1) {
            p(true);
            agke agkeVar = (agke) Collection.EL.stream(agkeVarN).filter(new rej(i)).collect(aghu.a);
            agkj agkjVarA = this.n.a(agkeVar);
            rjb rjbVar = this.t;
            listenableFutureA = rjbVar.a(rjbVar.f(agkjVarA.values(), new gmf(this, agkeVar, agkjVarA, 10)), Exception.class, new onn(this, 16));
            o(listenableFutureA);
        } else {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                }
                this.w = agkeVarN;
                return new rgv(z, listenableFutureA);
            }
            synchronized (this.c) {
                agyz agyzVarC = agyz.c(agyz.d(agkeVarN, this.h).a(new itl(11)).filter(new acwb(8)));
                nqy.i(new agyt(((agyt) agyzVarC).a, ((agyt) agyzVarC).b, ((agyt) agyzVarC).c.mo840andThen(new rcs(13))));
            }
        }
        z = true;
        this.w = agkeVarN;
        return new rgv(z, listenableFutureA);
    }

    @Override // defpackage.rhd
    public final void k(rfs rfsVar) {
        rht rhtVar = this.i;
        if (rhtVar != null) {
            rhtVar.k(rfsVar);
        }
    }

    @Override // defpackage.rhc
    public final void l(rfs rfsVar) {
        rht rhtVar = this.i;
        if (rhtVar != null) {
            rhtVar.a(rfsVar);
        } else {
            e(rfsVar);
        }
    }

    @Override // defpackage.rig
    public final void m() {
        if (this.i != null) {
            Optional optional = this.d;
            if (true == optional.isPresent()) {
                ((rbr) optional.get()).f(Optional.empty());
            }
        }
    }
}
