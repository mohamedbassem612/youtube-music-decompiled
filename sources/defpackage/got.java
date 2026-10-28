package defpackage;

import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.android.apps.youtube.music.ui.refresh.MusicSwipeRefreshLayout;
import com.google.android.apps.youtube.music.ui.tabs.TabbedView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class got extends goj implements adtm {
    public tbt a;
    public wom b;
    public izf c;
    public jaz d;
    public xgn e;
    public jer f;
    public jax g;
    public Handler h;
    public gmy i;
    public heh j;
    public hkl k;
    public aeod l;
    public vwt m;
    public ci n;
    public hhb o;
    private View p;
    private TabbedView q;
    private jhs r;
    private advd s;
    private final gos t = new gos(this, 0);
    private final jau u = new gor(0);
    private final avmm v = new avmm();
    private yvh w;

    private final void c() {
        angn angnVar;
        jhs jhsVar = this.r;
        if (jhsVar == null || this.j == null) {
            return;
        }
        jhsVar.f();
        agke agkeVarF = ((wfy) this.j.h).f();
        int size = agkeVarF.size();
        for (int i = 0; i < size; i++) {
            aftj aftjVar = (aftj) agkeVarF.get(i);
            wgd wgdVarH = aftjVar.h();
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
                MusicSwipeRefreshLayout musicSwipeRefreshLayout = new MusicSwipeRefreshLayout(requireActivity());
                jhh jhhVarL = this.o.l(musicSwipeRefreshLayout);
                if (angnVar != null) {
                    adma admaVarE = adul.e(this.f.a, angnVar, null);
                    if (admaVarE != null) {
                        adly adlyVar = new adly();
                        adlyVar.a(this.e);
                        adlyVar.f("messageRendererHideDivider", Boolean.TRUE);
                        admaVarE.hU(adlyVar, angnVar);
                        this.r.o(aftjVar, null, admaVarE.a(), null);
                    }
                } else if (this.q != null && this.s != null) {
                    View viewInflate = RelativeLayout.inflate(requireActivity(), R.layout.section_list, null);
                    RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.section_list_content);
                    yvh yvhVar = this.w;
                    adxd adxdVar = yvhVar != null ? (adxd) ((agkj) yvhVar.c).get(aftjVar) : null;
                    jax jaxVar = this.g;
                    jaf jafVar = new jaf();
                    jafVar.n(adxdVar);
                    jafVar.o(recyclerView);
                    jafVar.g(new advn());
                    jafVar.p(this.l);
                    jafVar.q(this.m);
                    jafVar.j(this.b);
                    jafVar.l(this.s);
                    jafVar.m(this.f.a);
                    jafVar.e(this.e);
                    jafVar.i(this.t);
                    jafVar.k(this.u);
                    jafVar.h(jhhVarL);
                    jav javVarA = jaxVar.a(jafVar.a());
                    javVarA.L(new gob(this, 2));
                    javVarA.an = this;
                    musicSwipeRefreshLayout.addView(viewInflate);
                    jhhVarL.a = javVarA;
                    if (adxdVar == null) {
                        javVarA.at(wgdVarH);
                    } else if (recyclerView.n != null) {
                        yvh yvhVar2 = this.w;
                        Parcelable parcelable = yvhVar2 != null ? (Parcelable) ((agkj) yvhVar2.b).get(aftjVar) : null;
                        if (parcelable != null) {
                            recyclerView.n.onRestoreInstanceState(parcelable);
                        }
                    }
                    this.r.o(aftjVar, null, musicSwipeRefreshLayout, javVarA);
                    TabbedView tabbedView = this.q;
                    View viewJ = tabbedView.j(tabbedView.d() - 1);
                    if (viewJ != null && viewJ.getVisibility() == 0) {
                        this.n.af(aftjVar.b, viewJ);
                    }
                }
            }
        }
        yvh yvhVar3 = this.w;
        if (yvhVar3 != null) {
            this.r.m(yvhVar3.a);
        }
    }

    @Override // defpackage.cc, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        jhs jhsVar = this.r;
        if (jhsVar != null) {
            jhsVar.k(configuration);
        }
    }

    @Override // defpackage.cc
    /* JADX INFO: renamed from: onCreate */
    public final void m658lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        super.m658lambda$performCreate$3$androidsupportv4appFragment(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        if (bundle != null) {
            this.j = (heh) bundle.getParcelable("model");
        }
    }

    @Override // defpackage.cc
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.tabbed_inner_fragment, viewGroup, false);
        this.p = viewInflate;
        TabbedView tabbedView = (TabbedView) viewInflate.findViewById(R.id.tabbed_view);
        this.q = tabbedView;
        tabbedView.t(this.c);
        this.r = new jhs(this.q, null, null, this.e);
        this.s = this.d.a(this.b, this.e);
        return this.p;
    }

    @Override // defpackage.cc
    public final void onDestroy() {
        this.v.dispose();
        super.onDestroy();
    }

    @Override // defpackage.cc
    public final void onDestroyView() {
        jhs jhsVar = this.r;
        if (jhsVar != null) {
            this.w = jhsVar.n();
            this.r.i();
            this.r = null;
        }
        this.p = null;
        this.q = null;
        super.onDestroyView();
    }

    @Override // defpackage.cc
    /* JADX INFO: renamed from: onSaveInstanceState */
    public final void m668x22bc4f96(Bundle bundle) {
        heh hehVar = this.j;
        if (hehVar != null) {
            bundle.putParcelable("model", hehVar);
        }
    }

    @Override // defpackage.cc
    public final void onStart() {
        super.onStart();
        heh hehVar = this.j;
        if (hehVar != null) {
            if (this.w != null) {
                c();
                this.w = null;
                return;
            }
            if (hehVar != null) {
                this.e.D(xhb.a(6827), xgu.a, this.j.f);
                if (this.k.m()) {
                    this.k.c(this.e);
                }
            }
            this.e.d(new xgj(((wfy) this.j.h).d()));
            c();
            this.h.postAtFrontOfQueue(new gnc(this, 8));
        }
    }

    @Override // defpackage.adtm
    public final void p(toe toeVar, acjx acjxVar) {
    }
}
