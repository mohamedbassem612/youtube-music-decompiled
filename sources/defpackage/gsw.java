package defpackage;

import android.content.Context;
import j$.util.Optional;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class gsw extends gut {
    public static final agrf a = agrf.h("com/google/android/apps/youtube/music/command/AutoconnectGateCommandResolver");
    public final xru b;
    public final avmb c;
    public final xnv d;
    public final xws e;
    public final ycp f;
    public final yar g;
    public final ycp h;
    private final Context i;
    private final xsa k;
    private final Executor l;
    private final Executor m;
    private final abvn n;
    private final awmd o;
    private final avmr p = new avmr();
    private final xkw q;
    private final vxz r;

    public gsw(xws xwsVar, ycp ycpVar, xru xruVar, Context context, xsa xsaVar, Executor executor, avmb avmbVar, Executor executor2, abvn abvnVar, xnv xnvVar, awmd awmdVar, yar yarVar, ycp ycpVar2, xkw xkwVar, vxz vxzVar) {
        this.e = xwsVar;
        this.f = ycpVar;
        this.b = xruVar;
        this.i = context;
        this.k = xsaVar;
        this.l = executor;
        this.c = avmbVar;
        this.m = executor2;
        this.n = abvnVar;
        this.d = xnvVar;
        this.o = awmdVar;
        this.g = yarVar;
        this.h = ycpVar2;
        this.q = xkwVar;
        this.r = vxzVar;
    }

    @Override // defpackage.gut, defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        aihl aihlVarCheckIsLite = aihn.checkIsLite(ajih.b);
        ajwoVar.c(aihlVarCheckIsLite);
        ahno.F(ajwoVar.j.n(aihlVarCheckIsLite.d));
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(ajih.b);
        ajwoVar.c(aihlVarCheckIsLite2);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
        ajih ajihVar = (ajih) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
        if (this.r.l(105, 45615440L, false)) {
            this.p.a(this.q.i.ao().D(new gkr(this, ajihVar, 4), new glg(6)));
        } else {
            e(ajihVar);
        }
    }

    public final Optional d(xvr xvrVar) {
        aihf aihfVarCreateBuilder = amyl.a.createBuilder();
        String strC = xvrVar.c();
        aihfVarCreateBuilder.copyOnWrite();
        amyl amylVar = (amyl) aihfVarCreateBuilder.instance;
        strC.getClass();
        amylVar.b |= 1;
        amylVar.c = strC;
        String str = xvrVar.d().b;
        aihfVarCreateBuilder.copyOnWrite();
        amyl amylVar2 = (amyl) aihfVarCreateBuilder.instance;
        amylVar2.b |= 8;
        amylVar2.f = str;
        amyl amylVar3 = (amyl) aihfVarCreateBuilder.build();
        dii diiVar = null;
        if (amylVar3 != null && (amylVar3.b & 8) != 0) {
            for (dii diiVar2 : this.k.l(false, false)) {
                if (xsa.b(amylVar3.f, diiVar2.d)) {
                    diiVar = diiVar2;
                    break;
                }
            }
        } else {
            ((agrc) ((agrc) xsa.a.c().i(agso.a, "MDX.RouteUtil")).k("com/google/android/libraries/youtube/mdx/mediaroute/RouteUtil", "getRouteInfoFromMdxScreen", 426, "RouteUtil.java")).t("Invalid MdxScreen.");
        }
        return Optional.ofNullable(diiVar);
    }

    public final void e(ajih ajihVar) {
        ycp ycpVar = this.h;
        int i = 3;
        if (ycpVar.j()) {
            taf.i(aher.a, this.l, new glo(5), new gln(this, i), null);
        } else if (ycpVar.e != null) {
            return;
        }
        algt algtVar = ajihVar.e;
        if (algtVar == null) {
            algtVar = algt.a;
        }
        String str = algtVar.b;
        if (str.isEmpty()) {
            ((agrc) ((agrc) a.c()).k("com/google/android/apps/youtube/music/command/AutoconnectGateCommandResolver", "canUserAutoconnectToReceiver", 297, "AutoconnectGateCommandResolver.java")).t("Discovery Device ID is empty.");
            return;
        }
        if (!this.g.e(str).isPresent()) {
            Optional optionalM = this.k.m(str);
            if (optionalM.isPresent() && xrx.m((dii) optionalM.get()) && !((Boolean) this.o.io()).booleanValue()) {
                return;
            }
        }
        if (ajihVar.d) {
            ((avlh) this.n.r().n).au().u(new gnw(4)).A(500L, TimeUnit.MILLISECONDS, avmc.t(Boolean.FALSE)).D(new gkr(this, ajihVar, i), new glg(7));
            return;
        }
        if (ajihVar.c) {
            g(ajihVar);
            return;
        }
        algt algtVar2 = ajihVar.e;
        if (algtVar2 == null) {
            algtVar2 = algt.a;
        }
        amyv amyvVarA = amyv.a(ajihVar.f);
        if (amyvVarA == null) {
            amyvVarA = amyv.MDX_SESSION_SOURCE_UNKNOWN;
        }
        h(algtVar2, amyvVarA);
    }

    public final void f(dii diiVar, amyv amyvVar, xvr xvrVar) {
        taf.i(aher.a, this.l, new glo(6), new gst(this, amyvVar, diiVar, xvrVar, 0), null);
    }

    public final void g(ajih ajihVar) {
        algt algtVar = ajihVar.e;
        if (algtVar == null) {
            algtVar = algt.a;
        }
        String str = algtVar.b;
        if (str.isEmpty()) {
            return;
        }
        if (!this.k.a(str, this.i).isPresent()) {
            algt algtVar2 = ajihVar.e;
            if (algtVar2 == null) {
                algtVar2 = algt.a;
            }
            this.d.c(new gsv(this, algtVar2.b, ajihVar), true);
            return;
        }
        algt algtVar3 = ajihVar.e;
        if (algtVar3 == null) {
            algtVar3 = algt.a;
        }
        amyv amyvVarA = amyv.a(ajihVar.f);
        if (amyvVarA == null) {
            amyvVarA = amyv.MDX_SESSION_SOURCE_UNKNOWN;
        }
        h(algtVar3, amyvVarA);
    }

    public final void h(algt algtVar, amyv amyvVar) {
        taf.i(aher.a, this.m, new glo(7), new gsu(this, algtVar, amyvVar, 0), null);
    }
}
