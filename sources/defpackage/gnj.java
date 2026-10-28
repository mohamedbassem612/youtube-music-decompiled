package defpackage;

import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.apps.youtube.music.R;
import com.google.android.apps.youtube.music.ui.components.loading.LoadingFrameLayout;
import com.google.android.apps.youtube.music.ui.refresh.MusicSwipeRefreshLayout;
import com.google.android.apps.youtube.music.ui.tabs.TabbedView;
import com.google.android.material.appbar.AppBarLayout;
import j$.util.Optional;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class gnj extends goe implements adww {
    public wom U;
    public izf V;
    public tbt W;
    public jaz X;
    public jax Y;
    public ahek Z;
    public hhb aa;
    private View ab;
    private LoadingFrameLayout ac;
    private advd ad;

    private final void V() {
        LoadingFrameLayout loadingFrameLayout = this.ac;
        if (loadingFrameLayout == null) {
            return;
        }
        int childCount = loadingFrameLayout.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                return;
            }
            View childAt = this.ac.getChildAt(childCount);
            if (childAt instanceof iws) {
                ((iws) childAt).i();
                this.ac.removeView(childAt);
            }
        }
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
    private final void W(List list) {
        cf activity = getActivity();
        jhs jhsVar = this.u;
        if (jhsVar == null || activity == null) {
            return;
        }
        jhsVar.f();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            aftj aftjVar = (aftj) it.next();
            wgd wgdVarH = aftjVar.h();
            if (wgdVarH != null) {
                MusicSwipeRefreshLayout musicSwipeRefreshLayout = new MusicSwipeRefreshLayout(activity);
                jhh jhhVarL = this.aa.l(musicSwipeRefreshLayout);
                RecyclerView recyclerView = (RecyclerView) RecyclerView.inflate(activity, R.layout.section_list, null);
                recyclerView.setTag(441581429, "disable-recycler-binder");
                yvh yvhVar = this.N;
                adxd adxdVar = yvhVar != null ? (adxd) ((agkj) yvhVar.c).get(aftjVar) : null;
                jax jaxVar = this.Y;
                jaf jafVar = new jaf();
                jafVar.n(adxdVar);
                jafVar.o(recyclerView);
                jafVar.p(this.Q);
                jafVar.q(this.R);
                jafVar.g(new advn());
                jafVar.j(this.U);
                jafVar.l(this.ad);
                jafVar.m(this.j.a);
                jafVar.e(this.e);
                jafVar.i(this);
                jafVar.h(jhhVarL);
                jav javVarA = jaxVar.a(jafVar.a());
                this.w = Optional.of(javVarA);
                javVarA.L(new gob(this, 1));
                musicSwipeRefreshLayout.addView(recyclerView);
                jhhVarL.a = javVarA;
                if (adxdVar == null) {
                    javVarA.at(wgdVarH);
                } else if (recyclerView.n != null) {
                    yvh yvhVar2 = this.N;
                    Parcelable parcelable = yvhVar2 != null ? (Parcelable) ((agkj) yvhVar2.b).get(aftjVar) : null;
                    if (parcelable != null) {
                        recyclerView.n.onRestoreInstanceState(parcelable);
                    }
                }
                this.u.o(aftjVar, null, musicSwipeRefreshLayout, javVarA);
                javVarA.R();
                LoadingFrameLayout loadingFrameLayout = this.ac;
                if (loadingFrameLayout != null && !kro.M(this)) {
                    V();
                    cf activity2 = getActivity();
                    if (activity2 != null) {
                        iws iwsVar = new iws(activity2, recyclerView, this.Z, this.j.a, this.e, new bym(8));
                        iwsVar.setBackgroundColor(activity2.getColor(R.color.theme_main_window_background));
                        loadingFrameLayout.addView(iwsVar, new FrameLayout.LayoutParams(-1, -2));
                    }
                }
            }
        }
        yvh yvhVar3 = this.N;
        if (yvhVar3 != null) {
            this.u.m(yvhVar3.a);
        }
    }

    @Override // defpackage.gnf
    public final String f() {
        return "music_android_history";
    }

    @Override // defpackage.adww
    public final void hP() {
        this.f.post(new gnc(this, 3));
    }

    @Override // defpackage.adww
    public final boolean jf() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v11, types: [java.lang.Object, xir] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.gnf
    public final void o(heh hehVar) {
        isi isiVar;
        if (J() || kro.M(this)) {
            return;
        }
        super.o(hehVar);
        String strH = h();
        Toolbar toolbar = this.B;
        if (toolbar != null && strH != null) {
            toolbar.v(strH);
        }
        View view = this.ab;
        if (view != null && strH != null) {
            Q(view, strH);
        }
        if (this.ac != null) {
            int iOrdinal = hehVar.g.ordinal();
            if (iOrdinal == 0) {
                this.ac.h(1);
                this.ac.h(2);
                jhs jhsVar = this.u;
                if (jhsVar != null) {
                    jhsVar.f();
                }
                this.N = null;
                return;
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3 || (isiVar = this.P) == null) {
                    return;
                }
                isiVar.n(hehVar.f, hehVar.n);
                return;
            }
            yvh yvhVar = this.N;
            if (yvhVar != null) {
                W(yvhVar.d);
                this.N = null;
                this.ac.h(3);
                return;
            }
            wfy wfyVar = (wfy) hehVar.h;
            Optional optional = hehVar.c.b;
            if (getActivity() == null || this.P == null) {
                return;
            }
            n();
            this.e.d(new xgj(wfyVar.d()));
            W(wfyVar.f());
            this.P.m();
            if (this.I.l(14, 45680269L, false) && true == optional.isPresent()) {
                optional.get().f(tau.BROWSE_PAGE_LOADED);
            }
            if (this.I.l(17, 45680971L, false)) {
                this.q.kk(gnk.a);
            } else {
                this.f.postAtFrontOfQueue(new gnc(this, 2));
            }
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

    @Override // defpackage.cc
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.browse_fragment, viewGroup, false);
        this.ab = viewInflate;
        LoadingFrameLayout loadingFrameLayout = (LoadingFrameLayout) viewInflate.findViewById(R.id.browse_content);
        this.ac = loadingFrameLayout;
        this.P = this.O.s(loadingFrameLayout);
        this.C = (TabbedView) loadingFrameLayout.findViewById(R.id.tabbed_view);
        TabbedView tabbedView = this.C;
        if (tabbedView != null) {
            tabbedView.t(this.V);
        }
        this.u = new jhs(this.C, null, null, this.e);
        this.B = (Toolbar) this.ab.findViewById(R.id.toolbar);
        this.A = (AppBarLayout) this.ab.findViewById(R.id.app_bar);
        j(loadingFrameLayout);
        this.ad = this.X.a(this.U, this.e);
        return this.ab;
    }

    @Override // defpackage.gnf, defpackage.cc
    public final void onDestroyView() {
        V();
        this.ac = null;
        this.ab = null;
        super.onDestroyView();
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
}
