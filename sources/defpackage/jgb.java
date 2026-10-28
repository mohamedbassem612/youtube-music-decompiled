package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.net.Uri;
import android.text.Spanned;
import android.util.Size;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Space;
import android.widget.TextView;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jgb extends jbe {
    private static final agrf x = agrf.h("com/google/android/apps/youtube/music/ui/presenter/MusicVisualHeaderPresenter");
    private final iyr A;
    private final ImageView B;
    private final FrameLayout C;
    private final TextView D;
    private final TextView E;
    private final LinearLayout F;
    private final LinearLayout G;
    private final FrameLayout H;
    private final FrameLayout I;
    private final TextView J;
    private final TextView K;
    private final Space L;
    private anzx M;
    private final aifk N;
    private final jij O;
    private final adhv y;
    private final admh z;

    /* JADX WARN: Type inference failed for: r2v3, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [awmd, java.lang.Object] */
    public jgb(Context context, adhv adhvVar, izr izrVar, gmj gmjVar, jij jijVar, aifk aifkVar, inn innVar, admh admhVar, iwe iweVar, hfn hfnVar, View view) {
        super(context, izrVar, view, innVar, iweVar, hfnVar);
        this.y = adhvVar;
        this.N = aifkVar;
        this.z = admhVar;
        this.B = (ImageView) view.findViewById(R.id.background_image);
        this.C = (FrameLayout) view.findViewById(R.id.foreground_image_container);
        TextView textView = (TextView) view.findViewById(R.id.pronouns);
        this.D = textView;
        TextView textView2 = (TextView) view.findViewById(R.id.subscriber_count);
        this.E = textView2;
        View viewFindViewById = view.findViewById(R.id.subscription_info_container);
        TextView textView3 = (TextView) view.findViewById(R.id.subscribe_button);
        Activity activity = (Activity) gmjVar.f.io();
        activity.getClass();
        tfq tfqVar = (tfq) gmjVar.b.io();
        tfqVar.getClass();
        tts ttsVar = (tts) gmjVar.e.io();
        ttsVar.getClass();
        vxe vxeVar = (vxe) gmjVar.d.io();
        vxeVar.getClass();
        avlh avlhVar = (avlh) gmjVar.a.io();
        avlhVar.getClass();
        ((jnj) gmjVar.c.io()).getClass();
        textView3.getClass();
        this.A = new iyr(activity, tfqVar, ttsVar, vxeVar, avlhVar, viewFindViewById, textView3, textView2, textView);
        this.O = jijVar;
        this.F = (LinearLayout) view.findViewById(R.id.subscription_info_container);
        this.G = (LinearLayout) view.findViewById(R.id.specialty_buttons_container);
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.primary_button_container);
        this.H = frameLayout;
        this.I = (FrameLayout) view.findViewById(R.id.secondary_button_container);
        this.J = (TextView) view.findViewById(R.id.primary_button);
        this.K = (TextView) view.findViewById(R.id.secondary_button);
        this.L = (Space) view.findViewById(R.id.toolbar_spacer_view);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
        layoutParams.setMarginEnd(context.getResources().getDimensionPixelSize(R.dimen.visual_header_spacing_large));
        frameLayout.setLayoutParams(layoutParams);
    }

    private final void i() {
        adia adiaVar = this.d;
        if (adiaVar != null) {
            adiaVar.a();
            this.d.d(8);
            this.d = null;
        }
    }

    private final void j() {
        Size size;
        i();
        Context context = this.a;
        int i = twm.i(context);
        if (twm.u(context) || twm.v(context)) {
            size = new Size(i, context.getResources().getDimensionPixelSize(R.dimen.visual_header_tablet_image_height));
        } else {
            size = new Size(i, yno.H(context) ? context.getResources().getDimensionPixelOffset(R.dimen.visual_header_landscape_image_height) : (int) (i * 0.85f));
        }
        this.f.getLayoutParams().height = size.getHeight();
        apji apjiVar = this.M.e;
        if (apjiVar == null) {
            apjiVar = apji.a;
        }
        Optional optionalH = kro.H(apjiVar, anyj.a);
        if (optionalH.isPresent()) {
            aqmh aqmhVar = ((anyi) optionalH.get()).c;
            if (aqmhVar == null) {
                aqmhVar = aqmh.a;
            }
            aqmh aqmhVarN = aqmhVar;
            this.d = new adia(this.y, this.B, false);
            adia adiaVar = this.d;
            int width = size.getWidth();
            int height = size.getHeight();
            Uri uriG = aawb.G(aqmhVarN, width, height);
            aifk aifkVar = this.N;
            if (aifkVar.b(uriG)) {
                aifn aifnVar = new aifn();
                aifnVar.a(height);
                aifnVar.c(width);
                aifnVar.b();
                try {
                    aqmhVarN = aawb.N(aifkVar.c(aifnVar, uriG));
                } catch (oam e) {
                    ((agrc) ((agrc) ((agrc) x.b().i(agso.a, "MusicVisualHeaderPresen")).j(e)).k("com/google/android/apps/youtube/music/ui/presenter/MusicVisualHeaderPresenter", "createSmartCropThumbnailDetails", (char) 347, "MusicVisualHeaderPresenter.java")).t("Invalid thumbnail URI");
                }
            }
            adiaVar.f(aqmhVarN, null);
        }
        this.B.setVisibility(0);
    }

    private final void k(TextView textView) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) textView.getLayoutParams();
        layoutParams.addRule(12);
        layoutParams.setMargins(0, 0, 0, (int) this.a.getResources().getDimension(R.dimen.visual_header_spacing_small));
        textView.setLayoutParams(layoutParams);
    }

    @Override // defpackage.jbe, defpackage.adma
    public final View a() {
        return this.e;
    }

    @Override // defpackage.jbe, defpackage.adma
    public final void b(admh admhVar) {
        super.b(admhVar);
        i();
        this.A.a();
        this.G.setVisibility(8);
        this.H.setVisibility(8);
        this.I.setVisibility(8);
        kro.X(this.C, admhVar);
    }

    @Override // defpackage.jbe
    protected final int d() {
        return R.layout.visual_header;
    }

    @Override // defpackage.jbe, defpackage.gdy
    public final void hS(Configuration configuration) {
        j();
    }

    @Override // defpackage.jbe, defpackage.adma
    public final /* synthetic */ void hU(adly adlyVar, Object obj) {
        alay alayVar;
        alay alayVar2;
        anzx anzxVar = (anzx) obj;
        super.hU(adlyVar, anzxVar);
        anzxVar.getClass();
        this.M = anzxVar;
        anfy anfyVar = null;
        if (!anzxVar.g.E()) {
            this.v.w(new xgj(this.M.g, (amud) null), null);
        }
        anzx anzxVar2 = this.M;
        if ((anzxVar2.b & 1) != 0) {
            alayVar = anzxVar2.c;
            if (alayVar == null) {
                alayVar = alay.a;
            }
        } else {
            alayVar = null;
        }
        Spanned spannedK = ackj.k(null, alayVar, null, false);
        TextView textView = this.g;
        tuk.u(textView, spannedK);
        TextView textView2 = this.r;
        textView2.setText(spannedK);
        if (adlyVar.j("isSideloadedContext")) {
            tuk.l(this.f, false);
            tuk.l(this.F, false);
            tuk.l(textView, false);
            tuk.u(textView2, spannedK);
            g();
            Space space = this.L;
            tuk.l(space, true);
            space.setLayoutParams(new LinearLayout.LayoutParams(-1, this.p.getHeight() - ((int) this.a.getResources().getDimension(R.dimen.item_large_spacing))));
        } else {
            anzx anzxVar3 = this.M;
            int i = anzxVar3.b & SemanticState.Obscured;
            TextView textView3 = this.D;
            if (i != 0) {
                alay alayVar3 = anzxVar3.m;
                if (alayVar3 == null) {
                    alayVar3 = alay.a;
                }
                textView3.setText(ackj.k(null, alayVar3, null, false));
                tuk.l(textView3, true);
            } else {
                tuk.l(textView3, false);
            }
            j();
            int i2 = this.M.b & 8;
            FrameLayout frameLayout = this.C;
            if (i2 != 0) {
                frameLayout.setVisibility(0);
                apji apjiVar = this.M.f;
                if (apjiVar == null) {
                    apjiVar = apji.a;
                }
                Optional optionalH = kro.H(apjiVar, anyj.a);
                if (optionalH.isPresent()) {
                    kro.P((anyi) optionalH.get(), frameLayout, this.z, adlyVar);
                }
            } else {
                frameLayout.setVisibility(8);
            }
            apji apjiVar2 = this.M.d;
            if (apjiVar2 == null) {
                apjiVar2 = apji.a;
            }
            Optional optionalH2 = kro.H(apjiVar2, aqer.a);
            if (optionalH2.isPresent()) {
                iyr iyrVar = this.A;
                iyrVar.a = this.M.n;
                iyrVar.b((aqen) optionalH2.get());
                TextView textView4 = this.E;
                if ((((aqen) optionalH2.get()).b & 64) != 0) {
                    alayVar2 = ((aqen) optionalH2.get()).f;
                    if (alayVar2 == null) {
                        alayVar2 = alay.a;
                    }
                } else {
                    alayVar2 = null;
                }
                textView4.setText(ackj.k(null, alayVar2, null, false));
                tuk.l(this.F, true);
            } else {
                tuk.l(this.F, false);
                TextView textView5 = this.D;
                if (textView5.getVisibility() == 0) {
                    k(textView5);
                } else {
                    k(textView);
                }
            }
        }
        Context context = this.a;
        if (twm.u(context) || twm.v(context)) {
            FrameLayout frameLayout2 = this.H;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout2.getLayoutParams();
            FrameLayout frameLayout3 = this.I;
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) frameLayout3.getLayoutParams();
            layoutParams.width = -2;
            layoutParams.weight = 0.0f;
            layoutParams2.width = -2;
            layoutParams2.weight = 0.0f;
            frameLayout2.setLayoutParams(layoutParams);
            frameLayout3.setLayoutParams(layoutParams2);
            this.G.setGravity(1);
        }
        adly adlyVar2 = new adly();
        adlyVar2.a(this.v);
        apji apjiVar3 = this.M.j;
        if (apjiVar3 == null) {
            apjiVar3 = apji.a;
        }
        Optional optionalH3 = kro.H(apjiVar3, ajnp.a);
        if (optionalH3.isEmpty()) {
            apji apjiVar4 = this.M.h;
            if (apjiVar4 == null) {
                apjiVar4 = apji.a;
            }
            optionalH3 = kro.H(apjiVar4, ajnp.a);
        }
        if (optionalH3.isPresent()) {
            FrameLayout frameLayout4 = this.H;
            frameLayout4.setVisibility(0);
            this.G.setVisibility(0);
            this.O.a(this.J, frameLayout4, null, null, false).j(adlyVar2, (ajnf) optionalH3.get(), 27);
        }
        apji apjiVar5 = this.M.k;
        if (apjiVar5 == null) {
            apjiVar5 = apji.a;
        }
        Optional optionalH4 = kro.H(apjiVar5, ajnp.a);
        if (optionalH4.isEmpty()) {
            apji apjiVar6 = this.M.i;
            if (apjiVar6 == null) {
                apjiVar6 = apji.a;
            }
            optionalH4 = kro.H(apjiVar6, ajnp.a);
        }
        if (optionalH4.isPresent()) {
            FrameLayout frameLayout5 = this.I;
            frameLayout5.setVisibility(0);
            this.G.setVisibility(0);
            this.O.a(this.K, frameLayout5, null, null, false).j(adlyVar2, (ajnf) optionalH4.get(), 35);
        }
        anzx anzxVar4 = this.M;
        if ((anzxVar4.b & SemanticState.Modal) != 0) {
            apji apjiVar7 = anzxVar4.l;
            if (apjiVar7 == null) {
                apjiVar7 = apji.a;
            }
            aihl aihlVarCheckIsLite = aihn.checkIsLite(angi.a);
            apjiVar7.c(aihlVarCheckIsLite);
            if (apjiVar7.j.n(aihlVarCheckIsLite.d)) {
                apji apjiVar8 = this.M.l;
                if (apjiVar8 == null) {
                    apjiVar8 = apji.a;
                }
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(angi.a);
                apjiVar8.c(aihlVarCheckIsLite2);
                Object objK = apjiVar8.j.k(aihlVarCheckIsLite2.d);
                anfyVar = (anfy) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
            }
            anfy anfyVar2 = anfyVar;
            izr izrVar = this.b;
            izrVar.m(this.e, this.n, anfyVar2, this.M, this.v);
            izrVar.f(this.m, anfyVar2, this.M, this.v);
        }
    }
}
