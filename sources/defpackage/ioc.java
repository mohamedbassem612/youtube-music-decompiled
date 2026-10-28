package defpackage;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.google.android.apps.youtube.music.R;
import com.google.android.apps.youtube.music.search.ui.SearchToolbarView;
import com.google.android.apps.youtube.music.ui.components.loading.LoadingFrameLayout;
import com.google.android.apps.youtube.music.ui.text.PlainTextEditText;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ioc extends inv implements hku {
    public static final agrf a = agrf.h("com/google/android/apps/youtube/music/search/ui/SearchInputFragment");
    public RecyclerView A;
    public tfq C;
    public hkl D;
    public hke E;
    public vxz F;
    public vxz G;
    public vxz H;
    public xow I;
    public aapw J;
    public aeod K;
    public vwt L;
    public abxv M;
    public axfd N;
    public xsc O;
    private jlm P;
    private jlj Q;
    private LinearLayoutManager R;
    private ajwo T;
    private String U;
    private String V;
    private Toolbar W;
    private avmn X;
    public ExecutorService b;
    public gfp c;
    public xgn d;
    public inu e;
    public jer f;
    public jaz g;
    public mbc h;
    public vxe i;
    public avmb j;
    public xit k;
    public abvk l;
    public iwe m;
    public tbt n;
    public avlh o;
    public jlh p;
    public jax q;
    public inr r;
    public aefv s;
    public adwg t;
    public SearchToolbarView u;
    public LoadingFrameLayout v;
    public admu w;
    public String x;
    public ggd y;
    public inp z;
    private final Set S = new HashSet();
    private hdt Y = hdt.MUSIC_SEARCH_CATALOG;
    private String Z = "";
    public boolean B = false;
    private final qa ab = new inz(this);
    private final qr aa = new ioa(this);
    private final qa ac = new iob(this);

    private final String o() {
        ajwo ajwoVar = this.T;
        if (ajwoVar == null) {
            return "";
        }
        aihl aihlVarCheckIsLite = aihn.checkIsLite(apni.a);
        ajwoVar.c(aihlVarCheckIsLite);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
        return ((apng) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK))).e;
    }

    private final String p() {
        ajwo ajwoVar = this.T;
        if (ajwoVar == null) {
            return "";
        }
        aihl aihlVarCheckIsLite = aihn.checkIsLite(apni.a);
        ajwoVar.c(aihlVarCheckIsLite);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
        return ((apng) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK))).f;
    }

    private final void q() {
        Set set = this.S;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            this.M.L((String) it.next());
        }
        set.clear();
        this.s.i();
    }

    private final void r() {
        SearchToolbarView searchToolbarView;
        if (!this.F.l(0, 45712947L, false) || (searchToolbarView = this.u) == null) {
            return;
        }
        RelativeLayout relativeLayout = searchToolbarView.h;
        relativeLayout.setPaddingRelative(relativeLayout.getPaddingStart(), this.u.h.getPaddingTop(), jnj.w(requireContext()), this.u.h.getPaddingBottom());
    }

    private final void s() {
        int iW = jnj.w(requireContext());
        SearchToolbarView searchToolbarView = this.u;
        if (searchToolbarView != null) {
            searchToolbarView.g.setMinimumWidth(iW);
            this.u.f.setMinimumWidth(iW);
        }
    }

    private final void t() {
        SearchToolbarView searchToolbarView;
        if (this.u != null) {
            if (v() && (searchToolbarView = this.u) != null) {
                searchToolbarView.g(requireContext().getString(R.string.library_search_hint));
                return;
            }
            boolean zL = this.F.l(9, 45780438L, false);
            SearchToolbarView searchToolbarView2 = this.u;
            if (zL) {
                searchToolbarView2.g(requireContext().getString(R.string.search_landing_page_hint));
            } else {
                searchToolbarView2.g(requireContext().getString(R.string.search_hint_songs_artists_podcasts));
            }
        }
    }

    private final void u() {
        RecyclerView recyclerView;
        if (kro.M(this) || (recyclerView = this.A) == null) {
            return;
        }
        recyclerView.setClipToPadding(false);
        this.A.setPaddingRelative(0, 0, 0, getContext().getResources().getDimensionPixelSize(R.dimen.mini_player_height));
    }

    private final boolean v() {
        return this.F.l(1, 45715026L, false) && this.Z.equals("FEmusic_library_landing") && !this.B;
    }

    @Override // defpackage.hku
    public final boolean A() {
        return true;
    }

    public final int d() {
        LinearLayoutManager linearLayoutManager = this.R;
        if (linearLayoutManager == null) {
            return -1;
        }
        int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
        if (this.t == null) {
            return -1;
        }
        agjz agjzVar = new agjz(4);
        for (int i = 0; i < this.t.j.a(); i++) {
            if (hmy.X(this.t.j.d(i))) {
                agjzVar.h(this.t.j.d(i));
            }
        }
        agke agkeVarG = agjzVar.g();
        for (int i2 = ((agpi) agkeVarG).d - 1; i2 >= 0; i2--) {
            if (agkeVarG.get(i2).equals(this.t.j.d(iFindLastVisibleItemPosition))) {
                return i2;
            }
        }
        return -1;
    }

    public final void f(Boolean bool) {
        SearchToolbarView searchToolbarView = this.u;
        if (searchToolbarView != null) {
            searchToolbarView.d.setEnabled(bool.booleanValue());
        }
    }

    public final void g() {
        inp inpVar = this.z;
        int iB = (int) (inpVar.a.b() - inpVar.c);
        if (inpVar.d == -1) {
            inpVar.d = iB;
        }
        inpVar.e = iB;
    }

    @Override // defpackage.hku
    public final Optional gS() {
        return Optional.ofNullable(this.T);
    }

    public final void h(String str, Integer num, ajwo ajwoVar) {
        aihh aihhVar;
        if (kro.M(this) || this.u == null) {
            return;
        }
        if (this.F.l(8, 45764180L, false)) {
            this.u.k = true;
        }
        this.u.d();
        hel helVar = new hel();
        if (ajwoVar != null) {
            aihhVar = (aihh) ajwoVar.toBuilder();
        } else {
            ajwo ajwoVar2 = this.T;
            aihhVar = ajwoVar2 != null ? (aihh) ajwoVar2.toBuilder() : (aihh) fhz.U("").toBuilder();
        }
        if ((ajwoVar == null || this.x.isEmpty()) && this.d.a() != null) {
            aihf aihfVarCreateBuilder = aoar.a.createBuilder();
            String strI = this.d.i();
            int i = this.d.a().f;
            aihfVarCreateBuilder.copyOnWrite();
            aoar aoarVar = (aoar) aihfVarCreateBuilder.instance;
            strI.getClass();
            aoarVar.b |= 1;
            aoarVar.c = strI;
            aihfVarCreateBuilder.copyOnWrite();
            aoar aoarVar2 = (aoar) aihfVarCreateBuilder.instance;
            aoarVar2.b |= 2;
            aoarVar2.d = i;
            aihhVar.e(aoaq.b, (aoar) aihfVarCreateBuilder.build());
        }
        aihh aihhVar2 = (aihh) ((apng) aihhVar.b(apni.a)).toBuilder();
        aihhVar2.copyOnWrite();
        apng apngVar = (apng) aihhVar2.instance;
        str.getClass();
        apngVar.b |= 1;
        apngVar.c = str;
        if (ajwoVar != null) {
            aihl aihlVarCheckIsLite = aihn.checkIsLite(apni.a);
            ajwoVar.c(aihlVarCheckIsLite);
            Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
            if (((apng) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK))).e.isEmpty() && !o().isEmpty()) {
                String strO = o();
                aihhVar2.copyOnWrite();
                apng apngVar2 = (apng) aihhVar2.instance;
                strO.getClass();
                apngVar2.b |= 8;
                apngVar2.e = strO;
            }
        }
        ajwo ajwoVar3 = this.T;
        if (ajwoVar3 != null) {
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(apni.a);
            ajwoVar3.c(aihlVarCheckIsLite2);
            Object objK2 = ajwoVar3.j.k(aihlVarCheckIsLite2.d);
            alxr alxrVarA = alxr.a(((apng) (objK2 == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK2))).d);
            if (alxrVarA == null) {
                alxrVarA = alxr.SEARCH_PAGE_TYPE_UNKNOWN;
            }
            if (alxrVarA.equals(alxr.SEARCH_PAGE_TYPE_LANDING)) {
                String strP = p();
                aihhVar2.copyOnWrite();
                apng apngVar3 = (apng) aihhVar2.instance;
                strP.getClass();
                apngVar3.b |= 16;
                apngVar3.f = strP;
                ajwo ajwoVar4 = this.T;
                aihl aihlVarCheckIsLite3 = aihn.checkIsLite(apni.a);
                ajwoVar4.c(aihlVarCheckIsLite3);
                Object objK3 = ajwoVar4.j.k(aihlVarCheckIsLite3.d);
                alxr alxrVarA2 = alxr.a(((apng) (objK3 == null ? aihlVarCheckIsLite3.b : aihlVarCheckIsLite3.c(objK3))).d);
                if (alxrVarA2 == null) {
                    alxrVarA2 = alxr.SEARCH_PAGE_TYPE_UNKNOWN;
                }
                aihhVar2.copyOnWrite();
                apng apngVar4 = (apng) aihhVar2.instance;
                apngVar4.d = alxrVarA2.i;
                apngVar4.b |= 2;
                aihhVar.copyOnWrite();
                ajwo ajwoVar5 = (ajwo) aihhVar.instance;
                ajwoVar5.e = null;
                ajwoVar5.b &= -3;
            }
        }
        aihhVar.e(apni.a, (apng) aihhVar2.build());
        helVar.j((ajwo) aihhVar.build());
        helVar.c(this.Y);
        byte[] bArrN = n(num);
        if (bArrN != null) {
            helVar.a = bArrN;
        }
        helVar.c = this.Z;
        this.T = (ajwo) aihhVar.build();
        this.c.k(helVar);
    }

    @tcc
    public void handleHideEnclosingEvent(vvt vvtVar) {
        ExecutorService executorService = this.b;
        inu inuVar = this.e;
        inuVar.getClass();
        executorService.execute(afwl.i(new hgx(inuVar, 19)));
    }

    public final void i(String str) {
        ListenableFuture listenableFuture;
        if (getActivity() == null || this.N.au()) {
            return;
        }
        Locale locale = Locale.getDefault();
        if (getActivity().getResources() != null && getActivity().getResources().getConfiguration() != null) {
            locale = getActivity().getResources().getConfiguration().locale;
        }
        String lowerCase = typ.c(str).toLowerCase(locale);
        int i = 0;
        if (!lowerCase.isEmpty() || m()) {
            listenableFuture = null;
        } else {
            inu inuVar = this.e;
            ListenableFuture listenableFutureJ = inuVar.b.submit(afwl.j(new huo(inuVar, 7)));
            taf.l(this, listenableFutureJ, new iny(this, i), new iny(this, 2));
            listenableFuture = listenableFutureJ;
        }
        int i2 = 1;
        boolean z = this.B && str.isEmpty();
        if (this.F.l(0, 45712947L, false)) {
            inr inrVar = this.r;
            Duration duration = inr.a;
            duration.getClass();
            inrVar.a();
            ListenableFuture listenableFutureP = ahng.p(new inq(0), duration.toSeconds(), TimeUnit.SECONDS, inrVar.b);
            inrVar.c = listenableFutureP;
            taf.l(this, listenableFutureP, new igt(3), new iny(this, i2));
        }
        taf.l(this, this.I.c(str, this.U, (this.B && str.isEmpty()) ? this.V : "", this.b, z ? alxr.SEARCH_PAGE_TYPE_LANDING : null, m() ? alxq.MUSIC_SEARCH_REQUEST_TYPE_LIBRARY : null), new glm(this, 20), new hmo(this, str, listenableFuture, lowerCase, 2));
    }

    public final void j(alxg alxgVar) {
        if (kro.M(this) || this.A == null || this.R == null) {
            return;
        }
        k();
        q();
        if (this.F.l(0, 45712947L, false) && (alxgVar.b & 64) != 0) {
            alxk alxkVar = alxgVar.f;
            if (alxkVar == null) {
                alxkVar = alxk.a;
            }
            if (alxkVar.b == 152873793) {
                alxk alxkVar2 = alxgVar.f;
                if (alxkVar2 == null) {
                    alxkVar2 = alxk.a;
                }
                aqof aqofVar = alxkVar2.b == 152873793 ? (aqof) alxkVar2.c : aqof.a;
                String strO = kro.O(aqofVar);
                if (!TextUtils.isEmpty(strO)) {
                    this.S.add(strO);
                    this.M.K(aqofVar, new bym(14), true);
                }
            }
        }
        this.R.setRecycleChildrenOnDetach(true);
        this.d.d(new xgj(alxgVar.e, (amud) null));
        for (alxl alxlVar : alxgVar.d) {
            if (alxlVar.b == 49399797) {
                if (alxgVar.d.size() > 1) {
                    ((agrc) ((agrc) a.b()).k("com/google/android/apps/youtube/music/search/ui/SearchInputFragment", "renderSuggestions", 866, "SearchInputFragment.java")).t("Search Suggestions Response has Section List but also more than one renderer.");
                }
                apoq apoqVar = alxlVar.b == 49399797 ? (apoq) alxlVar.c : apoq.a;
                adwg adwgVar = this.t;
                if (adwgVar != null) {
                    adwgVar.L(new gob(this, 7));
                    this.t.as(new wgd(apoqVar));
                }
                LoadingFrameLayout loadingFrameLayout = this.v;
                if (loadingFrameLayout != null) {
                    int i = loadingFrameLayout.d;
                    if (i == 0) {
                        throw null;
                    }
                    if (i == 2) {
                        loadingFrameLayout.h(3);
                        return;
                    }
                    return;
                }
                return;
            }
        }
    }

    public final void k() {
        this.r.a();
    }

    public final void l(ajwo ajwoVar, Map map) {
        this.T = ajwoVar;
        this.U = o();
        this.V = p();
        if (map.containsKey("hide_search_back_action") && (map.get("hide_search_back_action") instanceof Boolean)) {
            Boolean bool = (Boolean) map.get("hide_search_back_action");
            SearchToolbarView searchToolbarView = this.u;
            if (searchToolbarView != null) {
                searchToolbarView.i(bool.booleanValue());
            }
        }
        if (map.containsKey("default_search_tab_id") && (map.get("default_search_tab_id") instanceof hdt)) {
            this.Y = (hdt) map.get("default_search_tab_id");
        }
        if (map.containsKey("search_launched_from_fragment") && (map.get("search_launched_from_fragment") instanceof String)) {
            this.Z = (String) map.get("search_launched_from_fragment");
        }
        t();
    }

    public final boolean m() {
        return this.F.l(7, 45758343L, false) && this.Z.equals("FEmusic_library_landing") && !this.B;
    }

    /* JADX WARN: Type inference failed for: r8v8, types: [java.lang.Object, java.util.List] */
    public final byte[] n(Integer num) {
        Optional optionalEmpty;
        alay alayVar;
        if (num == null) {
            return null;
        }
        this.z.b(d());
        inp inpVar = this.z;
        String str = this.x;
        agjz agjzVar = new agjz(4);
        if (this.t != null) {
            for (int i = 0; i < this.t.j.a(); i++) {
                agjzVar.h(this.t.j.d(i));
            }
        }
        agke agkeVarG = agjzVar.g();
        int i2 = ((agpi) agkeVarG).d;
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            Object obj = agkeVarG.get(i3);
            if (!hmy.X(obj)) {
                optionalEmpty = Optional.empty();
            } else if (obj instanceof apnx) {
                alay alayVar2 = ((apnx) obj).c;
                if (alayVar2 == null) {
                    alayVar2 = alay.a;
                }
                optionalEmpty = Optional.of(new aejg(ackj.k(null, alayVar2, null, false).toString(), 0));
            } else if (obj instanceof alhu) {
                alhu alhuVar = (alhu) obj;
                if ((alhuVar.b & 2) != 0) {
                    alayVar = alhuVar.f;
                    if (alayVar == null) {
                        alayVar = alay.a;
                    }
                } else {
                    alayVar = null;
                }
                optionalEmpty = Optional.of(new aejg(ackj.k(null, alayVar, null, false).toString(), 35));
            } else if (obj instanceof anzi) {
                alay alayVar3 = ((anzi) obj).g;
                if (alayVar3 == null) {
                    alayVar3 = alay.a;
                }
                optionalEmpty = Optional.of(new aejg(ackj.k(null, alayVar3, null, false).toString(), 35));
            } else {
                optionalEmpty = Optional.empty();
            }
            imc imcVar = new imc(arrayList, 3);
            if (true == optionalEmpty.isPresent()) {
                imcVar.a.add(optionalEmpty.get());
            }
        }
        int iIntValue = num.intValue();
        int iMin = Math.min(arrayList.size() - 1, inpVar.b);
        aejh aejhVarA = aeji.a();
        aejhVarA.c();
        aejhVarA.a = str;
        aejhVarA.b = arrayList;
        aejhVarA.b(iIntValue);
        aejhVarA.g(iMin);
        aejhVarA.d(inpVar.d);
        aejhVarA.f(inpVar.e);
        aejhVarA.i((int) (inpVar.a.b() - inpVar.c));
        aejhVarA.j(inpVar.f);
        aejhVarA.h();
        aejhVarA.k(inpVar.h);
        aejhVarA.e(agkz.n(inpVar.g));
        return aejhVarA.a().b().toByteArray();
    }

    @Override // defpackage.cc
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1000) {
            if (i2 == -1) {
                if (intent != null) {
                    ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("android.speech.extra.RESULTS");
                    if (stringArrayListExtra == null || stringArrayListExtra.isEmpty()) {
                        this.k.q(48);
                        return;
                    }
                    this.k.u("voz_mf", 48);
                    inp inpVar = this.z;
                    inpVar.h = 16;
                    inpVar.a(alxs.SPEECH);
                    h(stringArrayListExtra.get(0), -1, null);
                    return;
                }
                return;
            }
            i = 1000;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // defpackage.cc, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        adwg adwgVar = this.t;
        if (adwgVar != null) {
            adwgVar.p(configuration);
        }
        s();
        u();
        r();
    }

    /* JADX WARN: Code duplicated, block: B:9:0x002d  */
    @Override // defpackage.cc
    /* JADX INFO: renamed from: onCreate */
    public final void m658lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        ajwo ajwoVar;
        super.m658lambda$performCreate$3$androidsupportv4appFragment(bundle);
        xgn xgnVar = this.d;
        xhc xhcVarA = xhb.a(62985);
        ajwo ajwoVar2 = this.T;
        if (ajwoVar2 == null || (ajwoVar2.b & 1) == 0) {
            ajwoVar = null;
        } else {
            aihl aihlVarCheckIsLite = aihn.checkIsLite(aoaq.b);
            ajwoVar2.c(aihlVarCheckIsLite);
            if (ajwoVar2.j.n(aihlVarCheckIsLite.d)) {
                ajwoVar = this.T;
            } else {
                ajwoVar = null;
            }
        }
        xgnVar.b(xhcVarA, ajwoVar, null);
        if (this.F.l(0, 45712947L, false)) {
            this.D.c(this.d);
        }
    }

    @Override // defpackage.cc
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        SearchToolbarView searchToolbarView;
        ViewGroup.LayoutParams layoutParams;
        SearchToolbarView searchToolbarView2;
        ImageView imageView;
        this.n.f(this);
        View viewInflate = layoutInflater.inflate(R.layout.search_input_fragment, viewGroup, false);
        if (this.H.l(31, 45757116L, false)) {
            viewInflate.setBackgroundColor(requireContext().getColor(R.color.theme_main_window_background));
        }
        SearchToolbarView searchToolbarView3 = (SearchToolbarView) viewInflate.findViewById(R.id.custom_search_toolbar);
        this.u = searchToolbarView3;
        searchToolbarView3.getClass();
        this.v = (LoadingFrameLayout) viewInflate.findViewById(R.id.suggestions_container);
        this.W = (Toolbar) viewInflate.findViewById(R.id.search_toolbar);
        this.A = (RecyclerView) viewInflate.findViewById(R.id.suggestion_list);
        s();
        jay jayVarA = this.g.a(wnf.q, this.d);
        this.R = new LinearLayoutManager(getContext());
        this.w = new admu();
        this.y = new ggd(viewInflate.findViewById(R.id.toolbar_divider));
        inp inpVar = new inp(this.h);
        this.z = inpVar;
        inpVar.f = true;
        this.u.i(this.F.l(0, 45712947L, false) && !this.F.l(8, 45764180L, false));
        u();
        iod iodVar = new iod(this, 1);
        xgn xgnVar = this.d;
        xsc xscVar = this.O;
        xit xitVar = this.k;
        abvk abvkVar = this.l;
        SearchToolbarView searchToolbarView4 = this.u;
        jlm jlmVar = new jlm(this, xgnVar, xscVar, xitVar, abvkVar, iodVar, searchToolbarView4.d, jlm.a, searchToolbarView4.b, this.p);
        this.P = jlmVar;
        jlmVar.b();
        xgn xgnVar2 = this.d;
        xsc xscVar2 = this.O;
        vxe vxeVar = this.i;
        SearchToolbarView searchToolbarView5 = this.u;
        jlj jljVar = new jlj(this, xgnVar2, xscVar2, vxeVar, searchToolbarView5.e, searchToolbarView5.b, this.p);
        this.Q = jljVar;
        jljVar.a();
        if (this.F.l(0, 45712947L, false) && (searchToolbarView2 = this.u) != null && (imageView = searchToolbarView2.e) != null) {
            this.s.h(imageView.getRootView());
            this.M.J("sound_search_button", this.u.e);
        }
        jax jaxVar = this.q;
        jaf jafVar = new jaf();
        jafVar.o(this.A);
        jafVar.f(this.R);
        jafVar.p(this.K);
        jafVar.q(this.L);
        jafVar.l(jayVarA);
        jafVar.m(this.f.a);
        jafVar.e(this.d);
        this.t = jaxVar.a(jafVar.a());
        this.u.c.setOnClickListener(new hdf(this, 15));
        this.U = o();
        this.V = p();
        if (this.F.l(9, 45780438L, false) && (layoutParams = this.W.getLayoutParams()) != null) {
            layoutParams.height = getContext().getResources().getDimensionPixelSize(R.dimen.search_bar_height);
            this.W.setLayoutParams(layoutParams);
        }
        ajwo ajwoVar = this.T;
        int i = 4;
        if (ajwoVar != null) {
            aihl aihlVarCheckIsLite = aihn.checkIsLite(apni.a);
            ajwoVar.c(aihlVarCheckIsLite);
            Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
            alxr alxrVarA = alxr.a(((apng) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK))).d);
            if (alxrVarA == null) {
                alxrVarA = alxr.SEARCH_PAGE_TYPE_UNKNOWN;
            }
            if (alxrVarA.equals(alxr.SEARCH_PAGE_TYPE_LANDING)) {
                this.B = true;
                if (!this.F.l(4, 45733117L, false) && (searchToolbarView = this.u) != null) {
                    searchToolbarView.d();
                }
                this.u.e();
                qv onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
                qr qrVar = this.aa;
                qrVar.getClass();
                onBackPressedDispatcher.a().a.c(qrVar.e(new djo(qrVar, null)));
            }
        }
        SearchToolbarView searchToolbarView6 = this.u;
        searchToolbarView6.j = this.B;
        searchToolbarView6.j();
        this.x = fhz.af(this.T);
        int i2 = 2;
        if (!this.F.l(0, 45712947L, false) || v()) {
            LoadingFrameLayout loadingFrameLayout = this.v;
            if (loadingFrameLayout != null) {
                loadingFrameLayout.h(3);
            }
        } else {
            LoadingFrameLayout loadingFrameLayout2 = this.v;
            if (loadingFrameLayout2 != null) {
                loadingFrameLayout2.c(new gna(this, 5));
                this.v.h(1);
                this.v.h(2);
            }
        }
        this.u.b.setText(this.x);
        this.u.b.addTextChangedListener(new gxv(this, 3));
        this.u.b.setOnEditorActionListener(new jly(this, 1));
        this.u.b.setOnFocusChangeListener(new gxs(this, i2));
        bcs bcsVar = new bcs(this, i);
        int i3 = bac.a;
        azs.c(viewInflate, bcsVar);
        this.A.aC(this.ab);
        this.A.aC(this.ac);
        this.W.m(0, 0);
        r();
        return viewInflate;
    }

    @Override // defpackage.cc
    public final void onDestroyView() {
        q();
        adwg adwgVar = this.t;
        if (adwgVar != null) {
            adwgVar.i();
            this.t = null;
        }
        if (this.A != null) {
            if (!this.G.l(330, 45719181L, false)) {
                this.A.aE(this.ab);
                this.A.aE(this.ac);
            }
            this.A = null;
        }
        this.R = null;
        this.w = null;
        this.W = null;
        this.u = null;
        this.P = null;
        this.Q = null;
        this.y = null;
        this.v = null;
        this.n.l(this);
        this.aa.f();
        k();
        super.onDestroyView();
    }

    @Override // defpackage.cc
    public final void onPause() {
        super.onPause();
        SearchToolbarView searchToolbarView = this.u;
        if (searchToolbarView != null) {
            searchToolbarView.d();
        }
        Object obj = this.X;
        if (obj != null) {
            awka.f((AtomicReference) obj);
        }
    }

    @Override // defpackage.cc
    public final void onResume() {
        SearchToolbarView searchToolbarView;
        adwg adwgVar;
        super.onResume();
        inp inpVar = this.z;
        inpVar.c = inpVar.a.b();
        inpVar.d = -1;
        inpVar.e = -1;
        inpVar.h = 1;
        inpVar.g.clear();
        ajwo ajwoVar = this.T;
        if (ajwoVar != null) {
            aihl aihlVarCheckIsLite = aihn.checkIsLite(apni.a);
            ajwoVar.c(aihlVarCheckIsLite);
            Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
            alxr alxrVarA = alxr.a(((apng) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK))).d);
            if (alxrVarA == null) {
                alxrVarA = alxr.SEARCH_PAGE_TYPE_UNKNOWN;
            }
            if (alxrVarA.equals(alxr.SEARCH_PAGE_TYPE_LANDING)) {
                this.B = true;
            }
        }
        if ((!this.B || this.F.l(4, 45733117L, false)) && (searchToolbarView = this.u) != null) {
            searchToolbarView.e();
        }
        SearchToolbarView searchToolbarView2 = this.u;
        int i = 8;
        if (searchToolbarView2 != null) {
            int i2 = bac.a;
            PlainTextEditText plainTextEditText = searchToolbarView2.b;
            plainTextEditText.performAccessibilityAction(64, null);
            tuk.m(plainTextEditText);
            if (this.F.l(8, 45764180L, false)) {
                this.u.k = true;
            }
        }
        if (!this.B || (adwgVar = this.t) == null || !adwgVar.Q) {
            i(this.x);
        }
        this.m.a(getContext().getColor(R.color.black_header_color));
        this.X = this.o.p().L(this.j).al(new ifo(this, 17), new ido(i));
        f(Boolean.valueOf(this.C.i()));
    }

    @Override // defpackage.cc
    public final void onViewCreated(View view, Bundle bundle) {
        SearchToolbarView searchToolbarView = this.u;
        if (searchToolbarView != null) {
            searchToolbarView.i = false;
        }
        t();
    }

    @Override // defpackage.hku
    public final boolean z() {
        return false;
    }
}
