package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class swk extends admr {
    private final Context a;
    private final vxe b;
    private final swd c;
    private final CharSequence d;
    private final ViewGroup e;
    private final TextView f;
    private final Resources g;

    public swk(Context context, vxe vxeVar, swd swdVar) {
        context.getClass();
        this.a = context;
        vxeVar.getClass();
        this.b = vxeVar;
        this.c = swdVar;
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.simple_text_section, (ViewGroup) null);
        this.e = viewGroup;
        this.f = (TextView) viewGroup.findViewById(R.id.title);
        this.d = TextUtils.concat(System.getProperty("line.separator"), System.getProperty("line.separator"));
        this.g = context.getResources();
        swdVar.c(viewGroup);
    }

    @Override // defpackage.adma
    public final View a() {
        return this.c.a;
    }

    @Override // defpackage.adma
    public final void b(admh admhVar) {
        this.f.setBackground(null);
    }

    @Override // defpackage.admr
    protected final /* synthetic */ void d(adly adlyVar, Object obj) {
        int iBg;
        TextView textView = this.f;
        apzv apzvVar = (apzv) obj;
        ae aeVar = (ae) textView.getLayoutParams();
        int iBg2 = a.bg(apzvVar.d);
        if (iBg2 == 0) {
            iBg2 = 1;
        }
        int i = iBg2 - 1;
        if (i == 1) {
            Resources resources = this.g;
            ViewGroup viewGroup = this.e;
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.simple_text_section_padding_vulcan);
            int i2 = bac.a;
            viewGroup.setPaddingRelative(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
            aeVar.width = 0;
            aeVar.I = resources.getDimensionPixelSize(R.dimen.simple_text_section_max_content_width);
            textView.setTextAppearance(R.style.TextAppearance_YouTube_Subhead);
            Context context = this.a;
            textView.setTypeface(ackm.ROBOTO_MEDIUM.c(context, 0));
            textView.setTextColor(tzk.k(context, android.R.attr.textColorPrimary));
        } else if (i == 2) {
            ViewGroup viewGroup2 = this.e;
            Resources resources2 = this.g;
            int dimensionPixelSize2 = resources2.getDimensionPixelSize(R.dimen.simple_text_section_padding_start_default);
            int dimensionPixelSize3 = resources2.getDimensionPixelSize(R.dimen.simple_text_section_subscription_title_top_padding);
            int i3 = bac.a;
            viewGroup2.setPaddingRelative(dimensionPixelSize2, dimensionPixelSize3, 0, 0);
            aeVar.width = 0;
            aeVar.I = resources2.getDimensionPixelSize(R.dimen.subscription_cards_max_width);
            textView.setTextAppearance(R.style.TextAppearance_YouTube_Title);
            Context context2 = this.a;
            textView.setTextColor(tzk.k(context2, android.R.attr.textColorPrimary));
            textView.setTypeface(ackm.YTSANS_MEDIUM.c(context2, 0));
        } else if (i == 3) {
            ViewGroup viewGroup3 = this.e;
            Resources resources3 = this.g;
            int dimensionPixelSize4 = resources3.getDimensionPixelSize(R.dimen.simple_text_section_notice_padding_start);
            int dimensionPixelSize5 = resources3.getDimensionPixelSize(R.dimen.simple_text_section_padding_top_default);
            int dimensionPixelSize6 = resources3.getDimensionPixelSize(R.dimen.simple_text_section_notice_padding_end);
            int dimensionPixelSize7 = resources3.getDimensionPixelSize(R.dimen.simple_text_section_padding_bottom_default);
            int i4 = bac.a;
            viewGroup3.setPaddingRelative(dimensionPixelSize4, dimensionPixelSize5, dimensionPixelSize6, dimensionPixelSize7);
            aeVar.width = -1;
            aeVar.I = 0;
            textView.setTextAppearance(R.style.TextAppearance_YouTube_Body1);
            textView.setTextColor(tzk.k(this.a, R.attr.ytTextSecondary));
        } else if (i == 4) {
            Resources resources4 = this.g;
            int dimensionPixelSize8 = resources4.getDimensionPixelSize(R.dimen.simple_text_card_padding);
            int dimensionPixelSize9 = resources4.getDimensionPixelSize(R.dimen.simple_text_card_padding);
            int dimensionPixelSize10 = resources4.getDimensionPixelSize(R.dimen.simple_text_card_padding);
            int dimensionPixelSize11 = resources4.getDimensionPixelSize(R.dimen.simple_text_card_padding);
            int i5 = bac.a;
            textView.setPaddingRelative(dimensionPixelSize8, dimensionPixelSize9, dimensionPixelSize10, dimensionPixelSize11);
            aeVar.width = -1;
            aeVar.I = 0;
            textView.setTextAppearance(R.style.TextAppearance_YouTube_Spec_Body2a);
            Context context3 = this.a;
            textView.setTextColor(tzk.k(context3, R.attr.ytTextSecondary));
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(tzk.i(context3, R.attr.ytGeneralBackgroundA));
            gradientDrawable.setCornerRadius(context3.getResources().getDimensionPixelSize(R.dimen.simple_text_card_background_radius));
            textView.setBackground(gradientDrawable);
        } else if (i != 6) {
            ViewGroup viewGroup4 = this.e;
            if (i != 7) {
                Resources resources5 = this.g;
                int dimensionPixelSize12 = resources5.getDimensionPixelSize(R.dimen.simple_text_section_padding_start_default);
                int dimensionPixelSize13 = resources5.getDimensionPixelSize(R.dimen.simple_text_section_padding_top_default);
                int dimensionPixelSize14 = resources5.getDimensionPixelSize(R.dimen.simple_text_section_padding_end_default);
                int dimensionPixelSize15 = resources5.getDimensionPixelSize(R.dimen.simple_text_section_padding_bottom_default);
                int i6 = bac.a;
                viewGroup4.setPaddingRelative(dimensionPixelSize12, dimensionPixelSize13, dimensionPixelSize14, dimensionPixelSize15);
                aeVar.width = -1;
                aeVar.I = 0;
                textView.setTextAppearance(R.style.TextAppearance_YouTube_Subhead);
                Context context4 = this.a;
                textView.setTypeface(ackm.ROBOTO_MEDIUM.c(context4, 0));
                textView.setTextColor(tzk.k(context4, android.R.attr.textColorPrimary));
            } else {
                Resources resources6 = this.g;
                int dimensionPixelSize16 = resources6.getDimensionPixelSize(R.dimen.simple_text_section_minor_moment_padding_side);
                int dimensionPixelSize17 = resources6.getDimensionPixelSize(R.dimen.simple_text_section_minor_moment_settings_summary_padding_vertical);
                int dimensionPixelSize18 = resources6.getDimensionPixelSize(R.dimen.simple_text_section_minor_moment_padding_side);
                int dimensionPixelSize19 = resources6.getDimensionPixelSize(R.dimen.simple_text_section_minor_moment_settings_summary_padding_vertical);
                int i7 = bac.a;
                viewGroup4.setPaddingRelative(dimensionPixelSize16, dimensionPixelSize17, dimensionPixelSize18, dimensionPixelSize19);
                aeVar.width = -1;
                aeVar.I = 0;
                textView.setTextAppearance(R.style.TextAppearance_YouTube_Spec_Body2a);
                textView.setTextColor(tzk.k(this.a, R.attr.ytTextSecondary));
            }
        } else {
            ViewGroup viewGroup5 = this.e;
            Resources resources7 = this.g;
            int dimensionPixelSize20 = resources7.getDimensionPixelSize(R.dimen.simple_text_section_minor_moment_padding_side);
            int dimensionPixelSize21 = resources7.getDimensionPixelSize(R.dimen.simple_text_section_minor_moment_settings_padding_top);
            int dimensionPixelSize22 = resources7.getDimensionPixelSize(R.dimen.simple_text_section_minor_moment_padding_side);
            int dimensionPixelSize23 = resources7.getDimensionPixelSize(R.dimen.simple_text_section_minor_moment_settings_padding_bottom);
            int i8 = bac.a;
            viewGroup5.setPaddingRelative(dimensionPixelSize20, dimensionPixelSize21, dimensionPixelSize22, dimensionPixelSize23);
            aeVar.width = -1;
            aeVar.I = 0;
            textView.setTextAppearance(R.style.TextAppearance_YouTube_Spec_Display2);
            Context context5 = this.a;
            textView.setTextColor(tzk.k(context5, R.attr.ytTextPrimary));
            textView.setTypeface(ackm.YTSANS_MEDIUM.c(context5, 0));
        }
        if (apzvVar.b.size() != 0) {
            CharSequence charSequence = this.d;
            alay[] alayVarArr = (alay[]) apzvVar.b.toArray(new alay[0]);
            vxe vxeVar = this.b;
            Spanned[] spannedArr = new Spanned[alayVarArr.length];
            for (int i9 = 0; i9 < alayVarArr.length; i9++) {
                spannedArr[i9] = vxl.a(null, alayVarArr[i9], vxeVar, false);
            }
            tuk.u(textView, ackj.g(charSequence, spannedArr));
        }
        int i10 = apzvVar.d;
        int iBg3 = a.bg(i10);
        if ((iBg3 == 0 || iBg3 != 7) && ((iBg = a.bg(i10)) == 0 || iBg != 8)) {
            adlyVar.f("showLineSeparator", Boolean.TRUE);
        } else {
            adlyVar.f("showLineSeparator", Boolean.FALSE);
        }
        this.c.e(adlyVar);
    }

    @Override // defpackage.admr
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((apzv) obj).c.G();
    }
}
