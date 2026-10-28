package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.rendering.ui.spec.typography.YouTubeAppCompatTextView;
import j$.util.Objects;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class vpk implements vny {
    private static final agrf n = agrf.h("com/google/android/libraries/youtube/engagementpanel/EngagementPanelTitleHeader");
    private final vpc A;
    private final vuk B;
    private final aeas C;
    private final aeda D;
    private final awmd E;
    private LinearLayout F;
    private LinearLayout G;
    private ViewStub H;
    private ImageView I;
    private TextView J;
    private TextView K;
    private View L;
    private TextView M;
    private String O;
    private CharSequence P;
    private CharSequence Q;
    private angv R;
    private CharSequence S;
    private aqaw T;
    private anfy U;
    private adxb V;
    private Integer W;
    public final vxe a;
    private ImageView ab;
    private ImageView ac;
    private aqmh ad;
    private ajwo ae;
    private View af;
    private FrameLayout ag;
    private acxt ah;
    private akuo ai;
    private apji aj;
    private ViewStub ak;
    private swz al;
    private avmn am;
    private avmn an;
    private int ao;
    private final vxz ap;
    private final vxz aq;
    private final vxz ar;
    private yhi as;
    private final xte at;
    private final lqa au;
    private final aciz av;
    private final abxv aw;
    private final ci ax;
    public ImageView b;
    public ImageView c;
    public ViewStub d;
    public ajnf e;
    public ajnf f;
    public aliu g;
    public voa h;
    public xgn j;
    public vnr k;
    public final vxz l;
    public yhi m;
    private final Context o;
    private final advb p;
    private final acxt q;
    private final acxt r;
    private final awmd s;
    private final aunn t;
    private final aduw u;
    private final aduv v;
    private final adxj w;
    private final adhv x;
    private final aeeu y;
    private final tbt z;
    private Optional N = Optional.empty();
    public final List i = new ArrayList();
    private final List X = new ArrayList();
    private Optional Y = Optional.empty();
    private boolean aa = false;
    private boolean Z = true;

    public vpk(Context context, advb advbVar, awmd awmdVar, aunn aunnVar, ci ciVar, vxe vxeVar, aduw aduwVar, aduv aduvVar, adxj adxjVar, adhv adhvVar, aeeu aeeuVar, xgn xgnVar, lqa lqaVar, xte xteVar, tbt tbtVar, abxv abxvVar, vpc vpcVar, vuk vukVar, aeas aeasVar, vxz vxzVar, aeda aedaVar, awmd awmdVar2, aciz acizVar, vxz vxzVar2, vxz vxzVar3, vxz vxzVar4) {
        this.o = context;
        this.p = advbVar;
        this.s = awmdVar;
        this.q = (acxt) awmdVar.io();
        this.r = (acxt) awmdVar.io();
        this.t = aunnVar;
        this.ax = ciVar;
        this.a = vxeVar;
        this.u = aduwVar;
        this.v = aduvVar;
        this.w = adxjVar;
        this.x = adhvVar;
        this.y = aeeuVar;
        this.j = xgnVar;
        this.au = lqaVar;
        this.at = xteVar;
        this.z = tbtVar;
        this.aw = abxvVar;
        this.A = vpcVar;
        this.B = vukVar;
        this.C = aeasVar;
        this.l = vxzVar;
        this.D = aedaVar;
        this.E = awmdVar2;
        this.av = acizVar;
        this.aq = vxzVar2;
        this.ap = vxzVar3;
        this.ar = vxzVar4;
    }

    private final void D() {
        if (this.G != null) {
            J();
            int childCount = this.G.getChildCount();
            for (ovo ovoVar : this.i) {
                if (this.G != null) {
                    Object obj = ovoVar.a;
                    if (obj instanceof ajnf) {
                        ImageView imageView = (ImageView) LayoutInflater.from(this.o).inflate(R.layout.image_action_button, (ViewGroup) this.G, false);
                        ovoVar.b = imageView;
                        this.G.addView(imageView, childCount);
                        E(imageView, (ajnf) obj);
                    }
                    if (obj instanceof aliu) {
                        ViewStub viewStub = (ViewStub) LayoutInflater.from(this.o).inflate(R.layout.icon_badge_action_button, (ViewGroup) this.G, false);
                        ovoVar.b = viewStub;
                        this.G.addView(viewStub, childCount);
                        swz swzVarI = this.at.i(viewStub);
                        this.X.add(swzVarI);
                        F((aliu) obj, swzVarI);
                    }
                    if (obj instanceof akrn) {
                        acxm acxmVarC = ((acyx) this.t.io()).c((akrn) obj);
                        adly adlyVar = new adly();
                        vxz vxzVar = this.ap;
                        acxt acxtVar = vxzVar.l(329, 45801387L, false) ? (acxt) this.s.io() : this.r;
                        acxtVar.h(adlyVar, acxmVarC, false, false);
                        ovoVar.b = acxtVar.a();
                        this.G.addView(acxtVar.a(), childCount);
                        if (vxzVar.l(329, 45801387L, false)) {
                            ovoVar.c = acxtVar;
                        }
                    }
                }
            }
        }
    }

    private final void E(ImageView imageView, ajnf ajnfVar) {
        aiqd aiqdVar;
        if (ajnfVar == null) {
            tuk.l(imageView, false);
            return;
        }
        tuk.l(imageView, true);
        aiqe aiqeVar = ajnfVar.v;
        if (aiqeVar == null) {
            aiqeVar = aiqe.a;
        }
        if ((aiqeVar.b & 1) != 0) {
            aiqe aiqeVar2 = ajnfVar.v;
            if (aiqeVar2 == null) {
                aiqeVar2 = aiqe.a;
            }
            aiqdVar = aiqeVar2.c;
            if (aiqdVar == null) {
                aiqdVar = aiqd.a;
            }
        } else {
            aiqdVar = ajnfVar.u;
            if (aiqdVar == null) {
                aiqdVar = aiqd.a;
            }
        }
        if (aiqdVar != null && (aiqdVar.b & 2) != 0) {
            imageView.setContentDescription(aiqdVar.c);
        }
        imageView.setOnClickListener(new jip(this, ajnfVar, 20));
        if (((ajnfVar.e == 8 ? (alja) ajnfVar.f : alja.a).b & 1) != 0) {
            aduv aduvVar = this.v;
            aliz alizVarA = aliz.a((ajnfVar.e == 8 ? (alja) ajnfVar.f : alja.a).c);
            if (alizVarA == null) {
                alizVarA = aliz.UNKNOWN;
            }
            imageView.setImageResource(aduvVar.a(alizVarA));
        }
    }

    private final void F(aliu aliuVar, swz swzVar) {
        if (aliuVar == null) {
            swzVar.g();
            return;
        }
        adly adlyVar = new adly();
        adlyVar.a(this.j);
        swzVar.hU(adlyVar, aliuVar);
    }

    private final void G(Context context) {
        Drawable drawableD;
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(context).inflate(true != this.aq.l(237, 45828593L, false) ? R.layout.engagement_panel_title_header : R.layout.engagement_panel_title_header_with_top_content, (ViewGroup) null, false);
        this.F = linearLayout;
        LinearLayout linearLayout2 = (LinearLayout) linearLayout.findViewById(R.id.horizontal_title_row);
        this.G = linearLayout2;
        if (linearLayout2 == null) {
            this.G = this.F;
        }
        this.H = (ViewStub) this.F.findViewById(R.id.title_container);
        this.ag = (FrameLayout) this.F.findViewById(R.id.top_content_container);
        if (P()) {
            this.H.setLayoutResource(R.layout.engagement_panel_premium_controls_title_container);
        } else {
            boolean zAK = a.aK();
            ViewStub viewStub = this.H;
            if (zAK) {
                viewStub.setLayoutResource(R.layout.engagement_panel_title_container_with_accessibility_header);
            } else {
                viewStub.setLayoutResource(R.layout.engagement_panel_title_container);
            }
        }
        this.H.inflate();
        this.ab = (ImageView) this.F.findViewById(R.id.thumbnail);
        this.ac = (ImageView) this.F.findViewById(R.id.no_crop_thumbnail);
        this.J = (TextView) this.F.findViewById(R.id.title);
        this.K = (TextView) this.F.findViewById(R.id.subtitle);
        this.b = (ImageView) this.F.findViewById(R.id.information_button);
        this.c = (ImageView) this.F.findViewById(R.id.action_button);
        this.d = (ViewStub) this.F.findViewById(R.id.icon_badge);
        this.L = this.F.findViewById(R.id.overflow_menu_anchor);
        TextView textView = (TextView) this.F.findViewById(R.id.contextual_info);
        TextView textView2 = (TextView) this.F.findViewById(R.id.modern_contextual_info);
        this.M = textView;
        this.I = (ImageView) this.F.findViewById(R.id.back_button);
        ImageView imageView = (ImageView) this.F.findViewById(R.id.sort_menu_anchor);
        if (this.D.s() && (drawableD = this.w.d(context, arqz.dV)) != null) {
            try {
                drawableD.setTint(tzk.i(context, R.attr.ytTextPrimary));
                imageView.setImageDrawable(drawableD);
            } catch (Resources.NotFoundException e) {
                ((agrc) ((agrc) ((agrc) n.b()).j(e)).k("com/google/android/libraries/youtube/engagementpanel/EngagementPanelTitleHeader", "initializeView", (char) 1048, "EngagementPanelTitleHeader.java")).t("sortMenuAnchor could not be tinted");
            }
        }
        advb advbVar = this.p;
        ci ciVar = this.ax;
        aeeu aeeuVar = this.y;
        xgn xgnVar = this.j;
        lqa lqaVar = this.au;
        tbt tbtVar = this.z;
        aeda aedaVar = this.D;
        context.getClass();
        advbVar.getClass();
        imageView.getClass();
        aeeuVar.getClass();
        xgnVar.getClass();
        lqaVar.getClass();
        adxb adxbVar = new adxb(context, advbVar, ciVar, imageView, aeeuVar, xgnVar, lqaVar, tbtVar, new admu(), new mx(context, null, R.attr.listPopupWindowStyle), aedaVar);
        this.V = adxbVar;
        if (this.h != null) {
            adxbVar.c = new vpj(this, 0);
        }
        this.ak = (ViewStub) this.F.findViewById(R.id.title_badge);
        this.Y = Optional.of(Integer.valueOf(this.G.getChildCount()));
        aciz acizVar = this.av;
        if (acizVar.C()) {
            this.J.setVisibility(8);
            this.J = (TextView) this.F.findViewById(R.id.modern_title);
            acizVar.B(aedv.b(2, 2), context, (YouTubeAppCompatTextView) this.J);
            this.K.setVisibility(8);
            this.K = (TextView) this.F.findViewById(R.id.modern_subtitle);
            acizVar.B(aedv.b(3, 2), context, (YouTubeAppCompatTextView) this.K);
            this.M.setVisibility(8);
            this.M = textView2;
            acizVar.B(aedv.b(3, 3), context, (YouTubeAppCompatTextView) this.M);
        }
    }

    private final void H(View view, ajnf ajnfVar) {
        if (ajnfVar == null || (ajnfVar.b & SemanticState.ReadOnly) == 0) {
            return;
        }
        alhs alhsVar = ajnfVar.p;
        if (alhsVar == null) {
            alhsVar = alhs.a;
        }
        if (alhsVar.b == 102716411) {
            aeeu aeeuVar = this.y;
            alhs alhsVar2 = ajnfVar.p;
            if (alhsVar2 == null) {
                alhsVar2 = alhs.a;
            }
            alhq alhqVar = alhsVar2.b == 102716411 ? (alhq) alhsVar2.c : alhq.a;
            alhs alhsVar3 = ajnfVar.p;
            if (alhsVar3 == null) {
                alhsVar3 = alhs.a;
            }
            aeeuVar.b(alhqVar, view, alhsVar3, this.j);
        }
    }

    private final void I() {
        acxt acxtVar;
        if (this.ap.l(329, 45801387L, false) && (acxtVar = this.ah) != null) {
            acxtVar.b(null);
        }
        this.aj = null;
    }

    private final void J() {
        Object obj;
        if (this.G == null || this.Y.isEmpty()) {
            return;
        }
        int i = 0;
        for (ovo ovoVar : this.i) {
            if (ovoVar.b != null) {
                ovoVar.b = null;
                i++;
            }
            if (this.ap.l(329, 45801387L, false) && (obj = ovoVar.c) != null) {
                ((acxt) obj).b(null);
                ovoVar.c = null;
            }
        }
        if (((Integer) this.Y.get()).intValue() + i <= this.G.getChildCount()) {
            this.G.removeViews(((Integer) this.Y.get()).intValue(), i);
        } else {
            zvp.a(zvn.b, zvm.z, "[EngagementPanelTitleHeader] Cannot remove action buttons from header as the child count is out of sync. Buttons to remove exceed current header child count.");
        }
    }

    private final void K() {
        List list = this.X;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((swz) it.next()).g();
        }
        list.clear();
        J();
        this.i.clear();
    }

    private final void L(akuo akuoVar) {
        FrameLayout frameLayout;
        apji apjiVar;
        xgn xgnVar;
        this.ai = akuoVar;
        vxz vxzVar = this.aq;
        if (!vxzVar.l(237, 45828593L, false) || (frameLayout = this.ag) == null) {
            return;
        }
        if (akuoVar == null || (akuoVar.b & 16777216) == 0) {
            apjiVar = null;
        } else {
            apjiVar = akuoVar.r;
            if (apjiVar == null) {
                apjiVar = apji.a;
            }
        }
        if (!Objects.equals(this.aj, apjiVar) || (apjiVar != null && frameLayout.getChildCount() <= 0)) {
            frameLayout.removeAllViews();
            if (apjiVar == null) {
                frameLayout.setVisibility(8);
                I();
                return;
            }
            aihl aihlVarCheckIsLite = aihn.checkIsLite(akrs.a);
            apjiVar.c(aihlVarCheckIsLite);
            if (!apjiVar.j.n(aihlVarCheckIsLite.d)) {
                frameLayout.setVisibility(8);
                I();
                return;
            }
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(akrs.a);
            apjiVar.c(aihlVarCheckIsLite2);
            Object objK = apjiVar.j.k(aihlVarCheckIsLite2.d);
            akrn akrnVar = (akrn) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
            acxm acxmVarC = ((acyx) this.t.io()).c(akrnVar);
            adly adlyVar = new adly();
            if (vxzVar.l(141, 45693775L, false) && (xgnVar = this.j) != null) {
                adlyVar.a(xgnVar);
                adlyVar.c = new xgj(akrnVar.d, (amud) null);
                this.j.d(new xgj(akrnVar.d, (amud) null));
            }
            try {
                acxt acxtVar = this.ah;
                if (acxtVar == null) {
                    acxtVar = (acxt) this.s.io();
                    this.ah = acxtVar;
                }
                acxtVar.h(adlyVar, acxmVarC, false, false);
                frameLayout.addView(this.ah.a());
                frameLayout.setVisibility(0);
                this.aj = apjiVar;
            } catch (RuntimeException e) {
                ((agrc) ((agrc) ((agrc) n.b()).j(e)).k("com/google/android/libraries/youtube/engagementpanel/EngagementPanelTitleHeader", "setTopContent", (char) 631, "EngagementPanelTitleHeader.java")).t("Failed to present top content");
                frameLayout.setVisibility(8);
                I();
            }
        }
    }

    private final void M() {
        if (this.I != null) {
            if (this.N.isPresent()) {
                E(this.I, (ajnf) this.N.get());
                tuk.l(this.I, true);
                return;
            }
            if (this.D.t()) {
                this.I.setImageDrawable(this.w.d(this.o, arqz.er));
            }
            int i = 8;
            this.I.setOnClickListener(new vhv(this, i));
            ImageView imageView = this.I;
            if (this.A.j() && this.m != null) {
                i = 0;
            }
            imageView.setVisibility(i);
        }
    }

    private final void N(Object obj) {
        if (obj != null) {
            if (obj instanceof ajnf) {
                this.aw.L(((ajnf) obj).o);
            }
            if (obj instanceof aliu) {
                this.aw.L(((aliu) obj).k);
            }
        }
    }

    private final void O() {
        String string;
        if (TextUtils.isEmpty(this.P)) {
            CharSequence charSequence = this.S;
            string = charSequence != null ? charSequence.toString() : null;
        } else {
            String strValueOf = String.valueOf(this.P);
            CharSequence charSequence2 = this.Q;
            String strConcat = charSequence2 != null ? ". ".concat(charSequence2.toString()) : "";
            CharSequence charSequence3 = this.S;
            string = strValueOf + strConcat + (charSequence3 != null ? ". ".concat(charSequence3.toString()) : "");
        }
        LinearLayout linearLayout = this.F;
        if (linearLayout != null) {
            linearLayout.setContentDescription(string);
        }
    }

    private final boolean P() {
        return Objects.equals(this.O, "listen-first") || Objects.equals(this.O, "on-the-go");
    }

    private static final void Q(avmn avmnVar) {
        if (avmnVar == null || avmnVar.f()) {
            return;
        }
        avmnVar.dispose();
    }

    private static final void R(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        textView.setVisibility(true != TextUtils.isEmpty(charSequence) ? 0 : 8);
    }

    private final void S(aqmh aqmhVar, ajwo ajwoVar, int i, boolean z) {
        ImageView imageView;
        ImageView imageView2;
        ImageView imageView3;
        this.ad = aqmhVar;
        this.ae = ajwoVar;
        this.ao = i;
        this.aa = z;
        if (this.ab == null || this.ac == null) {
            return;
        }
        int i2 = 1;
        if (!this.ar.l(351, 45796161L, true) || i == 2) {
            imageView = this.ab;
            ImageView imageView4 = this.ac;
            imageView2 = imageView4;
            imageView3 = imageView;
        } else {
            imageView = this.ac;
            imageView3 = this.ab;
            imageView2 = imageView3;
        }
        if (aqmhVar == null) {
            imageView3.setVisibility(8);
            this.ac.setVisibility(8);
            adhv adhvVar = this.x;
            adhvVar.f(this.ab);
            adhvVar.f(this.ac);
            return;
        }
        imageView.setVisibility(0);
        if (z) {
            imageView.setColorFilter((ColorFilter) null);
        } else {
            imageView.setColorFilter(tzk.i(this.o, R.attr.ytTextPrimary));
        }
        adhv adhvVar2 = this.x;
        adhvVar2.h(imageView, aqmhVar);
        if (ajwoVar != null) {
            imageView.setOnClickListener(new vqd((Object) this, (aihn) ajwoVar, i2));
        } else {
            imageView.setOnClickListener(null);
            imageView.setClickable(false);
        }
        imageView2.setVisibility(8);
        adhvVar2.f(imageView2);
    }

    public final void A(akuo akuoVar) {
        ajwo ajwoVar;
        int iAU;
        alay alayVar;
        alay alayVar2;
        angv angvVar;
        alay alayVar3;
        aqmh aqmhVar;
        ajwo ajwoVar2;
        int iAU2;
        ajnf ajnfVar = null;
        if (akuoVar == null) {
            if (this.ar.l(351, 45796161L, true)) {
                S(null, null, 0, false);
            }
            C(null);
            L(null);
            m(null);
            this.R = null;
            y(null);
            k(null);
            B(null);
            this.f = null;
            ImageView imageView = this.c;
            if (imageView != null) {
                E(imageView, null);
            }
            this.g = null;
            ViewStub viewStub = this.d;
            if (viewStub != null) {
                swz swzVarI = this.al;
                if (swzVarI == null) {
                    swzVarI = this.at.i(viewStub);
                    this.al = swzVarI;
                }
                F(this.g, swzVarI);
            }
            K();
            this.e = null;
            this.N = Optional.empty();
            M();
            return;
        }
        int i = akuoVar.c;
        if (i == 28) {
            asnm asnmVar = (asnm) akuoVar.d;
            if (asnmVar == null) {
                aqmhVar = aqmh.a;
            } else {
                aiie<asno> aiieVar = asnmVar.c;
                if (aiieVar.isEmpty()) {
                    aqmhVar = aqmh.a;
                } else {
                    aihh aihhVar = (aihh) aqmh.a.createBuilder();
                    for (asno asnoVar : aiieVar) {
                        if (asnoVar.c == 1) {
                            aihf aihfVarCreateBuilder = aqmg.a.createBuilder();
                            String strConcat = (true != (asnoVar.c == 1 ? (String) asnoVar.d : "").startsWith("//") ? "" : "https:").concat(String.valueOf(asnoVar.c == 1 ? (String) asnoVar.d : ""));
                            aihfVarCreateBuilder.copyOnWrite();
                            aqmg aqmgVar = (aqmg) aihfVarCreateBuilder.instance;
                            aqmgVar.b |= 1;
                            aqmgVar.c = strConcat;
                            int i2 = asnoVar.e;
                            aihfVarCreateBuilder.copyOnWrite();
                            aqmg aqmgVar2 = (aqmg) aihfVarCreateBuilder.instance;
                            aqmgVar2.b |= 2;
                            aqmgVar2.d = i2;
                            int i3 = asnoVar.f;
                            aihfVarCreateBuilder.copyOnWrite();
                            aqmg aqmgVar3 = (aqmg) aihfVarCreateBuilder.instance;
                            aqmgVar3.b |= 4;
                            aqmgVar3.e = i3;
                            aihhVar.x(aihfVarCreateBuilder);
                        }
                    }
                    aqmhVar = (aqmh) aihhVar.build();
                }
            }
            if ((akuoVar.b & SemanticState.Multiline) != 0) {
                ajwoVar2 = akuoVar.o;
                if (ajwoVar2 == null) {
                    ajwoVar2 = ajwo.a;
                }
            } else {
                ajwoVar2 = null;
            }
            if ((akuoVar.b & SemanticState.Obscured) != 0) {
                iAU2 = a.aU(akuoVar.n);
                if (iAU2 == 0) {
                    iAU2 = 1;
                }
            } else {
                iAU2 = 0;
            }
            S(aqmhVar, ajwoVar2, iAU2, true);
        } else {
            aqmh aqmhVar2 = i == 13 ? (aqmh) akuoVar.d : null;
            if ((akuoVar.b & SemanticState.Multiline) != 0) {
                ajwoVar = akuoVar.o;
                if (ajwoVar == null) {
                    ajwoVar = ajwo.a;
                }
            } else {
                ajwoVar = null;
            }
            if ((akuoVar.b & SemanticState.Obscured) != 0) {
                iAU = a.aU(akuoVar.n);
                if (iAU == 0) {
                    iAU = 1;
                }
            } else {
                iAU = 0;
            }
            S(aqmhVar2, ajwoVar, iAU, false);
        }
        if ((akuoVar.b & 2) != 0) {
            alayVar = akuoVar.e;
            if (alayVar == null) {
                alayVar = alay.a;
            }
        } else {
            alayVar = null;
        }
        C(ackj.k(null, alayVar, null, false));
        if ((akuoVar.b & 32) != 0) {
            alayVar2 = akuoVar.i;
            if (alayVar2 == null) {
                alayVar2 = alay.a;
            }
        } else {
            alayVar2 = null;
        }
        n(ackj.k(null, alayVar2, null, false));
        apji apjiVar = akuoVar.p;
        if (apjiVar == null) {
            apjiVar = apji.a;
        }
        m(apjiVar);
        apji apjiVar2 = akuoVar.m;
        if (apjiVar2 == null) {
            apjiVar2 = apji.a;
        }
        aihl aihlVar = angw.a;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
        apjiVar2.c(aihlVarCheckIsLite);
        if (apjiVar2.j.n(aihlVarCheckIsLite.d)) {
            apji apjiVar3 = akuoVar.m;
            if (apjiVar3 == null) {
                apjiVar3 = apji.a;
            }
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
            apjiVar3.c(aihlVarCheckIsLite2);
            Object objK = apjiVar3.j.k(aihlVarCheckIsLite2.d);
            angvVar = (angv) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
        } else {
            angvVar = null;
        }
        this.R = angvVar;
        if ((akuoVar.b & 8) != 0) {
            alayVar3 = akuoVar.g;
            if (alayVar3 == null) {
                alayVar3 = alay.a;
            }
        } else {
            alayVar3 = null;
        }
        y(ackj.k(null, alayVar3, null, false));
        if ((akuoVar.b & 16) != 0) {
            akup akupVar = akuoVar.h;
            if (akupVar == null) {
                akupVar = akup.a;
            }
            int i4 = akupVar.b;
            k(i4 == 76818770 ? i4 == 76818770 ? (aqaw) akupVar.c : aqaw.a : null);
            int i5 = akupVar.b;
            B(i5 == 66439850 ? i5 == 66439850 ? (anfy) akupVar.c : anfy.a : null);
        } else {
            k(null);
            B(null);
        }
        apji apjiVar4 = akuoVar.f;
        if (apjiVar4 == null) {
            apjiVar4 = apji.a;
        }
        aihl aihlVarCheckIsLite3 = aihn.checkIsLite(ajnp.a);
        apjiVar4.c(aihlVarCheckIsLite3);
        if (apjiVar4.j.n(aihlVarCheckIsLite3.d)) {
            apji apjiVar5 = akuoVar.f;
            if (apjiVar5 == null) {
                apjiVar5 = apji.a;
            }
            aihl aihlVarCheckIsLite4 = aihn.checkIsLite(ajnp.a);
            apjiVar5.c(aihlVarCheckIsLite4);
            Object objK2 = apjiVar5.j.k(aihlVarCheckIsLite4.d);
            ajnfVar = (ajnf) (objK2 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK2));
        }
        this.e = ajnfVar;
        ImageView imageView2 = this.b;
        if (imageView2 != null) {
            E(imageView2, ajnfVar);
        }
        v(akuoVar);
        x(akuoVar);
        w(akuoVar);
        L(akuoVar);
        if ((akuoVar.b & 2097152) != 0) {
            apji apjiVar6 = akuoVar.q;
            if (apjiVar6 == null) {
                apjiVar6 = apji.a;
            }
            aihl aihlVarCheckIsLite5 = aihn.checkIsLite(ajnp.a);
            apjiVar6.c(aihlVarCheckIsLite5);
            Object objK3 = apjiVar6.j.k(aihlVarCheckIsLite5.d);
            this.N = Optional.of((ajnf) (objK3 == null ? aihlVarCheckIsLite5.b : aihlVarCheckIsLite5.c(objK3)));
        } else {
            this.N = Optional.empty();
        }
        M();
        if ((akuoVar.b & SemanticState.LiveRegion) != 0) {
            j(!akuoVar.l);
        }
    }

    public final void B(anfy anfyVar) {
        aduw aduwVar;
        String str;
        this.U = anfyVar;
        View view = this.L;
        if (view == null || (aduwVar = this.u) == null) {
            return;
        }
        tuk.l(view, anfyVar != null);
        aduwVar.c(this.L, anfyVar, anfyVar, this.j);
        if (anfyVar != null) {
            aiqe aiqeVar = anfyVar.h;
            if (aiqeVar == null) {
                aiqeVar = aiqe.a;
            }
            if ((aiqeVar.b & 1) != 0) {
                aiqe aiqeVar2 = anfyVar.h;
                if (aiqeVar2 == null) {
                    aiqeVar2 = aiqe.a;
                }
                aiqd aiqdVar = aiqeVar2.c;
                if (aiqdVar == null) {
                    aiqdVar = aiqd.a;
                }
                str = aiqdVar.c;
            } else {
                str = null;
            }
            this.L.setContentDescription(str);
        }
    }

    public final void C(CharSequence charSequence) {
        this.P = charSequence;
        TextView textView = this.J;
        if (textView != null) {
            R(textView, charSequence);
            O();
        }
    }

    @Override // defpackage.vny
    public final View a() {
        return this.af;
    }

    @Override // defpackage.vny
    public final View b() {
        return c(this.o);
    }

    @Override // defpackage.vny
    public final View c(Context context) {
        LinearLayout linearLayout;
        ImageView imageView;
        if (!this.D.h()) {
            context = this.o;
        }
        if (this.F == null) {
            G(context);
        }
        S(this.ad, this.ae, this.ao, this.aa);
        M();
        TextView textView = this.J;
        textView.getClass();
        R(textView, this.P);
        TextView textView2 = this.K;
        textView2.getClass();
        R(textView2, this.Q);
        if (this.R != null) {
            this.ak.getClass();
            if (P() && (linearLayout = this.F) != null && (imageView = (ImageView) linearLayout.findViewById(R.id.badge_icon)) != null) {
                int dimensionPixelSize = this.o.getResources().getDimensionPixelSize(R.dimen.panel_metadata_badge_premium_standalone_icon_size);
                tym.h(imageView, tym.g(dimensionPixelSize, dimensionPixelSize), ViewGroup.MarginLayoutParams.class);
            }
        }
        ImageView imageView2 = this.b;
        imageView2.getClass();
        E(imageView2, this.e);
        ImageView imageView3 = this.c;
        imageView3.getClass();
        E(imageView3, this.f);
        swz swzVarI = this.al;
        if (swzVarI == null) {
            xte xteVar = this.at;
            ViewStub viewStub = this.d;
            viewStub.getClass();
            swzVarI = xteVar.i(viewStub);
            this.al = swzVarI;
        }
        F(this.g, swzVarI);
        D();
        y(this.S);
        adxb adxbVar = this.V;
        if (adxbVar != null) {
            adxbVar.a(this.T);
        }
        if (this.L != null && this.u != null) {
            B(this.U);
        }
        Integer num = this.W;
        if (num != null) {
            int iIntValue = num.intValue();
            this.W = num;
            TextView textView3 = this.M;
            if (textView3 != null) {
                tym.h(textView3, new tyj(iIntValue, 0), ViewGroup.MarginLayoutParams.class);
            }
        }
        L(this.ai);
        LinearLayout linearLayout2 = this.F;
        linearLayout2.getClass();
        return linearLayout2;
    }

    @Override // defpackage.vny
    public final void e() {
        if (this.ap.l(329, 45801387L, false)) {
            this.q.b(null);
            I();
            this.r.b(null);
            this.C.b(null);
            K();
        }
    }

    @Override // defpackage.vny
    public final void f() {
        Q(this.am);
        N(this.e);
        N(this.f);
        N(this.g);
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            N(((ovo) it.next()).a);
        }
        t();
        Q(this.an);
        this.an = null;
    }

    @Override // defpackage.vny
    public final void g() {
        xgn xgnVar;
        ajnf ajnfVar;
        ImageView imageView = this.I;
        if (imageView != null && imageView.getVisibility() == 0) {
            this.j.l(new xgj(xhb.b(33917)));
        }
        int i = 0;
        if (((vxz) this.E.io()).l(2, 45387578L, false) && (xgnVar = this.j) != null && (ajnfVar = this.f) != null && (ajnfVar.b & 2097152) != 0) {
            xgnVar.l(new xgj(ajnfVar.y, (amud) null));
        }
        Q(this.am);
        this.am = this.B.i.x(new sqj(12)).ak(new vpi(this, 1));
        if (this.af != null) {
            Q(this.an);
            this.an = this.C.d().af(new vpi(this, i));
        }
    }

    @Override // defpackage.vny
    public final void h() {
        Object obj;
        ImageView imageView = this.c;
        if (imageView != null) {
            H(imageView, this.f);
        }
        ImageView imageView2 = this.b;
        if (imageView2 != null) {
            H(imageView2, this.e);
        }
        for (ovo ovoVar : this.i) {
            Object obj2 = ovoVar.a;
            if ((obj2 instanceof ajnf) && (obj = ovoVar.b) != null) {
                H((View) obj, (ajnf) obj2);
            }
        }
    }

    @Override // defpackage.vny
    public final void i(boolean z) {
        ImageView imageView = this.I;
        if (imageView != null) {
            int visibility = imageView.getVisibility();
            tuk.l(this.I, z);
            if (this.l.l(5, 45363147L, false) && z && visibility != 0) {
                this.j.l(new xgj(xhb.b(33917)));
            }
        }
    }

    @Override // defpackage.vny
    public final void j(boolean z) {
        if (this.Z != z) {
            this.Z = z;
            yhi yhiVar = this.as;
            if (yhiVar != null) {
                yhiVar.c(z);
            }
        }
    }

    @Override // defpackage.vny
    public final void k(aqaw aqawVar) {
        this.T = aqawVar;
        adxb adxbVar = this.V;
        if (adxbVar != null) {
            adxbVar.a(aqawVar);
        }
    }

    @Override // defpackage.vny
    public final void l(voa voaVar) {
        if (this.h != voaVar) {
            this.h = voaVar;
            adxb adxbVar = this.V;
            if (adxbVar != null) {
                adxbVar.c = new vpj(voaVar, 1);
            }
        }
    }

    @Override // defpackage.vny
    public final void m(apji apjiVar) {
        xgn xgnVar;
        if (apjiVar != null) {
            aihl aihlVarCheckIsLite = aihn.checkIsLite(akrs.a);
            apjiVar.c(aihlVarCheckIsLite);
            if (apjiVar.j.n(aihlVarCheckIsLite.d)) {
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(akrs.a);
                apjiVar.c(aihlVarCheckIsLite2);
                Object objK = apjiVar.j.k(aihlVarCheckIsLite2.d);
                akrn akrnVar = (akrn) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
                acxm acxmVarC = ((acyx) this.t.io()).c(akrnVar);
                adly adlyVar = new adly();
                if (this.aq.l(141, 45693775L, false) && (xgnVar = this.j) != null) {
                    adlyVar.a(xgnVar);
                    adlyVar.c = new xgj(akrnVar.d, (amud) null);
                    this.j.d(new xgj(akrnVar.d, (amud) null));
                }
                acxt acxtVar = this.q;
                acxtVar.h(adlyVar, acxmVarC, false, false);
                this.af = acxtVar.a();
                if (this.ap.l(329, 45801387L, false)) {
                    this.C.b(null);
                    return;
                }
                return;
            }
            aihl aihlVarCheckIsLite3 = aihn.checkIsLite(akyv.b);
            apjiVar.c(aihlVarCheckIsLite3);
            if (apjiVar.j.n(aihlVarCheckIsLite3.d)) {
                aihl aihlVarCheckIsLite4 = aihn.checkIsLite(akyv.b);
                apjiVar.c(aihlVarCheckIsLite4);
                Object objK2 = apjiVar.j.k(aihlVarCheckIsLite4.d);
                Object objC = objK2 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK2);
                adly adlyVar2 = new adly();
                aeas aeasVar = this.C;
                aeasVar.hU(adlyVar2, (akyv) objC);
                this.af = aeasVar.a();
                if (this.ap.l(329, 45801387L, false)) {
                    this.q.b(null);
                    return;
                }
                return;
            }
        }
        this.af = null;
        if (this.ap.l(329, 45801387L, false)) {
            this.q.b(null);
            this.C.b(null);
        }
    }

    @Override // defpackage.vny
    public final void n(CharSequence charSequence) {
        this.Q = charSequence;
        TextView textView = this.K;
        if (textView != null) {
            R(textView, charSequence);
            O();
        }
    }

    @Override // defpackage.vny
    public final void o(TextUtils.TruncateAt truncateAt) {
        TextView textView = this.K;
        if (textView != null) {
            textView.setEllipsize(truncateAt);
        }
    }

    @Override // defpackage.vny
    public final boolean p() {
        return this.Z;
    }

    @Override // defpackage.vny
    public final void q(vnr vnrVar) {
        this.k = vnrVar;
    }

    @Override // defpackage.vny
    public final void r(yhi yhiVar) {
        this.m = yhiVar;
    }

    @Override // defpackage.vny
    public final void s(yhi yhiVar) {
        if (this.as != yhiVar) {
            this.as = yhiVar;
        }
    }

    public final void t() {
        adxb adxbVar = this.V;
        if (adxbVar != null) {
            mx mxVar = adxbVar.a;
            if (mxVar.u()) {
                mxVar.k();
            }
        }
    }

    public final void u(View view, Object obj) {
        if (view == null || obj == null) {
            return;
        }
        if (obj instanceof ajnf) {
            this.aw.J(((ajnf) obj).o, view);
        }
        if (obj instanceof aliu) {
            this.aw.J(((aliu) obj).k, view);
        }
    }

    public final void v(akuo akuoVar) {
        ajnf ajnfVar = null;
        if (akuoVar != null) {
            apji apjiVar = akuoVar.j;
            if (apjiVar == null) {
                apjiVar = apji.a;
            }
            aihl aihlVarCheckIsLite = aihn.checkIsLite(ajnp.a);
            apjiVar.c(aihlVarCheckIsLite);
            if (apjiVar.j.n(aihlVarCheckIsLite.d)) {
                apji apjiVar2 = akuoVar.j;
                if (apjiVar2 == null) {
                    apjiVar2 = apji.a;
                }
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(ajnp.a);
                apjiVar2.c(aihlVarCheckIsLite2);
                Object objK = apjiVar2.j.k(aihlVarCheckIsLite2.d);
                ajnfVar = (ajnf) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
            }
        }
        this.f = ajnfVar;
        ImageView imageView = this.c;
        if (imageView != null) {
            E(imageView, ajnfVar);
        }
    }

    public final void w(akuo akuoVar) {
        K();
        for (apji apjiVar : akuoVar.k) {
            aihl aihlVarCheckIsLite = aihn.checkIsLite(ajnp.a);
            apjiVar.c(aihlVarCheckIsLite);
            if (apjiVar.j.n(aihlVarCheckIsLite.d)) {
                List list = this.i;
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(ajnp.a);
                apjiVar.c(aihlVarCheckIsLite2);
                Object objK = apjiVar.j.k(aihlVarCheckIsLite2.d);
                list.add(new ovo(objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK)));
            }
            aihl aihlVar = aliv.a;
            aihl aihlVarCheckIsLite3 = aihn.checkIsLite(aihlVar);
            apjiVar.c(aihlVarCheckIsLite3);
            if (apjiVar.j.n(aihlVarCheckIsLite3.d)) {
                List list2 = this.i;
                aihl aihlVarCheckIsLite4 = aihn.checkIsLite(aihlVar);
                apjiVar.c(aihlVarCheckIsLite4);
                Object objK2 = apjiVar.j.k(aihlVarCheckIsLite4.d);
                list2.add(new ovo(objK2 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK2)));
            }
            aihl aihlVarCheckIsLite5 = aihn.checkIsLite(akrs.a);
            apjiVar.c(aihlVarCheckIsLite5);
            if (apjiVar.j.n(aihlVarCheckIsLite5.d)) {
                List list3 = this.i;
                aihl aihlVarCheckIsLite6 = aihn.checkIsLite(akrs.a);
                apjiVar.c(aihlVarCheckIsLite6);
                Object objK3 = apjiVar.j.k(aihlVarCheckIsLite6.d);
                list3.add(new ovo(objK3 == null ? aihlVarCheckIsLite6.b : aihlVarCheckIsLite6.c(objK3)));
            }
        }
        D();
    }

    public final void x(akuo akuoVar) {
        aliu aliuVar = null;
        if (akuoVar != null) {
            apji apjiVar = akuoVar.j;
            if (apjiVar == null) {
                apjiVar = apji.a;
            }
            aihl aihlVar = aliv.a;
            aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
            apjiVar.c(aihlVarCheckIsLite);
            if (apjiVar.j.n(aihlVarCheckIsLite.d)) {
                apji apjiVar2 = akuoVar.j;
                if (apjiVar2 == null) {
                    apjiVar2 = apji.a;
                }
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
                apjiVar2.c(aihlVarCheckIsLite2);
                Object objK = apjiVar2.j.k(aihlVarCheckIsLite2.d);
                aliuVar = (aliu) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
            }
        }
        this.g = aliuVar;
        ViewStub viewStub = this.d;
        if (viewStub != null) {
            swz swzVarI = this.al;
            if (swzVarI == null) {
                swzVarI = this.at.i(viewStub);
                this.al = swzVarI;
            }
            F(this.g, swzVarI);
        }
    }

    public final void y(CharSequence charSequence) {
        this.S = charSequence;
        TextView textView = this.M;
        if (textView != null) {
            R(textView, charSequence);
        }
        O();
    }

    public final void z(String str) {
        if (str != null) {
            this.O = str;
        }
    }

    @Override // defpackage.vny
    public final /* synthetic */ void d() {
    }
}
