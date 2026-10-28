package defpackage;

import j$.util.Optional;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class xrs implements xzf {
    final /* synthetic */ xru a;

    public xrs(xru xruVar) {
        this.a = xruVar;
    }

    public final /* synthetic */ void a(dii diiVar) {
        xru xruVar = this.a;
        xrj xrjVar = (xrj) xruVar.e.io();
        String str = diiVar.d;
        ahno.F((str.contains(":") && str.lastIndexOf(":") == str.length() + (-1)) ? false : true);
        String strReplace = str.substring(str.lastIndexOf(":") + 1).replace("-", "");
        zj zjVar = new zj((byte[]) null, (short[]) null);
        zjVar.l(xruVar.n);
        zjVar.a = amyv.MDX_SESSION_SOURCE_STREAM_TRANSFER;
        xrjVar.c(strReplace, zjVar.k());
        xruVar.J(diiVar);
        ((wjr) xruVar.f.io()).w(179, "cx_sctts");
    }

    @Override // defpackage.xzf
    public final void g(xzc xzcVar) {
        Optional optionalEmpty;
        xru xruVar = this.a;
        if (!xruVar.o.l(53, 45391510L, false) || !xzcVar.ao()) {
            dii diiVarJ = dij.j();
            xvr xvrVarJ = xzcVar.j();
            if (xvrVarJ != null && xvrVarJ.h()) {
                agrx agrxVar = agso.a;
                xzcVar.j();
                if (xvrVarJ instanceof xvi) {
                    ((yar) xruVar.d.io()).l((xvi) xvrVarJ);
                }
                if (xvrVarJ instanceof xvk) {
                }
            }
            if (xruVar.R(diiVarJ)) {
                ((agrc) ((agrc) xru.a.c().i(agso.a, "MDX.MediaRouteManager")).k("com/google/android/libraries/youtube/mdx/mediaroute/MediaRouteManager$SessionListener", "onMdxSessionEnded", 1023, "MediaRouteManager.java")).t("Unselecting route because session ended");
                xruVar.Q(0);
            }
            xruVar.i = null;
            if (xruVar.h == 0) {
                xruVar.g.b(false);
            }
            xruVar.K(false);
            return;
        }
        agrx agrxVar2 = agso.a;
        xsa xsaVar = (xsa) xruVar.c.io();
        Optional optional = xruVar.m;
        if (xsaVar.d != null && optional.isPresent()) {
            Iterator it = xsaVar.l(false, false).iterator();
            while (true) {
                if (!it.hasNext()) {
                    optionalEmpty = Optional.empty();
                    break;
                }
                dii diiVar = (dii) it.next();
                if (xsa.b((String) optional.get(), diiVar.d)) {
                    optionalEmpty = Optional.of(diiVar);
                    break;
                }
            }
        } else {
            optionalEmpty = Optional.empty();
            break;
        }
        xdd xddVar = new xdd(this, 15);
        if (true == optionalEmpty.isPresent()) {
            ((xrs) xddVar.a).a((dii) optionalEmpty.get());
        }
        xruVar.O();
        xzcVar.az(xruVar.p);
    }

    @Override // defpackage.xzf
    public final void jv(xzc xzcVar) {
        xru xruVar = this.a;
        xruVar.i = xzcVar;
        if (xruVar.o.l(53, 45391510L, false)) {
            xzcVar.ay(xruVar.p);
        }
    }

    @Override // defpackage.xzf
    public final /* synthetic */ void h(xzc xzcVar) {
    }
}
