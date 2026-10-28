package defpackage;

import java.util.HashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ablo {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/player/features/serverstitch/VideoStatsMonitor");
    public final avlh c;
    public final avlh d;
    public final avlh e;
    public final avlh f;
    public final avlh g;
    public final avlh h;
    public final avlh i;
    public final avmc j;
    public final avlh k;
    public final avlh l;
    public final avlh m;
    public final avlh n;
    public final awmd o;
    public final avlh p;
    public final avlh q;
    public final abmt r;
    public final abzd s;
    public final acjb u;
    public final aciq v;
    public abzc w;
    public String x;
    public final String y;
    public final HashMap t = new HashMap();
    public final avmm b = new avmm();

    public ablo(acip acipVar, awmd awmdVar, adws adwsVar, abmt abmtVar) {
        this.x = acipVar.au();
        this.y = acipVar.au();
        this.s = acipVar.q();
        this.v = acipVar.w();
        this.h = acipVar.Z();
        this.c = acipVar.aq();
        this.d = acipVar.an();
        this.e = acipVar.V();
        this.f = acipVar.E();
        this.g = acipVar.ah();
        this.i = acipVar.S();
        this.j = acipVar.ar();
        this.l = acipVar.P();
        this.p = acipVar.aj();
        this.q = acipVar.ao();
        this.k = acipVar.X();
        this.m = (avlh) adwsVar.i;
        this.n = adwsVar.b();
        this.o = awmdVar;
        this.u = acipVar.x();
        this.r = abmtVar;
    }

    public final void a() {
        this.x = this.y;
        abzc abzcVar = this.w;
        if (abzcVar != null) {
            abzcVar.u();
            this.w = null;
        }
    }

    public final boolean b(String str) {
        return str.equals(this.y);
    }
}
