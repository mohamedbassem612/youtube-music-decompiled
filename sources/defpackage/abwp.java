package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abwp {
    public final abwk a;
    public final Executor b;
    public final Executor c;
    public final vyo d;
    public final abmt e;
    private final wjb f;
    private final absg g;
    private final abpj h;
    private sxw i;
    private final adet j;
    private final igp k;
    private final igp l;
    private final isi m;

    public abwp(wjb wjbVar, adet adetVar, absg absgVar, isi isiVar, abwk abwkVar, Executor executor, Executor executor2, vyo vyoVar, igp igpVar, abpj abpjVar, abmt abmtVar, igp igpVar2) {
        wjbVar.getClass();
        this.f = wjbVar;
        this.j = adetVar;
        this.g = absgVar;
        this.m = isiVar;
        this.a = abwkVar;
        this.b = executor;
        this.c = executor2;
        this.d = vyoVar;
        this.l = igpVar;
        this.h = abpjVar;
        this.e = abmtVar;
        this.k = igpVar2;
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [axsp, java.lang.Object] */
    public final void a(wjf wjfVar, abnl abnlVar, abwo abwoVar, xir xirVar) {
        abwk abwkVar = this.a;
        synchronized (abwkVar) {
            if (abwkVar.d == null) {
                return;
            }
            if (wjfVar == null) {
                return;
            }
            sxw sxwVar = this.i;
            if (sxwVar != null) {
                sxwVar.c();
            }
            sxw sxwVar2 = new sxw(new abwn(this, wjfVar, abwoVar, abnlVar, xirVar));
            this.i = sxwVar2;
            adet adetVar = this.j;
            adetVar.b.kk(new aaxs());
            if (xirVar != null) {
                xirVar.n("pc_s");
            }
            this.m.z(wjfVar.t(), sxwVar2, wjfVar.G());
        }
    }

    public final void b() {
        sxw sxwVar = this.i;
        if (sxwVar != null) {
            sxwVar.c();
            this.i = null;
        }
    }

    public final void c(wjf wjfVar, aboe aboeVar, acey aceyVar) {
        if (this.l.b() != 2) {
            this.h.m(abnw.c);
            if (aboeVar != null) {
                aceyVar.A(wjfVar, aboeVar);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [axsp, java.lang.Object] */
    public final void d(wjf wjfVar, abnl abnlVar, xir xirVar, acey aceyVar) {
        taq.d();
        this.j.b.kk(new aaxr());
        if (xirVar != null) {
            xirVar.n("pc");
        }
        if (!(this.e.bP() && this.k.a(wjfVar) == 2) && aceyVar.ad()) {
            aceyVar.B(wjfVar, abnlVar);
        }
    }

    public final void e() {
        this.g.q(false);
        b();
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [axsp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v2, types: [axsp, java.lang.Object] */
    public final boolean f(wjf wjfVar, acey aceyVar, abwo abwoVar) {
        if (abmt.aG(this.d)) {
            taq.c();
            xpl xplVarAh = wjfVar.ah(this.f);
            if (xplVarAh == null) {
                return false;
            }
            if (!aaje.p(wjfVar.t())) {
                adet adetVar = this.j;
                adetVar.f.kk(new aaze(xplVarAh.i()));
            }
            if (aceyVar.ae()) {
                this.c.execute(afwl.i(new abwl(aceyVar, wjfVar, 1)));
            } else {
                boolean zP = aaje.p(wjfVar.t());
                Executor executor = this.c;
                if (zP) {
                    executor.execute(afwl.i(new aapc((Object) aceyVar, (Object) wjfVar, (Object) xplVarAh, 9, (byte[]) null)));
                } else {
                    executor.execute(afwl.i(new abwl(abwoVar, xplVarAh, 0)));
                }
            }
        } else {
            xpl xplVarAh2 = wjfVar.ah(this.f);
            if (xplVarAh2 == null) {
                return false;
            }
            adet adetVar2 = this.j;
            adetVar2.f.kk(new aaze(xplVarAh2.i()));
            if (aceyVar.ae()) {
                aceyVar.B(wjfVar, null);
            } else {
                abwoVar.b(xplVarAh2);
            }
        }
        return true;
    }
}
