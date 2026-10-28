package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.support.v7.widget.RecyclerView;
import android.text.Spanned;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.makeramen.RoundedImageView;
import j$.util.Optional;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jde extends jbe implements jiw {
    private final jfr A;
    private final adkv B;
    private final izj C;
    private final TextView D;
    private final LinearLayout E;
    private final LinearLayout F;
    private final FrameLayout G;
    private anne H;
    private adly I;
    private boolean J;
    public final vxe x;
    private final jer y;
    private final jdx z;

    public jde(Context context, adhv adhvVar, vxe vxeVar, izr izrVar, jer jerVar, jdx jdxVar, abxv abxvVar, inn innVar, iwe iweVar, hfn hfnVar, View view) {
        super(context, izrVar, view, innVar, iweVar, hfnVar);
        this.J = false;
        this.x = vxeVar;
        this.y = jerVar;
        this.z = jdxVar;
        this.D = (TextView) view.findViewById(R.id.entity_header_second_title);
        RoundedImageView roundedImageView = (RoundedImageView) view.findViewById(R.id.entity_thumbnail);
        this.d = new adia(adhvVar, roundedImageView, false);
        this.C = new izj(adhvVar, roundedImageView);
        this.A = new jfr(context, adhvVar, abxvVar, roundedImageView);
        this.E = (LinearLayout) view.findViewById(R.id.header_additional_info_container);
        this.G = (FrameLayout) view.findViewById(R.id.detail_header_container);
        this.f.setBackgroundColor(context.getColor(R.color.black_header_color));
        this.F = (LinearLayout) view.findViewById(R.id.alert_container);
        this.B = new jdd(context, jerVar.a);
    }

    private final void j(Object obj) {
        adkv adkvVar = this.B;
        View viewD = adkvVar.d(adkvVar.b(this.I), obj, null);
        int i = 0;
        while (true) {
            ViewGroup viewGroup = (ViewGroup) viewD;
            if (i >= viewGroup.getChildCount()) {
                return;
            }
            if (viewGroup.getChildAt(i).getVisibility() != 8) {
                LinearLayout linearLayout = this.E;
                linearLayout.addView(viewD);
                linearLayout.setVisibility(0);
                return;
            }
            i++;
        }
    }

    private final void k() {
        if (this.H.l.isEmpty()) {
            return;
        }
        apji apjiVar = (apji) this.H.l.get(0);
        aihl aihlVarCheckIsLite = aihn.checkIsLite(anqa.a);
        apjiVar.c(aihlVarCheckIsLite);
        if (apjiVar.j.n(aihlVarCheckIsLite.d)) {
            apji apjiVar2 = (apji) this.H.l.get(0);
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(anqa.a);
            apjiVar2.c(aihlVarCheckIsLite2);
            Object objK = apjiVar2.j.k(aihlVarCheckIsLite2.d);
            Object objC = objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK);
            adly adlyVar = new adly();
            adlyVar.f("presenterSizeConstraint", new jgf(-1, -1));
            adlyVar.f("thumbnailOverlaySize", Integer.valueOf(this.a.getResources().getDimensionPixelSize(R.dimen.music_detail_header_overlay_size)));
            jdx jdxVar = this.z;
            jdxVar.hU(adlyVar, (anpz) objC);
            RelativeLayout relativeLayout = this.j;
            if (relativeLayout != null) {
                relativeLayout.addView(jdxVar.b);
            }
        }
    }

    @Override // defpackage.jbe, defpackage.adma
    public final View a() {
        return this.e;
    }

    @Override // defpackage.jbe, defpackage.adma
    public final void b(admh admhVar) {
        super.b(admhVar);
        this.J = false;
        kro.Z(this.G, 0, 0);
        this.d.a();
        this.C.a();
        this.z.b(admhVar);
        adkv adkvVar = this.B;
        LinearLayout linearLayout = this.E;
        adkvVar.c(linearLayout);
        LinearLayout linearLayout2 = this.i;
        if (linearLayout2 != null) {
            kro.X(linearLayout2, this.y.a);
        }
        LinearLayout linearLayout3 = this.F;
        kro.X(linearLayout3, this.y.a);
        linearLayout.setVisibility(8);
        linearLayout3.setVisibility(8);
    }

    @Override // defpackage.jbe
    protected final int d() {
        return R.layout.detail_page_header;
    }

    @Override // defpackage.jbe, defpackage.gdy
    public final void hS(Configuration configuration) {
        super.hS(configuration);
        if (this.J) {
            Context context = this.a;
            int iW = (context.getResources().getDisplayMetrics().widthPixels - (jnj.w(context) << 1)) - kro.ab(context);
            if (iW > 0) {
                this.I.f("pagePadding", Integer.valueOf(iW));
            }
        }
        adkv adkvVar = this.B;
        LinearLayout linearLayout = this.E;
        adkvVar.c(linearLayout);
        apji apjiVar = this.H.g;
        if (apjiVar == null) {
            apjiVar = apji.a;
        }
        aihl aihlVarCheckIsLite = aihn.checkIsLite(annf.a);
        apjiVar.c(aihlVarCheckIsLite);
        boolean zN = apjiVar.j.n(aihlVarCheckIsLite.d);
        anne anneVar = this.H;
        if (zN) {
            apji apjiVar2 = anneVar.g;
            if (apjiVar2 == null) {
                apjiVar2 = apji.a;
            }
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(annf.a);
            apjiVar2.c(aihlVarCheckIsLite2);
            Object objK = apjiVar2.j.k(aihlVarCheckIsLite2.d);
            j(objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
            linearLayout.setShowDividers(1);
            return;
        }
        apji apjiVar3 = anneVar.g;
        if (apjiVar3 == null) {
            apjiVar3 = apji.a;
        }
        aihl aihlVarCheckIsLite3 = aihn.checkIsLite(annf.c);
        apjiVar3.c(aihlVarCheckIsLite3);
        if (apjiVar3.j.n(aihlVarCheckIsLite3.d)) {
            apji apjiVar4 = this.H.g;
            if (apjiVar4 == null) {
                apjiVar4 = apji.a;
            }
            aihl aihlVarCheckIsLite4 = aihn.checkIsLite(annf.c);
            apjiVar4.c(aihlVarCheckIsLite4);
            Object objK2 = apjiVar4.j.k(aihlVarCheckIsLite4.d);
            j(objK2 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK2));
            linearLayout.setShowDividers(0);
        }
    }

    @Override // defpackage.jbe, defpackage.adma
    public final /* synthetic */ void hU(adly adlyVar, Object obj) {
        anne anneVar = (anne) obj;
        super.hU(adlyVar, anneVar);
        adly adlyVar2 = new adly();
        this.I = adlyVar2;
        adlyVar2.a(this.v);
        this.J = adlyVar.b("pagePadding", -1) > 0;
        adly adlyVarT = kro.T(this.G, adlyVar);
        anneVar.getClass();
        this.H = anneVar;
        anfy anfyVar = null;
        if (!anneVar.k.E()) {
            this.v.w(new xgj(anneVar.k, (amud) null), null);
        }
        Context context = this.a;
        alay alayVar = anneVar.c;
        if (alayVar == null) {
            alayVar = alay.a;
        }
        ackh ackhVar = new ackh(context, alayVar, new jdc(this, 0));
        alay alayVar2 = anneVar.c;
        if (alayVar2 == null) {
            alayVar2 = alay.a;
        }
        Spanned spannedK = ackj.k(null, alayVar2, null, false);
        alay alayVar3 = anneVar.c;
        if (alayVar3 == null) {
            alayVar3 = alay.a;
        }
        Spanned spannedA = ackj.i(alayVar3) ? ackj.a(ackhVar) : spannedK;
        TextView textView = this.g;
        if (textView != null) {
            textView.setLinkTextColor(context.getColor(R.color.ytm_color_white));
            tuk.u(textView, spannedA);
        }
        alay alayVar4 = anneVar.d;
        if (alayVar4 == null) {
            alayVar4 = alay.a;
        }
        tuk.u(this.D, ackj.a(new ackh(context, alayVar4, new jdc(this, 2))));
        TextView textView2 = this.h;
        if (textView2 != null) {
            alay alayVar5 = anneVar.e;
            if (alayVar5 == null) {
                alayVar5 = alay.a;
            }
            tuk.u(textView2, ackj.k(null, alayVar5, null, false));
        }
        TextView textView3 = this.r;
        if (textView3 != null) {
            textView3.setText(spannedK);
        }
        anne anneVar2 = this.H;
        if ((anneVar2.b & SemanticState.LiveRegion) != 0) {
            apji apjiVar = anneVar2.j;
            if (apjiVar == null) {
                apjiVar = apji.a;
            }
            aihl aihlVarCheckIsLite = aihn.checkIsLite(akiw.a);
            apjiVar.c(aihlVarCheckIsLite);
            if (apjiVar.j.n(aihlVarCheckIsLite.d)) {
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(akiw.a);
                apjiVar.c(aihlVarCheckIsLite2);
                Object objK = apjiVar.j.k(aihlVarCheckIsLite2.d);
                Object objC = objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK);
                adia adiaVar = this.d;
                aqmh aqmhVar = ((akiv) objC).b;
                if (aqmhVar == null) {
                    aqmhVar = aqmh.a;
                }
                adiaVar.f(aqmhVar, null);
                k();
            } else {
                aihl aihlVarCheckIsLite3 = aihn.checkIsLite(anyj.a);
                apjiVar.c(aihlVarCheckIsLite3);
                if (apjiVar.j.n(aihlVarCheckIsLite3.d)) {
                    aihl aihlVarCheckIsLite4 = aihn.checkIsLite(anyj.a);
                    apjiVar.c(aihlVarCheckIsLite4);
                    Object objK2 = apjiVar.j.k(aihlVarCheckIsLite4.d);
                    this.A.hU(adlyVarT, (anyi) (objK2 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK2)));
                    k();
                } else {
                    aihl aihlVarCheckIsLite5 = aihn.checkIsLite(anmn.a);
                    apjiVar.c(aihlVarCheckIsLite5);
                    if (apjiVar.j.n(aihlVarCheckIsLite5.d)) {
                        aihl aihlVarCheckIsLite6 = aihn.checkIsLite(anmn.a);
                        apjiVar.c(aihlVarCheckIsLite6);
                        Object objK3 = apjiVar.j.k(aihlVarCheckIsLite6.d);
                        this.C.d((anmm) (objK3 == null ? aihlVarCheckIsLite6.b : aihlVarCheckIsLite6.c(objK3)));
                        k();
                    }
                }
            }
        }
        anne anneVar3 = this.H;
        if ((anneVar3.b & SemanticState.Hidden) != 0) {
            apji apjiVar2 = anneVar3.i;
            if (apjiVar2 == null) {
                apjiVar2 = apji.a;
            }
            aihl aihlVarCheckIsLite7 = aihn.checkIsLite(angi.a);
            apjiVar2.c(aihlVarCheckIsLite7);
            if (apjiVar2.j.n(aihlVarCheckIsLite7.d)) {
                apji apjiVar3 = this.H.i;
                if (apjiVar3 == null) {
                    apjiVar3 = apji.a;
                }
                aihl aihlVarCheckIsLite8 = aihn.checkIsLite(angi.a);
                apjiVar3.c(aihlVarCheckIsLite8);
                Object objK4 = apjiVar3.j.k(aihlVarCheckIsLite8.d);
                anfyVar = (anfy) (objK4 == null ? aihlVarCheckIsLite8.b : aihlVarCheckIsLite8.c(objK4));
            }
            anfy anfyVar2 = anfyVar;
            if (anfyVar2 != null) {
                View view = this.l;
                if (view != null) {
                    this.b.m(this.e, view, anfyVar2, this.H, this.v);
                }
                RecyclerView recyclerView = this.k;
                if (recyclerView != null) {
                    this.b.f(recyclerView, anfyVar2, this.H, this.v);
                }
            }
        }
        if ((this.H.b & SemanticState.Multiline) != 0) {
            aihh aihhVar = (aihh) ajnf.a.createBuilder();
            aihh aihhVar2 = (aihh) alja.a.createBuilder();
            aliz alizVar = aliz.SHARE;
            aihhVar2.copyOnWrite();
            alja aljaVar = (alja) aihhVar2.instance;
            aljaVar.c = alizVar.yN;
            aljaVar.b |= 1;
            aihhVar.copyOnWrite();
            ajnf ajnfVar = (ajnf) aihhVar.instance;
            alja aljaVar2 = (alja) aihhVar2.build();
            aljaVar2.getClass();
            ajnfVar.f = aljaVar2;
            ajnfVar.e = 8;
            alay alayVarC = ackj.c(context.getString(R.string.share));
            aihhVar.copyOnWrite();
            ajnf ajnfVar2 = (ajnf) aihhVar.instance;
            alayVarC.getClass();
            ajnfVar2.m = alayVarC;
            ajnfVar2.b |= 64;
            ajwo ajwoVar = this.H.m;
            if (ajwoVar == null) {
                ajwoVar = ajwo.a;
            }
            aihhVar.copyOnWrite();
            ajnf ajnfVar3 = (ajnf) aihhVar.instance;
            ajwoVar.getClass();
            ajnfVar3.s = ajwoVar;
            ajnfVar3.b |= SemanticState.Multiline;
            ajnf ajnfVar4 = (ajnf) aihhVar.build();
            aihf aihfVarCreateBuilder = angf.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            angf angfVar = (angf) aihfVarCreateBuilder.instance;
            ajnfVar4.getClass();
            angfVar.c = ajnfVar4;
            angfVar.b |= 1;
            angf angfVar2 = (angf) aihfVarCreateBuilder.build();
            aihf aihfVarCreateBuilder2 = anfy.a.createBuilder();
            aihfVarCreateBuilder2.bJ(angfVar2);
            anfy anfyVar3 = (anfy) aihfVarCreateBuilder2.build();
            View view2 = this.n;
            if (view2 != null) {
                this.b.m(this.e, view2, anfyVar3, this.H, this.v);
            }
            RecyclerView recyclerView2 = this.m;
            if (recyclerView2 != null) {
                this.b.f(recyclerView2, anfyVar3, this.H, this.v);
            }
        }
        LinearLayout linearLayout = this.i;
        if (linearLayout != null) {
            if (this.H.f.size() == 0) {
                tuk.l(linearLayout, false);
            } else {
                Iterator it = this.H.f.iterator();
                boolean z = false;
                while (it.hasNext()) {
                    Optional optionalH = kro.H((apji) it.next(), anpw.a);
                    if (optionalH.isPresent()) {
                        kro.P((anpv) optionalH.get(), linearLayout, this.y.a, adlyVarT);
                        z = true;
                    }
                }
                tuk.l(linearLayout, z);
            }
        }
        anne anneVar4 = this.H;
        if ((anneVar4.b & SemanticState.Focused) != 0) {
            apji apjiVar4 = anneVar4.h;
            if (apjiVar4 == null) {
                apjiVar4 = apji.a;
            }
            aihl aihlVarCheckIsLite9 = aihn.checkIsLite(ajao.a);
            apjiVar4.c(aihlVarCheckIsLite9);
            if (apjiVar4.j.n(aihlVarCheckIsLite9.d)) {
                apji apjiVar5 = this.H.h;
                if (apjiVar5 == null) {
                    apjiVar5 = apji.a;
                }
                aihl aihlVarCheckIsLite10 = aihn.checkIsLite(ajao.a);
                apjiVar5.c(aihlVarCheckIsLite10);
                Object objK5 = apjiVar5.j.k(aihlVarCheckIsLite10.d);
                Object objC2 = objK5 == null ? aihlVarCheckIsLite10.b : aihlVarCheckIsLite10.c(objK5);
                LinearLayout linearLayout2 = this.F;
                kro.Q((ajan) objC2, linearLayout2, this.y.a, adlyVarT);
                linearLayout2.setVisibility(0);
            }
        }
        hS(context.getResources().getConfiguration());
    }

    @Override // defpackage.jiw
    public final void i(int i) {
        int height = this.p.getHeight() + i;
        View view = this.f;
        view.setPadding(0, height, 0, 0);
        view.requestLayout();
    }
}
