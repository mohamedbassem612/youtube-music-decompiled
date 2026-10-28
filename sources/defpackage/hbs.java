package defpackage;

import android.content.Context;
import j$.util.Optional;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class hbs extends vna implements jlf {
    public final avmb a;
    public final wbz b;
    public final awli c;
    public Optional d;
    private final abvn w;
    private final hfn x;

    public hbs(Context context, aeiy aeiyVar, wwn wwnVar, wwt wwtVar, awmd awmdVar, afip afipVar, hfn hfnVar, vyo vyoVar, aefv aefvVar, abxv abxvVar, wwb wwbVar, abwk abwkVar, ahto ahtoVar, ahrn ahrnVar, wbz wbzVar, vxz vxzVar, vxz vxzVar2, tce tceVar, avmb avmbVar, Executor executor, abvn abvnVar) {
        super(context, aeiyVar, wwnVar, wwtVar, awmdVar, afipVar, vyoVar, aefvVar, abxvVar, wwbVar, abwkVar, ahtoVar, ahrnVar, vxzVar, vxzVar2, tceVar, avmbVar, executor);
        this.d = Optional.empty();
        this.a = avmbVar;
        this.x = hfnVar;
        this.b = wbzVar;
        this.w = abvnVar;
        this.c = new awli();
    }

    private final boolean ao(hww hwwVar) {
        return this.s && hwwVar != hww.h;
    }

    @Override // defpackage.jlf
    public final void a() {
        this.t.d = true;
        amqm amqmVar = this.k;
        if (this.n == null || amqmVar == null) {
            return;
        }
        wwt wwtVar = this.i;
        wwtVar.g = amqmVar;
        ((wwn) wwtVar.a.io()).k();
    }

    @Override // defpackage.jlf
    public final void b() {
        this.t.d = false;
        amqm amqmVar = this.k;
        if (this.n == null || amqmVar == null || !this.q) {
            return;
        }
        wwt wwtVar = this.i;
        wwn wwnVar = (wwn) wwtVar.a.io();
        if (wwnVar.x()) {
            wwtVar.g = amqmVar;
            wwnVar.o();
        }
    }

    @Override // defpackage.vna
    protected final void f() {
        h(this.x.x());
    }

    public final void g(arge argeVar) {
        if ((argeVar.c.b & 64) != 0) {
            this.l = ackj.k(null, argeVar.getExtraShortViewCount(), null, false);
            super.ai();
        }
    }

    public final void h(hww hwwVar) {
        amoo amooVar = this.j.b().e;
        if (amooVar == null) {
            amooVar = amoo.a;
        }
        if (!amooVar.g && this.k != null && !this.r) {
            if (!this.s && hwwVar == hww.h) {
                W();
            }
            if (ao(hwwVar)) {
                X();
            }
        }
        if (ao(hwwVar)) {
            wwt wwtVar = this.i;
            if (wwtVar.h != null) {
                ((wwn) wwtVar.a.io()).h(wwtVar.h.b());
                ((wwi) wwtVar.b.io()).jl(wwtVar.h.a());
            }
        }
        this.s = hwwVar == hww.h;
        if (hwwVar == hww.a) {
            am();
        }
        vpk vpkVar = this.m;
        if (vpkVar != null) {
            vpkVar.t();
        }
        if (this.p) {
            boolean z = hwwVar == hww.c || hwwVar == hww.d || hwwVar == hww.e || hwwVar == hww.f || hwwVar == hww.g;
            hww hwwVar2 = hww.b;
            if (z) {
                al();
                wwb wwbVar = this.t;
                wwbVar.c = false;
                if (wwbVar.b == 1) {
                    Iterator it = wwbVar.a.iterator();
                    while (it.hasNext()) {
                        ((wwa) it.next()).c();
                    }
                    return;
                }
                return;
            }
            if (hwwVar == hwwVar2) {
                am();
                wwb wwbVar2 = this.t;
                wwbVar2.c = true;
                if (wwbVar2.b == 1) {
                    Iterator it2 = wwbVar2.a.iterator();
                    while (it2.hasNext()) {
                        ((wwa) it2.next()).b();
                    }
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [axso, java.lang.Object] */
    @Override // defpackage.vna
    protected final void k() {
        U(avlh.f(this.v.b, ((avlh) this.u.c).H(new uxe(3)).p(), new jnx(4)).p().ak(new var(this, 13)));
        U(this.c.X(new hbn(this, 2)).af(new hbr(this, 1)));
        U(this.w.P().L(this.a).al(new hbr(this, 0), new glg(12)));
        U(this.x.y().L(this.o).ak(new hbr(this, 2)));
    }
}
