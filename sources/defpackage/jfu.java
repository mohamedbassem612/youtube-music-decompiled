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
public final class jfu extends admr implements iyv {
    private final ImageView A;
    private final ImageView B;
    private final ViewGroup C;
    private final View D;
    private final View E;
    private final Optional F;
    private final acxn G;
    private final ViewGroup H;
    private final int I;
    private final int J;
    private final jlh K;
    private int L;
    private final vxz M;
    private final jij N;
    private kyr O;
    private final ahgb P;
    public final vxe a;
    public final View b;
    public final grj c;
    private final Context d;
    private final izr e;
    private final jdr f;
    private final admh g;
    private izd h;
    private final jfr i;
    private final izj j;
    private final jgd k;
    private tvy l;
    private final List m = new ArrayList();
    private boolean n;
    private int o;
    private final SwipeLayout p;
    private final LinearLayout q;
    private final ViewGroup s;
    private final FrameLayout t;
    private final TextView u;
    private final TextView v;
    private final TextView w;
    private final LinearLayout x;
    private final RecyclerView y;
    private final ImageView z;

    public jfu(Context context, adhv adhvVar, vxe vxeVar, izr izrVar, admh admhVar, jdr jdrVar, jij jijVar, ahgb ahgbVar, grj grjVar, kwq kwqVar, jfr jfrVar, vxz vxzVar, acxn acxnVar, jlh jlhVar, adxj adxjVar) {
        this.d = context;
        this.a = vxeVar;
        this.e = izrVar;
        this.g = admhVar;
        this.f = jdrVar;
        this.N = jijVar;
        this.P = ahgbVar;
        this.c = grjVar;
        this.M = vxzVar;
        this.G = acxnVar;
        this.K = jlhVar;
        SwipeLayout swipeLayout = (SwipeLayout) LayoutInflater.from(context).inflate(R.layout.music_two_column_item, (ViewGroup) null);
        this.p = swipeLayout;
        this.b = swipeLayout.findViewById(R.id.two_column_item_content_parent);
        View viewFindViewById = swipeLayout.findViewById(R.id.two_column_item_content);
        this.D = viewFindViewById;
        this.E = swipeLayout.findViewById(R.id.two_column_item_highlight);
        LinearLayout linearLayout = (LinearLayout) swipeLayout.findViewById(R.id.thumbnail_index_container);
        this.q = linearLayout;
        TextView textView = (TextView) linearLayout.findViewById(R.id.list_index);
        this.u = textView;
        this.s = (ViewGroup) swipeLayout.findViewById(R.id.thumbnail_parent);
        FrameLayout frameLayout = (FrameLayout) swipeLayout.findViewById(R.id.thumbnail_overlay_parent);
        this.t = frameLayout;
        this.v = (TextView) swipeLayout.findViewById(R.id.title);
        TextView textView2 = (TextView) swipeLayout.findViewById(R.id.subtitle);
        this.w = textView2;
        this.x = (LinearLayout) swipeLayout.findViewById(R.id.subtitle_badges_container);
        this.y = (RecyclerView) swipeLayout.findViewById(R.id.top_level_menu_buttons_anchor);
        ImageView imageView = (ImageView) swipeLayout.findViewById(R.id.contextual_menu_anchor);
        this.z = imageView;
        ImageView imageView2 = (ImageView) swipeLayout.findViewById(R.id.drag_handle_indicator);
        this.A = imageView2;
        imageView.setImageResource(adxjVar.b(arqz.jA));
        imageView2.setImageResource(adxjVar.b(arqz.gQ));
        this.C = (ViewGroup) swipeLayout.findViewById(R.id.custom_index_column_container);
        this.H = (ViewGroup) swipeLayout.findViewById(R.id.contributor_avatars_container);
        this.i = jfrVar;
        ImageView imageView3 = new ImageView(context);
        this.B = imageView3;
        this.j = new izj(adhvVar, imageView3);
        this.n = false;
        this.o = -1;
        this.F = jle.a(frameLayout.getLayoutParams());
        this.k = kwqVar.h(viewFindViewById, textView2);
        int color = context.getColor(R.color.ytm_theme_main_color_dark);
        this.J = color;
        this.I = color;
        textView.setTextColor(context.getColor(R.color.yt_white1_opacity70));
        textView2.setTextColor(context.getColor(R.color.yt_white1_opacity70));
    }

    private final int n(anzi anziVar) {
        int dimensionPixelSize;
        int iAS = a.aS(anziVar.d);
        if (iAS == 0) {
            iAS = 1;
        }
        int i = iAS - 1;
        if (i != 1) {
            Context context = this.d;
            dimensionPixelSize = i != 2 ? context.getResources().getDimensionPixelSize(R.dimen.two_column_item_image_size) : context.getResources().getDimensionPixelSize(R.dimen.two_column_item_size_extra_large);
        } else {
            dimensionPixelSize = this.d.getResources().getDimensionPixelSize(R.dimen.two_column_item_size_large);
        }
        int iAU = a.aU(anziVar.y);
        return (iAU == 0 || iAU != 2) ? dimensionPixelSize : this.d.getResources().getDimensionPixelSize(R.dimen.two_column_item_highlight_card_image_size);
    }

    private final void o() {
        List list = this.m;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((adma) it.next()).b(this.g);
        }
        list.clear();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0056  */
    private final void p(adly adlyVar, anzi anziVar, int i) {
        jgf jgfVar;
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
        Context context = this.d;
        adlyVar2.f("animatedEqualizerSize", Integer.valueOf(context.getResources().getDimensionPixelSize(R.dimen.music_two_column_overlay_size)));
        adlyVar2.f("playButtonSize", Integer.valueOf(context.getResources().getDimensionPixelSize(R.dimen.music_two_column_overlay_size)));
        adlyVar2.f("thumbnailOverlaySize", Integer.valueOf(context.getResources().getDimensionPixelSize(R.dimen.music_two_column_overlay_size)));
        int iAS2 = a.aS(anziVar.x);
        if (iAS2 != 0 && iAS2 == 3) {
            adlyVar2.f("thumbnailOverlayColor", Integer.valueOf(context.getColor(R.color.ytm_color_icon_inactive)));
        }
        adlyVar2.f("nowPlayingIndicatorSize", Integer.valueOf(context.getResources().getDimensionPixelSize(R.dimen.music_extra_small_icon_size)));
        adlyVar2.f("nowPlayingIndicatorMargin", Integer.valueOf(context.getResources().getDimensionPixelSize(R.dimen.item_extra_small_spacing)));
        Iterator it = anziVar.u.iterator();
        while (it.hasNext()) {
            Optional optionalH2 = kro.H((apji) it.next(), anqa.a);
            if (optionalH2.isPresent()) {
                admh admhVar = this.g;
                anpz anpzVar = (anpz) optionalH2.get();
                FrameLayout frameLayout = this.t;
                jdx jdxVar = (jdx) adul.e(admhVar, anpzVar, frameLayout);
                if (jdxVar != null) {
                    int iAU = a.aU(anziVar.y);
                    if (iAU == 0 || iAU != 2) {
                        jdxVar.e = this.D;
                    }
                    alay alayVar = anziVar.e;
                    if (alayVar == null) {
                        alayVar = alay.a;
                    }
                    if (!TextUtils.isEmpty(ackj.k(null, alayVar, null, false))) {
                        jdxVar.h(this.u);
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
        }
        this.O = new kyr((jbb[]) arrayList.toArray(new jbb[0]));
    }

    @Override // defpackage.adma
    public final View a() {
        return this.p;
    }

    @Override // defpackage.adma
    public final void b(admh admhVar) {
        View view = this.b;
        kro.Z(view, 0, 0);
        this.w.setContentDescription(null);
        this.i.b(admhVar);
        this.j.a();
        izd izdVar = this.h;
        if (izdVar != null) {
            izdVar.c();
            this.h = null;
        }
        izr izrVar = this.e;
        izrVar.h(view);
        izrVar.g(this.z);
        this.y.removeAllViews();
        this.s.removeAllViews();
        this.E.setBackground(null);
        kro.X(this.t, admhVar);
        kro.X(this.x, admhVar);
        kro.X(this.H, admhVar);
        o();
        tvy tvyVar = this.l;
        if (tvyVar != null) {
            tvyVar.c(this.p);
        }
        SwipeLayout swipeLayout = this.p;
        swipeLayout.v = null;
        swipeLayout.w = null;
        agke agkeVar = agpi.a;
        tsv.f(swipeLayout, agkeVar);
        tsv.g(swipeLayout, agkeVar);
        this.l = null;
        this.n = false;
        this.o = -1;
        h();
        this.A.setOnTouchListener(null);
        this.k.b(admhVar);
        kyr kyrVar = this.O;
        if (kyrVar != null) {
            kyrVar.t();
            this.O = null;
        }
        ViewGroup viewGroup = this.C;
        viewGroup.setVisibility(8);
        kro.X(viewGroup, admhVar);
    }

    /* JADX WARN: Code duplicated, block: B:159:0x0474  */
    /* JADX WARN: Code duplicated, block: B:162:0x047b  */
    /* JADX WARN: Code duplicated, block: B:163:0x0480  */
    /* JADX WARN: Code duplicated, block: B:166:0x0488  */
    /* JADX WARN: Code duplicated, block: B:174:0x04bb  */
    /* JADX WARN: Code duplicated, block: B:177:0x04bf  */
    /* JADX WARN: Code duplicated, block: B:180:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // defpackage.admr
    public final /* synthetic */ void d(adly adlyVar, Object obj) {
        jfu jfuVar;
        adly adlyVar2;
        adly adlyVarT;
        boolean z;
        Optional optionalEmpty;
        anzi anziVar;
        Context context;
        LinearLayout linearLayout;
        anst anstVar;
        String str;
        int iAS;
        float f;
        int iAU;
        ajwo ajwoVar;
        anzi anziVar2 = (anzi) obj;
        this.n = adlyVar.j("isDraggable");
        int iB = adlyVar.b("sectionControllerPosition", -1);
        int iB2 = adlyVar.b("position", -1);
        if (iB2 >= 0 && iB >= 0) {
            this.o = iB2 - iB;
        }
        if (this.n) {
            jfuVar = this;
            adlyVar2 = adlyVar;
        } else {
            xgn xgnVar = adlyVar.b;
            izd izdVarAc = kro.ac(this.b, anziVar2.n.G(), xgnVar);
            this.h = izdVarAc;
            jfuVar = this;
            adlyVar2 = adlyVar;
            izdVarAc.b(new jft(this, adlyVar, anziVar2, xgnVar, 0));
            izd izdVar = jfuVar.h;
            vxe vxeVar = jfuVar.a;
            if ((anziVar2.b & SemanticState.Focused) != 0) {
                ajwoVar = anziVar2.k;
                if (ajwoVar == null) {
                    anziVar2 = anziVar2;
                    ajwoVar = ajwo.a;
                }
            } else {
                anziVar2 = anziVar2;
                ajwoVar = null;
            }
            anziVar2 = anziVar2;
            izdVar.a(izb.b(vxeVar, xgnVar, ajwoVar, adlyVar2.e()));
        }
        SwipeLayout swipeLayout = jfuVar.p;
        if (swipeLayout.getLayoutParams() == null) {
            adlyVarT = adlyVar2;
        } else {
            swipeLayout.getLayoutParams().width = adlyVar2.b("carouselItemWidth", -1);
            if (jeo.f(adlyVar2)) {
                jeo.e(adlyVar2, jfuVar.t);
            } else {
                Optional optional = jfuVar.F;
                if (optional.isPresent()) {
                    jle.b((ailj) optional.get(), jfuVar.t);
                }
            }
            int iN = jfuVar.n(anziVar2);
            Resources resources = jfuVar.d.getResources();
            int iAU2 = a.aU(anziVar2.y);
            int i = R.dimen.two_column_item_vertical_padding;
            if (iAU2 != 0 && iAU2 == 2) {
                i = R.dimen.two_column_item_highlight_card_vertical_padding;
            }
            int dimensionPixelSize = resources.getDimensionPixelSize(i);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iN, iN);
            layoutParams.topMargin = dimensionPixelSize;
            layoutParams.bottomMargin = dimensionPixelSize;
            jfuVar.s.setLayoutParams(layoutParams);
            adlyVarT = kro.T(jfuVar.b, adlyVar2);
        }
        int iAU3 = a.aU(anziVar2.y);
        if (iAU3 != 0 && iAU3 == 2) {
            View view = jfuVar.b;
            view.setForeground(null);
            view.setImportantForAccessibility(2);
        }
        int iB3 = adlyVar2.b("backgroundColor", jfuVar.I);
        jfuVar.L = iB3;
        View view2 = jfuVar.b;
        view2.setBackgroundColor(iB3);
        TextView textView = jfuVar.v;
        textView.setTextAppearance(R.style.TextAppearance_YouTubeMusic_ListItemTitle);
        Context context2 = jfuVar.d;
        textView.setTypeface(ackm.ROBOTO_MEDIUM.c(context2, 0));
        alay alayVar = anziVar2.g;
        if (alayVar == null) {
            alayVar = alay.a;
        }
        tuk.u(textView, ackj.k(null, alayVar, null, false));
        alay alayVar2 = anziVar2.h;
        if (alayVar2 == null) {
            alayVar2 = alay.a;
        }
        Spanned spannedK = ackj.k(null, alayVar2, null, true);
        TextView textView2 = jfuVar.w;
        tuk.u(textView2, spannedK);
        alay alayVar3 = anziVar2.h;
        if (alayVar3 == null) {
            alayVar3 = alay.a;
        }
        CharSequence charSequenceE = ackj.e(alayVar3);
        if (TextUtils.isEmpty(charSequenceE)) {
            Optional optionalG = ixt.g(spannedK, context2.getResources());
            if (optionalG.isPresent()) {
                tuk.u(textView2, ackj.b(ackj.c(spannedK.toString()), (String) optionalG.get()));
                textView2.setContentDescription(optionalG.get());
            }
        } else {
            tuk.u(textView2, ackj.b(ackj.c(spannedK.toString()), charSequenceE.toString()));
            textView2.setContentDescription(charSequenceE);
        }
        new adxc(R.dimen.music_thumbnail_default_corner_radius).a(adlyVarT, null, -1);
        alay alayVar4 = anziVar2.e;
        if (alayVar4 == null) {
            alayVar4 = alay.a;
        }
        Spanned spannedK2 = ackj.k(null, alayVar4, null, false);
        boolean zIsEmpty = TextUtils.isEmpty(spannedK2);
        TextView textView3 = jfuVar.u;
        if (zIsEmpty) {
            textView3.setVisibility(8);
            z = false;
        } else {
            textView3.setText(spannedK2);
            textView3.setVisibility(0);
            z = true;
        }
        apji apjiVar = anziVar2.c;
        if (apjiVar == null) {
            apjiVar = apji.a;
        }
        Optional optionalH = kro.H(apjiVar, anpp.a);
        if (optionalH.isPresent()) {
            jdr jdrVar = jfuVar.f;
            jdrVar.hU(adlyVarT, (anpo) optionalH.get());
            optionalEmpty = Optional.of(jdrVar.a);
        } else {
            apji apjiVar2 = anziVar2.c;
            if (apjiVar2 == null) {
                apjiVar2 = apji.a;
            }
            Optional optionalH2 = kro.H(apjiVar2, anmn.a);
            if (optionalH2.isPresent()) {
                jfuVar.j.d((anmm) optionalH2.get());
                optionalEmpty = Optional.of(jfuVar.B);
            } else {
                apji apjiVar3 = anziVar2.c;
                if (apjiVar3 == null) {
                    apjiVar3 = apji.a;
                }
                Optional optionalH3 = kro.H(apjiVar3, anyj.a);
                if (optionalH3.isPresent()) {
                    jfr jfrVar = jfuVar.i;
                    jfrVar.hU(adlyVarT, (anyi) optionalH3.get());
                    optionalEmpty = Optional.of(jfrVar.a);
                } else {
                    optionalEmpty = Optional.empty();
                }
            }
        }
        boolean zIsPresent = optionalEmpty.isPresent();
        ViewGroup viewGroup = jfuVar.s;
        if (zIsPresent) {
            viewGroup.removeAllViews();
            viewGroup.addView((View) optionalEmpty.get());
            ((FrameLayout.LayoutParams) ((View) optionalEmpty.get()).getLayoutParams()).gravity = 17;
            viewGroup.setVisibility(0);
        } else {
            viewGroup.setVisibility(8);
        }
        if (z) {
            jfuVar.p(adlyVarT, anziVar2, context2.getResources().getDimensionPixelSize(R.dimen.two_column_item_list_index_width));
        } else {
            jfuVar.s.setVisibility(0);
            jfuVar.p(adlyVarT, anziVar2, jfuVar.n(anziVar2));
        }
        apji apjiVar4 = anziVar2.w;
        if (apjiVar4 == null) {
            apjiVar4 = apji.a;
        }
        Optional optionalH4 = kro.H(apjiVar4, anmv.a);
        LinearLayout linearLayout2 = jfuVar.q;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) linearLayout2.getLayoutParams();
        int dimensionPixelSize2 = context2.getResources().getDimensionPixelSize(R.dimen.two_column_item_horizontal_padding);
        if (optionalH4.isPresent()) {
            anmu anmuVar = (anmu) optionalH4.get();
            ViewGroup viewGroup2 = jfuVar.C;
            kro.Q(anmuVar, viewGroup2, jfuVar.g, adlyVarT);
            viewGroup2.setVisibility(0);
            marginLayoutParams.setMarginEnd(0);
        } else {
            marginLayoutParams.setMarginEnd(dimensionPixelSize2);
        }
        marginLayoutParams.setMarginStart(dimensionPixelSize2);
        jeo.e(adlyVarT, linearLayout2);
        if (anziVar2 != null) {
            apji apjiVar5 = anziVar2.A;
            if (apjiVar5 == null) {
                apjiVar5 = apji.a;
            }
            aihl aihlVarCheckIsLite = aihn.checkIsLite(akrs.a);
            apjiVar5.c(aihlVarCheckIsLite);
            if (apjiVar5.j.n(aihlVarCheckIsLite.d)) {
                apji apjiVar6 = anziVar2.A;
                if (apjiVar6 == null) {
                    apjiVar6 = apji.a;
                }
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(akrs.a);
                apjiVar6.c(aihlVarCheckIsLite2);
                Object objK = apjiVar6.j.k(aihlVarCheckIsLite2.d);
                kro.Q(jfuVar.G.a((akrn) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK))), jfuVar.H, jfuVar.g, adlyVar2);
            }
        }
        LinearLayout linearLayout3 = jfuVar.x;
        if (linearLayout3.getChildCount() > 0) {
            kro.X(linearLayout3, jfuVar.g);
        }
        aiie aiieVar = anziVar2.t;
        admh admhVar = jfuVar.g;
        kro.W(aiieVar, linearLayout3, admhVar, adlyVarT);
        aiqe aiqeVar = anziVar2.o;
        if (aiqeVar == null) {
            aiqeVar = aiqe.a;
        }
        kro.aa(view2, aiqeVar);
        apji apjiVar7 = anziVar2.p;
        if (apjiVar7 == null) {
            apjiVar7 = apji.a;
        }
        anfy anfyVar = (anfy) kro.H(apjiVar7, angi.a).orElse(null);
        izr izrVar = jfuVar.e;
        anfy anfyVar2 = anfyVar;
        ImageView imageView = jfuVar.z;
        if (true == jfuVar.n) {
            anfyVar2 = null;
        }
        izrVar.e(view2, imageView, anfyVar2, anziVar2, adlyVar2.b);
        int i2 = anziVar2.r;
        int iAV = a.aV(i2);
        if (iAV == 0 || iAV != 3) {
            int iAV2 = a.aV(i2);
            if (iAV2 == 0 || iAV2 != 2) {
                izrVar.m(view2, imageView, null, anziVar2, adlyVar2.b);
                izrVar.f(jfuVar.y, null, anziVar2, adlyVar2.b);
            } else {
                izrVar.m(view2, imageView, null, anziVar2, adlyVar2.b);
                RecyclerView recyclerView = jfuVar.y;
                izrVar.f(recyclerView, anfyVar2, anziVar2, adlyVar2.b);
                if (adlyVar2.j("hideKeyboardOnClick")) {
                    nh nhVar = recyclerView.m;
                    if (nhVar instanceof admo) {
                        ((admo) nhVar).jR(new hde(8));
                    }
                }
            }
        } else {
            izrVar.m(view2, imageView, true != jfuVar.n ? anfyVar2 : null, anziVar2, adlyVar2.b);
            izrVar.f(jfuVar.y, anfyVar2, anziVar2, adlyVar2.b);
        }
        tvy tvyVar = (tvy) adlx.b(adlyVarT, tvy.class);
        jfuVar.l = tvyVar;
        if (tvyVar != null) {
            tvyVar.a(swipeLayout);
        }
        swipeLayout.h();
        if (anziVar2 != null) {
            if ((anziVar2.b & SemanticState.LiveRegion) != 0) {
                apji apjiVar8 = anziVar2.m;
                if (apjiVar8 == null) {
                    apjiVar8 = apji.a;
                }
                aihl aihlVarCheckIsLite3 = aihn.checkIsLite(anxz.a);
                apjiVar8.c(aihlVarCheckIsLite3);
                Object objK2 = apjiVar8.j.k(aihlVarCheckIsLite3.d);
                anxx anxxVar = (anxx) (objK2 == null ? aihlVarCheckIsLite3.b : aihlVarCheckIsLite3.c(objK2));
                jfuVar.o();
                swipeLayout.s = new ColorDrawable(jfuVar.J);
                linearLayout = linearLayout2;
                anzi anziVar3 = anziVar2;
                context = context2;
                anziVar2 = anziVar3;
                jfuVar.m.addAll(ixt.ah(swipeLayout, jfuVar.P, anxxVar, jfuVar.M, context2, anziVar3, jfuVar.K));
            } else {
                anziVar = anziVar2;
            }
            ImageView imageView2 = jfuVar.A;
            tuk.l(imageView2, jfuVar.n);
            imageView2.setFocusable(jfuVar.n);
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
                jfuVar.k.hU(adlyVarT, anziVar2);
                adlyVar2.b.l(new xgj(xhb.b(39942)));
            }
            View view3 = jfuVar.D;
            iAS = a.aS(anziVar2.x);
            f = 1.0f;
            if (iAS != 0 && iAS == 3) {
                f = 0.4f;
            }
            view3.setAlpha(f);
            iAU = a.aU(anziVar2.y);
            if (iAU == 0) {
                iAU = 1;
            }
            if (iAU == 2) {
                View view4 = jfuVar.E;
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setCornerRadius(context.getResources().getDimensionPixelSize(R.dimen.two_column_item_highlight_card_corner_radius));
                gradientDrawable.setSize(1, 1);
                gradientDrawable.setColor(context.getColor(R.color.two_column_item_highlight_card_background_color));
                view4.setBackground(new RippleDrawable(ColorStateList.valueOf(tzk.i(context, android.R.attr.colorControlHighlight)), gradientDrawable, null));
                int dimensionPixelSize3 = context.getResources().getDimensionPixelSize(R.dimen.two_column_item_highlight_card_horizontal_padding);
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) linearLayout.getLayoutParams();
                marginLayoutParams2.setMarginStart(marginLayoutParams2.getMarginStart() + dimensionPixelSize3);
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) jfuVar.t.getLayoutParams();
                marginLayoutParams3.setMarginStart(marginLayoutParams3.getMarginStart() + dimensionPixelSize3);
                jeo.e(adlyVar2, view4);
            }
        }
        anziVar = null;
        context = context2;
        linearLayout = linearLayout2;
        List<ajnf> listJ = ixt.j(anziVar);
        ArrayList arrayList = new ArrayList();
        List list = jfuVar.m;
        list.clear();
        for (ajnf ajnfVar : listJ) {
            TextView textView4 = (TextView) LayoutInflater.from(context).inflate(R.layout.generic_button_text_item, (ViewGroup) null);
            int dimensionPixelSize4 = context.getResources().getDimensionPixelSize(R.dimen.item_extra_large_spacing);
            textView4.setPaddingRelative(dimensionPixelSize4, 0, dimensionPixelSize4, 0);
            textView4.setLayoutParams(new ViewGroup.LayoutParams(-2, -1));
            jbm jbmVarA = jfuVar.N.a(textView4, null, null, anziVar, true);
            View view5 = jbmVarA.a;
            adul.j(view5, jbmVarA, admhVar.a(ajnfVar));
            jbmVarA.hU(adlyVarT, ajnfVar);
            arrayList.add(view5);
            list.add(jbmVarA);
        }
        tsv.f(swipeLayout, arrayList);
        ImageView imageView3 = jfuVar.A;
        tuk.l(imageView3, jfuVar.n);
        imageView3.setFocusable(jfuVar.n);
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
            jfuVar.k.hU(adlyVarT, anziVar2);
            adlyVar2.b.l(new xgj(xhb.b(39942)));
        }
        View view6 = jfuVar.D;
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
            View view7 = jfuVar.E;
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setShape(0);
            gradientDrawable2.setCornerRadius(context.getResources().getDimensionPixelSize(R.dimen.two_column_item_highlight_card_corner_radius));
            gradientDrawable2.setSize(1, 1);
            gradientDrawable2.setColor(context.getColor(R.color.two_column_item_highlight_card_background_color));
            view7.setBackground(new RippleDrawable(ColorStateList.valueOf(tzk.i(context, android.R.attr.colorControlHighlight)), gradientDrawable2, null));
            int dimensionPixelSize5 = context.getResources().getDimensionPixelSize(R.dimen.two_column_item_highlight_card_horizontal_padding);
            ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) linearLayout.getLayoutParams();
            marginLayoutParams4.setMarginStart(marginLayoutParams4.getMarginStart() + dimensionPixelSize5);
            ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) jfuVar.t.getLayoutParams();
            marginLayoutParams5.setMarginStart(marginLayoutParams5.getMarginStart() + dimensionPixelSize5);
            jeo.e(adlyVar2, view7);
        }
    }

    @Override // defpackage.admr
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((anzi) obj).n.G();
    }

    @Override // defpackage.iyv
    public final int f() {
        return this.n ? 3 : 0;
    }

    @Override // defpackage.iyv
    public final int g() {
        return this.o;
    }

    @Override // defpackage.iyv
    public final void h() {
        om.b(this.p);
        this.b.setBackgroundColor(this.L);
    }

    @Override // defpackage.iyv
    public final void i(jas jasVar) {
        this.A.setOnTouchListener(new jfs(this, jasVar, 0));
    }

    @Override // defpackage.iyw
    public final void j(Canvas canvas, RecyclerView recyclerView, oh ohVar, float f, float f2, int i, boolean z) {
        if (f() != 0) {
            om.c(recyclerView, this.p, 0.0f, f2, z);
            if (f2 != 0.0f) {
                this.b.setBackgroundColor(jkl.a(this.L, 1.2d));
            }
        }
    }

    public final void m(int i) {
        TextView textView = this.u;
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
