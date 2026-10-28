package defpackage;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.engagementpanel.LinearScrollToItemLayoutManager;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class vrx extends vrk implements adww {
    private final acyx A;
    private View B;
    private final vnr E;
    private final vxz F;
    private final vxz G;
    private final vxz H;
    private qa I;
    public final xgn d;
    public final aunn f;
    public final vxe g;
    public adwg h;
    public RecyclerView i;
    aeei j;
    public final hbu k;
    public final abxu l;
    private final Context m;
    private final adne n;
    private final wnf o;
    private final vph p;
    private final vps q;
    private final aeda r;
    private final adgj s;
    private adgk t;
    private adxd u;
    private aksk v;
    private final boolean w;
    private SwipeRefreshLayout x;
    private FrameLayout y;
    private final acxt z;
    private boolean C = false;
    public final awkx e = new awkx();
    private final vpg D = new vpg();

    public vrx(Context context, hbu hbuVar, aeda aedaVar, adne adneVar, vxz vxzVar, aunn aunnVar, vxe vxeVar, adgj adgjVar, abxu abxuVar, vxz vxzVar2, vxz vxzVar3, acxt acxtVar, acyx acyxVar, xgn xgnVar, wnf wnfVar, vph vphVar, vnr vnrVar, vps vpsVar) {
        this.m = context;
        this.k = hbuVar;
        this.d = xgnVar;
        this.o = wnfVar;
        this.p = vphVar;
        this.E = vnrVar;
        this.q = vpsVar;
        this.n = adneVar;
        this.F = vxzVar;
        this.f = aunnVar;
        this.r = aedaVar;
        this.g = vxeVar;
        this.s = adgjVar;
        this.l = abxuVar;
        this.G = vxzVar2;
        this.H = vxzVar3;
        this.z = acxtVar;
        this.A = acyxVar;
        this.w = vxzVar3.l(337, 45781749L, false) || vpo.e(vnrVar);
    }

    private final void A() {
        char c;
        apoq apoqVar = (apoq) this.b;
        FrameLayout frameLayout = this.y;
        RecyclerView recyclerView = this.i;
        if (apoqVar == null || recyclerView == null || frameLayout == null) {
            return;
        }
        x(frameLayout, recyclerView);
        if ((apoqVar.c & 32) != 0) {
            apon aponVar = apoqVar.i;
            if (aponVar == null) {
                aponVar = apon.a;
            }
            int i = aponVar.b;
            if (i == 415055857) {
                akzh akzhVar = i == 415055857 ? (akzh) aponVar.c : akzh.a;
                aqpv aqpvVar = akzhVar.c;
                if (aqpvVar == null) {
                    aqpvVar = aqpv.a;
                }
                if (aqpvVar.b == 1) {
                    aqpv aqpvVar2 = akzhVar.c;
                    if (aqpvVar2 == null) {
                        aqpvVar2 = aqpv.a;
                    }
                    aqpu aqpuVar = aqpvVar2.b == 1 ? (aqpu) aqpvVar2.c : aqpu.a;
                    if (aqpuVar.b == 0) {
                        int i2 = aqpuVar.c;
                        if (i2 != 0) {
                            c = i2 != 1 ? (char) 0 : (char) 3;
                        } else {
                            c = 2;
                        }
                        if (c == 0 || c != 3) {
                            return;
                        }
                        apji apjiVar = akzhVar.b;
                        if (apjiVar == null) {
                            apjiVar = apji.a;
                        }
                        aihl aihlVar = akru.b;
                        aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
                        apjiVar.c(aihlVarCheckIsLite);
                        if (apjiVar.j.n(aihlVarCheckIsLite.d)) {
                            apji apjiVar2 = akzhVar.b;
                            if (apjiVar2 == null) {
                                apjiVar2 = apji.a;
                            }
                            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
                            apjiVar2.c(aihlVarCheckIsLite2);
                            Object objK = apjiVar2.j.k(aihlVarCheckIsLite2.d);
                            if ((((akru) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK))).c & 1) != 0) {
                                apon aponVar2 = apoqVar.i;
                                if (aponVar2 == null) {
                                    aponVar2 = apon.a;
                                }
                                apji apjiVar3 = (aponVar2.b == 415055857 ? (akzh) aponVar2.c : akzh.a).b;
                                if (apjiVar3 == null) {
                                    apjiVar3 = apji.a;
                                }
                                aihl aihlVarCheckIsLite3 = aihn.checkIsLite(aihlVar);
                                apjiVar3.c(aihlVarCheckIsLite3);
                                Object objK2 = apjiVar3.j.k(aihlVarCheckIsLite3.d);
                                Object objC = objK2 == null ? aihlVarCheckIsLite3.b : aihlVarCheckIsLite3.c(objK2);
                                aihh aihhVar = (aihh) akrn.a.createBuilder();
                                asmv asmvVar = ((akru) objC).d;
                                if (asmvVar == null) {
                                    asmvVar = asmv.a;
                                }
                                acxu.b(aihhVar, asmvVar);
                                acxm acxmVarC = this.A.c((akrn) aihhVar.build());
                                adly adlyVar = new adly();
                                adlyVar.g(new HashMap());
                                adlyVar.a(this.d);
                                acxt acxtVar = this.z;
                                acxtVar.h(adlyVar, acxmVarC, false, false);
                                View viewA = acxtVar.a();
                                if (viewA != null) {
                                    this.B = viewA;
                                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                                    layoutParams.gravity = 8388661;
                                    Context context = this.m;
                                    int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.engagement_panel_fab_margin);
                                    int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.engagement_panel_fab_top_margin);
                                    if (this.G.l(236, 45827088L, false)) {
                                        int dimensionPixelSize3 = context.getResources().getDimensionPixelSize(R.dimen.engagement_panel_fab_shadow_padding);
                                        int iMax = Math.max(0, dimensionPixelSize - dimensionPixelSize3);
                                        layoutParams.setMargins(iMax, Math.max(0, dimensionPixelSize2 - dimensionPixelSize3), iMax, iMax);
                                    } else {
                                        layoutParams.setMargins(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize);
                                    }
                                    viewA.setLayoutParams(layoutParams);
                                    viewA.setFocusable(true);
                                    viewA.setImportantForAccessibility(1);
                                    viewA.setVisibility(8);
                                    if (this.H.l(204, 45685365L, false)) {
                                        viewA.setTranslationZ(1.0f);
                                    }
                                    frameLayout.addView(viewA);
                                    if (this.I == null) {
                                        this.I = new vrv(this);
                                    }
                                    recyclerView.aC(this.I);
                                    w(recyclerView);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private final void B() {
        SwipeRefreshLayout swipeRefreshLayout;
        FrameLayout frameLayout = this.y;
        if (frameLayout != null) {
            if (!vpo.e(this.E)) {
                this.D.a();
                return;
            }
            this.D.c(frameLayout, (!this.r.h() || (swipeRefreshLayout = this.x) == null) ? this.m : swipeRefreshLayout.getContext());
            View view = this.B;
            if (view != null) {
                view.bringToFront();
            }
        }
    }

    private final void x(FrameLayout frameLayout, RecyclerView recyclerView) {
        View view = this.B;
        if (view != null) {
            frameLayout.removeView(view);
            this.B = null;
            qa qaVar = this.I;
            if (qaVar != null) {
                recyclerView.aE(qaVar);
            }
            this.C = false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:65:0x0219  */
    /* JADX WARN: Code duplicated, block: B:67:0x021d  */
    private final void y() {
        aeei aeeiVar;
        Object obj;
        SwipeRefreshLayout swipeRefreshLayout = this.x;
        if (swipeRefreshLayout == null || this.i == null || this.h == null || (this.w && this.y == null)) {
            if (swipeRefreshLayout == null || this.i == null || this.h == null) {
                hbu hbuVar = this.k;
                RecyclerView recyclerView = hbuVar.f;
                if (recyclerView == null) {
                    hbuVar.f = (RecyclerView) LayoutInflater.from(hbuVar.a).inflate(R.layout.engagement_panel_section_list, (ViewGroup) null);
                    recyclerView = hbuVar.f;
                }
                this.i = recyclerView;
                recyclerView.addOnLayoutChangeListener(new jfx(this, 10));
                RecyclerView recyclerView2 = this.i;
                Context context = this.m;
                recyclerView2.ah(new LinearScrollToItemLayoutManager(context));
                if (this.F.l(6, 45371400L, false)) {
                    adne adneVar = this.n;
                    adneVar.u();
                    this.i.af(adneVar);
                } else {
                    nl nlVar = this.i.E;
                    if (nlVar != null) {
                        ((on) nlVar).u();
                    }
                }
                this.x = (SwipeRefreshLayout) LayoutInflater.from(context).inflate(R.layout.engagement_panel_swipe_refresh_layout, (ViewGroup) null);
                if (this.r.h()) {
                    context = this.x.getContext();
                }
                this.x.i(tzk.n(context, R.attr.ytEngagementPanelSwipeRefreshLayoutColorSchemeColor).orElse(-16777216));
                this.x.j(tzk.n(context, R.attr.ytEngagementPanelSwipeRefreshLayoutProgressBackgroundColor).orElse(-1));
                this.x.setBackgroundColor(tzk.n(context, R.attr.ytBrandBackgroundSolid).orElse(-16777216));
                this.x.addView(this.i);
                RecyclerView recyclerView3 = this.i;
                SwipeRefreshLayout swipeRefreshLayout2 = this.x;
                wnf wnfVar = this.o;
                vph vphVar = this.p;
                xgn xgnVar = this.d;
                adxd adxdVar = this.u;
                adwg adwgVarA = hbuVar.g;
                if (adwgVarA == null) {
                    if (hbuVar.i.t()) {
                        swipeRefreshLayout2.setBackgroundColor(hbuVar.a.getResources().getColor(R.color.music_full_transparent));
                    }
                    jhh jhhVarL = hbuVar.l.l(swipeRefreshLayout2);
                    jax jaxVar = hbuVar.b;
                    jaf jafVar = new jaf();
                    jafVar.o(recyclerView3);
                    jafVar.f(new LinearScrollToItemLayoutManager(hbuVar.a));
                    jafVar.p(hbuVar.j);
                    jafVar.q(hbuVar.k);
                    jafVar.g(hbuVar.c);
                    jafVar.j(wnfVar);
                    jafVar.l(vphVar);
                    jafVar.m(hbuVar.d.a);
                    jafVar.e(xgnVar);
                    jafVar.i(this);
                    jafVar.h(jhhVarL);
                    jafVar.n(adxdVar);
                    adwgVarA = jaxVar.a(jafVar.a());
                    jhhVarL.a = adwgVarA;
                    hbuVar.e = jhhVarL;
                    hbuVar.g = adwgVarA;
                }
                this.h = adwgVarA;
                opf opfVarA = oph.a();
                opfVarA.c = new tar(this, 4);
                opfVarA.a = aecm.y(this.i);
                adgk adgkVarA = this.s.a(opfVarA.a());
                this.t = adgkVarA;
                this.h.L(adgkVarA);
                Set set = this.a;
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    this.h.L((adlz) it.next());
                }
                set.clear();
                adwg adwgVar = this.h;
                adwgVar.ao = new gnu(this, 4);
                adwgVar.w.add(new vrw(this));
                boolean zL = this.H.l(372, 45812899L, false);
                Object obj2 = this.b;
                if (zL) {
                    if (obj2 != null) {
                        if (this.u == null) {
                            this.h.as(new wgd((apoq) obj2));
                        } else {
                            u((apoq) obj2);
                        }
                        this.h.ah(this.c);
                    }
                } else if (obj2 != null) {
                    this.h.as(new wgd((apoq) obj2));
                    this.h.ah(this.c);
                }
            }
            if (this.w && this.y == null) {
                FrameLayout frameLayout = new FrameLayout(this.m);
                this.y = frameLayout;
                frameLayout.addView(this.x);
            }
            vxz vxzVar = this.H;
            if (!vxzVar.l(337, 45781749L, false) || (obj = this.b) == null) {
                aeeiVar = this.j;
                if (aeeiVar != null) {
                    aeeiVar.e();
                    this.j = null;
                }
            } else {
                apoo apooVar = ((apoq) obj).h;
                if (apooVar == null) {
                    apooVar = apoo.a;
                }
                if (apooVar.b == 153515154) {
                    z();
                } else {
                    aeeiVar = this.j;
                    if (aeeiVar != null) {
                        aeeiVar.e();
                        this.j = null;
                    }
                }
            }
            if (!vxzVar.l(204, 45685365L, false)) {
                B();
            }
            A();
        }
    }

    private final void z() {
        FrameLayout frameLayout;
        nh nhVar;
        RecyclerView recyclerView = this.i;
        if (recyclerView == null || this.x == null || (frameLayout = this.y) == null || this.j != null || (nhVar = recyclerView.m) == null) {
            return;
        }
        this.j = new aeei(frameLayout, recyclerView, nhVar, this.G);
    }

    @Override // defpackage.vox
    public final void c() {
        RecyclerView recyclerView;
        adwg adwgVar = this.h;
        if (adwgVar != null) {
            adwgVar.i();
        }
        aeei aeeiVar = this.j;
        if (aeeiVar != null) {
            aeeiVar.e();
            this.j = null;
        }
        FrameLayout frameLayout = this.y;
        if (frameLayout != null && (recyclerView = this.i) != null) {
            x(frameLayout, recyclerView);
        }
        hbu hbuVar = this.k;
        if (hbuVar.e != null) {
            hbuVar.e = null;
            hbuVar.g = null;
            hbuVar.f = null;
        }
    }

    @Override // defpackage.vox
    public final void d() {
        SwipeRefreshLayout swipeRefreshLayout = this.x;
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.k(false);
            this.x.clearAnimation();
        }
    }

    @Override // defpackage.vox
    public final void f() {
        adwg adwgVar = this.h;
        if (adwgVar != null) {
            adwgVar.R();
        }
    }

    @Override // defpackage.vrk, defpackage.vro
    public final adxd g() {
        if (!this.H.l(372, 45812899L, false)) {
            return null;
        }
        adwg adwgVar = this.h;
        return adwgVar != null ? adwgVar.hq() : this.u;
    }

    @Override // defpackage.vrk, defpackage.vro
    public final agev h() {
        adwg adwgVar = this.h;
        return adwgVar == null ? agdf.a : agev.h(adwgVar.I());
    }

    @Override // defpackage.vro
    public final void hP() {
        adwg adwgVar = this.h;
        if (adwgVar != null) {
            adwgVar.hP();
        }
    }

    @Override // defpackage.vrk, defpackage.vro
    public final void i(adlz adlzVar) {
        adwg adwgVar = this.h;
        if (adwgVar != null) {
            adwgVar.L(adlzVar);
        } else {
            super.i(adlzVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0085  */
    /* JADX WARN: Code duplicated, block: B:37:0x0089  */
    @Override // defpackage.vrk, defpackage.vro
    public final /* bridge */ /* synthetic */ void j(Object obj, boolean z, adxd adxdVar) {
        aeei aeeiVar;
        apoq apoqVar = (apoq) obj;
        apoq apoqVar2 = (apoq) this.b;
        super.j(apoqVar, z, adxdVar);
        vxz vxzVar = this.H;
        if (vxzVar.l(372, 45812899L, false)) {
            this.u = adxdVar;
        }
        this.v = null;
        if (this.h != null) {
            if (!vxzVar.l(372, 45812899L, false)) {
                adwg adwgVar = this.h;
                if (apoqVar != null) {
                    adwgVar.as(new wgd(apoqVar));
                    this.h.ah(z);
                } else {
                    adwgVar.M(false);
                    apoqVar = null;
                }
            } else if (apoqVar != null) {
                boolean z2 = true;
                if (apoqVar2 != null && apoqVar2.equals(apoqVar)) {
                    z2 = false;
                }
                if (adxdVar == null || z2) {
                    this.h.as(new wgd(apoqVar));
                } else {
                    u(apoqVar);
                }
                this.h.ah(z);
            } else {
                this.h.M(false);
                apoqVar = null;
            }
            if (!vxzVar.l(337, 45781749L, false) || apoqVar == null) {
                aeeiVar = this.j;
                if (aeeiVar != null) {
                    aeeiVar.e();
                    this.j = null;
                }
            } else {
                apoo apooVar = apoqVar.h;
                if (apooVar == null) {
                    apooVar = apoo.a;
                }
                if (apooVar.b == 153515154) {
                    z();
                } else {
                    aeeiVar = this.j;
                    if (aeeiVar != null) {
                        aeeiVar.e();
                        this.j = null;
                    }
                }
            }
            if (!vxzVar.l(204, 45685365L, false)) {
                B();
            }
            A();
        }
    }

    @Override // defpackage.adww
    public final boolean jf() {
        return false;
    }

    @Override // defpackage.vro
    public final View k() {
        y();
        if (!this.w) {
            return this.x;
        }
        FrameLayout frameLayout = this.y;
        if (frameLayout == null) {
            throw new IllegalStateException("contentContainer is null but useContentContainer is true");
        }
        return frameLayout;
    }

    @Override // defpackage.vro
    public final agev l() {
        adwg adwgVar = this.h;
        return adwgVar == null ? agdf.a : agev.i(adwgVar.as);
    }

    @Override // defpackage.vro
    public final agev m() {
        return agev.h(this.i);
    }

    @Override // defpackage.vro
    public final void n(acjx acjxVar) {
        adwg adwgVar = this.h;
        if (adwgVar != null) {
            adwgVar.iM(acjxVar);
        }
    }

    @Override // defpackage.vro
    public final void o() {
        adwg adwgVar = this.h;
        if (adwgVar != null) {
            adwgVar.W();
        }
    }

    public final agev p() {
        adwg adwgVar = this.h;
        return adwgVar == null ? agdf.a : agev.h(adwgVar.al);
    }

    @Override // defpackage.vro
    public final void q() {
        y();
    }

    @Override // defpackage.vro
    public final void r() {
        adwg adwgVar = this.h;
        if (adwgVar != null) {
            adwgVar.a();
        }
    }

    @Override // defpackage.vro
    public final boolean s() {
        jhh jhhVar = this.k.e;
        return jhhVar != null && jhhVar.b;
    }

    @Override // defpackage.vro
    public final boolean t() {
        this.q.p();
        SwipeRefreshLayout swipeRefreshLayout = this.x;
        return swipeRefreshLayout != null && swipeRefreshLayout.b;
    }

    public final void u(apoq apoqVar) {
        aksk akskVar = null;
        if ((apoqVar.c & 64) != 0) {
            apji apjiVar = apoqVar.j;
            if (apjiVar == null) {
                apjiVar = apji.a;
            }
            aihl aihlVarCheckIsLite = aihn.checkIsLite(aksl.a);
            apjiVar.c(aihlVarCheckIsLite);
            if (apjiVar.j.n(aihlVarCheckIsLite.d)) {
                apji apjiVar2 = apoqVar.j;
                if (apjiVar2 == null) {
                    apjiVar2 = apji.a;
                }
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aksl.a);
                apjiVar2.c(aihlVarCheckIsLite2);
                Object objK = apjiVar2.j.k(aihlVarCheckIsLite2.d);
                akskVar = (aksk) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
            } else {
                apji apjiVar3 = apoqVar.j;
                if (apjiVar3 == null) {
                    apjiVar3 = apji.a;
                }
                aihl aihlVarCheckIsLite3 = aihn.checkIsLite(akrs.a);
                apjiVar3.c(aihlVarCheckIsLite3);
                if (apjiVar3.j.n(aihlVarCheckIsLite3.d)) {
                    aihf aihfVarCreateBuilder = aksk.a.createBuilder();
                    apji apjiVar4 = apoqVar.j;
                    if (apjiVar4 == null) {
                        apjiVar4 = apji.a;
                    }
                    aihfVarCreateBuilder.copyOnWrite();
                    aksk akskVar2 = (aksk) aihfVarCreateBuilder.instance;
                    apjiVar4.getClass();
                    akskVar2.c = apjiVar4;
                    akskVar2.b |= 1;
                    akskVar = (aksk) aihfVarCreateBuilder.build();
                }
            }
        }
        if (!this.H.l(372, 45812899L, false)) {
            this.v = akskVar;
            this.E.X(akskVar);
        } else if (akskVar != null || this.v == null) {
            this.v = akskVar;
            this.E.X(akskVar);
        }
    }

    @Override // defpackage.adwm
    public final boolean v(final String str, final int i, Runnable runnable) {
        RecyclerView recyclerView = this.i;
        if (recyclerView == null) {
            return false;
        }
        recyclerView.requestLayout();
        avti avtiVar = new avti(this.e.x(new sqj(13)), Boolean.FALSE, 0);
        avnn avnnVar = atqp.o;
        avtiVar.h(new sqj(14)).e().E(new avnd() { // from class: vru
            @Override // defpackage.avnd
            public final void a() {
                adwg adwgVar = this.a.h;
                if (adwgVar != null) {
                    adwgVar.v(str, i, null);
                }
            }
        });
        return true;
    }

    public final void w(RecyclerView recyclerView) {
        View view = this.B;
        if (view != null) {
            np npVar = recyclerView.n;
            if (npVar instanceof LinearLayoutManager) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) npVar;
                View viewFindViewByPosition = linearLayoutManager.findViewByPosition(0);
                if (viewFindViewByPosition == null ? linearLayoutManager.findFirstVisibleItemPosition() <= 0 : viewFindViewByPosition.getBottom() > recyclerView.getPaddingTop()) {
                    if (this.C) {
                        this.C = false;
                        view.setVisibility(8);
                        return;
                    }
                    return;
                }
                if (this.C) {
                    return;
                }
                this.C = true;
                view.setVisibility(0);
            }
        }
    }

    @Override // defpackage.vox
    public final void b() {
    }
}
