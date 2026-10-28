package defpackage;

import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.apps.youtube.music.R;
import com.google.android.apps.youtube.music.ui.components.loading.LoadingFrameLayout;
import com.google.android.apps.youtube.music.ui.refresh.MusicSwipeRefreshLayout;
import com.google.android.apps.youtube.music.ui.tabs.TabbedView;
import com.google.android.material.appbar.AppBarLayout;
import j$.util.Collection;
import j$.util.Optional;
import java.util.HashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class goc extends goh implements hkw {
    private static final agrf af = agrf.h("com/google/android/apps/youtube/music/browse/ExploreBrowseFragment");
    public wom U;
    public izf V;
    public tbt W;
    public jaz X;
    public ttm Y;
    public jax Z;
    protected adma aa;
    public View ab;
    public kwq ac;
    public aehs ad;
    public hhb ae;
    private CoordinatorLayout ag;
    private advd ah;
    private SwipeRefreshLayout ai;
    private jce aj;
    private grn ak;
    private gro al;
    private grt am;
    private final ivz an = new ivz(new gpd(this, 1));

    private final boolean U() {
        heh hehVar = this.s;
        return hehVar != null && TextUtils.equals("FEmusic_explore", hehVar.b());
    }

    @Override // defpackage.gnf, defpackage.hkw
    public final void C() {
        RecyclerView recyclerView;
        if (kro.M(this) || (recyclerView = this.al.c) == null) {
            return;
        }
        recyclerView.aj(0);
        k();
    }

    @Override // defpackage.gnf
    public final void G() {
        grn grnVar = this.ak;
        if (grnVar != null) {
            this.ak = this.ac.u(grnVar, this.al);
        }
        Optional optionalE = e();
        gfi gfiVar = new gfi(this, 12);
        if (true == optionalE.isPresent()) {
            ((AppBarLayout.BaseBehavior) optionalE.get()).setTopAndBottomOffset(((goc) gfiVar.a).x);
        }
    }

    @Override // defpackage.gnf
    public final Optional e() {
        grn grnVar = this.ak;
        if (grnVar == null) {
            return Optional.empty();
        }
        AppBarLayout appBarLayoutE = grnVar.e();
        if (appBarLayoutE == null) {
            return Optional.empty();
        }
        ViewGroup.LayoutParams layoutParams = appBarLayoutE.getLayoutParams();
        if (!(layoutParams instanceof asv)) {
            return Optional.empty();
        }
        ast astVar = ((asv) layoutParams).a;
        return !(astVar instanceof AppBarLayout.Behavior) ? Optional.empty() : Optional.of((AppBarLayout.Behavior) astVar);
    }

    @Override // defpackage.gnf
    public final String f() {
        return "music_android_explore";
    }

    @Override // defpackage.gnf
    public final void k() {
        grn grnVar;
        AppBarLayout appBarLayoutE;
        if (J() || kro.M(this) || (grnVar = this.ak) == null || (appBarLayoutE = grnVar.e()) == null) {
            return;
        }
        appBarLayoutE.l(true, false, true);
    }

    @Override // defpackage.gnf
    protected final void l() {
        grn grnVar = this.ak;
        if (grnVar != null) {
            this.ak = this.ac.u(grnVar, this.al);
        }
    }

    @Override // defpackage.cc, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        jhs jhsVar = this.u;
        if (jhsVar != null) {
            jhsVar.k(configuration);
        }
        adma admaVar = this.aa;
        if (admaVar instanceof gdy) {
            ((gdy) admaVar).hS(configuration);
        }
    }

    @Override // defpackage.gnf, defpackage.cc
    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        super.onCreateOptionsMenu(menu, menuInflater);
        grn grnVar = this.ak;
        if (grnVar != null) {
            grnVar.h(menu, menuInflater);
        }
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [adxj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [adxj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v2, types: [adxj, java.lang.Object] */
    @Override // defpackage.cc
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        goc gocVar;
        grn gruVar;
        AppBarLayout appBarLayout;
        this.ag = (CoordinatorLayout) layoutInflater.inflate(R.layout.explore_browse_fragment, viewGroup, false);
        if (this.I.l(31, 45757116L, false)) {
            this.ag.setBackgroundColor(requireContext().getColor(R.color.theme_main_window_background));
        }
        hil hilVar = new hil();
        hilVar.b(this.s);
        gro groVarA = hilVar.a();
        this.al = groVarA;
        kwq kwqVar = this.ac;
        CoordinatorLayout coordinatorLayout = this.ag;
        heh hehVar = groVarA.a;
        if (TextUtils.equals("FEmusic_explore", hehVar.b())) {
            gocVar = this;
            gruVar = new grp(gocVar, coordinatorLayout, (iwe) kwqVar.c, (avlh) kwqVar.a, (avmb) kwqVar.b);
        } else {
            gocVar = this;
            if (grv.q(hehVar)) {
                Object obj = kwqVar.c;
                iwe iweVar = (iwe) obj;
                gruVar = new grv(gocVar, coordinatorLayout, iweVar, (avlh) kwqVar.a, (avmb) kwqVar.b, kwqVar.d);
            } else if (TextUtils.equals("FEmusic_moods_and_genres_category", hehVar.b()) || TextUtils.equals("FEmusic_new_releases_videos", hehVar.b()) || TextUtils.equals("FEmusic_new_releases_albums", hehVar.b())) {
                Object obj2 = kwqVar.c;
                iwe iweVar2 = (iwe) obj2;
                gruVar = new gru(gocVar, coordinatorLayout, iweVar2, (avlh) kwqVar.a, (avmb) kwqVar.b, kwqVar.d);
            } else if (grs.q(hehVar)) {
                gruVar = new grs(gocVar, coordinatorLayout, (iwe) kwqVar.c, (avlh) kwqVar.a, (avmb) kwqVar.b);
            } else {
                Object obj3 = kwqVar.c;
                iwe iweVar3 = (iwe) obj3;
                gruVar = new gru(gocVar, coordinatorLayout, iweVar3, (avlh) kwqVar.a, (avmb) kwqVar.b, kwqVar.d);
            }
        }
        gruVar.l(groVarA);
        gocVar.ak = gruVar;
        LoadingFrameLayout loadingFrameLayoutD = gruVar.d();
        if (loadingFrameLayoutD != null) {
            loadingFrameLayoutD.e(new gpa(gocVar, 1));
            gocVar.P = gocVar.O.s(loadingFrameLayoutD);
            gocVar.C = (TabbedView) loadingFrameLayoutD.findViewById(R.id.tabbed_view);
            gocVar.u = new jhs(gocVar.C, null, null, gocVar.e);
            gocVar.aj = gocVar.ad.v(gocVar.ag);
            gocVar.j(loadingFrameLayoutD);
            TabbedView tabbedView = gocVar.C;
            if (tabbedView != null) {
                tabbedView.t(gocVar.V);
            }
        }
        gocVar.ah = gocVar.X.a(gocVar.U, gocVar.e);
        grn grnVar = gocVar.ak;
        if (grnVar != null) {
            gocVar.B = grnVar.b();
            if (grnVar.f() != null) {
                gocVar.ab = grnVar.f().findViewById(R.id.collapsing_toolbar_layout_background_container);
            }
            gocVar.A = gocVar.ak.e();
            if (gocVar.B != null && (appBarLayout = gocVar.A) != null) {
                appBarLayout.h(gocVar.an);
            }
        }
        return gocVar.ag;
    }

    @Override // defpackage.gnf, defpackage.cc
    public final void onDestroyView() {
        jce jceVar;
        this.ai = null;
        adma admaVar = this.aa;
        if (admaVar != null && (jceVar = this.aj) != null) {
            admaVar.b(jceVar.a);
            this.aa = null;
        }
        this.aj = null;
        this.ag = null;
        this.ab = null;
        AppBarLayout appBarLayout = this.A;
        if (appBarLayout != null) {
            appBarLayout.j(this.an);
        }
        super.onDestroyView();
        grn grnVar = this.ak;
        if (grnVar != null) {
            grnVar.g();
            this.ak = null;
        }
    }

    @Override // defpackage.gnf, defpackage.cc
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        G();
        TabbedView tabbedView = this.C;
        if (tabbedView != null) {
            tabbedView.y(getContext().getColor(R.color.black_header_color));
        }
        if (this.s.l(1) || this.s.g == hei.e) {
            R(false, 1);
        }
        o(this.s);
    }

    @Override // defpackage.gnf, defpackage.adtm
    public final void p(toe toeVar, acjx acjxVar) {
        ((agrc) ((agrc) ((agrc) af.b()).j(toeVar)).k("com/google/android/apps/youtube/music/browse/ExploreBrowseFragment", "onContinuationError", (char) 542, "ExploreBrowseFragment.java")).w("Continuation error: %s", this.Y.b(toeVar));
    }

    @Override // defpackage.gnf
    protected final void r(heh hehVar) {
        super.m(hehVar);
        isi isiVar = this.P;
        if (isiVar != null) {
            isiVar.n(hehVar.f, hehVar.n);
        }
    }

    @Override // defpackage.gnf
    protected final void s(heh hehVar) {
        super.m(hehVar);
        isi isiVar = this.P;
        if (isiVar != null) {
            isiVar.l();
            this.P.p();
        }
        jhs jhsVar = this.u;
        if (jhsVar != null) {
            jhsVar.f();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [adxd] */
    /* JADX WARN: Type inference failed for: r14v0, types: [jaf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, xir] */
    @Override // defpackage.gnf
    protected final void t(heh hehVar) {
        cc ccVarB;
        adww gndVar;
        adwj adwjVarL;
        SwipeRefreshLayout swipeRefreshLayout;
        jhs jhsVar;
        SwipeRefreshLayout swipeRefreshLayout2;
        View viewR;
        super.t(hehVar);
        n();
        this.e.d(new xgj(((wfy) hehVar.h).d()));
        SwipeRefreshLayout swipeRefreshLayout3 = null;
        this.am = null;
        almd almdVar = ((wfy) hehVar.h).a;
        if ((almdVar.b & 2) != 0) {
            adly adlyVar = new adly();
            adlyVar.a(this.e);
            adlyVar.f("pagePadding", Integer.valueOf(jnj.x(requireContext())));
            allx allxVar = almdVar.d;
            if (allxVar == null) {
                allxVar = allx.a;
            }
            if (allxVar.b == 287582849) {
                allx allxVar2 = almdVar.d;
                if (allxVar2 == null) {
                    allxVar2 = allx.a;
                }
                anzl anzlVar = allxVar2.b == 287582849 ? (anzl) allxVar2.c : anzl.a;
                jce jceVar = this.aj;
                if (jceVar != null && (viewR = kro.R(anzlVar, jceVar.a, null, adlyVar)) != null) {
                    this.aa = adul.d(viewR);
                    hil hilVar = new hil(this.al);
                    hilVar.b = this.aa;
                    gro groVarA = hilVar.a();
                    this.al = groVarA;
                    grn grnVar = this.ak;
                    if (grnVar != null) {
                        this.ak = this.ac.u(grnVar, groVarA);
                    }
                }
            } else {
                allx allxVar3 = almdVar.d;
                if ((allxVar3 == null ? allx.a : allxVar3).b == 361650780) {
                    if (allxVar3 == null) {
                        allxVar3 = allx.a;
                    }
                    this.am = new grt(allxVar3.b == 361650780 ? (anob) allxVar3.c : anob.a);
                }
            }
        }
        agke<aftj> agkeVarF = ((wfy) hehVar.h).f();
        jhs jhsVar2 = this.u;
        if (jhsVar2 != null) {
            jhsVar2.f();
        }
        if (getActivity() != null) {
            cf cfVarRequireActivity = requireActivity();
            for (aftj aftjVar : agkeVarF) {
                wgd wgdVarH = aftjVar.h();
                RecyclerView recyclerView = (RecyclerView) RecyclerView.inflate(cfVarRequireActivity, R.layout.section_list, swipeRefreshLayout3);
                hil hilVar2 = new hil(this.al);
                hilVar2.a = recyclerView;
                gro groVarA2 = hilVar2.a();
                this.al = groVarA2;
                grn grnVar2 = this.ak;
                if (grnVar2 != null) {
                    this.ak = this.ac.u(grnVar2, groVarA2);
                }
                yvh yvhVar = this.N;
                ?? r10 = yvhVar != null ? (adxd) ((agkj) yvhVar.c).get(aftjVar) : swipeRefreshLayout3;
                if (U()) {
                    gndVar = new gnd(this);
                    MusicSwipeRefreshLayout musicSwipeRefreshLayout = new MusicSwipeRefreshLayout(cfVarRequireActivity);
                    this.ai = musicSwipeRefreshLayout;
                    musicSwipeRefreshLayout.setTag("swipe-to-refresh");
                    adwjVarL = this.ae.l(this.ai);
                } else {
                    gndVar = adww.yS;
                    this.ai = swipeRefreshLayout3;
                    adwjVarL = jhh.c;
                }
                jax jaxVar = this.Z;
                ?? jafVar = new jaf();
                jafVar.n(r10);
                jafVar.o(recyclerView);
                jafVar.f(new LinearLayoutManager(requireActivity()));
                jafVar.p(this.Q);
                jafVar.q(this.R);
                jafVar.g(new advn());
                jafVar.j(this.U);
                jafVar.l(this.ah);
                jafVar.m(this.j.a);
                jafVar.e(this.e);
                jafVar.i(gndVar);
                jafVar.h(adwjVarL);
                jav javVarA = jaxVar.a(jafVar.a());
                this.w = Optional.of(javVarA);
                javVarA.L(new gob(this, 0));
                javVarA.an = this;
                if (r10 == 0) {
                    if (wgdVarH != null) {
                        javVarA.at(wgdVarH);
                    }
                } else if (recyclerView.n != null) {
                    yvh yvhVar2 = this.N;
                    Parcelable parcelable = yvhVar2 != null ? (Parcelable) ((agkj) yvhVar2.b).get(aftjVar) : null;
                    if (parcelable != null) {
                        recyclerView.n.onRestoreInstanceState(parcelable);
                    }
                }
                if (this.am != null) {
                    admu admuVar = new admu();
                    admuVar.add(this.am.a);
                    Collection.EL.stream(agke.p(new adkz[]{admuVar}).a()).forEach(new hsk(javVarA.j, 16));
                    ((admo) javVarA.m).g(this.am);
                    hil hilVar3 = new hil(this.al);
                    hilVar3.d = this.am;
                    gro groVarA3 = hilVar3.a();
                    this.al = groVarA3;
                    grn grnVar3 = this.ak;
                    if (grnVar3 != null) {
                        this.ak = this.ac.u(grnVar3, groVarA3);
                    }
                }
                if (!U() || (swipeRefreshLayout2 = this.ai) == null) {
                    swipeRefreshLayout = null;
                    jhs jhsVar3 = this.u;
                    if (jhsVar3 != null) {
                        jhsVar3.o(aftjVar, null, recyclerView, javVarA);
                    }
                } else {
                    swipeRefreshLayout2.addView(recyclerView);
                    ((jhh) adwjVarL).a = javVarA;
                    jhs jhsVar4 = this.u;
                    if (jhsVar4 != null) {
                        swipeRefreshLayout = null;
                        jhsVar4.o(aftjVar, null, this.ai, javVarA);
                    } else {
                        swipeRefreshLayout = null;
                    }
                }
                yvh yvhVar3 = this.N;
                if (yvhVar3 != null && (jhsVar = this.u) != null) {
                    jhsVar.m(yvhVar3.a);
                }
                swipeRefreshLayout3 = swipeRefreshLayout;
            }
        }
        isi isiVar = this.P;
        if (isiVar != null) {
            isiVar.m();
        }
        if (this.I.l(14, 45680269L, false)) {
            Optional optional = hehVar.c.b;
            if (true == optional.isPresent()) {
                optional.get().f(tau.BROWSE_PAGE_LOADED);
            }
        }
        if (this.I.l(17, 45680971L, false)) {
            this.q.kk(gnk.a);
        } else {
            this.f.postAtFrontOfQueue(new gnc(this, 6));
        }
        HashMap map = new HashMap();
        heh hehVar2 = this.s;
        if (hehVar2 != null && TextUtils.equals("FEmusic_hashtag", hehVar2.b()) && (ccVarB = this.d.b()) != null) {
            map.put("remove_previous_fragment_from_back_stack", ccVarB);
        }
        this.c.d(((wfy) hehVar.h).a.m, map);
        this.c.d(((wfy) hehVar.h).a.n, map);
    }

    @Override // defpackage.gnf
    protected final void u(heh hehVar) {
        SwipeRefreshLayout swipeRefreshLayout;
        if (!U() || (swipeRefreshLayout = this.ai) == null || !swipeRefreshLayout.b) {
            isi isiVar = this.P;
            if (isiVar != null) {
                isiVar.l();
                this.P.p();
            }
            jhs jhsVar = this.u;
            if (jhsVar != null) {
                jhsVar.f();
            }
        }
        this.N = null;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0075  */
    /* JADX WARN: Code duplicated, block: B:37:0x007c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x007e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0083  */
    /* JADX WARN: Code duplicated, block: B:42:0x008b  */
    /* JADX WARN: Code duplicated, block: B:44:0x008f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0094  */
    /* JADX WARN: Code duplicated, block: B:48:0x009a  */
    @Override // defpackage.gnf
    protected final void w(heh hehVar) {
        CoordinatorLayout coordinatorLayout;
        Object obj;
        almd almdVar;
        int i;
        anzl anzlVar;
        anzl anzlVar2;
        alay alayVar;
        D(hehVar);
        hil hilVar = new hil(this.al);
        hilVar.b(hehVar);
        gro groVarA = hilVar.a();
        this.al = groVarA;
        grn grnVar = this.ak;
        if (grnVar != null) {
            this.ak = this.ac.u(grnVar, groVarA);
        }
        if (Build.VERSION.SDK_INT < 28 || (coordinatorLayout = this.ag) == null) {
            return;
        }
        heh hehVar2 = this.s;
        String string = null;
        if (hehVar2 != null && (obj = hehVar2.h) != null && (almdVar = ((wfy) obj).a) != null && (almdVar.b & 2) != 0) {
            allx allxVar = almdVar.d;
            if (allxVar == null) {
                allxVar = allx.a;
            }
            int i2 = allxVar.b;
            if (i2 != 99965204) {
                i = allxVar.b;
                if (i == 287582849) {
                    if (i == 287582849) {
                        anzlVar = (anzl) allxVar.c;
                    } else {
                        anzlVar = anzl.a;
                    }
                    if ((anzlVar.b & 1) != 0) {
                        if (allxVar.b == 287582849) {
                            anzlVar2 = (anzl) allxVar.c;
                        } else {
                            anzlVar2 = anzl.a;
                        }
                        alayVar = anzlVar2.c;
                        if (alayVar == null) {
                            alayVar = alay.a;
                        }
                        string = ackj.k(null, jfw.g(alayVar, ' '), null, false).toString();
                    }
                }
            } else {
                if (((i2 == 99965204 ? (anpf) allxVar.c : anpf.a).b & 1) != 0) {
                    alay alayVar2 = (allxVar.b == 99965204 ? (anpf) allxVar.c : anpf.a).c;
                    if (alayVar2 == null) {
                        alayVar2 = alay.a;
                    }
                    string = ackj.k(null, alayVar2, null, false).toString();
                } else {
                    i = allxVar.b;
                    if (i == 287582849) {
                        if (i == 287582849) {
                            anzlVar = (anzl) allxVar.c;
                        } else {
                            anzlVar = anzl.a;
                        }
                        if ((anzlVar.b & 1) != 0) {
                            if (allxVar.b == 287582849) {
                                anzlVar2 = (anzl) allxVar.c;
                            } else {
                                anzlVar2 = anzl.a;
                            }
                            alayVar = anzlVar2.c;
                            if (alayVar == null) {
                                alayVar = alay.a;
                            }
                            string = ackj.k(null, jfw.g(alayVar, ' '), null, false).toString();
                        }
                    }
                }
            }
        }
        coordinatorLayout.setAccessibilityPaneTitle(string);
    }

    @Override // defpackage.gnf
    public final void H() {
    }
}
