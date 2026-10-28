package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import android.widget.TextView;
import app.rive.semantics.SemanticState;
import j$.util.Optional;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class jbm implements ViewTreeObserver.OnGlobalLayoutListener, adma, xgm, adlu {
    public static final /* synthetic */ int f = 0;
    private static final agkj g = agkj.k("hideEnclosingActionCommandKey", "com.google.android.libraries.youtube.innertube.action.HideEnclosingAction.tag", "musicShelfBottomActionCommandKey", "com.google.android.libraries.youtube.innertube.endpoint.tag");
    private static final agrf h = agrf.h("com/google/android/apps/youtube/music/ui/presenter/ButtonPresenter");
    public final View a;
    public final int b;
    protected ajnf c;
    protected adly d;
    public boolean e;
    private final View i;
    private final aduv j;
    private final vxe k;
    private final adlw l;
    private final Optional m;
    private final boolean n;
    private final int o;
    private final int p;
    private final Drawable q;
    private final Drawable r;
    private ajwo s;
    private ajwo t;
    private Object u;
    private final View.OnClickListener v;

    public jbm(aduv aduvVar, vxe vxeVar, Optional optional, View view, View view2, View.OnClickListener onClickListener, Object obj, boolean z) {
        this.e = true;
        this.a = view;
        vxeVar.getClass();
        hdv hdvVar = new hdv(vxeVar, this);
        this.k = hdvVar;
        this.j = aduvVar;
        this.l = new adlw(hdvVar, view, this);
        this.v = onClickListener;
        this.u = obj;
        this.n = z;
        this.i = view2;
        this.m = optional;
        this.o = e().getMinimumWidth();
        this.p = e().getMinimumHeight();
        this.q = view.getBackground();
        this.r = view2 != null ? view2.getBackground() : null;
        Optional optionalL = l();
        this.b = ((Integer) (true == optionalL.isPresent() ? Optional.ofNullable(Integer.valueOf(((TextView) optionalL.get()).getCurrentTextColor())) : optionalL).orElse(0)).intValue();
    }

    public static final void k(TextView textView) {
        for (Drawable drawable : textView.getCompoundDrawables()) {
            if (drawable != null) {
                ColorStateList textColors = textView.getTextColors();
                int i = jkl.a;
                drawable.mutate().setTintList(textColors);
            }
        }
    }

    private final Optional l() {
        View view = this.a;
        return view instanceof TextView ? Optional.of((TextView) view) : Optional.empty();
    }

    private final void m(Context context, Drawable drawable) {
        View viewE = e();
        Interpolator interpolator = aedd.a;
        viewE.setOnTouchListener(new aedc());
        aedd.c(e(), tzk.i(context, R.attr.colorControlHighlight), context.getResources().getDimensionPixelSize(com.google.android.apps.youtube.music.R.dimen.fully_rounded_corner_radius), drawable);
    }

    private static final GradientDrawable n(Context context, int i, Integer num) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(context.getResources().getDimensionPixelSize(com.google.android.apps.youtube.music.R.dimen.fully_rounded_corner_radius));
        if (num != null) {
            gradientDrawable.setStroke(context.getResources().getDimensionPixelSize(com.google.android.apps.youtube.music.R.dimen.button_border_width), context.getColor(num.intValue()));
        }
        gradientDrawable.setColor(context.getColor(i));
        return gradientDrawable;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0102  */
    private final void o(ajnf ajnfVar, adly adlyVar, Context context, int i, Integer num, Drawable drawable, Integer num2, int i2) {
        int i3;
        int i4;
        boolean z;
        int i5;
        int dimensionPixelSize;
        int i6;
        int i7;
        Optional optionalL = l();
        jbl jblVar = new jbl(context, i, i2);
        if (true == optionalL.isPresent()) {
            Object obj = optionalL.get();
            Context context2 = jblVar.a;
            int i8 = jblVar.b;
            int i9 = jblVar.c;
            TextView textView = (TextView) obj;
            textView.setAllCaps(false);
            int i10 = i9 - 1;
            if (i10 == 2) {
                i6 = com.google.android.apps.youtube.music.R.dimen.button_icon_padding_small;
                i7 = com.google.android.apps.youtube.music.R.dimen.button_text_size_small;
            } else if (i10 == 3) {
                i6 = com.google.android.apps.youtube.music.R.dimen.button_icon_padding_large;
                i7 = com.google.android.apps.youtube.music.R.dimen.button_text_size_large;
            } else if (i10 == 4) {
                i6 = com.google.android.apps.youtube.music.R.dimen.button_icon_padding_extra_large;
                i7 = com.google.android.apps.youtube.music.R.dimen.button_text_size_extra_large;
            } else if (i10 != 5) {
                i6 = com.google.android.apps.youtube.music.R.dimen.button_icon_padding_medium;
                i7 = com.google.android.apps.youtube.music.R.dimen.button_text_size_medium;
            } else {
                i6 = com.google.android.apps.youtube.music.R.dimen.button_icon_padding_extra_small;
                i7 = com.google.android.apps.youtube.music.R.dimen.button_text_size_extra_small;
            }
            textView.setTextSize(0, context2.getResources().getDimension(i7));
            textView.setTypeface(ackm.ROBOTO_MEDIUM.c(context2, 0));
            textView.setTextColor(jkl.b(i8));
            textView.setCompoundDrawablePadding(context2.getResources().getDimensionPixelSize(i6));
            textView.setMaxLines(1);
            textView.setEllipsize(TextUtils.TruncateAt.END);
        }
        if (this.n && num != null) {
            tuk.k(this.a, new ColorDrawable(context.getColor(num.intValue())), 0);
            return;
        }
        this.a.setStateListAnimator(null);
        View viewE = e();
        int i11 = i2 - 1;
        if (i11 == 2) {
            i3 = com.google.android.apps.youtube.music.R.dimen.button_horizontal_padding_small;
            i4 = com.google.android.apps.youtube.music.R.dimen.button_min_height_small;
        } else if (i11 == 3) {
            i3 = com.google.android.apps.youtube.music.R.dimen.button_horizontal_padding_large;
            i4 = com.google.android.apps.youtube.music.R.dimen.button_min_height_large;
        } else if (i11 == 4) {
            i3 = com.google.android.apps.youtube.music.R.dimen.button_horizontal_padding_extra_large;
            i4 = com.google.android.apps.youtube.music.R.dimen.button_min_height_extra_large;
        } else if (i11 != 5) {
            i3 = com.google.android.apps.youtube.music.R.dimen.button_horizontal_padding_medium;
            i4 = com.google.android.apps.youtube.music.R.dimen.button_min_height_medium;
        } else {
            i3 = com.google.android.apps.youtube.music.R.dimen.button_horizontal_padding_extra_small;
            i4 = com.google.android.apps.youtube.music.R.dimen.button_min_height_extra_small;
        }
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(i4);
        if (l().isPresent()) {
            alay alayVar = ajnfVar.m;
            if (alayVar == null) {
                alayVar = alay.a;
            }
            z = TextUtils.isEmpty(ackj.k(null, alayVar, null, false).toString()) ? false : true;
        }
        if (z) {
            dimensionPixelSize = context.getResources().getDimensionPixelSize(i3);
            i5 = dimensionPixelSize2 << 1;
        } else {
            i5 = dimensionPixelSize2;
            dimensionPixelSize = 0;
        }
        viewE.setMinimumWidth(i5);
        viewE.setMinimumHeight(dimensionPixelSize2);
        viewE.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
        if (drawable != null) {
            m(context, drawable);
        } else if (num != null) {
            m(context, n(context, num.intValue(), num2));
        } else {
            ((agrc) ((agrc) h.b()).k("com/google/android/apps/youtube/music/ui/presenter/ButtonPresenter", "setStyle", 712, "ButtonPresenter.java")).t("Must set drawable or color to set style");
        }
        if (!adlyVar.j("useGradientBorder") || num == null) {
            return;
        }
        int iIntValue = num.intValue();
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[0]);
        int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(com.google.android.apps.youtube.music.R.dimen.button_gradient_border_width);
        Drawable drawable2 = context.getDrawable(com.google.android.apps.youtube.music.R.drawable.rounded_gradient_button_shape);
        if (drawable2 != null) {
            layerDrawable.addLayer(drawable2);
        }
        if (iIntValue == com.google.android.apps.youtube.music.R.color.music_full_transparent) {
            iIntValue = com.google.android.apps.youtube.music.R.color.ytm_color_black;
        }
        layerDrawable.addLayer(n(context, iIntValue, num2));
        layerDrawable.setLayerInset(1, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
        m(context, layerDrawable);
    }

    private final void p(ajnf ajnfVar, adly adlyVar, int i, int i2, Integer num, Drawable drawable, Integer num2, int i3) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(this.a.getContext(), i);
        o(ajnfVar, adlyVar, contextThemeWrapper, contextThemeWrapper.getColor(i2), num, drawable, num2, i3);
    }

    private final void q(ajnf ajnfVar, adly adlyVar, int i, Integer num, int i2) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(this.a.getContext(), i);
        o(ajnfVar, adlyVar, contextThemeWrapper, tzk.i(contextThemeWrapper, com.google.android.apps.youtube.music.R.attr.ytStaticBrandRed), num, null, null, i2);
    }

    @Override // defpackage.adma
    public final View a() {
        return this.a;
    }

    @Override // defpackage.adma
    public final void b(admh admhVar) {
        View view = this.a;
        view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.d = null;
        this.c = null;
        this.t = null;
        this.s = null;
        this.l.b();
        this.u = null;
        view.setBackground(this.q);
        View view2 = this.i;
        if (view2 != null) {
            view2.setBackground(this.r);
        }
        Optional optionalL = l();
        imc imcVar = new imc(this, 18);
        if (true == optionalL.isPresent()) {
            ((TextView) optionalL.get()).setTextColor(((jbm) imcVar.a).b);
        }
        e().setOnTouchListener(null);
        e().setMinimumHeight(this.p);
        e().setMinimumWidth(this.o);
    }

    public final Drawable d(Context context, ajnf ajnfVar) {
        Context context2 = this.a.getContext();
        aliz alizVarA = aliz.a((ajnfVar.e == 8 ? (alja) ajnfVar.f : alja.a).c);
        if (alizVarA == null) {
            alizVarA = aliz.UNKNOWN;
        }
        Drawable drawableC = ok.e().c(context2, this.j.a(alizVarA));
        if ((ajnfVar.b & 1) == 0) {
            return drawableC;
        }
        if (drawableC == null) {
            return null;
        }
        drawableC.getIntrinsicHeight();
        int iBt = a.bt(ajnfVar.i);
        int i = (iBt != 0 ? iBt : 1) - 1;
        int dimensionPixelSize = (i == 2 || i == 5) ? context.getResources().getDimensionPixelSize(com.google.android.apps.youtube.music.R.dimen.button_icon_height_extra_small) : drawableC.getIntrinsicHeight();
        if (dimensionPixelSize == drawableC.getIntrinsicHeight()) {
            return drawableC;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawableC.getIntrinsicWidth(), drawableC.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawableC.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawableC.draw(canvas);
        return new BitmapDrawable(context.getResources(), Bitmap.createScaledBitmap(bitmapCreateBitmap, dimensionPixelSize, dimensionPixelSize, false));
    }

    public final View e() {
        View view = this.i;
        return view == null ? this.a : view;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0201  */
    /* JADX WARN: Code duplicated, block: B:102:0x0203  */
    /* JADX WARN: Code duplicated, block: B:104:0x0214  */
    /* JADX WARN: Code duplicated, block: B:106:0x0220  */
    /* JADX WARN: Code duplicated, block: B:107:0x0222  */
    /* JADX WARN: Code duplicated, block: B:94:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:96:0x01df  */
    /* JADX WARN: Code duplicated, block: B:97:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:99:0x01f2  */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // defpackage.adma
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final void hU(adly adlyVar, ajnf ajnfVar) {
        ajwo ajwoVar;
        ajwo ajwoVar2;
        int iAr;
        int iBt;
        int i;
        alay alayVar;
        boolean z;
        int i2;
        int iAr2;
        int iAr3;
        int iAr4;
        xgn xgnVarHB;
        ajwo ajwoVar3;
        int iBt2;
        int i3;
        int iBt3;
        int i4;
        jbm jbmVar = this;
        adly adlyVar2 = adlyVar;
        if ((ajnfVar.b & SemanticState.Modal) != 0) {
            ajwoVar = ajnfVar.q;
            if (ajwoVar == null) {
                ajwoVar = ajwo.a;
            }
        } else {
            ajwoVar = null;
        }
        jbmVar.s = ajwoVar;
        if ((ajnfVar.b & SemanticState.Multiline) != 0) {
            ajwoVar2 = ajnfVar.s;
            if (ajwoVar2 == null) {
                ajwoVar2 = ajwo.a;
            }
        } else {
            ajwoVar2 = null;
        }
        jbmVar.t = ajwoVar2;
        jbmVar.c = ajnfVar;
        jbmVar.d = adlyVar2;
        if (ajnfVar.c != 1 || (iAr = ahng.ar(((Integer) ajnfVar.d).intValue())) == 0) {
            iAr = 1;
        }
        int i5 = iAr - 1;
        int i6 = 6;
        if (i5 == 2) {
            Integer numValueOf = Integer.valueOf(com.google.android.apps.youtube.music.R.color.ytm_color_white);
            iBt = a.bt(ajnfVar.i);
            if (iBt == 0) {
                i = 1;
            } else {
                i = iBt;
            }
            jbmVar = this;
            adlyVar2 = adlyVar;
            jbmVar.p(ajnfVar, adlyVar2, com.google.android.apps.youtube.music.R.style.WidgetTheme_WhiteButton, com.google.android.apps.youtube.music.R.color.ytm_text_color_primary_inverse, numValueOf, null, null, i);
        } else if (i5 == 3) {
            Integer numValueOf2 = Integer.valueOf(com.google.android.apps.youtube.music.R.color.ytm_color_red_02);
            iBt2 = a.bt(ajnfVar.i);
            if (iBt2 == 0) {
                i3 = 1;
            } else {
                i3 = iBt2;
            }
            jbmVar = this;
            adlyVar2 = adlyVar;
            jbmVar.p(ajnfVar, adlyVar2, com.google.android.apps.youtube.music.R.style.WidgetTheme_RedButton, com.google.android.apps.youtube.music.R.color.ytm_color_white, numValueOf2, null, null, i3);
        } else if (i5 == 6) {
            Integer numValueOf3 = Integer.valueOf(com.google.android.apps.youtube.music.R.color.ytm_color_blue_01);
            iBt3 = a.bt(ajnfVar.i);
            if (iBt3 == 0) {
                i4 = 1;
            } else {
                i4 = iBt3;
            }
            jbmVar = this;
            adlyVar2 = adlyVar;
            jbmVar.p(ajnfVar, adlyVar2, com.google.android.apps.youtube.music.R.style.WidgetTheme_BlueButton, com.google.android.apps.youtube.music.R.color.quantum_white_text, numValueOf3, null, null, i4);
        } else if (i5 == 7) {
            Integer numValueOf4 = Integer.valueOf(com.google.android.apps.youtube.music.R.color.music_full_transparent);
            int iBt4 = a.bt(ajnfVar.i);
            int i7 = iBt4 == 0 ? 1 : iBt4;
            jbmVar = this;
            adlyVar2 = adlyVar;
            jbmVar.p(ajnfVar, adlyVar2, com.google.android.apps.youtube.music.R.style.WidgetTheme_TransparentButton, com.google.android.apps.youtube.music.R.color.yt_white1_opacity70, numValueOf4, null, null, i7);
        } else if (i5 == 18 || i5 == 34) {
            Integer numValueOf5 = Integer.valueOf(com.google.android.apps.youtube.music.R.color.music_full_transparent);
            Integer numValueOf6 = Integer.valueOf(com.google.android.apps.youtube.music.R.color.ytm_color_white_at_20pct);
            int iBt5 = a.bt(ajnfVar.i);
            int i8 = iBt5 == 0 ? 1 : iBt5;
            jbmVar = this;
            adlyVar2 = adlyVar;
            jbmVar.p(ajnfVar, adlyVar2, com.google.android.apps.youtube.music.R.style.WidgetTheme_GreyBorderTransparentButton, com.google.android.apps.youtube.music.R.color.ytm_text_color_primary, numValueOf5, null, numValueOf6, i8);
        } else if (i5 == 43) {
            Integer numValueOf7 = Integer.valueOf(com.google.android.apps.youtube.music.R.color.music_full_transparent);
            Integer numValueOf8 = Integer.valueOf(com.google.android.apps.youtube.music.R.color.ytm_color_white_at_20pct);
            int iBt6 = a.bt(ajnfVar.i);
            int i9 = iBt6 == 0 ? 1 : iBt6;
            jbmVar = this;
            adlyVar2 = adlyVar;
            jbmVar.p(ajnfVar, adlyVar2, com.google.android.apps.youtube.music.R.style.WidgetTheme_GreyBorderTransparentButton, com.google.android.apps.youtube.music.R.color.ytm_text_color_primary, numValueOf7, null, numValueOf8, i9);
        } else if (i5 == 46) {
            Drawable drawableC = ok.e().c(jbmVar.a.getContext(), com.google.android.apps.youtube.music.R.drawable.yt_generative_gradient_round_button);
            int iBt7 = a.bt(ajnfVar.i);
            int i10 = iBt7 == 0 ? 1 : iBt7;
            adlyVar2 = adlyVar;
            jbmVar.p(ajnfVar, adlyVar2, com.google.android.apps.youtube.music.R.style.WidgetTheme_TransparentButton, com.google.android.apps.youtube.music.R.color.ytm_text_color_primary, null, drawableC, null, i10);
            jbmVar = this;
        } else if (i5 == 25) {
            Integer numValueOf9 = Integer.valueOf(com.google.android.apps.youtube.music.R.color.music_full_transparent);
            Integer numValueOf10 = Integer.valueOf(com.google.android.apps.youtube.music.R.color.ytm_color_grey_09);
            int iBt8 = a.bt(ajnfVar.i);
            int i11 = iBt8 == 0 ? 1 : iBt8;
            jbmVar = this;
            adlyVar2 = adlyVar;
            jbmVar.p(ajnfVar, adlyVar2, com.google.android.apps.youtube.music.R.style.WidgetTheme_InactiveOutlineButton, com.google.android.apps.youtube.music.R.color.ytm_color_grey_09, numValueOf9, null, numValueOf10, i11);
        } else if (i5 == 26) {
            Integer numValueOf11 = Integer.valueOf(com.google.android.apps.youtube.music.R.color.ytm_color_white);
            iBt = a.bt(ajnfVar.i);
            if (iBt == 0) {
                i = 1;
            } else {
                i = iBt;
            }
            jbmVar = this;
            adlyVar2 = adlyVar;
            jbmVar.p(ajnfVar, adlyVar2, com.google.android.apps.youtube.music.R.style.WidgetTheme_WhiteButton, com.google.android.apps.youtube.music.R.color.ytm_text_color_primary_inverse, numValueOf11, null, null, i);
        } else if (i5 == 40) {
            Integer numValueOf12 = Integer.valueOf(com.google.android.apps.youtube.music.R.color.ytm_color_white_at_10pct);
            int iBt9 = a.bt(ajnfVar.i);
            int i12 = iBt9 == 0 ? 1 : iBt9;
            jbmVar = this;
            adlyVar2 = adlyVar;
            jbmVar.p(ajnfVar, adlyVar2, com.google.android.apps.youtube.music.R.style.WidgetTheme_TransparentButton, com.google.android.apps.youtube.music.R.color.ytm_text_color_primary, numValueOf12, null, null, i12);
        } else if (i5 != 41) {
            switch (i5) {
                case 9:
                    Integer numValueOf13 = Integer.valueOf(com.google.android.apps.youtube.music.R.color.ytm_color_red_02);
                    iBt2 = a.bt(ajnfVar.i);
                    if (iBt2 == 0) {
                        i3 = 1;
                    } else {
                        i3 = iBt2;
                    }
                    jbmVar = this;
                    adlyVar2 = adlyVar;
                    jbmVar.p(ajnfVar, adlyVar2, com.google.android.apps.youtube.music.R.style.WidgetTheme_RedButton, com.google.android.apps.youtube.music.R.color.ytm_color_white, numValueOf13, null, null, i3);
                    break;
                case 10:
                case 11:
                    Integer numValueOf14 = Integer.valueOf(com.google.android.apps.youtube.music.R.color.ytm_color_blue_01);
                    iBt3 = a.bt(ajnfVar.i);
                    if (iBt3 == 0) {
                        i4 = 1;
                    } else {
                        i4 = iBt3;
                    }
                    jbmVar = this;
                    adlyVar2 = adlyVar;
                    jbmVar.p(ajnfVar, adlyVar2, com.google.android.apps.youtube.music.R.style.WidgetTheme_BlueButton, com.google.android.apps.youtube.music.R.color.quantum_white_text, numValueOf14, null, null, i4);
                    break;
                default:
                    switch (i5) {
                        case 13:
                            Integer numValueOf15 = Integer.valueOf(com.google.android.apps.youtube.music.R.color.music_full_transparent);
                            int iBt10 = a.bt(ajnfVar.i);
                            int i13 = iBt10 == 0 ? 1 : iBt10;
                            jbmVar = this;
                            adlyVar2 = adlyVar;
                            jbmVar.p(ajnfVar, adlyVar2, com.google.android.apps.youtube.music.R.style.WidgetTheme_TransparentButton, com.google.android.apps.youtube.music.R.color.ytm_color_blue_01, numValueOf15, null, null, i13);
                            break;
                        case 14:
                            Integer numValueOf16 = Integer.valueOf(com.google.android.apps.youtube.music.R.color.ytm_color_white);
                            int iBt11 = a.bt(ajnfVar.i);
                            int i14 = iBt11 == 0 ? 1 : iBt11;
                            jbmVar = this;
                            adlyVar2 = adlyVar;
                            jbmVar.q(ajnfVar, adlyVar2, com.google.android.apps.youtube.music.R.style.WidgetTheme_WhiteButton, numValueOf16, i14);
                            break;
                        case 15:
                            Integer numValueOf17 = Integer.valueOf(com.google.android.apps.youtube.music.R.color.music_full_transparent);
                            int iBt12 = a.bt(ajnfVar.i);
                            int i15 = iBt12 == 0 ? 1 : iBt12;
                            jbmVar = this;
                            adlyVar2 = adlyVar;
                            jbmVar.p(ajnfVar, adlyVar2, com.google.android.apps.youtube.music.R.style.WidgetTheme_TransparentButton, com.google.android.apps.youtube.music.R.color.ytm_color_white, numValueOf17, null, null, i15);
                            break;
                        case 16:
                            Integer numValueOf18 = Integer.valueOf(com.google.android.apps.youtube.music.R.color.music_full_transparent);
                            int iBt13 = a.bt(ajnfVar.i);
                            jbmVar.q(ajnfVar, adlyVar2, com.google.android.apps.youtube.music.R.style.WidgetTheme_TransparentButton, numValueOf18, iBt13 == 0 ? 1 : iBt13);
                            jbmVar = this;
                            adlyVar2 = adlyVar;
                            break;
                    }
                    break;
            }
        } else {
            Integer numValueOf19 = Integer.valueOf(com.google.android.apps.youtube.music.R.color.ytm_color_white);
            iBt = a.bt(ajnfVar.i);
            if (iBt == 0) {
                i = 1;
            } else {
                i = iBt;
            }
            jbmVar = this;
            adlyVar2 = adlyVar;
            jbmVar.p(ajnfVar, adlyVar2, com.google.android.apps.youtube.music.R.style.WidgetTheme_WhiteButton, com.google.android.apps.youtube.music.R.color.ytm_text_color_primary_inverse, numValueOf19, null, null, i);
        }
        xgn xgnVarHB2 = jbmVar.hB();
        if (xgnVarHB2 != null) {
            adlw adlwVar = jbmVar.l;
            if ((ajnfVar.b & SemanticState.Obscured) != 0) {
                ajwoVar3 = ajnfVar.r;
                if (ajwoVar3 == null) {
                    ajwoVar3 = ajwo.a;
                }
            } else {
                ajwoVar3 = null;
            }
            adlwVar.a(xgnVarHB2, ajwoVar3, adlyVar2.e(), null);
        }
        View view = jbmVar.i;
        if (view != null) {
            view.setOnClickListener(jbmVar.l);
            jbmVar.a.setClickable(false);
        } else {
            jbmVar.a.setOnClickListener(jbmVar.l);
        }
        if (!adlyVar2.j("skipInteractionLogging") && (xgnVarHB = jbmVar.hB()) != null) {
            xgnVarHB.w(new xgj(ajnfVar.y, (amud) null), null);
        }
        if ((ajnfVar.b & 64) != 0) {
            alayVar = ajnfVar.m;
            if (alayVar == null) {
                alayVar = alay.a;
            }
        } else {
            alayVar = null;
        }
        Spanned spannedK = ackj.k(null, alayVar, null, false);
        Optional optionalL = jbmVar.l();
        hkp hkpVar = new hkp(spannedK, i6);
        if (true == optionalL.isPresent()) {
            tuk.u((TextView) optionalL.get(), hkpVar.a);
        }
        int i16 = ajnfVar.b;
        if ((262144 & i16) != 0) {
            View view2 = jbmVar.a;
            aiqe aiqeVar = ajnfVar.v;
            if (aiqeVar == null) {
                aiqeVar = aiqe.a;
            }
            kro.aa(view2, aiqeVar);
        } else if ((i16 & 131072) != 0) {
            View view3 = jbmVar.a;
            aiqd aiqdVar = ajnfVar.u;
            if (aiqdVar == null) {
                aiqdVar = aiqd.a;
            }
            view3.setContentDescription(aiqdVar.c);
        } else if (TextUtils.isEmpty(spannedK)) {
            aduv aduvVar = jbmVar.j;
            if (aduvVar instanceof izf) {
                izf izfVar = (izf) aduvVar;
                aliz alizVarA = aliz.a((ajnfVar.e == 8 ? (alja) ajnfVar.f : alja.a).c);
                if (alizVarA == null) {
                    alizVarA = aliz.UNKNOWN;
                }
                int iB = izfVar.b(alizVarA);
                if (iB != 0) {
                    View view4 = jbmVar.a;
                    view4.setContentDescription(view4.getResources().getString(iB));
                }
            }
        }
        Optional optionalL2 = jbmVar.l();
        jbj jbjVar = new jbj(jbmVar, ajnfVar, adlyVar2);
        if (true != optionalL2.isPresent()) {
            z = false;
            i2 = com.google.android.apps.youtube.music.R.color.ytm_color_white_at_20pct;
        } else {
            Object obj = optionalL2.get();
            jbm jbmVar2 = jbjVar.a;
            ajnf ajnfVar2 = jbjVar.b;
            adly adlyVar3 = jbjVar.c;
            int iB2 = adlyVar3.b("buttonDrawableGravity", 8388611);
            if (ajnfVar2.e == 8) {
                View view5 = jbmVar2.a;
                Drawable drawableD = jbmVar2.d(view5.getContext(), ajnfVar2);
                if (drawableD == null) {
                    z = false;
                } else if (iB2 != 17) {
                    if (iB2 == 48) {
                        ((TextView) obj).setCompoundDrawablesWithIntrinsicBounds((Drawable) null, drawableD, (Drawable) null, (Drawable) null);
                    } else if (iB2 == 80) {
                        ((TextView) obj).setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, drawableD);
                    } else if (iB2 != 8388613) {
                        ((TextView) obj).setCompoundDrawablesWithIntrinsicBounds(drawableD, (Drawable) null, (Drawable) null, (Drawable) null);
                    } else {
                        ((TextView) obj).setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawableD, (Drawable) null);
                    }
                    z = false;
                } else {
                    TextView textView = (TextView) obj;
                    if (TextUtils.isEmpty(textView.getText())) {
                        int intrinsicHeight = drawableD.getIntrinsicHeight();
                        int intrinsicWidth = drawableD.getIntrinsicWidth();
                        double minimumWidth = ((double) jbmVar2.e().getMinimumWidth()) / 2.0d;
                        double d = ((double) intrinsicWidth) / 2.0d;
                        int i17 = (int) (minimumWidth + d);
                        int i18 = (int) (minimumWidth - d);
                        z = false;
                        drawableD.setBounds(i18, 0, i17, intrinsicHeight);
                        textView.setCompoundDrawablePadding(0);
                        textView.setCompoundDrawables(drawableD, null, null, null);
                    } else {
                        z = false;
                        textView.setCompoundDrawablesWithIntrinsicBounds(drawableD, (Drawable) null, (Drawable) null, (Drawable) null);
                    }
                }
                k((TextView) obj);
                view5.setVisibility(z ? 1 : 0);
            } else {
                z = false;
                adlyVar3 = adlyVar3;
                ((TextView) obj).setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, 0, 0);
            }
            View view6 = jbmVar2.a;
            int iB3 = adlyVar3.b("buttonTextAlignment", view6.getTextAlignment());
            view6.setTextAlignment(iB3);
            if (iB3 != 5) {
                TextView textView2 = (TextView) obj;
                if (iB3 != 6) {
                    textView2.setGravity(17);
                } else {
                    textView2.setGravity(8388629);
                }
            } else {
                ((TextView) obj).setGravity(8388627);
            }
            if ((ajnfVar2.c == 1 && (iAr2 = ahng.ar(((Integer) ajnfVar2.d).intValue())) != 0 && iAr2 == 25) || ajnfVar2.l) {
                TextView textView3 = (TextView) obj;
                Context context = textView3.getContext();
                int i19 = jkl.a;
                i2 = com.google.android.apps.youtube.music.R.color.ytm_color_white_at_20pct;
                textView3.setTextColor(jkl.b(context.getColor(com.google.android.apps.youtube.music.R.color.ytm_color_white_at_20pct)));
                if (ajnfVar2.e == 8) {
                    k(textView3);
                }
            } else {
                i2 = com.google.android.apps.youtube.music.R.color.ytm_color_white_at_20pct;
            }
        }
        View view7 = jbmVar.a;
        Optional optionalOf = view7 instanceof ImageView ? Optional.of((ImageView) view7) : Optional.empty();
        jbk jbkVar = new jbk(jbmVar, ajnfVar);
        if (true == optionalOf.isPresent()) {
            Object obj2 = optionalOf.get();
            jbm jbmVar3 = jbkVar.a;
            ajnf ajnfVar3 = jbkVar.b;
            if (ajnfVar3.e == 8) {
                z = true;
            }
            View view8 = jbmVar3.a;
            tuk.l(view8, z);
            if (ajnfVar3.e == 8) {
                int i20 = ((ajnfVar3.c == 1 && (iAr4 = ahng.ar(((Integer) ajnfVar3.d).intValue())) != 0 && iAr4 == 25) || ajnfVar3.l) ? i2 : com.google.android.apps.youtube.music.R.color.ytm_color_white;
                if (ajnfVar3.c == 1 && (iAr3 = ahng.ar(((Integer) ajnfVar3.d).intValue())) != 0 && iAr3 == 42) {
                    i20 = com.google.android.apps.youtube.music.R.color.ytm_color_black;
                }
                Drawable drawableD2 = jbmVar3.d(view8.getContext(), ajnfVar3);
                if (drawableD2 != null) {
                    int color = view8.getContext().getColor(i20);
                    int i21 = jkl.a;
                    Drawable drawableMutate = drawableD2.mutate();
                    drawableMutate.setTint(color);
                    ((ImageView) obj2).setImageDrawable(drawableMutate);
                }
            }
        }
        if ((ajnfVar.b & SemanticState.LiveRegion) != 0) {
            view7.getViewTreeObserver().addOnGlobalLayoutListener(jbmVar);
        }
    }

    @Override // defpackage.xgm
    public final xgn hB() {
        adly adlyVar = this.d;
        return adlyVar != null ? adlyVar.b : xgn.l;
    }

    @Override // defpackage.adlu
    public boolean hV(View view) {
        Object obj = this.u;
        if (obj == null) {
            obj = this.c;
        }
        boolean z = true;
        if (this.t == null || obj == null) {
            ajwo ajwoVar = this.s;
            if (ajwoVar == null || obj == null) {
                z = false;
            } else {
                vxe vxeVar = this.k;
                int i = hdv.a;
                vxeVar.c(ajwoVar, xhd.h(obj, true));
                z = this.e;
            }
        } else {
            int i2 = hdv.a;
            Map mapH = xhd.h(obj, true);
            if (this.d != null) {
                agkj agkjVar = g;
                agqr it = agkjVar.keySet().iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    Object objC = this.d.c(str);
                    String str2 = (String) agkjVar.get(str);
                    if (objC != null && str2 != null) {
                        mapH.put(str2, objC);
                    }
                }
            }
            xgn xgnVarHB = hB();
            if (xgnVarHB != null) {
                mapH.put("com.google.android.libraries.youtube.logging.interaction_logger", xgnVarHB);
            }
            this.k.c(this.t, mapH);
        }
        View.OnClickListener onClickListener = this.v;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        return z;
    }

    public final void i(String str, int i, int i2) {
        adly adlyVar = new adly();
        aihh aihhVar = (aihh) ajnf.a.createBuilder();
        int i3 = ackj.b;
        aihh aihhVar2 = (aihh) alay.a.createBuilder();
        if (str == null) {
            str = "";
        }
        aihhVar2.copyOnWrite();
        alay alayVar = (alay) aihhVar2.instance;
        alayVar.b |= 1;
        alayVar.d = str;
        alay alayVar2 = (alay) aihhVar2.build();
        aihhVar.copyOnWrite();
        ajnf ajnfVar = (ajnf) aihhVar.instance;
        alayVar2.getClass();
        ajnfVar.m = alayVar2;
        ajnfVar.b |= 64;
        aihhVar.copyOnWrite();
        ajnf ajnfVar2 = (ajnf) aihhVar.instance;
        ajnfVar2.d = Integer.valueOf(i - 1);
        ajnfVar2.c = 1;
        aihhVar.copyOnWrite();
        ajnf ajnfVar3 = (ajnf) aihhVar.instance;
        ajnfVar3.i = i2 - 1;
        ajnfVar3.b |= 1;
        hU(adlyVar, (ajnf) aihhVar.build());
    }

    public final void j(adly adlyVar, ajnf ajnfVar, int i) {
        int iAr;
        int iAr2;
        int i2 = ajnfVar.c;
        if (i2 == 1 && i2 == 1 && (iAr = ahng.ar(((Integer) ajnfVar.d).intValue())) != 0 && iAr != 1 && (ajnfVar.c != 1 || (iAr2 = ahng.ar(((Integer) ajnfVar.d).intValue())) == 0 || iAr2 != 2)) {
            hU(adlyVar, ajnfVar);
            return;
        }
        aihh aihhVar = (aihh) ajnfVar.toBuilder();
        aihhVar.copyOnWrite();
        ajnf ajnfVar2 = (ajnf) aihhVar.instance;
        ajnfVar2.d = Integer.valueOf(i - 1);
        ajnfVar2.c = 1;
        hU(adlyVar, (ajnf) aihhVar.build());
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        View view;
        Optional optional = this.m;
        if (optional.isEmpty() || (view = this.a) == null || this.c == null) {
            return;
        }
        ((abxv) optional.get()).J(this.c.o, view);
        view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }

    @Deprecated
    public jbm(Context context, aduv aduvVar, vxe vxeVar, Optional optional) {
        this(aduvVar, vxeVar, optional, LayoutInflater.from(context).inflate(com.google.android.apps.youtube.music.R.layout.generic_button_text_item, (ViewGroup) null), null, null, null, false);
    }
}
