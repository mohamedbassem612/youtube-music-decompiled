package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import j$.util.Collection;
import j$.util.Optional;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jfb extends admr {
    public static final agrf a = agrf.h("com/google/android/apps/youtube/music/ui/presenter/MusicSortFilterButtonPresenter");
    public final View b;
    public final Executor c;
    public final TextView d;
    public final hcb e;
    public final ijt f;
    private final Context g;
    private final ViewGroup h;
    private final aunn i;
    private final ImageView j;
    private final avmm k = new avmm();

    public jfb(Context context, ijt ijtVar, hcb hcbVar, Executor executor, adxj adxjVar, aunn aunnVar) {
        this.g = context;
        this.f = ijtVar;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.music_sort_filter_button, (ViewGroup) null);
        this.b = viewInflate;
        this.h = (ViewGroup) viewInflate.findViewById(R.id.music_sort_filter_button_container);
        this.d = (TextView) viewInflate.findViewById(R.id.button_text);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.button_icon);
        this.j = imageView;
        this.e = hcbVar;
        this.c = executor;
        this.i = aunnVar;
        imageView.setImageResource(adxjVar.b(arqz.fP));
    }

    public static void g(View view, aiqe aiqeVar, String str) {
        String strU = kro.U(aiqeVar);
        if (strU != null) {
            str = strU;
        }
        view.setContentDescription(view.getContext().getString(R.string.accessibility_multi_select_menu_collapsed, str));
    }

    @Override // defpackage.adma
    public final View a() {
        return this.b;
    }

    @Override // defpackage.adma
    public final void b(admh admhVar) {
        this.k.b();
        View view = this.b;
        view.setOnClickListener(null);
        bac.p(view, null);
        this.j.setVisibility(0);
    }

    @Override // defpackage.admr
    public final /* synthetic */ void d(adly adlyVar, Object obj) {
        int paddingRight;
        anxn anxnVar = (anxn) obj;
        if (((vxz) this.i.io()).l(206, 45734052L, false) && (anxnVar.b & 16) == 0) {
            this.j.setVisibility(8);
        }
        int iAV = a.aV(anxnVar.f);
        if (iAV == 0) {
            iAV = 1;
        }
        int i = iAV - 1;
        TextView textView = this.d;
        if (i != 2) {
            textView.setTextAppearance(R.style.YtmTitle02);
        } else {
            textView.setTextAppearance(R.style.TextAppearance_YouTubeMusic_Display2);
            textView.setTextSize(0, this.g.getResources().getDimension(R.dimen.library_content_selector_text_size));
        }
        ViewGroup viewGroup = this.h;
        viewGroup.setBackgroundResource(0);
        TextView textView2 = this.d;
        textView2.setMinWidth(0);
        ImageView imageView = this.j;
        Context context = this.g;
        imageView.setImageTintList(ColorStateList.valueOf(context.getColor(R.color.ytm_icon_color_active)));
        int iB = adlyVar.b("pagePadding", -1);
        int paddingBottom = viewGroup.getPaddingBottom();
        int paddingTop = viewGroup.getPaddingTop();
        if (iB >= 0) {
            paddingRight = iB;
        } else {
            paddingRight = viewGroup.getPaddingRight();
            iB = viewGroup.getPaddingLeft();
        }
        int iAV2 = a.aV(anxnVar.e);
        if (iAV2 == 0) {
            iAV2 = 1;
        }
        if (iAV2 - 1 != 2) {
            textView2.setMinWidth(context.getResources().getDimensionPixelSize(R.dimen.country_picker_button_text_field_min_width));
            viewGroup.setBackgroundResource(R.drawable.rounded_large_corner_grey_button_shape);
            iB = context.getResources().getDimensionPixelSize(R.dimen.country_picker_button_left_padding);
        } else {
            int iAV3 = a.aV(anxnVar.f);
            if (iAV3 == 0) {
                iAV3 = 1;
            }
            int i2 = iAV3 - 1;
            if (i2 == 1) {
                int color = context.getColor(R.color.yt_white1_opacity70);
                textView2.setTextColor(color);
                imageView.setImageTintList(ColorStateList.valueOf(color));
            } else if (i2 == 2) {
                imageView.setBackgroundResource(R.drawable.music_sort_filter_button_icon_background);
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.music_sort_filter_button_icon_flat_style_padding);
                int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.music_sort_filter_button_icon_flat_style_vertical_padding_offset);
                imageView.setPadding(dimensionPixelSize, dimensionPixelSize + dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2);
                int dimensionPixelSize3 = context.getResources().getDimensionPixelSize(R.dimen.music_sort_filter_button_icon_small_width);
                ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.width = dimensionPixelSize3;
                    layoutParams.height = dimensionPixelSize3;
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.setMargins(0, context.getResources().getDimensionPixelSize(R.dimen.item_extra_small_spacing), 0, 0);
                    imageView.setLayoutParams(marginLayoutParams);
                }
            }
        }
        viewGroup.setPadding(iB, paddingTop, paddingRight, paddingBottom);
        View view = this.b;
        aiqe aiqeVar = anxnVar.i;
        if (aiqeVar == null) {
            aiqeVar = aiqe.a;
        }
        kro.aa(view, aiqeVar);
        alay alayVar = anxnVar.c;
        if (alayVar == null) {
            alayVar = alay.a;
        }
        byte[] bArr = null;
        tuk.u(textView2, ackj.k(null, alayVar, null, false));
        if (!anxnVar.h) {
            apji apjiVar = anxnVar.g;
            if (apjiVar == null) {
                apjiVar = apji.a;
            }
            aihl aihlVarCheckIsLite = aihn.checkIsLite(anrx.a);
            apjiVar.c(aihlVarCheckIsLite);
            if (apjiVar.j.n(aihlVarCheckIsLite.d)) {
                apji apjiVar2 = anxnVar.g;
                if (apjiVar2 == null) {
                    apjiVar2 = apji.a;
                }
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(anrx.a);
                apjiVar2.c(aihlVarCheckIsLite2);
                Object objK = apjiVar2.j.k(aihlVarCheckIsLite2.d);
                int i3 = 12;
                agke agkeVar = (agke) Collection.EL.stream(((anrw) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK))).d).filter(new iui(i3)).map(new ixa(5)).collect(aghu.a);
                this.k.e((avmn[]) Collection.EL.stream(agkeVar).map(new hph(this, new jfa(view, textView2, agkeVar), i3, bArr)).toArray(new hhv(6)));
                Optional optionalFindFirst = Collection.EL.stream(agkeVar).filter(new ibz(this, 14)).findFirst();
                imc imcVar = new imc(this, 20);
                if (true == optionalFindFirst.isPresent()) {
                    Object obj2 = optionalFindFirst.get();
                    Object obj3 = imcVar.a;
                    anrv anrvVar = (anrv) obj2;
                    alay alayVar2 = anrvVar.c;
                    if (alayVar2 == null) {
                        alayVar2 = alay.a;
                    }
                    jfb jfbVar = (jfb) obj3;
                    TextView textView3 = jfbVar.d;
                    tuk.u(textView3, ackj.k(null, alayVar2, null, false));
                    View view2 = jfbVar.b;
                    aiqe aiqeVar2 = anrvVar.i;
                    if (aiqeVar2 == null) {
                        aiqeVar2 = aiqe.a;
                    }
                    g(view2, aiqeVar2, textView3.getText().toString());
                }
            }
        }
        apji apjiVar3 = anxnVar.g;
        if (apjiVar3 == null) {
            apjiVar3 = apji.a;
        }
        aihl aihlVarCheckIsLite3 = aihn.checkIsLite(anrx.a);
        apjiVar3.c(aihlVarCheckIsLite3);
        if (!apjiVar3.j.n(aihlVarCheckIsLite3.d)) {
            ((agrc) ((agrc) a.c().i(agso.a, "MusicSortFilterBtnPrese")).k("com/google/android/apps/youtube/music/ui/presenter/MusicSortFilterButtonPresenter", "onPresent", 146, "MusicSortFilterButtonPresenter.java")).t("Wrong renderer passed in menu slot");
            return;
        }
        apji apjiVar4 = anxnVar.g;
        if (apjiVar4 == null) {
            apjiVar4 = apji.a;
        }
        aihl aihlVarCheckIsLite4 = aihn.checkIsLite(anrx.a);
        apjiVar4.c(aihlVarCheckIsLite4);
        Object objK2 = apjiVar4.j.k(aihlVarCheckIsLite4.d);
        view.setOnClickListener(new jez(this, (anrw) (objK2 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK2)), adlyVar));
        bac.p(view, new jey(this, anxnVar));
    }

    @Override // defpackage.admr
    public final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((anxn) obj).j.G();
    }
}
