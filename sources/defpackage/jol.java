package defpackage;

import android.content.Context;
import android.os.Handler;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import com.google.android.apps.youtube.music.ui.common.NonPredictiveLinearLayoutManager;
import com.google.android.apps.youtube.music.ui.components.loading.LoadingFrameLayout;
import com.google.android.apps.youtube.music.ui.tabs.TabbedView;
import com.google.android.apps.youtube.music.watchpage.ui.PlayerBottomSheet;
import com.google.android.apps.youtube.music.watchpage.ui.WatchWhileLayout;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import j$.util.Objects;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jol implements adma, abjj, abdz {
    public boolean A;
    public TextView B;
    public boolean C;
    public final aunn D;
    public final aunn E;
    public final Handler F;
    public final od G;
    public final Map H;
    public final adly I;
    public final vxz J;
    public aftj K;
    private final TabbedView L;
    private final jhs M;
    private final jax N;
    private final wom O;
    private final aunn P;
    private final aunn Q;
    private final jay R;
    private final jnz S;
    private boolean T;
    private boolean U;
    private final ViewGroup X;
    private final View Y;
    private final View Z;
    public final cf a;
    private View ab;
    private final jok ad;
    private final aunn ae;
    private final adlz af;
    private final int ag;
    private final WatchWhileLayout ah;
    private final kjc ai;
    private final aeod aj;
    private final vwt ak;
    private final jnm al;
    public final aunn b;
    public final xgn c;
    public final xgn d;
    public final PlayerBottomSheet e;
    public final aunn g;
    public final aunn h;
    public final aunn i;
    public final tbt j;
    public final aunn k;
    public final jer l;
    public final aunn m;
    public final aunn n;
    public final jon p;
    public final RecyclerView q;
    public final aunn r;
    public final aunn s;
    public final icj t;
    public final god u;
    public final long v;
    public final Runnable w;
    public jav x;
    public final avlh z;
    public final avmm f = new avmm();
    private abdy V = abdy.a;
    private int W = -1;
    public int o = -1;
    public int y = -1;
    private boolean aa = false;
    private boolean ac = false;

    /* JADX WARN: Type inference failed for: r15v6, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v7, types: [aunn, java.lang.Object] */
    public jol(PlayerBottomSheet playerBottomSheet, final cf cfVar, aunn aunnVar, xgn xgnVar, xgn xgnVar2, jax jaxVar, aeod aeodVar, vwt vwtVar, wom womVar, jnm jnmVar, aunn aunnVar2, aunn aunnVar3, aunn aunnVar4, jaz jazVar, jnz jnzVar, jer jerVar, final aunn aunnVar5, vxz vxzVar, aunn aunnVar6, aunn aunnVar7, aunn aunnVar8, aunn aunnVar9, aunn aunnVar10, aunn aunnVar11, aunn aunnVar12, jbo jboVar, joo jooVar, aunn aunnVar13, aunn aunnVar14, icj icjVar, god godVar, tbt tbtVar, avlh avlhVar, Optional optional, kjc kjcVar) {
        View viewFindViewById;
        jok jokVar = new jok(this);
        this.ad = jokVar;
        this.F = new Handler();
        this.H = new afv();
        adly adlyVar = new adly();
        this.I = adlyVar;
        this.a = cfVar;
        this.b = aunnVar;
        this.c = xgnVar;
        this.d = xgnVar2;
        this.e = playerBottomSheet;
        this.N = jaxVar;
        this.aj = aeodVar;
        this.ak = vwtVar;
        this.O = womVar;
        this.al = jnmVar;
        this.P = aunnVar2;
        this.k = aunnVar3;
        this.Q = aunnVar4;
        this.S = jnzVar;
        this.l = jerVar;
        this.m = aunnVar5;
        this.J = vxzVar;
        this.D = aunnVar6;
        this.ai = kjcVar;
        this.E = aunnVar7;
        this.ae = aunnVar8;
        this.g = aunnVar9;
        this.h = aunnVar10;
        this.i = aunnVar11;
        this.n = aunnVar12;
        this.r = aunnVar13;
        this.s = aunnVar14;
        this.t = icjVar;
        this.u = godVar;
        this.j = tbtVar;
        this.z = avlhVar;
        int iIntValue = ((Integer) optional.orElse(Integer.valueOf(R.layout.queue_page_header))).intValue();
        this.ag = iIntValue;
        this.ah = (WatchWhileLayout) cfVar.findViewById(R.id.watch_while_layout);
        TabbedView tabbedView = (TabbedView) playerBottomSheet.findViewById(R.id.bottom_sheet_tabbed_view);
        this.L = tabbedView;
        this.M = new jhs(tabbedView, null, null, null);
        tabbedView.k(new jhu() { // from class: jof
            @Override // defpackage.jhu
            public final void a(int i, boolean z) {
                this.a.j(i, z);
            }
        });
        tabbedView.f.add(new jnd(this));
        View viewInflate = View.inflate(cfVar, true != ((jnj) aunnVar5.io()).r() ? R.layout.queue_page : R.layout.santana_queue_page, null);
        this.Y = viewInflate;
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.queue_list);
        this.q = recyclerView;
        recyclerView.aC(jokVar);
        recyclerView.setTag(441581429, "disable-recycler-binder");
        RelativeLayout relativeLayout = new RelativeLayout(cfVar.getBaseContext());
        this.X = relativeLayout;
        relativeLayout.addView(viewInflate);
        if (((jnj) aunnVar5.io()).r()) {
            viewFindViewById = LayoutInflater.from(cfVar).inflate(R.layout.santana_queue_page_header, (ViewGroup) null);
        } else {
            ViewStub viewStub = (ViewStub) viewInflate.findViewById(R.id.queue_page_header_stub);
            viewStub.setLayoutResource(iIntValue);
            if (viewStub.getParent() != null) {
                viewStub.inflate();
            }
            viewFindViewById = viewInflate.findViewById(R.id.queue_page_header);
        }
        this.Z = viewFindViewById;
        xgn xgnVar3 = (xgn) jooVar.a.io();
        xgnVar3.getClass();
        ?? Io = jooVar.b.io();
        Io.getClass();
        Context context = (Context) jooVar.c.io();
        context.getClass();
        jnj jnjVar = (jnj) jooVar.d.io();
        jnjVar.getClass();
        ?? Io2 = jooVar.e.io();
        Io2.getClass();
        jij jijVar = (jij) jooVar.f.io();
        jijVar.getClass();
        Executor executor = (Executor) jooVar.g.io();
        executor.getClass();
        hhb hhbVar = (hhb) jooVar.h.io();
        hhbVar.getClass();
        vwt vwtVar2 = (vwt) jooVar.i.io();
        vwtVar2.getClass();
        hfn hfnVar = (hfn) jooVar.j.io();
        hfnVar.getClass();
        avmb avmbVar = (avmb) jooVar.k.io();
        avmbVar.getClass();
        kjc kjcVar2 = (kjc) jooVar.l.io();
        kjcVar2.getClass();
        viewFindViewById.getClass();
        this.p = new jon(xgnVar3, Io, context, jnjVar, Io2, jijVar, executor, hhbVar, vwtVar2, hfnVar, avmbVar, kjcVar2, viewFindViewById, jboVar, jerVar);
        this.R = jazVar.a(womVar, xgnVar2);
        adlyVar.f("messageRendererHideDivider", Boolean.TRUE);
        this.af = new adlz() { // from class: jog
            @Override // defpackage.adlz
            public final void a(adly adlyVar2, adkz adkzVar, int i) {
                adlyVar2.f("backgroundColor", 0);
                adlyVar2.f("isPlayerPage", Boolean.TRUE);
                cf cfVar2 = cfVar;
                if (this.a.o()) {
                    adlyVar2.f("shelfItemWidthOverridePx", Integer.valueOf(cfVar2.getResources().getDimensionPixelSize(R.dimen.player_page_tab_shelf_item_length)));
                } else {
                    adlyVar2.f("pagePadding", Integer.valueOf(jnj.x(cfVar2)));
                }
            }
        };
        playerBottomSheet.f();
        if (((jnj) aunnVar5.io()).r()) {
            View viewInflate2 = LayoutInflater.from(cfVar).inflate(R.layout.player_page_tab_title, (ViewGroup) tabbedView, false);
            this.ab = viewInflate2;
            TextView textView = (TextView) viewInflate2.findViewById(R.id.player_page_tab_title);
            this.B = textView;
            textView.setEllipsize(TextUtils.TruncateAt.MARQUEE);
            this.B.setHorizontalFadingEdgeEnabled(true);
        }
        this.v = cfVar.getResources().getInteger(R.integer.text_marquee_delay_ms);
        this.w = new iqc(this, 7);
        this.G = new joi(cfVar);
    }

    private final boolean A() {
        return ((jnj) this.m.io()).s() && ((hfn) this.g.io()).x().b(hww.d);
    }

    public static void n(View view, boolean z) {
        view.setNestedScrollingEnabled(z);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt != null) {
                    n(childAt, z);
                }
            }
        }
    }

    private final int q() {
        int i = this.W;
        if (i >= 0) {
            return i;
        }
        int i2 = this.o;
        if (i2 >= 0) {
            return i2;
        }
        int i3 = this.y;
        if (i3 < 0) {
            return -1;
        }
        return i3;
    }

    private final void r(boolean z) {
        Map map = this.H;
        for (joj jojVar : map.values()) {
            jojVar.c.i();
            if (jojVar.e != null) {
                av avVar = new av(this.a.getSupportFragmentManager());
                avVar.l(jojVar.e);
                avVar.e();
            }
        }
        map.clear();
        if (z) {
            jav javVar = this.x;
            if (javVar != null) {
                javVar.i();
                this.x = null;
            }
            this.K = null;
            this.M.f();
            return;
        }
        jhs jhsVar = this.M;
        agke agkeVarE = jhsVar.e();
        int i = ((agpi) agkeVarE).d;
        for (int i2 = 0; i2 < i; i2++) {
            aftj aftjVar = (aftj) agkeVarE.get(i2);
            if (!hna.aj(aftjVar)) {
                jhsVar.q(aftjVar);
            }
        }
    }

    private final void s(int i) {
        RecyclerView recyclerView = this.q;
        n(recyclerView, false);
        Map map = this.H;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((joj) it.next()).b(false);
        }
        joj jojVar = (joj) map.get(Integer.valueOf(i));
        boolean zB = true;
        if (jojVar != null) {
            jojVar.b(true);
        } else {
            aunn aunnVar = this.m;
            if (((jnj) aunnVar.io()).s() && ((jnj) aunnVar.io()).r()) {
                zB = true ^ ((hfn) this.g.io()).x().b(hww.d);
                n(this.Z, false);
            }
            n(recyclerView, zB);
        }
        this.e.requestLayout();
    }

    private final void t(int i) {
        aftj aftjVarD;
        Object obj;
        aftj aftjVarD2;
        if (this.J.l(60, 45715045L, false) && !this.V.a(abdy.d) && i == this.y) {
            jhs jhsVar = this.M;
            xgn xgnVar = this.c;
            if (!jhsVar.l(i) && (aftjVarD2 = jhsVar.a.D(i)) != null) {
                byte[] bArrG = ((aqjj) aftjVarD2.b).k.G();
                if (xgnVar != null) {
                    xgnVar.d(new xgj(bArrG));
                }
            }
        }
        jhs jhsVar2 = this.M;
        xgn xgnVar2 = this.c;
        jhsVar2.h(xgnVar2, i);
        if (!this.aa && !jhsVar2.l(i) && (aftjVarD = jhsVar2.a.D(i)) != null && xgnVar2 != null && (obj = aftjVarD.b) != null) {
            xgnVar2.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_SWIPE, new xgj(((aqjj) obj).k, (amud) null), null);
        }
        this.aa = false;
    }

    private final void u() {
        if (!this.T || !this.U) {
            return;
        }
        int i = 0;
        this.T = false;
        this.U = false;
        while (true) {
            jhs jhsVar = this.M;
            if (i >= jhsVar.c()) {
                return;
            }
            jhsVar.j(this.c, i);
            i++;
        }
    }

    private final void v() {
        if (this.A) {
            return;
        }
        int iE = e();
        jok jokVar = this.ad;
        if (((mbc) this.E.io()).b() - jokVar.a > 2000) {
            np npVar = this.q.n;
            if (npVar instanceof LinearLayoutManager) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) npVar;
                if (iE >= 0) {
                    int iFindFirstCompletelyVisibleItemPosition = linearLayoutManager.findFirstCompletelyVisibleItemPosition();
                    if (!A()) {
                        int iFindLastCompletelyVisibleItemPosition = linearLayoutManager.findLastCompletelyVisibleItemPosition();
                        if (iE >= iFindFirstCompletelyVisibleItemPosition && iE <= iFindLastCompletelyVisibleItemPosition) {
                            return;
                        }
                    } else if (iFindFirstCompletelyVisibleItemPosition == iE) {
                        return;
                    }
                    this.F.postDelayed(A() ? new awu(this, iE, 11) : new awu(this, iE, 12), 20L);
                }
            }
        }
    }

    private final void w(int i) {
        this.o = i;
        s(i);
        if (i == this.y) {
            t(i);
        } else {
            f(i);
        }
    }

    private final void x() {
        xhc xhcVarA = xhb.a(83769);
        jhs jhsVar = this.M;
        joj jojVar = (joj) this.H.get(Integer.valueOf(jhsVar.b()));
        if (jhsVar.b() == this.y) {
            xhcVarA = xhb.a(3832);
        } else if (jojVar != null) {
            ajwo ajwoVar = ((aqjj) jojVar.g.b).d;
            if (ajwoVar == null) {
                ajwoVar = ajwo.a;
            }
            xhcVarA = fhz.s(ajwoVar);
        }
        ((jng) this.n.io()).b.kk(Boolean.valueOf(jng.a.contains(xhcVarA)));
    }

    private final boolean y() {
        boolean zO = o();
        aunn aunnVar = this.g;
        return zO ? ((hfn) aunnVar.io()).x().b(hww.c, hww.j, hww.e) : ((hfn) aunnVar.io()).x().b(hww.e, hww.d);
    }

    private final boolean z() {
        agke agkeVarE = this.M.e();
        int i = ((agpi) agkeVarE).d;
        int i2 = 0;
        while (i2 < i) {
            boolean zAj = hna.aj((aftj) agkeVarE.get(i2));
            i2++;
            if (zAj) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.adma
    public final View a() {
        return this.e;
    }

    @Override // defpackage.adma
    public final void b(admh admhVar) {
        i();
    }

    public final int e() {
        jav javVar;
        adlq adlqVar;
        aunn aunnVar = this.D;
        abjp abjpVar = (abjp) aunnVar.io();
        aunn aunnVar2 = this.m;
        int iMax = Math.max(0, abjpVar.b(((jnj) aunnVar2.io()).q()));
        abke abkeVarK = ((abjp) aunnVar.io()).k(((jnj) aunnVar2.io()).q());
        if (abkeVarK == null || (javVar = this.x) == null || (adlqVar = javVar.j) == null) {
            return iMax;
        }
        if (iMax < adlqVar.a()) {
            Object objD = adlqVar.d(iMax);
            if (objD instanceof ida) {
                objD = ((ida) objD).get();
            }
            if (Objects.equals(abkeVarK, objD)) {
                return iMax;
            }
        }
        for (int i = 0; i < adlqVar.a(); i++) {
            Object objD2 = adlqVar.d(i);
            if (objD2 instanceof ida) {
                objD2 = ((ida) objD2).get();
            }
            if (Objects.equals(abkeVarK, objD2)) {
                return i;
            }
        }
        return iMax;
    }

    public final void f(int i) {
        ListenableFuture listenableFutureH;
        joj jojVar = (joj) this.H.get(Integer.valueOf(i));
        if (jojVar != null) {
            if (jojVar.f) {
                t(i);
                return;
            }
            xgn xgnVar = this.c;
            ajwo ajwoVar = ((aqjj) jojVar.g.b).d;
            if (ajwoVar == null) {
                ajwoVar = ajwo.a;
            }
            ajwo ajwoVarF = xgnVar.f(ajwoVar);
            if (ajwoVarF != null) {
                aihl aihlVarCheckIsLite = aihn.checkIsLite(ajmj.a);
                ajwoVarF.c(aihlVarCheckIsLite);
                if (ajwoVarF.j.n(aihlVarCheckIsLite.d)) {
                    jojVar.a.h(2);
                    aihl aihlVarCheckIsLite2 = aihn.checkIsLite(ajmj.a);
                    ajwoVarF.c(aihlVarCheckIsLite2);
                    Object objK = ajwoVarF.j.k(aihlVarCheckIsLite2.d);
                    String str = ((ajmf) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK))).c;
                    cf cfVar = this.a;
                    int i2 = 5;
                    if (str.startsWith("FEmusic_offline_lyrics_")) {
                        grj grjVar = (grj) this.P.io();
                        if (str.startsWith("FEmusic_offline_lyrics_")) {
                            String strReplace = str.replace("FEmusic_offline_lyrics_", "");
                            if (TextUtils.isEmpty(strReplace)) {
                                listenableFutureH = ahng.m(new IllegalArgumentException("empty track id."));
                            } else {
                                Optional optional = (Optional) grjVar.a;
                                listenableFutureH = optional.isEmpty() ? ahng.m(new IllegalStateException("DownloadsLyricsPageProvider is not available. Make sure an implementation is provided as a non-optional binding.")) : ahno.ar(((kwq) optional.get()).m(strReplace), new hoh(i2), MoreExecutors.directExecutor());
                            }
                        } else {
                            listenableFutureH = ahng.m(new IllegalArgumentException("browse id is invalid: ".concat(String.valueOf(str))));
                        }
                    } else {
                        listenableFutureH = this.O.h(this.al.x(ajwoVarF), (Executor) this.ae.io());
                    }
                    taf.k(cfVar, listenableFutureH, new hcq(this, jojVar, 13, null), new gyr((Object) this, (Object) jojVar, (aihn) ajwoVarF, i2));
                }
            }
        }
    }

    public final void g(adly adlyVar, Optional optional) {
        if (this.K == null || !z()) {
            this.ac = false;
            return;
        }
        this.ac = true;
        jon jonVar = this.p;
        icj icjVar = this.t;
        jonVar.b(adlyVar, optional, icjVar.h(), icjVar.n(), icjVar.v);
    }

    public final void h(hww hwwVar) {
        if (!o() && hwwVar.b(hww.c)) {
            m(q());
        } else if (y()) {
            w(this.M.b());
        }
        if (A()) {
            v();
        }
    }

    @tcc
    public void handleWatchNextException(aboe aboeVar) {
        this.A = false;
        if (aboeVar.j == 12) {
            r(false);
        }
    }

    @Override // defpackage.abdz
    public final void hn(abdy abdyVar) {
        vxz vxzVar = this.J;
        if (vxzVar.l(24, 45656334L, false) && Objects.equals(abdyVar, abdy.b)) {
            icj icjVar = this.t;
            Optional optional = icjVar.t;
            jfn jfnVar = new jfn(this, 6);
            if (true == optional.isPresent()) {
                Object obj = optional.get();
                Object obj2 = jfnVar.a;
                ((jol) obj2).c.d(new xgj(((anvo) obj).f, (amud) null));
            }
            Optional optionalH = icjVar.h();
            jfn jfnVar2 = new jfn(this, 7);
            if (true == optionalH.isPresent()) {
                Object obj3 = optionalH.get();
                Object obj4 = jfnVar2.a;
                ((jol) obj4).c.d(new xgj(((ajta) obj3).d, (amud) null));
            }
        }
        if (abdy.d.equals(abdyVar)) {
            this.U = true;
            u();
        }
        if (vxzVar.l(60, 45715045L, false)) {
            this.V = abdyVar;
        }
    }

    @Override // defpackage.abjj
    public final void ho(int i, int i2) {
        v();
    }

    public final void i() {
        jon jonVar = this.p;
        jonVar.a.b(null);
        jbw jbwVar = jonVar.n;
        if (jbwVar != null) {
            jbwVar.b(null);
        }
        jbm jbmVar = jonVar.p;
        if (jbmVar != null) {
            jbmVar.b(jonVar.b.a);
        }
        jonVar.o.c();
        jav javVar = this.x;
        if (javVar != null) {
            javVar.i();
            this.x = null;
        }
        this.y = -1;
        this.K = null;
        this.M.f();
        this.ac = false;
        if (((jnj) this.m.io()).r()) {
            this.F.removeCallbacks(this.w);
            this.ab = null;
            this.B = null;
            this.C = false;
        }
    }

    public final void j(int i, boolean z) {
        if (z) {
            return;
        }
        this.aa = true;
        if (y()) {
            w(i);
        }
        WatchWhileLayout watchWhileLayout = this.ah;
        if (watchWhileLayout != null) {
            if (((jnj) this.m.io()).s()) {
                watchWhileLayout.M();
            } else {
                watchWhileLayout.K();
            }
        }
        x();
    }

    public final void k() {
        aunn aunnVar = this.h;
        this.q.setPadding(0, 0, 0, ((hfn) aunnVar.io()).J());
        Iterator it = this.H.values().iterator();
        while (it.hasNext()) {
            ((joj) it.next()).b.setPadding(0, 0, 0, ((hfn) aunnVar.io()).J());
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0059  */
    /* JADX WARN: Code duplicated, block: B:63:0x010f  */
    /* JADX WARN: Code duplicated, block: B:65:0x0113  */
    /* JADX WARN: Code duplicated, block: B:68:0x011c  */
    /* JADX WARN: Code duplicated, block: B:71:0x0183  */
    /* JADX WARN: Code duplicated, block: B:74:0x0189  */
    /* JADX WARN: Code duplicated, block: B:77:0x018f  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:81:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:84:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:87:0x020a  */
    /* JADX WARN: Code duplicated, block: B:89:0x021d  */
    /* JADX WARN: Code duplicated, block: B:92:0x023c  */
    /* JADX WARN: Code duplicated, block: B:94:0x0244  */
    @Override // defpackage.adma
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final void hU(adly adlyVar, List list) {
        boolean z;
        aftj aftjVar;
        jav javVar;
        aqjg aqjgVar;
        anvq anvqVar;
        apji apjiVar;
        aihl aihlVarCheckIsLite;
        jhs jhsVar;
        Object objK;
        Object objC;
        afdk afdkVarC;
        Optional optionalEmpty;
        boolean z2;
        int i = bac.a;
        TabbedView tabbedView = this.L;
        tabbedView.setImportantForAccessibility(4);
        jhs jhsVar2 = this.M;
        int iB = jhsVar2.b();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        boolean z3 = false;
        while (it.hasNext()) {
            aftj aftjVar2 = (aftj) it.next();
            if (hna.aj(aftjVar2)) {
                if (!z3) {
                    Optional optionalAh = hna.ah(aftjVar2);
                    if (true == optionalAh.isPresent()) {
                        anvl anvlVar = (anvl) optionalAh.get();
                        if ((anvlVar.b & 1) == 0) {
                            z2 = false;
                        } else {
                            anvn anvnVar = anvlVar.c;
                            if (anvnVar == null) {
                                anvnVar = anvn.a;
                            }
                            int iBc = a.bc(anvnVar.b);
                            if (iBc == 0 || iBc != 5) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                        }
                        optionalAh = Optional.ofNullable(Boolean.valueOf(z2));
                    }
                    if (!((Boolean) optionalAh.orElse(Boolean.FALSE)).booleanValue()) {
                        z3 = true;
                    }
                }
            }
            arrayList.add(aftjVar2);
        }
        this.e.setVisibility(true != arrayList.isEmpty() ? 0 : 4);
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (it2.hasNext()) {
                if (hna.aj((aftj) it2.next())) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        r(!z);
        izt iztVar = (izt) adlyVar.c("sharedToggleMenuItemMutations");
        this.y = -1;
        this.W = -1;
        for (final int i2 = 0; i2 < arrayList.size(); i2++) {
            aftj aftjVar3 = (aftj) arrayList.get(i2);
            if (((aqjj) aftjVar3.b).f) {
                this.W = i2;
            }
            if (hna.aj(aftjVar3)) {
                if (this.K == null || this.x == null) {
                    aftjVar = this.K;
                    if (aftjVar != null) {
                        jhsVar2.q(aftjVar);
                    }
                    this.K = aftjVar3;
                    javVar = this.x;
                    if (javVar != null) {
                        javVar.i();
                    }
                    jax jaxVar = this.N;
                    jaf jafVar = new jaf();
                    RecyclerView recyclerView = this.q;
                    jafVar.o(recyclerView);
                    jafVar.f(new NonPredictiveLinearLayoutManager(this.a));
                    jafVar.p(this.aj);
                    jafVar.q(this.ak);
                    jafVar.g(new advn());
                    jafVar.j((wnf) this.Q.io());
                    jafVar.l(this.S);
                    jafVar.m(this.l.a);
                    jafVar.e(this.c);
                    jav javVarA = jaxVar.a(jafVar.a());
                    this.x = javVarA;
                    aihf aihfVarCreateBuilder = apoq.a.createBuilder();
                    aihf aihfVarCreateBuilder2 = apox.a.createBuilder();
                    aqjgVar = ((aqjj) aftjVar3.b).i;
                    if (aqjgVar == null) {
                        aqjgVar = aqjg.a;
                    }
                    anvqVar = aqjgVar.e;
                    if (anvqVar == null) {
                        anvqVar = anvq.a;
                    }
                    apjiVar = anvqVar.c;
                    if (apjiVar == null) {
                        apjiVar = apji.a;
                    }
                    aihlVarCheckIsLite = aihn.checkIsLite(aouq.a);
                    apjiVar.c(aihlVarCheckIsLite);
                    jhsVar = jhsVar2;
                    objK = apjiVar.j.k(aihlVarCheckIsLite.d);
                    if (objK == null) {
                        objC = aihlVarCheckIsLite.b;
                    } else {
                        objC = aihlVarCheckIsLite.c(objK);
                    }
                    aouj aoujVar = (aouj) objC;
                    aihfVarCreateBuilder2.copyOnWrite();
                    apox apoxVar = (apox) aihfVarCreateBuilder2.instance;
                    aoujVar.getClass();
                    apoxVar.bd = aoujVar;
                    apoxVar.e |= 16;
                    aihfVarCreateBuilder.ck(aihfVarCreateBuilder2);
                    javVarA.at(new wgd((apoq) aihfVarCreateBuilder.build()));
                    if (iztVar != null) {
                        this.x.L(new jeo(iztVar, 5));
                    }
                    this.x.L(new gob(this, 15));
                    tvy tvyVar = new tvy();
                    this.x.L(new adlx(tvyVar, 0));
                    tvyVar.b(recyclerView);
                    if (((jnj) this.m.io()).r()) {
                        jhsVar2 = jhsVar;
                        jhsVar2.p(aftjVar3, this.Z, this.X, this.x, i2);
                        afdkVarC = tabbedView.b.c(i2);
                        if (afdkVarC != null) {
                            afdkVarC.d(this.ab);
                            afdkVarC.g.setPadding(0, 0, 0, 0);
                        }
                        optionalEmpty = (Optional) ((awku) ((aczl) this.s.io()).c).aD();
                        if (optionalEmpty == null) {
                            optionalEmpty = Optional.empty();
                        }
                        p(optionalEmpty, aftjVar3);
                    } else {
                        jhsVar2 = jhsVar;
                        jhsVar2.p(aftjVar3, null, this.X, this.x, i2);
                    }
                } else {
                    aqjg aqjgVar2 = ((aqjj) aftjVar3.b).i;
                    if (aqjgVar2 == null) {
                        aqjgVar2 = aqjg.a;
                    }
                    anvq anvqVar2 = aqjgVar2.e;
                    if (anvqVar2 == null) {
                        anvqVar2 = anvq.a;
                    }
                    apji apjiVar2 = anvqVar2.c;
                    if (apjiVar2 == null) {
                        apjiVar2 = apji.a;
                    }
                    aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aouq.a);
                    apjiVar2.c(aihlVarCheckIsLite2);
                    if (apjiVar2.j.n(aihlVarCheckIsLite2.d) || !z()) {
                        aftjVar = this.K;
                        if (aftjVar != null) {
                            jhsVar2.q(aftjVar);
                        }
                        this.K = aftjVar3;
                        javVar = this.x;
                        if (javVar != null) {
                            javVar.i();
                        }
                        jax jaxVar2 = this.N;
                        jaf jafVar2 = new jaf();
                        RecyclerView recyclerView2 = this.q;
                        jafVar2.o(recyclerView2);
                        jafVar2.f(new NonPredictiveLinearLayoutManager(this.a));
                        jafVar2.p(this.aj);
                        jafVar2.q(this.ak);
                        jafVar2.g(new advn());
                        jafVar2.j((wnf) this.Q.io());
                        jafVar2.l(this.S);
                        jafVar2.m(this.l.a);
                        jafVar2.e(this.c);
                        jav javVarA2 = jaxVar2.a(jafVar2.a());
                        this.x = javVarA2;
                        aihf aihfVarCreateBuilder3 = apoq.a.createBuilder();
                        aihf aihfVarCreateBuilder4 = apox.a.createBuilder();
                        aqjgVar = ((aqjj) aftjVar3.b).i;
                        if (aqjgVar == null) {
                            aqjgVar = aqjg.a;
                        }
                        anvqVar = aqjgVar.e;
                        if (anvqVar == null) {
                            anvqVar = anvq.a;
                        }
                        apjiVar = anvqVar.c;
                        if (apjiVar == null) {
                            apjiVar = apji.a;
                        }
                        aihlVarCheckIsLite = aihn.checkIsLite(aouq.a);
                        apjiVar.c(aihlVarCheckIsLite);
                        jhsVar = jhsVar2;
                        objK = apjiVar.j.k(aihlVarCheckIsLite.d);
                        if (objK == null) {
                            objC = aihlVarCheckIsLite.b;
                        } else {
                            objC = aihlVarCheckIsLite.c(objK);
                        }
                        aouj aoujVar2 = (aouj) objC;
                        aihfVarCreateBuilder4.copyOnWrite();
                        apox apoxVar2 = (apox) aihfVarCreateBuilder4.instance;
                        aoujVar2.getClass();
                        apoxVar2.bd = aoujVar2;
                        apoxVar2.e |= 16;
                        aihfVarCreateBuilder3.ck(aihfVarCreateBuilder4);
                        javVarA2.at(new wgd((apoq) aihfVarCreateBuilder3.build()));
                        if (iztVar != null) {
                            this.x.L(new jeo(iztVar, 5));
                        }
                        this.x.L(new gob(this, 15));
                        tvy tvyVar2 = new tvy();
                        this.x.L(new adlx(tvyVar2, 0));
                        tvyVar2.b(recyclerView2);
                        if (((jnj) this.m.io()).r()) {
                            jhsVar2 = jhsVar;
                            jhsVar2.p(aftjVar3, this.Z, this.X, this.x, i2);
                            afdkVarC = tabbedView.b.c(i2);
                            if (afdkVarC != null) {
                                afdkVarC.d(this.ab);
                                afdkVarC.g.setPadding(0, 0, 0, 0);
                            }
                            optionalEmpty = (Optional) ((awku) ((aczl) this.s.io()).c).aD();
                            if (optionalEmpty == null) {
                                optionalEmpty = Optional.empty();
                            }
                            p(optionalEmpty, aftjVar3);
                        } else {
                            jhsVar2 = jhsVar;
                            jhsVar2.p(aftjVar3, null, this.X, this.x, i2);
                        }
                    } else {
                        aftj aftjVar4 = this.K;
                        if (aftjVar4 != null) {
                            Object obj = aftjVar3.b;
                            obj.getClass();
                            aftjVar4.b = obj;
                            aftjVar4.a = null;
                        }
                    }
                }
                if (!this.J.l(69, 45728267L, false) || !this.ac) {
                    Optional optionalAi = hna.ai(aftjVar3);
                    icj icjVar = this.t;
                    icjVar.getClass();
                    g(adlyVar, optionalAi.or(new gpa(icjVar, 18)));
                }
                this.y = i2;
            } else {
                cf cfVar = this.a;
                LoadingFrameLayout loadingFrameLayout = new LoadingFrameLayout(cfVar);
                loadingFrameLayout.h(2);
                RecyclerView recyclerView3 = new RecyclerView(cfVar);
                recyclerView3.setClipToPadding(false);
                recyclerView3.af(null);
                NonPredictiveLinearLayoutManager nonPredictiveLinearLayoutManager = new NonPredictiveLinearLayoutManager(cfVar);
                jax jaxVar3 = this.N;
                jaf jafVar3 = new jaf();
                jafVar3.o(recyclerView3);
                jafVar3.f(nonPredictiveLinearLayoutManager);
                jafVar3.p(this.aj);
                jafVar3.q(this.ak);
                jafVar3.j(this.O);
                jafVar3.l(this.R);
                jafVar3.m(this.l.a);
                jafVar3.e(this.d);
                jav javVarA3 = jaxVar3.a(jafVar3.a());
                javVarA3.L(this.af);
                if (iztVar != null) {
                    javVarA3.L(new jeo(iztVar, 5));
                }
                joj jojVar = new joj(aftjVar3, loadingFrameLayout, recyclerView3, javVarA3, nonPredictiveLinearLayoutManager);
                aftj aftjVar5 = jojVar.g;
                LoadingFrameLayout loadingFrameLayout2 = jojVar.a;
                jhsVar2.p(aftjVar5, null, loadingFrameLayout2, jojVar.c, i2);
                this.H.put(Integer.valueOf(i2), jojVar);
                loadingFrameLayout2.c(new advm() { // from class: joh
                    @Override // defpackage.advm
                    public final void a() {
                        this.a.f(i2);
                    }
                });
            }
        }
        k();
        this.T = true;
        u();
        if (y()) {
            if (iB < 0 || iB >= jhsVar2.c()) {
                iB = jhsVar2.c() > 0 ? 0 : -1;
            }
            if (iB >= 0) {
                m(iB);
                w(iB);
            }
        } else {
            m(q());
        }
        this.q.ab(e());
        tabbedView.setImportantForAccessibility(1);
    }

    public final void m(int i) {
        this.M.m(i);
        s(i);
        x();
    }

    public final boolean o() {
        return this.ai.n();
    }

    public final void p(Optional optional, aftj aftjVar) {
        if (((jnj) this.m.io()).r()) {
            if (true == optional.isPresent()) {
                alay alayVar = ((anvo) optional.get()).d;
                if (alayVar == null) {
                    alayVar = alay.a;
                }
                optional = Optional.ofNullable(ackj.k(null, alayVar, null, false).toString());
            }
            String string = (String) optional.orElse(aftjVar != null ? ((aqjj) aftjVar.b).e : "");
            if (string.isEmpty()) {
                string = this.a.getString(R.string.queue_header_default_name);
            }
            TextView textView = this.B;
            if (textView == null || string.contentEquals(textView.getText())) {
                return;
            }
            Handler handler = this.F;
            Runnable runnable = this.w;
            handler.removeCallbacks(runnable);
            this.B.setSelected(false);
            this.B.setText(string);
            if (this.C) {
                return;
            }
            handler.postDelayed(runnable, this.v);
        }
    }
}
