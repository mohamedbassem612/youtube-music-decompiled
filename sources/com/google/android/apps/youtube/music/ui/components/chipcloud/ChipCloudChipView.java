package com.google.android.apps.youtube.music.ui.components.chipcloud;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.common.ui.CircularImageView;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import defpackage.ackj;
import defpackage.aduk;
import defpackage.aedf;
import defpackage.aext;
import defpackage.ajsy;
import defpackage.ajsz;
import defpackage.alay;
import defpackage.aliz;
import defpackage.alja;
import defpackage.arqz;
import defpackage.bac;
import defpackage.ixf;
import defpackage.ixk;
import defpackage.izf;
import defpackage.izg;
import defpackage.tzk;
import defpackage.vxz;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class ChipCloudChipView extends ixk {
    public izf a;
    public izg b;
    public final YouTubeTextView c;
    public final aedf d;
    public final ChipCloudChipLoadingIndicator e;
    public vxz f;
    private final CircularImageView g;

    public ChipCloudChipView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        View.inflate(context, R.layout.chip_cloud_chip, this);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        YouTubeTextView youTubeTextView = (YouTubeTextView) findViewById(R.id.chip_cloud_chip_text);
        this.c = youTubeTextView;
        this.g = (CircularImageView) findViewById(R.id.chip_cloud_chip_cancel_icon);
        this.e = (ChipCloudChipLoadingIndicator) findViewById(R.id.chip_cloud_chip_loading_indicator);
        if (this.f.l(191, 45702132L, false)) {
            aedf aedfVar = new aedf(context, -1);
            this.d = aedfVar;
            aedfVar.setVisible(false, false);
            setForeground(aedfVar);
        } else {
            this.d = null;
        }
        g();
        ixf ixfVar = new ixf();
        bac.s(youTubeTextView);
        youTubeTextView.setAccessibilityDelegate(ixfVar.getBridge());
    }

    private final void f(int i) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(i);
        gradientDrawable.setCornerRadius(getContext().getResources().getDimensionPixelSize(R.dimen.chip_cloud_chip_corner_radius));
        setBackground(gradientDrawable);
    }

    private final void g() {
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.chip_cloud_chip_text_padding);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.chip_cloud_chip_text_padding);
        YouTubeTextView youTubeTextView = this.c;
        youTubeTextView.setPaddingRelative(dimensionPixelSize, 0, dimensionPixelSize2, 0);
        youTubeTextView.setTextAppearance(getContext(), R.style.TextAppearance_YouTubeMusic_ChipCloudChip);
        youTubeTextView.setCompoundDrawablePadding(0);
        youTubeTextView.setCompoundDrawables(null, null, null, null);
        youTubeTextView.setTypeface(Typeface.DEFAULT);
        setMinimumHeight(getResources().getDimensionPixelSize(R.dimen.cloud_chip_height));
        setPadding(0, 0, 0, 0);
    }

    private final void h(int i, int i2) {
        setBackgroundResource(i);
        this.c.setTextColor(i2);
    }

    public final void a(ajsy ajsyVar) {
        int iB;
        int iB2;
        g();
        ajsz ajszVar = ajsyVar.e;
        if (ajszVar == null) {
            ajszVar = ajsz.a;
        }
        int iR = aext.r(ajszVar.c);
        if (iR == 0 || iR != 18) {
            YouTubeTextView youTubeTextView = this.c;
            youTubeTextView.setTextAppearance(getContext(), R.style.TextAppearance_YouTubeMusic_ModernChipCloudChip);
            int i = ajsyVar.c;
            if (i == 7) {
                izf izfVar = this.a;
                aliz alizVarA = aliz.a(((alja) ajsyVar.d).c);
                if (alizVarA == null) {
                    alizVarA = aliz.UNKNOWN;
                }
                iB = izfVar.a(alizVarA);
            } else if (i == 24) {
                izg izgVar = this.b;
                arqz arqzVarA = arqz.a(((Integer) ajsyVar.d).intValue());
                if (arqzVarA == null) {
                    arqzVarA = arqz.a;
                }
                iB = izgVar.b(arqzVarA);
            } else {
                iB = 0;
            }
            if (iB != 0) {
                ajsz ajszVar2 = ajsyVar.e;
                if (ajszVar2 == null) {
                    ajszVar2 = ajsz.a;
                }
                int iR2 = aext.r(ajszVar2.c);
                if (iR2 == 0 || iR2 != 24) {
                    youTubeTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(iB, 0, 0, 0);
                    alay alayVar = ajsyVar.f;
                    if (alayVar == null) {
                        alayVar = alay.a;
                    }
                    if (!TextUtils.isEmpty(ackj.k(null, alayVar, null, false))) {
                        youTubeTextView.setCompoundDrawablePadding(getResources().getDimensionPixelSize(R.dimen.item_extra_small_spacing));
                    }
                } else {
                    youTubeTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, iB, 0);
                }
            }
            if (!ajsyVar.k) {
                h(R.drawable.chip_cloud_chip_translucent_background, tzk.i(getContext(), R.attr.ytTextPrimary));
                f(tzk.i(getContext(), R.attr.ytBadgeChipBackground));
                return;
            }
            h(R.drawable.chip_cloud_chip_white_background, tzk.i(getContext(), R.attr.ytTextPrimaryInverse));
            f(tzk.i(getContext(), R.attr.ytWhiteBackground));
            int i2 = tzk.i(getContext(), R.attr.ytTextSecondary);
            aedf aedfVar = this.d;
            if (aedfVar != null) {
                aedfVar.a.setColor(i2);
                aedfVar.invalidateSelf();
            }
            ChipCloudChipLoadingIndicator chipCloudChipLoadingIndicator = this.e;
            chipCloudChipLoadingIndicator.b.setColor(i2);
            chipCloudChipLoadingIndicator.invalidate();
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.cloud_chip_height);
        setMinimumHeight(dimensionPixelSize);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.chip_cloud_chip_cancel_icon_size);
        int dimensionPixelSize3 = getResources().getDimensionPixelSize(R.dimen.cloud_chip_cancel_icon_padding);
        int i3 = (dimensionPixelSize3 << 1) + dimensionPixelSize2;
        int i4 = (dimensionPixelSize - dimensionPixelSize2) / 2;
        int i5 = dimensionPixelSize2 + (i4 << 1);
        CircularImageView circularImageView = this.g;
        aduk adukVar = new aduk(getContext(), R.drawable.yt_outline_x_circle_vd_theme_24);
        adukVar.d(R.color.ytm_color_grey_02);
        adukVar.c(i3, i5);
        circularImageView.setImageDrawable(adukVar.a());
        circularImageView.setPadding(dimensionPixelSize3, i4, dimensionPixelSize3, i4);
        ViewGroup.LayoutParams layoutParams = circularImageView.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = i3;
            layoutParams.height = i5;
        }
        circularImageView.setVisibility(0);
        int dimensionPixelSize4 = getResources().getDimensionPixelSize(R.dimen.cloud_chip_margin);
        h(R.drawable.chip_cloud_chip_black_80pct_background, getResources().getColor(R.color.ytm_color_white));
        YouTubeTextView youTubeTextView2 = this.c;
        youTubeTextView2.setCompoundDrawablePadding(dimensionPixelSize4);
        youTubeTextView2.setPadding(dimensionPixelSize4, 0, 0, 0);
        youTubeTextView2.setMaxWidth(R.dimen.mdx_chip_cloud_chip_button_max_width);
        youTubeTextView2.setGravity(17);
        if ((ajsyVar.b & 2) != 0) {
            alay alayVar2 = ajsyVar.f;
            if (alayVar2 == null) {
                alayVar2 = alay.a;
            }
            youTubeTextView2.setText(ackj.k(null, alayVar2, null, false));
            youTubeTextView2.setSelected(true);
            youTubeTextView2.setSingleLine(true);
            youTubeTextView2.canScrollHorizontally(1);
            youTubeTextView2.setMarqueeRepeatLimit(-1);
            youTubeTextView2.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        } else {
            youTubeTextView2.setText("");
        }
        int i6 = ajsyVar.c;
        if (i6 == 7) {
            izf izfVar2 = this.a;
            aliz alizVarA2 = aliz.a(((alja) ajsyVar.d).c);
            if (alizVarA2 == null) {
                alizVarA2 = aliz.UNKNOWN;
            }
            iB2 = izfVar2.a(alizVarA2);
        } else if (i6 == 24) {
            izg izgVar2 = this.b;
            arqz arqzVarA2 = arqz.a(((Integer) ajsyVar.d).intValue());
            if (arqzVarA2 == null) {
                arqzVarA2 = arqz.a;
            }
            iB2 = izgVar2.b(arqzVarA2);
        } else {
            iB2 = 0;
        }
        if (iB2 != 0) {
            youTubeTextView2.setCompoundDrawablesRelativeWithIntrinsicBounds(iB2, 0, 0, 0);
        } else {
            youTubeTextView2.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, 0, 0);
        }
    }

    public final void b(View.OnClickListener onClickListener) {
        this.g.setOnClickListener(onClickListener);
    }

    public final void c(CharSequence charSequence) {
        this.c.setText(charSequence);
    }

    public ChipCloudChipView(Context context) {
        this(context, null);
    }
}
