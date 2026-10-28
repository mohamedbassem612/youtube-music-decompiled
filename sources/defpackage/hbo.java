package defpackage;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.android.apps.youtube.music.ui.components.loading.LoadingFrameLayout;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class hbo extends vta {
    private static final agrf B = agrf.h("com/google/android/apps/youtube/music/engagementpanel/MusicCommentRepliesEngagementPanel");
    private final Context C;
    private final tbt D;
    private final advb E;
    private final advn F;
    private final avlh G;
    private View H;
    private LoadingFrameLayout I;
    private int J;
    private final vxz K;
    private final vxz L;
    private final ahek M;
    private final hhb N;
    jhh a;

    public hbo(Context context, wom womVar, ttm ttmVar, tbt tbtVar, ahek ahekVar, advb advbVar, srh srhVar, Executor executor, xgn xgnVar, vxe vxeVar, tts ttsVar, aczl aczlVar, awmd awmdVar, lqa lqaVar, nsg nsgVar, vyo vyoVar, avlh avlhVar, axfd axfdVar, advn advnVar, hhb hhbVar, vxz vxzVar, vxz vxzVar2, vxz vxzVar3) {
        super(womVar, ttmVar, srhVar, executor, xgnVar, vxeVar, ttsVar, aczlVar, awmdVar, lqaVar, nsgVar, vyoVar, axfdVar, vxzVar3);
        this.C = context;
        this.D = tbtVar;
        this.M = ahekVar;
        this.E = advbVar;
        this.N = hhbVar;
        this.F = advnVar;
        this.G = avlhVar;
        this.K = vxzVar;
        this.L = vxzVar2;
    }

    private final View ah() {
        View view = this.H;
        if (view != null) {
            return view;
        }
        View viewInflate = LayoutInflater.from(this.C).inflate(R.layout.comment_replies_engagement_panel, (ViewGroup) null, false);
        this.H = viewInflate;
        return viewInflate;
    }

    private final LoadingFrameLayout ai() {
        if (this.I == null) {
            LoadingFrameLayout loadingFrameLayout = (LoadingFrameLayout) ah().findViewById(R.id.loading_layout);
            this.I = loadingFrameLayout;
            loadingFrameLayout.c(new gna(this, 3));
        }
        return this.I;
    }

    @Override // defpackage.vob
    public final View c() {
        return ai();
    }

    @Override // defpackage.vta, defpackage.vob
    public final void d(ajwo ajwoVar) {
        hbo hboVar;
        int iAS;
        alay alayVar;
        alay alayVar2;
        this.s = ajwoVar;
        this.t = false;
        int i = 1;
        this.u = true;
        if (vta.ae(ajwoVar)) {
            vpk vpkVarK = T();
            agev agevVarW = vta.W(ajwoVar);
            if (agevVarW.g()) {
                alayVar = ((apxj) agevVarW.c()).e;
                if (alayVar == null) {
                    alayVar = alay.a;
                }
            } else {
                agev agevVarU = vta.U(ajwoVar);
                if (!agevVarU.g() || (alayVar = ((ajyg) agevVarU.c()).d) == null) {
                    alayVar = alay.a;
                }
            }
            vpkVarK.C(ackj.k(null, alayVar, null, false));
            vpk vpkVarK2 = T();
            agev agevVarW2 = vta.W(ajwoVar);
            if (agevVarW2.g()) {
                alayVar2 = ((apxj) agevVarW2.c()).h;
                if (alayVar2 == null) {
                    alayVar2 = alay.a;
                }
            } else {
                agev agevVarU2 = vta.U(ajwoVar);
                if (!agevVarU2.g() || (alayVar2 = ((ajyg) agevVarU2.c()).g) == null) {
                    alayVar2 = alay.a;
                }
            }
            vpkVarK2.y(ackj.k(null, alayVar2, null, false));
            this.q = T().b();
        }
        if (this.I == null) {
            this.m = (SwipeRefreshLayout) ah().findViewById(R.id.section_list_refresher);
            SwipeRefreshLayout swipeRefreshLayout = this.m;
            Context context = this.C;
            swipeRefreshLayout.i(tzk.n(context, R.attr.ytEngagementPanelSwipeRefreshLayoutColorSchemeColor).orElse(-16777216));
            this.m.j(tzk.n(context, R.attr.ytEngagementPanelSwipeRefreshLayoutProgressBackgroundColor).orElse(-1));
            RecyclerView recyclerView = (RecyclerView) ah().findViewById(R.id.section_list);
            recyclerView.ah(new LinearLayoutManager(context));
            recyclerView.r = true;
            hhb hhbVar = this.N;
            SwipeRefreshLayout swipeRefreshLayout2 = this.m;
            swipeRefreshLayout2.getClass();
            jhh jhhVarL = hhbVar.l(swipeRefreshLayout2);
            this.a = jhhVarL;
            this.n = jhhVarL;
            xgn xgnVar = this.e;
            if (xgnVar == null) {
                ((agrc) ((agrc) B.b()).k("com/google/android/apps/youtube/music/engagementpanel/MusicCommentRepliesEngagementPanel", "initializeViewControllers", 291, "MusicCommentRepliesEngagementPanel.java")).t("Cannot initialize with a null InteractionLogger.");
                hboVar = this;
            } else {
                wom womVar = this.b;
                tbt tbtVar = this.D;
                advb advbVar = this.E;
                ttm ttmVar = this.c;
                hboVar = this;
                vsy vsyVar = new vsy(hboVar, womVar, tbtVar, advbVar, ttmVar, xgnVar, this.K);
                adss adssVar = new adss();
                adssVar.c((admh) advbVar.io());
                adst adstVar = new adst();
                adstVar.n((RecyclerView) hboVar.ai().findViewById(R.id.section_list));
                ahek ahekVar = hboVar.M;
                admh admhVar = (admh) advbVar.io();
                admhVar.getClass();
                adstVar.g(ahekVar.d(admhVar));
                adstVar.f(hboVar.F);
                adstVar.k(womVar);
                adstVar.c(tbtVar);
                adstVar.l(vsyVar);
                adstVar.b(ttmVar);
                adstVar.e(xgnVar);
                adstVar.j(hboVar);
                adwj adwjVar = hboVar.n;
                adwjVar.getClass();
                adstVar.h(adwjVar);
                adstVar.d(hboVar.l);
                adstVar.i(hboVar.G);
                adstVar.m(hboVar.L);
                adssVar.b(adstVar.a());
                hboVar.o = new adwg(adssVar.a());
                Set<adlz> set = hboVar.p;
                if (set != null) {
                    for (adlz adlzVar : set) {
                        adwg adwgVar = hboVar.o;
                        adwgVar.getClass();
                        adwgVar.L(adlzVar);
                    }
                    Set set2 = hboVar.p;
                    set2.getClass();
                    set2.clear();
                }
                adwg adwgVar2 = hboVar.o;
                if (adwgVar2 != null) {
                    jhh jhhVar = hboVar.a;
                    jhhVar.getClass();
                    jhhVar.a = adwgVar2;
                    adwgVar2.an = new vsz(hboVar, 0);
                }
            }
        } else {
            hboVar = this;
        }
        agev agevVarU3 = vta.U(ajwoVar);
        boolean z = (agevVarU3.g() && (((ajyg) agevVarU3.c()).b & SemanticState.Focused) != 0 && ((ajyg) agevVarU3.c()).j) ? false : true;
        hboVar.v = z;
        adwg adwgVar3 = hboVar.o;
        adwgVar3.getClass();
        adwgVar3.ah(z);
        agev agevVarU4 = U(ajwoVar);
        if (agevVarU4.g() && (((ajyg) agevVarU4.c()).b & SemanticState.Hidden) != 0 && (iAS = a.aS(((ajyg) agevVarU4.c()).k)) != 0) {
            i = iAS;
        }
        hboVar.J = i;
    }

    @Override // defpackage.vta, defpackage.vob
    public final void e() {
        f();
        vnx vnxVar = this.r;
        if (vnxVar != null) {
            vnxVar.c();
        }
        adwg adwgVar = this.o;
        if (adwgVar != null) {
            adwgVar.i();
        }
    }

    @Override // defpackage.vta
    public final void f() {
        this.t = false;
        ai().h(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // defpackage.vta
    public final void g(Throwable th) {
        super.ac();
        vta.Z(this.e, (String) this.c.a(th).c);
        ai().f(this.c.a(th).b, true, false, false);
    }

    @Override // defpackage.vta
    public final void h(wfy wfyVar) {
        if (wfyVar.g()) {
            LoadingFrameLayout loadingFrameLayoutAi = ai();
            String string = this.C.getResources().getString(R.string.no_results_found);
            ixz ixzVar = loadingFrameLayoutAi.b;
            ixzVar.getClass();
            ixzVar.h(string);
            loadingFrameLayoutAi.h(5);
            return;
        }
        agke agkeVarF = wfyVar.f();
        if (!agkeVarF.isEmpty()) {
            wgd wgdVarH = ((aftj) agkeVarF.get(0)).h();
            wgdVarH.getClass();
            adwg adwgVar = this.o;
            adwgVar.getClass();
            adwgVar.as(wgdVarH);
            apoq apoqVar = wgdVarH.a;
            apji apjiVar = apoqVar.j;
            if (apjiVar == null) {
                apjiVar = apji.a;
            }
            aihl aihlVarCheckIsLite = aihn.checkIsLite(aksl.a);
            apjiVar.c(aihlVarCheckIsLite);
            if (apjiVar.j.n(aihlVarCheckIsLite.d)) {
                this.r = this.z.L(this.e, null, new vnl(this, 1));
                vnx vnxVar = this.r;
                apji apjiVar2 = apoqVar.j;
                if (apjiVar2 == null) {
                    apjiVar2 = apji.a;
                }
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aksl.a);
                apjiVar2.c(aihlVarCheckIsLite2);
                Object objK = apjiVar2.j.k(aihlVarCheckIsLite2.d);
                vnxVar.g((aksk) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK)), adwgVar.I(), null);
                vnx vnxVar2 = this.r;
                ai().addView(((vnw) vnxVar2).a);
                vnxVar2.f();
            }
        }
        ai().h(3);
    }

    @Override // defpackage.vta, defpackage.adww
    public final void hP() {
        adwg adwgVar = this.o;
        if (adwgVar != null) {
            adwgVar.M(false);
        }
        adwj adwjVar = this.n;
        if (adwjVar != null) {
            adwjVar.b(1);
        }
        if (this.I != null) {
            this.h.execute(afwl.i(new gnc(this, 19)));
        }
    }

    @Override // defpackage.vmz, defpackage.vob
    public final boolean i() {
        jhh jhhVar = this.a;
        return jhhVar != null && jhhVar.b;
    }

    @Override // defpackage.vmz, defpackage.vob
    public final int j() {
        return this.J;
    }
}
