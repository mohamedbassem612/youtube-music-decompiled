package defpackage;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.constraintlayout.widget.ConstraintLayout;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.android.apps.youtube.music.ui.components.loading.LoadingFrameLayout;
import com.google.android.apps.youtube.music.ui.refresh.MusicSwipeRefreshLayout;
import com.google.android.apps.youtube.music.ui.tabs.TabbedView;
import com.google.android.libraries.quantum.fab.FloatingActionButton;
import com.google.android.libraries.youtube.rendering.ui.ScrollToTopLinearLayoutManager;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class gms extends cc implements aeum, xgm, hku, gqj {
    private static final agrf ae = agrf.h("com/google/android/apps/youtube/music/browse/AbstractDetailPageFragment");
    protected TabbedView A;
    protected jhs B;
    protected adma C;
    public Object D;
    protected apji E;
    protected FloatingActionButton F;
    public ExtendedFloatingActionButton G;
    public hej H;
    public int I;
    public boolean J;
    protected boolean K;
    public rql N;
    public hkl O;
    public acwq P;
    public vxz Q;
    public vxz R;
    public vxz S;
    public jij T;
    public jnj U;
    yvh V;
    public isi W;
    protected isi X;
    public aeod Y;
    public hfn Z;
    public Handler a;
    public vwt aa;
    public hfn ab;
    public aehs ac;
    public hhb ad;
    private jay af;
    private ConstraintLayout ag;
    private ViewGroup ah;
    private MusicSwipeRefreshLayout aj;
    private jce ak;
    private boolean al;
    private boolean am;
    public avmb b;
    public ttm c;
    public tbt d;
    public gpw e;
    public jer f;
    public xgn g;
    public wom h;
    public iwe i;
    public jki j;
    public vxe k;
    public jaz l;
    public jax m;
    public avlh n;
    public aunn o;
    public awku p;
    public adxj q;
    public awmd r;
    public awmd s;
    protected View t;
    public AppBarLayout u;
    public CollapsingToolbarLayout v;
    public ViewTreeObserver.OnGlobalLayoutListener w;
    public ViewGroup x;
    public Toolbar y;
    protected View z;
    private final avmm ai = new avmm();
    protected Optional L = Optional.empty();
    final adtp M = new gnu(this, 1);

    private final Optional G() {
        AppBarLayout appBarLayout = this.u;
        if (appBarLayout == null || !(appBarLayout.getLayoutParams() instanceof asv)) {
            return Optional.empty();
        }
        ast astVar = ((asv) this.u.getLayoutParams()).a;
        return !(astVar instanceof AppBarLayout.Behavior) ? Optional.empty() : Optional.of((AppBarLayout.Behavior) astVar);
    }

    private final void H() {
        Optional optionalEmpty;
        View currentFocus = requireActivity().getCurrentFocus();
        int i = 1;
        if (kro.M(this)) {
            optionalEmpty = Optional.empty();
        } else {
            CollapsingToolbarLayout collapsingToolbarLayout = this.v;
            if (collapsingToolbarLayout == null || collapsingToolbarLayout.getChildCount() != 2) {
                ViewGroup viewGroup = this.x;
                if (viewGroup == null || viewGroup.getChildCount() != 1) {
                    optionalEmpty = Optional.empty();
                } else {
                    View childAt = this.x.getChildAt(0);
                    this.x.removeView(childAt);
                    optionalEmpty = Optional.of(childAt);
                }
            } else {
                View childAt2 = this.v.getChildAt(0);
                this.v.removeView(childAt2);
                optionalEmpty = Optional.of(childAt2);
            }
        }
        gtr gtrVar = new gtr(this, currentFocus, i);
        if (true == optionalEmpty.isPresent()) {
            Object obj = optionalEmpty.get();
            Object obj2 = gtrVar.b;
            Object obj3 = gtrVar.a;
            gms gmsVar = (gms) obj2;
            if (gmsVar.D()) {
                ViewGroup viewGroup2 = gmsVar.x;
                if (viewGroup2 != null) {
                    viewGroup2.addView((View) obj);
                }
                gmsVar.w(true);
                ViewGroup viewGroup3 = gmsVar.x;
                if (viewGroup3 != null) {
                    tuk.l(viewGroup3, true);
                }
                gmsVar.t();
                gmsVar.w = new jg(obj2, 6, null);
                CollapsingToolbarLayout collapsingToolbarLayout2 = gmsVar.v;
                if (collapsingToolbarLayout2 != null) {
                    collapsingToolbarLayout2.getViewTreeObserver().addOnGlobalLayoutListener(gmsVar.w);
                }
            } else {
                gmsVar.t();
                CollapsingToolbarLayout collapsingToolbarLayout3 = gmsVar.v;
                if (collapsingToolbarLayout3 != null) {
                    collapsingToolbarLayout3.addView((View) obj);
                    Toolbar toolbar = gmsVar.y;
                    if (toolbar != null) {
                        gmsVar.v.bringChildToFront(toolbar);
                    }
                }
                gmsVar.w(false);
                ViewGroup viewGroup4 = gmsVar.x;
                if (viewGroup4 != null) {
                    tuk.l(viewGroup4, false);
                }
            }
            if (obj3 != null) {
                ((View) obj3).requestFocus();
            }
        }
    }

    private final void I() {
        ConstraintLayout constraintLayout = this.ag;
        if (constraintLayout != null) {
            asv asvVar = (asv) constraintLayout.getLayoutParams();
            if (asvVar != null) {
                asvVar.b(new AppBarLayout.ScrollingViewBehavior());
                this.ag.setLayoutParams(asvVar);
            }
            CollapsingToolbarLayout collapsingToolbarLayout = this.v;
            if (collapsingToolbarLayout != null) {
                aeuj aeujVar = (aeuj) collapsingToolbarLayout.getLayoutParams();
                if (aeujVar != null) {
                    aeujVar.a = 3;
                    this.v.setLayoutParams(aeujVar);
                }
                Toolbar toolbar = this.y;
                if (toolbar != null) {
                    toolbar.setBackgroundColor(requireContext().getColor(R.color.black_header_color));
                }
            }
        }
    }

    private final void J(View view, hww hwwVar) {
        Resources resources = getResources();
        aihf aihfVarCreateBuilder = ailj.a.createBuilder();
        int dimensionPixelSize = (hwwVar.b(hww.a) ? 0 : resources.getDimensionPixelSize(R.dimen.mini_player_height)) + resources.getDimensionPixelSize(R.dimen.item_large_spacing);
        aihfVarCreateBuilder.copyOnWrite();
        ailj ailjVar = (ailj) aihfVarCreateBuilder.instance;
        ailjVar.b |= 4;
        ailjVar.e = dimensionPixelSize;
        jle.b((ailj) aihfVarCreateBuilder.build(), view);
        view.requestLayout();
    }

    private static boolean K(Object obj) {
        if (obj instanceof anob) {
            return ((anob) obj).d;
        }
        if (obj instanceof annx) {
            annx annxVar = (annx) obj;
            apji apjiVar = annxVar.c;
            if (apjiVar == null) {
                apjiVar = apji.a;
            }
            aihl aihlVarCheckIsLite = aihn.checkIsLite(anoc.a);
            apjiVar.c(aihlVarCheckIsLite);
            if (apjiVar.j.n(aihlVarCheckIsLite.d)) {
                apji apjiVar2 = annxVar.c;
                if (apjiVar2 == null) {
                    apjiVar2 = apji.a;
                }
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(anoc.a);
                apjiVar2.c(aihlVarCheckIsLite2);
                Object objK = apjiVar2.j.k(aihlVarCheckIsLite2.d);
                return ((anob) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK))).d;
            }
        }
        return false;
    }

    @Override // defpackage.hku
    public final boolean A() {
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

    protected boolean B() {
        return false;
    }

    protected boolean C() {
        return false;
    }

    public final boolean D() {
        if (!this.R.l(12, 45676031L, false)) {
            return hfn.G(requireActivity());
        }
        dwz dwzVarA = dxa.a().a(requireActivity());
        float f = requireActivity().getResources().getDisplayMetrics().density;
        return ((int) (((float) dwzVarA.a().width()) / f)) >= 840 && ((int) (((float) dwzVarA.a().height()) / f)) >= 600;
    }

    protected final void E() {
        this.V = null;
    }

    public final void F() {
        this.L.isPresent();
    }

    protected abstract int a();

    protected final Optional d() {
        Optional optionalOfNullable = Optional.ofNullable(this.B);
        if (true != optionalOfNullable.isPresent()) {
            return optionalOfNullable;
        }
        jhs jhsVar = (jhs) optionalOfNullable.get();
        return Optional.ofNullable((jav) jhsVar.d(Math.max(0, jhsVar.b())));
    }

    public final void e(gmr gmrVar) {
        acwf acwfVarT = acww.t();
        acwfVarT.a = requireContext().getString(R.string.discard_changes_dialog_title);
        acwfVarT.b = ackj.d(requireContext().getString(R.string.discard_changes_dialog_msg));
        ajnf ajnfVar = ajnf.a;
        aihh aihhVar = (aihh) ajnfVar.createBuilder();
        alay alayVarD = ackj.d(requireContext().getString(R.string.discard_changes_dialog_confirm_button));
        aihhVar.copyOnWrite();
        ajnf ajnfVar2 = (ajnf) aihhVar.instance;
        alayVarD.getClass();
        ajnfVar2.m = alayVarD;
        ajnfVar2.b |= 64;
        aihhVar.copyOnWrite();
        ajnf ajnfVar3 = (ajnf) aihhVar.instance;
        ajnfVar3.d = 42;
        ajnfVar3.c = 1;
        acwfVarT.c = (ajnf) aihhVar.build();
        aihh aihhVar2 = (aihh) ajnfVar.createBuilder();
        alay alayVarD2 = ackj.d(requireContext().getString(android.R.string.cancel));
        aihhVar2.copyOnWrite();
        ajnf ajnfVar4 = (ajnf) aihhVar2.instance;
        alayVarD2.getClass();
        ajnfVar4.m = alayVarD2;
        ajnfVar4.b |= 64;
        aihhVar2.copyOnWrite();
        ajnf ajnfVar5 = (ajnf) aihhVar2.instance;
        ajnfVar5.d = 39;
        ajnfVar5.c = 1;
        acwfVarT.d = (ajnf) aihhVar2.build();
        acwfVarT.f = new jcg(gmrVar, 1);
        this.P.f(acwfVarT.a());
    }

    @Override // defpackage.hku
    public final Optional gS() {
        Optional optionalOfNullable = Optional.ofNullable(this.H);
        return true == optionalOfNullable.isPresent() ? Optional.ofNullable(((hej) optionalOfNullable.get()).f) : optionalOfNullable;
    }

    public final void h() {
        this.g.D(xhb.a(a()), xgu.a, this.H.f);
        if (this.O.m()) {
            this.O.c(this.g);
        }
    }

    @Override // defpackage.xgm
    public final xgn hB() {
        return this.g;
    }

    protected abstract Optional hE();

    protected abstract void hF(hej hejVar);

    public final void i(hej hejVar, Object obj) {
        if (hejVar.g != hei.e) {
            hejVar.k(hei.c);
            hejVar.h = obj;
            hejVar.i = null;
        }
        Optional optionalHE = hE();
        if (optionalHE.isPresent()) {
            this.d.c(optionalHE.get());
        }
        if (obj instanceof wfy) {
            s(fhz.ao((wfy) obj));
        }
        k(hejVar);
    }

    protected final void j(hej hejVar, Throwable th) {
        if (hejVar.g != hei.e) {
            ((agrc) ((agrc) ((agrc) ((agrc) ae.b().i(agso.a, "AbstractDetailPageFrag")).l(agsi.MEDIUM)).j(th)).k("com/google/android/apps/youtube/music/browse/AbstractDetailPageFragment", "onEntityError", (char) 1257, "AbstractDetailPageFragment.java")).t("AbstractDetailPageFragment onEntityError.");
            hejVar.k(hei.d);
            hejVar.i = this.c.b(th);
            hejVar.n = th;
            k(hejVar);
            if (txz.d(requireContext()) || txz.g(requireContext()) || txz.f(requireContext())) {
                return;
            }
            if ((th instanceof tmg) || (th instanceof tnc)) {
                this.N.d(requireActivity(), null);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, xir] */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.lang.Object, java.util.List] */
    public final void k(hej hejVar) {
        isi isiVar;
        MusicSwipeRefreshLayout musicSwipeRefreshLayout;
        this.H = hejVar;
        if (getActivity() == null || kro.M(this)) {
            return;
        }
        int iOrdinal = hejVar.g.ordinal();
        if (iOrdinal == 0) {
            jhs jhsVar = this.B;
            if (jhsVar != null) {
                jhsVar.f();
            }
            isi isiVar2 = this.X;
            if (isiVar2 != null) {
                isiVar2.p();
                return;
            }
            return;
        }
        if (iOrdinal == 1) {
            if ((C() && (musicSwipeRefreshLayout = this.aj) != null && musicSwipeRefreshLayout.b) || (isiVar = this.X) == null) {
                return;
            }
            isiVar.p();
            return;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                if (this.R.l(14, 45680269L, false) && (hejVar instanceof heh)) {
                    Optional optional = ((heh) hejVar).c.b;
                    if (true == optional.isPresent()) {
                        optional.get().f(tau.BROWSE_REQUEST_ERROR);
                    }
                }
                isi isiVar3 = this.X;
                if (isiVar3 != null) {
                    isiVar3.n(hejVar.f, hejVar.n);
                    return;
                }
                return;
            }
            return;
        }
        if (this.V == null) {
            l(hejVar);
        } else {
            p(this.D);
            isi isiVar4 = this.X;
            if (isiVar4 != null) {
                isiVar4.m();
            }
            Optional optionalG = G();
            gfi gfiVar = new gfi(this, 6);
            if (true == optionalG.isPresent()) {
                ((AppBarLayout.BaseBehavior) optionalG.get()).setTopAndBottomOffset(((gms) gfiVar.a).I);
            }
            o(this.E);
            yvh yvhVar = this.V;
            if (yvhVar != null) {
                n(yvhVar.d);
            }
        }
        F();
        I();
    }

    protected abstract void l(hej hejVar);

    @Override // defpackage.aeum, defpackage.aeui
    public final void m(AppBarLayout appBarLayout, int i) {
        int iF = appBarLayout.f();
        if (iF > 0) {
            adma admaVar = this.C;
            if (admaVar instanceof aeum) {
                ((aeum) admaVar).m(appBarLayout, i);
            }
        }
        if (this.G == null || kro.M(this)) {
            return;
        }
        int iAbs = Math.abs(i) - iF;
        boolean z = this.J;
        if (iAbs != 0) {
            if (z && this.G.getVisibility() == 0) {
                this.J = false;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.G.getLayoutParams();
                this.G.animate().translationY(this.G.getHeight() + (marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0)).alpha(0.0f).setDuration(getResources().getInteger(android.R.integer.config_shortAnimTime)).withEndAction(new dxk(this, 19)).start();
                return;
            }
            return;
        }
        if (z) {
            return;
        }
        this.J = true;
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.G.getLayoutParams();
        this.G.setTranslationY(this.G.getHeight() + (marginLayoutParams2 != null ? marginLayoutParams2.bottomMargin : 0));
        this.G.setVisibility(0);
        this.G.animate().translationY(0.0f).alpha(1.0f).setDuration(getResources().getInteger(android.R.integer.config_shortAnimTime)).start();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v25 */
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
    protected void n(List list) {
        List<jhr> arrayList;
        int i;
        int i2;
        adww gosVar;
        adwj adwjVarL;
        np npVar;
        if (this.B != null) {
            TabbedView tabbedView = this.A;
            ?? r3 = 1;
            if (tabbedView != null) {
                tabbedView.u(!this.Q.l(209, 45741003L, true) && list.size() > 1);
            }
            boolean zL = this.R.l(47, 45826551L, false);
            if (zL) {
                arrayList = new ArrayList(list.size());
            } else {
                this.B.f();
                arrayList = agpi.a;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                aftj aftjVar = (aftj) it.next();
                MusicSwipeRefreshLayout musicSwipeRefreshLayout = new MusicSwipeRefreshLayout(requireActivity());
                if (C()) {
                    musicSwipeRefreshLayout.setEnabled(r3);
                    gosVar = new gos(this, r3);
                    adwjVarL = this.ad.l(musicSwipeRefreshLayout);
                } else {
                    musicSwipeRefreshLayout.setEnabled(false);
                    gosVar = B() ? new gos(this, r3) : adww.yS;
                    adwjVarL = jhh.c;
                }
                RecyclerView recyclerView = (RecyclerView) RecyclerView.inflate(requireActivity(), R.layout.section_list, null);
                recyclerView.aC(new gmq(this));
                yvh yvhVar = this.V;
                adxd adxdVar = yvhVar != null ? (adxd) ((agkj) yvhVar.c).get(aftjVar) : null;
                jax jaxVar = this.m;
                jaf jafVar = new jaf();
                jafVar.n(adxdVar);
                jafVar.o(recyclerView);
                jafVar.p(this.Y);
                jafVar.q(this.aa);
                jafVar.g(new advn());
                jafVar.j(this.h);
                jafVar.l(this.af);
                jafVar.m(this.f.a);
                jafVar.e(this.g);
                jafVar.i(gosVar);
                jafVar.d(this.ah);
                jafVar.h(adwjVarL);
                jafVar.c(this.G);
                adsr adsrVarA = jaxVar.a(jafVar.a());
                tvy tvyVar = new tvy();
                tvyVar.b(recyclerView);
                adsrVarA.L(new adlx(tvyVar, 0));
                final boolean z = a() == 173689;
                final int iX = jnj.x(requireContext());
                adsrVarA.L(new adlz() { // from class: gmo
                    @Override // defpackage.adlz
                    public final void a(adly adlyVar, adkz adkzVar, int i3) {
                        if (z) {
                            adlyVar.f("useArtistDiscographyPadding", Boolean.TRUE);
                        }
                        adlyVar.f("pagePadding", Integer.valueOf(iX));
                    }
                });
                adsrVarA.ao = this.M;
                musicSwipeRefreshLayout.addView(recyclerView);
                if (C()) {
                    ((jhh) adwjVarL).a = adsrVarA;
                    musicSwipeRefreshLayout.i(requireContext().getColor(R.color.quantum_black_100));
                }
                if (adxdVar != null) {
                    yvh yvhVar2 = this.V;
                    Parcelable parcelable = yvhVar2 != null ? (Parcelable) ((agkj) yvhVar2.b).get(aftjVar) : null;
                    if (parcelable != null && (npVar = recyclerView.n) != null) {
                        npVar.onRestoreInstanceState(parcelable);
                    }
                } else if (aftjVar.h() != null) {
                    adsrVarA.at(aftjVar.h());
                }
                if (zL) {
                    arrayList.add(new jhr(aftjVar, musicSwipeRefreshLayout, adsrVarA));
                } else {
                    this.B.o(aftjVar, null, musicSwipeRefreshLayout, adsrVarA);
                }
                r3 = 1;
            }
            yvh yvhVar3 = this.V;
            if (yvhVar3 != null && (i = yvhVar3.a) != -1) {
                i2 = i;
                break;
            }
            i = 0;
            while (true) {
                if (i >= list.size()) {
                    i2 = 0;
                    break;
                } else {
                    if (((aftj) list.get(i)).b != null && ((aqjj) ((aftj) list.get(i)).b).f) {
                        i2 = i;
                        break;
                    }
                    i++;
                }
            }
            jhs jhsVar = this.B;
            if (zL) {
                jhsVar.g();
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                for (jhr jhrVar : arrayList) {
                    adsr adsrVar = jhrVar.b;
                    Map map = jhsVar.c;
                    aftj aftjVar2 = jhrVar.c;
                    map.put(aftjVar2, adsrVar);
                    arrayList2.add(jhsVar.a.C(aftjVar2, null, jhrVar.a));
                }
                TabbedView tabbedView2 = jhsVar.a;
                tabbedView2.p(new qd(tabbedView2, arrayList2, i2, 8, (byte[]) null));
                for (int i3 = 0; i3 < tabbedView2.d(); i3++) {
                    View viewJ = tabbedView2.j(i3);
                    if (viewJ != null) {
                        viewJ.setTooltipText(null);
                    }
                    jhsVar.j(jhsVar.b, i3);
                }
            } else {
                jhsVar.m(i2);
            }
            this.V = null;
        }
    }

    protected final void o(apji apjiVar) {
        this.E = apjiVar;
        if (apjiVar != null) {
            aihl aihlVarCheckIsLite = aihn.checkIsLite(ajnp.a);
            apjiVar.c(aihlVarCheckIsLite);
            if (apjiVar.j.n(aihlVarCheckIsLite.d) && !this.am) {
                apji apjiVar2 = this.E;
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(ajnp.a);
                apjiVar2.c(aihlVarCheckIsLite2);
                Object objK = apjiVar2.j.k(aihlVarCheckIsLite2.d);
                ajnf ajnfVar = (ajnf) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
                Optional optionalD = d();
                if (!this.Q.l(254, 45817276L, false) || !optionalD.isPresent()) {
                    FloatingActionButton floatingActionButton = this.F;
                    if (floatingActionButton != null) {
                        this.T.a(floatingActionButton, null, null, null, false).hU(new adly(), ajnfVar);
                        return;
                    }
                    return;
                }
                FloatingActionButton floatingActionButton2 = this.F;
                if (floatingActionButton2 != null) {
                    floatingActionButton2.setVisibility(8);
                }
                ((jav) optionalD.get()).l(ajnfVar);
                Optional optionalG = G();
                gfi gfiVar = new gfi(this, 5);
                if (true == optionalG.isPresent()) {
                    Object obj = optionalG.get();
                    gms gmsVar = (gms) gfiVar.a;
                    if (gmsVar.G == null || ((AppBarLayout.BaseBehavior) obj).getTopAndBottomOffset() != 0) {
                        return;
                    }
                    gmsVar.G.setVisibility(8);
                    gmsVar.J = false;
                    return;
                }
                return;
            }
        }
        FloatingActionButton floatingActionButton3 = this.F;
        if (floatingActionButton3 != null) {
            floatingActionButton3.setVisibility(8);
        }
    }

    @Override // defpackage.cc, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        jhs jhsVar;
        jav javVar;
        AppBarLayout.Behavior behavior;
        super.onConfigurationChanged(configuration);
        boolean z = this.am;
        this.am = D();
        if (kro.M(this)) {
            return;
        }
        jhs jhsVar2 = this.B;
        if (jhsVar2 != null) {
            jhsVar2.k(configuration);
        }
        AppBarLayout appBarLayout = this.u;
        if (appBarLayout != null) {
            int iF = appBarLayout.f();
            asv asvVar = (asv) appBarLayout.getLayoutParams();
            if (iF == ((asvVar == null || (behavior = (AppBarLayout.Behavior) asvVar.a) == null) ? 0 : Math.abs(behavior.getTopAndBottomOffset()))) {
                appBarLayout.l(false, false, true);
            }
        }
        adma admaVar = this.C;
        if (admaVar instanceof gdy) {
            ((gdy) admaVar).hS(configuration);
        }
        boolean zK = K(this.D);
        boolean z2 = this.am;
        if (z != z2 && zK) {
            H();
            o(this.E);
            if (!this.am && this.u != null && (jhsVar = this.B) != null && (javVar = (jav) jhsVar.d(jhsVar.b())) != null) {
                AppBarLayout appBarLayout2 = this.u;
                View view = javVar.l;
                if (view != null && !((RecyclerView) view).canScrollVertically(-1)) {
                    appBarLayout2.l(true, false, true);
                }
            }
        } else if (z2 && zK) {
            w(true);
        }
        x(this.Z.x());
    }

    @Override // defpackage.cc
    /* JADX INFO: renamed from: onCreate */
    public void m658lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        hej hejVar;
        super.m658lambda$performCreate$3$androidsupportv4appFragment(bundle);
        this.af = this.l.a(this.h, this.g);
        if (bundle != null && (hejVar = (hej) bundle.getParcelable("entity_model")) != null) {
            this.H = hejVar;
        }
        this.K = bundle == null;
        Bundle arguments = getArguments();
        boolean z = arguments != null ? arguments.getBoolean("defer_entity_loading", false) : false;
        hej hejVar2 = this.H;
        if (hejVar2 == null || hejVar2.g == hei.c || z) {
            return;
        }
        hF(hejVar2);
    }

    @Override // defpackage.cc
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        TabbedView tabbedView;
        this.am = D();
        this.t = layoutInflater.inflate(R.layout.detail_page_tabbed_fragment, viewGroup, false);
        if (this.R.l(31, 45757116L, false)) {
            this.t.setBackgroundColor(requireContext().getColor(R.color.theme_main_window_background));
        }
        this.ah = (ViewGroup) this.t.findViewById(R.id.header_container);
        this.ag = (ConstraintLayout) this.t.findViewById(R.id.content_container);
        LoadingFrameLayout loadingFrameLayout = (LoadingFrameLayout) this.t.findViewById(R.id.results_container);
        loadingFrameLayout.c(new gna(this, 1));
        this.X = this.W.s(loadingFrameLayout);
        AppBarLayout appBarLayout = (AppBarLayout) this.t.findViewById(R.id.detail_page_app_bar);
        this.u = appBarLayout;
        if (appBarLayout != null) {
            appBarLayout.h(this);
        }
        CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) this.t.findViewById(R.id.detail_page_collapsing_toolbar);
        this.v = collapsingToolbarLayout;
        gzj.K(collapsingToolbarLayout);
        ViewGroup viewGroup2 = (ViewGroup) this.t.findViewById(R.id.landscape_header_container);
        this.x = viewGroup2;
        if (viewGroup2 != null) {
            viewGroup2.setClipToPadding(false);
            this.x.setPaddingRelative(0, 0, 0, requireContext().getResources().getDimensionPixelSize(R.dimen.mini_player_height));
            if (this.Q.l(SemanticState.Hidden, 45820150L, false)) {
                ViewGroup.LayoutParams layoutParams = this.x.getLayoutParams();
                if (layoutParams instanceof asb) {
                    ((asb) layoutParams).V = tuk.a(getResources(), R.dimen.two_pane_width_ratio);
                    this.x.requestLayout();
                }
            }
        }
        Toolbar toolbar = (Toolbar) this.t.findViewById(R.id.detail_page_toolbar);
        this.y = toolbar;
        if (toolbar != null) {
            toolbar.o(R.string.navigate_back);
            this.y.C();
            this.y.s(new jn(this, 11, null));
            Toolbar toolbar2 = this.y;
            toolbar2.w = new pd() { // from class: gmp
                @Override // defpackage.pd
                public final boolean a(MenuItem menuItem) {
                    return this.a.onOptionsItemSelected(menuItem);
                }
            };
            aduk adukVar = new aduk(requireContext(), this.q.b(arqz.er));
            adukVar.b(requireContext().getColor(R.color.ytm_icon_color_active));
            toolbar2.r(adukVar.a());
        }
        this.i.a(0);
        this.z = this.t.findViewById(R.id.toolbar_divider);
        new ggd(this.z);
        this.aj = (MusicSwipeRefreshLayout) this.t.findViewById(R.id.swipe_to_refresh_layout);
        this.F = (FloatingActionButton) this.t.findViewById(R.id.floating_action_button);
        this.G = (ExtendedFloatingActionButton) this.t.findViewById(R.id.extended_floating_action_button);
        this.J = true;
        this.A = (TabbedView) this.t.findViewById(R.id.tabbed_view);
        if (this.U.i() && (tabbedView = this.A) != null) {
            tabbedView.v();
        }
        TabbedView tabbedView2 = this.A;
        if (tabbedView2 != null) {
            tabbedView2.y(requireContext().getColor(R.color.black_header_color));
        }
        AppBarLayout appBarLayout2 = this.u;
        if (appBarLayout2 != null) {
            appBarLayout2.setBackgroundColor(requireContext().getColor(R.color.music_full_transparent));
        }
        Toolbar toolbar3 = this.y;
        if (toolbar3 != null) {
            toolbar3.setBackgroundColor(requireContext().getColor(R.color.black_header_color));
        }
        new ScrollToTopLinearLayoutManager(requireContext());
        this.ak = this.ac.v(this.t);
        return this.t;
    }

    @Override // defpackage.cc
    public void onDestroy() {
        super.onDestroy();
        hej hejVar = this.H;
        if (hejVar != null) {
            hejVar.k(hei.e);
        }
    }

    @Override // defpackage.cc
    public void onDestroyView() {
        jhs jhsVar;
        View view;
        hej hejVar = this.H;
        int i = 0;
        if (hejVar != null && hejVar.g == hei.c) {
            jhs jhsVar2 = this.B;
            if (jhsVar2 != null) {
                this.V = jhsVar2.n();
            }
            this.I = 0;
            Optional optionalG = G();
            gfi gfiVar = new gfi(this, 7);
            if (true == optionalG.isPresent()) {
                ((gms) gfiVar.a).I = ((AppBarLayout.BaseBehavior) optionalG.get()).getTopAndBottomOffset();
            }
        }
        this.ai.b();
        this.al = false;
        I();
        this.L = Optional.empty();
        adma admaVar = this.C;
        if (admaVar != null) {
            jce jceVar = this.ak;
            if (jceVar != null) {
                admaVar.b(jceVar.a);
            }
            this.C = null;
        }
        this.ak = null;
        if (this.B != null) {
            while (true) {
                int i2 = ((agpi) this.B.e()).d;
                jhsVar = this.B;
                if (i >= i2) {
                    break;
                }
                jav javVar = (jav) jhsVar.d(i);
                if (javVar != null && (view = javVar.l) != null) {
                    ((RecyclerView) view).A();
                }
                i++;
            }
            jhsVar.i();
            this.B = null;
        }
        this.A = null;
        Toolbar toolbar = this.y;
        if (toolbar != null) {
            gzj.N(toolbar);
        }
        this.z = null;
        this.y = null;
        t();
        this.v = null;
        this.u = null;
        this.X = null;
        this.t = null;
        this.ah = null;
        this.ag = null;
        this.F = null;
        this.G = null;
        this.aj = null;
        this.x = null;
        super.onDestroyView();
    }

    @Override // defpackage.cc
    public void onResume() {
        super.onResume();
        v(((Boolean) this.n.ao(Boolean.FALSE)).booleanValue());
        y();
        this.i.a(requireContext().getColor(R.color.music_full_transparent));
    }

    @Override // defpackage.cc
    /* JADX INFO: renamed from: onSaveInstanceState */
    public void m668x22bc4f96(Bundle bundle) {
        bundle.putParcelable("entity_model", this.H);
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, xir] */
    @Override // defpackage.cc
    public final void onStop() {
        super.onStop();
        if (this.R.l(14, 45680269L, false)) {
            hej hejVar = this.H;
            if (hejVar instanceof heh) {
                Optional optional = ((heh) hejVar).c.b;
                if (true == optional.isPresent()) {
                    optional.get().f(tau.ACTION_ABANDONED);
                }
            }
        }
    }

    @Override // defpackage.cc
    public void onViewCreated(View view, Bundle bundle) {
        TabbedView tabbedView = this.A;
        if (tabbedView != null) {
            this.B = new jhs(tabbedView, null, null, this.g);
        }
        k(this.H);
        int i = 1;
        this.ai.e(this.ab.M().i(new abwr(i)).al(new gks(this, 4), new glg(3)), this.n.i(new abwr(i)).al(new gks(this, 5), new glg(3)), this.Z.y().p().L(this.b).al(new gks(this, 6), new glg(3)));
    }

    public final void p(Object obj) {
        q(obj, agpn.b);
    }

    protected void q(Object obj, Map map) {
        jce jceVar;
        this.D = obj;
        adma admaVar = this.C;
        if (admaVar != null && (jceVar = this.ak) != null) {
            admaVar.b(jceVar.a);
        }
        if (obj == null) {
            requireContext();
            return;
        }
        jce jceVar2 = this.ak;
        if (jceVar2 != null) {
            this.C = adul.e(jceVar2.a, obj, null);
        }
        if (this.C != null) {
            if (K(obj) && D()) {
                H();
            }
            adly adlyVar = new adly();
            adlyVar.a(this.g);
            agqr it = ((agpl) ((agpn) map).keySet()).iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                adlyVar.f(str, map.get(str));
            }
            if (this.S.c(35, 45657030L, 0L) > 0) {
                adlyVar.f("RenderNextPresenter.ELEMENTS_SERVICES_KEY", new cbq(this, 11));
                opf opfVarA = oph.a();
                opfVarA.c = new cbq(this, 12);
                adlyVar.f("RenderNextPresenter.LOCAL_ELEMENTS_SERVICES_KEY", opfVarA.a());
            }
            adlyVar.f("pagePadding", Integer.valueOf(jnj.x(requireContext())));
            this.C.hU(adlyVar, obj);
            v(((Boolean) this.n.ao(Boolean.FALSE)).booleanValue());
            y();
        }
    }

    @Override // defpackage.gqj
    public final void r() {
        hF(this.H);
    }

    protected final void s(List list) {
        if (this.o == null || list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            apji apjiVar = (apji) it.next();
            aihl aihlVarCheckIsLite = aihn.checkIsLite(akul.a);
            apjiVar.c(aihlVarCheckIsLite);
            if (apjiVar.j.n(aihlVarCheckIsLite.d)) {
                vor vorVar = (vor) this.o.io();
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(akul.a);
                apjiVar.c(aihlVarCheckIsLite2);
                Object objK = apjiVar.j.k(aihlVarCheckIsLite2.d);
                vorVar.w((akuj) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK)));
            }
        }
    }

    public final void t() {
        CollapsingToolbarLayout collapsingToolbarLayout;
        if (this.w == null || (collapsingToolbarLayout = this.v) == null) {
            return;
        }
        collapsingToolbarLayout.getViewTreeObserver().removeOnGlobalLayoutListener(this.w);
        this.w = null;
    }

    public final void u(hej hejVar) {
        if (this.H != hejVar) {
            this.K = true;
        }
        this.H = hejVar;
    }

    public final void v(boolean z) {
        boolean z2 = this.al;
        this.al = z;
        if (z2 != z) {
            y();
        }
    }

    public final void w(boolean z) {
        LoadingFrameLayout loadingFrameLayout;
        ViewGroup.LayoutParams layoutParams;
        isi isiVar = this.X;
        if (isiVar == null || (layoutParams = (loadingFrameLayout = (LoadingFrameLayout) isiVar.c).getLayoutParams()) == null) {
            return;
        }
        if (z) {
            cf activity = getActivity();
            if (activity != null) {
                layoutParams.width = (int) ((1.0f - tuk.a(getResources(), true != this.Q.l(SemanticState.Hidden, 45820150L, false) ? R.dimen.detail_page_split_screen_header_width_ratio : R.dimen.two_pane_width_ratio)) * dxa.a().a(activity).a().width());
            }
        } else {
            layoutParams.width = -1;
        }
        loadingFrameLayout.setLayoutParams(layoutParams);
    }

    public final void x(hww hwwVar) {
        FloatingActionButton floatingActionButton = this.F;
        if (floatingActionButton != null) {
            J(floatingActionButton, hwwVar);
        }
        ExtendedFloatingActionButton extendedFloatingActionButton = this.G;
        if (extendedFloatingActionButton != null) {
            J(extendedFloatingActionButton, hwwVar);
        }
    }

    public final void y() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int iK = this.al ? 0 : this.ab.K();
        Toolbar toolbar = this.y;
        if (toolbar != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) toolbar.getLayoutParams()) != null) {
            marginLayoutParams.topMargin = iK;
            this.y.requestLayout();
        }
        adma admaVar = this.C;
        if (admaVar instanceof jiw) {
            ((jiw) admaVar).i(iK);
        }
    }

    @Override // defpackage.hku
    public final boolean z() {
        return !A();
    }
}
