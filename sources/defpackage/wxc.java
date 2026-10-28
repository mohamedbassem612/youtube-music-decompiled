package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wxc extends wwy {
    public final ScheduledExecutorService f;
    public final Executor g;
    public final wwx h;
    public final wxf i;
    public final vxz j;
    private final wrb k;
    private final avmb l;
    private final avlw m;
    private final zvl n;
    private final xgm o;

    public wxc(wrb wrbVar, ScheduledExecutorService scheduledExecutorService, Executor executor, avmb avmbVar, tbt tbtVar, ttm ttmVar, wwn wwnVar, xgm xgmVar, wwx wwxVar, zvl zvlVar, vxz vxzVar) {
        super(wrbVar, tbtVar, ttmVar, wwnVar, wwnVar.l);
        this.i = new wxf();
        this.o = xgmVar;
        this.k = wrbVar;
        this.f = scheduledExecutorService;
        this.g = executor;
        this.l = avmbVar;
        this.m = new wxb(this, 0);
        this.h = wwxVar;
        this.n = zvlVar;
        this.j = vxzVar;
    }

    @Override // defpackage.wwy
    public final void a() {
        v();
    }

    @Override // defpackage.wwy
    public final void h() {
        this.i.e(true);
    }

    @Override // defpackage.adtv
    public final void hR(acjw acjwVar) {
        acjx acjxVarHQ = hQ(acjwVar);
        if (acjxVarHQ != null) {
            v();
            u(acjxVarHQ);
        }
    }

    @Override // defpackage.adtv
    public final void iM(acjx acjxVar) {
        if (acjxVar != null) {
            v();
            u(acjxVar);
        }
    }

    @Override // defpackage.wwy
    public final void j(List list) {
        aI(list);
        acjx acjxVarHQ = hQ(acjw.e);
        if (acjxVarHQ == null) {
            acjxVarHQ = hQ(acjw.f);
        }
        if (acjxVarHQ == null) {
            acjxVarHQ = hQ(acjw.d);
        }
        if (acjxVarHQ != null) {
            this.i.f(acjxVarHQ);
        }
        xgn xgnVarHB = this.o.hB();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            byte[] bArrH = ((acjx) it.next()).h();
            if (bArrH != null) {
                if (xgnVarHB.a() != null) {
                    xgnVarHB.d(new xgj(bArrH));
                } else {
                    wwn wwnVar = this.e;
                    wwnVar.l.d(new xgj(bArrH));
                }
            }
        }
    }

    @Override // defpackage.wwy
    public final void k() {
        this.i.e(false);
        v();
    }

    @Override // defpackage.wwy
    public final boolean l() {
        return false;
    }

    @Override // defpackage.wwy
    public final boolean q() {
        return this.i.j();
    }

    public final void u(acjx acjxVar) {
        tns wlqVar;
        wxf wxfVar = this.i;
        if (wxfVar.i() || !wxfVar.j()) {
            return;
        }
        wrb wrbVar = this.k;
        wqu wquVar = new wqu(wrbVar.b, wrbVar.c.e(), wrbVar.h, true);
        wquVar.s(acjxVar);
        hr(wquVar, null);
        wxfVar.d(acjxVar);
        ypp yppVarE = wrbVar.d.e();
        yppVarE.h = wquVar;
        yppVarE.l(alsi.a);
        yppVarE.d = zzd.a;
        yppVarE.g = new wqy(1);
        yppVarE.f = new wph(15);
        wlo wloVarK = yppVarE.k();
        tgg tggVarE = wrbVar.e();
        if (tggVarE instanceof tir) {
            wlqVar = wloVarK;
            wlqVar = new wlq(wloVarK, false);
        }
        wlqVar = wloVarK;
        nsi.g(tggVarE, wlqVar).W(this.l).ak(this.m);
    }

    public final void v() {
        wxf wxfVar = this.i;
        if (wxfVar.l()) {
            wxfVar.c();
        }
    }

    public final void w(String str) {
        zvj zvjVarA = zvk.a();
        zvjVarA.i = 247;
        zvjVarA.j = 33;
        zvjVarA.d(str);
        zvjVarA.c(ajtv.ERROR_LEVEL_WARNING);
        this.n.a(zvjVarA.a());
    }

    @Override // defpackage.adtv
    public final void hN(acjx acjxVar, Timer timer) {
    }
}
