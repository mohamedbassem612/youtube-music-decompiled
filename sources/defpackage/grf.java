package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.android.apps.youtube.music.ui.components.loading.LoadingFrameLayout;
import com.google.android.apps.youtube.music.ui.refresh.MusicSwipeRefreshLayout;
import com.google.android.apps.youtube.music.ui.tabs.TabbedView;
import com.google.android.libraries.blocks.Container;
import com.google.android.libraries.blocks.runtime.InstanceProxy;
import com.google.android.libraries.youtube.rendering.ui.ScrollToTopLinearLayoutManager;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import j$.time.Instant;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.BiConsumer$CC;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BiConsumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class grf extends goo implements xgm, hkw, hkx {
    private static final agrf aM = agrf.h("com/google/android/apps/youtube/music/browse/TopLevelBrowseFragment");
    private static final agkz aN = new agqj("FEmusic_home");
    public gqh U;
    public izf V;
    public tbt W;
    public ivu X;
    public jaz Y;
    public ttm Z;
    public aeaw aA;
    public int aB;
    public vxz aF;
    public vxz aG;
    public twp aI;
    public ijt aJ;
    public hfn aK;
    public hhb aL;
    private Instant aO;
    private Instant aP;
    private ViewGroup aQ;
    private ViewGroup aR;
    private ImageView aS;
    private ViewGroup aT;
    private View aU;
    private advd aV;
    private boolean aW;
    private View aX;
    private adkc aY;
    private avmn aZ;
    public adhv aa;
    public iwd ab;
    public ahbw ac;
    public gnp ad;
    public hvo ae;
    public hkq af;
    public aefv ag;
    public Executor ah;
    public aunn ai;
    public awmd aj;
    public jax ak;
    public adgj al;
    public aunn am;
    public ViewGroup an;
    SwipeRefreshLayout ap;
    public jhh aq;
    public ixi ar;
    public jbw as;
    public xgj at;
    public Object au;
    public boolean av;
    public avmn aw;
    public boolean ax;
    public acjx ay;
    public aeax az;
    private ViewOutlineProvider ba;
    private anyi bb;
    private akrn bc;
    private heh bd;
    private agcj be;
    final List ao = new ArrayList();
    final ivz aC = new ivz(new BiConsumer() { // from class: gqv
        @Override // java.util.function.BiConsumer
        public final void accept(Object obj, Object obj2) {
            int height;
            ViewGroup viewGroup;
            Toolbar toolbar;
            grf grfVar = this.a;
            Integer num = (Integer) obj;
            Integer num2 = (Integer) obj2;
            if (grfVar.getView() != null) {
                grfVar.aa(num2.intValue());
                boolean zAg = grfVar.ag();
                if (!zAg || (toolbar = grfVar.B) == null || grfVar.an == null) {
                    Toolbar toolbar2 = grfVar.B;
                    height = toolbar2 != null ? toolbar2.getHeight() : 0;
                } else {
                    height = toolbar.getHeight() + grfVar.an.getHeight();
                }
                if (height <= 0 || grfVar.B == null) {
                    return;
                }
                float fMin = 1.0f - Math.min((-num.intValue()) / height, 1.0f);
                grfVar.B.setAlpha(fMin);
                if (!zAg || (viewGroup = grfVar.an) == null) {
                    return;
                }
                viewGroup.setAlpha(fMin);
            }
        }

        public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
            return BiConsumer$CC.$default$andThen(this, biConsumer);
        }
    });
    final qa aH = new gqz(this);
    public final qr aD = new gra(this);
    final jau aE = new jau() { // from class: gqx
        /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, wek] */
        @Override // defpackage.jau
        public final void a(Object obj, adma admaVar, ixi ixiVar, ijt ijtVar) {
            final grf grfVar = this.a;
            grfVar.au = obj;
            grfVar.ae();
            final int i = 1;
            if (!(admaVar instanceof jbw)) {
                if (ijtVar != null) {
                    grfVar.aJ = ijtVar;
                    Object obj2 = grfVar.aw;
                    if (obj2 != null) {
                        avnr.b((AtomicReference) obj2);
                    }
                    ?? r2 = ijtVar.a;
                    int i2 = wfs.a;
                    int i3 = 15;
                    grfVar.aw = r2.j(wfs.f(624, aigj.x("vibes_entry_point_button_state_entity_key")), true).B(new hhw(new hhn(i3), 13)).K(new ibj(new hhn(16), 9)).K(new ibj(new hhn(17), 10)).O(grfVar.m).af(new gks(grfVar, i3));
                    return;
                }
                return;
            }
            grfVar.ar = ixiVar;
            grfVar.as = (jbw) admaVar;
            ixi ixiVar2 = grfVar.ar;
            final int i4 = 0;
            if (ixiVar2 != null) {
                final qr qrVar = grfVar.aD;
                qrVar.getClass();
                ixiVar2.d(new ixg() { // from class: gqu
                    @Override // defpackage.ixg
                    public final void a(boolean z) {
                        int i5 = i;
                        Object obj3 = qrVar;
                        if (i5 != 0) {
                            ((qr) obj3).g(z);
                        } else {
                            ((grf) obj3).X();
                        }
                    }
                });
                if (grfVar.ag()) {
                    grfVar.ar.d(new ixg() { // from class: gqu
                        @Override // defpackage.ixg
                        public final void a(boolean z) {
                            int i5 = i4;
                            Object obj3 = grfVar;
                            if (i5 != 0) {
                                ((qr) obj3).g(z);
                            } else {
                                ((grf) obj3).X();
                            }
                        }
                    });
                }
            }
            if (grfVar.av) {
                jbw jbwVar = grfVar.as;
                if (jbwVar != null) {
                    jbwVar.b.post(new ixe(jbwVar, 4));
                }
                grfVar.av = false;
            }
        }
    };

    private final void ah(boolean z) {
        if (af()) {
            ad(false);
        }
        this.y = null;
        if (z) {
            heh hehVar = this.bd;
            if (hehVar != null) {
                this.s = hehVar;
            }
            R(false, 8);
        }
    }

    private final void ai(heh hehVar) {
        almd almdVar;
        this.aW = true;
        jhh jhhVar = this.aq;
        if (jhhVar != null) {
            jhhVar.b(1);
        }
        Object obj = hehVar.h;
        if (obj != null && !((wfy) obj).g()) {
            tuk.n(getContext(), R.string.music_error_generic, 1);
            return;
        }
        Throwable th = hehVar.n;
        boolean z = th != null && ixt.c(th);
        if (TextUtils.equals(hehVar.b(), "FEmusic_home") && z && this.K.l(53, 45785910L, false)) {
            taf.i(((gmj) this.am.io()).a(), this.ah, new gou(this, hehVar, 3), new gov(this, hehVar, 2), null);
            return;
        }
        isi isiVar = this.P;
        if (isiVar != null) {
            isiVar.n(hehVar.f, hehVar.n);
        }
        Object obj2 = hehVar.h;
        if (obj2 == null || (almdVar = ((wfy) obj2).a) == null) {
            return;
        }
        ak(almdVar);
    }

    private final void aj(RecyclerView recyclerView, boolean z) {
        if (recyclerView.q) {
            recyclerView.post(new hff(this, recyclerView, z, 1, null));
            return;
        }
        try {
            Z(recyclerView, z);
        } catch (IndexOutOfBoundsException e) {
            ((agrc) ((agrc) ((agrc) aM.b()).j(e)).k("com/google/android/apps/youtube/music/browse/TopLevelBrowseFragment", "removeAndMaybeDisposeRevealOnRecyclerViewPullListener", (char) 1116, "TopLevelBrowseFragment.java")).t("Failed to remove reveal on recycler view pull listener");
        }
    }

    private final void ak(almd almdVar) {
        Iterator it = almdVar.n.iterator();
        while (it.hasNext()) {
            this.c.a((ajwo) it.next());
        }
    }

    private final void al(boolean z) {
        Iterator it = this.ao.iterator();
        while (it.hasNext()) {
            np npVar = ((RecyclerView) it.next()).n;
            if (npVar instanceof ScrollToTopLinearLayoutManager) {
                ((ScrollToTopLinearLayoutManager) npVar).b = z;
            }
        }
    }

    private final void am(List list) {
        jhs jhsVar;
        cf activity;
        jav javVar;
        adwq adwqVarI;
        jhs jhsVar2 = this.u;
        if (jhsVar2 != null) {
            jhsVar2.f();
        }
        List list2 = this.ao;
        list2.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            aftj aftjVar = (aftj) it.next();
            wgd wgdVarH = aftjVar.h();
            if (wgdVarH != null && wgdVarH.b() != null && !wgdVarH.b().isEmpty() && (activity = getActivity()) != null) {
                MusicSwipeRefreshLayout musicSwipeRefreshLayout = new MusicSwipeRefreshLayout(activity);
                this.ap = musicSwipeRefreshLayout;
                musicSwipeRefreshLayout.setTag("swipe-to-refresh");
                this.aq = this.aL.l(this.ap);
                RecyclerView recyclerView = (RecyclerView) RecyclerView.inflate(activity, R.layout.section_list, null);
                I(recyclerView);
                list2.add(recyclerView);
                recyclerView.w(new gre());
                yvh yvhVar = this.N;
                adxd adxdVar = yvhVar != null ? (adxd) ((agkj) yvhVar.c).get(aftjVar) : null;
                if (this.H.m(174, 45656291L)) {
                    apoq apoqVar = wgdVarH.a;
                    if ((apoqVar.c & 2) != 0) {
                        apoo apooVar = apoqVar.h;
                        if (apooVar == null) {
                            apooVar = apoo.a;
                        }
                        if (apooVar.b == 90823135) {
                            apoo apooVar2 = apoqVar.h;
                            if (apooVar2 == null) {
                                apooVar2 = apoo.a;
                            }
                            this.at = new xgj((apooVar2.b == 90823135 ? (ajta) apooVar2.c : ajta.a).d, (amud) null);
                        }
                    }
                }
                jax jaxVar = this.ak;
                jaf jafVar = new jaf();
                jafVar.n(adxdVar);
                jafVar.o(recyclerView);
                jafVar.p(this.Q);
                jafVar.q(this.R);
                int i = 1;
                jafVar.g(new iyc(new hpc(this, i)));
                jafVar.j(this.U);
                jafVar.l(this.aV);
                jafVar.m(this.j.a);
                jafVar.e(this.e);
                jafVar.b(new adtq() { // from class: gqw
                    @Override // defpackage.adtq
                    public final void a(acjx acjxVar, ajwo ajwoVar) {
                        xgj xgjVar;
                        grf grfVar = this.a;
                        grfVar.ay = acjxVar;
                        if (acjxVar.a() == acjw.d) {
                            grfVar.y = gql.a(acjxVar, ajwoVar);
                            grfVar.e.b(xhb.a(grfVar.c()), ajwoVar, null);
                            if (!grfVar.H.m(174, 45656291L) || (xgjVar = grfVar.at) == null) {
                                return;
                            }
                            grfVar.e.d(xgjVar);
                        }
                    }
                });
                jafVar.i(new gnd(this));
                jafVar.d(this.an);
                jafVar.k(this.aE);
                jafVar.h(this.aq);
                jav javVarA = jaxVar.a(jafVar.a());
                javVarA.L(new jao(this, i));
                if (this.aF.c(35, 45657030L, 0L) > 0) {
                    opf opfVarA = oph.a();
                    opfVarA.c = new cbq(this, 13);
                    opfVarA.a = aecm.y(recyclerView);
                    javVar = javVarA;
                    if (this.K.l(53, 45785910L, false) && (adwqVarI = javVar.I()) != null) {
                        agfr agfrVar = adwqVarI.b;
                        if (agfrVar != null) {
                            opfVarA.d(agfrVar);
                        } else {
                            maw mawVar = adwqVarI.a;
                            if (mawVar != null) {
                                opfVarA.d(new agfu(mawVar));
                            }
                        }
                    }
                    javVar.L(this.al.a(opfVarA.a()));
                } else {
                    javVar = javVarA;
                }
                this.w = Optional.of(javVar);
                javVar.ao = this;
                javVar.an = this;
                if (TextUtils.equals(this.s.b(), "FEmusic_trending")) {
                    admu admuVar = new admu();
                    admuVar.add(new ixn(2, 3, false));
                    adkz adkzVar = javVar.M;
                    if (adkzVar != admuVar) {
                        if (adkzVar != null) {
                            javVar.j.q(adkzVar);
                        }
                        javVar.M = admuVar;
                        if (javVar.Q) {
                            javVar.j.m(0, admuVar, true);
                        }
                    }
                }
                admu admuVar2 = new admu();
                if (TextUtils.equals(this.s.b(), "FEmusic_home")) {
                    admuVar2.add(new ixn(6, 2, false));
                } else {
                    admuVar2.add(new ixn(5, 2, false));
                }
                adkz adkzVar2 = javVar.N;
                if (adkzVar2 != admuVar2) {
                    if (adkzVar2 != null) {
                        javVar.j.q(adkzVar2);
                    }
                    javVar.N = admuVar2;
                    javVar.j.m(-1, admuVar2, true);
                }
                this.ap.addView(recyclerView);
                this.aq.a = javVar;
                if (adxdVar == null) {
                    javVar.at(wgdVarH);
                } else if (recyclerView.n != null) {
                    yvh yvhVar2 = this.N;
                    Parcelable parcelable = yvhVar2 != null ? (Parcelable) ((agkj) yvhVar2.b).get(aftjVar) : null;
                    if (parcelable != null) {
                        recyclerView.n.onRestoreInstanceState(parcelable);
                    }
                }
                jhs jhsVar3 = this.u;
                if (jhsVar3 != null) {
                    jhsVar3.o(aftjVar, null, this.ap, javVar);
                }
                apoq apoqVar2 = wgdVarH.a;
                if ((apoqVar2.c & 2) != 0) {
                    apoo apooVar3 = apoqVar2.h;
                    if (apooVar3 == null) {
                        apooVar3 = apoo.a;
                    }
                    if (apooVar3.b == 153515154) {
                        this.be = (agcj) ((Container) this.ai.io()).a(new afyq(17));
                        if (javVar.I() != null) {
                            maw mawVar2 = javVar.I().a;
                            if (mawVar2 instanceof mav) {
                                ((mav) mawVar2).b(this.be);
                            }
                        }
                    }
                }
            }
        }
        yvh yvhVar3 = this.N;
        if (yvhVar3 == null || (jhsVar = this.u) == null) {
            return;
        }
        jhsVar.m(yvhVar3.a);
    }

    private final void an() {
        Context context;
        if (isHidden() || (context = getContext()) == null) {
            return;
        }
        this.h.a(context.getColor(R.color.full_transparent));
        AppBarLayout appBarLayout = this.A;
        if (appBarLayout != null) {
            appBarLayout.setBackgroundColor(context.getColor(R.color.full_transparent));
        }
        Toolbar toolbar = this.B;
        if (toolbar != null) {
            toolbar.setBackgroundColor(context.getColor(R.color.full_transparent));
        }
        TabbedView tabbedView = this.C;
        if (tabbedView != null) {
            tabbedView.y(context.getColor(R.color.full_transparent));
        }
    }

    private final void ao() {
        jhs jhsVar;
        if (getView() == null || !af() || this.aR == null || this.aS == null || this.aT == null || (jhsVar = this.u) == null || jhsVar.b() < 0) {
            return;
        }
        int iB = this.u.b();
        List list = this.ao;
        if (iB >= list.size() || this.A == null) {
            return;
        }
        ad(false);
        this.A.setOutlineProvider(null);
        an();
        this.A.h(this.aC);
        int iB2 = this.u.b();
        if (iB2 >= 0) {
            ((RecyclerView) list.get(iB2)).aC(this.aH);
        }
        nyc nycVar = this.M;
        if (nycVar != null) {
            this.aR.setY(nycVar.a);
        }
        anyi anyiVar = this.bb;
        if (anyiVar != null && (anyiVar.b & 1) != 0) {
            this.aS.setVisibility(0);
            this.aT.setVisibility(8);
            adhv adhvVar = this.aa;
            ImageView imageView = this.aS;
            aqmh aqmhVar = this.bb.c;
            if (aqmhVar == null) {
                aqmhVar = aqmh.a;
            }
            adhvVar.h(imageView, aqmhVar);
            return;
        }
        if (this.bc != null) {
            this.aS.setVisibility(8);
            this.aT.setVisibility(0);
            acxm acxmVarA = this.o.a(this.bc);
            adly adlyVar = new adly();
            adlyVar.a(this.e);
            adlyVar.f("ElementPresenter#LAYOUT_PARAMS", new ViewGroup.LayoutParams(-1, -1));
            kro.Q(acxmVarA, this.aT, this.j.a, adlyVar);
        }
    }

    private final void ap() {
        aeuj aeujVar;
        ViewGroup viewGroup = this.an;
        if (viewGroup == null || (aeujVar = (aeuj) viewGroup.getLayoutParams()) == null) {
            return;
        }
        if (ag()) {
            aeujVar.a = 5;
        } else {
            aeujVar.a = 0;
            this.an.setAlpha(1.0f);
        }
    }

    private static boolean aq(heh hehVar) {
        gnn gnnVar;
        return (hehVar == null || (gnnVar = hehVar.a) == null || !gnnVar.c) ? false : true;
    }

    private final boolean ar(Instant instant) {
        return instant != null && this.ac.a().isAfter(instant);
    }

    @Override // defpackage.gnf, defpackage.hkw
    public final void C() {
        jhs jhsVar;
        int iB;
        if (kro.M(this) || (jhsVar = this.u) == null || (iB = jhsVar.b()) == -1) {
            return;
        }
        List list = this.ao;
        if (list.isEmpty() || list.get(iB) == null) {
            return;
        }
        ((RecyclerView) list.get(iB)).aj(0);
        k();
    }

    @Override // defpackage.gnf
    public final void G() {
        Toolbar toolbar;
        super.G();
        if (isHidden() || (toolbar = this.B) == null) {
            return;
        }
        fx fxVar = (fx) getActivity();
        if (fxVar != null) {
            fxVar.setSupportActionBar(toolbar);
            fl supportActionBar = fxVar.getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.j(false);
                supportActionBar.h(false);
                supportActionBar.l(R.drawable.action_bar_logo_ringo2);
                if (this.I.l(46, 45824499L, false)) {
                    supportActionBar.p();
                }
            }
        }
        if (af()) {
            an();
        }
    }

    @Override // defpackage.gnf
    protected final boolean L(heh hehVar) {
        return (this.K.l(53, 45785910L, false) && aq(hehVar) && Objects.equals(hehVar.b(), "FEmusic_home")) ? false : true;
    }

    public final void U() {
        if (this.aA != null) {
            List list = this.ao;
            if (!list.isEmpty() && this.A != null) {
                this.aA.o((RecyclerView) list.get(0), this.A);
            }
        }
        W();
    }

    public final void V(boolean z) {
        if (this.aJ == null) {
            ixi ixiVar = this.ar;
            if (ixiVar == null || !ixiVar.j()) {
                return;
            }
            this.ar.c();
            ah(z);
            return;
        }
        agcj agcjVar = this.be;
        if (agcjVar != null) {
            Optional.empty();
            agci agciVar = new agci(Optional.of(Boolean.TRUE));
            aihf aihfVarCreateBuilder = aifz.a.createBuilder();
            Optional optional = agciVar.a;
            adyu adyuVar = new adyu(aihfVarCreateBuilder, 13);
            optional.isPresent();
            Object obj = adyuVar.a;
            ((Boolean) optional.get()).booleanValue();
            aihf aihfVar = (aihf) obj;
            aihfVar.copyOnWrite();
            ((aifz) aihfVar.instance).b = true;
            InstanceProxy instanceProxyD = agcjVar.d();
            agcl agclVar = instanceProxyD instanceof agck ? ((agck) instanceProxyD).a : null;
            if (agclVar != null) {
                agclVar.a((aifz) aihfVarCreateBuilder.build());
            } else {
                aifz aifzVar = (aifz) aihfVarCreateBuilder.build();
                aigv aigvVar = aigv.a;
            }
        }
        if (this.ax) {
            ah(z);
        }
    }

    public final void W() {
        aeax aeaxVar = this.az;
        if (aeaxVar == null || aeaxVar.b) {
            return;
        }
        jhh jhhVar = this.aq;
        if (jhhVar != null) {
            jhhVar.b(1);
        }
        this.az.b = true;
        List list = this.ao;
        if (list.isEmpty()) {
            return;
        }
        aj((RecyclerView) list.get(0), false);
    }

    public final void X() {
        twp twpVar = this.aI;
        if (twpVar != null) {
            ((ValueAnimator) twpVar.b).cancel();
            tym.h((View) twpVar.c, new tyl(twpVar.a, 1), ViewGroup.LayoutParams.class);
            this.aI = null;
        }
    }

    @Override // defpackage.hkx
    public final void Y() {
        V(true);
    }

    public final void Z(RecyclerView recyclerView, boolean z) {
        aeax aeaxVar = this.az;
        if (aeaxVar != null) {
            recyclerView.Z(aeaxVar);
        }
        if (z) {
            this.az = null;
            this.ao.clear();
        }
    }

    public final void aa(int i) {
        ViewGroup viewGroup;
        int height;
        int iK;
        if (getView() == null || (viewGroup = this.aR) == null) {
            return;
        }
        viewGroup.setY(Math.min(viewGroup.getY() - i, 0.0f));
        this.aR.invalidate();
        if (this.B == null || this.an == null || this.aU == null) {
            return;
        }
        boolean zAg = ag();
        Toolbar toolbar = this.B;
        if (zAg) {
            height = toolbar.getHeight() + this.an.getHeight();
            iK = this.aK.K();
        } else {
            height = toolbar.getHeight();
            iK = this.aK.K();
        }
        int i2 = height + iK;
        if (i2 > 0) {
            this.aU.setAlpha(Math.min((-this.aR.getY()) / i2, 1.0f));
        }
    }

    /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.Object, xir] */
    public final void ab(Optional optional) {
        isi isiVar;
        ViewGroup viewGroup;
        if (getView() == null || (isiVar = this.P) == null) {
            return;
        }
        isiVar.m();
        if (!this.ag.l() && this.H.c(10, 45677218L, 0L) > 0 && (viewGroup = this.an) != null) {
            viewGroup.getViewTreeObserver().addOnGlobalLayoutListener(new jg(this, 7));
        }
        if (this.I.l(14, 45680269L, false) && !aq(this.s) && true == optional.isPresent()) {
            optional.get().f(tau.BROWSE_PAGE_LOADED);
        }
        boolean zEquals = Objects.equals(this.s.b(), "FEmusic_home");
        vxz vxzVar = this.I;
        if (!zEquals) {
            if (!vxzVar.l(17, 45680971L, false)) {
                this.f.postAtFrontOfQueue(new gnc(this, 13));
            }
            this.q.kk(gnk.a);
        } else {
            if (!vxzVar.l(17, 45680971L, false)) {
                this.f.postAtFrontOfQueue(new gky(this, 11));
            }
            this.q.kk(gnk.b);
            this.q.kk(gnk.a);
        }
    }

    public final void ac() {
        adkc adkcVar = this.aY;
        if (adkcVar != null) {
            ((adju) adkcVar.a).a();
            this.aY = null;
        }
    }

    public final void ad(boolean z) {
        int iB;
        if (getView() == null || this.aR == null) {
            return;
        }
        ImageView imageView = this.aS;
        if (imageView != null && imageView.getMeasuredHeight() > 0) {
            this.M = new nyc(z ? this.aR.getY() : this.aC.a);
        }
        AppBarLayout appBarLayout = this.A;
        if (appBarLayout != null) {
            appBarLayout.setOutlineProvider(this.ba);
            this.A.j(this.aC);
        }
        jhs jhsVar = this.u;
        if (jhsVar != null && (iB = jhsVar.b()) >= 0) {
            List list = this.ao;
            if (iB < list.size()) {
                try {
                    ((RecyclerView) list.get(iB)).aE(this.aH);
                } catch (RuntimeException e) {
                    ((agrc) ((agrc) ((agrc) aM.b()).j(e)).k("com/google/android/apps/youtube/music/browse/TopLevelBrowseFragment", "tearDownFullBleedBackground", (char) 859, "TopLevelBrowseFragment.java")).t("Failed to remove background scroll listener");
                }
            }
        }
        ImageView imageView2 = this.aS;
        if (imageView2 != null) {
            this.aa.f(imageView2);
        }
        ViewGroup viewGroup = this.aT;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
    }

    public final void ae() {
        if (this.au == null || getView() == null || this.B == null) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.chip_cloud_top_padding);
        aihf aihfVarCreateBuilder = ailj.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        ailj ailjVar = (ailj) aihfVarCreateBuilder.instance;
        ailjVar.b |= 4;
        ailjVar.e = dimensionPixelSize;
        jle.b((ailj) aihfVarCreateBuilder.build(), this.B);
    }

    public final boolean af() {
        anyi anyiVar = this.bb;
        return ((anyiVar == null || (anyiVar.b & 1) == 0) && this.bc == null) ? false : true;
    }

    public final boolean ag() {
        Context context = getContext();
        if (context != null && !context.getResources().getBoolean(R.bool.is_tablet) && yno.H(context)) {
            return true;
        }
        ixi ixiVar = this.ar;
        return this.H.l(182, 45677217L, false) && !(ixiVar != null && ixiVar.j());
    }

    @Override // defpackage.gnf
    protected final int c() {
        heh hehVar;
        return (this.H.l(274, 45839447L, false) && (hehVar = this.s) != null && TextUtils.equals(hehVar.b(), "FEmusic_home")) ? 3854 : 6827;
    }

    @Override // defpackage.gnf, defpackage.gpx
    public final adtv d() {
        return (adtv) this.w.orElse(null);
    }

    @Override // defpackage.gnf
    public final String f() {
        ajwo ajwoVar;
        heh hehVar = this.s;
        if (hehVar != null && hehVar.g == hei.c && (ajwoVar = hehVar.f) != null) {
            aihl aihlVarCheckIsLite = aihn.checkIsLite(ajmj.a);
            ajwoVar.c(aihlVarCheckIsLite);
            if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(ajmj.a);
                ajwoVar.c(aihlVarCheckIsLite2);
                Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
                return ((ajmf) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK))).c.equals("FEmusic_trending") ? "music_android_trending" : "music_android_home";
            }
        }
        return null;
    }

    @Override // defpackage.gnf, defpackage.xgm
    public final xgn hB() {
        return this.e;
    }

    @Override // defpackage.gnf
    public final Map i() {
        return Collections.singletonMap("sectionListController", this.w.orElse(null));
    }

    @Override // defpackage.gnf
    public final void k() {
        if (J() || getView() == null || this.A == null) {
            return;
        }
        boolean zL = this.I.l(46, 45824499L, false);
        AppBarLayout appBarLayout = this.A;
        if (zL) {
            appBarLayout.post(new gky(this, 12));
        } else {
            appBarLayout.l(true, false, true);
        }
    }

    @Override // defpackage.cc, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        jhs jhsVar = this.u;
        if (jhsVar != null) {
            jhsVar.k(configuration);
        }
        ap();
    }

    @Override // defpackage.gnf, defpackage.cc
    /* JADX INFO: renamed from: onCreate */
    public final void m658lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        super.m658lambda$performCreate$3$androidsupportv4appFragment(bundle);
        this.aO = null;
        this.aP = null;
        this.ae.h();
    }

    @Override // defpackage.gnf, defpackage.cc
    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        ajnf ajnfVar;
        super.onCreateOptionsMenu(menu, menuInflater);
        hkq hkqVar = this.af;
        if (hkqVar.d != null) {
            hkqVar.c(menu);
            for (anis anisVar : hkqVar.d.b) {
                Optional optionalEmpty = Optional.empty();
                int i = anisVar.b;
                if (i == 65153809) {
                    ajnfVar = (ajnf) anisVar.c;
                } else if (i == 322055134) {
                    aqoh aqohVar = (aqoh) anisVar.c;
                    if ((aqohVar.b & 2) != 0) {
                        optionalEmpty = Optional.of(aqohVar.d);
                    }
                    apji apjiVar = aqohVar.c;
                    if (apjiVar == null) {
                        apjiVar = apji.a;
                    }
                    aihl aihlVarCheckIsLite = aihn.checkIsLite(ajnp.a);
                    apjiVar.c(aihlVarCheckIsLite);
                    Object objK = apjiVar.j.k(aihlVarCheckIsLite.d);
                    ajnfVar = (ajnf) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
                }
                hkqVar.a(menu, ajnfVar, optionalEmpty, 0, 0);
            }
        }
    }

    @Override // defpackage.cc
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ImageView imageView;
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.top_level_browse_fragment, viewGroup, false);
        this.aQ = viewGroup2;
        this.B = (Toolbar) viewGroup2.findViewById(R.id.toolbar);
        this.aX = this.aQ.findViewById(R.id.toolbar_divider);
        this.v = new ggd(this.aX);
        this.A = (AppBarLayout) this.aQ.findViewById(R.id.app_bar);
        AppBarLayout appBarLayout = this.A;
        if (appBarLayout != null) {
            this.ba = appBarLayout.getOutlineProvider();
        }
        this.an = (ViewGroup) this.aQ.findViewById(R.id.header_container);
        this.av = !this.H.l(185, 45688380L, false);
        LoadingFrameLayout loadingFrameLayout = (LoadingFrameLayout) this.aQ.findViewById(R.id.browse_content);
        loadingFrameLayout.e(new tbq(this, 1));
        this.P = this.O.s(loadingFrameLayout);
        TabbedView tabbedView = (TabbedView) loadingFrameLayout.findViewById(R.id.tabbed_view);
        this.u = new jhs(tabbedView, null, new jhv() { // from class: gqy
            @Override // defpackage.jhv
            public final void hA() {
                this.a.ac();
            }
        }, this.e);
        ViewGroup viewGroup3 = (ViewGroup) this.aQ.findViewById(R.id.background_image_container);
        this.aR = viewGroup3;
        if (viewGroup3 != null) {
            this.aS = (ImageView) this.aQ.findViewById(R.id.background_image);
            this.aT = (ViewGroup) this.aQ.findViewById(R.id.background_elements);
            this.aU = this.aQ.findViewById(R.id.background_scrim);
            Context context = getContext();
            if (context != null && (imageView = this.aS) != null && imageView.getLayoutParams() != null && this.aR.getLayoutParams() != null && this.aU != null) {
                agrf agrfVar = twm.a;
                int iMin = Math.min(context.getResources().getDisplayMetrics().widthPixels, getResources().getDimensionPixelSize(R.dimen.browse_background_image_max_height));
                ViewGroup.LayoutParams layoutParams = this.aS.getLayoutParams();
                ViewGroup.LayoutParams layoutParams2 = this.aR.getLayoutParams();
                if (layoutParams != null && layoutParams2 != null) {
                    layoutParams.height = iMin;
                    layoutParams2.height = iMin;
                }
                this.aS.requestLayout();
                this.aR.requestLayout();
            }
        }
        AppBarLayout appBarLayout2 = this.A;
        if (appBarLayout2 != null) {
            gzj.J(appBarLayout2);
        }
        j(loadingFrameLayout);
        TabLayout tabLayout = (TabLayout) this.aQ.findViewById(R.id.tabs);
        tabbedView.t(this.V);
        tabbedView.z(tabLayout);
        AppBarLayout appBarLayout3 = this.A;
        if (appBarLayout3 != null) {
            this.ab.a(appBarLayout3);
        }
        this.aZ = this.aK.M().al(new gem(this, 4), new gfh(3));
        this.aV = this.Y.a(this.U, this.e);
        return this.aQ;
    }

    @Override // defpackage.gnf, defpackage.cc
    public final void onDestroyView() {
        AppBarLayout appBarLayout;
        this.ar = null;
        Object obj = this.aw;
        if (obj != null) {
            avnr.b((AtomicReference) obj);
            this.aw = null;
        }
        this.ax = false;
        this.aJ = null;
        this.at = null;
        this.bd = null;
        ad(true);
        this.X.d();
        ac();
        Object obj2 = this.aZ;
        if (obj2 != null) {
            awka.f((AtomicReference) obj2);
        }
        this.ab.b();
        this.aD.f();
        X();
        Toolbar toolbar = this.B;
        if (toolbar != null && toolbar.f() != null) {
            this.af.c(this.B.f());
        }
        List list = this.ao;
        if (!list.isEmpty()) {
            RecyclerView recyclerView = (RecyclerView) list.get(0);
            aeaw aeawVar = this.aA;
            if (aeawVar != null && (appBarLayout = this.A) != null) {
                aeawVar.o(recyclerView, appBarLayout);
                this.aA = null;
            }
            aj(recyclerView, true);
        }
        this.aq = null;
        this.ap = null;
        this.aX = null;
        this.aU = null;
        this.aS = null;
        if (this.aG.k(45861099L, false)) {
            this.aT = null;
            this.as = null;
        }
        this.aR = null;
        this.an = null;
        this.aQ = null;
        super.onDestroyView();
    }

    @Override // defpackage.gnf, defpackage.cc
    public final void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (z) {
            this.X.d();
            this.aD.g(false);
            return;
        }
        k();
        if (af()) {
            an();
        }
        ixi ixiVar = this.ar;
        if (ixiVar != null) {
            this.aD.g(ixiVar.j());
        } else if (this.aJ != null) {
            this.aD.g(this.ax);
        }
    }

    @Override // defpackage.gnf, defpackage.cc
    public final void onResume() {
        super.onResume();
        k();
        heh hehVar = this.s;
        if (hehVar != null && hehVar.e()) {
            if (ar(this.aO) || this.aW) {
                V(false);
                this.y = null;
                R(false, 8);
            } else if (this.H.m(0, 45359386L) && ar(this.aP)) {
                R(false, 8);
            }
        }
        if (getView() == null || !af()) {
            return;
        }
        an();
    }

    @Override // defpackage.gnf, defpackage.cc
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        G();
        ap();
        if (this.s.l(1) || this.s.g == hei.e) {
            R(false, 1);
        }
        o(this.s);
        requireActivity().getOnBackPressedDispatcher().c(getViewLifecycleOwner(), this.aD);
    }

    @Override // defpackage.gnf, defpackage.adtm
    public final void p(toe toeVar, acjx acjxVar) {
        ((agrc) ((agrc) ((agrc) aM.b()).j(toeVar)).k("com/google/android/apps/youtube/music/browse/TopLevelBrowseFragment", "onContinuationError", (char) 1640, "TopLevelBrowseFragment.java")).w("Continuation error: %s", this.Z.b(toeVar));
    }

    @Override // defpackage.gnf, defpackage.adtp
    public final void q(acjy acjyVar, acjw acjwVar) {
        super.q(acjyVar, acjwVar);
        if (acjyVar instanceof wfy) {
            wfy wfyVar = (wfy) acjyVar;
            acjx acjxVar = this.ay;
            if (acjxVar != null && acjxVar.a() == acjw.d) {
                gql gqlVar = this.y;
                if (gqlVar != null && gqlVar.a.isPresent()) {
                    Object obj = this.y.a.get();
                    aihl aihlVarCheckIsLite = aihn.checkIsLite(ajmu.b);
                    aihi aihiVar = (aihi) obj;
                    aihiVar.c(aihlVarCheckIsLite);
                    if (aihiVar.j.n(aihlVarCheckIsLite.d)) {
                        this.aP = this.ac.a().plusMillis(wfyVar.e());
                    }
                }
                almd almdVar = wfyVar.a;
                apji apjiVar = almdVar.s;
                if (apjiVar == null) {
                    apjiVar = apji.a;
                }
                this.bb = (anyi) kro.H(apjiVar, anyj.a).orElse(null);
                apji apjiVar2 = almdVar.s;
                if (apjiVar2 == null) {
                    apjiVar2 = apji.a;
                }
                this.bc = (akrn) kro.H(apjiVar2, akrs.a).orElse(null);
                ao();
            }
            List listAo = fhz.ao(wfyVar);
            y(listAo);
            this.z.addAll(listAo);
            if (this.H.l(182, 45677217L, false)) {
                ap();
                ixi ixiVar = this.ar;
                if (ixiVar == null || ixiVar.j()) {
                    return;
                }
                k();
            }
        }
    }

    @Override // defpackage.gnf
    protected final void r(heh hehVar) {
        super.m(hehVar);
        if (this.K.l(56, 45801917L, false)) {
            hehVar.d = null;
            al(true);
        }
        ai(hehVar);
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
    /* JADX WARN: Type inference failed for: r1v17, types: [adhu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.List] */
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
    @Override // defpackage.gnf
    protected final void t(heh hehVar) {
        super.t(hehVar);
        this.y = null;
        int i = 0;
        if (this.K.l(56, 45801917L, false)) {
            hehVar.d = null;
            al(true);
        }
        yvh yvhVar = this.N;
        if (yvhVar != null) {
            am(yvhVar.d);
            this.N = null;
            ao();
            ab(hehVar.c.b);
            return;
        }
        Object obj = hehVar.h;
        if (obj == null || ((wfy) obj).g()) {
            hehVar.i = null;
            ai(hehVar);
            return;
        }
        n();
        if (!((wfy) hehVar.h).g() && aN.contains(this.s.b())) {
            ac();
            tbt tbtVar = this.W;
            adhv adhvVar = this.aa;
            String strB = this.s.b();
            Objects.checkIndex(0, 2);
            adkc adkcVar = new adkc(tbtVar, adhvVar, (strB == null || !strB.equals("FEmusic_home")) ? 0 : 1, 0);
            ?? r1 = adkcVar.a;
            adju adjuVar = (adju) r1;
            adjuVar.b(new adkk());
            adjuVar.b.clear();
            adjuVar.c.clear();
            adjuVar.d = 0;
            adjuVar.a.e(r1);
            adjuVar.e = true;
            this.aY = adkcVar;
        }
        this.aW = false;
        wfy wfyVar = (wfy) hehVar.h;
        Optional optional = hehVar.c.b;
        if (getActivity() != null) {
            this.e.d(new xgj(wfyVar.d()));
            this.aO = this.ac.a().plusMillis(wfyVar.e());
            this.aP = null;
            if (this.bd == null) {
                this.bd = this.s.a();
            }
            am(wfyVar.f());
            almd almdVar = wfyVar.a;
            apji apjiVar = almdVar.s;
            if (apjiVar == null) {
                apjiVar = apji.a;
            }
            this.bb = (anyi) kro.H(apjiVar, anyj.a).orElse(null);
            apji apjiVar2 = almdVar.s;
            if (apjiVar2 == null) {
                apjiVar2 = apji.a;
            }
            this.bc = (akrn) kro.H(apjiVar2, akrs.a).orElse(null);
            ao();
            if (!this.ad.e(almdVar, this, new grb(this, optional))) {
                ab(optional);
            }
            Iterator it = almdVar.m.iterator();
            while (it.hasNext()) {
                this.c.a((ajwo) it.next());
            }
            ak(almdVar);
            int i2 = almdVar.b;
            if ((i2 & SemanticState.Hidden) == 0 && (i2 & SemanticState.Focused) == 0 && almdVar.n.size() == 0) {
                hvo hvoVar = this.ae;
                if (!a.aM()) {
                    kro kroVar = hvoVar.d;
                    return;
                }
                ListenableFuture listenableFutureC = hvoVar.c(hvoVar.b.o());
                Executor executorDirectExecutor = MoreExecutors.directExecutor();
                taa taaVar = new taa(new hvn(hvoVar, i), null, taf.b);
                long j = afwl.a;
                listenableFutureC.addListener(new ahei(listenableFutureC, new afwj(afty.c(false), taaVar, 0)), executorDirectExecutor);
            }
        }
    }

    @Override // defpackage.gnf
    protected final void u(heh hehVar) {
        boolean zD = hehVar.d();
        SwipeRefreshLayout swipeRefreshLayout = this.ap;
        boolean z = swipeRefreshLayout != null && swipeRefreshLayout.b;
        if (!zD && !z) {
            wfy wfyVar = hehVar.d;
            if (!K() || wfyVar == null) {
                isi isiVar = this.P;
                if (isiVar != null) {
                    isiVar.l();
                    this.P.p();
                }
                jhs jhsVar = this.u;
                if (jhsVar != null) {
                    jhsVar.f();
                }
            } else {
                hehVar.h = new wfy(almd.a);
                am(wfyVar.f());
                if (this.K.l(56, 45801917L, false)) {
                    al(false);
                }
                isi isiVar2 = this.P;
                if (isiVar2 != null) {
                    isiVar2.m();
                }
            }
        }
        if (this.bd == null && !K()) {
            this.bd = hehVar.a();
        }
        this.N = null;
    }

    @Override // defpackage.gnf
    protected final void w(heh hehVar) {
        k();
        D(hehVar);
    }
}
