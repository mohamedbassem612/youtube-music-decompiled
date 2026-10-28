package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import com.google.android.apps.youtube.music.R;
import com.google.android.apps.youtube.music.ui.components.loading.LoadingFrameLayout;
import com.google.android.apps.youtube.music.ui.tabs.TabbedView;
import com.google.android.material.appbar.AppBarLayout;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class gnf extends cc implements adtm, adtp, gpx, xgm, svp, hku, hkw {
    public static final agrf a = agrf.h("com/google/android/apps/youtube/music/browse/BrowseFragment");
    public AppBarLayout A;
    protected Toolbar B;
    protected TabbedView C;
    protected View D;
    public hkl G;
    public vxz H;
    public vxz I;
    public vxz J;
    public vxz K;
    public jnj L;
    protected nyc M;
    protected yvh N;
    public isi O;
    protected isi P;
    public aeod Q;
    public vwt R;
    public vwt S;
    public jnm T;
    public gmy b;
    public vxe c;
    public jki d;
    public xgn e;
    public Handler f;
    public avlh g;
    public iwe h;
    public ivo i;
    public jer j;
    public xit k;
    public aunn l;
    public avmb m;
    public hkq n;
    public acxn o;
    public aunn p;
    public awku q;
    public adxj r;
    public heh s;
    protected avmn t;
    protected jhs u;
    protected ggd v;
    public int x;
    protected gql y;
    private boolean U = false;
    public Optional w = Optional.empty();
    protected final List z = new ArrayList();
    public boolean E = false;
    public boolean F = false;

    public static final void Q(View view, String str) {
        if (Build.VERSION.SDK_INT >= 28) {
            view.setAccessibilityPaneTitle(str);
        }
    }

    private final void T(wgd wgdVar, boolean z) {
        jav javVar = (jav) this.w.orElse(null);
        apoq apoqVar = wgdVar.a;
        apok apokVar = apoqVar.u;
        if (apokVar == null) {
            apokVar = apok.a;
        }
        if (apokVar.c.size() <= 0 || javVar == null) {
            return;
        }
        adxz adxzVarL = this.H.l(240, 45794845L, false) ? javVar.F : ((aciz) this.p.io()).l(javVar);
        if (adxzVarL == null) {
            ((agrc) ((agrc) a.b()).k("com/google/android/apps/youtube/music/browse/BrowseFragment", "maybeApplySectionListMutationOperations", 767, "BrowseFragment.java")).t("BrowseFragment section list mutation operations processor is null.");
            return;
        }
        apok apokVar2 = apoqVar.u;
        if (apokVar2 == null) {
            apokVar2 = apok.a;
        }
        adxzVarL.a(apokVar2, new gnb(this, z));
    }

    private final void U() {
        Toolbar toolbar;
        if (!this.U || (toolbar = this.B) == null) {
            return;
        }
        gzj.N(toolbar);
        jba jbaVar = this.j.a;
        if (jbaVar != null) {
            kro.X(this.B, jbaVar);
        }
        G();
        this.U = false;
    }

    private final void a(Menu menu) {
        heh hehVar;
        if (menu == null || (hehVar = this.s) == null || hehVar.h == null) {
            return;
        }
        if (!this.H.m(257, 45823344L)) {
            String strB = hehVar.b();
            if (strB == null) {
                return;
            }
            if (!hdu.b(strB) && !TextUtils.equals(strB, "FEmusic_trophies_list")) {
                return;
            }
        }
        this.n.d(this.s);
        this.n.b(menu);
    }

    @Override // defpackage.hku
    public boolean A() {
        Optional optionalGS = gS();
        boolean z = true;
        if (true == optionalGS.isPresent()) {
            ajwo ajwoVar = (ajwo) optionalGS.get();
            if (kro.ak(ajwoVar) && !kro.al(ajwoVar)) {
                z = false;
            }
            optionalGS = Optional.ofNullable(Boolean.valueOf(z));
        }
        return ((Boolean) optionalGS.orElse(Boolean.TRUE)).booleanValue();
    }

    public void B(boolean z) {
        R(z, 1);
    }

    @Override // defpackage.hkw
    public void C() {
        if (kro.M(this) || this.w.isEmpty()) {
            return;
        }
        jhs jhsVar = this.u;
        if (jhsVar == null || jhsVar.b() != -1) {
            ((RecyclerView) ((adsr) this.w.get()).l).aj(0);
            k();
        }
    }

    public void D(heh hehVar) {
        if (hehVar != this.s) {
            this.N = null;
        }
        this.s = hehVar;
    }

    public void E(anxn anxnVar) {
        Toolbar toolbar;
        Object obj = this.s.h;
        almd almdVar = obj != null ? ((wfy) obj).a : null;
        if (almdVar != null) {
            allx allxVar = almdVar.d;
            if (allxVar == null) {
                allxVar = allx.a;
            }
            if (((allxVar.b == 99965204 ? (anpf) allxVar.c : anpf.a).b & 4) == 0 || (toolbar = this.B) == null) {
                return;
            }
            View view = this.D;
            if (view != null) {
                toolbar.removeView(view);
            }
            adly adlyVar = new adly();
            adlyVar.f("pagePadding", Integer.valueOf(jnj.x(requireContext())));
            if (this.w.isPresent()) {
                adlyVar.f("sectionListController", this.w.get());
            }
            this.D = kro.Q(anxnVar, this.B, this.j.a, adlyVar);
            fx fxVar = (fx) getActivity();
            if (fxVar != null) {
                fxVar.setSupportActionBar(this.B);
                fl supportActionBar = fxVar.getSupportActionBar();
                if (supportActionBar != null) {
                    supportActionBar.x();
                    supportActionBar.j(false);
                }
            }
        }
    }

    final void F() {
        Object obj = this.s.h;
        almd almdVar = obj != null ? ((wfy) obj).a : null;
        if (almdVar != null) {
            allx allxVar = almdVar.d;
            if (allxVar == null) {
                allxVar = allx.a;
            }
            apji apjiVar = (allxVar.b == 99965204 ? (anpf) allxVar.c : anpf.a).d;
            if (apjiVar == null) {
                apjiVar = apji.a;
            }
            aihl aihlVarCheckIsLite = aihn.checkIsLite(anxo.a);
            apjiVar.c(aihlVarCheckIsLite);
            Object objK = apjiVar.j.k(aihlVarCheckIsLite.d);
            E((anxn) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK)));
        }
    }

    public void G() {
        fx fxVar;
        if (isHidden() || getView() == null) {
            return;
        }
        Toolbar toolbar = this.B;
        if (toolbar != null && (fxVar = (fx) getActivity()) != null) {
            fxVar.setSupportActionBar(toolbar);
            fl supportActionBar = fxVar.getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.h(true);
                supportActionBar.j(false);
                if (this.I.l(46, 45824499L, false)) {
                    supportActionBar.p();
                }
            }
            if (this.I.l(46, 45824499L, false)) {
                fxVar.invalidateOptionsMenu();
            }
        }
        AppBarLayout appBarLayout = this.A;
        if (appBarLayout != null) {
            appBarLayout.setTouchscreenBlocksFocus(false);
            this.A.setKeyboardNavigationCluster(false);
        }
        if (this.B != null) {
            String strH = h();
            Toolbar toolbar2 = this.B;
            if (strH == null) {
                strH = "";
            }
            toolbar2.v(strH);
            this.B.o(R.string.navigate_back);
        }
        if (this.x != 0) {
            Optional optionalE = e();
            gfi gfiVar = new gfi(this, 8);
            if (true == optionalE.isPresent()) {
                ((AppBarLayout.BaseBehavior) optionalE.get()).setTopAndBottomOffset(((gnf) gfiVar.a).x);
            }
        }
        AppBarLayout appBarLayout2 = this.A;
        if (appBarLayout2 != null) {
            appBarLayout2.setBackgroundColor(requireContext().getColor(R.color.black_header_color));
        }
        Toolbar toolbar3 = this.B;
        if (toolbar3 != null) {
            toolbar3.setBackgroundColor(requireContext().getColor(R.color.black_header_color));
        }
        TabbedView tabbedView = this.C;
        if (tabbedView != null) {
            tabbedView.y(requireContext().getColor(R.color.black_header_color));
        }
        Toolbar toolbar4 = this.B;
        if (toolbar4 != null) {
            gzj.L(toolbar4, this.r.b(arqz.er));
        }
        F();
    }

    public void H() {
        if (isHidden() || getView() == null) {
            return;
        }
        this.h.a(requireContext().getColor(R.color.black_header_color));
    }

    protected final void I(RecyclerView recyclerView) {
        recyclerView.aC(new gne(this));
    }

    protected final boolean J() {
        return !isAdded() || isRemoving() || isDetached();
    }

    protected final boolean K() {
        gnn gnnVar = this.s.a;
        return gnnVar != null && gnnVar.e;
    }

    protected boolean L(heh hehVar) {
        return true;
    }

    @Override // defpackage.svp
    public final /* synthetic */ void P() {
        v();
    }

    public final void R(boolean z, int i) {
        S(z, i, Optional.empty());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object, xir] */
    protected final void S(boolean z, int i, Optional optional) {
        gql gqlVar = this.y;
        if (gqlVar == null) {
            gfi gfiVar = new gfi(this, 9);
            if (true == optional.isPresent()) {
                ?? r7 = optional.get();
                heh hehVar = ((gnf) gfiVar.a).s;
                heg hegVar = new heg(hehVar.c);
                hegVar.e(r7);
                hehVar.c(hegVar.d());
            }
            if (z) {
                this.s.h(2);
            }
            this.b.d(this.s, i);
            return;
        }
        if (gqlVar.b != 2 || !gqlVar.a.isPresent()) {
            ((agrc) ((agrc) a.b()).k("com/google/android/apps/youtube/music/browse/BrowseFragment", "requestBrowseRefresh", 743, "BrowseFragment.java")).w("Attempted to load a malformed reload continuation: %s", this.y);
            zvp.a(zvn.b, zvm.n, "Attempted to load a malformed reload continuation request.");
            return;
        }
        gmy gmyVar = this.b;
        Object obj = this.y.a.get();
        Map mapI = i();
        if (z) {
            HashMap map = new HashMap(mapI);
            map.put("force_refresh", Boolean.TRUE);
            mapI = map;
        }
        gmyVar.h.c((ajwo) obj, mapI);
    }

    protected int c() {
        return 6827;
    }

    @Override // defpackage.gpx
    public adtv d() {
        return null;
    }

    public Optional e() {
        AppBarLayout appBarLayout = this.A;
        if (appBarLayout == null || !(appBarLayout.getLayoutParams() instanceof asv)) {
            return Optional.empty();
        }
        ast astVar = ((asv) this.A.getLayoutParams()).a;
        return !(astVar instanceof AppBarLayout.Behavior) ? Optional.empty() : Optional.of((AppBarLayout.Behavior) astVar);
    }

    public abstract String f();

    @Override // defpackage.hku
    public final Optional gS() {
        Optional optionalOfNullable = Optional.ofNullable(this.s);
        return true == optionalOfNullable.isPresent() ? Optional.ofNullable(((heh) optionalOfNullable.get()).f) : optionalOfNullable;
    }

    public final String h() {
        Object obj = this.s.h;
        almd almdVar = obj != null ? ((wfy) obj).a : null;
        if (almdVar == null) {
            return null;
        }
        allx allxVar = almdVar.d;
        if (allxVar == null) {
            allxVar = allx.a;
        }
        if (((allxVar.b == 99965204 ? (anpf) allxVar.c : anpf.a).b & 1) != 0) {
            alay alayVar = (allxVar.b == 99965204 ? (anpf) allxVar.c : anpf.a).c;
            if (alayVar == null) {
                alayVar = alay.a;
            }
            return ackj.k(null, alayVar, null, false).toString();
        }
        if (((allxVar.b == 50236216 ? (akym) allxVar.c : akym.a).b & 1) == 0) {
            return null;
        }
        alay alayVar2 = (allxVar.b == 50236216 ? (akym) allxVar.c : akym.a).c;
        if (alayVar2 == null) {
            alayVar2 = alay.a;
        }
        return ackj.k(null, alayVar2, null, false).toString();
    }

    @Override // defpackage.xgm
    public xgn hB() {
        return this.e;
    }

    public Map i() {
        return agpn.b;
    }

    protected final void j(LoadingFrameLayout loadingFrameLayout) {
        loadingFrameLayout.c(this.I.l(14, 45680269L, false) ? new gna(this, 0) : new adtw(this, 1));
    }

    protected void l() {
        G();
        H();
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, xir] */
    public final void m(heh hehVar) {
        ivo ivoVar = this.i;
        if (ivoVar != null) {
            ivoVar.c();
        }
        if (this.I.l(14, 45680269L, false) && L(hehVar)) {
            Optional optional = hehVar.c.b;
            if (true == optional.isPresent()) {
                optional.get().f(tau.BROWSE_REQUEST_ERROR);
            }
        }
    }

    public final void n() {
        hB().D(xhb.a(c()), xgu.a, this.s.f);
        if (this.G.m()) {
            this.G.c(this.e);
        }
    }

    public void o(heh hehVar) {
        if (J() || getView() == null) {
            return;
        }
        w(hehVar);
        int iOrdinal = hehVar.g.ordinal();
        if (iOrdinal == 0) {
            s(hehVar);
        } else if (iOrdinal == 1) {
            u(hehVar);
        } else if (iOrdinal == 2) {
            t(hehVar);
        } else if (iOrdinal == 3) {
            r(hehVar);
        }
        O();
    }

    @Override // defpackage.cc
    /* JADX INFO: renamed from: onCreate */
    public void m658lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        heh hehVar;
        super.m658lambda$performCreate$3$androidsupportv4appFragment(bundle);
        if (bundle != null && (hehVar = (heh) bundle.getParcelable("model")) != null) {
            this.s = hehVar;
        }
        setHasOptionsMenu(true);
    }

    @Override // defpackage.cc
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        if (this.H.m(257, 45823344L)) {
            menu.removeGroup(R.id.browse_toolbar_client_removable_buttons_group);
        }
        a(menu);
    }

    @Override // defpackage.cc
    public final void onDestroyOptionsMenu() {
        Toolbar toolbar = this.B;
        if (toolbar != null) {
            gzj.N(toolbar);
        }
    }

    @Override // defpackage.cc
    public void onDestroyView() {
        Optional optionalE = e();
        gfi gfiVar = new gfi(this, 10);
        if (true == optionalE.isPresent()) {
            ((gnf) gfiVar.a).x = ((AppBarLayout.BaseBehavior) optionalE.get()).getTopAndBottomOffset();
        }
        this.i.e();
        heh hehVar = this.s;
        if (hehVar.g != hei.c) {
            hehVar.k(hei.e);
        }
        this.v = null;
        jhs jhsVar = this.u;
        if (jhsVar != null) {
            this.N = jhsVar.n();
            this.u.i();
            this.u = null;
        }
        if (this.w.isPresent()) {
            ((adtv) this.w.get()).i();
            this.w = Optional.empty();
        }
        this.P = null;
        Toolbar toolbar = this.B;
        if (toolbar != null) {
            jba jbaVar = this.j.a;
            if (jbaVar != null) {
                kro.X(toolbar, jbaVar);
            }
            View view = this.D;
            if (view != null) {
                this.B.removeView(view);
                this.D = null;
            }
            if (this.U) {
                gzj.N(this.B);
            }
            if (this.B.f() != null) {
                this.n.c(this.B.f());
                this.B.f().clear();
            }
            this.B = null;
        }
        this.U = false;
        this.C = null;
        this.A = null;
        ((vor) this.l.io()).A();
        super.onDestroyView();
    }

    @Override // defpackage.cc
    public void onHiddenChanged(boolean z) {
        vwt vwtVar = this.S;
        if (vwtVar != null) {
            if (z) {
                vwtVar.X(this);
            } else {
                vwtVar.W(this);
            }
        }
        l();
    }

    @Override // defpackage.cc
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        requireActivity().getOnBackPressedDispatcher().d();
        return true;
    }

    @Override // defpackage.cc
    public void onPause() {
        super.onPause();
        vwt vwtVar = this.S;
        if (vwtVar != null) {
            vwtVar.X(this);
        }
        Object obj = this.t;
        if (obj != null) {
            awka.f((AtomicReference) obj);
        }
    }

    @Override // defpackage.cc
    public void onResume() {
        super.onResume();
        this.E = false;
        if (this.S != null && isVisible()) {
            this.S.W(this);
        }
        this.t = this.g.p().L(this.m).al(new gem(this, 3), new gfh(2));
        if (this.I.l(46, 45824499L, false) && !isHidden() && this.B != null) {
            G();
        }
        H();
        if (this.F) {
            this.F = false;
            this.m.c(new dxk(this, 20), 750L, TimeUnit.MILLISECONDS);
        }
    }

    @Override // defpackage.cc
    /* JADX INFO: renamed from: onSaveInstanceState */
    public void m668x22bc4f96(Bundle bundle) {
        heh hehVar = this.s;
        if (hehVar != null) {
            heh hehVarA = hehVar.a();
            hehVarA.h(1);
            bundle.putParcelable("model", hehVarA);
        }
    }

    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, xir] */
    @Override // defpackage.cc
    public void onStop() {
        super.onStop();
        this.E = true;
        if (this.I.l(14, 45680269L, false)) {
            Optional optional = this.s.c.b;
            if (true == optional.isPresent()) {
                optional.get().f(tau.ACTION_ABANDONED);
            }
        }
    }

    @Override // defpackage.cc
    public void onViewCreated(View view, Bundle bundle) {
        this.i.d();
    }

    @Override // defpackage.adtp
    public void q(acjy acjyVar, acjw acjwVar) {
        int iOrdinal = acjwVar.ordinal();
        if (iOrdinal == 9) {
            Object objB = acjyVar.b();
            if (objB instanceof wgd) {
                T((wgd) objB, false);
                return;
            }
            return;
        }
        if (iOrdinal == 11 && (acjyVar instanceof hus)) {
            hus husVar = (hus) acjyVar;
            if (this.J.l(27, 45722447L, false)) {
                Object obj = husVar.a;
                if (obj instanceof apoq) {
                    T(new wgd((apoq) obj), true);
                }
            }
        }
    }

    protected void r(heh hehVar) {
        m(hehVar);
    }

    protected void s(heh hehVar) {
        m(hehVar);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004e  */
    protected void t(heh hehVar) {
        Toolbar toolbar;
        Object obj;
        almd almdVar;
        Object obj2 = hehVar.h;
        if (obj2 == null || ((wfy) obj2).g()) {
            this.i.c();
        } else {
            almf almfVar = ((wfy) hehVar.h).a.g;
            if (almfVar == null) {
                almfVar = almf.a;
            }
            if (((almfVar.b == 84469052 ? (aqgy) almfVar.c : aqgy.a).b & 16) != 0) {
                ivo ivoVar = this.i;
                almf almfVar2 = ((wfy) hehVar.h).a.g;
                if (almfVar2 == null) {
                    almfVar2 = almf.a;
                }
                aqgx aqgxVar = (almfVar2.b == 84469052 ? (aqgy) almfVar2.c : aqgy.a).c;
                if (aqgxVar == null) {
                    aqgxVar = aqgx.a;
                }
                ivoVar.a = aqgxVar;
            } else {
                this.i.c();
            }
        }
        Toolbar toolbar2 = this.B;
        if (toolbar2 != null) {
            a(toolbar2.f());
        }
        y(fhz.ao((wfy) hehVar.h));
        y(this.z);
        if (this.B != null) {
            if (this.j.a == null) {
                U();
                return;
            }
            akrn akrnVar = null;
            if (hehVar != null && (obj = hehVar.h) != null && (almdVar = ((wfy) obj).a) != null) {
                allx allxVar = almdVar.d;
                if (allxVar == null) {
                    allxVar = allx.a;
                }
                if (allxVar.b == 1790) {
                    allx allxVar2 = almdVar.d;
                    if (allxVar2 == null) {
                        allxVar2 = allx.a;
                    }
                    akrk akrkVar = allxVar2.b == 1790 ? (akrk) allxVar2.c : akrk.a;
                    apji apjiVar = akrkVar.b;
                    if (apjiVar == null) {
                        apjiVar = apji.a;
                    }
                    aihl aihlVarCheckIsLite = aihn.checkIsLite(akrs.a);
                    apjiVar.c(aihlVarCheckIsLite);
                    if (apjiVar.j.n(aihlVarCheckIsLite.d)) {
                        apji apjiVar2 = akrkVar.b;
                        if (apjiVar2 == null) {
                            apjiVar2 = apji.a;
                        }
                        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(akrs.a);
                        apjiVar2.c(aihlVarCheckIsLite2);
                        Object objK = apjiVar2.j.k(aihlVarCheckIsLite2.d);
                        akrnVar = (akrn) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
                    }
                }
            }
            if (akrnVar == null) {
                U();
                return;
            }
            acxm acxmVarA = this.o.a(akrnVar);
            adly adlyVar = new adly();
            adlyVar.a(hB());
            gzj.N(this.B);
            kro.X(this.B, this.j.a);
            View viewQ = kro.Q(acxmVarA, this.B, this.j.a, adlyVar);
            if (viewQ != null) {
                viewQ.setLayoutParams(new pc(-1, -1));
            }
            fx fxVar = (fx) getActivity();
            if (fxVar != null && (toolbar = this.B) != null) {
                fxVar.setSupportActionBar(toolbar);
                fl supportActionBar = fxVar.getSupportActionBar();
                if (supportActionBar != null) {
                    supportActionBar.h(true);
                    supportActionBar.j(false);
                }
                gzj.L(this.B, this.r.b(arqz.er));
            }
            this.U = true;
        }
    }

    @Override // defpackage.svp
    public final void v() {
        B(true);
    }

    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object, ttm] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, xgm] */
    @Override // defpackage.svp
    public final void x(amax amaxVar) {
        amfe amfeVar;
        aqtb aqtbVar;
        if (amaxVar != null) {
            jnm jnmVar = this.T;
            amar amarVar = amaxVar.d;
            if (amarVar == null) {
                amarVar = amar.a;
            }
            if (amarVar.b == 86135402) {
                amar amarVar2 = amaxVar.d;
                if (amarVar2 == null) {
                    amarVar2 = amar.a;
                }
                amfeVar = amarVar2.b == 86135402 ? (amfe) amarVar2.c : amfe.a;
            } else {
                amfeVar = null;
            }
            if (amfeVar != null) {
                ((swh) jnmVar.b).d(amfeVar);
                return;
            }
            CharSequence charSequenceF = nsg.f(amaxVar);
            if (!TextUtils.isEmpty(charSequenceF)) {
                jnmVar.a.d(charSequenceF.toString());
            }
            amar amarVar3 = amaxVar.d;
            if ((amarVar3 == null ? amar.a : amarVar3).b == 127387931) {
                if (amarVar3 == null) {
                    amarVar3 = amar.a;
                }
                aqtbVar = amarVar3.b == 127387931 ? (aqtb) amarVar3.c : aqtb.a;
            } else {
                aqtbVar = null;
            }
            if (aqtbVar != null) {
                if ((amaxVar.b & 8) != 0) {
                    jnmVar.d.hB().d(new xgj(amaxVar.g.G()));
                }
                Object obj = jnmVar.c;
                taq.P(aqtbVar).h(getChildFragmentManager(), null);
                return;
            }
            ajwo ajwoVarE = nsg.e(amaxVar);
            if (ajwoVarE != null) {
                this.c.a(ajwoVarE);
                return;
            } else if (amaxVar.f.size() > 0) {
                return;
            }
        }
        B(true);
    }

    protected final void y(List list) {
        if (this.l == null || list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            apji apjiVar = (apji) it.next();
            aihl aihlVarCheckIsLite = aihn.checkIsLite(akul.a);
            apjiVar.c(aihlVarCheckIsLite);
            if (apjiVar.j.n(aihlVarCheckIsLite.d)) {
                vor vorVar = (vor) this.l.io();
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(akul.a);
                apjiVar.c(aihlVarCheckIsLite2);
                Object objK = apjiVar.j.k(aihlVarCheckIsLite2.d);
                vorVar.w((akuj) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK)));
            }
        }
    }

    @Override // defpackage.hku
    public final boolean z() {
        Optional optionalGS = gS();
        hlx hlxVar = new hlx(this, 1);
        if (true == optionalGS.isPresent()) {
            ajwo ajwoVar = (ajwo) optionalGS.get();
            gnf gnfVar = (gnf) hlxVar.a;
            optionalGS = Optional.ofNullable(((gnfVar.J.l(27, 45722447L, false) || gnfVar.K.l(53, 45785910L, false)) && kro.ah(ajwoVar).c.equals("FEmusic_home")) ? Boolean.TRUE : Boolean.valueOf(!gnfVar.A()));
        }
        return ((Boolean) optionalGS.orElse(Boolean.FALSE)).booleanValue();
    }

    public void M() {
    }

    public void N() {
    }

    protected void O() {
    }

    public void k() {
    }

    protected void u(heh hehVar) {
    }

    protected void w(heh hehVar) {
    }

    @Override // defpackage.adtm
    public void p(toe toeVar, acjx acjxVar) {
    }
}
