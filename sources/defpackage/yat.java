package defpackage;

import android.os.Handler;
import j$.util.Optional;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class yat {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/mdx/remote/internal/DefaultSessionRecoveryController");
    public final abvn b;
    public volatile ycs e;
    public volatile xze f;
    public volatile xze g;
    public boolean i;
    public boolean j;
    public final zpw k;
    private final mbc n;
    private final Handler o;
    private final agke p;
    private final vxz r;
    public final avmm c = new avmm();
    public final xrq m = new xrq(this);
    public volatile xrq l = null;
    private final Runnable q = new yas(this, 0);
    private final xxy s = new xxy(this);
    public volatile xzu d = new xzu(0, "");
    public volatile String h = "";

    public yat(mbc mbcVar, zpw zpwVar, Handler handler, abvn abvnVar, xla xlaVar, vxz vxzVar) {
        this.n = mbcVar;
        this.k = zpwVar;
        this.o = handler;
        this.b = abvnVar;
        this.r = vxzVar;
        this.p = xlaVar.R();
    }

    public final void a(int i) {
        ycs ycsVar = this.e;
        if (ycsVar != null) {
            ycsVar.d();
            this.e = null;
        }
        xze xzeVar = this.f;
        this.f = null;
        this.o.removeCallbacks(this.q);
        b(xzeVar, i);
    }

    public final void b(xze xzeVar, int i) {
        xzu xzuVar = xzeVar != null ? new xzu(i, xzeVar.d) : new xzu(i, "");
        if (this.d.equals(xzuVar)) {
            return;
        }
        this.d = xzuVar;
        xrq xrqVar = this.l;
        if (xrqVar != null) {
            xzu xzuVar2 = this.d;
            ycp ycpVar = (ycp) xrqVar.a;
            ycpVar.i();
            int i2 = xzuVar2.a;
            if (i2 != 0) {
                if (i2 == 1) {
                    for (xzg xzgVar : ycpVar.d) {
                        String str = xzuVar2.b;
                        xzgVar.d();
                    }
                    return;
                }
                if (i2 == 2) {
                    Iterator it = ycpVar.d.iterator();
                    while (it.hasNext()) {
                        ((xzg) it.next()).b();
                    }
                } else if (i2 == 3) {
                    Iterator it2 = ycpVar.d.iterator();
                    while (it2.hasNext()) {
                        ((xzg) it2.next()).a();
                    }
                } else {
                    for (xzg xzgVar2 : ycpVar.d) {
                        String str2 = xzuVar2.b;
                        xzgVar2.c();
                    }
                }
            }
        }
    }

    public final void c(ycs ycsVar, xze xzeVar) {
        Optional optional = xzeVar.h;
        if (optional.isEmpty()) {
            ((agrc) ((agrc) a.b().i(agso.a, "MDX.SessionRecoveryController")).k("com/google/android/libraries/youtube/mdx/remote/internal/DefaultSessionRecoveryController", "startSessionRecovery", 269, "DefaultSessionRecoveryController.java")).t("session was not connected, do not start recovery.");
            a(0);
            return;
        }
        agrx agrxVar = agso.a;
        this.f = xzeVar;
        b(this.f, 1);
        ycsVar.j(xzeVar, this.s);
        if (((xyi) optional.get()).a) {
            return;
        }
        long jC = ((xyi) optional.get()).c();
        Handler handler = this.o;
        Runnable runnable = this.q;
        handler.removeCallbacks(runnable);
        handler.postDelayed(runnable, Math.max(0L, jC - this.n.f().toEpochMilli()));
    }

    public final boolean d(xze xzeVar) {
        Optional optional = xzeVar.h;
        if (optional.isEmpty()) {
            agrx agrxVar = agso.a;
            return false;
        }
        if (!((xyi) optional.get()).a && ((xyi) optional.get()).c() - this.n.f().toEpochMilli() <= 0) {
            agrx agrxVar2 = agso.a;
            return false;
        }
        Optional optional2 = xzeVar.i;
        if (optional2.isEmpty()) {
            agrx agrxVar3 = agso.a;
            return false;
        }
        if (!this.r.l(257, 45840986L, false) || optional2.get() != amyu.MDX_SESSION_DISCONNECT_REASON_NO_ACTIVE_PLAYBACK) {
            return !this.p.contains(Integer.valueOf(((amyu) optional2.get()).aa));
        }
        agrx agrxVar4 = agso.a;
        return false;
    }
}
