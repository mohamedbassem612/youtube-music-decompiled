package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.RelativeLayout;
import com.google.android.apps.youtube.music.R;
import com.google.android.apps.youtube.music.ui.components.loading.LoadingFrameLayout;
import com.google.android.apps.youtube.music.ui.refresh.MusicSwipeRefreshLayout;
import com.google.android.apps.youtube.music.ui.tabs.TabbedView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.tabs.TabLayout;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.Optional;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class gpl extends gol implements hkw, adtp {
    public static final agrf U = agrf.h("com/google/android/apps/youtube/music/browse/LibraryBrowseFragment");
    private static final Duration aD = Duration.ofSeconds(5);
    private static final oa aE = new gpg();
    public wom V;
    public izf W;
    public tbt X;
    public jaz Y;
    public ttm Z;
    public hhb aA;
    public aczl aB;
    public aczl aC;
    private avmn aG;
    private gpo aH;
    private View aI;
    private advd aJ;
    private ListenableFuture aK;
    private avmn aL;
    private avmn aN;
    private avmn aO;
    private heh aT;
    private heh aU;
    private anxn aV;
    public gny aa;
    public gqt ab;
    public gpz ac;
    public gnp ad;
    public ahey ae;
    public iwd af;
    public aunn ag;
    public jax ah;
    public avlh ai;
    public ViewGroup aj;
    public ixi ak;
    public RecyclerView al;
    public ExtendedFloatingActionButton am;
    public boolean an;
    public ajwo ar;
    public jin au;
    public hcb av;
    public jij aw;
    public hef ax;
    public jij ay;
    public hfn az;
    private final avmm aF = new avmm();
    public gpm ao = gpm.a;
    public Optional ap = Optional.empty();
    public admb aq = null;
    private final avmm aM = new avmm();
    private Optional aP = Optional.empty();
    private int aQ = -1;
    private final ivz aR = new ivz(new gpd(this, 0));
    final qr as = new gph(this);
    final jau at = new jau() { // from class: gpf
        @Override // defpackage.jau
        public final void a(Object obj, adma admaVar, ixi ixiVar, ijt ijtVar) {
            final gpl gplVar = this.a;
            gplVar.ak = ixiVar;
            if (ixiVar != null) {
                ixiVar.d(new ixg() { // from class: gpc
                    @Override // defpackage.ixg
                    public final void a(boolean z) {
                        gplVar.ab();
                    }
                });
            }
            gplVar.ac();
        }
    };
    private boolean aS = true;

    private final jlc af() {
        if (this.aP.isEmpty()) {
            this.aP = Optional.of(new gpi(this, this.m));
        }
        return (jlc) this.aP.get();
    }

    private final TabLayout ag() {
        if (getActivity() == null) {
            return null;
        }
        return (TabLayout) getActivity().findViewById(R.id.pivot_bar);
    }

    private final void ah() {
        ListenableFuture listenableFuture = this.aK;
        if (listenableFuture != null) {
            listenableFuture.cancel(false);
        }
        this.au.b();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private final void ai(List list, Optional optional) {
        yvh yvhVar;
        cf activity;
        TabbedView tabbedView = this.C;
        boolean z = false;
        if (tabbedView != null) {
            tabbedView.u(list.size() > 1);
        }
        jhs jhsVar = this.u;
        if (jhsVar != null) {
            jhsVar.f();
        }
        avmm avmmVar = this.aM;
        avmmVar.b();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            aftj aftjVar = (aftj) it.next();
            wgd wgdVarH = aftjVar.h();
            if (wgdVarH != null && (activity = getActivity()) != null) {
                MusicSwipeRefreshLayout musicSwipeRefreshLayout = new MusicSwipeRefreshLayout(activity);
                jhh jhhVarL = this.aA.l(musicSwipeRefreshLayout);
                View viewInflate = RelativeLayout.inflate(activity, R.layout.section_list, null);
                this.al = (RecyclerView) viewInflate.findViewById(R.id.section_list_content);
                Resources resources = getContext().getResources();
                this.al.setTag(R.id.disable_section_list_auto_padding_tag, Boolean.TRUE);
                this.al.setPadding(z ? 1 : 0, z ? 1 : 0, z ? 1 : 0, resources.getDimensionPixelSize(R.dimen.recycler_view_with_fab_bottom_padding) + resources.getDimensionPixelSize(R.dimen.mini_player_height));
                this.al.setClipToPadding(z);
                jhg jhgVar = new jhg();
                jhgVar.h = 0L;
                jhgVar.i = 250L;
                this.al.af(jhgVar);
                this.al.w(new gpj(this));
                ExtendedFloatingActionButton extendedFloatingActionButton = this.am;
                if (extendedFloatingActionButton != null) {
                    extendedFloatingActionButton.setLetterSpacing(0.0f);
                    if (this.am != null && this.H.l(251, 45813332L, z)) {
                        apoq apoqVar = wgdVarH.a;
                        if ((apoqVar.c & 32) != 0) {
                            apon aponVar = apoqVar.i;
                            if (aponVar == null) {
                                aponVar = apon.a;
                            }
                            if (aponVar.b == 65153809) {
                                Resources resources2 = this.am.getResources();
                                int dimensionPixelSize = resources2.getDimensionPixelSize(R.dimen.item_medium_spacing);
                                int dimensionPixelSize2 = resources2.getDimensionPixelSize(R.dimen.item_extra_large_spacing);
                                int dimensionPixelSize3 = resources2.getDimensionPixelSize(R.dimen.large_font_size);
                                ExtendedFloatingActionButton extendedFloatingActionButton2 = this.am;
                                if (extendedFloatingActionButton2.e != dimensionPixelSize) {
                                    extendedFloatingActionButton2.e = dimensionPixelSize;
                                    extendedFloatingActionButton2.setCompoundDrawablePadding(dimensionPixelSize);
                                }
                                this.am.setPaddingRelative(dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize);
                                this.am.setTextSize(z ? 1 : 0, dimensionPixelSize3);
                            }
                        }
                    }
                }
                int i = 3;
                avmmVar.c(this.au.d.P().H(new gnw(i)).p().U(Integer.valueOf(z ? 1 : 0)).L(this.m).al(new gkr(this, resources, 2, null), new glg(4)));
                I(this.al);
                yvh yvhVar2 = this.N;
                adxd adxdVar = yvhVar2 != null ? (adxd) ((agkj) yvhVar2.c).get(aftjVar) : null;
                jax jaxVar = this.ah;
                jaf jafVar = new jaf();
                jafVar.n(adxdVar);
                jafVar.o(this.al);
                jafVar.p(this.Q);
                jafVar.q(this.R);
                jafVar.g(new iyc(new bwa(8)));
                jafVar.j(this.aH);
                jafVar.l(this.aJ);
                jafVar.m(this.j.a);
                jafVar.e(this.e);
                jafVar.b(new adtq() { // from class: gpe
                    @Override // defpackage.adtq
                    public final void a(acjx acjxVar, ajwo ajwoVar) {
                        this.a.Z(acjxVar, ajwoVar);
                    }
                });
                jafVar.i(new gnd(this));
                jafVar.d(this.aj);
                jafVar.k(this.at);
                jafVar.h(jhhVarL);
                jafVar.c(this.am);
                jav javVarA = jaxVar.a(jafVar.a());
                javVarA.L(new gob(this, i));
                this.w = Optional.of(javVarA);
                javVarA.ao = this;
                javVarA.an = this;
                musicSwipeRefreshLayout.addView(viewInflate);
                jhhVarL.a = javVarA;
                if (this.N != null || !this.ad.e(((wfy) this.s.h).a, this, new gpk(this, optional))) {
                    aa(optional);
                }
                if (adxdVar == null) {
                    javVarA.at(wgdVarH);
                } else if (this.al.n != null) {
                    yvh yvhVar3 = this.N;
                    Parcelable parcelable = yvhVar3 != null ? (Parcelable) ((agkj) yvhVar3.b).get(aftjVar) : null;
                    if (parcelable != null) {
                        this.al.n.onRestoreInstanceState(parcelable);
                    }
                }
                jhs jhsVar2 = this.u;
                if (jhsVar2 != null) {
                    jhsVar2.o(aftjVar, null, musicSwipeRefreshLayout, javVarA);
                }
                z = false;
            }
        }
        jhs jhsVar3 = this.u;
        if (jhsVar3 == null || (yvhVar = this.N) == null) {
            return;
        }
        jhsVar3.m(yvhVar.a);
    }

    @Override // defpackage.gnf, defpackage.hku
    public final boolean A() {
        return !gpo.e(this.ao);
    }

    @Override // defpackage.gnf, defpackage.hkw
    public final void C() {
        if (this.D != null) {
            af().onClick(this.D);
        }
        if (kro.M(this) || this.al == null) {
            return;
        }
        k();
        boolean zAd = ad();
        if (this.al.computeVerticalScrollOffset() != 0 || zAd || this.D == null) {
            this.al.aj(0);
        } else {
            af().onClick(this.D);
        }
    }

    @Override // defpackage.gnf
    public final void D(heh hehVar) {
        super.D(hehVar);
        if (hehVar == null) {
            this.ao = gpm.a;
        } else if (hdu.c.contains(hehVar.b())) {
            this.ao = gpm.c;
        } else {
            this.ao = hdu.e.contains(hehVar.b()) ? gpm.d : gpm.b;
        }
    }

    @Override // defpackage.gnf
    public final void E(anxn anxnVar) {
        if (this.aS) {
            super.E(anxnVar);
        } else {
            this.aV = anxnVar;
        }
    }

    @Override // defpackage.gnf
    public final void G() {
        Toolbar toolbar;
        super.G();
        if (isHidden() || (toolbar = this.B) == null || getActivity() == null) {
            return;
        }
        ((fx) getActivity()).setSupportActionBar(toolbar);
        fl supportActionBar = ((fx) getActivity()).getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.h(false);
            supportActionBar.j(this.D == null);
        }
    }

    @Override // defpackage.gnf
    public final void M() {
        W();
    }

    @Override // defpackage.gnf
    public final void N() {
        if (this.an) {
            return;
        }
        R(false, 1);
    }

    @Override // defpackage.gnf
    protected final void O() {
        ab();
    }

    public final Optional U(gpm gpmVar) {
        int iOrdinal = gpmVar.ordinal();
        if (iOrdinal == 1) {
            return Optional.of(this.ac);
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? Optional.empty() : Optional.of(this.ab);
        }
        return Optional.of(this.aa);
    }

    public final void W() {
        if (this.an || this.aH.e != null) {
            return;
        }
        R(false, 1);
    }

    public final void X() {
        this.aS = true;
        anxn anxnVar = this.aV;
        if (anxnVar != null) {
            super.E(anxnVar);
            this.aV = null;
        }
        heh hehVar = this.aT;
        if (hehVar != null) {
            t(hehVar);
            this.aT = null;
            return;
        }
        heh hehVar2 = this.aU;
        if (hehVar2 != null) {
            r(hehVar2);
            this.aU = null;
        }
    }

    public final void Y(boolean z) {
        RecyclerView recyclerView;
        ViewGroup viewGroup = this.aj;
        if (viewGroup == null || (recyclerView = (RecyclerView) viewGroup.findViewById(R.id.chip_cloud)) == null) {
            return;
        }
        oa oaVar = aE;
        if (z) {
            recyclerView.Z(oaVar);
        } else {
            recyclerView.w(oaVar);
        }
    }

    final void Z(acjx acjxVar, ajwo ajwoVar) {
        if (acjxVar.a().equals(acjw.d)) {
            if (acjxVar.c().equals("no_connection_error_continuation")) {
                this.y = null;
            } else {
                this.y = gql.a(acjxVar, ajwoVar != null ? ajwoVar : ixt.B(acjxVar.c()));
                this.e.D(xhb.a(c()), xgu.a, ajwoVar);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, xir] */
    public final void aa(Optional optional) {
        isi isiVar = this.P;
        if (isiVar != null) {
            isiVar.m();
        }
        if (this.I.l(14, 45680269L, false) && true == optional.isPresent()) {
            optional.get().f(tau.BROWSE_PAGE_LOADED);
        }
        if (this.I.l(17, 45680971L, false)) {
            this.q.kk(gnk.a);
        } else {
            this.f.postAtFrontOfQueue(new gnc(this, 11));
        }
    }

    public final void ab() {
        boolean z = false;
        if (!this.H.l(225, 45767703L, false)) {
            ixi ixiVar = this.ak;
            if (ixiVar != null) {
                this.as.g(ixiVar.j());
                return;
            }
            return;
        }
        if (this.H.l(206, 45734052L, false)) {
            qr qrVar = this.as;
            if (this.s != null && hdu.g.contains(this.s.b())) {
                z = true;
            }
            qrVar.g(z);
            return;
        }
        ixi ixiVar2 = this.ak;
        if ((ixiVar2 != null && ixiVar2.j()) || (this.s != null && hdu.g.contains(this.s.b()))) {
            z = true;
        }
        this.as.g(z);
    }

    public final void ac() {
        if (kro.M(this)) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.chip_cloud_top_padding);
        if (this.B != null) {
            aihf aihfVarCreateBuilder = ailj.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            ailj ailjVar = (ailj) aihfVarCreateBuilder.instance;
            ailjVar.b |= 4;
            ailjVar.e = dimensionPixelSize;
            jle.b((ailj) aihfVarCreateBuilder.build(), this.B);
        }
    }

    public final boolean ad() {
        ixi ixiVar = this.ak;
        if (ixiVar == null) {
            return false;
        }
        Optional optionalC = ixiVar.c();
        gfi gfiVar = new gfi(this, 17);
        if (true == optionalC.isPresent()) {
            Object obj = optionalC.get();
            Object obj2 = gfiVar.a;
            ajsy ajsyVar = (ajsy) obj;
            if ((ajsyVar.b & 8) != 0) {
                vxe vxeVar = ((gpl) obj2).c;
                ajwo ajwoVar = ajsyVar.h;
                if (ajwoVar == null) {
                    ajwoVar = ajwo.a;
                }
                vxeVar.c(ajwoVar, ((gnf) obj2).i());
            }
        }
        return optionalC.isPresent();
    }

    public final boolean ae() {
        return this.ao.equals(gpm.b);
    }

    @Override // defpackage.gnf
    protected final int c() {
        return this.ao == gpm.c ? 42352 : 6827;
    }

    @Override // defpackage.gnf
    public final String f() {
        return true != gpo.e(this.ao) ? "music_android_liked" : "music_android_offline";
    }

    @Override // defpackage.gnf
    public final Map i() {
        return Collections.singletonMap("sectionListController", this.w.orElse(null));
    }

    @Override // defpackage.gnf
    public final void k() {
        AppBarLayout appBarLayout;
        if (J() || kro.M(this) || (appBarLayout = this.A) == null) {
            return;
        }
        appBarLayout.l(true, false, true);
    }

    @Override // defpackage.cc, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        F();
        jhs jhsVar = this.u;
        if (jhsVar != null) {
            jhsVar.k(configuration);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v4, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [awmd, java.lang.Object] */
    @Override // defpackage.gnf, defpackage.cc
    /* JADX INFO: renamed from: onCreate */
    public final void m658lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        super.m658lambda$performCreate$3$androidsupportv4appFragment(bundle);
        String tag = getTag();
        if (tag == null) {
            tag = "LibraryBrowseFragment";
        }
        String str = tag;
        aczl aczlVar = this.aC;
        itq itqVar = (itq) aczlVar.b.io();
        itqVar.getClass();
        hur hurVar = (hur) aczlVar.e.io();
        hurVar.getClass();
        abxv abxvVar = (abxv) aczlVar.c.io();
        abxvVar.getClass();
        kyr kyrVar = (kyr) aczlVar.d.io();
        xit xitVar = (xit) aczlVar.g.io();
        xitVar.getClass();
        tbt tbtVar = (tbt) aczlVar.f.io();
        tbtVar.getClass();
        Executor executor = (Executor) aczlVar.a.io();
        executor.getClass();
        this.aH = new gpo(itqVar, hurVar, abxvVar, kyrVar, xitVar, tbtVar, executor, str);
        this.an = false;
        dd parentFragmentManager = getParentFragmentManager();
        di diVar = new di() { // from class: goz
            @Override // defpackage.di
            public final void a() {
                gpl gplVar = this.a;
                if (gplVar.ax.m()) {
                    gplVar.R(true, 1);
                    gplVar.ax.l(false);
                }
            }
        };
        boc lifecycle = getLifecycle();
        if (lifecycle.a() != bob.a) {
            cr crVar = new cr(parentFragmentManager, diVar, lifecycle);
            cw cwVar = (cw) parentFragmentManager.l.put("voiceSearchDismissed", new cw(lifecycle, diVar, crVar));
            if (cwVar != null) {
                cwVar.a.c(cwVar.c);
            }
            if (dd.aa(2)) {
                Objects.toString(lifecycle);
                diVar.toString();
            }
            lifecycle.b(crVar);
        }
        int i = 4;
        this.aN = this.ai.al(new gks(this, 10), new glg(i));
        this.aG = this.av.d(wfs.g(307, "music_show_yt_playlists"), new wxb(this, 1), this.ae);
        if (this.H.l(240, 45794845L, false)) {
            this.aO = ((avlh) this.ax.a).P().E().L(this.m).al(new gks(this, 11), new glg(i));
        }
    }

    @Override // defpackage.cc
    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        if (!this.I.l(31, 45757116L, false) || !z) {
            return null;
        }
        this.aS = false;
        if (i2 != 0) {
            try {
                Animation animationLoadAnimation = AnimationUtils.loadAnimation(requireContext(), i2);
                animationLoadAnimation.setAnimationListener(new dfy(this, 3));
                return animationLoadAnimation;
            } catch (Resources.NotFoundException e) {
                ((agrc) ((agrc) ((agrc) U.c()).j(e)).k("com/google/android/apps/youtube/music/browse/LibraryBrowseFragment", "onCreateAnimation", (char) 322, "LibraryBrowseFragment.java")).t("Failed to load Library page entry animation.");
            }
        }
        X();
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [android.view.Menu, java.lang.Object] */
    @Override // defpackage.gnf, defpackage.cc
    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        Object obj;
        almd almdVar;
        super.onCreateOptionsMenu(menu, menuInflater);
        if (this.H.m(257, 45823344L)) {
            heh hehVar = this.s;
            if (hehVar == null || (obj = hehVar.h) == null || (almdVar = ((wfy) obj).a) == null || almdVar.l.size() == 0) {
                aihh aihhVar = (aihh) almd.a.createBuilder();
                aihhVar.g(this.ay.g());
                almd almdVar2 = (almd) aihhVar.build();
                heh hehVar2 = new heh();
                hehVar2.h = new wfy(almdVar2);
                this.n.d(hehVar2);
                this.n.b(menu);
            }
            MenuItem menuItemFindItem = menu.findItem(R.id.offline_settings_server_menu_item);
            if (menuItemFindItem != null) {
                menuItemFindItem.setVisible(false);
            }
        }
        Optional optionalOr = this.ap.or(new gpa(this, 3));
        gfi gfiVar = new gfi(menu, 18);
        if (true == optionalOr.isPresent()) {
            ((gpv) optionalOr.get()).b(gfiVar.a);
        }
    }

    @Override // defpackage.cc
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.library_browse_fragment, viewGroup, false);
        this.aI = viewInflate;
        this.aj = (ViewGroup) viewInflate.findViewById(R.id.header_container);
        this.B = (Toolbar) this.aI.findViewById(R.id.toolbar);
        this.v = new ggd(this.aI.findViewById(R.id.toolbar_divider));
        this.A = (AppBarLayout) this.aI.findViewById(R.id.app_bar);
        LoadingFrameLayout loadingFrameLayout = (LoadingFrameLayout) this.aI.findViewById(R.id.browse_content);
        j(loadingFrameLayout);
        loadingFrameLayout.e(new gpa(this, 0));
        this.P = this.O.s(loadingFrameLayout);
        this.C = (TabbedView) loadingFrameLayout.findViewById(R.id.tabbed_view);
        this.C.t(this.W);
        this.u = new jhs(this.C, null, null, this.e);
        this.aJ = this.Y.a(this.V, this.e);
        this.am = (ExtendedFloatingActionButton) this.aI.findViewById(R.id.floating_action_button);
        gzj.J(this.A);
        this.af.a(this.A);
        this.aL = this.az.M().al(new gks(this, 12), new glg(4));
        this.A.h(this.aR);
        TabLayout tabLayoutAg = ag();
        this.aQ = tabLayoutAg == null ? -1 : tabLayoutAg.a();
        return this.aI;
    }

    @Override // defpackage.cc
    public final void onDestroy() {
        avmn avmnVar = this.aN;
        if (avmnVar != null && !avmnVar.f()) {
            awka.f((AtomicReference) this.aN);
            this.aN = null;
        }
        avmn avmnVar2 = this.aG;
        if (avmnVar2 != null && !avmnVar2.f()) {
            avnr.b((AtomicReference) this.aG);
            this.aG = null;
        }
        avmn avmnVar3 = this.aO;
        if (avmnVar3 != null && !avmnVar3.f()) {
            awka.f((AtomicReference) this.aO);
            this.aO = null;
        }
        super.onDestroy();
    }

    @Override // defpackage.gnf, defpackage.cc
    public final void onDestroyView() {
        this.aM.b();
        awka.f((AtomicReference) this.aL);
        this.af.b();
        this.am = null;
        AppBarLayout appBarLayout = this.A;
        if (appBarLayout != null) {
            appBarLayout.j(this.aR);
        }
        this.aI = null;
        this.aj = null;
        this.ak = null;
        this.al = null;
        this.aQ = -1;
        this.aT = null;
        this.aU = null;
        this.aV = null;
        super.onDestroyView();
    }

    @Override // defpackage.gnf, defpackage.cc
    public final void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (z) {
            this.as.g(false);
        } else {
            ab();
        }
    }

    @Override // defpackage.gnf, defpackage.cc
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.history_menu_item) {
            if (menuItem.getItemId() != R.id.offline_settings_menu_item) {
                return super.onOptionsItemSelected(menuItem);
            }
            this.c.a(ixt.A());
            return true;
        }
        aihh aihhVar = (aihh) kro.ai("FEmusic_history").toBuilder();
        aihl aihlVar = aoaq.b;
        aihf aihfVarCreateBuilder = aoar.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        aoar aoarVar = (aoar) aihfVarCreateBuilder.instance;
        aoarVar.b |= 2;
        aoarVar.d = 167774;
        aihhVar.e(aihlVar, (aoar) aihfVarCreateBuilder.build());
        this.c.a((ajwo) aihhVar.build());
        return true;
    }

    @Override // defpackage.gnf, defpackage.cc
    public final void onResume() {
        super.onResume();
        k();
        if (this.ax.m()) {
            R(true, 1);
            this.ax.l(false);
        }
    }

    @Override // defpackage.gnf, defpackage.cc
    /* JADX INFO: renamed from: onSaveInstanceState */
    public final void m668x22bc4f96(Bundle bundle) {
        ajwo ajwoVar = this.ar;
        String str = null;
        if (ajwoVar != null) {
            aihl aihlVarCheckIsLite = aihn.checkIsLite(ajmj.a);
            ajwoVar.c(aihlVarCheckIsLite);
            Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
            if ((((ajmf) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK))).b & 1) != 0) {
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(ajmj.a);
                ajwoVar.c(aihlVarCheckIsLite2);
                Object objK2 = ajwoVar.j.k(aihlVarCheckIsLite2.d);
                str = ((ajmf) (objK2 == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK2))).c;
            }
        }
        heh hehVar = this.s;
        if (hehVar != null && str != null && !str.equals(hehVar.b())) {
            this.s.j(this.ar);
        }
        super.m668x22bc4f96(bundle);
    }

    @Override // defpackage.cc
    public final void onStart() {
        super.onStart();
        int i = 4;
        this.aF.e(this.aH.c.P().p().L(this.m).al(new gks(this, 13), new glg(i)), this.aH.d.P().p().L(this.m).al(new gks(this, 14), new glg(i)));
        Optional optional = this.ap;
        gfi gfiVar = new gfi(this, 16);
        if (true == optional.isPresent()) {
            ((gpv) optional.get()).c((gpl) gfiVar.a);
        }
    }

    @Override // defpackage.gnf, defpackage.cc
    public final void onStop() {
        super.onStop();
        this.aF.b();
        Optional optional = this.ap;
        if (true == optional.isPresent()) {
            ((gpv) optional.get()).d();
        }
    }

    @Override // defpackage.gnf, defpackage.cc
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        G();
        if (this.s.l(1) || this.s.g == hei.e) {
            R(false, 1);
        }
        o(this.s);
        requireActivity().getOnBackPressedDispatcher().c(getViewLifecycleOwner(), this.as);
    }

    @Override // defpackage.gnf, defpackage.adtm
    public final void p(toe toeVar, acjx acjxVar) {
        ((agrc) ((agrc) ((agrc) U.b()).j(toeVar)).k("com/google/android/apps/youtube/music/browse/LibraryBrowseFragment", "onContinuationError", (char) 1512, "LibraryBrowseFragment.java")).w("Continuation error: %s", this.Z.b(toeVar));
        if (acjxVar.a() == acjw.d) {
            Z(acjxVar, null);
            ixi ixiVar = this.ak;
            if (ixiVar != null) {
                ixiVar.h(agpi.a);
            }
            if (this.P != null) {
                Throwable cause = toeVar.getCause();
                isi isiVar = this.P;
                String strC = acjxVar.c();
                agkz agkzVar = gpo.a;
                boolean z = !(hle.b(strC) || gpo.a.contains(strC));
                if (cause == null) {
                    cause = toeVar;
                }
                isiVar.o(z, cause);
            }
        }
    }

    @Override // defpackage.gnf, defpackage.adtp
    public final void q(acjy acjyVar, acjw acjwVar) {
        isi isiVar = this.P;
        if (isiVar != null) {
            isiVar.m();
        }
        if (gpo.e(this.ao)) {
            this.aH.b.n("ol");
        }
    }

    @Override // defpackage.gnf
    protected final void r(heh hehVar) {
        if (!this.aS) {
            this.aU = hehVar;
            return;
        }
        super.m(hehVar);
        if (this.H.l(206, 45734052L, false)) {
            this.y = null;
            ExtendedFloatingActionButton extendedFloatingActionButton = this.am;
            if (extendedFloatingActionButton != null) {
                extendedFloatingActionButton.setVisibility(8);
            }
            if (this.w.isPresent()) {
                ((jav) this.w.get()).k();
            }
        }
        isi isiVar = this.P;
        if (isiVar != null) {
            isiVar.n(hehVar.f, hehVar.n);
        }
        ah();
    }

    @Override // defpackage.gnf
    protected final void s(heh hehVar) {
        super.m(hehVar);
        isi isiVar = this.P;
        if (isiVar != null) {
            isiVar.l();
            this.P.p();
        }
        this.N = null;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00f9  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r8v0, types: [bog, java.lang.Object] */
    @Override // defpackage.gnf
    protected final void t(heh hehVar) {
        final afdm afdmVar;
        afdk afdkVarC;
        gnn gnnVar;
        if (!this.aS) {
            this.aT = hehVar;
            return;
        }
        super.t(hehVar);
        yvh yvhVar = this.N;
        byte[] bArr = null;
        if (yvhVar != null) {
            ai(yvhVar.d, hehVar.c.b);
            if (!isHidden()) {
                F();
            }
            this.N = null;
        } else {
            n();
            this.e.d(new xgj(((wfy) hehVar.h).d()));
            ai(((wfy) hehVar.h).f(), hehVar.c.b);
            int i = 7;
            int i2 = 1;
            if (!isHidden()) {
                F();
                heh hehVar2 = this.s;
                Object obj = hehVar2.h;
                almd almdVar = obj != null ? ((wfy) obj).a : null;
                if (almdVar != null && (gnnVar = hehVar2.a) != null && gnnVar.a) {
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
                    anxn anxnVar = (anxn) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
                    apji apjiVar2 = anxnVar.g;
                    if (apjiVar2 == null) {
                        apjiVar2 = apji.a;
                    }
                    aihl aihlVarCheckIsLite2 = aihn.checkIsLite(anrx.a);
                    apjiVar2.c(aihlVarCheckIsLite2);
                    Object objK2 = apjiVar2.j.k(aihlVarCheckIsLite2.d);
                    Collection.EL.stream(((anrw) (objK2 == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK2))).d).filter(new gqk(i2)).map(new bwa(i)).forEach(new hfo(this, anxnVar, i2, bArr));
                }
            }
            TabLayout tabLayoutAg = ag();
            if (tabLayoutAg != null) {
                int iA = tabLayoutAg.a();
                int i3 = this.aQ;
                if (iA != i3 || (afdkVarC = tabLayoutAg.c(i3)) == null) {
                    afdmVar = null;
                } else {
                    afdmVar = afdkVarC.g;
                }
            } else {
                afdmVar = null;
            }
            View view = this.D;
            if (view != null && afdmVar != null) {
                final aczl aczlVar = this.aB;
                final View viewFindViewById = view.findViewById(R.id.button_text);
                final gpa gpaVar = new gpa(this, 2);
                ?? r8 = aczlVar.f;
                afxd afxdVarF = afxd.f(aczlVar.F());
                gpr gprVar = new gpr(0);
                ?? r12 = aczlVar.a;
                taf.j(taf.a(r8, new ahdn(agke.p(new ListenableFuture[]{taf.a(r8, afxdVarF.h(gprVar, r12), new cbs(8)), taf.a(r8, afxd.f(aczlVar.F()).h(new gpr(i2), r12), new cbs(i))}), true), new agek() { // from class: gpp
                    @Override // defpackage.agek
                    public final Object apply(Object obj2) {
                        List list = (List) obj2;
                        boolean z = false;
                        boolean zBooleanValue = ((Boolean) list.get(0)).booleanValue();
                        aczl aczlVar2 = aczlVar;
                        if (zBooleanValue) {
                            if (((Boolean) list.get(1)).booleanValue() || ((vxz) aczlVar2.g).l(206, 45734052L, false)) {
                                return Boolean.FALSE;
                            }
                            View view2 = afdmVar;
                            Object obj3 = aczlVar2.b;
                            Object obj4 = aczlVar2.d;
                            aefk aefkVarB = aefl.b();
                            Context context = (Context) obj4;
                            aefkVarB.b = context.getString(R.string.library_content_selector_shortcut_tooltip_title);
                            aefkVarB.c = context.getString(R.string.library_content_selector_shortcut_tooltip_subtitle);
                            aefkVarB.l(1);
                            aefkVarB.k(0.65f);
                            aefkVarB.j(-2);
                            aefkVarB.a = view2;
                            aefl aeflVarC = aefkVarB.c();
                            aefv aefvVar = (aefv) obj3;
                            aefvVar.d(new jiq(aczlVar2, aeflVarC, 1));
                            aefvVar.c(aeflVarC);
                            return Boolean.TRUE;
                        }
                        Supplier supplier = gpaVar;
                        Object obj5 = aczlVar2.b;
                        Object obj6 = aczlVar2.d;
                        aefk aefkVarB2 = aefl.b();
                        Context context2 = (Context) obj6;
                        aefkVarB2.b = context2.getString(R.string.library_history_education_tooltip_title);
                        aefkVarB2.c = context2.getString(R.string.library_history_header_item_education_tooltip_subtitle);
                        aefkVarB2.l(2);
                        aefkVarB2.k(0.65f);
                        aefkVarB2.j(-2);
                        aefl aeflVarC2 = aefkVarB2.c();
                        if (((vxz) aczlVar2.g).l(206, 45734052L, false)) {
                            View view3 = (View) supplier.get();
                            if (view3 != null) {
                                aefv aefvVar2 = (aefv) obj5;
                                aefvVar2.d(new gps(aczlVar2));
                                aefk aefkVar = new aefk(aeflVarC2);
                                aefkVar.a = view3;
                                aefvVar2.c(aefkVar.c());
                            } else {
                                aczlVar2.G();
                            }
                            return Boolean.valueOf(z);
                        }
                        View view4 = viewFindViewById;
                        aefk aefkVarB3 = aefl.b();
                        aefkVarB3.b = context2.getString(R.string.library_content_selector_education_tooltip_title);
                        aefkVarB3.c = context2.getString(R.string.library_content_selector_education_tooltip_subtitle);
                        aefkVarB3.l(2);
                        aefkVarB3.e(1);
                        aefkVarB3.k(0.65f);
                        aefkVarB3.j(-2);
                        aefkVarB3.a = view4;
                        aefl aeflVarC3 = aefkVarB3.c();
                        aefv aefvVar3 = (aefv) obj5;
                        aefvVar3.d(new gpt(aczlVar2, aeflVarC3, supplier, aeflVarC2));
                        aefvVar3.c(aeflVarC3);
                        z = true;
                        return Boolean.valueOf(z);
                    }
                }), new glo(3));
            }
            Iterator it = ((wfy) hehVar.h).a.m.iterator();
            while (it.hasNext()) {
                this.c.a((ajwo) it.next());
            }
            Iterator it2 = ((wfy) hehVar.h).a.n.iterator();
            while (it2.hasNext()) {
                this.c.a((ajwo) it2.next());
            }
            this.y = null;
        }
        ah();
    }

    @Override // defpackage.gnf
    protected final void u(heh hehVar) {
        int i = 3;
        if (this.H.l(206, 45734052L, false)) {
            E(jij.e(getContext().getString(R.string.pivot_library)));
            if (j$.util.Objects.equals(hehVar.b(), "FEmusic_library_landing")) {
                goy goyVar = (goy) this.ag.io();
                ViewGroup viewGroup = this.aj;
                xgn xgnVar = this.e;
                xgnVar.getClass();
                if (viewGroup != null && viewGroup.getChildCount() <= 0) {
                    ajsv ajsvVar = ajsv.a;
                    aihf aihfVarCreateBuilder = ajsvVar.createBuilder();
                    aihfVarCreateBuilder.getClass();
                    afxw.aw("cancel", aihfVarCreateBuilder);
                    afxw.ay("cancel", aihfVarCreateBuilder);
                    aihfVarCreateBuilder.copyOnWrite();
                    ajsv ajsvVar2 = (ajsv) aihfVarCreateBuilder.instance;
                    ajsvVar2.f = 6;
                    ajsvVar2.b |= 8;
                    ajsv ajsvVarAv = afxw.av(aihfVarCreateBuilder);
                    aihf aihfVarCreateBuilder2 = ajsvVar.createBuilder();
                    aihfVarCreateBuilder2.getClass();
                    Context context = goyVar.e;
                    String string = context.getString(R.string.library_downloads_shelf_title);
                    string.getClass();
                    afxw.az(string, aihfVarCreateBuilder2);
                    afxw.aw("loading_state_chip_downloads", aihfVarCreateBuilder2);
                    afxw.ay("root", aihfVarCreateBuilder2);
                    CommandOuterClass$Command commandOuterClass$Command = CommandOuterClass$Command.a;
                    aihh aihhVar = (aihh) commandOuterClass$Command.createBuilder();
                    aihhVar.getClass();
                    aihl aihlVar = almz.a;
                    aihlVar.getClass();
                    ajwo ajwoVarA = vxh.a("FEmusic_offline");
                    ajwoVarA.getClass();
                    aihhVar.e(aihlVar, ajwoVarA);
                    afxw.ax(atqn.h(aihhVar), aihfVarCreateBuilder2);
                    ajsv ajsvVarAv2 = afxw.av(aihfVarCreateBuilder2);
                    aihf aihfVarCreateBuilder3 = ajsvVar.createBuilder();
                    aihfVarCreateBuilder3.getClass();
                    String string2 = context.getString(R.string.library_device_files_songs_shelf_title);
                    string2.getClass();
                    afxw.az(string2, aihfVarCreateBuilder3);
                    afxw.aw("loading_state_chip_sideloaded", aihfVarCreateBuilder3);
                    afxw.ay("root", aihfVarCreateBuilder3);
                    aihh aihhVar2 = (aihh) commandOuterClass$Command.createBuilder();
                    aihhVar2.getClass();
                    aihlVar.getClass();
                    ajwo ajwoVarA2 = vxh.a("FEmusic_library_sideloaded_tracks");
                    ajwoVarA2.getClass();
                    aihhVar2.e(aihlVar, ajwoVarA2);
                    afxw.ax(atqn.h(aihhVar2), aihfVarCreateBuilder3);
                    ajsv ajsvVarAv3 = afxw.av(aihfVarCreateBuilder3);
                    aihf aihfVarCreateBuilder4 = aseq.a.createBuilder();
                    aihfVarCreateBuilder4.getClass();
                    atqn.H(aihfVarCreateBuilder4);
                    aihfVarCreateBuilder4.cw(ajsvVarAv);
                    atqn.H(aihfVarCreateBuilder4);
                    aihfVarCreateBuilder4.cw(ajsvVarAv2);
                    atqn.H(aihfVarCreateBuilder4);
                    aihfVarCreateBuilder4.cw(ajsvVarAv3);
                    aihn aihnVarBuild = aihfVarCreateBuilder4.build();
                    aihnVarBuild.getClass();
                    awro.t(goyVar.f, null, 0, new egh(goyVar, viewGroup, (aseq) aihnVarBuild, xgnVar, (awoq) null, 3), 3);
                }
            }
        } else {
            String strB = hehVar.b();
            if (strB != null) {
                E(this.aw.d(strB));
            }
        }
        isi isiVar = this.P;
        if (isiVar != null) {
            isiVar.p();
        }
        if (ae()) {
            ListenableFuture listenableFuture = this.aK;
            if (listenableFuture != null) {
                listenableFuture.cancel(false);
            }
            ListenableFuture listenableFutureP = ahng.p(new inq(1), aD.toSeconds(), TimeUnit.SECONDS, this.ae);
            this.aK = listenableFutureP;
            taf.l(this, listenableFutureP, new gnx(i), new glm(this, 5));
        }
    }

    @Override // defpackage.gnf
    protected final void w(heh hehVar) {
        Toolbar toolbar;
        D(hehVar);
        String strH = h();
        if (strH == null || (toolbar = this.B) == null) {
            return;
        }
        toolbar.v(strH);
        View view = this.aI;
        if (view != null) {
            Q(view, strH);
        }
    }
}
