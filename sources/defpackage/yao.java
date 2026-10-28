package defpackage;

import j$.util.Objects;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class yao implements xnu {
    final /* synthetic */ yar a;
    private final Set b;

    public yao(yar yarVar, Set set) {
        this.a = yarVar;
        this.b = set;
    }

    @Override // defpackage.xnu
    public final void a(xvn xvnVar) {
        yar yarVar = this.a;
        yco ycoVar = ((ycp) yarVar.h.io()).e;
        if (ycoVar != null && ycoVar.b() != 0 && xvnVar.equals(ycoVar.j()) && xvnVar.k().a == 2) {
            agrx agrxVar = agso.a;
            taf.g(ycoVar.q(amyu.MDX_SESSION_DISCONNECT_REASON_SCREEN_APP_STOPPED, Optional.empty()), new uqk(4));
            yarVar.m(xvnVar);
            this.b.remove(xvnVar);
            return;
        }
        ConcurrentHashMap concurrentHashMap = yarVar.j;
        xwc xwcVar = xvnVar.n;
        concurrentHashMap.put(xwcVar, 0);
        xvn xvnVarU = yarVar.u(xwcVar);
        if (xvnVarU == null) {
            yarVar.t(xvnVar);
        } else {
            xva xvaVarK = xvnVar.k();
            xva xvaVarK2 = xvnVarU.k();
            if (xvaVarK != xvaVarK2 && ((xvaVarK2 == null || !Objects.equals(xvaVarK.d, xvaVarK2.d) || xvaVarK.b != xvaVarK2.b || !xvaVarK.g.equals(xvaVarK2.g)) && ((ycoVar == null || !(ycoVar.j() instanceof xvn) || !xwcVar.equals(ycoVar.j().d())) && ((!xvnVar.s() && !xvnVarU.s()) || (!xvnVar.r() && xvnVarU.r()))))) {
                yarVar.t(xvnVar);
            }
        }
        this.b.remove(xvnVar);
    }

    @Override // defpackage.xnu
    public final /* synthetic */ void b() {
    }
}
