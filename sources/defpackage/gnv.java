package defpackage;

import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.android.apps.youtube.music.ui.components.loading.LoadingFrameLayout;
import com.google.android.apps.youtube.music.ui.refresh.MusicSwipeRefreshLayout;
import com.google.android.apps.youtube.music.ui.tabs.TabbedView;
import com.google.android.material.appbar.AppBarLayout;
import j$.util.Optional;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class gnv extends gog {
    private static final agrf ag = agrf.h("com/google/android/apps/youtube/music/browse/DefaultBrowseFragment");
    public wom U;
    public izf V;
    public tbt W;
    public jaz X;
    public ttm Y;
    public hvo Z;
    public jax aa;
    public ci ae;
    public hhb af;
    private View ah;
    private ViewGroup ai;
    private advd aj;
    private final avmm ak = new avmm();
    final qr ab = new gnt(this);
    final adtp ac = new gnu(this, 0);
    final jau ad = new gor(1);

    private final void V(List list) {
        yvh yvhVar;
        angn angnVar;
        View viewJ;
        jhs jhsVar = this.u;
        if (jhsVar != null) {
            jhsVar.f();
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            aftj aftjVar = (aftj) it.next();
            final wgd wgdVarH = aftjVar.h();
            aqjg aqjgVar = ((aqjj) aftjVar.b).i;
            if (aqjgVar == null) {
                aqjgVar = aqjg.a;
            }
            if ((aqjgVar.b & SemanticState.ReadOnly) != 0) {
                angnVar = aqjgVar.d;
                if (angnVar == null) {
                    angnVar = angn.a;
                }
            } else {
                angnVar = null;
            }
            if (angnVar != null || wgdVarH != null) {
                cf activity = getActivity();
                if (activity == null) {
                    return;
                }
                MusicSwipeRefreshLayout musicSwipeRefreshLayout = new MusicSwipeRefreshLayout(activity);
                jhh jhhVarL = this.af.l(musicSwipeRefreshLayout);
                if (angnVar != null) {
                    adma admaVarE = adul.e(this.j.a, angnVar, null);
                    if (admaVarE == null) {
                        return;
                    }
                    adly adlyVar = new adly();
                    adlyVar.a(this.e);
                    adlyVar.f("messageRendererHideDivider", Boolean.TRUE);
                    admaVarE.hU(adlyVar, angnVar);
                    jhs jhsVar2 = this.u;
                    if (jhsVar2 != null) {
                        jhsVar2.o(aftjVar, null, admaVarE.a(), null);
                    }
                } else {
                    View viewInflate = RelativeLayout.inflate(activity, R.layout.section_list, null);
                    final RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.section_list_content);
                    heh hehVar = this.s;
                    String strB = hehVar != null ? hehVar.b() : null;
                    if (strB != null && hdu.b(strB)) {
                        recyclerView.setTag(R.id.disable_section_list_auto_padding_tag, Boolean.TRUE);
                    }
                    yvh yvhVar2 = this.N;
                    adxd adxdVar = yvhVar2 != null ? (adxd) ((agkj) yvhVar2.c).get(aftjVar) : null;
                    jax jaxVar = this.aa;
                    jaf jafVar = new jaf();
                    jafVar.n(adxdVar);
                    jafVar.o(recyclerView);
                    jafVar.p(this.Q);
                    jafVar.q(this.R);
                    jafVar.g(new advn());
                    jafVar.a = new advn();
                    jafVar.b |= 16;
                    jafVar.j(this.U);
                    jafVar.l(this.aj);
                    jafVar.m(this.j.a);
                    jafVar.e(this.e);
                    jafVar.i(new gnd(this));
                    jafVar.d(this.ai);
                    jafVar.k(this.ad);
                    jafVar.h(jhhVarL);
                    jav javVarA = jaxVar.a(jafVar.a());
                    javVarA.L(new adlz() { // from class: gns
                        @Override // defpackage.adlz
                        public final void a(adly adlyVar2, adkz adkzVar, int i) {
                            gnv gnvVar = this.a;
                            adlyVar2.f("pagePadding", Integer.valueOf(jnj.x(gnvVar.requireContext())));
                            if (i == 0) {
                                int iMax = 0;
                                apox apoxVar = (apox) wgdVarH.a.f.get(0);
                                if ((apoxVar.b & 32) != 0) {
                                    amgg amggVar = apoxVar.m;
                                    if (amggVar == null) {
                                        amggVar = amgg.a;
                                    }
                                    if (amggVar.e.isEmpty()) {
                                        return;
                                    }
                                    amgg amggVar2 = apoxVar.m;
                                    if (amggVar2 == null) {
                                        amggVar2 = amgg.a;
                                    }
                                    if ((((amgj) amggVar2.e.get(0)).d & SemanticState.Multiline) != 0) {
                                        amgg amggVar3 = apoxVar.m;
                                        if (amggVar3 == null) {
                                            amggVar3 = amgg.a;
                                        }
                                        angn angnVar2 = ((amgj) amggVar3.e.get(0)).aP;
                                        if (angnVar2 == null) {
                                            angnVar2 = angn.a;
                                        }
                                        if ((angnVar2.b & 8) != 0) {
                                            ango angoVar = angnVar2.g;
                                            if (angoVar == null) {
                                                angoVar = ango.a;
                                            }
                                            int iP = aext.p(angoVar.b);
                                            if (iP == 0 || iP != 9) {
                                                return;
                                            }
                                            RecyclerView recyclerView2 = recyclerView;
                                            if (recyclerView2 != null) {
                                                iMax = Math.max((recyclerView2.getHeight() / 2) - (gnvVar.getResources().getDimensionPixelSize(R.dimen.message_renderer_height) / 2), gnvVar.getResources().getDimensionPixelSize(R.dimen.message_renderer_minimum_top_margin));
                                            }
                                            adlyVar2.f("messageRendererLayoutTopMargin", Integer.valueOf(iMax));
                                        }
                                    }
                                }
                            }
                        }
                    });
                    this.w = Optional.of(javVarA);
                    javVarA.ao = this.ac;
                    javVarA.an = this;
                    musicSwipeRefreshLayout.addView(viewInflate);
                    jhhVarL.a = javVarA;
                    if (adxdVar == null) {
                        javVarA.at(wgdVarH);
                    } else if (recyclerView.n != null) {
                        yvh yvhVar3 = this.N;
                        Parcelable parcelable = yvhVar3 != null ? (Parcelable) ((agkj) yvhVar3.b).get(aftjVar) : null;
                        if (parcelable != null) {
                            recyclerView.n.onRestoreInstanceState(parcelable);
                        }
                    }
                    jhs jhsVar3 = this.u;
                    if (jhsVar3 != null) {
                        jhsVar3.o(aftjVar, null, musicSwipeRefreshLayout, javVarA);
                    }
                    TabbedView tabbedView = this.C;
                    if (tabbedView != null && (viewJ = tabbedView.j(tabbedView.d() - 1)) != null && viewJ.getVisibility() == 0) {
                        this.ae.af(aftjVar.b, viewJ);
                    }
                }
            }
        }
        jhs jhsVar4 = this.u;
        if (jhsVar4 == null || (yvhVar = this.N) == null) {
            return;
        }
        jhsVar4.m(yvhVar.a);
    }

    private final void W() {
        this.ab.g(a());
    }

    @Override // defpackage.gnf
    public final void B(boolean z) {
        if (J() || kro.M(this)) {
            return;
        }
        R(z, 1);
    }

    @Override // defpackage.gnf
    protected final void O() {
        W();
    }

    public final boolean a() {
        String strB = this.s.b();
        if (strB != null) {
            agke agkeVar = hdu.a;
            if (TextUtils.equals(strB, "FEypc_offers")) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.gnf
    public final String f() {
        return "music_android_default";
    }

    @tcc
    public void handleNavigateBackAndHideEntryEvent(hcn hcnVar) {
        if (TextUtils.equals(this.s.f(), hcnVar.a)) {
            Map map = this.s.m;
            if (map != null && map.containsKey("com.google.android.libraries.youtube.innertube.endpoint.tag")) {
                this.W.c(new vvt(this.s.m.get("com.google.android.libraries.youtube.innertube.endpoint.tag")));
            }
            this.d.g(this);
        }
    }

    @Override // defpackage.cc, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        jhs jhsVar = this.u;
        if (jhsVar != null) {
            jhsVar.k(configuration);
        }
    }

    @Override // defpackage.gnf, defpackage.cc
    /* JADX INFO: renamed from: onCreate */
    public final void m658lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        super.m658lambda$performCreate$3$androidsupportv4appFragment(bundle);
        this.W.f(this);
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
    @Override // defpackage.cc
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.ah = layoutInflater.inflate(R.layout.browse_fragment, viewGroup, false);
        if (this.I.l(31, 45757116L, false)) {
            this.ah.setBackgroundColor(requireContext().getColor(R.color.theme_main_window_background));
        }
        LoadingFrameLayout loadingFrameLayout = (LoadingFrameLayout) this.ah.findViewById(R.id.browse_content);
        heh hehVar = this.s;
        String strB = hehVar != null ? hehVar.b() : null;
        if (strB != null && hdu.b(strB)) {
            ViewGroup.LayoutParams layoutParams = loadingFrameLayout.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.bottomMargin = getResources().getDimensionPixelSize(R.dimen.mini_player_height);
                loadingFrameLayout.setLayoutParams(marginLayoutParams);
            }
        }
        this.ai = (ViewGroup) this.ah.findViewById(R.id.header_container);
        this.B = (Toolbar) this.ah.findViewById(R.id.toolbar);
        this.v = new ggd(this.ah.findViewById(R.id.toolbar_divider));
        this.A = (AppBarLayout) this.ah.findViewById(R.id.app_bar);
        this.P = this.O.s(loadingFrameLayout);
        this.C = (TabbedView) loadingFrameLayout.findViewById(R.id.tabbed_view);
        this.C.t(this.V);
        this.u = new jhs(this.C, null, null, this.e);
        j(loadingFrameLayout);
        this.aj = this.X.a(this.U, this.e);
        return this.ah;
    }

    @Override // defpackage.cc
    public final void onDestroy() {
        this.W.l(this);
        this.ak.dispose();
        super.onDestroy();
    }

    @Override // defpackage.gnf, defpackage.cc
    public final void onDestroyView() {
        this.ah = null;
        super.onDestroyView();
    }

    @Override // defpackage.cc
    public final void onPrepareOptionsMenu(Menu menu) {
        String strB;
        heh hehVar = this.s;
        if (hehVar == null || (strB = hehVar.b()) == null) {
            return;
        }
        if (hdu.b(strB) || TextUtils.equals(strB, "FEmusic_trophies_list")) {
            menu.removeItem(R.id.action_avatar);
        } else if (TextUtils.equals(strB, "FEgenerated_image_themes")) {
            menu.clear();
        }
    }

    @Override // defpackage.gnf, defpackage.cc
    public final void onResume() {
        super.onResume();
        String strB = this.s.b();
        if (strB != null) {
            agke agkeVar = hdu.a;
            if (TextUtils.equals(strB, "FEmemberships_and_purchases") || TextUtils.equals(strB, "FEmembership_detail")) {
                B(false);
            }
        }
        requireActivity().getOnBackPressedDispatcher().c(getViewLifecycleOwner(), this.ab);
        W();
    }

    @Override // defpackage.gnf, defpackage.cc
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        G();
        if (this.s.l(1) || this.s.g == hei.e) {
            B(false);
        }
        o(this.s);
    }

    @Override // defpackage.gnf, defpackage.adtm
    public final void p(toe toeVar, acjx acjxVar) {
        ((agrc) ((agrc) ((agrc) ag.b()).j(toeVar)).k("com/google/android/apps/youtube/music/browse/DefaultBrowseFragment", "onContinuationError", (char) 514, "DefaultBrowseFragment.java")).w("Continuation error: %s", this.Y.b(toeVar));
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
        this.N = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object, xir] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.gnf
    protected final void t(heh hehVar) {
        super.t(hehVar);
        yvh yvhVar = this.N;
        if (yvhVar != null) {
            V(yvhVar.d);
            this.N = null;
            isi isiVar = this.P;
            if (isiVar != null) {
                isiVar.m();
                return;
            }
            return;
        }
        n();
        this.e.d(new xgj(((wfy) hehVar.h).d()));
        V(((wfy) hehVar.h).f());
        isi isiVar2 = this.P;
        if (isiVar2 != null) {
            isiVar2.m();
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
            this.f.postAtFrontOfQueue(new gnc(this, 5));
        }
    }

    @Override // defpackage.gnf
    protected final void u(heh hehVar) {
        isi isiVar = this.P;
        if (isiVar != null) {
            isiVar.p();
        }
    }

    @Override // defpackage.gnf
    protected final void w(heh hehVar) {
        Toolbar toolbar;
        String strH = h();
        if (strH == null || (toolbar = this.B) == null) {
            return;
        }
        toolbar.v(strH);
        View view = this.ah;
        if (view != null) {
            Q(view, strH);
        }
    }
}
