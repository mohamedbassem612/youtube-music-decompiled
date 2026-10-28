package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class acdo {
    public aceh a;
    public acee b;
    public aced c;
    public acef d;
    public aceg e;
    public int f;
    public boolean g = false;
    private final awmd h;
    private final awmd i;
    private final tun j;
    private final abnc k;
    private final aawj l;
    private final axsp m;
    private acdn n;
    private final aboi o;

    public acdo(awmd awmdVar, awmd awmdVar2, tun tunVar, abnc abncVar, aboi aboiVar, ci ciVar, aawj aawjVar, axsp axspVar, abmt abmtVar) {
        this.h = awmdVar;
        this.i = awmdVar2;
        tunVar.getClass();
        this.j = tunVar;
        abncVar.getClass();
        this.k = abncVar;
        this.o = aboiVar;
        this.l = aawjVar;
        this.m = axspVar;
        abmtVar.getClass();
        ((avlr) ciVar.a).r().af(new jbq(this, awmdVar, 13));
    }

    public final synchronized ez a() {
        acdn acdnVar;
        acdnVar = this.n;
        if (acdnVar == null) {
            acdnVar = new acdn(this);
            this.n = acdnVar;
        }
        return acdnVar;
    }

    public final void b() {
        this.j.d(tum.PLAYER_CONTROL_DISMISS);
        if (this.k.i) {
            this.m.kk(aavw.c);
        }
        aced acedVar = this.c;
        if (acedVar != null) {
            acedVar.a();
        } else {
            ((acdm) this.h.io()).P();
        }
    }

    public final void c() {
        this.j.d(tum.PLAYER_CONTROL_PAUSE);
        this.o.b = true;
        acef acefVar = this.d;
        if (acefVar != null) {
            acefVar.a();
        } else {
            ((acdm) this.h.io()).z();
        }
    }

    public final void d() {
        if (this.g) {
            return;
        }
        this.j.d(tum.PLAYER_CONTROL_PLAY);
        aceg acegVar = this.e;
        if (acegVar != null) {
            acegVar.a();
        } else {
            ((acdm) this.h.io()).A();
        }
    }

    public final void e() {
        this.j.d(tum.PLAYER_CONTROL_REPLAY);
        ((acdm) this.h.io()).C();
    }

    public final void f() {
        this.j.d(tum.PLAYER_CONTROL_RETRY);
        ((acdl) this.i.io()).r();
    }

    public final void g(long j) {
        l(j, appa.SEEK_SOURCE_UNKNOWN);
    }

    @Deprecated
    public final void h(long j) {
        m(j, appa.SEEK_SOURCE_UNKNOWN);
    }

    @Deprecated
    public final void i(long j, appa appaVar) {
        m(j, appaVar);
    }

    public final void j() {
        this.j.d(tum.PLAYER_CONTROL_SKIP_NEXT);
        acee aceeVar = this.b;
        if (aceeVar != null) {
            aceeVar.a();
        } else {
            ((acdl) this.i.io()).i(abtu.a);
        }
    }

    public final void k() {
        acfw acfwVarH;
        this.j.d(tum.PLAYER_CONTROL_SKIP_PREVIOUS);
        aceh acehVar = this.a;
        if (acehVar != null) {
            acehVar.a();
            return;
        }
        awmd awmdVar = this.h;
        if (!((acdm) awmdVar.io()).Z() || this.f <= 0 || (acfwVarH = ((acdm) awmdVar.io()).h()) == null || acfwVarH.a() <= this.f) {
            awmd awmdVar2 = this.i;
            acdl acdlVar = (acdl) awmdVar2.io();
            abtu abtuVar = abtu.b;
            if (acdlVar.n(abtuVar)) {
                ((acdl) awmdVar2.io()).i(abtuVar);
                return;
            }
        }
        ((acdm) awmdVar.io()).af(0L);
    }

    public final void l(long j, appa appaVar) {
        this.j.d(tum.PLAYER_CONTROL_SEEK_RELATIVE);
        this.l.e();
        ((acdm) this.h.io()).ae(j, appaVar);
    }

    @Deprecated
    public final void m(long j, appa appaVar) {
        this.j.d(tum.PLAYER_CONTROL_SEEK_ABSOLUTE);
        this.l.e();
        ((acdm) this.h.io()).ag(j, appaVar);
    }
}
