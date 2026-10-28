package defpackage;

import android.text.TextUtils;
import com.google.common.util.concurrent.MoreExecutors;
import j$.time.Duration;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xww extends xxk {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/mdx/player/MdxDefaultLocalPlaybackControl");
    xyv b;
    final xxj c;
    private final awmd l;

    public xww(tbt tbtVar, abvn abvnVar, awmd awmdVar, awmd awmdVar2, xmr xmrVar, ycp ycpVar, vxz vxzVar, awmd awmdVar3) {
        super(tbtVar, (xxm) abvnVar.l(), awmdVar, awmdVar2, xmrVar, vxzVar, ycpVar);
        this.b = null;
        this.c = new xxj(this);
        this.l = awmdVar3;
    }

    private final void h(xyv xyvVar) {
        abvk abvkVarG = g();
        abvkVarG.getClass();
        abvc abvcVarF = f();
        abvcVarF.getClass();
        abnk abnkVar = new abnk();
        int iA = xyvVar.a();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        float f = xyvVar.e / 1000;
        String str = xyvVar.k;
        String str2 = xyvVar.b;
        abnkVar.a = (ajwo) aboc.p(str2, xyvVar.g, iA, f, str, xyvVar.j, true).build();
        if (str2.equals(abvkVarG.n())) {
            agrx agrxVar = agso.a;
            abnkVar.b();
        }
        abnl abnlVarA = abnkVar.a();
        agrx agrxVar2 = agso.a;
        abvcVarF.g(abnlVarA);
    }

    private final boolean i(xyv xyvVar) {
        xyv xyvVar2;
        abvk abvkVarG = g();
        abvkVarG.getClass();
        String strM = abvkVarG.m();
        vxz vxzVar = this.k;
        if (vxzVar.l(151, 45650624L, false) && vxzVar.l(152, 45650625L, false) && (xyvVar2 = this.b) != null) {
            strM = xyvVar2.g;
        }
        return !xyvVar.f(strM);
    }

    private final boolean j(xyv xyvVar) {
        abvk abvkVarG = g();
        abvkVarG.getClass();
        return !xyvVar.g(abvkVarG.n());
    }

    public final void a(xyv xyvVar) {
        if (xyvVar.equals(this.b)) {
            this.b = null;
        }
    }

    @Override // defpackage.xxk
    protected final void b(xyv xyvVar) {
        vxz vxzVar = this.k;
        abvk abvkVarG = g();
        if (vxzVar.l(151, 45650624L, false)) {
            if (abvkVarG.n() == null) {
                agrx agrxVar = agso.a;
                h(xyvVar);
                return;
            } else if (!TextUtils.isEmpty(xyvVar.b) && j(xyvVar)) {
                agrx agrxVar2 = agso.a;
                return;
            }
        }
        if (!vxzVar.l(151, 45650624L, false) || !vxzVar.l(152, 45650625L, false)) {
            if ((xyvVar.c() || !(g() == null || g().m() == null || g().m().isEmpty())) && i(xyvVar)) {
                agrx agrxVar3 = agso.a;
                h(xyvVar);
                return;
            } else {
                agrx agrxVar4 = agso.a;
                g().al();
                return;
            }
        }
        agrx agrxVar5 = agso.a;
        this.b = xyvVar;
        xxp xxpVar = (xxp) this.l.io();
        xxpVar.getClass();
        xxj xxjVar = this.c;
        abvk abvkVar = (abvk) xxpVar.b.io();
        abvkVar.getClass();
        String strN = xyvVar.b;
        if (strN.isEmpty()) {
            strN = abvkVar.n();
        }
        abnk abnkVar = new abnk();
        abnkVar.b();
        abnkVar.a = (ajwo) aboc.p(strN, xyvVar.g, xyvVar.a(), Duration.ofMillis(xyvVar.e).toSeconds(), xyvVar.k, xyvVar.j, true).build();
        if (xxpVar.c.l(153, 45650626L, false)) {
            adrx adrxVar = new adrx(null, null);
            adrxVar.c(amac.WATCH_NEXT_TYPE_QUEUE_ONLY);
            abnkVar.o = adrxVar.b();
        }
        taf.i(xxpVar.e.q(abnkVar.a(), null), MoreExecutors.directExecutor(), new xfa(xxjVar, xyvVar, 2), new rjy(xxpVar, xxjVar, xyvVar, 11, (short[]) null), null);
    }

    @Override // defpackage.xxk
    protected final void c() {
        g().D();
    }

    @Override // defpackage.xxk
    protected final void d(xyv xyvVar) {
        if (!j(xyvVar) && !i(xyvVar)) {
            agrx agrxVar = agso.a;
        } else {
            agrx agrxVar2 = agso.a;
            h(xyvVar);
        }
    }

    @Override // defpackage.xxk
    protected final void e(abjx abjxVar, amyu amyuVar, boolean z) {
        acca accaVarG;
        String strS;
        String strR;
        int iB;
        vxz vxzVar = this.k;
        abvk abvkVarG = g();
        abvc abvcVarF = f();
        vxzVar.l(235, 45813668L, false);
        abnl abnlVarA = null;
        if (TextUtils.isEmpty(abvkVarG.n())) {
            accaVarG = null;
        } else {
            String strM = abvkVarG.m();
            String strM2 = "";
            if (strM == null) {
                strM = "";
            }
            boolean zN = awrc.n(strM, "RQ", false);
            abnl abnlVar = abvkVarG.f(0).a;
            if (abnlVar != null) {
                strS = abnlVar.s();
                strR = abnlVar.r();
            } else {
                strS = null;
                strR = null;
            }
            acfw acfwVarI = abvkVarG.i();
            long jA = acfwVarI != null ? acfwVarI.a() : 0L;
            abnk abnkVar = new abnk();
            long j = jA;
            String strN = abvkVarG.n();
            if (zN) {
                iB = -1;
            } else {
                strM2 = abvkVarG.m();
                iB = abvkVarG.b();
            }
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            abnkVar.a = (ajwo) aboc.p(strN, strM2, iB, j / 1000, strS, strR, false).build();
            abnkVar.f(!yno.cV(vxzVar, amyuVar, z, abvkVarG.i(), abvkVarG.X()));
            abnlVarA = abnkVar.a();
            accaVarG = abvkVarG.g();
        }
        float fA = abvkVarG.a();
        abvkVarG.D();
        if (abnlVarA != null) {
            agrx agrxVar = agso.a;
            abnlVarA.w();
            abvcVarF.g(abnlVarA);
            if (accaVarG != null) {
                abvkVarG.L(accaVarG, aazh.b);
            }
        }
        if (vxzVar.l(58, 45400591L, false)) {
            abvkVarG.J(fA);
        }
    }
}
