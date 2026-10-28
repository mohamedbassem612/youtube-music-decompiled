package defpackage;

import android.animation.AnimatorSet;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.android.flexbox.FlexboxLayout;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.makeramen.RoundedImageView;
import j$.lang.Iterable$EL;
import j$.util.Collection;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class hdj extends hdl implements xgm {
    private static final agrf O = agrf.h("com/google/android/apps/youtube/music/generatedthumbnails/GeneratedThumbnailsSelectorFragment");
    public adhv A;
    public jer B;
    public zwb C;
    public vxe D;
    public avmb E;
    public ttm F;
    public Executor G;
    public adxj H;
    public jin I;
    public jij J;
    public ahek K;
    public ytf L;
    public abxv M;
    public xpl N;
    private View P;
    private View Q;
    private RoundedImageView R;
    private RoundedImageView S;
    private RoundedImageView T;
    private RoundedImageView U;
    private FlexboxLayout V;
    private YouTubeTextView W;
    private ViewGroup X;
    private YouTubeTextView Y;
    private YouTubeTextView Z;
    private admu aa;
    private admo ab;
    private hdm ac;
    private jfr ad;
    private jfr ae;
    private jfr af;
    private jfr ag;
    private jbw ah;
    private jbm ai;
    private jbm aj;
    private jbm ak;
    private ggd al;
    private ggd am;
    private ggd an;
    private ggd ao;
    private ggd ap;
    private avmn aq;
    private aend ar;
    public View k;
    public ViewGroup l;
    public YouTubeTextView m;
    public RecyclerView n;
    public ViewGroup o;
    public ViewGroup p;
    public YouTubeTextView q;
    public jbm r;
    public alcw s;
    public ixi t;
    public ggd u;
    public ggd v;
    public int w;
    public String x;
    public AnimatorSet y;
    public xgn z;

    public static final boolean E(alwg alwgVar) {
        alwe alweVar = alwgVar.c;
        if (alweVar == null) {
            alweVar = alwe.a;
        }
        apji apjiVar = alweVar.b;
        if (apjiVar == null) {
            apjiVar = apji.a;
        }
        aihl aihlVarCheckIsLite = aihn.checkIsLite(alcx.a);
        apjiVar.c(aihlVarCheckIsLite);
        if (apjiVar.j.n(aihlVarCheckIsLite.d)) {
            alwe alweVar2 = alwgVar.c;
            if (alweVar2 == null) {
                alweVar2 = alwe.a;
            }
            apji apjiVar2 = alweVar2.b;
            if (apjiVar2 == null) {
                apjiVar2 = apji.a;
            }
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(alcx.a);
            apjiVar2.c(aihlVarCheckIsLite2);
            Object objK = apjiVar2.j.k(aihlVarCheckIsLite2.d);
            if (((alcw) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK))).d.size() > 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, zwh] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, java.util.List] */
    private final wry H(boolean z, Optional optional, Optional optional2) {
        aend aendVar = this.ar;
        if (aendVar == null || this.L == null) {
            return null;
        }
        wry wryVar = new wry(aendVar.b, aendVar.d.hw());
        wryVar.a = this.x;
        wryVar.b = Integer.valueOf(this.w);
        aigj aigjVar = m().c;
        if (aigjVar.E()) {
            wryVar.m();
        } else {
            wryVar.n(aigjVar);
        }
        if (optional.isPresent()) {
            wryVar.c = (String) optional.get();
        }
        if (optional2.isPresent()) {
            Integer num = (Integer) optional2.get();
            num.intValue();
            wryVar.d = num;
        }
        if (!z) {
            return wryVar;
        }
        for (int i = 0; i < this.s.g.size(); i++) {
            wryVar.e.add(Integer.valueOf(((agke) Collection.EL.stream(this.L.h(i)).map(new bwa(11)).collect(aghu.a)).indexOf((String) this.L.f.get(i))));
        }
        return wryVar;
    }

    private final aldp I() {
        ajwo ajwoVarM = m();
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aldp.b);
        ajwoVarM.c(aihlVarCheckIsLite);
        Object objK = ajwoVarM.j.k(aihlVarCheckIsLite.d);
        return (aldp) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
    }

    private final void J(aigj aigjVar) {
        this.z.p(new xgj(aigjVar, (amud) null), null);
    }

    private final void K() {
        ggd ggdVar = this.al;
        if (ggdVar != null) {
            ggdVar.b();
        }
        ggd ggdVar2 = this.ao;
        if (ggdVar2 != null) {
            ggdVar2.a();
        }
        ggd ggdVar3 = this.ap;
        if (ggdVar3 != null) {
            ggdVar3.a();
        }
        if (this.R != null) {
            this.ad = new jfr(getContext(), this.A, this.M, this.R);
        }
        if (this.T != null) {
            this.ae = new jfr(getContext(), this.A, this.M, this.T);
        }
        if (this.S != null) {
            this.af = new jfr(getContext(), this.A, this.M, this.S);
        }
        if (this.U != null) {
            this.ag = new jfr(getContext(), this.A, this.M, this.U);
        }
    }

    private final void L() {
        M();
        if (this.ab == null) {
            if (this.aa == null || this.L == null) {
                return;
            }
            admo admoVarD = this.K.d(this.B.a);
            this.ab = admoVarD;
            admoVarD.D(this.aa, null);
            this.ab.jR(new adxc(R.dimen.generated_thumbnail_corner_radius));
            this.ab.jR(new adlk(this.z, 0));
            this.ab.jR(new gob(this.L, 5));
            this.ab.jR(new hde(1));
            this.ab.jR(new hde(0));
            hdm hdmVar = new hdm(getContext(), i(), getResources().getDimensionPixelOffset(R.dimen.generated_thumbnails_gallery_margin), getResources().getDimensionPixelOffset(R.dimen.generated_thumbnails_gallery_item_margin));
            this.ac = hdmVar;
            RecyclerView recyclerView = this.n;
            if (recyclerView != null) {
                recyclerView.ah(hdmVar);
                this.n.aJ(new hdi(getResources()));
                this.n.ad(this.ab);
            }
        }
        RecyclerView recyclerView2 = this.n;
        if (recyclerView2 != null) {
            recyclerView2.v(new acne(this, 1));
        }
    }

    private final void M() {
        admu admuVar = this.aa;
        if (admuVar == null) {
            this.aa = new admu();
        } else {
            admuVar.clear();
        }
        for (int i = 0; i < i(); i++) {
            this.aa.add(anyi.a);
        }
    }

    private static final boolean N(int i, alay alayVar) {
        if (i > 0) {
            if (((alba) alayVar.c.get(i - 1)).c.equals("\n")) {
                return true;
            }
        }
        return false;
    }

    private static final void O(View view) {
        jvn jvnVar = view.getLayoutParams() != null ? (jvn) view.getLayoutParams() : new jvn();
        jvnVar.a = true;
        view.setLayoutParams(jvnVar);
    }

    private static final void P(View view) {
        view.setAccessibilityDelegate(new hdh());
    }

    public final void A(alwg alwgVar) {
        alwe alweVar = alwgVar.c;
        if (alweVar == null) {
            alweVar = alwe.a;
        }
        apji apjiVar = alweVar.b;
        if (apjiVar == null) {
            apjiVar = apji.a;
        }
        aihl aihlVarCheckIsLite = aihn.checkIsLite(alcx.a);
        apjiVar.c(aihlVarCheckIsLite);
        if (apjiVar.j.n(aihlVarCheckIsLite.d)) {
            alwe alweVar2 = alwgVar.c;
            if (alweVar2 == null) {
                alweVar2 = alwe.a;
            }
            apji apjiVar2 = alweVar2.b;
            if (apjiVar2 == null) {
                apjiVar2 = apji.a;
            }
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(alcx.a);
            apjiVar2.c(aihlVarCheckIsLite2);
            Object objK = apjiVar2.j.k(aihlVarCheckIsLite2.d);
            this.s = (alcw) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
        }
    }

    public final void B(anyi anyiVar) {
        jfr jfrVar;
        if (anyiVar != null) {
            adly adlyVar = new adly();
            new adxc(R.dimen.generated_thumbnail_corner_radius).a(adlyVar, null, -1);
            RoundedImageView roundedImageView = this.R;
            if (roundedImageView != null && roundedImageView.getVisibility() == 0 && (jfrVar = this.ae) != null && this.am != null && this.an != null) {
                jfrVar.hU(adlyVar, anyiVar);
                this.am.a();
                this.an.b();
                return;
            }
            jfr jfrVar2 = this.ad;
            if (jfrVar2 == null || this.am == null || this.an == null) {
                return;
            }
            jfrVar2.hU(adlyVar, anyiVar);
            this.am.b();
            this.an.a();
        }
    }

    public final void C(anyi anyiVar) {
        jfr jfrVar;
        jfr jfrVar2;
        if (anyiVar != null) {
            adly adlyVar = new adly();
            new hde(10).a(adlyVar, null, -1);
            RoundedImageView roundedImageView = this.S;
            if (roundedImageView != null && this.U != null && roundedImageView.getVisibility() == 4 && this.U.getVisibility() == 4 && (jfrVar2 = this.af) != null && this.ao != null) {
                jfrVar2.hU(adlyVar, anyiVar);
                this.ao.b();
                return;
            }
            RoundedImageView roundedImageView2 = this.S;
            if (roundedImageView2 != null && roundedImageView2.getVisibility() == 0 && (jfrVar = this.ag) != null && this.ao != null && this.ap != null) {
                jfrVar.hU(adlyVar, anyiVar);
                this.ao.a();
                this.ap.b();
                return;
            }
            jfr jfrVar3 = this.af;
            if (jfrVar3 == null || this.ao == null || this.ap == null) {
                return;
            }
            jfrVar3.hU(adlyVar, anyiVar);
            this.ao.b();
            this.ap.a();
        }
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, java.util.List] */
    public final void D() {
        ytf ytfVar = this.L;
        if (ytfVar != null) {
            if (!ytfVar.b.isEmpty() && !this.L.f.isEmpty()) {
                ytf ytfVar2 = this.L;
                if (!ytfVar2.b.equals(ytfVar2.f)) {
                    ViewGroup viewGroup = this.X;
                    if (viewGroup == null || this.W == null) {
                        return;
                    }
                    viewGroup.setVisibility(0);
                    this.W.setVisibility(4);
                    s(j());
                    J(k());
                    return;
                }
            }
            ViewGroup viewGroup2 = this.X;
            if (viewGroup2 == null || this.W == null) {
                return;
            }
            viewGroup2.setVisibility(4);
            this.W.setVisibility(0);
            J(j());
            s(k());
        }
    }

    @Override // defpackage.xgm
    public final xgn hB() {
        return this.z;
    }

    public final int i() {
        return hfn.G(getContext()) ? 8 : 4;
    }

    public final aigj j() {
        apji apjiVar = this.s.i;
        if (apjiVar == null) {
            apjiVar = apji.a;
        }
        aihl aihlVarCheckIsLite = aihn.checkIsLite(ajnp.a);
        apjiVar.c(aihlVarCheckIsLite);
        Object objK = apjiVar.j.k(aihlVarCheckIsLite.d);
        return ((ajnf) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK))).y;
    }

    public final aigj k() {
        apji apjiVar = this.s.h;
        if (apjiVar == null) {
            apjiVar = apji.a;
        }
        aihl aihlVarCheckIsLite = aihn.checkIsLite(ajnp.a);
        apjiVar.c(aihlVarCheckIsLite);
        Object objK = apjiVar.j.k(aihlVarCheckIsLite.d);
        return ((ajnf) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK))).y;
    }

    public final ajta l(alcw alcwVar, int i) {
        apji apjiVar = (apji) alcwVar.g.get(i);
        aihl aihlVarCheckIsLite = aihn.checkIsLite(ajtd.a);
        apjiVar.c(aihlVarCheckIsLite);
        if (!apjiVar.j.n(aihlVarCheckIsLite.d)) {
            return ajta.a;
        }
        apji apjiVar2 = (apji) alcwVar.g.get(i);
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(ajtd.a);
        apjiVar2.c(aihlVarCheckIsLite2);
        Object objK = apjiVar2.j.k(aihlVarCheckIsLite2.d);
        return (ajta) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
    }

    public final ajwo m() {
        Bundle arguments = getArguments();
        return arguments == null ? ajwo.a : vxg.b(arguments.getByteArray("invoking_navigation"));
    }

    public final void n() {
        List list;
        RecyclerView recyclerView = this.n;
        if (recyclerView != null && (list = recyclerView.x) != null) {
            list.clear();
        }
        AnimatorSet animatorSet = this.y;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.y.cancel();
        }
    }

    public final void o() {
        ggd ggdVar = this.al;
        if (ggdVar != null) {
            ggdVar.a();
        }
    }

    @Override // defpackage.cc, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        hdm hdmVar = new hdm(getContext(), i(), getResources().getDimensionPixelOffset(R.dimen.generated_thumbnails_gallery_margin), getResources().getDimensionPixelOffset(R.dimen.generated_thumbnails_gallery_item_margin));
        this.ac = hdmVar;
        RecyclerView recyclerView = this.n;
        if (recyclerView != null) {
            recyclerView.ah(hdmVar);
        }
    }

    @Override // defpackage.bp, defpackage.cc
    /* JADX INFO: renamed from: onCreate */
    public final void m658lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        super.m658lambda$performCreate$3$androidsupportv4appFragment(bundle);
        iO(2, R.style.Theme_YouTubeMusic_GeneratedThumbnailsDialog);
    }

    @Override // defpackage.cc
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.generated_thumbnails_selector, viewGroup, false);
        this.P = viewInflate;
        this.k = viewInflate.findViewById(R.id.generated_thumbnails_toolbar);
        this.l = (ViewGroup) this.P.findViewById(R.id.selected_theme_container);
        this.m = (YouTubeTextView) this.P.findViewById(R.id.selected_theme_container_text);
        this.o = (ViewGroup) this.P.findViewById(R.id.chip_cloud_container);
        this.V = (FlexboxLayout) this.P.findViewById(R.id.generate_thumbnails_text_container);
        this.n = (RecyclerView) this.P.findViewById(R.id.thumbnail_gallery);
        this.R = (RoundedImageView) this.P.findViewById(R.id.generate_thumbnails_preview);
        this.T = (RoundedImageView) this.P.findViewById(R.id.generate_thumbnails_preview_alt);
        this.Q = this.P.findViewById(R.id.preview_loading_container);
        this.S = (RoundedImageView) this.P.findViewById(R.id.generate_thumbnails_preview_background);
        this.U = (RoundedImageView) this.P.findViewById(R.id.generate_thumbnails_preview_background_alt);
        this.p = (ViewGroup) this.P.findViewById(R.id.generation_options_container);
        YouTubeTextView youTubeTextView = (YouTubeTextView) this.P.findViewById(R.id.send_feedback_button);
        this.q = youTubeTextView;
        P(youTubeTextView);
        this.W = (YouTubeTextView) this.P.findViewById(R.id.randomize_phrase_button);
        this.X = (ViewGroup) this.P.findViewById(R.id.create_thumbnails_button_container);
        this.Y = (YouTubeTextView) this.P.findViewById(R.id.create_thumbnails_button);
        this.Z = (YouTubeTextView) this.P.findViewById(R.id.save_playlist_thumbnail_button);
        ((ImageView) this.P.findViewById(R.id.selected_theme_container_arrow)).setImageResource(this.H.b(arqz.fP));
        P(this.Z);
        this.L = new ytf();
        this.t = new ixi();
        this.ai = this.J.a(this.W, null, new jn(this, 19, null), null, false);
        this.r = this.J.a(this.q, null, new jn(this, 20, null), null, false);
        this.aj = this.J.a(this.Y, this.X, new hdf(this, 1), null, false);
        this.ak = this.J.a(this.Z, null, new hdf(this, 0), null, false);
        View view = this.P;
        bcs bcsVar = new bcs(this, 2);
        int i = bac.a;
        azs.c(view, bcsVar);
        this.u = new ggd(this.k);
        this.v = new ggd(this.p);
        this.al = new ggd(this.Q);
        this.am = new ggd(this.R);
        this.an = new ggd(this.T);
        this.ao = new ggd(this.S);
        this.ap = new ggd(this.U);
        this.al.b = 300;
        this.am.b = 300;
        this.an.b = 300;
        this.ao.b = 300;
        this.ap.b = 300;
        xpl xplVar = this.N;
        zwa zwaVarE = this.C.e();
        this.ar = ((wrz) aguu.aw((Context) xplVar.b, wrz.class, ((syn) xplVar.a).m(zwaVarE))).I();
        p();
        return this.P;
    }

    @Override // defpackage.bp, defpackage.cc
    public final void onDestroyView() {
        super.onDestroyView();
        n();
        this.y = null;
        this.ar = null;
        this.u = null;
        this.v = null;
        this.al = null;
        this.am = null;
        this.an = null;
        this.ao = null;
        this.ap = null;
        this.I.c();
        this.P = null;
        this.k = null;
        this.l = null;
        this.m = null;
        this.n = null;
        this.R = null;
        this.T = null;
        this.S = null;
        this.U = null;
        this.Q = null;
        this.o = null;
        this.V = null;
        this.p = null;
        this.W = null;
        this.Y = null;
        this.ah = null;
        this.ad = null;
        this.ae = null;
        this.af = null;
        this.ag = null;
        this.ai = null;
        this.aj = null;
        this.ak = null;
        this.aa = null;
        this.ab = null;
        this.ac = null;
        this.L = null;
        this.t = null;
        Object obj = this.aq;
        if (obj != null) {
            awka.f((AtomicReference) obj);
            this.aq = null;
        }
    }

    @Override // defpackage.bp, defpackage.cc
    /* JADX INFO: renamed from: onSaveInstanceState */
    public final void m668x22bc4f96(Bundle bundle) {
        super.m668x22bc4f96(bundle);
        bundle.putByteArray("invoking_navigation", m().toByteArray());
    }

    @Override // defpackage.bp, defpackage.cc
    public final void onStart() {
        super.onStart();
        Dialog dialog = this.f;
        if (dialog == null || dialog.getWindow() == null) {
            return;
        }
        Window window = dialog.getWindow();
        window.setGravity(48);
        window.setWindowAnimations(R.style.SlideUpDownAnimation);
        azz.c(window, false);
    }

    public final void p() {
        aend aendVar;
        K();
        L();
        wry wryVarH = H(false, Optional.empty(), (I().c & 64) != 0 ? Optional.of(Integer.valueOf(I().h)) : Optional.empty());
        if (wryVarH == null || (aendVar = this.ar) == null) {
            return;
        }
        taf.k(this, aendVar.a(wryVarH, this.G), new glm(this, 13), new glm(this, 14));
    }

    public final void q(alwg alwgVar) {
        this.z.l(new xgj(alwgVar.d, (amud) null));
        alwe alweVar = alwgVar.c;
        if (alweVar == null) {
            alweVar = alwe.a;
        }
        apji apjiVar = alweVar.b;
        if (apjiVar == null) {
            apjiVar = apji.a;
        }
        aihl aihlVarCheckIsLite = aihn.checkIsLite(alcx.a);
        apjiVar.c(aihlVarCheckIsLite);
        Object objK = apjiVar.j.k(aihlVarCheckIsLite.d);
        s(((alcw) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK))).l);
    }

    public final void r(aigj aigjVar) {
        this.z.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, new xgj(aigjVar, (amud) null), null);
    }

    public final void s(aigj aigjVar) {
        this.z.w(new xgj(aigjVar, (amud) null), null);
    }

    public final void t(Throwable th, Optional optional) {
        View view;
        jin jinVar = this.I;
        if (jinVar.b == null && (view = this.P) != null) {
            jinVar.b = view.findViewById(R.id.snackbar_container);
        }
        ((agrc) ((agrc) ((agrc) O.b()).j(th)).k("com/google/android/apps/youtube/music/generatedthumbnails/GeneratedThumbnailsSelectorFragment", "onErrorResponse", (char) 452, "GeneratedThumbnailsSelectorFragment.java")).t("Error getting generated thumbnails.");
        String strB = this.F.b(th);
        this.I.b();
        jio jioVarE = jin.e();
        jik jikVar = (jik) jioVarE;
        jikVar.k(strB);
        jikVar.i(-2);
        jioVarE.l(getResources().getText(R.string.yt_lib_common_retry), optional.isPresent() ? new gdp(this, optional, 3) : new jn(this, 18, null));
        this.I.d(jioVarE.b());
        n();
        M();
        B(anyi.a);
        o();
    }

    public final void u() {
        if (this.ai != null) {
            apji apjiVar = this.s.h;
            if (apjiVar == null) {
                apjiVar = apji.a;
            }
            aihl aihlVarCheckIsLite = aihn.checkIsLite(ajnp.a);
            apjiVar.c(aihlVarCheckIsLite);
            if (apjiVar.j.n(aihlVarCheckIsLite.d)) {
                apji apjiVar2 = this.s.h;
                if (apjiVar2 == null) {
                    apjiVar2 = apji.a;
                }
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(ajnp.a);
                apjiVar2.c(aihlVarCheckIsLite2);
                Object objK = apjiVar2.j.k(aihlVarCheckIsLite2.d);
                this.ai.hU(new adly(), (ajnf) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK)));
            }
        }
        if (this.aj != null) {
            apji apjiVar3 = this.s.i;
            if (apjiVar3 == null) {
                apjiVar3 = apji.a;
            }
            aihl aihlVarCheckIsLite3 = aihn.checkIsLite(ajnp.a);
            apjiVar3.c(aihlVarCheckIsLite3);
            if (apjiVar3.j.n(aihlVarCheckIsLite3.d)) {
                apji apjiVar4 = this.s.i;
                if (apjiVar4 == null) {
                    apjiVar4 = apji.a;
                }
                aihl aihlVarCheckIsLite4 = aihn.checkIsLite(ajnp.a);
                apjiVar4.c(aihlVarCheckIsLite4);
                Object objK2 = apjiVar4.j.k(aihlVarCheckIsLite4.d);
                Object objC = objK2 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK2);
                adly adlyVar = new adly();
                adlyVar.f("useGradientBorder", Boolean.TRUE);
                this.aj.hU(adlyVar, (ajnf) objC);
            }
        }
        if (this.ak != null) {
            apji apjiVar5 = this.s.j;
            if (apjiVar5 == null) {
                apjiVar5 = apji.a;
            }
            aihl aihlVarCheckIsLite5 = aihn.checkIsLite(ajnp.a);
            apjiVar5.c(aihlVarCheckIsLite5);
            if (apjiVar5.j.n(aihlVarCheckIsLite5.d)) {
                apji apjiVar6 = this.s.j;
                if (apjiVar6 == null) {
                    apjiVar6 = apji.a;
                }
                aihl aihlVarCheckIsLite6 = aihn.checkIsLite(ajnp.a);
                apjiVar6.c(aihlVarCheckIsLite6);
                Object objK3 = apjiVar6.j.k(aihlVarCheckIsLite6.d);
                Object objC2 = objK3 == null ? aihlVarCheckIsLite6.b : aihlVarCheckIsLite6.c(objK3);
                adly adlyVar2 = new adly();
                adlyVar2.a(this.z);
                this.ak.hU(adlyVar2, (ajnf) objC2);
            }
        }
        D();
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.List] */
    public final void v() {
        ViewGroup viewGroup;
        if (this.L != null) {
            for (int i = 0; i < this.s.g.size(); i++) {
                ytf ytfVar = this.L;
                ajta ajtaVarL = l(this.s, i);
                ytfVar.e.add((agke) Collection.EL.stream(ajtaVarL.c).map(new bwa(10)).collect(aghu.a));
                List list = ytfVar.c;
                ajsx ajsxVarA = ajsx.a(ajtaVarL.f);
                if (ajsxVarA == null) {
                    ajsxVarA = ajsx.CHIP_CLOUD_SELECTION_BEHAVIOR_UNKNOWN;
                }
                list.add(ajsxVarA);
            }
            ajta ajtaVarL2 = l(this.s, 0);
            jer jerVar = this.B;
            if (jerVar == null || (viewGroup = this.o) == null) {
                return;
            }
            this.ah = (jbw) adul.e(jerVar.a, ajtaVarL2, viewGroup);
            adly adlyVar = new adly();
            View view = this.P;
            if (view != null) {
                adlyVar.f("backgroundColor", Integer.valueOf(view.getContext().getColor(android.R.color.transparent)));
            }
            ixi ixiVar = this.t;
            if (ixiVar != null) {
                adlyVar.f("chipCloudController", ixiVar);
            }
            adlyVar.f("chipCloudChipEnableUnlimitedWidth", Boolean.TRUE);
            adlyVar.f("chipCloudPagePadding", Integer.valueOf(getResources().getDimensionPixelOffset(R.dimen.generated_thumbnails_gallery_margin)));
            jbw jbwVar = this.ah;
            if (jbwVar != null) {
                jbwVar.hU(adlyVar, ajtaVarL2);
                if (this.o.indexOfChild(this.ah.a()) < 0) {
                    this.o.addView(this.ah.a());
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v16, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v20, types: [java.lang.Object, java.util.List] */
    public final void w() {
        FlexboxLayout flexboxLayout = this.V;
        if (flexboxLayout == null || this.L == null) {
            return;
        }
        flexboxLayout.removeAllViews();
        alay alayVar = this.s.f;
        if (alayVar == null) {
            alayVar = alay.a;
        }
        this.L.b.clear();
        this.L.f.clear();
        for (int i = 0; i < alayVar.c.size(); i++) {
            alba albaVar = (alba) alayVar.c.get(i);
            if ((albaVar.b & SemanticState.Modal) != 0) {
                View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.tappable_prompt_term, (ViewGroup) this.V, false);
                ((YouTubeTextView) viewInflate.findViewById(R.id.term_text)).setText(albaVar.c);
                viewInflate.setOnClickListener(new gdp(this, albaVar, 2));
                if (N(i, alayVar)) {
                    O(viewInflate);
                }
                this.L.a.add(viewInflate);
                this.L.b.add(albaVar.c);
                this.L.f.add(albaVar.c);
                this.V.addView(viewInflate);
            } else {
                ArrayList arrayList = new ArrayList();
                Iterable$EL.forEach(agfm.c(" ").e().a().f(albaVar.c), new gmk(arrayList, 4));
                int i2 = 0;
                while (i2 < arrayList.size()) {
                    String str = (String) arrayList.get(i2);
                    YouTubeTextView youTubeTextView = new YouTubeTextView(getContext());
                    youTubeTextView.setText(str);
                    youTubeTextView.setIncludeFontPadding(false);
                    youTubeTextView.setMaxLines(1);
                    youTubeTextView.setTextAppearance(R.style.TextAppearance_YouTubeMusic_GeneratedThumbnailsPrompt);
                    float dimension = getResources().getDimension(R.dimen.generated_thumbnail_prompt_term_padding) + getResources().getDimension(R.dimen.generated_thumbnail_prompt_term_bottom_margin);
                    int dimension2 = (int) getResources().getDimension(R.dimen.generated_thumbnail_prompt_template_word_margin);
                    youTubeTextView.setPadding(dimension2, 0, dimension2, (int) dimension);
                    if (i2 == 0) {
                        if (N(i, alayVar)) {
                            O(youTubeTextView);
                        }
                        i2 = 0;
                    }
                    this.V.addView(youTubeTextView);
                    i2++;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x008f  */
    public final void x() {
        anyi anyiVar;
        if (this.s.d.size() != 0) {
            o();
            alcw alcwVar = this.s;
            apji apjiVar = alcwVar.e;
            if (apjiVar == null) {
                apjiVar = apji.a;
            }
            aihl aihlVarCheckIsLite = aihn.checkIsLite(anyj.a);
            apjiVar.c(aihlVarCheckIsLite);
            if (apjiVar.j.n(aihlVarCheckIsLite.d)) {
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(anyj.a);
                apjiVar.c(aihlVarCheckIsLite2);
                Object objK = apjiVar.j.k(aihlVarCheckIsLite2.d);
                anyiVar = (anyi) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
            } else if (alcwVar.d.size() > 0) {
                apji apjiVar2 = (apji) alcwVar.d.get(0);
                aihl aihlVarCheckIsLite3 = aihn.checkIsLite(anyj.a);
                apjiVar2.c(aihlVarCheckIsLite3);
                if (apjiVar2.j.n(aihlVarCheckIsLite3.d)) {
                    apji apjiVar3 = (apji) alcwVar.d.get(0);
                    aihl aihlVarCheckIsLite4 = aihn.checkIsLite(anyj.a);
                    apjiVar3.c(aihlVarCheckIsLite4);
                    Object objK2 = apjiVar3.j.k(aihlVarCheckIsLite4.d);
                    anyiVar = (anyi) (objK2 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK2));
                } else {
                    anyiVar = null;
                }
            } else {
                anyiVar = null;
            }
            if (anyiVar != null) {
                B(anyiVar);
                C(anyiVar);
            }
            Object obj = this.aq;
            if (obj != null) {
                awka.f((AtomicReference) obj);
            }
            ytf ytfVar = this.L;
            if (ytfVar != null) {
                this.aq = ((lqa) ytfVar.g).L().p().L(this.E).al(new hbr(this, 14), new glg(14));
            }
        }
    }

    public final void y() {
        n();
        admu admuVar = this.aa;
        if (admuVar != null) {
            admuVar.clear();
            for (apji apjiVar : this.s.d) {
                aihl aihlVarCheckIsLite = aihn.checkIsLite(anyj.a);
                apjiVar.c(aihlVarCheckIsLite);
                if (apjiVar.j.n(aihlVarCheckIsLite.d)) {
                    admu admuVar2 = this.aa;
                    aihl aihlVarCheckIsLite2 = aihn.checkIsLite(anyj.a);
                    apjiVar.c(aihlVarCheckIsLite2);
                    Object objK = apjiVar.j.k(aihlVarCheckIsLite2.d);
                    admuVar2.add(objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
                }
            }
            apji apjiVar2 = this.s.k;
            if (apjiVar2 == null) {
                apjiVar2 = apji.a;
            }
            aihl aihlVarCheckIsLite3 = aihn.checkIsLite(anyf.a);
            apjiVar2.c(aihlVarCheckIsLite3);
            if (apjiVar2.j.n(aihlVarCheckIsLite3.d)) {
                admu admuVar3 = this.aa;
                apji apjiVar3 = this.s.k;
                if (apjiVar3 == null) {
                    apjiVar3 = apji.a;
                }
                aihl aihlVarCheckIsLite4 = aihn.checkIsLite(anyf.a);
                apjiVar3.c(aihlVarCheckIsLite4);
                Object objK2 = apjiVar3.j.k(aihlVarCheckIsLite4.d);
                admuVar3.add(objK2 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK2));
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, java.util.Collection] */
    public final void z(aldp aldpVar) {
        boolean z = aldpVar.f;
        wry wryVarH = H(z, (aldpVar.c & 16) != 0 ? Optional.of(aldpVar.g) : Optional.empty(), (aldpVar.c & 64) != 0 ? Optional.of(Integer.valueOf(aldpVar.h)) : Optional.empty());
        if (wryVarH != null) {
            if (!z) {
                ggd ggdVar = this.v;
                if (ggdVar != null) {
                    ggdVar.a();
                }
                ViewGroup viewGroup = this.o;
                if (viewGroup != null) {
                    viewGroup.setVisibility(4);
                }
            }
            K();
            L();
            ytf ytfVar = this.L;
            if (ytfVar != null) {
                agke agkeVarN = agke.n(ytfVar.f);
                aend aendVar = this.ar;
                if (aendVar != null) {
                    taf.k(this, aendVar.a(wryVarH, this.G), new hcq(this, aldpVar, 3), new uor(this, z, agkeVarN, aldpVar, 1));
                }
            }
        }
    }
}
