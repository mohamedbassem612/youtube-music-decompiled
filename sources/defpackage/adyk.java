package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.rendering.ui.spec.motion.TouchFeedbackDrawable;
import com.google.android.libraries.youtube.rendering.ui.spec.typography.YouTubeAppCompatTextView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adyk implements adma {
    public static final /* synthetic */ int b = 0;
    private static final ttb c = new ttb();
    public final View a;
    private final TextView d;
    private LinearLayout e;
    private final ImageView f;
    private final FrameLayout g;
    private YouTubeAppCompatTextView h;
    private YouTubeAppCompatTextView i;
    private TextView j;
    private TextView k;
    private final ImageView l;
    private View m;
    private TextView n;
    private View o;
    private final ProgressBar p;
    private final vxz q;
    private final vxz r;
    private final aciz s;

    public adyk(Context context, vxz vxzVar, vxz vxzVar2, aciz acizVar) {
        View viewInflate;
        this.e = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = null;
        this.m = null;
        this.n = null;
        this.o = null;
        this.q = vxzVar;
        this.r = vxzVar2;
        this.s = acizVar;
        if (vxzVar.l(104, 45718582L, false)) {
            if (vxzVar.l(155, 45771229L, false)) {
                viewInflate = LayoutInflater.from(context).inflate(R.layout.expandable_modern_bottom_sheet_enableable_list_item, (ViewGroup) null);
                this.a = viewInflate;
            } else {
                viewInflate = LayoutInflater.from(context).inflate(R.layout.modern_bottom_sheet_enableable_list_item, (ViewGroup) null);
                this.a = viewInflate;
            }
        } else if (vxzVar.l(92, 45689957L, false)) {
            viewInflate = LayoutInflater.from(context).inflate(R.layout.bottom_sheet_enableable_multi_line_list_item, (ViewGroup) null);
            this.a = viewInflate;
        } else {
            viewInflate = LayoutInflater.from(context).inflate(R.layout.bottom_sheet_enableable_list_item, (ViewGroup) null);
            this.a = viewInflate;
        }
        this.d = (TextView) viewInflate.findViewById(R.id.list_item_text);
        this.f = (ImageView) viewInflate.findViewById(R.id.list_item_icon_primary);
        this.g = (FrameLayout) viewInflate.findViewById(R.id.list_item_icon_primary_container);
        if (vxzVar.l(104, 45718582L, false)) {
            this.e = (LinearLayout) viewInflate.findViewById(R.id.list_item_text_container);
            this.h = (YouTubeAppCompatTextView) viewInflate.findViewById(R.id.list_item_text_superlabel);
            this.i = (YouTubeAppCompatTextView) viewInflate.findViewById(R.id.list_item_text_sublabel);
            this.m = viewInflate.findViewById(R.id.list_item_detail_container);
            this.n = (TextView) viewInflate.findViewById(R.id.list_item_text_detail);
            this.o = viewInflate.findViewById(R.id.list_item_icon_detail);
        } else {
            this.j = (TextView) viewInflate.findViewById(R.id.list_item_text_secondary);
            this.k = (TextView) viewInflate.findViewById(R.id.list_item_text_secondary_separator);
        }
        this.l = (ImageView) viewInflate.findViewById(R.id.list_item_icon_secondary);
        this.p = (ProgressBar) viewInflate.findViewById(R.id.loading_spinner);
    }

    @Override // defpackage.adma
    public final View a() {
        return this.a;
    }

    public final void d(adyj adyjVar) {
        ColorStateList colorStateListK;
        int i;
        int dimensionPixelSize;
        TextView textView = this.d;
        int dimensionPixelSize2 = textView.getContext().getResources().getDimensionPixelSize(R.dimen.bottom_sheet_list_item_height);
        textView.setText(adyjVar.d);
        if (adyjVar.c()) {
            colorStateListK = adyjVar.e;
            if (colorStateListK == null) {
                colorStateListK = tzk.k(textView.getContext(), R.attr.ytTextPrimary);
            }
        } else {
            colorStateListK = tzk.k(textView.getContext(), R.attr.ytTextDisabled);
        }
        textView.setTextColor(colorStateListK);
        View view = this.a;
        vxz vxzVar = this.q;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (vxzVar.l(190, 45851384L, false)) {
            if (layoutParams == null) {
                layoutParams = new AbsListView.LayoutParams(-1, -2);
            }
            layoutParams.height = -2;
            view.setMinimumHeight(true != vxzVar.l(104, 45718582L, false) ? dimensionPixelSize2 : 0);
            view.setLayoutParams(layoutParams);
        } else if (layoutParams != null) {
            layoutParams.height = -2;
            view.setMinimumHeight(dimensionPixelSize2);
            view.setLayoutParams(layoutParams);
        }
        ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
        if (layoutParams2 != null) {
            if (!vxzVar.l(104, 45718582L, false)) {
                layoutParams2.height = -2;
                textView.setMinimumHeight(dimensionPixelSize2);
            }
            textView.setLayoutParams(layoutParams2);
        }
        ProgressBar progressBar = this.p;
        if (progressBar != null) {
            progressBar.setVisibility(((adyjVar instanceof adyl) && ((adyl) adyjVar).r) ? 0 : 8);
        }
        if (vxzVar.l(104, 45718582L, false)) {
            aciz acizVar = this.s;
            aedu aeduVarA = aedv.a();
            aeduVarA.a = adyjVar.c != null ? 4 : 3;
            aeduVarA.b = 4;
            aeduVarA.d = 1;
            acizVar.B(aeduVarA.a(), textView.getContext(), (YouTubeAppCompatTextView) textView);
        }
        Drawable drawable = adyjVar.f;
        if (drawable == null) {
            this.g.setVisibility(8);
            this.f.setVisibility(8);
            i = 104;
        } else {
            ImageView imageView = this.f;
            imageView.setImageDrawable(drawable);
            FrameLayout frameLayout = this.g;
            ViewGroup.LayoutParams layoutParams3 = frameLayout.getLayoutParams();
            TypedValue.applyDimension(1, 36.0f, textView.getContext().getResources().getDisplayMetrics());
            int i2 = adyjVar.o;
            layoutParams3.width = textView.getContext().getResources().getDimensionPixelSize(R.dimen.bottom_sheet_list_icon_size);
            layoutParams3.height = layoutParams3.width;
            frameLayout.setVisibility(0);
            imageView.setVisibility(0);
            if (!vxzVar.l(92, 45689957L, false) || adyjVar.j) {
                imageView.setImageTintList(tzk.k(imageView.getContext(), true != adyjVar.c() ? R.attr.ytIconDisabled : R.attr.ytTextPrimary));
            } else {
                imageView.setImageTintList(null);
            }
            i = 104;
        }
        if (vxzVar.l(i, 45718582L, false)) {
            String str = adyjVar.b;
            if (str == null) {
                YouTubeAppCompatTextView youTubeAppCompatTextView = this.h;
                if (youTubeAppCompatTextView != null) {
                    youTubeAppCompatTextView.setVisibility(8);
                }
                YouTubeAppCompatTextView youTubeAppCompatTextView2 = this.i;
                if (youTubeAppCompatTextView2 != null) {
                    youTubeAppCompatTextView2.setVisibility(8);
                }
            } else {
                int i3 = adyjVar.n;
                YouTubeAppCompatTextView youTubeAppCompatTextView3 = this.i;
                YouTubeAppCompatTextView youTubeAppCompatTextView4 = this.h;
                if (youTubeAppCompatTextView3 != null) {
                    youTubeAppCompatTextView3.setText(str);
                    youTubeAppCompatTextView3.setVisibility(0);
                }
                if (youTubeAppCompatTextView4 != null) {
                    youTubeAppCompatTextView4.setVisibility(8);
                }
            }
        } else {
            String str2 = adyjVar.b;
            TextView textView2 = this.j;
            if (str2 == null) {
                if (textView2 != null) {
                    textView2.setVisibility(8);
                }
                TextView textView3 = this.k;
                if (textView3 != null) {
                    textView3.setVisibility(8);
                }
            } else if (textView2 != null) {
                ColorStateList colorStateListK2 = tzk.k(textView2.getContext(), true != adyjVar.c() ? R.attr.ytTextDisabled : R.attr.ytTextPrimary);
                this.j.setText(adyjVar.b);
                this.j.setVisibility(0);
                this.j.setTextColor(colorStateListK2);
                TextView textView4 = this.k;
                if (textView4 != null) {
                    textView4.setText("•");
                    this.k.setVisibility(0);
                    this.k.setTextColor(colorStateListK2);
                }
            }
        }
        if (vxzVar.l(104, 45718582L, false)) {
            LinearLayout linearLayout = this.e;
            if (linearLayout != null) {
                ae aeVar = (ae) linearLayout.getLayoutParams();
                if (adyjVar.g == null && adyjVar.f == null && adyjVar.h == null) {
                    aeVar.n = 0;
                    aeVar.p = 0;
                } else {
                    aeVar.n = -1;
                    aeVar.p = -1;
                }
                this.e.setLayoutParams(aeVar);
            }
            if (adyjVar.h != null) {
                this.l.setVisibility(8);
                View view2 = this.m;
                if (view2 != null) {
                    view2.setVisibility(0);
                }
                TextView textView5 = this.n;
                if (textView5 != null) {
                    textView5.setText(adyjVar.h);
                    if (this.r.l(261, 45803354L, false)) {
                        this.n.setMaxLines(1);
                        this.n.setSingleLine(true);
                        this.n.setEllipsize(TextUtils.TruncateAt.END);
                        int i4 = this.n.getContext().getResources().getDisplayMetrics().widthPixels;
                        if (i4 > 0) {
                            this.n.setMaxWidth((int) (i4 * 0.4f));
                        }
                    }
                }
                View view3 = this.o;
                if (view3 != null && adyjVar.p == 2) {
                    view3.setVisibility(4);
                }
            } else if (adyjVar.g != null) {
                View view4 = this.m;
                if (view4 != null) {
                    view4.setVisibility(8);
                }
                ImageView imageView2 = this.l;
                imageView2.setVisibility(0);
                imageView2.setImageDrawable(adyjVar.g);
                if (!vxzVar.l(92, 45689957L, false) || adyjVar.i) {
                    imageView2.setImageTintList(tzk.k(imageView2.getContext(), true != adyjVar.c() ? R.attr.ytIconDisabled : R.attr.ytTextPrimary));
                } else {
                    imageView2.setImageTintList(null);
                }
            } else {
                this.l.setVisibility(8);
                View view5 = this.m;
                if (view5 != null) {
                    view5.setVisibility(8);
                }
            }
        } else {
            Drawable drawable2 = adyjVar.g;
            ImageView imageView3 = this.l;
            if (drawable2 == null) {
                imageView3.setVisibility(8);
            } else {
                imageView3.setImageDrawable(drawable2);
                imageView3.setVisibility(0);
                if (!vxzVar.l(92, 45689957L, false) || adyjVar.i) {
                    imageView3.setImageTintList(tzk.k(imageView3.getContext(), true != adyjVar.c() ? R.attr.ytIconDisabled : R.attr.ytTextPrimary));
                } else {
                    imageView3.setImageTintList(null);
                }
            }
        }
        view.setBackgroundColor(0);
        if (adyjVar.k) {
            tuk.k(view, view.getBackground(), 0);
        } else {
            Drawable background = view.getBackground();
            boolean z = background instanceof TouchFeedbackDrawable;
            Interpolator interpolator = aedd.a;
            if (!z) {
                aedg aedgVarA = aedg.a(view.getContext());
                aedgVarA.c(0);
                aedgVarA.b = background;
                tym.Z(view, aedgVarA.b());
            }
        }
        if (vxzVar.l(104, 45718582L, false)) {
            dimensionPixelSize = 0;
        } else {
            dimensionPixelSize = adyjVar.k ? textView.getContext().getResources().getDimensionPixelSize(R.dimen.bottom_sheet_list_icon_size) : textView.getContext().getResources().getDimensionPixelSize(R.dimen.bottom_sheet_list_text_padding);
        }
        textView.setPaddingRelative(dimensionPixelSize, 0, 0, 0);
        Runnable runnable = adyjVar.c;
        if (runnable != null) {
            view.setOnClickListener(new yde(runnable, 17));
            bac.p(view, c);
        } else {
            view.setOnClickListener(null);
            bac.p(view, null);
        }
    }

    @Override // defpackage.adma
    public final /* bridge */ /* synthetic */ void hU(adly adlyVar, Object obj) {
        d((adyj) obj);
    }

    @Override // defpackage.adma
    public final void b(admh admhVar) {
    }
}
