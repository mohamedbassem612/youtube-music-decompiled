package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jef extends admr {
    private static final agrf a = agrf.h("com/google/android/apps/youtube/music/ui/presenter/MusicNavigationButtonPresenter");
    private final View b;
    private final TextView c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private ColorStateList k;
    private GradientDrawable l;
    private final Context m;
    private final vxe n;
    private izd o;

    public jef(Context context, vxe vxeVar) {
        this.m = context;
        this.n = vxeVar;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.music_navigation_button, (ViewGroup) null);
        this.b = viewInflate;
        this.c = (TextView) viewInflate.findViewById(R.id.music_navigation_button);
    }

    @Override // defpackage.adma
    public final View a() {
        return this.b;
    }

    @Override // defpackage.adma
    public final void b(admh admhVar) {
        this.o.c();
    }

    @Override // defpackage.admr
    public final /* bridge */ /* synthetic */ void d(adly adlyVar, Object obj) {
        ansm ansmVar = (ansm) obj;
        ajwo ajwoVar = null;
        Object objD = adlyVar.d("collectionStyleItemSize", null);
        ajwd ajwdVar = objD == null ? null : (ajwd) objD;
        ajwd ajwdVar2 = ajwd.COLLECTION_STYLE_ITEM_SIZE_LARGE;
        Context context = this.m;
        if (ajwdVar == ajwdVar2) {
            this.d = (int) context.getResources().getDimension(R.dimen.navigation_button_large_height);
        } else {
            this.d = (int) (((double) context.getResources().getConfiguration().fontScale) > 1.0d ? context.getResources().getDimension(R.dimen.navigation_button_height) * context.getResources().getConfiguration().fontScale : context.getResources().getDimension(R.dimen.navigation_button_height));
        }
        if (adlyVar.c("carouselItemWidth") != null) {
            View view = this.b;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.width = adlyVar.b("carouselItemWidth", 0);
            view.setLayoutParams(layoutParams);
        }
        TextView textView = this.c;
        ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
        layoutParams2.height = this.d;
        textView.setLayoutParams(layoutParams2);
        Context context2 = this.m;
        this.e = (int) context2.getResources().getDimension(R.dimen.navigation_button_cap_width);
        this.f = (int) context2.getResources().getDimension(R.dimen.navigation_button_border_radius);
        this.g = (int) context2.getResources().getDimension(R.dimen.navigation_button_border_thickness);
        this.h = context2.getColor(R.color.music_navigation_button_solid_background_color);
        this.i = context2.getColor(R.color.music_navigation_button_solid_stroke_color);
        this.j = context2.getColor(R.color.music_navigation_button_outline_border_background_color);
        this.k = ColorStateList.valueOf(context2.getColor(R.color.ytm_color_control_normal));
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.l = gradientDrawable;
        gradientDrawable.setShape(0);
        this.l.setCornerRadius(this.f);
        this.l.setColor(this.h);
        alay alayVar = ansmVar.e;
        if (alayVar == null) {
            alayVar = alay.a;
        }
        tuk.u(textView, ackj.k(null, alayVar, null, false));
        int i = ansmVar.c;
        if (i == 2) {
            textView.setBackground(new RippleDrawable(this.k, new jee(((ansn) ansmVar.d).b, this.f, this.e, this.j), this.l));
        } else if (i == 3) {
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setShape(0);
            gradientDrawable2.setCornerRadius(this.f);
            gradientDrawable2.setSize(1, this.d);
            gradientDrawable2.setColor(this.h);
            gradientDrawable2.setStroke(this.g, this.i);
            textView.setBackground(new RippleDrawable(this.k, gradientDrawable2, null));
        } else {
            ((agrc) ((agrc) a.b().i(agso.a, "MusicNavigationBtnPres")).k("com/google/android/apps/youtube/music/ui/presenter/MusicNavigationButtonPresenter", "onPresent", 166, "MusicNavigationButtonPresenter.java")).t("Unsupported background type in model.");
        }
        izd izdVarAc = kro.ac(this.b, ansmVar.g.G(), adlyVar.b);
        this.o = izdVarAc;
        vxe vxeVar = this.n;
        xgn xgnVar = adlyVar.b;
        if ((ansmVar.b & 2) != 0 && (ajwoVar = ansmVar.f) == null) {
            ajwoVar = ajwo.a;
        }
        izdVarAc.b(izb.b(vxeVar, xgnVar, ajwoVar, adlyVar.e()));
    }

    @Override // defpackage.admr
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((ansm) obj).g.G();
    }
}
