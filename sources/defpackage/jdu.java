package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.net.Uri;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jdu extends jbe {
    private static final agrf z = agrf.h("com/google/android/apps/youtube/music/ui/presenter/MusicImmersiveHeaderPresenter");
    private final adhv A;
    private final iyr B;
    private final ImageView C;
    private final View D;
    private final ImageView E;
    private final YouTubeTextView F;
    private final TextView G;
    private final View H;
    private final LinearLayout I;
    private final LinearLayout J;
    private final FrameLayout K;
    private final FrameLayout L;
    private final TextView M;
    private final TextView N;
    private final Space O;
    private anpr P;
    private final aifk Q;
    private final jij R;
    public final jig x;
    public final Button y;

    /* JADX WARN: Type inference failed for: r1v21, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v23, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v25, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8, types: [awmd, java.lang.Object] */
    public jdu(Context context, adhv adhvVar, izr izrVar, gmj gmjVar, jij jijVar, aifk aifkVar, inn innVar, iwe iweVar, hfn hfnVar, View view) {
        super(context, izrVar, view, innVar, iweVar, hfnVar);
        this.A = adhvVar;
        this.Q = aifkVar;
        this.R = jijVar;
        this.C = (ImageView) view.findViewById(R.id.wide_thumbnail);
        this.D = view.findViewById(R.id.circle_thumbnail_container);
        this.E = (ImageView) view.findViewById(R.id.circle_thumbnail);
        YouTubeTextView youTubeTextView = (YouTubeTextView) view.findViewById(R.id.entity_header_description);
        this.F = youTubeTextView;
        Button button = (Button) view.findViewById(R.id.description_collapse_button);
        this.y = button;
        this.H = view.findViewById(R.id.entity_header_shadow);
        this.x = new jig(youTubeTextView, 3, 50);
        youTubeTextView.setOnClickListener(new ivp(this, 15));
        button.setOnClickListener(new ivp(this, 16));
        this.G = (TextView) view.findViewById(R.id.subscriber_count);
        TextView textView = (TextView) view.findViewById(R.id.subscribe_button);
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
        textView.getClass();
        this.B = new iyr(activity, tfqVar, ttsVar, vxeVar, avlhVar, null, textView, null, null);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.item_extra_small_spacing);
        this.l.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        this.I = (LinearLayout) view.findViewById(R.id.subscription_info_container);
        this.J = (LinearLayout) view.findViewById(R.id.specialty_buttons_container);
        this.K = (FrameLayout) view.findViewById(R.id.play_specialty_button_container);
        this.L = (FrameLayout) view.findViewById(R.id.radio_specialty_button_container);
        this.M = (TextView) view.findViewById(R.id.play_specialty_button);
        this.N = (TextView) view.findViewById(R.id.radio_specialty_button);
        this.O = (Space) view.findViewById(R.id.toolbar_spacer_view);
    }

    private final void i() {
        adia adiaVar = this.d;
        if (adiaVar != null) {
            adiaVar.a();
            this.d.d(8);
            this.d = null;
        }
        this.H.setVisibility(8);
    }

    private final void j(int i) {
        Pair pair;
        ImageView imageView;
        int iIntValue;
        int iIntValue2;
        i();
        Context context = this.a;
        int i2 = twm.i(context);
        if (i == 2) {
            pair = (twm.u(context) || twm.v(context)) ? new Pair(Integer.valueOf(i2), Integer.valueOf(context.getResources().getDimensionPixelSize(R.dimen.remix_artist_page_tablet_landscape_header_image_height))) : new Pair(Integer.valueOf(i2), Integer.valueOf(context.getResources().getDimensionPixelSize(R.dimen.remix_artist_page_landscape_header_image_height)));
        } else {
            pair = new Pair(Integer.valueOf(i2), Integer.valueOf((i2 * 9) / 16));
        }
        this.f.getLayoutParams().height = ((Integer) pair.second).intValue();
        apji apjiVar = this.P.h;
        if (apjiVar == null) {
            apjiVar = apji.a;
        }
        Optional optionalH = kro.H(apjiVar, anyj.a);
        if (!optionalH.isPresent()) {
            this.f.setVisibility(8);
            return;
        }
        aqmh aqmhVarN = ((anyi) optionalH.get()).c;
        if (aqmhVarN == null) {
            aqmhVarN = aqmh.a;
        }
        if (!aawb.O(aqmhVarN)) {
            ImageView imageView2 = this.E;
            imageView2.setImageResource(R.drawable.cover_profile_empty_state);
            imageView2.setVisibility(0);
            return;
        }
        aqmg aqmgVarJ = aawb.J(aqmhVarN);
        int iAU = a.aU(((anyi) optionalH.get()).d);
        if ((iAU == 0 || iAU != 2) && (aqmgVarJ == null || aqmgVarJ.d >= Math.min(((Integer) pair.first).intValue(), 1000))) {
            imageView = this.C;
            iIntValue = ((Integer) pair.first).intValue();
            iIntValue2 = ((Integer) pair.second).intValue();
            this.H.setVisibility(0);
        } else {
            imageView = this.E;
            iIntValue = (((Integer) pair.second).intValue() - this.D.getPaddingTop()) - imageView.getPaddingBottom();
            iIntValue2 = iIntValue;
        }
        this.d = new adia(this.A, imageView, false);
        adia adiaVar = this.d;
        Uri uriG = aawb.G(aqmhVarN, iIntValue, iIntValue2);
        aifk aifkVar = this.Q;
        if (aifkVar.b(uriG)) {
            aifn aifnVar = new aifn();
            aifnVar.a(iIntValue2);
            aifnVar.c(iIntValue);
            aifnVar.b();
            try {
                aqmhVarN = aawb.N(aifkVar.c(aifnVar, uriG));
            } catch (oam e) {
                ((agrc) ((agrc) ((agrc) z.b().i(agso.a, "MusicImmHeaderPresent")).j(e)).k("com/google/android/apps/youtube/music/ui/presenter/MusicImmersiveHeaderPresenter", "createSmartCropThumbnailDetails", (char) 355, "MusicImmersiveHeaderPresenter.java")).t("Invalid thumbnail URI");
            }
        }
        adiaVar.f(aqmhVarN, null);
        this.d.d(0);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x002c  */
    private final void k(int i) {
        FrameLayout frameLayout = this.L;
        FrameLayout frameLayout2 = this.K;
        LinearLayout linearLayout = this.J;
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = frameLayout2.getLayoutParams();
        ViewGroup.LayoutParams layoutParams3 = frameLayout.getLayoutParams();
        if (i != 2) {
            Context context = this.a;
            if (twm.u(context) || twm.v(context)) {
                layoutParams.width = -2;
                layoutParams2.width = -2;
                layoutParams3.width = -2;
            } else {
                layoutParams.width = -1;
                layoutParams2.width = 0;
                layoutParams3.width = 0;
            }
        } else {
            layoutParams.width = -2;
            layoutParams2.width = -2;
            layoutParams3.width = -2;
        }
        linearLayout.setLayoutParams(layoutParams);
        frameLayout2.setLayoutParams(layoutParams2);
        frameLayout.setLayoutParams(layoutParams3);
    }

    @Override // defpackage.jbe, defpackage.adma
    public final View a() {
        return this.e;
    }

    @Override // defpackage.jbe, defpackage.adma
    public final void b(admh admhVar) {
        super.b(admhVar);
        i();
        this.B.a();
        this.J.setVisibility(8);
        this.K.setVisibility(8);
        this.L.setVisibility(8);
        this.y.setVisibility(8);
    }

    @Override // defpackage.jbe
    protected final int d() {
        return R.layout.immersive_header;
    }

    @Override // defpackage.jbe
    protected final int f() {
        return this.p.getHeight() + this.w.K();
    }

    @Override // defpackage.jbe, defpackage.gdy
    public final void hS(Configuration configuration) {
        k(configuration.orientation);
        j(configuration.orientation);
    }

    @Override // defpackage.jbe, defpackage.adma
    public final /* synthetic */ void hU(adly adlyVar, Object obj) {
        alay alayVar;
        alay alayVar2;
        alay alayVar3;
        anpr anprVar = (anpr) obj;
        super.hU(adlyVar, anprVar);
        anprVar.getClass();
        this.P = anprVar;
        if (!anprVar.i.E()) {
            this.v.w(new xgj(anprVar.i, (amud) null), null);
        }
        if ((anprVar.b & 1) != 0) {
            alayVar = anprVar.c;
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
            tuk.l(this.I, false);
            tuk.l(textView, false);
            tuk.u(textView2, spannedK);
            g();
            Space space = this.O;
            tuk.l(space, true);
            space.setLayoutParams(new LinearLayout.LayoutParams(-1, this.p.getHeight() - ((int) this.a.getResources().getDimension(R.dimen.item_large_spacing))));
        } else {
            j(this.a.getResources().getConfiguration().orientation);
            apji apjiVar = this.P.d;
            if (apjiVar == null) {
                apjiVar = apji.a;
            }
            Optional optionalH = kro.H(apjiVar, aqer.a);
            if (optionalH.isPresent()) {
                this.B.b((aqen) optionalH.get());
                TextView textView3 = this.G;
                if ((((aqen) optionalH.get()).b & 64) != 0) {
                    alayVar3 = ((aqen) optionalH.get()).f;
                    if (alayVar3 == null) {
                        alayVar3 = alay.a;
                    }
                } else {
                    alayVar3 = null;
                }
                textView3.setText(ackj.k(null, alayVar3, null, false));
                tuk.l(this.I, true);
            } else {
                tuk.l(this.I, false);
            }
            apji apjiVar2 = this.P.g;
            if (apjiVar2 == null) {
                apjiVar2 = apji.a;
            }
            Optional optionalH2 = kro.H(apjiVar2, angi.a);
            if (optionalH2.isPresent()) {
                izr izrVar = this.b;
                izrVar.m(this.e, this.l, (anfy) optionalH2.get(), this.P, this.v);
                izrVar.f(this.k, (anfy) optionalH2.get(), this.P, this.v);
            }
            alay alayVar4 = this.P.e;
            if (alayVar4 == null) {
                alayVar4 = alay.a;
            }
            Spanned spannedK2 = ackj.k(null, alayVar4, null, false);
            if (!TextUtils.isEmpty(spannedK2)) {
                tuk.u(this.F, spannedK2);
            }
            apji apjiVar3 = this.P.f;
            if (apjiVar3 == null) {
                apjiVar3 = apji.a;
            }
            Optional optionalH3 = kro.H(apjiVar3, ajnp.b);
            if (optionalH3.isPresent()) {
                Button button = this.y;
                if ((((ajno) optionalH3.get()).b & SemanticState.Multiline) != 0) {
                    alayVar2 = ((ajno) optionalH3.get()).i;
                    if (alayVar2 == null) {
                        alayVar2 = alay.a;
                    }
                } else {
                    alayVar2 = null;
                }
                button.setText(ackj.k(null, alayVar2, null, false));
            }
        }
        k(this.a.getResources().getConfiguration().orientation);
        adly adlyVar2 = new adly();
        adlyVar2.a(this.v);
        apji apjiVar4 = this.P.j;
        if (apjiVar4 == null) {
            apjiVar4 = apji.a;
        }
        Optional optionalH4 = kro.H(apjiVar4, ajnp.a);
        if (optionalH4.isPresent()) {
            FrameLayout frameLayout = this.K;
            frameLayout.setVisibility(0);
            this.J.setVisibility(0);
            this.R.a(this.M, frameLayout, null, null, false).hU(adlyVar2, (ajnf) optionalH4.get());
        }
        apji apjiVar5 = this.P.k;
        if (apjiVar5 == null) {
            apjiVar5 = apji.a;
        }
        Optional optionalH5 = kro.H(apjiVar5, ajnp.a);
        if (optionalH5.isPresent()) {
            FrameLayout frameLayout2 = this.L;
            frameLayout2.setVisibility(0);
            this.J.setVisibility(0);
            this.R.a(this.N, frameLayout2, null, null, false).hU(adlyVar2, (ajnf) optionalH5.get());
        }
    }
}
