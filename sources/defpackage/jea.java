package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import com.makeramen.RoundedImageView;
import j$.util.Optional;
import java.util.HashMap;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jea implements adma {
    private final Context a;
    private final jfr b;
    private final izj c;
    private final adlw d;
    private final izr e;
    private final hfk f;
    private final View h;
    private final TextView i;
    private final TextView j;
    private final FrameLayout k;
    private final LinearLayout l;
    private final RoundedImageView m;
    private final LinearLayout n;
    private final jij p;
    private final Set g = new afx(0);
    private final Set o = new afx(0);

    public jea(Context context, jfr jfrVar, adhv adhvVar, vxe vxeVar, izr izrVar, hfk hfkVar, jij jijVar) {
        context.getClass();
        this.a = context;
        this.b = jfrVar;
        this.f = hfkVar;
        this.e = izrVar;
        this.p = jijVar;
        View viewInflate = View.inflate(context, R.layout.music_menu_title, null);
        this.h = viewInflate;
        this.k = (FrameLayout) viewInflate.findViewById(R.id.thumbnail_frame);
        this.l = (LinearLayout) viewInflate.findViewById(R.id.text_container);
        this.i = (TextView) viewInflate.findViewById(R.id.title);
        this.j = (TextView) viewInflate.findViewById(R.id.subtitle);
        if (Build.VERSION.SDK_INT >= 28) {
            viewInflate.setAccessibilityHeading(true);
        }
        RoundedImageView roundedImageView = new RoundedImageView(context);
        this.m = roundedImageView;
        this.c = new izj(adhvVar, roundedImageView);
        this.n = (LinearLayout) viewInflate.findViewById(R.id.end_buttons_container);
        this.d = new jdz(vxeVar, viewInflate, izrVar);
    }

    private final void d(int i) {
        LinearLayout linearLayout = this.l;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) linearLayout.getLayoutParams();
        marginLayoutParams.setMarginStart(i);
        linearLayout.setLayoutParams(marginLayoutParams);
    }

    @Override // defpackage.adma
    public final View a() {
        return this.h;
    }

    @Override // defpackage.adma
    public final void b(admh admhVar) {
        hfk hfkVar = this.f;
        hfkVar.s = null;
        hfkVar.d();
        Set set = this.o;
        afw afwVar = new afw((afx) set);
        while (afwVar.hasNext()) {
            View view = (View) afwVar.next();
            hfkVar.c(view, R.id.like_button);
            hfkVar.c(view, R.id.dislike_button);
        }
        set.clear();
        this.b.b(admhVar);
        this.c.a();
        this.k.removeAllViews();
        Set set2 = this.g;
        afw afwVar2 = new afw((afx) set2);
        while (afwVar2.hasNext()) {
            ((jbm) afwVar2.next()).b(admhVar);
        }
        set2.clear();
        this.n.removeAllViews();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:101:0x0251 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:103:0x0232 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x0176  */
    /* JADX WARN: Code duplicated, block: B:48:0x0186  */
    /* JADX WARN: Code duplicated, block: B:51:0x0194  */
    /* JADX WARN: Code duplicated, block: B:53:0x0198  */
    /* JADX WARN: Code duplicated, block: B:54:0x019b  */
    /* JADX WARN: Code duplicated, block: B:57:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:60:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:63:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:64:0x01db  */
    /* JADX WARN: Code duplicated, block: B:66:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:67:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:70:0x0214  */
    /* JADX WARN: Code duplicated, block: B:73:0x0223  */
    /* JADX WARN: Code duplicated, block: B:77:0x0238  */
    /* JADX WARN: Code duplicated, block: B:81:0x0270  */
    /* JADX WARN: Code duplicated, block: B:82:0x0273  */
    /* JADX WARN: Code duplicated, block: B:88:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:89:0x02be  */
    /* JADX WARN: Code duplicated, block: B:93:0x0300  */
    /* JADX WARN: Code duplicated, block: B:95:0x0308  */
    /* JADX WARN: Code duplicated, block: B:99:0x0295 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v44, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // defpackage.adma
    public final /* bridge */ /* synthetic */ void hU(adly adlyVar, Object obj) {
        Optional optionalEmpty;
        Optional optionalEmpty2;
        LinearLayout linearLayout;
        LinearLayout.LayoutParams layoutParams;
        alay alayVar;
        alay alayVar2;
        TextView textView;
        Context context;
        Optional optionalG;
        int size;
        LinearLayout linearLayout2;
        LinearLayout.LayoutParams layoutParams2;
        HashMap map;
        aihl aihlVarCheckIsLite;
        aihl aihlVarCheckIsLite2;
        Object objK;
        Object objC;
        aihl aihlVarCheckIsLite3;
        aihl aihlVarCheckIsLite4;
        Object objK2;
        Object objC2;
        ajwo ajwoVar;
        hfk hfkVar = this.f;
        anrp anrpVar = (anrp) obj;
        hfkVar.j = adlyVar.b;
        apji apjiVar = anrpVar.e;
        if (apjiVar == null) {
            apjiVar = apji.a;
        }
        aihl aihlVarCheckIsLite5 = aihn.checkIsLite(anyj.a);
        apjiVar.c(aihlVarCheckIsLite5);
        if (apjiVar.j.n(aihlVarCheckIsLite5.d)) {
            apji apjiVar2 = anrpVar.e;
            if (apjiVar2 == null) {
                apjiVar2 = apji.a;
            }
            aihl aihlVarCheckIsLite6 = aihn.checkIsLite(anyj.a);
            apjiVar2.c(aihlVarCheckIsLite6);
            Object objK3 = apjiVar2.j.k(aihlVarCheckIsLite6.d);
            optionalEmpty = Optional.of((anyi) (objK3 == null ? aihlVarCheckIsLite6.b : aihlVarCheckIsLite6.c(objK3)));
        } else {
            optionalEmpty = Optional.empty();
        }
        boolean zIsPresent = optionalEmpty.isPresent();
        int i = R.dimen.menu_item_padding_horizontal;
        if (!zIsPresent) {
            apji apjiVar3 = anrpVar.e;
            if (apjiVar3 == null) {
                apjiVar3 = apji.a;
            }
            aihl aihlVarCheckIsLite7 = aihn.checkIsLite(anmn.a);
            apjiVar3.c(aihlVarCheckIsLite7);
            if (apjiVar3.j.n(aihlVarCheckIsLite7.d)) {
                apji apjiVar4 = anrpVar.e;
                if (apjiVar4 == null) {
                    apjiVar4 = apji.a;
                }
                aihl aihlVarCheckIsLite8 = aihn.checkIsLite(anmn.a);
                apjiVar4.c(aihlVarCheckIsLite8);
                Object objK4 = apjiVar4.j.k(aihlVarCheckIsLite8.d);
                optionalEmpty2 = Optional.of((anmm) (objK4 == null ? aihlVarCheckIsLite8.b : aihlVarCheckIsLite8.c(objK4)));
            } else {
                optionalEmpty2 = Optional.empty();
            }
            if (optionalEmpty2.isPresent()) {
                this.c.d((anmm) optionalEmpty2.get());
                RoundedImageView roundedImageView = this.m;
                roundedImageView.a(R.dimen.music_thumbnail_default_corner_radius);
                this.k.addView(roundedImageView);
            } else {
                this.k.setVisibility(8);
                Resources resources = this.a.getResources();
                if (true != adlyVar.j("useSheetsMenuStyle")) {
                    i = R.dimen.item_large_spacing;
                }
                d(resources.getDimensionPixelSize(i));
            }
            hfkVar.b();
            linearLayout = this.l;
            layoutParams = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
            if (adlyVar.j("useSheetsMenuStyle")) {
                int dimensionPixelSize = linearLayout.getResources().getDimensionPixelSize(R.dimen.menu_title_margin_vertical);
                layoutParams.topMargin = dimensionPixelSize;
                layoutParams.bottomMargin = dimensionPixelSize;
            } else {
                layoutParams.topMargin = 0;
                layoutParams.bottomMargin = 0;
            }
            linearLayout.setLayoutParams(layoutParams);
            TextView textView2 = this.i;
            if ((anrpVar.b & 1) != 0) {
                alayVar = anrpVar.c;
                if (alayVar == null) {
                    alayVar = alay.a;
                }
            } else {
                alayVar = null;
            }
            tuk.u(textView2, ackj.k(null, alayVar, null, false));
            alayVar2 = anrpVar.d;
            if (alayVar2 == null) {
                alayVar2 = alay.a;
            }
            Spanned spannedK = ackj.k(null, alayVar2, null, true);
            textView = this.j;
            tuk.u(textView, spannedK);
            context = this.a;
            optionalG = ixt.g(spannedK, context.getResources());
            if (optionalG.isPresent()) {
                textView.setContentDescription(optionalG.get());
            }
            textView.setSelected(true);
            size = anrpVar.g.size();
            linearLayout2 = this.n;
            if (size == 0) {
                linearLayout2.setVisibility(8);
            } else {
                layoutParams2 = (LinearLayout.LayoutParams) linearLayout2.getLayoutParams();
                if (adlyVar.j("useSheetsMenuStyle")) {
                    layoutParams2.setMarginEnd(linearLayout2.getResources().getDimensionPixelSize(R.dimen.menu_item_trailing_accessory_end_margin));
                } else {
                    layoutParams2.setMarginEnd(linearLayout2.getResources().getDimensionPixelSize(R.dimen.item_extra_small_spacing));
                }
                linearLayout2.setLayoutParams(layoutParams2);
                map = new HashMap();
                if (adlyVar.c("com.google.android.libraries.youtube.innertube.endpoint.tag") != null) {
                    map.put("com.google.android.libraries.youtube.innertube.endpoint.tag", adlyVar.c("com.google.android.libraries.youtube.innertube.endpoint.tag"));
                }
                if (adlyVar.c("toggleMenuItemMutations") != null) {
                    map.put("toggleMenuItemMutations", adlyVar.c("toggleMenuItemMutations"));
                }
                hfkVar.l = map;
                for (apji apjiVar5 : anrpVar.g) {
                    aihlVarCheckIsLite = aihn.checkIsLite(amku.a);
                    apjiVar5.c(aihlVarCheckIsLite);
                    if (apjiVar5.j.n(aihlVarCheckIsLite.d)) {
                        View viewInflate = View.inflate(context, R.layout.music_menu_like_buttons, linearLayout2);
                        this.o.add(viewInflate);
                        aihlVarCheckIsLite2 = aihn.checkIsLite(amku.a);
                        apjiVar5.c(aihlVarCheckIsLite2);
                        objK = apjiVar5.j.k(aihlVarCheckIsLite2.d);
                        if (objK == null) {
                            objC = aihlVarCheckIsLite2.b;
                        } else {
                            objC = aihlVarCheckIsLite2.c(objK);
                        }
                        hfkVar.h((aihh) ((amks) objC).toBuilder(), true);
                        hfkVar.f(viewInflate, true);
                        hfkVar.f(viewInflate, false);
                        izr izrVar = this.e;
                        izrVar.getClass();
                        hfkVar.s = new qcb(izrVar, null);
                    } else {
                        aihlVarCheckIsLite3 = aihn.checkIsLite(ajnp.a);
                        apjiVar5.c(aihlVarCheckIsLite3);
                        if (apjiVar5.j.n(aihlVarCheckIsLite3.d)) {
                            aihlVarCheckIsLite4 = aihn.checkIsLite(ajnp.a);
                            apjiVar5.c(aihlVarCheckIsLite4);
                            objK2 = apjiVar5.j.k(aihlVarCheckIsLite4.d);
                            if (objK2 == null) {
                                objC2 = aihlVarCheckIsLite4.b;
                            } else {
                                objC2 = aihlVarCheckIsLite4.c(objK2);
                            }
                            LayoutInflater.from(context).inflate(R.layout.generic_button_image_item, linearLayout2);
                            View viewFindViewById = linearLayout2.findViewById(R.id.generic_button_image_item);
                            jbm jbmVarA = this.p.a(viewFindViewById, null, null, null, false);
                            jbmVarA.hU(adlyVar, (ajnf) objC2);
                            this.g.add(jbmVarA);
                            int dimension = (int) context.getResources().getDimension(R.dimen.item_medium_spacing);
                            viewFindViewById.setPadding(dimension, dimension, dimension, dimension);
                        }
                    }
                }
            }
            if ((anrpVar.b & 8) != 0) {
                adlw adlwVar = this.d;
                xgn xgnVar = adlyVar.b;
                ajwoVar = anrpVar.f;
                if (ajwoVar == null) {
                    ajwoVar = ajwo.a;
                }
                adlwVar.a(xgnVar, ajwoVar, adlyVar.e(), null);
            }
        }
        new adxc(R.dimen.music_thumbnail_default_corner_radius).a(adlyVar, null, -1);
        jfr jfrVar = this.b;
        jfrVar.hU(adlyVar, (anyi) optionalEmpty.get());
        FrameLayout frameLayout = this.k;
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
        if (adlyVar.j("useSheetsMenuStyle")) {
            int dimensionPixelSize2 = frameLayout.getResources().getDimensionPixelSize(R.dimen.menu_item_leading_accessory_size);
            layoutParams3.width = dimensionPixelSize2;
            layoutParams3.height = dimensionPixelSize2;
            layoutParams3.setMarginStart(frameLayout.getResources().getDimensionPixelSize(R.dimen.menu_item_padding_horizontal));
            layoutParams3.setMarginEnd(frameLayout.getResources().getDimensionPixelSize(R.dimen.menu_item_leading_accessory_end_margin));
        } else {
            int dimensionPixelSize3 = frameLayout.getResources().getDimensionPixelSize(R.dimen.music_bottom_sheet_menu_title_icon_width);
            layoutParams3.width = dimensionPixelSize3;
            layoutParams3.height = dimensionPixelSize3;
            layoutParams3.setMarginStart(frameLayout.getResources().getDimensionPixelSize(R.dimen.item_large_spacing));
            layoutParams3.setMarginEnd(frameLayout.getResources().getDimensionPixelSize(R.dimen.item_medium_spacing));
        }
        frameLayout.setLayoutParams(layoutParams3);
        frameLayout.addView(jfrVar.a);
        this.k.setVisibility(0);
        d(0);
        hfkVar.b();
        linearLayout = this.l;
        layoutParams = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
        if (adlyVar.j("useSheetsMenuStyle")) {
            int dimensionPixelSize4 = linearLayout.getResources().getDimensionPixelSize(R.dimen.menu_title_margin_vertical);
            layoutParams.topMargin = dimensionPixelSize4;
            layoutParams.bottomMargin = dimensionPixelSize4;
        } else {
            layoutParams.topMargin = 0;
            layoutParams.bottomMargin = 0;
        }
        linearLayout.setLayoutParams(layoutParams);
        TextView textView3 = this.i;
        if ((anrpVar.b & 1) != 0) {
            alayVar = anrpVar.c;
            if (alayVar == null) {
                alayVar = alay.a;
            }
        } else {
            alayVar = null;
        }
        tuk.u(textView3, ackj.k(null, alayVar, null, false));
        alayVar2 = anrpVar.d;
        if (alayVar2 == null) {
            alayVar2 = alay.a;
        }
        Spanned spannedK2 = ackj.k(null, alayVar2, null, true);
        textView = this.j;
        tuk.u(textView, spannedK2);
        context = this.a;
        optionalG = ixt.g(spannedK2, context.getResources());
        if (optionalG.isPresent()) {
            textView.setContentDescription(optionalG.get());
        }
        textView.setSelected(true);
        size = anrpVar.g.size();
        linearLayout2 = this.n;
        if (size == 0) {
            linearLayout2.setVisibility(8);
        } else {
            layoutParams2 = (LinearLayout.LayoutParams) linearLayout2.getLayoutParams();
            if (adlyVar.j("useSheetsMenuStyle")) {
                layoutParams2.setMarginEnd(linearLayout2.getResources().getDimensionPixelSize(R.dimen.menu_item_trailing_accessory_end_margin));
            } else {
                layoutParams2.setMarginEnd(linearLayout2.getResources().getDimensionPixelSize(R.dimen.item_extra_small_spacing));
            }
            linearLayout2.setLayoutParams(layoutParams2);
            map = new HashMap();
            if (adlyVar.c("com.google.android.libraries.youtube.innertube.endpoint.tag") != null) {
                map.put("com.google.android.libraries.youtube.innertube.endpoint.tag", adlyVar.c("com.google.android.libraries.youtube.innertube.endpoint.tag"));
            }
            if (adlyVar.c("toggleMenuItemMutations") != null) {
                map.put("toggleMenuItemMutations", adlyVar.c("toggleMenuItemMutations"));
            }
            hfkVar.l = map;
            while (r4.hasNext()) {
                aihlVarCheckIsLite = aihn.checkIsLite(amku.a);
                apjiVar5.c(aihlVarCheckIsLite);
                if (apjiVar5.j.n(aihlVarCheckIsLite.d)) {
                    View viewInflate2 = View.inflate(context, R.layout.music_menu_like_buttons, linearLayout2);
                    this.o.add(viewInflate2);
                    aihlVarCheckIsLite2 = aihn.checkIsLite(amku.a);
                    apjiVar5.c(aihlVarCheckIsLite2);
                    objK = apjiVar5.j.k(aihlVarCheckIsLite2.d);
                    if (objK == null) {
                        objC = aihlVarCheckIsLite2.b;
                    } else {
                        objC = aihlVarCheckIsLite2.c(objK);
                    }
                    hfkVar.h((aihh) ((amks) objC).toBuilder(), true);
                    hfkVar.f(viewInflate2, true);
                    hfkVar.f(viewInflate2, false);
                    izr izrVar2 = this.e;
                    izrVar2.getClass();
                    hfkVar.s = new qcb(izrVar2, null);
                } else {
                    aihlVarCheckIsLite3 = aihn.checkIsLite(ajnp.a);
                    apjiVar5.c(aihlVarCheckIsLite3);
                    if (apjiVar5.j.n(aihlVarCheckIsLite3.d)) {
                        aihlVarCheckIsLite4 = aihn.checkIsLite(ajnp.a);
                        apjiVar5.c(aihlVarCheckIsLite4);
                        objK2 = apjiVar5.j.k(aihlVarCheckIsLite4.d);
                        if (objK2 == null) {
                            objC2 = aihlVarCheckIsLite4.b;
                        } else {
                            objC2 = aihlVarCheckIsLite4.c(objK2);
                        }
                        LayoutInflater.from(context).inflate(R.layout.generic_button_image_item, linearLayout2);
                        View viewFindViewById2 = linearLayout2.findViewById(R.id.generic_button_image_item);
                        jbm jbmVarA2 = this.p.a(viewFindViewById2, null, null, null, false);
                        jbmVarA2.hU(adlyVar, (ajnf) objC2);
                        this.g.add(jbmVarA2);
                        int dimension2 = (int) context.getResources().getDimension(R.dimen.item_medium_spacing);
                        viewFindViewById2.setPadding(dimension2, dimension2, dimension2, dimension2);
                    }
                }
            }
        }
        if ((anrpVar.b & 8) != 0) {
            adlw adlwVar2 = this.d;
            xgn xgnVar2 = adlyVar.b;
            ajwoVar = anrpVar.f;
            if (ajwoVar == null) {
                ajwoVar = ajwo.a;
            }
            adlwVar2.a(xgnVar2, ajwoVar, adlyVar.e(), null);
        }
    }
}
