package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.TextView;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xcp {
    public final View a;
    public final TextView b;
    public final ClipDrawable c;
    public final GradientDrawable d;
    public final ImageView e;
    public final ProgressBar f;
    public final RadioButton g;
    public ajwo h;
    public boolean i;
    public boolean j;
    public boolean k;
    public final xxj l;
    private final TextView m;
    private final GradientDrawable n;
    private final Context o;
    private final SpannableStringBuilder p;
    private final xct q;
    private final adsc r;

    public xcp(Context context, xxj xxjVar, adsa adsaVar, int i, xct xctVar) {
        context.getClass();
        this.o = context;
        this.l = xxjVar;
        View viewInflate = View.inflate(context, R.layout.live_chat_immersive_poll_choice_item, null);
        this.a = viewInflate;
        TextView textView = (TextView) viewInflate.findViewById(R.id.choice_label);
        this.m = textView;
        this.b = (TextView) viewInflate.findViewById(R.id.vote_percentage);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.selected_icon);
        this.e = imageView;
        this.f = (ProgressBar) viewInflate.findViewById(R.id.progress_bar);
        RadioButton radioButton = (RadioButton) viewInflate.findViewById(R.id.radio_button);
        this.g = radioButton;
        this.q = xctVar;
        this.p = new SpannableStringBuilder();
        textView.setTextColor(tzk.i(context, xctVar.a));
        ColorStateList colorStateList = new ColorStateList(new int[][]{new int[]{-16842912}}, new int[]{tzk.i(context, xctVar.a)});
        if (radioButton != null) {
            radioButton.setButtonTintList(colorStateList);
        }
        imageView.setImageTintList(colorStateList);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams.topMargin = context.getResources().getDimensionPixelOffset(R.dimen.live_chat_polls_choice_item_margin_top);
        viewInflate.setLayoutParams(marginLayoutParams);
        Drawable drawable = context.getDrawable(i);
        drawable.getClass();
        GradientDrawable gradientDrawable = (GradientDrawable) drawable;
        this.d = gradientDrawable;
        gradientDrawable.mutate();
        Drawable drawable2 = context.getDrawable(R.drawable.live_chat_immersive_poll_choice_item_ripple);
        drawable2.getClass();
        Drawable drawable3 = context.getDrawable(i);
        drawable3.getClass();
        GradientDrawable gradientDrawable2 = (GradientDrawable) drawable3;
        this.n = gradientDrawable2;
        gradientDrawable2.mutate();
        gradientDrawable2.setStroke(0, 0);
        ClipDrawable clipDrawable = new ClipDrawable(gradientDrawable2, 8388611, 1);
        this.c = clipDrawable;
        viewInflate.setBackground(new LayerDrawable(new Drawable[]{gradientDrawable, (RippleDrawable) drawable2, clipDrawable}));
        viewInflate.setOnClickListener(new vqd(this, context, 14));
        this.r = new adsc(context, adsaVar, true, new adse(textView), true);
    }

    public final void a(aowi aowiVar, Boolean bool) {
        aowi aowiVar2;
        SpannableStringBuilder spannableStringBuilder = this.p;
        spannableStringBuilder.clear();
        boolean z = true;
        if ((aowiVar.b & 1) != 0) {
            alay alayVar = aowiVar.c;
            if (alayVar == null) {
                alayVar = alay.a;
            }
            Spanned spannedK = ackj.k(null, alayVar, null, false);
            spannableStringBuilder.append((CharSequence) spannedK);
            adsc adscVar = this.r;
            alay alayVar2 = aowiVar.c;
            if (alayVar2 == null) {
                alayVar2 = alay.a;
            }
            StringBuilder sb = new StringBuilder();
            sb.append((CharSequence) spannableStringBuilder);
            TextView textView = this.m;
            aowiVar2 = aowiVar;
            adscVar.f(alayVar2, spannedK, spannableStringBuilder, sb, aowiVar2, textView.getId());
            textView.setText(spannableStringBuilder);
        } else {
            aowiVar2 = aowiVar;
        }
        int i = aowiVar2.b;
        boolean z2 = (i & SemanticState.Focused) != 0;
        this.j = z2;
        boolean z3 = (i & SemanticState.Hidden) != 0;
        this.k = z3;
        if (this.h == null) {
            if (z3) {
                ajwo ajwoVar = aowiVar2.h;
                if (ajwoVar == null) {
                    ajwoVar = ajwo.a;
                }
                this.h = ajwoVar;
            } else if (z2) {
                ajwo ajwoVar2 = aowiVar2.g;
                if (ajwoVar2 == null) {
                    ajwoVar2 = ajwo.a;
                }
                this.h = ajwoVar2;
            }
        }
        if (!this.i && !aowiVar2.d) {
            z = false;
        }
        this.i = z;
        this.f.setVisibility(8);
        this.e.setVisibility(8);
        if (bool.booleanValue()) {
            this.a.setClickable(false);
            if ((aowiVar2.b & 32) != 0) {
                ClipDrawable clipDrawable = this.c;
                ObjectAnimator.ofInt(clipDrawable, "level", clipDrawable.getLevel(), (int) (aowiVar2.e * 10000.0d)).setDuration(500L).start();
            }
            if ((aowiVar2.b & 64) != 0) {
                alay alayVar3 = aowiVar2.f;
                if (alayVar3 == null) {
                    alayVar3 = alay.a;
                }
                b(alayVar3);
            } else {
                this.b.setVisibility(8);
            }
            boolean z4 = this.i;
            GradientDrawable gradientDrawable = this.d;
            if (z4) {
                Context context = this.o;
                gradientDrawable.setStroke(context.getResources().getDimensionPixelOffset(R.dimen.live_chat_modern_polls_selected_choice_stroke_width), tzk.i(context, R.attr.ytStaticBrandWhite));
                xct xctVar = this.q;
                gradientDrawable.setColor(tzk.i(context, xctVar.b));
                this.n.setColor(tzk.i(context, xctVar.c));
            } else {
                gradientDrawable.setColor(0);
                xct xctVar2 = this.q;
                boolean zIsPresent = xctVar2.b().isPresent();
                Context context2 = this.o;
                if (zIsPresent) {
                    gradientDrawable.setStroke(context2.getResources().getDimensionPixelOffset(R.dimen.live_chat_modern_polls_unselected_choice_stroke_width), tzk.i(context2, ((Integer) xctVar2.b().get()).intValue()));
                } else {
                    gradientDrawable.setStroke(context2.getResources().getDimensionPixelOffset(R.dimen.live_chat_modern_polls_unselected_choice_stroke_width), context2.getResources().getColor(R.color.yt_black_pure_opacity5));
                }
                boolean zIsPresent2 = xctVar2.a().isPresent();
                GradientDrawable gradientDrawable2 = this.n;
                if (zIsPresent2) {
                    gradientDrawable2.setColor(tzk.i(this.o, ((Integer) xctVar2.a().get()).intValue()));
                } else {
                    gradientDrawable2.setColor(this.o.getResources().getColor(R.color.yt_white1_opacity10));
                }
            }
            boolean z5 = this.i;
            xct xctVar3 = this.q;
            int i2 = z5 ? xctVar3.d : xctVar3.e;
            TextView textView2 = this.m;
            Context context3 = this.o;
            textView2.setTextColor(tzk.i(context3, i2));
            this.b.setTextColor(tzk.i(context3, i2));
        }
    }

    public final void b(alay alayVar) {
        TextView textView = this.b;
        textView.setText(ackj.k(null, alayVar, null, false));
        RadioButton radioButton = this.g;
        if (radioButton != null) {
            radioButton.setVisibility(8);
        }
        textView.setVisibility(0);
    }
}
