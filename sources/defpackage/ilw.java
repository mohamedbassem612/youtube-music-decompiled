package defpackage;

import com.google.android.apps.youtube.music.watchpage.ui.WatchWhileLayout;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ilw implements cx, hkt {
    public final aunn a;
    public final aunn b;
    public final dd c;
    public final aunn d;
    public final awmd e;
    public final aunn f;
    public final avmm g = new avmm();
    public aazn h;
    public aazn i;
    public final vxz j;
    private final jki k;
    private final abmt l;
    private final acfn m;
    private boolean n;

    public ilw(aunn aunnVar, aunn aunnVar2, awmd awmdVar, jki jkiVar, dd ddVar, aunn aunnVar3, aunn aunnVar4, vxz vxzVar, abmt abmtVar, acfn acfnVar) {
        this.a = aunnVar;
        this.b = aunnVar2;
        this.e = awmdVar;
        this.k = jkiVar;
        this.c = ddVar;
        this.d = aunnVar3;
        this.f = aunnVar4;
        this.j = vxzVar;
        this.l = abmtVar;
        this.m = acfnVar;
    }

    private final boolean k() {
        dd ddVar = this.c;
        return (ddVar.g("FEmusic_immersive") == null && ddVar.g("FEmusic_immersive_preview") == null) ? false : true;
    }

    private final boolean l() {
        if (this.l.cf()) {
            return this.m.e(((abvn) this.a.io()).am());
        }
        aazn aaznVar = this.h;
        return aaznVar != null && aaznVar.c();
    }

    @Override // defpackage.cx
    public final void c() {
        agrx agrxVar = agso.a;
        j();
        k();
        if (k()) {
            ((ilx) this.f.io()).a(j());
            if (j()) {
                i();
                h();
            } else {
                f();
                g();
            }
        }
    }

    @Override // defpackage.hkt
    public final void d(String str) {
        agrx agrxVar = agso.a;
        ((ilx) this.f.io()).a(j());
        if (!j()) {
            f();
            g();
        } else {
            if (this.j.m(34, 45671820L)) {
                return;
            }
            i();
            h();
        }
    }

    public final void f() {
        boolean zL = l();
        agrx agrxVar = agso.a;
        if (zL) {
            ((abvn) this.a.io()).o().ap(false, 19);
        }
    }

    public final void g() {
        awmd awmdVar = this.e;
        ((WatchWhileLayout) awmdVar.io()).P(this.j.l(19, 45649951L, false));
        ((WatchWhileLayout) awmdVar.io()).N();
        agrx agrxVar = agso.a;
        if (this.n) {
            ((abvn) this.b.io()).o().A();
        }
        this.n = false;
    }

    public final void h() {
        if (!l()) {
            ((abvn) this.a.io()).o().A();
        }
        ((ilx) this.f.io()).c = true;
    }

    public final void i() {
        awmd awmdVar = this.e;
        boolean zE = true;
        if (!((WatchWhileLayout) awmdVar.io()).ab()) {
            ((WatchWhileLayout) awmdVar.io()).B(true);
        }
        agrx agrxVar = agso.a;
        if (this.l.cf()) {
            zE = this.m.e(((abvn) this.b.io()).am());
        } else {
            aazn aaznVar = this.i;
            if (aaznVar == null || !aaznVar.c()) {
                zE = false;
            }
        }
        this.n = zE;
        if (zE) {
            ((abvn) this.b.io()).o().ap(false, 20);
        }
    }

    public final boolean j() {
        jki jkiVar = this.k;
        return (Objects.equals(jkiVar.e(), "FEmusic_immersive") || Objects.equals(jkiVar.e(), "FEmusic_immersive_preview")) && !((WatchWhileLayout) this.e.io()).ac();
    }

    @Override // defpackage.cx
    public final /* synthetic */ void a() {
    }

    @Override // defpackage.cx
    public final /* synthetic */ void e() {
    }

    @Override // defpackage.cx
    public final /* synthetic */ void hz() {
    }

    @Override // defpackage.cx
    public final /* synthetic */ void b(cc ccVar, boolean z) {
    }
}
