package defpackage;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.apps.youtube.music.R;
import com.google.android.apps.youtube.music.browse.BrowseUnlimitedFragmentScrollingViewBehavior;
import com.google.android.apps.youtube.music.ui.components.loading.LoadingFrameLayout;
import com.google.android.apps.youtube.music.ui.refresh.MusicSwipeRefreshLayout;
import com.google.android.apps.youtube.music.ui.tabs.TabbedView;
import j$.util.Optional;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class gnr extends gof implements jhu, xgm {
    public wom U;
    public izf V;
    public tbt W;
    public jaz X;
    public jax Y;
    public hhb Z;
    private advd aa;
    private ImageView ab;
    private BrowseUnlimitedFragmentScrollingViewBehavior ac;

    @Override // defpackage.gnf
    public final void G() {
        fx fxVar;
        super.G();
        if (!this.s.l || (fxVar = (fx) getActivity()) == null) {
            return;
        }
        fxVar.setSupportActionBar(this.B);
        fl supportActionBar = fxVar.getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.j(false);
            supportActionBar.h(false);
            supportActionBar.l(R.drawable.action_bar_logo_ringo2);
        }
    }

    @Override // defpackage.jhu
    public final void a(int i, boolean z) {
        TabbedView tabbedView = this.C;
        if (tabbedView != null) {
            aftj aftjVarD = tabbedView.D(i);
            ajwo ajwoVar = null;
            if (aftjVarD != null) {
                aqjj aqjjVar = (aqjj) aftjVarD.b;
                if ((aqjjVar.b & 2) != 0 && (ajwoVar = aqjjVar.d) == null) {
                    ajwoVar = ajwo.a;
                }
            }
            if (ajwoVar != null) {
                aihl aihlVarCheckIsLite = aihn.checkIsLite(ajmj.a);
                ajwoVar.c(aihlVarCheckIsLite);
                Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
                if ((((ajmf) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK))).b & 1) != 0) {
                    this.s.j(ajwoVar);
                }
            }
        }
    }

    @Override // defpackage.gnf
    public final String f() {
        return "music_android_manage_unlimited";
    }

    @tcc
    void handleBrowseUnlimitedFragmentActionEvent(gng gngVar) {
        if (!kro.M(this)) {
            throw null;
        }
    }

    @tcc
    public void handleRefreshRedLandingPageEvent(swi swiVar) {
        R(true, 1);
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
    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        super.onCreateOptionsMenu(menu, menuInflater);
        if (this.s.l) {
            return;
        }
        menu.removeItem(R.id.action_search);
        menu.removeItem(R.id.action_avatar);
    }

    @Override // defpackage.cc
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.browse_unlimited_fragment, viewGroup, false);
        this.B = (Toolbar) viewInflate.findViewById(R.id.toolbar);
        this.v = new ggd(viewInflate.findViewById(R.id.toolbar_divider));
        this.ab = (ImageView) this.B.findViewById(R.id.centered_icon);
        LoadingFrameLayout loadingFrameLayout = (LoadingFrameLayout) viewInflate.findViewById(R.id.browse_content);
        loadingFrameLayout.getClass();
        asv asvVar = (asv) loadingFrameLayout.getLayoutParams();
        ahno.P(asvVar.a instanceof BrowseUnlimitedFragmentScrollingViewBehavior, "behavior type should be BrowseUnlimitedFragmentScrollingViewBehavior");
        this.ac = (BrowseUnlimitedFragmentScrollingViewBehavior) asvVar.a;
        j(loadingFrameLayout);
        this.P = this.O.s(loadingFrameLayout);
        this.C = (TabbedView) loadingFrameLayout.findViewById(R.id.tabbed_view);
        this.C.t(this.V);
        this.C.k(this);
        this.u = new jhs(this.C, null, null, this.e);
        this.aa = this.X.a(this.U, this.e);
        return viewInflate;
    }

    @Override // defpackage.gnf, defpackage.cc
    public final void onDestroyView() {
        this.ac = null;
        this.ab = null;
        super.onDestroyView();
    }

    @Override // defpackage.gnf, defpackage.cc
    public final void onPause() {
        super.onPause();
        this.W.l(this);
    }

    @Override // defpackage.gnf, defpackage.cc
    public final void onResume() {
        super.onResume();
        this.W.f(this);
    }

    @Override // defpackage.gnf, defpackage.cc
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        G();
        if (this.s.l(1) || this.s.g == hei.e) {
            R(false, 1);
        }
        o(this.s);
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

    /* JADX WARN: Type inference failed for: r11v10, types: [java.lang.Object, xir] */
    @Override // defpackage.gnf
    protected final void t(heh hehVar) {
        super.t(hehVar);
        wfy wfyVar = (wfy) hehVar.h;
        Optional optional = hehVar.c.b;
        if (getActivity() != null) {
            n();
            this.e.d(new xgj(wfyVar.d()));
            agke<aftj> agkeVarF = wfyVar.f();
            jhs jhsVar = this.u;
            if (jhsVar != null) {
                jhsVar.f();
            }
            for (aftj aftjVar : agkeVarF) {
                wgd wgdVarH = aftjVar.h();
                if (wgdVarH != null) {
                    MusicSwipeRefreshLayout musicSwipeRefreshLayout = new MusicSwipeRefreshLayout(requireActivity());
                    jhh jhhVarL = this.Z.l(musicSwipeRefreshLayout);
                    RecyclerView recyclerView = new RecyclerView(requireActivity());
                    I(recyclerView);
                    jax jaxVar = this.Y;
                    jaf jafVar = new jaf();
                    jafVar.o(recyclerView);
                    jafVar.g(new advn());
                    jafVar.p(this.Q);
                    jafVar.q(this.R);
                    jafVar.j(this.U);
                    advd advdVar = this.aa;
                    advdVar.getClass();
                    jafVar.l(advdVar);
                    jafVar.m(this.j.a);
                    jafVar.e(this.e);
                    jafVar.i(new gnd(this));
                    jafVar.h(jhhVarL);
                    jav javVarA = jaxVar.a(jafVar.a());
                    this.w = Optional.of(javVarA);
                    javVarA.an = this;
                    musicSwipeRefreshLayout.addView(recyclerView);
                    jhhVarL.a = javVarA;
                    javVarA.at(wgdVarH);
                    jhs jhsVar2 = this.u;
                    if (jhsVar2 != null) {
                        jhsVar2.o(aftjVar, null, musicSwipeRefreshLayout, javVarA);
                    }
                }
            }
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
                this.f.postAtFrontOfQueue(new gnc(this, 4));
            }
            almd almdVar = wfyVar.a;
            Iterator it = almdVar.m.iterator();
            while (it.hasNext()) {
                this.c.a((ajwo) it.next());
            }
            Iterator it2 = almdVar.n.iterator();
            while (it2.hasNext()) {
                this.c.a((ajwo) it2.next());
            }
        }
    }

    @Override // defpackage.gnf
    protected final void w(heh hehVar) {
        ImageView imageView;
        Object obj = hehVar.h;
        almd almdVar = obj != null ? ((wfy) obj).a : null;
        Toolbar toolbar = this.B;
        if (toolbar != null) {
            toolbar.v("");
        }
        tuk.l(this.ab, false);
        if (almdVar != null) {
            allx allxVar = almdVar.d;
            if (allxVar == null) {
                allxVar = allx.a;
            }
            if (allxVar.b == 155144651) {
                allx allxVar2 = almdVar.d;
                if (allxVar2 == null) {
                    allxVar2 = allx.a;
                }
                aliw aliwVar = allxVar2.b == 155144651 ? (aliw) allxVar2.c : aliw.a;
                BrowseUnlimitedFragmentScrollingViewBehavior browseUnlimitedFragmentScrollingViewBehavior = this.ac;
                if (browseUnlimitedFragmentScrollingViewBehavior != null) {
                    browseUnlimitedFragmentScrollingViewBehavior.b = true;
                }
                izf izfVar = this.V;
                alja aljaVar = aliwVar.b;
                if (aljaVar == null) {
                    aljaVar = alja.a;
                }
                aliz alizVarA = aliz.a(aljaVar.c);
                if (alizVarA == null) {
                    alizVarA = aliz.UNKNOWN;
                }
                int iA = izfVar.a(alizVarA);
                if (iA == 0 || (imageView = this.ab) == null) {
                    return;
                }
                imageView.setImageResource(iA);
                tuk.l(this.ab, true);
                return;
            }
        }
        BrowseUnlimitedFragmentScrollingViewBehavior browseUnlimitedFragmentScrollingViewBehavior2 = this.ac;
        if (browseUnlimitedFragmentScrollingViewBehavior2 != null) {
            browseUnlimitedFragmentScrollingViewBehavior2.b = false;
        }
        if (hehVar.l || this.B == null) {
            return;
        }
        this.B.v(ahno.Z(h()));
    }
}
