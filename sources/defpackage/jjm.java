package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.google.android.apps.youtube.music.R;
import com.google.android.apps.youtube.music.ui.components.loading.LoadingFrameLayout;
import com.google.android.libraries.youtube.common.ui.YouTubeButton;
import com.google.android.material.appbar.AppBarLayout;
import j$.util.Collection;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jjm extends jja implements jjs, xgm {
    public int A = 1;
    public xow B;
    public ahek C;
    public jnm D;
    public abxv E;
    private View F;
    private LoadingFrameLayout G;
    private View H;
    private YouTubeButton I;
    private RecyclerView J;
    private AppBarLayout K;
    private jbm L;
    private jkc M;
    private adlq N;
    private admo O;
    private vxe P;
    public ttm k;
    public Executor l;
    public Executor m;
    public wom n;
    public aduv o;
    public adxj p;
    public adhv q;
    public vxe r;
    public xgn s;
    public jer t;
    public View u;
    public RecyclerView v;
    public jjy w;
    public jjp x;
    public hek y;
    public boolean z;

    @Override // defpackage.xgm
    public final xgn hB() {
        return this.s;
    }

    @Override // defpackage.bp
    public final Dialog iH(Bundle bundle) {
        return new iyt(requireActivity(), this.b, this);
    }

    public final aqjx k() {
        hek hekVar = this.y;
        if (!(hekVar instanceof heh)) {
            if (hekVar instanceof jjw) {
                return ((jjw) hekVar).a;
            }
            return null;
        }
        alme almeVar = ((wfy) ((heh) hekVar).h).a.f;
        if (almeVar == null) {
            almeVar = alme.a;
        }
        return almeVar.b == 121288100 ? (aqjx) almeVar.c : aqjx.a;
    }

    public final void l(aqjx aqjxVar) {
        if (aqjxVar != null) {
            this.s.d(new xgj(aqjxVar.i, (amud) null));
        }
    }

    public final void m(heh hehVar) {
        if (hehVar.g != hei.b) {
            LoadingFrameLayout loadingFrameLayout = this.G;
            if (loadingFrameLayout != null) {
                loadingFrameLayout.h(1);
                this.G.h(2);
            }
            taf.k(this, this.n.h(this.D.x(hehVar.f), this.l), new iny(this, 16), new hcq(this, hehVar, 11, null));
        }
    }

    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, java.util.Set] */
    public final void n(boolean z) {
        int iAS;
        aqjx aqjxVarK = k();
        if (aqjxVarK == null || (iAS = a.aS(aqjxVarK.d)) == 0 || iAS != 2) {
            return;
        }
        int i = this.A;
        int i2 = 1;
        if (i != 1) {
            if (i == 2 && z) {
                this.A = 3;
                return;
            }
            return;
        }
        this.A = 2;
        jjp jjpVar = this.x;
        if (jjpVar == null) {
            this.A = 1;
            return;
        }
        ahgb ahgbVar = jjpVar.f;
        int i3 = 15;
        List list = (List) Collection.EL.stream(ahgbVar.Q(jjpVar.a)).filter(new iui(i3)).map(new ixa(7)).collect(Collectors.toCollection(new ieu(6)));
        List list2 = (List) Collection.EL.stream(ahgbVar.R()).filter(new iui(16)).map(new ixa(8)).collect(Collectors.toCollection(new ieu(6)));
        aihf aihfVarCreateBuilder = aqjp.a.createBuilder();
        Stream stream = Collection.EL.stream(list);
        ?? r9 = ahgbVar.e;
        Iterable iterable = (Iterable) stream.filter(new jmy(r9, i2)).collect(Collectors.toCollection(new ieu(6)));
        aihfVarCreateBuilder.copyOnWrite();
        aqjp aqjpVar = (aqjp) aihfVarCreateBuilder.instance;
        aiie aiieVar = aqjpVar.c;
        if (!aiieVar.c()) {
            aqjpVar.c = aihn.mutableCopy(aiieVar);
        }
        aifs.addAll(iterable, aqjpVar.c);
        Stream stream2 = Collection.EL.stream(list2);
        ?? r8 = ahgbVar.c;
        Iterable iterable2 = (Iterable) stream2.filter(new jmy(r8, i2)).collect(Collectors.toCollection(new ieu(6)));
        aihfVarCreateBuilder.copyOnWrite();
        aqjp aqjpVar2 = (aqjp) aihfVarCreateBuilder.instance;
        aiie aiieVar2 = aqjpVar2.b;
        if (!aiieVar2.c()) {
            aqjpVar2.b = aihn.mutableCopy(aiieVar2);
        }
        aifs.addAll(iterable2, aqjpVar2.b);
        Iterable iterable3 = (Iterable) Collection.EL.stream(list).filter(new ibz(ahgbVar, 19)).collect(Collectors.toCollection(new ieu(6)));
        aihfVarCreateBuilder.copyOnWrite();
        aqjp aqjpVar3 = (aqjp) aihfVarCreateBuilder.instance;
        aiie aiieVar3 = aqjpVar3.e;
        if (!aiieVar3.c()) {
            aqjpVar3.e = aihn.mutableCopy(aiieVar3);
        }
        aifs.addAll(iterable3, aqjpVar3.e);
        Iterable iterable4 = (Iterable) Collection.EL.stream(list2).filter(new ibz(ahgbVar, 20)).collect(Collectors.toCollection(new ieu(6)));
        aihfVarCreateBuilder.copyOnWrite();
        aqjp aqjpVar4 = (aqjp) aihfVarCreateBuilder.instance;
        aiie aiieVar4 = aqjpVar4.d;
        if (!aiieVar4.c()) {
            aqjpVar4.d = aihn.mutableCopy(aiieVar4);
        }
        aifs.addAll(iterable4, aqjpVar4.d);
        aqjp aqjpVar5 = (aqjp) aihfVarCreateBuilder.build();
        r9.addAll(aqjpVar5.c);
        r9.addAll(aqjpVar5.e);
        r8.addAll(aqjpVar5.b);
        r8.addAll(aqjpVar5.d);
        ajwo ajwoVar = aqjxVarK.h;
        if (ajwoVar == null) {
            ajwoVar = ajwo.a;
        }
        aihl aihlVarCheckIsLite = aihn.checkIsLite(ajmj.a);
        ajwoVar.c(aihlVarCheckIsLite);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
        ajmf ajmfVar = (ajmf) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
        aihh aihhVar = (aihh) ajwoVar.toBuilder();
        aihl aihlVar = ajmj.a;
        aihf builder = ajmfVar.toBuilder();
        ajmi ajmiVar = ajmfVar.h;
        if (ajmiVar == null) {
            ajmiVar = ajmi.a;
        }
        aihf builder2 = ajmiVar.toBuilder();
        builder2.copyOnWrite();
        ajmi ajmiVar2 = (ajmi) builder2.instance;
        aqjpVar5.getClass();
        ajmiVar2.c = aqjpVar5;
        ajmiVar2.b = 393677516;
        ajmi ajmiVar3 = (ajmi) builder2.build();
        builder.copyOnWrite();
        ajmf ajmfVar2 = (ajmf) builder.instance;
        ajmiVar3.getClass();
        ajmfVar2.h = ajmiVar3;
        ajmfVar2.b |= 64;
        aihhVar.e(aihlVar, (ajmf) builder.build());
        taf.k(this, this.n.h(this.D.x((ajwo) aihhVar.build()), this.l), new iny(this, 14), new iny(this, i3));
    }

    @Override // defpackage.jjs
    public final void o() {
        t();
    }

    @Override // defpackage.bp, defpackage.cc
    /* JADX INFO: renamed from: onCreate */
    public final void m658lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        super.m658lambda$performCreate$3$androidsupportv4appFragment(bundle);
        iO(0, R.style.Theme_YouTubeMusic_FullscreenDialog);
    }

    @Override // defpackage.cc
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Window window;
        heh hehVar;
        ajwo ajwoVar;
        this.P = new hdv(this.r, this);
        this.z = false;
        View viewInflate = layoutInflater.inflate(R.layout.tastebuilder_fragment, viewGroup, false);
        this.F = viewInflate;
        this.u = viewInflate.findViewById(R.id.tastebuilder_container_view);
        this.K = (AppBarLayout) this.F.findViewById(R.id.tastebuilder_header);
        jjy jjyVar = new jjy(requireActivity(), this.K, this.q, this.p);
        this.w = jjyVar;
        jjyVar.i(this);
        LoadingFrameLayout loadingFrameLayout = (LoadingFrameLayout) this.F.findViewById(R.id.tastebuilder_view);
        this.G = loadingFrameLayout;
        loadingFrameLayout.c(new gna(this, 7));
        this.G.h(1);
        this.v = (RecyclerView) this.F.findViewById(R.id.tastebuilder_contents);
        admo admoVarD = this.C.d(this.t.a);
        this.O = admoVarD;
        admoVarD.jR(new adlk(this.s, 0));
        this.v.ad(this.O);
        this.J = (RecyclerView) this.F.findViewById(R.id.tastebuilder_search_results);
        View viewFindViewById = this.F.findViewById(R.id.tastebuilder_bottom_bar);
        this.H = viewFindViewById;
        viewFindViewById.setVisibility(8);
        YouTubeButton youTubeButton = (YouTubeButton) this.F.findViewById(R.id.accept_button);
        this.I = youTubeButton;
        youTubeButton.setVisibility(8);
        this.L = new jjl(this, this.I, this.o, this.P, this.E);
        hek hekVar = this.y;
        if ((hekVar instanceof heh) && (ajwoVar = (hehVar = (heh) hekVar).f) != null) {
            aihl aihlVarCheckIsLite = aihn.checkIsLite(ajmj.a);
            ajwoVar.c(aihlVarCheckIsLite);
            if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
                m(hehVar);
            }
        }
        Dialog dialog = this.f;
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setStatusBarColor(requireActivity().getColor(R.color.full_transparent));
            window.getAttributes().windowAnimations = R.style.Theme_YouTubeMusic_FullscreenDialog_Animation;
        }
        this.F.setOnApplyWindowInsetsListener(new jmb(this, 1));
        return this.F;
    }

    @Override // defpackage.bp, defpackage.cc
    public final void onDestroyView() {
        super.onDestroyView();
        View view = this.F;
        if (view != null) {
            view.setOnApplyWindowInsetsListener(null);
        }
        this.z = true;
    }

    @Override // defpackage.bp, defpackage.cc
    public final void onStart() {
        super.onStart();
        LoadingFrameLayout loadingFrameLayout = this.G;
        if (loadingFrameLayout != null) {
            int i = bac.a;
            loadingFrameLayout.requestApplyInsets();
        }
        if (this.y instanceof jjw) {
            LoadingFrameLayout loadingFrameLayout2 = this.G;
            if (loadingFrameLayout2 != null) {
                loadingFrameLayout2.h(3);
            }
            v();
        }
    }

    public final void p(toe toeVar) {
        LoadingFrameLayout loadingFrameLayout;
        if (this.z || (loadingFrameLayout = this.G) == null) {
            return;
        }
        loadingFrameLayout.f(this.k.b(toeVar), true, false, false);
    }

    @Override // defpackage.jjs
    public final void r() {
        RecyclerView recyclerView = this.J;
        if (recyclerView != null) {
            recyclerView.setVisibility(0);
        }
        RecyclerView recyclerView2 = this.v;
        if (recyclerView2 != null) {
            recyclerView2.setVisibility(8);
        }
        View view = this.H;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v13, types: [java.lang.Object, java.util.Collection] */
    public final void s(aqjx aqjxVar) {
        if (aqjxVar != null) {
            ArrayList<List> arrayList = new ArrayList();
            for (aqjs aqjsVar : aqjxVar.c) {
                int i = aqjsVar.b;
                if (i == 119090873) {
                    aqju aqjuVar = i == 119090873 ? (aqju) aqjsVar.c : aqju.a;
                    ArrayList arrayList2 = new ArrayList();
                    for (aqjt aqjtVar : aqjuVar.b) {
                        int i2 = aqjtVar.b;
                        if (i2 == 119339461) {
                            arrayList2.add(new jjv(i2 == 119339461 ? (aqjv) aqjtVar.c : aqjv.a));
                        }
                    }
                    arrayList.add(arrayList2);
                }
            }
            jjp jjpVar = this.x;
            if (jjpVar != null) {
                agke agkeVar = jjpVar.c;
                int size = agkeVar.size();
                for (int i3 = 0; i3 < size; i3++) {
                    adhg adhgVar = (adhg) agkeVar.get(i3);
                    if (!adhgVar.a) {
                        jjpVar.b.keySet().removeAll(adhgVar.b);
                    }
                }
                jjpVar.c = agpi.a;
                List list = jjpVar.a;
                int size2 = list.size();
                while (true) {
                    size2--;
                    if (size2 < 0) {
                        break;
                    } else if (!jjpVar.f.V((jjv) list.get(size2))) {
                        list.remove(size2);
                        jjpVar.B(size2);
                    }
                }
                int size3 = 0;
                for (List list2 : arrayList) {
                    if (list2.size() > size3) {
                        size3 = list2.size();
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                for (int i4 = 0; i4 < size3; i4++) {
                    for (List list3 : arrayList) {
                        if (i4 < list3.size()) {
                            arrayList3.add(list3.get(i4));
                        }
                    }
                }
                List list4 = (List) Collection.EL.stream(arrayList3).filter(new ibz((Set) Collection.EL.stream(list).filter(new iui(14)).map(new ixa(6)).collect(Collectors.toCollection(new ieu(5))), 17)).collect(Collectors.toCollection(new ieu(4)));
                int size4 = list.size();
                list.addAll(list4);
                jjpVar.z(size4, list4.size());
                ArrayList arrayList4 = new ArrayList();
                for (List<jjv> list5 : arrayList) {
                    adhg adhgVar2 = new adhg(list5);
                    arrayList4.add(adhgVar2);
                    for (jjv jjvVar : list5) {
                        jjpVar.b.put(jjvVar, adhgVar2);
                        jjvVar.g = jjpVar;
                        jjvVar.f = jjpVar;
                        jjvVar.e = jjpVar;
                    }
                }
                jjpVar.c = agke.n(arrayList4);
                jjpVar.e = new qcb(this, null);
                jjpVar.d = new adbm(this, jjpVar, aqjxVar);
            }
        }
    }

    public final void t() {
        RecyclerView recyclerView = this.J;
        if (recyclerView != null) {
            recyclerView.setVisibility(8);
        }
        RecyclerView recyclerView2 = this.v;
        if (recyclerView2 != null) {
            recyclerView2.setVisibility(0);
        }
        View view = this.H;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0025  */
    /* JADX WARN: Code duplicated, block: B:46:0x00db  */
    public final void v() {
        hek hekVar;
        jjm jjmVar;
        Object obj;
        almd almdVar;
        if (getActivity() != null) {
            hek hekVar2 = this.y;
            if (!(hekVar2 instanceof heh) || (obj = ((heh) hekVar2).h) == null || (almdVar = ((wfy) obj).a) == null) {
                hekVar = this.y;
                if ((hekVar instanceof jjw) || ((jjw) hekVar).a == null) {
                    return;
                }
            } else {
                alme almeVar = almdVar.f;
                if (almeVar == null) {
                    almeVar = alme.a;
                }
                if (almeVar.b != 121288100) {
                    hekVar = this.y;
                    if (hekVar instanceof jjw) {
                        return;
                    } else {
                        return;
                    }
                }
            }
            aqjx aqjxVarK = k();
            if (aqjxVarK != null) {
                hek hekVar3 = this.y;
                this.s.b(xhb.a(6827), hekVar3 instanceof heh ? ((heh) hekVar3).f : null, null);
                l(aqjxVarK);
                xgn xgnVar = this.s;
                adly adlyVar = new adly();
                adlyVar.a(xgnVar);
                adlyVar.g(agkj.j("force_refresh", Boolean.TRUE));
                apji apjiVar = aqjxVarK.b;
                if (apjiVar == null) {
                    apjiVar = apji.a;
                }
                aihl aihlVarCheckIsLite = aihn.checkIsLite(aqjr.a);
                apjiVar.c(aihlVarCheckIsLite);
                Object objK = apjiVar.j.k(aihlVarCheckIsLite.d);
                aqjq aqjqVar = (aqjq) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
                jjy jjyVar = this.w;
                if (jjyVar != null) {
                    jjyVar.hU(adlyVar, aqjqVar);
                    if ((aqjqVar.b & 4) == 0) {
                        jjmVar = this;
                    } else {
                        apji apjiVar2 = aqjqVar.e;
                        if (apjiVar2 == null) {
                            apjiVar2 = apji.a;
                        }
                        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aqka.a);
                        apjiVar2.c(aihlVarCheckIsLite2);
                        Object objK2 = apjiVar2.j.k(aihlVarCheckIsLite2.d);
                        aqjz aqjzVar = (aqjz) (objK2 == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK2));
                        if (this.J != null) {
                            jjmVar = this;
                            jkc jkcVar = new jkc(requireActivity(), this.J, aqjzVar, jjmVar, this.s, this.t, this.C, this.B, this.m);
                            jjmVar.M = jkcVar;
                            jjmVar.w.i(jkcVar);
                        } else {
                            jjmVar = this;
                        }
                    }
                } else {
                    jjmVar = this;
                }
                ajng ajngVar = aqjxVarK.e;
                if (ajngVar == null) {
                    ajngVar = ajng.a;
                }
                if ((ajngVar.b & 1) != 0) {
                    View view = jjmVar.H;
                    if (view != null) {
                        view.setVisibility(0);
                    }
                    YouTubeButton youTubeButton = jjmVar.I;
                    if (youTubeButton != null) {
                        youTubeButton.setEnabled(true);
                        jjmVar.I.setVisibility(0);
                    }
                    ajng ajngVar2 = aqjxVarK.e;
                    if (ajngVar2 == null) {
                        ajngVar2 = ajng.a;
                    }
                    ajnf ajnfVar = ajngVar2.c;
                    if (ajnfVar == null) {
                        ajnfVar = ajnf.a;
                    }
                    aihh aihhVar = (aihh) ajnfVar.toBuilder();
                    aihhVar.copyOnWrite();
                    ajnf ajnfVar2 = (ajnf) aihhVar.instance;
                    ajnfVar2.d = 2;
                    ajnfVar2.c = 1;
                    ajnf ajnfVar3 = (ajnf) aihhVar.build();
                    jbm jbmVar = jjmVar.L;
                    if (jbmVar != null) {
                        jbmVar.hU(adlyVar, ajnfVar3);
                    }
                }
                jjmVar.x = new jjp();
                adlq adlqVar = new adlq(false);
                jjmVar.N = adlqVar;
                adlqVar.m(-1, jjmVar.x, true);
                admo admoVar = jjmVar.O;
                if (admoVar != null) {
                    admoVar.D(jjmVar.N, null);
                }
                GridLayoutManager gridLayoutManager = new GridLayoutManager(jjmVar.requireActivity(), 3);
                gridLayoutManager.g = new jjr(jjmVar.N);
                RecyclerView recyclerView = jjmVar.v;
                if (recyclerView != null) {
                    recyclerView.ah(gridLayoutManager);
                }
                jjmVar.s(aqjxVarK);
                LoadingFrameLayout loadingFrameLayout = jjmVar.G;
                if (loadingFrameLayout != null) {
                    loadingFrameLayout.h(3);
                }
                xgnVar.w(new xgj(aqjxVarK.i, (amud) null), null);
                for (ajwo ajwoVar : aqjxVarK.f) {
                    vxe vxeVar = jjmVar.P;
                    if (vxeVar != null) {
                        vxeVar.c(ajwoVar, null);
                    }
                }
            }
        }
    }

    public final void w() {
        hek hekVar = this.y;
        if (hekVar instanceof jjw) {
            jjw jjwVar = (jjw) hekVar;
            if (jjwVar.b.isPresent()) {
                this.r.a((ajwo) jjwVar.b.get());
            }
        }
    }

    @Override // defpackage.jjs
    public final void q() {
    }

    @Override // defpackage.jjs
    public final void u(String str) {
    }
}
