package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.support.v7.widget.RecyclerView;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.common.ui.swipelayout.SwipeLayout;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jfv extends admr implements iyv {
    private final RecyclerView A;
    private final ImageView B;
    private final ImageView C;
    private final ImageView D;
    private final ViewGroup E;
    private final View F;
    private final View G;
    private final Optional H;
    private final acxn I;
    private final ViewGroup J;
    private final int K;
    private final awmd L;
    private ijt M;
    private mel N;
    private final jlh O;
    private final awmd P;
    private int Q;
    private final vxz R;
    private final vxz S;
    private final jij T;
    private kyr U;
    private final ahgb V;
    public final vxe a;
    public final View b;
    public final ViewGroup c;
    public acxt d;
    public final grj e;
    private final Context f;
    private final izr g;
    private final jdr h;
    private final admh i;
    private izd j;
    private final jfr k;
    private final izj l;
    private final jgd m;
    private tvy n;
    private final List o = new ArrayList();
    private boolean p;
    private int q;
    private final SwipeLayout s;
    private final LinearLayout t;
    private final ViewGroup u;
    private final FrameLayout v;
    private final TextView w;
    private final TextView x;
    private final TextView y;
    private final LinearLayout z;

    public jfv(Context context, adhv adhvVar, vxe vxeVar, izr izrVar, admh admhVar, jdr jdrVar, jij jijVar, ahgb ahgbVar, grj grjVar, kwq kwqVar, jfr jfrVar, vxz vxzVar, acxn acxnVar, awmd awmdVar, jlh jlhVar, vxz vxzVar2, awmd awmdVar2, adxj adxjVar) {
        this.f = context;
        this.a = vxeVar;
        this.g = izrVar;
        this.i = admhVar;
        this.h = jdrVar;
        this.T = jijVar;
        this.V = ahgbVar;
        this.e = grjVar;
        this.R = vxzVar;
        this.I = acxnVar;
        this.L = awmdVar;
        this.O = jlhVar;
        this.S = vxzVar2;
        this.P = awmdVar2;
        SwipeLayout swipeLayout = (SwipeLayout) LayoutInflater.from(context).inflate(R.layout.music_two_column_item, (ViewGroup) null);
        this.s = swipeLayout;
        this.b = swipeLayout.findViewById(R.id.two_column_item_content_parent);
        View viewFindViewById = swipeLayout.findViewById(R.id.two_column_item_content);
        this.F = viewFindViewById;
        this.G = swipeLayout.findViewById(R.id.two_column_item_highlight);
        LinearLayout linearLayout = (LinearLayout) swipeLayout.findViewById(R.id.thumbnail_index_container);
        this.t = linearLayout;
        TextView textView = (TextView) linearLayout.findViewById(R.id.list_index);
        this.w = textView;
        this.u = (ViewGroup) swipeLayout.findViewById(R.id.thumbnail_parent);
        FrameLayout frameLayout = (FrameLayout) swipeLayout.findViewById(R.id.thumbnail_overlay_parent);
        this.v = frameLayout;
        this.x = (TextView) swipeLayout.findViewById(R.id.title);
        TextView textView2 = (TextView) swipeLayout.findViewById(R.id.subtitle);
        this.y = textView2;
        this.z = (LinearLayout) swipeLayout.findViewById(R.id.subtitle_badges_container);
        this.A = (RecyclerView) swipeLayout.findViewById(R.id.top_level_menu_buttons_anchor);
        ImageView imageView = (ImageView) swipeLayout.findViewById(R.id.contextual_menu_anchor);
        this.B = imageView;
        ImageView imageView2 = (ImageView) swipeLayout.findViewById(R.id.drag_handle_indicator);
        this.C = imageView2;
        imageView.setImageResource(adxjVar.b(arqz.jA));
        imageView2.setImageResource(adxjVar.b(arqz.gQ));
        this.E = (ViewGroup) swipeLayout.findViewById(R.id.custom_index_column_container);
        this.J = (ViewGroup) swipeLayout.findViewById(R.id.contributor_avatars_container);
        this.c = (ViewGroup) swipeLayout.findViewById(R.id.engagement_bar_container);
        this.k = jfrVar;
        ImageView imageView3 = new ImageView(context);
        this.D = imageView3;
        this.l = new izj(adhvVar, imageView3);
        this.p = false;
        this.q = -1;
        this.H = jle.a(frameLayout.getLayoutParams());
        this.m = kwqVar.h(viewFindViewById, textView2);
        this.K = context.getColor(R.color.ytm_theme_main_color_dark);
        textView.setTextColor(context.getColor(R.color.yt_white1_opacity70));
        textView2.setTextColor(context.getColor(R.color.yt_white1_opacity70));
    }

    private final int o(anzi anziVar) {
        int dimensionPixelSize;
        int iAS = a.aS(anziVar.d);
        if (iAS == 0) {
            iAS = 1;
        }
        int i = iAS - 1;
        if (i != 1) {
            Context context = this.f;
            dimensionPixelSize = i != 2 ? context.getResources().getDimensionPixelSize(R.dimen.two_column_item_image_size) : context.getResources().getDimensionPixelSize(R.dimen.two_column_item_size_extra_large);
        } else {
            dimensionPixelSize = this.f.getResources().getDimensionPixelSize(R.dimen.two_column_item_size_large);
        }
        int iAU = a.aU(anziVar.y);
        return (iAU == 0 || iAU != 2) ? dimensionPixelSize : this.f.getResources().getDimensionPixelSize(R.dimen.two_column_item_highlight_card_image_size);
    }

    private final void p() {
        List list = this.o;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((adma) it.next()).b(this.i);
        }
        list.clear();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0056  */
    private final void q(adly adlyVar, anzi anziVar, int i) {
        jgf jgfVar;
        jdx jdxVar;
        int iAS;
        ArrayList arrayList = new ArrayList();
        adly adlyVar2 = new adly(adlyVar);
        apji apjiVar = anziVar.c;
        if (apjiVar == null) {
            apjiVar = apji.a;
        }
        Optional optionalH = kro.H(apjiVar, anyj.a);
        if (optionalH.isPresent()) {
            aqmh aqmhVar = ((anyi) optionalH.get()).c;
            if (aqmhVar == null) {
                aqmhVar = aqmh.a;
            }
            if (aawb.O(aqmhVar)) {
                aqmh aqmhVar2 = ((anyi) optionalH.get()).c;
                if (aqmhVar2 == null) {
                    aqmhVar2 = aqmh.a;
                }
                if (aawb.P(aqmhVar2) || (iAS = a.aS(((anyi) optionalH.get()).e)) == 0 || iAS != 3) {
                    jgfVar = new jgf(i, i);
                } else {
                    jgfVar = jgf.a(i);
                }
            } else {
                jgfVar = new jgf(i, i);
            }
        } else {
            jgfVar = new jgf(i, i);
        }
        adlyVar2.f("presenterSizeConstraint", jgfVar);
        Context context = this.f;
        adlyVar2.f("animatedEqualizerSize", Integer.valueOf(context.getResources().getDimensionPixelSize(R.dimen.music_two_column_overlay_size)));
        adlyVar2.f("playButtonSize", Integer.valueOf(context.getResources().getDimensionPixelSize(R.dimen.music_two_column_overlay_size)));
        adlyVar2.f("thumbnailOverlaySize", Integer.valueOf(context.getResources().getDimensionPixelSize(R.dimen.music_two_column_overlay_size)));
        int iAS2 = a.aS(anziVar.x);
        if (iAS2 != 0 && iAS2 == 3) {
            adlyVar2.f("thumbnailOverlayColor", Integer.valueOf(context.getColor(R.color.ytm_color_icon_inactive)));
        }
        adlyVar2.f("nowPlayingIndicatorSize", Integer.valueOf(context.getResources().getDimensionPixelSize(R.dimen.music_extra_small_icon_size)));
        adlyVar2.f("nowPlayingIndicatorMargin", Integer.valueOf(context.getResources().getDimensionPixelSize(R.dimen.item_extra_small_spacing)));
        FrameLayout frameLayout = this.v;
        admh admhVar = this.i;
        kro.X(frameLayout, admhVar);
        Iterator it = anziVar.u.iterator();
        while (it.hasNext()) {
            Optional optionalH2 = kro.H((apji) it.next(), anqa.a);
            if (optionalH2.isPresent() && (jdxVar = (jdx) adul.e(admhVar, (anpz) optionalH2.get(), frameLayout)) != null) {
                int iAU = a.aU(anziVar.y);
                if (iAU == 0 || iAU != 2) {
                    jdxVar.e = this.F;
                }
                alay alayVar = anziVar.e;
                if (alayVar == null) {
                    alayVar = alay.a;
                }
                if (!TextUtils.isEmpty(ackj.k(null, alayVar, null, false))) {
                    jdxVar.h(this.w);
                }
                jdxVar.hU(adlyVar2, (anpz) optionalH2.get());
                ViewGroup viewGroup = jdxVar.b;
                adul.j(viewGroup, jdxVar, admhVar.a(optionalH2.get()));
                frameLayout.addView(viewGroup);
                frameLayout.getLayoutParams().height = i;
                frameLayout.getLayoutParams().width = i;
                arrayList.add(jdxVar);
            }
        }
        this.U = new kyr((jbb[]) arrayList.toArray(new jbb[0]));
    }

    @Override // defpackage.adma
    public final View a() {
        return this.s;
    }

    @Override // defpackage.adma
    public final void b(admh admhVar) {
        View view = this.b;
        kro.Z(view, 0, 0);
        this.y.setContentDescription(null);
        this.k.b(admhVar);
        this.l.a();
        izd izdVar = this.j;
        if (izdVar != null) {
            izdVar.c();
            this.j = null;
        }
        izr izrVar = this.g;
        izrVar.h(view);
        izrVar.g(this.B);
        this.A.removeAllViews();
        this.u.removeAllViews();
        this.G.setBackground(null);
        kro.X(this.v, admhVar);
        kro.X(this.z, admhVar);
        kro.X(this.J, admhVar);
        m();
        p();
        tvy tvyVar = this.n;
        if (tvyVar != null) {
            tvyVar.c(this.s);
        }
        SwipeLayout swipeLayout = this.s;
        swipeLayout.v = null;
        swipeLayout.w = null;
        agke agkeVar = agpi.a;
        tsv.f(swipeLayout, agkeVar);
        tsv.g(swipeLayout, agkeVar);
        this.n = null;
        this.M = null;
        this.p = false;
        this.q = -1;
        h();
        this.C.setOnTouchListener(null);
        this.m.b(admhVar);
        kyr kyrVar = this.U;
        if (kyrVar != null) {
            kyrVar.t();
            this.U = null;
        }
        acxt acxtVar = this.d;
        if (acxtVar != null) {
            acxtVar.b(admhVar);
            this.d = null;
        }
        ViewGroup viewGroup = this.E;
        viewGroup.setVisibility(8);
        kro.X(viewGroup, admhVar);
    }

    /* JADX WARN: Code duplicated, block: B:120:0x0332 A[PHI: r4
      0x0332: PHI (r4v78 acxt) = (r4v77 acxt), (r4v82 acxt) binds: [B:117:0x0324, B:119:0x0330] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:122:0x0336  */
    /* JADX WARN: Code duplicated, block: B:125:0x0342  */
    /* JADX WARN: Code duplicated, block: B:126:0x036a  */
    /* JADX WARN: Code duplicated, block: B:208:0x05ae  */
    /* JADX WARN: Code duplicated, block: B:211:0x05b5  */
    /* JADX WARN: Code duplicated, block: B:212:0x05ba  */
    /* JADX WARN: Code duplicated, block: B:215:0x05c2  */
    /* JADX WARN: Code duplicated, block: B:222:0x05f4  */
    /* JADX WARN: Code duplicated, block: B:225:0x05f8  */
    /* JADX WARN: Code duplicated, block: B:228:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v109, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // defpackage.admr
    public final /* synthetic */ void d(adly adlyVar, Object obj) {
        anzi anziVar;
        adly adlyVarT;
        boolean z;
        Optional optionalEmpty;
        int i;
        int i2;
        anzi anziVar2;
        anzi anziVar3;
        adly adlyVar2;
        adly adlyVar3;
        Context context;
        anst anstVar;
        String str;
        int iAS;
        float f;
        int iAU;
        acxm acxmVar;
        ajwo ajwoVar;
        adly adlyVar4 = adlyVar;
        iko ikoVar = (iko) obj;
        anzi anziVar4 = ikoVar.a;
        this.p = adlyVar4.j("isDraggable");
        int iB = adlyVar4.b("sectionControllerPosition", -1);
        int iB2 = adlyVar4.b("position", -1);
        if (iB2 >= 0 && iB >= 0) {
            this.q = iB2 - iB;
        }
        if (this.p) {
            anziVar = anziVar4;
        } else {
            xgn xgnVar = adlyVar4.b;
            izd izdVarAc = kro.ac(this.b, anziVar4.n.G(), xgnVar);
            this.j = izdVarAc;
            anziVar = anziVar4;
            izdVarAc.b(new jft(this, adlyVar4, anziVar4, xgnVar, 2));
            izd izdVar = this.j;
            vxe vxeVar = this.a;
            if ((anziVar.b & SemanticState.Focused) != 0) {
                ajwoVar = anziVar.k;
                if (ajwoVar == null) {
                    ajwoVar = ajwo.a;
                }
            } else {
                ajwoVar = null;
            }
            izdVar.a(izb.b(vxeVar, xgnVar, ajwoVar, adlyVar4.e()));
        }
        SwipeLayout swipeLayout = this.s;
        if (swipeLayout.getLayoutParams() == null) {
            adlyVarT = adlyVar4;
        } else {
            swipeLayout.getLayoutParams().width = adlyVar4.b("carouselItemWidth", -1);
            if (jeo.f(adlyVar4)) {
                jeo.e(adlyVar4, this.v);
            } else {
                Optional optional = this.H;
                if (optional.isPresent()) {
                    jle.b((ailj) optional.get(), this.v);
                }
            }
            int iO = o(anziVar);
            Resources resources = this.f.getResources();
            int iAU2 = a.aU(anziVar.y);
            int i3 = R.dimen.two_column_item_vertical_padding;
            if (iAU2 != 0 && iAU2 == 2) {
                i3 = R.dimen.two_column_item_highlight_card_vertical_padding;
            }
            int dimensionPixelSize = resources.getDimensionPixelSize(i3);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iO, iO);
            layoutParams.topMargin = dimensionPixelSize;
            layoutParams.bottomMargin = dimensionPixelSize;
            this.u.setLayoutParams(layoutParams);
            adlyVarT = kro.T(this.b, adlyVar4);
        }
        int iAU3 = a.aU(anziVar.y);
        if (iAU3 != 0 && iAU3 == 2) {
            View view = this.b;
            view.setForeground(null);
            view.setImportantForAccessibility(2);
        }
        int i4 = this.K;
        int iB3 = adlyVar4.b("backgroundColor", i4);
        this.Q = iB3;
        View view2 = this.b;
        view2.setBackgroundColor(iB3);
        TextView textView = this.x;
        textView.setTextAppearance(R.style.TextAppearance_YouTubeMusic_ListItemTitle);
        Context context2 = this.f;
        textView.setTypeface(ackm.ROBOTO_MEDIUM.c(context2, 0));
        alay alayVar = anziVar.g;
        if (alayVar == null) {
            alayVar = alay.a;
        }
        tuk.u(textView, ackj.k(null, alayVar, null, false));
        alay alayVar2 = anziVar.h;
        if (alayVar2 == null) {
            alayVar2 = alay.a;
        }
        Spanned spannedK = ackj.k(null, alayVar2, null, true);
        Optional optionalG = ixt.g(spannedK, context2.getResources());
        TextView textView2 = this.y;
        tuk.u(textView2, spannedK);
        if (optionalG.isPresent()) {
            tuk.u(textView2, ackj.b(ackj.c(spannedK.toString()), (String) optionalG.get()));
            textView2.setContentDescription(optionalG.get());
        }
        new adxc(R.dimen.music_thumbnail_default_corner_radius).a(adlyVarT, null, -1);
        alay alayVar3 = anziVar.e;
        if (alayVar3 == null) {
            alayVar3 = alay.a;
        }
        Spanned spannedK2 = ackj.k(null, alayVar3, null, false);
        boolean zIsEmpty = TextUtils.isEmpty(spannedK2);
        TextView textView3 = this.w;
        if (zIsEmpty) {
            textView3.setVisibility(8);
            z = false;
        } else {
            textView3.setText(spannedK2);
            textView3.setVisibility(0);
            z = true;
        }
        apji apjiVar = anziVar.c;
        if (apjiVar == null) {
            apjiVar = apji.a;
        }
        Optional optionalH = kro.H(apjiVar, anpp.a);
        if (optionalH.isPresent()) {
            jdr jdrVar = this.h;
            jdrVar.hU(adlyVarT, (anpo) optionalH.get());
            optionalEmpty = Optional.of(jdrVar.a);
        } else {
            apji apjiVar2 = anziVar.c;
            if (apjiVar2 == null) {
                apjiVar2 = apji.a;
            }
            Optional optionalH2 = kro.H(apjiVar2, anmn.a);
            if (optionalH2.isPresent()) {
                this.l.d((anmm) optionalH2.get());
                optionalEmpty = Optional.of(this.D);
            } else {
                apji apjiVar3 = anziVar.c;
                if (apjiVar3 == null) {
                    apjiVar3 = apji.a;
                }
                Optional optionalH3 = kro.H(apjiVar3, anyj.a);
                if (optionalH3.isPresent()) {
                    jfr jfrVar = this.k;
                    jfrVar.hU(adlyVarT, (anyi) optionalH3.get());
                    optionalEmpty = Optional.of(jfrVar.a);
                } else {
                    optionalEmpty = Optional.empty();
                }
            }
        }
        boolean zIsPresent = optionalEmpty.isPresent();
        ViewGroup viewGroup = this.u;
        if (zIsPresent) {
            viewGroup.removeAllViews();
            viewGroup.addView((View) optionalEmpty.get());
            ((FrameLayout.LayoutParams) ((View) optionalEmpty.get()).getLayoutParams()).gravity = 17;
            i = 0;
            viewGroup.setVisibility(0);
        } else {
            i = 0;
            viewGroup.setVisibility(8);
        }
        if (z) {
            q(adlyVarT, anziVar, context2.getResources().getDimensionPixelSize(R.dimen.two_column_item_list_index_width));
        } else {
            this.u.setVisibility(i);
            q(adlyVarT, anziVar, o(anziVar));
        }
        apji apjiVar4 = anziVar.w;
        if (apjiVar4 == null) {
            apjiVar4 = apji.a;
        }
        Optional optionalH4 = kro.H(apjiVar4, anmv.a);
        LinearLayout linearLayout = this.t;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) linearLayout.getLayoutParams();
        int dimensionPixelSize2 = context2.getResources().getDimensionPixelSize(R.dimen.two_column_item_horizontal_padding);
        if (optionalH4.isPresent()) {
            anmu anmuVar = (anmu) optionalH4.get();
            ViewGroup viewGroup2 = this.E;
            kro.Q(anmuVar, viewGroup2, this.i, adlyVarT);
            viewGroup2.setVisibility(0);
            marginLayoutParams.setMarginEnd(0);
        } else {
            marginLayoutParams.setMarginEnd(dimensionPixelSize2);
        }
        marginLayoutParams.setMarginStart(dimensionPixelSize2);
        jeo.e(adlyVarT, linearLayout);
        ViewGroup viewGroup3 = this.J;
        admh admhVar = this.i;
        kro.X(viewGroup3, admhVar);
        if (anziVar != null) {
            apji apjiVar5 = anziVar.A;
            if (apjiVar5 == null) {
                apjiVar5 = apji.a;
            }
            aihl aihlVarCheckIsLite = aihn.checkIsLite(akrs.a);
            apjiVar5.c(aihlVarCheckIsLite);
            if (apjiVar5.j.n(aihlVarCheckIsLite.d)) {
                apji apjiVar6 = anziVar.A;
                if (apjiVar6 == null) {
                    apjiVar6 = apji.a;
                }
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(akrs.a);
                apjiVar6.c(aihlVarCheckIsLite2);
                Object objK = apjiVar6.j.k(aihlVarCheckIsLite2.d);
                kro.Q(this.I.a((akrn) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK))), viewGroup3, admhVar, adlyVar4);
            }
        }
        if (this.S.l(189, 45673447L, false)) {
            m();
            if ((anziVar.b & 8388608) == 0) {
                i2 = 0;
            } else {
                apji apjiVar7 = anziVar.B;
                if (apjiVar7 == null) {
                    apjiVar7 = apji.a;
                }
                aihl aihlVarCheckIsLite3 = aihn.checkIsLite(akrs.a);
                apjiVar7.c(aihlVarCheckIsLite3);
                if (apjiVar7.j.n(aihlVarCheckIsLite3.d)) {
                    if (textView != null) {
                        textView.setMaxLines(1);
                    }
                    apji apjiVar8 = anziVar.B;
                    if (apjiVar8 == null) {
                        apjiVar8 = apji.a;
                    }
                    aihl aihlVarCheckIsLite4 = aihn.checkIsLite(akrs.a);
                    apjiVar8.c(aihlVarCheckIsLite4);
                    Object objK2 = apjiVar8.j.k(aihlVarCheckIsLite4.d);
                    akrn akrnVar = (akrn) (objK2 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK2));
                    acxt acxtVar = this.d;
                    if (acxtVar == null) {
                        acxtVar = (acxt) this.P.io();
                        this.d = acxtVar;
                        if (acxtVar != null) {
                            if (ikoVar.b == null) {
                                ikoVar.b = this.I.a(akrnVar);
                            }
                            acxmVar = ikoVar.b;
                            if (acxmVar != null) {
                                ijt ijtVarA = ijt.a(adlyVar4);
                                ijtVarA.getClass();
                                this.M = ijtVarA;
                                acxtVar.b = (avlr) ijtVarA.a;
                                acxt acxtVar2 = acxtVar;
                                i2 = 0;
                                acvw acvwVar = new acvw(this, acxtVar2, adlyVar, acxmVar, 1);
                                adlyVar4 = adlyVar;
                                acxtVar2.g(adlyVar4, acxmVar, acvwVar);
                            } else {
                                i2 = 0;
                            }
                        } else {
                            i2 = 0;
                        }
                    } else {
                        if (ikoVar.b == null) {
                            ikoVar.b = this.I.a(akrnVar);
                        }
                        acxmVar = ikoVar.b;
                        if (acxmVar != null) {
                            ijt ijtVarA2 = ijt.a(adlyVar4);
                            ijtVarA2.getClass();
                            this.M = ijtVarA2;
                            acxtVar.b = (avlr) ijtVarA2.a;
                            acxt acxtVar3 = acxtVar;
                            i2 = 0;
                            acvw acvwVar2 = new acvw(this, acxtVar3, adlyVar, acxmVar, 1);
                            adlyVar4 = adlyVar;
                            acxtVar3.g(adlyVar4, acxmVar, acvwVar2);
                        } else {
                            i2 = 0;
                        }
                    }
                } else {
                    i2 = 0;
                }
            }
        } else {
            i2 = 0;
            m();
            if ((anziVar.b & 8388608) != 0) {
                apji apjiVar9 = anziVar.B;
                if (apjiVar9 == null) {
                    apjiVar9 = apji.a;
                }
                aihl aihlVarCheckIsLite5 = aihn.checkIsLite(akrs.a);
                apjiVar9.c(aihlVarCheckIsLite5);
                if (apjiVar9.j.n(aihlVarCheckIsLite5.d)) {
                    textView.setMaxLines(1);
                    apji apjiVar10 = anziVar.B;
                    if (apjiVar10 == null) {
                        apjiVar10 = apji.a;
                    }
                    aihl aihlVarCheckIsLite6 = aihn.checkIsLite(akrs.a);
                    apjiVar10.c(aihlVarCheckIsLite6);
                    Object objK3 = apjiVar10.j.k(aihlVarCheckIsLite6.d);
                    akrn akrnVar2 = (akrn) (objK3 == null ? aihlVarCheckIsLite6.b : aihlVarCheckIsLite6.c(objK3));
                    ijt ijtVarA3 = ijt.a(adlyVar4);
                    ijtVarA3.getClass();
                    this.M = ijtVarA3;
                    Object obj2 = ijtVarA3 != null ? ijtVarA3.a : null;
                    ntw ntwVarA = ntx.a((ntr) this.L.io());
                    ntwVarA.c(false);
                    mel melVar = new mel(context2, ntwVarA.a());
                    if (obj2 != null) {
                        melVar.c = (avlr) obj2;
                    }
                    melVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 17));
                    melVar.b = new adat(adlyVar4.b);
                    acxm acxmVarA = this.I.a(akrnVar2);
                    acxm acxmVar2 = ikoVar.b;
                    if (acxmVar2 != null) {
                        melVar.a(acxmVarA.c, acxmVar2.a());
                    } else {
                        melVar.a(acxmVarA.c, acxmVarA.a());
                        ikoVar.b = acxmVarA;
                    }
                    this.N = melVar;
                    ViewGroup viewGroup4 = this.c;
                    viewGroup4.addView(melVar);
                    viewGroup4.setVisibility(0);
                    viewGroup4.bringToFront();
                }
            }
        }
        LinearLayout linearLayout2 = this.z;
        if (linearLayout2.getChildCount() > 0) {
            kro.X(linearLayout2, admhVar);
        }
        kro.W(anziVar.t, linearLayout2, admhVar, adlyVarT);
        aiqe aiqeVar = anziVar.o;
        if (aiqeVar == null) {
            aiqeVar = aiqe.a;
        }
        kro.aa(view2, aiqeVar);
        apji apjiVar11 = anziVar.p;
        if (apjiVar11 == null) {
            apjiVar11 = apji.a;
        }
        anfy anfyVar = (anfy) kro.H(apjiVar11, angi.a).orElse(null);
        izr izrVar = this.g;
        ImageView imageView = this.B;
        adly adlyVar5 = adlyVar4;
        anzi anziVar5 = anziVar;
        izrVar.e(view2, imageView, true != this.p ? anfyVar : null, anziVar5, adlyVar4.b);
        int i5 = anziVar5.r;
        int iAV = a.aV(i5);
        int i6 = 3;
        if (iAV == 0 || iAV != 3) {
            int iAV2 = a.aV(i5);
            if (iAV2 == 0 || iAV2 != 2) {
                izrVar.m(view2, imageView, null, anziVar5, adlyVar5.b);
                izrVar.f(this.A, null, anziVar5, adlyVar5.b);
            } else {
                izrVar.m(view2, imageView, null, anziVar5, adlyVar5.b);
                RecyclerView recyclerView = this.A;
                izrVar.f(recyclerView, anfyVar, anziVar5, adlyVar5.b);
                if (adlyVar5.j("hideKeyboardOnClick")) {
                    nh nhVar = recyclerView.m;
                    if (nhVar instanceof admo) {
                        ((admo) nhVar).jR(new hde(9));
                    }
                }
            }
        } else {
            izrVar.m(view2, imageView, true != this.p ? anfyVar : null, anziVar5, adlyVar5.b);
            izrVar.f(this.A, anfyVar, anziVar5, adlyVar5.b);
        }
        tvy tvyVar = (tvy) adlx.b(adlyVarT, tvy.class);
        this.n = tvyVar;
        if (tvyVar != null) {
            tvyVar.a(swipeLayout);
        }
        swipeLayout.h();
        if (anziVar5 != null) {
            if ((anziVar5.b & SemanticState.LiveRegion) != 0) {
                apji apjiVar12 = anziVar5.m;
                if (apjiVar12 == null) {
                    apjiVar12 = apji.a;
                }
                aihl aihlVarCheckIsLite7 = aihn.checkIsLite(anxz.a);
                apjiVar12.c(aihlVarCheckIsLite7);
                Object objK4 = apjiVar12.j.k(aihlVarCheckIsLite7.d);
                Object objC = objK4 == null ? aihlVarCheckIsLite7.b : aihlVarCheckIsLite7.c(objK4);
                p();
                swipeLayout.s = new ColorDrawable(i4);
                context = context2;
                adlyVar2 = adlyVarT;
                adlyVar3 = adlyVar;
                i6 = 3;
                anziVar2 = anziVar5;
                this.o.addAll(ixt.ah(swipeLayout, this.V, (anxx) objC, this.R, context, anziVar2, this.O));
            } else {
                anziVar2 = anziVar5;
                anziVar3 = anziVar2;
            }
            ImageView imageView2 = this.C;
            tuk.l(imageView2, this.p);
            imageView2.setFocusable(this.p);
            anstVar = anziVar2.v;
            if (anstVar == null) {
                anstVar = anst.a;
            }
            if (anstVar.b == 2) {
                str = (String) anstVar.c;
            } else {
                str = "";
            }
            if (!str.isEmpty()) {
                this.m.hU(adlyVar2, anziVar2);
                adlyVar3.b.l(new xgj(xhb.b(39942)));
            }
            View view3 = this.F;
            iAS = a.aS(anziVar2.x);
            f = 1.0f;
            if (iAS != 0 && iAS == i6) {
                f = 0.4f;
            }
            view3.setAlpha(f);
            iAU = a.aU(anziVar2.y);
            if (iAU == 0) {
                iAU = 1;
            }
            if (iAU == 2) {
                View view4 = this.G;
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setCornerRadius(context.getResources().getDimensionPixelSize(R.dimen.two_column_item_highlight_card_corner_radius));
                gradientDrawable.setSize(1, 1);
                gradientDrawable.setColor(context.getColor(R.color.two_column_item_highlight_card_background_color));
                view4.setBackground(new RippleDrawable(ColorStateList.valueOf(tzk.i(context, android.R.attr.colorControlHighlight)), gradientDrawable, null));
                int dimensionPixelSize3 = context.getResources().getDimensionPixelSize(R.dimen.two_column_item_highlight_card_horizontal_padding);
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) linearLayout.getLayoutParams();
                marginLayoutParams2.setMarginStart(marginLayoutParams2.getMarginStart() + dimensionPixelSize3);
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) this.v.getLayoutParams();
                marginLayoutParams3.setMarginStart(marginLayoutParams3.getMarginStart() + dimensionPixelSize3);
                jeo.e(adlyVar3, view4);
            }
        }
        anziVar2 = anziVar5;
        anziVar3 = null;
        adlyVar2 = adlyVarT;
        adlyVar3 = adlyVar5;
        context = context2;
        List<ajnf> listJ = ixt.j(anziVar3);
        ArrayList arrayList = new ArrayList();
        List list = this.o;
        list.clear();
        for (ajnf ajnfVar : listJ) {
            TextView textView4 = (TextView) LayoutInflater.from(context).inflate(R.layout.generic_button_text_item, (ViewGroup) null);
            int dimensionPixelSize4 = context.getResources().getDimensionPixelSize(R.dimen.item_extra_large_spacing);
            textView4.setPaddingRelative(dimensionPixelSize4, i2, dimensionPixelSize4, i2);
            textView4.setLayoutParams(new ViewGroup.LayoutParams(-2, -1));
            jbm jbmVarA = this.T.a(textView4, null, null, anziVar3, true);
            View view5 = jbmVarA.a;
            adul.j(view5, jbmVarA, admhVar.a(ajnfVar));
            jbmVarA.hU(adlyVar2, ajnfVar);
            arrayList.add(view5);
            list.add(jbmVarA);
            i2 = 0;
        }
        tsv.f(swipeLayout, arrayList);
        ImageView imageView3 = this.C;
        tuk.l(imageView3, this.p);
        imageView3.setFocusable(this.p);
        anstVar = anziVar2.v;
        if (anstVar == null) {
            anstVar = anst.a;
        }
        if (anstVar.b == 2) {
            str = (String) anstVar.c;
        } else {
            str = "";
        }
        if (!str.isEmpty()) {
            this.m.hU(adlyVar2, anziVar2);
            adlyVar3.b.l(new xgj(xhb.b(39942)));
        }
        View view6 = this.F;
        iAS = a.aS(anziVar2.x);
        f = 1.0f;
        if (iAS != 0) {
            f = 0.4f;
        }
        view6.setAlpha(f);
        iAU = a.aU(anziVar2.y);
        if (iAU == 0) {
            iAU = 1;
        }
        if (iAU == 2) {
            View view7 = this.G;
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setShape(0);
            gradientDrawable2.setCornerRadius(context.getResources().getDimensionPixelSize(R.dimen.two_column_item_highlight_card_corner_radius));
            gradientDrawable2.setSize(1, 1);
            gradientDrawable2.setColor(context.getColor(R.color.two_column_item_highlight_card_background_color));
            view7.setBackground(new RippleDrawable(ColorStateList.valueOf(tzk.i(context, android.R.attr.colorControlHighlight)), gradientDrawable2, null));
            int dimensionPixelSize5 = context.getResources().getDimensionPixelSize(R.dimen.two_column_item_highlight_card_horizontal_padding);
            ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) linearLayout.getLayoutParams();
            marginLayoutParams4.setMarginStart(marginLayoutParams4.getMarginStart() + dimensionPixelSize5);
            ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) this.v.getLayoutParams();
            marginLayoutParams5.setMarginStart(marginLayoutParams5.getMarginStart() + dimensionPixelSize5);
            jeo.e(adlyVar3, view7);
        }
    }

    @Override // defpackage.admr
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((iko) obj).a.n.G();
    }

    @Override // defpackage.iyv
    public final int f() {
        return this.p ? 3 : 0;
    }

    @Override // defpackage.iyv
    public final int g() {
        return this.q;
    }

    @Override // defpackage.iyv
    public final void h() {
        om.b(this.s);
        this.b.setBackgroundColor(this.Q);
    }

    @Override // defpackage.iyv
    public final void i(jas jasVar) {
        this.C.setOnTouchListener(new jfs(this, jasVar, 2));
    }

    @Override // defpackage.iyw
    public final void j(Canvas canvas, RecyclerView recyclerView, oh ohVar, float f, float f2, int i, boolean z) {
        if (f() != 0) {
            om.c(recyclerView, this.s, 0.0f, f2, z);
            if (f2 != 0.0f) {
                this.b.setBackgroundColor(jkl.a(this.Q, 1.2d));
            }
        }
    }

    public final void m() {
        ViewGroup viewGroup = this.c;
        viewGroup.removeAllViews();
        viewGroup.setVisibility(8);
        kro.X(viewGroup, this.i);
        this.N = null;
    }

    public final void n(int i) {
        TextView textView = this.w;
        if (textView.getVisibility() != 0 || i <= 0) {
            return;
        }
        textView.setText(String.valueOf(i));
    }

    @Override // defpackage.iyw
    public final void k() {
    }

    @Override // defpackage.iyw
    public final void l() {
    }
}
