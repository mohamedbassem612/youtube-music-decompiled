package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.android.apps.youtube.music.search.ui.SearchToolbarView;
import com.google.android.apps.youtube.music.ui.components.loading.LoadingFrameLayout;
import com.google.android.apps.youtube.music.ui.tabs.TabbedView;
import com.google.android.material.tabs.TabLayout;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.protobuf.ExtensionRegistryLite;
import j$.time.Duration;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class iog extends inw implements jhu, jhv, xgm, hku {
    public jhs B;
    public String C;
    public Map D;
    public TabbedView E;
    public hel F;
    public tfq H;
    public jin I;
    public hkl J;
    public vxz K;
    public vxz L;
    public vxz M;
    public vxz N;
    public jnj O;
    yvh P;
    public aeod Q;
    public vwt R;
    public kyr S;
    public axfd T;
    public xsc U;
    private avmn X;
    private jlm Y;
    private jlj Z;
    private SearchToolbarView aa;
    private LoadingFrameLayout ab;
    private adwg ac;
    private advd ad;
    private ViewGroup ae;
    private ViewTreeObserver.OnGlobalLayoutListener af;
    private ajwo ag;
    private Toolbar ah;
    private boolean ai;
    private boolean aj;
    private avmn ak;
    private avmn al;
    private View am;
    private View an;
    private RecyclerView ao;
    private RecyclerView ap;
    private inp aq;
    private ListenableFuture at;
    public ttm b;
    public tbt c;
    public jer d;
    public xgn e;
    public wto f;
    public mbc g;
    public gfp h;
    public Handler i;
    public jaz j;
    public jax k;
    public izf l;
    public xit m;
    public abvk n;
    public itj o;
    public iwe p;
    public hnl q;
    public inl r;
    public avlh s;
    public jki t;
    public avmb u;
    public ahey v;
    public vxe w;
    public jlh x;
    public hpy y;
    public avlh z;
    public static final agrf a = agrf.h("com/google/android/apps/youtube/music/search/ui/SearchResultFragment");
    private static final Duration V = Duration.ofSeconds(5);
    private static final agkj W = agkj.m("FEmusic_library_landing", hdt.MUSIC_SEARCH_LIBRARY.g, "FEmusic_offline", hdt.MUSIC_SEARCH_DOWNLOADS.g, "FEmusic_library_privately_owned_landing", hdt.MUSIC_SEARCH_UPLOAD.g, "FEmusic_library_sideloaded_tracks", hdt.MUSIC_SEARCH_SIDELOADED.g);
    public String A = "";
    private boolean ar = false;
    private boolean as = false;
    public hdt G = hdt.MUSIC_SEARCH_CATALOG;

    private final void B() {
        int iW = jnj.w(requireContext());
        View view = this.am;
        if (view != null) {
            view.setMinimumWidth(iW);
        }
        View view2 = this.an;
        if (view2 != null) {
            view2.setMinimumWidth(iW);
        }
    }

    private final void C(hel helVar) {
        aihf aihfVarCreateBuilder = aqjg.a.createBuilder();
        String str = this.C;
        agrf agrfVar = itj.a;
        aihf aihfVarCreateBuilder2 = apho.a.createBuilder();
        String strValueOf = String.valueOf(str);
        aihfVarCreateBuilder2.copyOnWrite();
        apho aphoVar = (apho) aihfVarCreateBuilder2.instance;
        aphoVar.c |= 1;
        aphoVar.d = "reload_token_".concat(strValueOf);
        apho aphoVar2 = (apho) aihfVarCreateBuilder2.build();
        aihf aihfVarCreateBuilder3 = apoq.a.createBuilder();
        aihf aihfVarCreateBuilder4 = apos.a.createBuilder();
        aihfVarCreateBuilder4.copyOnWrite();
        apos aposVar = (apos) aihfVarCreateBuilder4.instance;
        aphoVar2.getClass();
        aposVar.e = aphoVar2;
        aposVar.b |= 4;
        aihfVarCreateBuilder3.cl(aihfVarCreateBuilder4);
        apoq apoqVar = (apoq) aihfVarCreateBuilder3.build();
        aihfVarCreateBuilder.copyOnWrite();
        aqjg aqjgVar = (aqjg) aihfVarCreateBuilder.instance;
        apoqVar.getClass();
        aqjgVar.c = apoqVar;
        aqjgVar.b |= 1;
        aqjg aqjgVar2 = (aqjg) aihfVarCreateBuilder.build();
        boolean z = helVar.g == hei.c && helVar.e(hdt.MUSIC_SEARCH_SIDELOADED);
        boolean z2 = helVar.g == hei.d || this.T.au();
        if (z) {
            helVar.d(hdt.MUSIC_SEARCH_SIDELOADED, aqjgVar2);
            return;
        }
        if (z2) {
            aihf aihfVarCreateBuilder5 = aqjj.a.createBuilder();
            String str2 = hdt.MUSIC_SEARCH_SIDELOADED.g;
            aihfVarCreateBuilder5.copyOnWrite();
            aqjj aqjjVar = (aqjj) aihfVarCreateBuilder5.instance;
            str2.getClass();
            aqjjVar.b |= 1;
            aqjjVar.c = str2;
            aihfVarCreateBuilder5.copyOnWrite();
            aqjj aqjjVar2 = (aqjj) aihfVarCreateBuilder5.instance;
            aqjgVar2.getClass();
            aqjjVar2.i = aqjgVar2;
            aqjjVar2.b |= 16384;
            String string = getContext().getString(R.string.search_tab_title_sideloaded);
            aihfVarCreateBuilder5.copyOnWrite();
            aqjj aqjjVar3 = (aqjj) aihfVarCreateBuilder5.instance;
            string.getClass();
            aqjjVar3.b |= 4;
            aqjjVar3.e = string;
            helVar.b((aqjj) aihfVarCreateBuilder5.build());
        }
    }

    private static final angn D(wgc wgcVar) {
        alxi alxiVar;
        if (wgcVar != null && (alxiVar = wgcVar.a) != null) {
            alxj alxjVar = alxiVar.d;
            if (alxjVar == null) {
                alxjVar = alxj.a;
            }
            if (alxjVar.b == 58508690) {
                alxj alxjVar2 = wgcVar.a.d;
                if (alxjVar2 == null) {
                    alxjVar2 = alxj.a;
                }
                return alxjVar2.b == 58508690 ? (angn) alxjVar2.c : angn.a;
            }
        }
        return null;
    }

    private final wnf E(aftj aftjVar) {
        String str = ((aqjj) aftjVar.b).c;
        agke agkeVar = hdu.a;
        if (TextUtils.equals(str, hdt.MUSIC_SEARCH_SIDELOADED.g)) {
            return this.o;
        }
        return hdu.c(str) ? this.q : this.f;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0033  */
    private final void F(aftj aftjVar) {
        wgd wgdVar;
        if (H(aftjVar)) {
            if (H(aftjVar)) {
                aqjg aqjgVar = ((aqjj) aftjVar.b).i;
                if (aqjgVar == null) {
                    aqjgVar = aqjg.a;
                }
                anxp anxpVar = aqjgVar.f;
                if (anxpVar == null) {
                    anxpVar = anxp.a;
                }
                if ((anxpVar.b & 8) == 0 || !requireContext().getResources().getBoolean(R.bool.enable_srp_split_presentation)) {
                    aftjVar = hmy.aq(aftjVar);
                }
            } else {
                aftjVar = hmy.aq(aftjVar);
            }
        }
        wgd wgdVarH = aftjVar.h();
        if (wgdVarH != null) {
            G(aftjVar, wgdVarH);
            return;
        }
        if (I(aftjVar)) {
            aqjg aqjgVar2 = ((aqjj) aftjVar.b).i;
            if (aqjgVar2 == null) {
                aqjgVar2 = aqjg.a;
            }
            anxp anxpVar2 = aqjgVar2.f;
            if (anxpVar2 == null) {
                anxpVar2 = anxp.a;
            }
            apji apjiVar = anxpVar2.f;
            if (apjiVar == null) {
                apjiVar = apji.a;
            }
            aihl aihlVarCheckIsLite = aihn.checkIsLite(apot.a);
            apjiVar.c(aihlVarCheckIsLite);
            Object objK = apjiVar.j.k(aihlVarCheckIsLite.d);
            wgdVar = new wgd((apoq) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK)));
        } else {
            wgdVar = null;
        }
        if (wgdVar != null) {
            G(aftjVar, wgdVar);
        } else {
            ((agrc) ((agrc) a.b()).k("com/google/android/apps/youtube/music/search/ui/SearchResultFragment", "addSectionListTab", 1073, "SearchResultFragment.java")).t("Failed to retrieve SectionList from tab.");
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
    private final void G(aftj aftjVar, wgd wgdVar) {
        FrameLayout frameLayout;
        wgd wgdVar2;
        View view;
        View view2;
        FrameLayout frameLayout2;
        RecyclerView recyclerView = new RecyclerView(requireContext());
        this.ao = recyclerView;
        recyclerView.aC(new ioe(this));
        this.ao.setId(R.id.results_list);
        yvh yvhVar = this.P;
        adxd adxdVar = yvhVar != null ? (adxd) ((agkj) yvhVar.c).get(aftjVar) : null;
        FrameLayout frameLayout3 = (hfn.F(requireContext()) || !yno.H(requireContext())) ? new FrameLayout(requireContext()) : null;
        jax jaxVar = this.k;
        jaf jafVar = new jaf();
        jafVar.n(adxdVar);
        jafVar.o(this.ao);
        jafVar.p(this.Q);
        jafVar.q(this.R);
        jafVar.g(new advn());
        jafVar.j(E(aftjVar));
        jafVar.l(this.ad);
        jafVar.m(this.d.a);
        jafVar.e(this.e);
        jafVar.d(frameLayout3);
        jav javVarA = jaxVar.a(jafVar.a());
        if (H(aftjVar)) {
            frameLayout = null;
        } else {
            if (requireContext().getResources().getBoolean(R.bool.enable_srp_centered_chip_cloud)) {
                javVarA.L(new hde(4));
            }
            if (requireContext().getResources().getBoolean(R.bool.enable_srp_card_shelf_thumbnail_to_the_side)) {
                javVarA.L(new hde(5));
            }
            if (requireContext().getResources().getBoolean(R.bool.enable_srp_6col_list) && hfn.F(requireContext())) {
                int iO = (o() * 3) + jnj.x(requireContext());
                frameLayout2 = new FrameLayout(requireContext());
                frameLayout2.setPadding(iO, 0, iO, 0);
                frameLayout2.addView(this.ao);
            } else {
                javVarA.L(new gob(requireContext(), 8));
                frameLayout = null;
            }
        }
        if (adxdVar == null) {
            frameLayout = frameLayout2;
            javVarA.at(wgdVar);
        } else if (this.ao.n != null) {
            yvh yvhVar2 = this.P;
            Parcelable parcelable = yvhVar2 != null ? (Parcelable) ((agkj) yvhVar2.b).get(aftjVar) : null;
            if (parcelable != null) {
                frameLayout = frameLayout2;
                frameLayout = frameLayout2;
                this.ao.n.onRestoreInstanceState(parcelable);
            }
        }
        frameLayout = frameLayout2;
        frameLayout = frameLayout2;
        frameLayout = frameLayout2;
        if (!H(aftjVar)) {
            jhs jhsVar = this.B;
            if (jhsVar == null) {
                view2 = frameLayout;
                return;
            }
            if (frameLayout == null) {
                view2 = this.ao;
            }
            jhsVar.o(aftjVar, frameLayout3, view2, javVarA);
            return;
        }
        aqjg aqjgVar = ((aqjj) aftjVar.b).i;
        if (aqjgVar == null) {
            aqjgVar = aqjg.a;
        }
        anxp anxpVar = aqjgVar.f;
        if (anxpVar == null) {
            anxpVar = anxp.a;
        }
        jfc jfcVar = (jfc) adul.e(this.d.a, anxpVar, null);
        if (jfcVar != null && (view = jfcVar.c) != null) {
            view.setVisibility(0);
        }
        adly adlyVar = new adly();
        adlyVar.f("chipCloudPagePadding", Integer.valueOf(jnj.w(requireContext())));
        Boolean bool = Boolean.TRUE;
        adlyVar.f("chipCloudCentered", bool);
        adlyVar.a(this.e);
        adlyVar.f("musicCardShelfLayout", gzk.c);
        adlyVar.f("musicCardShelfPresentHeaderAndDivider", bool);
        if (jfcVar != null) {
            jfcVar.hU(adlyVar, anxpVar);
            RecyclerView recyclerView2 = this.ao;
            ViewGroup viewGroup = jfcVar.b;
            viewGroup.addView(recyclerView2);
            viewGroup.setVisibility(0);
            if (J(aftjVar)) {
                aqjg aqjgVar2 = ((aqjj) aftjVar.b).i;
                if (aqjgVar2 == null) {
                    aqjgVar2 = aqjg.a;
                }
                anxp anxpVar2 = aqjgVar2.f;
                if (anxpVar2 == null) {
                    anxpVar2 = anxp.a;
                }
                apji apjiVar = anxpVar2.g;
                if (apjiVar == null) {
                    apjiVar = apji.a;
                }
                aihl aihlVarCheckIsLite = aihn.checkIsLite(apot.a);
                apjiVar.c(aihlVarCheckIsLite);
                Object objK = apjiVar.j.k(aihlVarCheckIsLite.d);
                wgdVar2 = new wgd((apoq) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK)));
            } else {
                wgdVar2 = null;
            }
            if (wgdVar2 != null) {
                wnf wnfVarE = E(aftjVar);
                this.ap = new RecyclerView(requireContext());
                jax jaxVar2 = this.k;
                jaf jafVar2 = new jaf();
                jafVar2.o(this.ap);
                jafVar2.p(this.Q);
                jafVar2.q(this.R);
                jafVar2.j(wnfVarE);
                jafVar2.l(this.ad);
                jafVar2.m(this.d.a);
                jafVar2.e(this.e);
                jav javVarA2 = jaxVar2.a(jafVar2.a());
                this.ac = javVarA2;
                javVarA2.as(wgdVar2);
                RecyclerView recyclerView3 = this.ap;
                ViewGroup viewGroup2 = jfcVar.a;
                viewGroup2.addView(recyclerView3);
                viewGroup2.setVisibility(0);
            }
        }
        jhs jhsVar2 = this.B;
        if (jhsVar2 == null || jfcVar == null) {
            return;
        }
        jhsVar2.o(aftjVar, null, jfcVar.a(), javVarA);
    }

    private static boolean H(aftj aftjVar) {
        aqjg aqjgVar = ((aqjj) aftjVar.b).i;
        if (aqjgVar == null) {
            aqjgVar = aqjg.a;
        }
        return (aqjgVar.b & 8388608) != 0;
    }

    private static boolean I(aftj aftjVar) {
        if (H(aftjVar)) {
            aqjg aqjgVar = ((aqjj) aftjVar.b).i;
            if (aqjgVar == null) {
                aqjgVar = aqjg.a;
            }
            anxp anxpVar = aqjgVar.f;
            if (anxpVar == null) {
                anxpVar = anxp.a;
            }
            if ((anxpVar.b & 16) != 0) {
                aqjg aqjgVar2 = ((aqjj) aftjVar.b).i;
                if (aqjgVar2 == null) {
                    aqjgVar2 = aqjg.a;
                }
                anxp anxpVar2 = aqjgVar2.f;
                if (anxpVar2 == null) {
                    anxpVar2 = anxp.a;
                }
                apji apjiVar = anxpVar2.f;
                if (apjiVar == null) {
                    apjiVar = apji.a;
                }
                aihl aihlVarCheckIsLite = aihn.checkIsLite(apot.a);
                apjiVar.c(aihlVarCheckIsLite);
                if (apjiVar.j.n(aihlVarCheckIsLite.d)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean J(aftj aftjVar) {
        if (H(aftjVar)) {
            aqjg aqjgVar = ((aqjj) aftjVar.b).i;
            if (aqjgVar == null) {
                aqjgVar = aqjg.a;
            }
            anxp anxpVar = aqjgVar.f;
            if (anxpVar == null) {
                anxpVar = anxp.a;
            }
            if ((anxpVar.b & 32) != 0) {
                aqjg aqjgVar2 = ((aqjj) aftjVar.b).i;
                if (aqjgVar2 == null) {
                    aqjgVar2 = aqjg.a;
                }
                anxp anxpVar2 = aqjgVar2.f;
                if (anxpVar2 == null) {
                    anxpVar2 = anxp.a;
                }
                apji apjiVar = anxpVar2.g;
                if (apjiVar == null) {
                    apjiVar = apji.a;
                }
                aihl aihlVarCheckIsLite = aihn.checkIsLite(apot.a);
                apjiVar.c(aihlVarCheckIsLite);
                if (apjiVar.j.n(aihlVarCheckIsLite.d)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final String m(apng apngVar) {
        String str = apngVar.c;
        String str2 = apngVar.e;
        alxq alxqVarA = alxq.a(apngVar.i);
        if (alxqVarA == null) {
            alxqVarA = alxq.MUSIC_SEARCH_REQUEST_TYPE_UNSPECIFIED;
        }
        return str + "::" + str2 + "::" + alxqVarA.h;
    }

    private final int n() {
        return requireContext().getResources().getDisplayMetrics().widthPixels;
    }

    private final int o() {
        return (n() - (jnj.w(requireContext()) << 1)) / 12;
    }

    private final View p(ViewGroup viewGroup, angn angnVar) {
        adma admaVarE = adul.e(this.d.a, angnVar, viewGroup);
        if (admaVarE == null) {
            return new View(requireContext());
        }
        adly adlyVar = new adly();
        adlyVar.f("messageRendererHideDivider", Boolean.TRUE);
        adlyVar.a(this.e);
        admaVarE.hU(adlyVar, angnVar);
        View viewA = admaVarE.a();
        if (viewA == null) {
            return new View(requireContext());
        }
        if (viewA.getParent() instanceof ViewGroup) {
            ((ViewGroup) viewA.getParent()).removeView(viewA);
        }
        FrameLayout frameLayout = new FrameLayout(requireContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.addView(viewA, new FrameLayout.LayoutParams(-1, -2, 17));
        frameLayout.setPadding(0, 0, 0, requireContext().getResources().getDimensionPixelSize(R.dimen.mini_player_height));
        ScrollView scrollView = new ScrollView(requireContext());
        scrollView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        scrollView.setFillViewport(true);
        scrollView.addView(frameLayout);
        return scrollView;
    }

    private final void q() {
        this.e.b(xhb.a(4724), this.aj ? this.F.f : null, null);
        if (this.L.l(0, 45712947L, false)) {
            this.J.c(this.e);
        }
    }

    private final void r(String str) {
        if (this.m.r(48)) {
            this.m.u(str, 48);
        }
    }

    private final void s() {
        if (this.T.au()) {
            this.F.k(hei.c);
            this.F.i = null;
        }
        u(this.F);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v34, types: [java.lang.Object, java.util.List] */
    private final void t(hel helVar) {
        ViewGroup viewGroup;
        SearchToolbarView searchToolbarView = this.aa;
        if (searchToolbarView != null) {
            searchToolbarView.b.setText(this.C);
        }
        yvh yvhVar = this.P;
        if (yvhVar != null) {
            y(yvhVar.d);
        } else if (D((wgc) helVar.h) != null) {
            angn angnVarD = D((wgc) helVar.h);
            if (angnVarD != null && (viewGroup = this.ae) != null) {
                this.ae.addView(p(viewGroup, angnVarD));
                this.ae.setVisibility(0);
            }
        } else {
            this.e.d(new xgj(((wgc) helVar.h).d()));
            wgc wgcVar = (wgc) helVar.h;
            if (wgcVar.b == null) {
                wgcVar.b = new ArrayList();
                alxj alxjVar = wgcVar.a.d;
                if (alxjVar == null) {
                    alxjVar = alxj.a;
                }
                for (alxm alxmVar : (alxjVar.b == 60498879 ? (alxo) alxjVar.c : alxo.a).b) {
                    int i = alxmVar.b;
                    if (i == 58174010) {
                        wgcVar.b.add(new aftj(i == 58174010 ? (aqjj) alxmVar.c : aqjj.a));
                    }
                }
            }
            List list = wgcVar.b;
            if (list.isEmpty()) {
                aihf aihfVarCreateBuilder = aqjj.a.createBuilder();
                aihf aihfVarCreateBuilder2 = aqjg.a.createBuilder();
                alxj alxjVar2 = ((wgc) helVar.h).a.d;
                if (alxjVar2 == null) {
                    alxjVar2 = alxj.a;
                }
                apoq apoqVar = alxjVar2.b == 49399797 ? (apoq) alxjVar2.c : apoq.a;
                aihfVarCreateBuilder2.copyOnWrite();
                aqjg aqjgVar = (aqjg) aihfVarCreateBuilder2.instance;
                apoqVar.getClass();
                aqjgVar.c = apoqVar;
                aqjgVar.b |= 1;
                aqjg aqjgVar2 = (aqjg) aihfVarCreateBuilder2.build();
                aihfVarCreateBuilder.copyOnWrite();
                aqjj aqjjVar = (aqjj) aihfVarCreateBuilder.instance;
                aqjgVar2.getClass();
                aqjjVar.i = aqjgVar2;
                aqjjVar.b |= 16384;
                y(agke.q(new aftj((aqjj) aihfVarCreateBuilder.build())));
            } else {
                y(list);
            }
            this.i.postAtFrontOfQueue(new hgx(this, 20));
        }
        if (this.af != null) {
            TabbedView tabbedView = this.E;
            if (tabbedView != null) {
                tabbedView.getViewTreeObserver().removeOnGlobalLayoutListener(this.af);
            }
            this.af = null;
        }
        this.af = new jg(this, 8);
        TabbedView tabbedView2 = this.E;
        if (tabbedView2 != null) {
            tabbedView2.getViewTreeObserver().addOnGlobalLayoutListener(this.af);
        }
        LoadingFrameLayout loadingFrameLayout = this.ab;
        if (loadingFrameLayout != null) {
            loadingFrameLayout.h(3);
        }
    }

    private final void u(hel helVar) {
        String str;
        this.F = helVar;
        if (getActivity() == null || kro.M(this)) {
            return;
        }
        int iOrdinal = helVar.g.ordinal();
        int i = 3;
        if (iOrdinal == 0 || iOrdinal == 1) {
            jhs jhsVar = this.B;
            if (jhsVar != null) {
                jhsVar.f();
            }
            ViewGroup viewGroup = this.ae;
            if (viewGroup != null) {
                viewGroup.removeAllViews();
                this.ae.setVisibility(8);
            }
            LoadingFrameLayout loadingFrameLayout = this.ab;
            if (loadingFrameLayout != null) {
                loadingFrameLayout.h(2);
            }
            SearchToolbarView searchToolbarView = this.aa;
            if (searchToolbarView != null) {
                searchToolbarView.b.setText(this.C);
            }
            if (this.as) {
                ListenableFuture listenableFuture = this.at;
                if (listenableFuture != null) {
                    listenableFuture.cancel(false);
                }
                ListenableFuture listenableFutureP = ahng.p(new inq(2), V.toSeconds(), TimeUnit.SECONDS, this.v);
                this.at = listenableFutureP;
                taf.l(this, listenableFutureP, new igt(4), new iny(this, i));
                return;
            }
            return;
        }
        if (iOrdinal == 2) {
            w();
            t(helVar);
            return;
        }
        if (iOrdinal == 3) {
            w();
            if (this.ar || this.as) {
                t(helVar);
            } else {
                if (TextUtils.isEmpty(helVar.i)) {
                    Resources resources = getActivity().getResources();
                    ajwo ajwoVar = helVar.f;
                    aihl aihlVarCheckIsLite = aihn.checkIsLite(apni.a);
                    ajwoVar.c(aihlVarCheckIsLite);
                    Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
                    helVar.i = resources.getString(R.string.search_failed, ((apng) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK))).c);
                }
                LoadingFrameLayout loadingFrameLayout2 = this.ab;
                if (loadingFrameLayout2 != null && (str = helVar.i) != null) {
                    loadingFrameLayout2.f(str, true, false, false);
                }
            }
            this.c.c(new haj());
        }
    }

    private final void v(hel helVar) {
        this.F = helVar;
        if (helVar.g != hei.e) {
            if (this.as) {
                aihf aihfVarCreateBuilder = aqjg.a.createBuilder();
                String str = this.C;
                agrf agrfVar = hnl.a;
                aihf aihfVarCreateBuilder2 = apho.a.createBuilder();
                String strValueOf = String.valueOf(str);
                aihfVarCreateBuilder2.copyOnWrite();
                apho aphoVar = (apho) aihfVarCreateBuilder2.instance;
                aphoVar.c |= 1;
                aphoVar.d = "reload_token_".concat(strValueOf);
                apho aphoVar2 = (apho) aihfVarCreateBuilder2.build();
                aihf aihfVarCreateBuilder3 = apoq.a.createBuilder();
                aihf aihfVarCreateBuilder4 = apos.a.createBuilder();
                aihfVarCreateBuilder4.copyOnWrite();
                apos aposVar = (apos) aihfVarCreateBuilder4.instance;
                aphoVar2.getClass();
                aposVar.e = aphoVar2;
                aposVar.b |= 4;
                aihfVarCreateBuilder3.cl(aihfVarCreateBuilder4);
                apoq apoqVar = (apoq) aihfVarCreateBuilder3.build();
                aihfVarCreateBuilder.copyOnWrite();
                aqjg aqjgVar = (aqjg) aihfVarCreateBuilder.instance;
                apoqVar.getClass();
                aqjgVar.c = apoqVar;
                aqjgVar.b |= 1;
                aqjg aqjgVar2 = (aqjg) aihfVarCreateBuilder.build();
                boolean z = false;
                if (helVar.g == hei.c && helVar.e(hdt.MUSIC_SEARCH_DOWNLOADS)) {
                    z = true;
                }
                hei heiVar = helVar.g;
                hei heiVar2 = hei.d;
                if (z) {
                    helVar.d(hdt.MUSIC_SEARCH_DOWNLOADS, aqjgVar2);
                } else if (heiVar == heiVar2) {
                    aihf aihfVarCreateBuilder5 = aqjj.a.createBuilder();
                    String str2 = hdt.MUSIC_SEARCH_DOWNLOADS.g;
                    aihfVarCreateBuilder5.copyOnWrite();
                    aqjj aqjjVar = (aqjj) aihfVarCreateBuilder5.instance;
                    str2.getClass();
                    aqjjVar.b |= 1;
                    aqjjVar.c = str2;
                    aihfVarCreateBuilder5.copyOnWrite();
                    aqjj aqjjVar2 = (aqjj) aihfVarCreateBuilder5.instance;
                    aqjgVar2.getClass();
                    aqjjVar2.i = aqjgVar2;
                    aqjjVar2.b |= 16384;
                    String string = getContext().getString(R.string.search_tab_title_downloads);
                    aihfVarCreateBuilder5.copyOnWrite();
                    aqjj aqjjVar3 = (aqjj) aihfVarCreateBuilder5.instance;
                    string.getClass();
                    aqjjVar3.b |= 4;
                    aqjjVar3.e = string;
                    helVar.b((aqjj) aihfVarCreateBuilder5.build());
                }
            }
            if (this.ar) {
                C(helVar);
            }
        }
        s();
    }

    private final void w() {
        ListenableFuture listenableFuture = this.at;
        if (listenableFuture != null) {
            listenableFuture.cancel(false);
        }
        this.I.b();
    }

    private final void x() {
        SearchToolbarView searchToolbarView;
        if (!this.L.l(0, 45712947L, false) || (searchToolbarView = this.aa) == null) {
            return;
        }
        searchToolbarView.setPaddingRelative(searchToolbarView.getPaddingStart(), this.aa.getPaddingTop(), jnj.w(requireContext()), this.aa.getPaddingBottom());
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0097  */
    private final void y(List list) {
        TabbedView tabbedView;
        jhs jhsVar = this.B;
        if (jhsVar != null) {
            jhsVar.f();
        }
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            aftj aftjVar = (aftj) list.get(i2);
            if (aftjVar.h() != null || I(aftjVar)) {
                F(aftjVar);
            } else if (J(aftjVar)) {
                F(hmy.aq(aftjVar));
            } else {
                Object obj = aftjVar.b;
                if (obj != null) {
                    aqjg aqjgVar = ((aqjj) obj).i;
                    if (aqjgVar == null) {
                        aqjgVar = aqjg.a;
                    }
                    if ((aqjgVar.b & SemanticState.ReadOnly) != 0) {
                        aqjg aqjgVar2 = ((aqjj) aftjVar.b).i;
                        if (aqjgVar2 == null) {
                            aqjgVar2 = aqjg.a;
                        }
                        angn angnVar = aqjgVar2.d;
                        if (angnVar == null) {
                            angnVar = angn.a;
                        }
                        View viewP = p(null, angnVar);
                        jhs jhsVar2 = this.B;
                        if (jhsVar2 != null) {
                            jhsVar2.o(aftjVar, null, viewP, null);
                        }
                    }
                }
            }
            if (this.L.l(1, 45715026L, false)) {
                String str = (String) W.get(this.A);
                if (str != null && str.equals(((aqjj) aftjVar.b).c)) {
                    i = i2;
                }
            } else if (this.G.g.equals(((aqjj) aftjVar.b).c)) {
                i = i2;
            }
        }
        jhs jhsVar3 = this.B;
        if (jhsVar3 != null) {
            yvh yvhVar = this.P;
            if (yvhVar != null) {
                jhsVar3.m(yvhVar.a);
            } else {
                jhsVar3.m(i);
            }
        }
        this.P = null;
        if (this.K.l(204, 45733885L, false) || (tabbedView = this.E) == null) {
            return;
        }
        TabLayout tabLayout = tabbedView.b;
        int iW = (!requireContext().getResources().getBoolean(R.bool.enable_srp_3col_tab_labels) || tabLayout.b() > 4) ? jnj.w(requireContext()) : (n() - (tabLayout.b() * (o() * 3))) / 2;
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) tabLayout.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.leftMargin = iW;
            layoutParams.rightMargin = iW;
        }
        this.E.requestLayout();
    }

    @Override // defpackage.hku
    public final boolean A() {
        return true;
    }

    @Override // defpackage.jhu
    public final void a(int i, boolean z) {
        jhs jhsVar;
        if (kro.M(this)) {
            return;
        }
        if (!z && (jhsVar = this.B) != null) {
            String str = ((aqjj) ((aftj) jhsVar.e().get(i)).b).c;
            hdt hdtVar = hdt.MUSIC_SEARCH_CATALOG;
            hdt hdtVar2 = (hdt) hdt.f.getOrDefault(str, hdtVar);
            if (hdtVar2 != null) {
                hdtVar = hdtVar2;
            }
            this.G = hdtVar;
            if (hdu.c(str) && this.al == null) {
                hpy hpyVar = this.y;
                hpt hptVarA = hpu.a();
                hptVarA.f(true);
                hptVarA.c(true);
                hptVarA.b(true);
                this.al = avlr.L(agke.u(gzj.as(hpyVar, hptVarA.a()).B(new hxe(15)), gzj.aq(hpyVar, Optional.of(anuk.class)).B(new hxe(17)), gzj.aq(hpyVar, Optional.of(anjx.class)).B(new hxe(16)), gzj.ar(hpyVar, anuc.class), gzj.ar(hpyVar, anjq.class))).O(this.u).ag(new ifo(this, 20), new ido(10));
            }
        }
        jhs jhsVar2 = this.B;
        if (jhsVar2 == null || this.E == null) {
            return;
        }
        boolean zH = H((aftj) jhsVar2.e().get(i));
        TabbedView tabbedView = this.E;
        if (zH) {
            tabbedView.o();
        } else {
            tabbedView.h = false;
            tabbedView.c.setVisibility(0);
        }
    }

    public final void e(hel helVar) {
        if (helVar == null || !fhz.aj(helVar.f)) {
            return;
        }
        ajwo ajwoVar = helVar.f;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(apni.a);
        ajwoVar.c(aihlVarCheckIsLite);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
        this.C = ((apng) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK))).c;
        if (!this.H.i() && this.as) {
            hdt hdtVar = hdt.MUSIC_SEARCH_DOWNLOADS;
            helVar.c(hdtVar);
            this.G = hdtVar;
            h(helVar, new IOException(getContext().getString(R.string.common_error_network)));
            return;
        }
        this.P = null;
        hei heiVar = helVar.g;
        hei heiVar2 = hei.b;
        if (heiVar != heiVar2) {
            helVar.k(heiVar2);
            u(helVar);
            if (this.T.au()) {
                C(helVar);
                s();
                return;
            }
            wtm wtmVarH = this.f.h();
            ajwo ajwoVar2 = this.F.f;
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(apni.a);
            ajwoVar2.c(aihlVarCheckIsLite2);
            Object objK2 = ajwoVar2.j.k(aihlVarCheckIsLite2.d);
            apng apngVar = (apng) (objK2 == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK2));
            wtmVarH.a = wtm.j(apngVar.c);
            wtmVarH.b = wtm.j(apngVar.e);
            wtmVarH.D = !apngVar.h.isEmpty();
            aihl aihlVarCheckIsLite3 = aihn.checkIsLite(apnd.c);
            apngVar.c(aihlVarCheckIsLite3);
            Object objK3 = apngVar.j.k(aihlVarCheckIsLite3.d);
            String str = (String) (objK3 == null ? aihlVarCheckIsLite3.b : aihlVarCheckIsLite3.c(objK3));
            if (!wtm.j(str).isEmpty()) {
                wtmVarH.e = str;
            }
            if (this.F.f.c.E()) {
                wtmVarH.m();
            } else {
                wtmVarH.n(this.F.f.c);
            }
            byte[] bArr = this.F.a;
            if (bArr != null) {
                try {
                    wtmVarH.c = (alxu) aihn.parseFrom(alxu.a, bArr, ExtensionRegistryLite.getGeneratedRegistry());
                } catch (aiik e) {
                    ((agrc) ((agrc) ((agrc) a.b()).j(e)).k("com/google/android/apps/youtube/music/search/ui/SearchResultFragment", "executeInnerTubeSearch", (char) 712, "SearchResultFragment.java")).t("Could not parse searchbox stats");
                }
            }
            if (this.L.l(1, 45715026L, false)) {
                alxq alxqVarA = alxq.a(apngVar.i);
                if (alxqVarA == null) {
                    alxqVarA = alxq.MUSIC_SEARCH_REQUEST_TYPE_UNSPECIFIED;
                }
                if (alxqVarA != alxq.MUSIC_SEARCH_REQUEST_TYPE_UNSPECIFIED) {
                    wtmVarH.E = alxqVarA;
                } else {
                    hel helVar2 = this.F;
                    if (helVar2 != null) {
                        wtmVarH.E = helVar2.c.equals("FEmusic_library_landing") ? alxq.MUSIC_SEARCH_REQUEST_TYPE_LIBRARY : alxq.MUSIC_SEARCH_REQUEST_TYPE_CATALOG;
                    }
                }
            }
            r("sr_s");
            ajwo ajwoVar3 = this.F.f;
            aihl aihlVarCheckIsLite4 = aihn.checkIsLite(apni.a);
            ajwoVar3.c(aihlVarCheckIsLite4);
            Object objK4 = ajwoVar3.j.k(aihlVarCheckIsLite4.d);
            wgc wgcVar = (wgc) this.D.get(m((apng) (objK4 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK4))));
            if (wgcVar != null) {
                i(this.F, wgcVar);
            } else {
                wto wtoVar = this.f;
                wtoVar.d.j(wtmVarH, new iof(this, this.F), wtoVar.g());
                this.c.c(new han());
            }
            Map map = this.F.m;
            if (map == null || !map.containsKey("remove_previous_fragment_from_back_stack")) {
                return;
            }
            this.t.g((cc) this.F.m.get("remove_previous_fragment_from_back_stack"));
        }
    }

    public final void f(Boolean bool) {
        SearchToolbarView searchToolbarView = this.aa;
        if (searchToolbarView != null) {
            searchToolbarView.d.setEnabled(bool.booleanValue());
        }
    }

    @Override // defpackage.hku
    public final Optional gS() {
        Optional optionalOfNullable = Optional.ofNullable(this.F);
        return true == optionalOfNullable.isPresent() ? Optional.ofNullable(((hel) optionalOfNullable.get()).f) : optionalOfNullable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, ttm] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    public final void h(hel helVar, Throwable th) {
        r("sr_r");
        if (helVar.g != hei.e) {
            helVar.k(hei.d);
            if (this.ar || this.as) {
                kyr kyrVar = this.S;
                ajwo ajwoVarU = fhz.U(ahno.Z(this.C));
                twp twpVarA = kyrVar.b.a(th);
                ?? r2 = twpVarA.b;
                boolean zIsEmpty = TextUtils.isEmpty(r2);
                ?? string = r2;
                if (zIsEmpty) {
                    String strAf = fhz.af(ajwoVarU);
                    if (TextUtils.isEmpty(strAf)) {
                        string = ((Context) kyrVar.a).getString(R.string.common_error_generic);
                    } else {
                        string = ((Context) kyrVar.a).getString(R.string.search_failed, strAf);
                    }
                }
                aliz alizVar = twpVarA.a == 1 ? aliz.OFFLINE_CLOUD : aliz.ERROR_BLACK;
                aihh aihhVar = (aihh) ajnf.a.createBuilder();
                alay alayVarC = ackj.c(((Context) kyrVar.a).getString(R.string.yt_lib_common_retry));
                aihhVar.copyOnWrite();
                ajnf ajnfVar = (ajnf) aihhVar.instance;
                alayVarC.getClass();
                ajnfVar.m = alayVarC;
                ajnfVar.b |= 64;
                aihhVar.copyOnWrite();
                ajnf ajnfVar2 = (ajnf) aihhVar.instance;
                ajnfVar2.d = 7;
                ajnfVar2.c = 1;
                aihhVar.copyOnWrite();
                ajnf ajnfVar3 = (ajnf) aihhVar.instance;
                ajwoVarU.getClass();
                ajnfVar3.s = ajwoVarU;
                ajnfVar3.b |= SemanticState.Multiline;
                ajnf ajnfVar4 = (ajnf) aihhVar.build();
                aihf aihfVarCreateBuilder = angn.a.createBuilder();
                aihh aihhVar2 = (aihh) alay.a.createBuilder();
                aihh aihhVar3 = (aihh) alba.a.createBuilder();
                aihhVar3.copyOnWrite();
                alba albaVar = (alba) aihhVar3.instance;
                string.getClass();
                albaVar.b |= 1;
                albaVar.c = (String) string;
                aihhVar3.copyOnWrite();
                alba albaVar2 = (alba) aihhVar3.instance;
                albaVar2.k = 2;
                albaVar2.b |= SemanticState.ReadOnly;
                aihhVar2.v(aihhVar3);
                aihfVarCreateBuilder.copyOnWrite();
                angn angnVar = (angn) aihfVarCreateBuilder.instance;
                alay alayVar = (alay) aihhVar2.build();
                alayVar.getClass();
                angnVar.e = alayVar;
                angnVar.b |= 1;
                aihf aihfVarCreateBuilder2 = angt.a.createBuilder();
                aihfVarCreateBuilder2.copyOnWrite();
                angt angtVar = (angt) aihfVarCreateBuilder2.instance;
                angtVar.c = alizVar.yN;
                angtVar.b |= 1;
                aihfVarCreateBuilder.copyOnWrite();
                angn angnVar2 = (angn) aihfVarCreateBuilder.instance;
                angt angtVar2 = (angt) aihfVarCreateBuilder2.build();
                angtVar2.getClass();
                angnVar2.d = angtVar2;
                angnVar2.c = 2;
                aihf aihfVarCreateBuilder3 = ajng.a.createBuilder();
                aihfVarCreateBuilder3.copyOnWrite();
                ajng ajngVar = (ajng) aihfVarCreateBuilder3.instance;
                ajnfVar4.getClass();
                ajngVar.c = ajnfVar4;
                ajngVar.b |= 1;
                aihfVarCreateBuilder.copyOnWrite();
                angn angnVar3 = (angn) aihfVarCreateBuilder.instance;
                ajng ajngVar2 = (ajng) aihfVarCreateBuilder3.build();
                ajngVar2.getClass();
                angnVar3.h = ajngVar2;
                angnVar3.b |= 16;
                angn angnVar4 = (angn) aihfVarCreateBuilder.build();
                kyr kyrVar2 = this.S;
                hdt hdtVar = hdt.MUSIC_SEARCH_CATALOG;
                ajwo ajwoVar = helVar.f;
                aihf aihfVarCreateBuilder4 = aqjg.a.createBuilder();
                aihfVarCreateBuilder4.copyOnWrite();
                aqjg aqjgVar = (aqjg) aihfVarCreateBuilder4.instance;
                angnVar4.getClass();
                aqjgVar.d = angnVar4;
                aqjgVar.b |= SemanticState.ReadOnly;
                aqjg aqjgVar2 = (aqjg) aihfVarCreateBuilder4.build();
                aihf aihfVarCreateBuilder5 = aqjj.a.createBuilder();
                String str = hdtVar.g;
                aihfVarCreateBuilder5.copyOnWrite();
                aqjj aqjjVar = (aqjj) aihfVarCreateBuilder5.instance;
                str.getClass();
                aqjjVar.b |= 1;
                aqjjVar.c = str;
                if (hdtVar.ordinal() != 2) {
                    String string2 = ((Context) kyrVar2.a).getString(R.string.search_tab_title_catalog);
                    aihfVarCreateBuilder5.copyOnWrite();
                    aqjj aqjjVar2 = (aqjj) aihfVarCreateBuilder5.instance;
                    string2.getClass();
                    aqjjVar2.b |= 4;
                    aqjjVar2.e = string2;
                } else {
                    String string3 = ((Context) kyrVar2.a).getString(R.string.library_device_files_songs_shelf_title);
                    aihfVarCreateBuilder5.copyOnWrite();
                    aqjj aqjjVar3 = (aqjj) aihfVarCreateBuilder5.instance;
                    string3.getClass();
                    aqjjVar3.b |= 4;
                    aqjjVar3.e = string3;
                }
                if (ajwoVar != null) {
                    aihfVarCreateBuilder5.copyOnWrite();
                    aqjj aqjjVar4 = (aqjj) aihfVarCreateBuilder5.instance;
                    aqjjVar4.d = ajwoVar;
                    aqjjVar4.b |= 2;
                }
                if (aqjgVar2 != null) {
                    aihfVarCreateBuilder5.copyOnWrite();
                    aqjj aqjjVar5 = (aqjj) aihfVarCreateBuilder5.instance;
                    aqjjVar5.i = aqjgVar2;
                    aqjjVar5.b |= 16384;
                }
                helVar.b((aqjj) aihfVarCreateBuilder5.build());
            } else {
                helVar.i = this.b.b(th);
            }
            this.c.c(new haj());
            v(helVar);
        }
    }

    @Override // defpackage.xgm
    public final xgn hB() {
        return this.e;
    }

    public final void i(hel helVar, wgc wgcVar) {
        if (helVar.g != hei.e) {
            r("sr_r");
            helVar.k(hei.c);
            helVar.h = wgcVar;
            helVar.i = null;
            this.c.c(new hao());
            v(helVar);
        }
    }

    public final void j(hel helVar) {
        this.G = helVar.b;
        hel helVar2 = this.F;
        if (helVar2 == null) {
            this.ag = helVar.f;
        }
        if (this.ah == null) {
            this.ai = helVar.l(2);
        }
        if (helVar2 != null) {
            if (helVar2 != helVar) {
                this.aj = true;
            }
            if (TextUtils.equals(helVar2.a(helVar).c, helVar2.a(helVar2).c) && TextUtils.equals(helVar2.a(helVar).e, helVar2.a(helVar2).e)) {
                alxq alxqVarA = alxq.a(helVar2.a(helVar).i);
                if (alxqVarA == null) {
                    alxqVarA = alxq.MUSIC_SEARCH_REQUEST_TYPE_UNSPECIFIED;
                }
                alxq alxqVarA2 = alxq.a(helVar2.a(helVar2).i);
                if (alxqVarA2 == null) {
                    alxqVarA2 = alxq.MUSIC_SEARCH_REQUEST_TYPE_UNSPECIFIED;
                }
                if (Objects.equals(alxqVarA, alxqVarA2) && this.F.g != hei.d) {
                    return;
                }
            }
            hel helVar3 = this.F;
            if (!TextUtils.equals(helVar3.a(helVar).c, helVar3.a(helVar3).c)) {
                this.D.clear();
            }
        }
        hel helVar4 = this.F;
        if (helVar4 != null && helVar4.g != hei.c) {
            helVar4.k(hei.e);
        }
        this.F = helVar;
        if (getActivity() != null) {
            q();
            e(helVar);
        }
    }

    public final void k(String str) {
        aihh aihhVar = (aihh) fhz.V(str, this.e.i(), 4724).toBuilder();
        ajwo ajwoVar = this.ag;
        if (ajwoVar != null) {
            aigj aigjVar = ajwoVar.c;
            aihhVar.copyOnWrite();
            ajwo ajwoVar2 = (ajwo) aihhVar.instance;
            aigjVar.getClass();
            ajwoVar2.b |= 1;
            ajwoVar2.c = aigjVar;
            ajwo ajwoVar3 = this.ag;
            aihl aihlVarCheckIsLite = aihn.checkIsLite(apni.a);
            ajwoVar3.c(aihlVarCheckIsLite);
            Object objK = ajwoVar3.j.k(aihlVarCheckIsLite.d);
            String str2 = ((apng) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK))).e;
            ajwo ajwoVar4 = this.ag;
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(apni.a);
            ajwoVar4.c(aihlVarCheckIsLite2);
            Object objK2 = ajwoVar4.j.k(aihlVarCheckIsLite2.d);
            String str3 = ((apng) (objK2 == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK2))).f;
            aihl aihlVar = apni.a;
            aihh aihhVar2 = (aihh) ((apng) aihhVar.b(aihlVar)).toBuilder();
            aihhVar2.copyOnWrite();
            apng apngVar = (apng) aihhVar2.instance;
            str2.getClass();
            apngVar.b |= 8;
            apngVar.e = str2;
            aihhVar2.copyOnWrite();
            apng apngVar2 = (apng) aihhVar2.instance;
            str3.getClass();
            apngVar2.b |= 16;
            apngVar2.f = str3;
            ajwo ajwoVar5 = this.ag;
            aihl aihlVarCheckIsLite3 = aihn.checkIsLite(apni.a);
            ajwoVar5.c(aihlVarCheckIsLite3);
            Object objK3 = ajwoVar5.j.k(aihlVarCheckIsLite3.d);
            alxr alxrVarA = alxr.a(((apng) (objK3 == null ? aihlVarCheckIsLite3.b : aihlVarCheckIsLite3.c(objK3))).d);
            if (alxrVarA == null) {
                alxrVarA = alxr.SEARCH_PAGE_TYPE_UNKNOWN;
            }
            aihhVar2.copyOnWrite();
            apng apngVar3 = (apng) aihhVar2.instance;
            apngVar3.d = alxrVarA.i;
            apngVar3.b |= 2;
            aihhVar.e(aihlVar, (apng) aihhVar2.build());
        }
        gfp gfpVar = this.h;
        ajwo ajwoVar6 = (ajwo) aihhVar.build();
        if (ajwoVar6 == null) {
            throw new NullPointerException("Null command");
        }
        boolean z = this.ai;
        String str4 = this.G.g;
        if (str4 == null) {
            throw new NullPointerException("Null defaultSearchTab");
        }
        gfpVar.p(new ins(ajwoVar6, z, str4));
    }

    public final byte[] l() {
        inp inpVar = this.aq;
        inpVar.h = 16;
        inpVar.a(alxs.SPEECH);
        inp inpVar2 = this.aq;
        inpVar2.f = false;
        aejh aejhVarA = aeji.a();
        aejhVarA.c();
        aejhVarA.a = "";
        aejhVarA.b(-1);
        aejhVarA.d(inpVar2.d);
        aejhVarA.f(inpVar2.e);
        aejhVarA.i((int) (inpVar2.a.b() - inpVar2.c));
        aejhVarA.j(inpVar2.f);
        aejhVarA.h();
        aejhVarA.k(inpVar2.h);
        aejhVarA.e(agkz.n(inpVar2.g));
        return aejhVarA.a().b().toByteArray();
    }

    @Override // defpackage.cc
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1000) {
            if (i2 == -1) {
                if (intent != null) {
                    ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("android.speech.extra.RESULTS");
                    if (stringArrayListExtra == null || stringArrayListExtra.isEmpty()) {
                        this.m.q(48);
                        return;
                    }
                    this.m.u("voz_mf", 48);
                    String str = stringArrayListExtra.get(0);
                    byte[] bArrL = l();
                    hel helVar = new hel();
                    aihh aihhVar = (aihh) fhz.U("").toBuilder();
                    if (this.e.a() != null) {
                        aihl aihlVar = aoaq.b;
                        if (!aihhVar.c(aihlVar)) {
                            aihf aihfVarCreateBuilder = aoar.a.createBuilder();
                            String strI = this.e.i();
                            int i3 = this.e.a().f;
                            aihfVarCreateBuilder.copyOnWrite();
                            aoar aoarVar = (aoar) aihfVarCreateBuilder.instance;
                            strI.getClass();
                            aoarVar.b |= 1;
                            aoarVar.c = strI;
                            aihfVarCreateBuilder.copyOnWrite();
                            aoar aoarVar2 = (aoar) aihfVarCreateBuilder.instance;
                            aoarVar2.b |= 2;
                            aoarVar2.d = i3;
                            aihhVar.e(aihlVar, (aoar) aihfVarCreateBuilder.build());
                        }
                    }
                    aihh aihhVar2 = (aihh) ((apng) aihhVar.b(apni.a)).toBuilder();
                    aihhVar2.copyOnWrite();
                    apng apngVar = (apng) aihhVar2.instance;
                    str.getClass();
                    apngVar.b |= 1;
                    apngVar.c = str;
                    aihhVar.e(apni.a, (apng) aihhVar2.build());
                    helVar.j((ajwo) aihhVar.build());
                    helVar.c(this.G);
                    helVar.a = bArrL;
                    this.h.k(helVar);
                    return;
                }
                i2 = -1;
            }
            i = 1000;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // defpackage.cc, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        B();
        jhs jhsVar = this.B;
        if (jhsVar != null) {
            jhsVar.f();
        }
        u(this.F);
        x();
    }

    @Override // defpackage.cc
    /* JADX INFO: renamed from: onCreate */
    public final void m658lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        super.m658lambda$performCreate$3$androidsupportv4appFragment(bundle);
        if (bundle != null) {
            hel helVar = (hel) bundle.getParcelable("search_model");
            if (helVar != null) {
                this.F = helVar;
            }
            try {
                byte[] byteArray = bundle.getByteArray("start_search_session_command");
                if (byteArray != null) {
                    this.ag = (ajwo) aihn.parseFrom(ajwo.a, byteArray, ExtensionRegistryLite.getGeneratedRegistry());
                }
            } catch (aiik unused) {
                this.ag = null;
            }
        }
        this.D = new ConcurrentHashMap();
        this.aj = bundle == null;
        this.ar = this.r.b(getContext());
        this.as = this.r.a();
        q();
        e(this.F);
    }

    @Override // defpackage.cc
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup.LayoutParams layoutParams;
        View viewInflate = layoutInflater.inflate(R.layout.search_result_fragment, viewGroup, false);
        if (this.N.l(31, 45757116L, false)) {
            viewInflate.setBackgroundColor(requireContext().getColor(R.color.theme_main_window_background));
        }
        this.aa = (SearchToolbarView) viewInflate.findViewById(R.id.custom_search_toolbar);
        this.ae = (ViewGroup) viewInflate.findViewById(R.id.no_result_container);
        LoadingFrameLayout loadingFrameLayout = (LoadingFrameLayout) viewInflate.findViewById(R.id.results_container);
        this.ab = loadingFrameLayout;
        loadingFrameLayout.c(new gna(this, 6));
        this.ab.h(1);
        TabbedView tabbedView = (TabbedView) viewInflate.findViewById(R.id.tabbed_view);
        this.E = tabbedView;
        tabbedView.t(this.l);
        this.E.u(false);
        if (this.O.i()) {
            this.E.v();
        } else if (!this.K.l(204, 45733885L, false)) {
            this.E.s((TabLayout) LayoutInflater.from(requireContext()).inflate(R.layout.always_gravity_fill_tab_layout, (ViewGroup) null));
        }
        this.B = new jhs(this.E, this, this, this.e);
        this.ad = this.j.a(this.f, this.e);
        this.aq = new inp(this.g);
        this.ah = (Toolbar) viewInflate.findViewById(R.id.search_result_toolbar);
        this.am = viewInflate.findViewById(R.id.navigation_or_logo_container);
        this.an = viewInflate.findViewById(R.id.voice_search_container);
        B();
        this.ah.m(0, 0);
        this.E.y(getContext().getColor(R.color.black_header_color));
        SearchToolbarView searchToolbarView = this.aa;
        searchToolbarView.l = 3;
        searchToolbarView.h();
        iod iodVar = new iod(this, 0);
        this.aa.i(this.ai);
        jlm jlmVar = new jlm(this, this.e, this.U, this.m, this.n, iodVar, this.aa.d, jlm.a, null, this.x);
        this.Y = jlmVar;
        jlmVar.b();
        jlj jljVar = new jlj(this, this.e, this.U, this.w, this.aa.e, null, this.x);
        this.Z = jljVar;
        jljVar.a();
        if (this.L.l(9, 45780438L, false) && (layoutParams = this.ah.getLayoutParams()) != null) {
            layoutParams.height = getContext().getResources().getDimensionPixelSize(R.dimen.search_bar_height);
            this.ah.setLayoutParams(layoutParams);
        }
        this.aa.c.setOnClickListener(new hdf(this, 17));
        this.aa.b.setOnClickListener(new hdf(this, 18));
        this.aa.b.setFocusable(false);
        this.aa.b.setInputType(0);
        this.aa.b.setKeyListener(null);
        x();
        return viewInflate;
    }

    @Override // defpackage.cc
    public final void onDestroy() {
        super.onDestroy();
        hel helVar = this.F;
        if (helVar != null) {
            helVar.k(hei.e);
        }
    }

    @Override // defpackage.cc
    public final void onDestroyView() {
        jhs jhsVar;
        hel helVar = this.F;
        if (helVar != null && helVar.g == hei.c && (jhsVar = this.B) != null) {
            this.P = jhsVar.n();
        }
        if (this.af != null) {
            TabbedView tabbedView = this.E;
            if (tabbedView != null) {
                tabbedView.getViewTreeObserver().removeOnGlobalLayoutListener(this.af);
            }
            this.af = null;
        }
        jhs jhsVar2 = this.B;
        if (jhsVar2 != null) {
            jhsVar2.i();
            this.B = null;
        }
        this.E = null;
        adwg adwgVar = this.ac;
        if (adwgVar != null) {
            adwgVar.i();
            this.ac = null;
        }
        if (this.M.l(330, 45719181L, false)) {
            this.ao = null;
            this.ap = null;
        } else {
            RecyclerView recyclerView = this.ao;
            if (recyclerView != null) {
                recyclerView.A();
                this.ao = null;
            }
            RecyclerView recyclerView2 = this.ap;
            if (recyclerView2 != null) {
                recyclerView2.A();
                this.ap = null;
            }
        }
        this.ah = null;
        this.ab = null;
        this.ae = null;
        this.Y = null;
        this.Z = null;
        this.aa = null;
        Object obj = this.al;
        if (obj != null) {
            avnr.b((AtomicReference) obj);
        }
        super.onDestroyView();
    }

    @Override // defpackage.cc
    public final void onPause() {
        super.onPause();
        Object obj = this.ak;
        if (obj != null) {
            awka.f((AtomicReference) obj);
        }
        Object obj2 = this.X;
        if (obj2 != null) {
            awka.f((AtomicReference) obj2);
        }
    }

    @Override // defpackage.cc
    public final void onResume() {
        super.onResume();
        this.p.a(getContext().getColor(R.color.black_header_color));
        int i = 9;
        this.ak = this.s.p().L(this.u).al(new ifo(this, 18), new ido(i));
        f(Boolean.valueOf(this.H.i()));
        this.X = this.z.p().L(this.u).al(new ifo(this, 19), new ido(i));
    }

    @Override // defpackage.cc
    /* JADX INFO: renamed from: onSaveInstanceState */
    public final void m668x22bc4f96(Bundle bundle) {
        bundle.putParcelable("search_model", this.F);
        ajwo ajwoVar = this.ag;
        if (ajwoVar != null) {
            bundle.putByteArray("start_search_session_command", ajwoVar.toByteArray());
        }
    }

    @Override // defpackage.cc
    public final void onViewCreated(View view, Bundle bundle) {
        u(this.F);
    }

    @Override // defpackage.hku
    public final boolean z() {
        return false;
    }

    @Override // defpackage.jhv
    public final void hA() {
    }
}
