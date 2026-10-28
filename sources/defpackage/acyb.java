package defpackage;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import com.google.android.apps.youtube.music.R;
import j$.util.Optional;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acyb {
    public final xgn a;
    final adzd b;
    View c;
    View d;
    View e;
    RecyclerView f;
    aebp g;
    public String h;
    public boolean i = false;
    public final boolean j;
    public PopupWindow.OnDismissListener k;
    public avmm l;
    public final vxz m;
    public final vxz n;
    private final Context o;
    private final aunn p;
    private final nuc q;
    private final awmd r;
    private final awmd s;
    private final akrn t;
    private final boolean u;
    private final Object v;
    private final Map w;
    private final tqj x;
    private final afip y;

    public acyb(Context context, aunn aunnVar, afip afipVar, vxz vxzVar, nuc nucVar, awmd awmdVar, awmd awmdVar2, vxz vxzVar2, tqj tqjVar, hhb hhbVar, hhb hhbVar2, View view, Object obj, Map map, xgn xgnVar, akrn akrnVar, adzc adzcVar) {
        this.o = context;
        this.p = aunnVar;
        this.m = vxzVar;
        this.q = nucVar;
        this.r = awmdVar;
        this.s = awmdVar2;
        this.n = vxzVar2;
        this.a = xgnVar;
        this.t = akrnVar;
        this.v = obj;
        this.w = map;
        this.y = afipVar;
        this.j = vxzVar2.l(7, 45386417L, false);
        boolean zL = vxzVar2.l(135, 45753913L, false);
        this.u = zL;
        View view2 = this.c;
        if (zL) {
            View view3 = this.d;
            View view4 = this.e;
            ghi ghiVar = (ghi) hhbVar2.a;
            ghj ghjVar = ghiVar.b;
            this.b = new adze((Context) ghjVar.b.io(), (adxl) ghjVar.W.io(), view, view2, view3, view4, (ci) ghjVar.bu.io(), (vxz) ghiVar.a.cB.io(), adzcVar);
        } else {
            View view5 = this.d;
            View view6 = this.e;
            boolean z = adzcVar.a;
            ghi ghiVar2 = (ghi) hhbVar.a;
            ghj ghjVar2 = ghiVar2.b;
            this.b = new adzb((Context) ghjVar2.b.io(), (adxl) ghjVar2.W.io(), view, view2, view5, view6, (ci) ghjVar2.bu.io(), (vxz) ghiVar2.a.cB.io(), z);
        }
        this.x = tqjVar;
    }

    private final View e(aigj aigjVar, avmm avmmVar) {
        if (aigjVar == null) {
            return null;
        }
        if (!this.u) {
            return aecm.aF(this.o, (mlo) this.p.io(), aigjVar, this.a, this.v, this.w, this.t, avmmVar, this.y);
        }
        ntw ntwVarA = ntx.a(((mlo) this.p.io()).a);
        ntwVarA.c(false);
        ntwVarA.g = agke.q(aawb.ad(this.v, null, this.w));
        afip afipVar = this.y;
        xgn xgnVar = this.a;
        ntwVarA.i = afipVar.f(xgnVar, this.t);
        mel melVar = new mel(this.o, ntwVarA.a());
        melVar.b = new adat(xgnVar);
        melVar.a(aigjVar.G(), null);
        return melVar;
    }

    public final Optional a() {
        return Optional.ofNullable(this.h);
    }

    public final void b(adzr adzrVar) {
        this.b.b(adzrVar);
    }

    public final void c(List list, aigj aigjVar, aigj aigjVar2, boolean z) {
        RecyclerView recyclerView;
        avmm avmmVar = this.l;
        if (avmmVar != null) {
            avmmVar.dispose();
        }
        avmm avmmVar2 = new avmm();
        this.l = avmmVar2;
        aebp aebpVar = this.g;
        RecyclerView recyclerView2 = this.f;
        RecyclerView recyclerView3 = null;
        if (aebpVar != null && recyclerView2 != null) {
            aebpVar.b(recyclerView2);
            if (this.m.l(301, 45702412L, false)) {
                aebpVar.f();
            }
            this.g = null;
        }
        this.d = e(aigjVar, avmmVar2);
        this.e = e(aigjVar2, avmmVar2);
        if (!z || list.isEmpty()) {
            if (!list.isEmpty()) {
                boolean z2 = this.u;
                Context context = this.o;
                if (z2) {
                    recyclerView = (RecyclerView) LayoutInflater.from(context).inflate(R.layout.contextual_sheet_recycler_view, (ViewGroup) null);
                } else {
                    recyclerView = new RecyclerView(context);
                    recyclerView.ah(new LinearLayoutManager(context));
                }
                RecyclerView recyclerView4 = recyclerView;
                this.f = recyclerView4;
                if (this.n.l(94, 45696801L, false)) {
                    aebp aebpVarAG = aecm.aG(aecm.Q(list), recyclerView4, (mlo) this.p.io(), this.m, this.a, this.r, this.y, this.s, this.x);
                    recyclerView4 = recyclerView4;
                    this.g = aebpVarAG;
                } else {
                    this.g = aecm.aH(list, recyclerView4, (mlo) this.p.io(), this.m, this.a, this.r, this.y, this.s, this.x);
                }
                recyclerView3 = recyclerView4;
            }
            this.c = recyclerView3;
        } else {
            this.c = e((aigj) list.get(0), avmmVar2);
            this.f = null;
        }
        this.b.f(this.c, this.d, this.e);
    }

    public final void d() {
        acya acyaVar = new acya(this, 0);
        adzd adzdVar = this.b;
        adzdVar.d(acyaVar);
        adzdVar.e();
    }
}
