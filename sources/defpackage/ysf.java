package defpackage;

import android.text.TextUtils;
import androidx.car.app.model.Alert;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ysf implements tjm {
    public final tns a;
    public final yrr b;
    public final tlj c;
    public final yrw d;
    public final zjr e;
    public final AtomicBoolean f;
    public awuz g;
    public avmn h;
    private final zjk i;
    private final zgm j;
    private final vyo k;
    private final mbc l;
    private final awmd m;
    private final yse n;
    private final vxu o;
    private final yql p;
    private final vxz q;
    private final abxv r;
    private final hed s;
    private final hed t;
    private final zik u;

    public ysf(tns tnsVar, yrr yrrVar, tlj tljVar, yrw yrwVar, zjr zjrVar, zjk zjkVar, abxv abxvVar, zgm zgmVar, vyo vyoVar, vxu vxuVar, mbc mbcVar, yql yqlVar, hed hedVar, hed hedVar2, zik zikVar, awmd awmdVar, vxz vxzVar) {
        this.a = tnsVar;
        this.b = yrrVar;
        this.c = tljVar;
        this.d = yrwVar;
        this.e = zjrVar;
        this.i = zjkVar;
        this.r = abxvVar;
        this.j = zgmVar;
        this.k = vyoVar;
        this.o = vxuVar;
        this.l = mbcVar;
        this.p = yqlVar;
        this.s = hedVar;
        this.t = hedVar2;
        this.u = zikVar;
        this.m = awmdVar;
        this.q = vxzVar;
        this.n = zjrVar.j.l(354, 45797924L, false) ? new yry(this) : new ysc(this);
        this.f = new AtomicBoolean(false);
    }

    private final zjd g(xir xirVar) {
        zjk zjkVar = this.i;
        zjd zjdVar = zjkVar;
        if (xirVar != null && !(xirVar instanceof xjb)) {
            zjj zjjVarG = this.r.g(xirVar);
            if (this.e.ee()) {
                zjdVar = zjkVar;
                zjjVarG.aT();
            }
            zjdVar = zjkVar;
            yno.aZ(zjjVarG);
            zjdVar = zjjVarG;
        }
        zjdVar = zjkVar;
        return zjdVar;
    }

    private final void h(String str, Exception exc) {
        new ytf(this.j, str, this.s, this.e).e("innertube.fallback", exc);
    }

    @Override // defpackage.tjm
    public final void a() {
        zjr zjrVar = this.e;
        if (zjrVar.bE()) {
            ywl.C(this.j, this.b.b, zjrVar).w("ocan", zhf.d());
        }
        this.f.set(true);
        this.n.a();
    }

    public final yqs b(tns tnsVar, yrr yrrVar, xir xirVar) throws ytg {
        zhq zhqVar = zhq.ABR;
        if (yrrVar.x == 0) {
            throw null;
        }
        String str = yrrVar.b;
        zjd zjdVarG = g(xirVar);
        zjdVarG.L();
        boolean zC = yrrVar.c();
        zgm zgmVar = this.j;
        zgmVar.a(str, yrrVar.h, yrrVar.u, false, false);
        ytf ytfVar = new ytf(zgmVar, str, this.s, this.e);
        try {
            xpl xplVarC = yti.c(this.k, this.o, this.l);
            if (yrrVar.h == null) {
                String str2 = yrrVar.b;
                str2.getClass();
                h(str2, new IllegalStateException("onesie request without video id"));
                return new yqr();
            }
            yqs yqsVarA = this.p.a(yrrVar, ytfVar, new xsc(xplVarC), zjdVarG, tnsVar, xplVarC, this.d.V());
            zgm zgmVar2 = this.j;
            String str3 = yrrVar.b;
            zjr zjrVar = this.e;
            this.t.x(ywl.C(zgmVar2, str3, zjrVar), str3);
            ((yqo) yqsVarA).i();
            if (yrrVar.x == 4 || zjrVar.aC() || this.q.m(1, 45353838L) || zhl.bM(this.k)) {
                return yqsVarA;
            }
            ((ytv) this.m.io()).F(yrrVar);
            return yqsVarA;
        } catch (ytg e) {
            int i = e.a;
            if (i == 0) {
                throw new awmj();
            }
            if (i - 1 != 1) {
                ytfVar.e("unavailable.hotconfig", e);
            } else {
                ytfVar.e("unavailable.keyexpired", e);
            }
            if (zC) {
                throw e;
            }
            return new yqr();
        }
    }

    public final avlr c(tns tnsVar, yrr yrrVar, xir xirVar) {
        zhq zhqVar = zhq.ABR;
        if (yrrVar.x == 0) {
            throw null;
        }
        zjd zjdVarG = g(xirVar);
        zjdVarG.L();
        zgm zgmVar = this.j;
        String str = yrrVar.b;
        zgmVar.a(str, yrrVar.h, yrrVar.u, false, false);
        hed hedVar = this.s;
        zjr zjrVar = this.e;
        ytf ytfVar = new ytf(zgmVar, str, hedVar, zjrVar);
        this.t.x(ywl.C(zgmVar, str, zjrVar), str);
        if (!yrrVar.i && TextUtils.isEmpty(yrrVar.h)) {
            return avlr.A(new IllegalArgumentException("Onesie requests must have a non-null videoId."));
        }
        int i = 1;
        try {
            xpl xplVarC = yti.c(this.k, this.o, this.l);
            yqs yqsVarA = this.p.a(yrrVar, ytfVar, new xsc(xplVarC), zjdVarG, tnsVar, xplVarC, this.d.V());
            if (!this.n.d(yqsVarA)) {
                return avlr.A(new CancellationException());
            }
            return avlr.o(new tuf(yqsVarA, 2)).O(((yqo) yqsVarA).c).D(new xdx(8), false, Alert.DURATION_SHOW_INDEFINITELY).D(new yrb(yqsVarA, i), false, Alert.DURATION_SHOW_INDEFINITELY);
        } catch (ytg e) {
            int i2 = e.a;
            if (i2 == 0) {
                throw new awmj();
            }
            if (i2 - 1 != 1) {
                ytfVar.e("unavailable.hotconfig", e);
            } else {
                ytfVar.e("unavailable.keyexpired", e);
            }
            return avlr.A(e);
        }
    }

    @Override // defpackage.tjm
    public final void d(tjk tjkVar) {
        tjkVar.getClass();
        boolean z = this.a instanceof toc;
        yse yseVar = this.n;
        if (z) {
            yseVar.b(tjkVar);
        } else {
            yseVar.c(tjkVar);
        }
    }

    public final avmn e(avlr avlrVar, tjk tjkVar) {
        return avlrVar.R().t(new vtu(this, 8)).ah(new xul(new yrc(tjkVar, 2), 17), new xul(new yrc(tjkVar, 3), 18), new vtu(tjkVar, 9));
    }

    public final void f(Throwable th, tjk tjkVar) {
        tlj tljVar = this.c;
        if (tljVar.N() || !this.e.cM()) {
            yrr yrrVar = this.b;
            if (!yrrVar.e() && (!yrrVar.d() || !this.e.ao())) {
                String str = yrrVar.b;
                str.getClass();
                h(str, new Exception(th));
                tjkVar.b(th);
                return;
            }
        }
        tjkVar.b(tljVar.N() ? new ysd() : new CancellationException());
    }
}
