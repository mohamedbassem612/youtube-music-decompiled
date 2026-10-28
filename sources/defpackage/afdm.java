package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.StateSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.focus.FocusRingDrawable;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afdm extends LinearLayout {
    public TextView a;
    public ImageView b;
    public View c;
    public final Drawable d;
    final /* synthetic */ TabLayout e;
    private afdk f;
    private TextView g;
    private ImageView h;
    private int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afdm(TabLayout tabLayout, Context context) {
        Drawable focusRingDrawable;
        Drawable rippleDrawable;
        super(context);
        this.e = tabLayout;
        this.i = 2;
        int i = tabLayout.p;
        if (i != 0) {
            Drawable drawableC = ok.e().c(context, i);
            this.d = drawableC;
            if (drawableC != null && drawableC.isStateful()) {
                drawableC.setState(getDrawableState());
            }
        } else {
            this.d = null;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(0);
        Drawable drawable = gradientDrawable;
        if (tabLayout.k != null) {
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setCornerRadius(1.0E-5f);
            gradientDrawable2.setColor(-1);
            ColorStateList colorStateList = tabLayout.k;
            int[] iArr = afas.a;
            int iA = afas.a(colorStateList, afas.c);
            int[] iArr2 = afas.b;
            ColorStateList colorStateList2 = new ColorStateList(new int[][]{afas.d, iArr2, StateSet.NOTHING}, new int[]{iA, afas.a(colorStateList, iArr2), afas.a(colorStateList, afas.a)});
            if (tabLayout.y) {
                rippleDrawable = new RippleDrawable(colorStateList2, null, null);
                if (FocusRingDrawable.d(context)) {
                    drawable = rippleDrawable;
                    focusRingDrawable = new FocusRingDrawable(context, rippleDrawable);
                }
            } else {
                RippleDrawable rippleDrawable2 = new RippleDrawable(colorStateList2, gradientDrawable, gradientDrawable2);
                FocusRingDrawable.b(context, rippleDrawable2, null);
                focusRingDrawable = rippleDrawable2;
            }
            drawable = focusRingDrawable;
        }
        drawable = rippleDrawable;
        setBackground(drawable);
        tabLayout.invalidate();
        setPaddingRelative(tabLayout.c, tabLayout.d, tabLayout.e, tabLayout.f);
        setGravity(17);
        setOrientation(!tabLayout.v ? 1 : 0);
        setClickable(true);
        PointerIcon systemIcon = PointerIcon.getSystemIcon(getContext(), 1002);
        int i2 = bac.a;
        azu.a(this, systemIcon);
    }

    private final void d(TextView textView, ImageView imageView, boolean z) {
        boolean z2;
        afdk afdkVar = this.f;
        CharSequence charSequence = afdkVar != null ? afdkVar.a : null;
        if (imageView != null) {
            imageView.setVisibility(8);
            imageView.setImageDrawable(null);
        }
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        boolean z3 = !zIsEmpty;
        if (textView != null) {
            if (zIsEmpty) {
                z2 = false;
            } else {
                int i = this.f.e;
                z2 = true;
            }
            textView.setText(true != z3 ? null : charSequence);
            textView.setVisibility(true == z2 ? 0 : 8);
            if (!zIsEmpty) {
                setVisibility(0);
            }
        } else {
            z2 = false;
        }
        if (z && imageView != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
            int iApplyDimension = (z2 && imageView.getVisibility() == 0) ? (int) TypedValue.applyDimension(1, 8.0f, getContext().getResources().getDisplayMetrics()) : 0;
            if (this.e.v) {
                if (iApplyDimension != marginLayoutParams.getMarginEnd()) {
                    marginLayoutParams.setMarginEnd(iApplyDimension);
                    marginLayoutParams.bottomMargin = 0;
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            } else if (iApplyDimension != marginLayoutParams.bottomMargin) {
                marginLayoutParams.bottomMargin = iApplyDimension;
                marginLayoutParams.setMarginEnd(0);
                imageView.setLayoutParams(marginLayoutParams);
                imageView.requestLayout();
            }
        }
        afdk afdkVar2 = this.f;
        CharSequence charSequence2 = afdkVar2 != null ? afdkVar2.b : null;
        if (true != z3) {
            charSequence = charSequence2;
        }
        setTooltipText(charSequence);
    }

    private static final void e(View view) {
        if (view != null) {
            view.addOnLayoutChangeListener(new hbp(view, 6));
        }
    }

    public final void a(afdk afdkVar) {
        if (afdkVar != this.f) {
            this.f = afdkVar;
            b();
        }
    }

    final void b() {
        c();
        afdk afdkVar = this.f;
        boolean z = false;
        if (afdkVar != null && afdkVar.c()) {
            z = true;
        }
        setSelected(z);
    }

    public final void c() {
        int i;
        ViewParent parent;
        afdk afdkVar = this.f;
        View view = afdkVar != null ? afdkVar.d : null;
        if (view != null) {
            ViewParent parent2 = view.getParent();
            if (parent2 != this) {
                if (parent2 != null) {
                    ((ViewGroup) parent2).removeView(view);
                }
                View view2 = this.c;
                if (view2 != null && (parent = view2.getParent()) != null) {
                    ((ViewGroup) parent).removeView(this.c);
                }
                addView(view);
            }
            this.c = view;
            TextView textView = this.a;
            if (textView != null) {
                textView.setVisibility(8);
            }
            ImageView imageView = this.b;
            if (imageView != null) {
                imageView.setVisibility(8);
                this.b.setImageDrawable(null);
            }
            TextView textView2 = (TextView) view.findViewById(R.id.text1);
            this.g = textView2;
            if (textView2 != null) {
                this.i = textView2.getMaxLines();
            }
            this.h = (ImageView) view.findViewById(R.id.icon);
        } else {
            View view3 = this.c;
            if (view3 != null) {
                removeView(view3);
                this.c = null;
            }
            this.g = null;
            this.h = null;
        }
        if (this.c == null) {
            if (this.b == null) {
                ImageView imageView2 = (ImageView) LayoutInflater.from(getContext()).inflate(com.google.android.apps.youtube.music.R.layout.design_layout_tab_icon, (ViewGroup) this, false);
                this.b = imageView2;
                addView(imageView2, 0);
            }
            if (this.a == null) {
                TextView textView3 = (TextView) LayoutInflater.from(getContext()).inflate(com.google.android.apps.youtube.music.R.layout.design_layout_tab_text, (ViewGroup) this, false);
                this.a = textView3;
                addView(textView3);
                this.i = this.a.getMaxLines();
            }
            TextView textView4 = this.a;
            TabLayout tabLayout = this.e;
            textView4.setTextAppearance(tabLayout.g);
            if (!isSelected() || (i = tabLayout.i) == -1) {
                this.a.setTextAppearance(tabLayout.h);
            } else {
                this.a.setTextAppearance(i);
            }
            ColorStateList colorStateList = tabLayout.j;
            if (colorStateList != null) {
                this.a.setTextColor(colorStateList);
            }
            d(this.a, this.b, true);
            e(this.b);
            e(this.a);
        } else {
            TextView textView5 = this.g;
            if (textView5 != null || this.h != null) {
                d(textView5, this.h, false);
            }
        }
        if (afdkVar == null || TextUtils.isEmpty(afdkVar.b)) {
            return;
        }
        setContentDescription(afdkVar.b);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.d;
        int[] drawableState = getDrawableState();
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidate();
            this.e.invalidate();
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        bbz bbzVar = new bbz(accessibilityNodeInfo);
        bbzVar.y(zs.g(0, 1, this.f.c, 1, isSelected()));
        if (isSelected()) {
            bbzVar.w(false);
            bbzVar.X(bby.a);
        }
        bbzVar.K(getResources().getString(com.google.android.apps.youtube.music.R.string.item_view_role_description));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        Layout layout;
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        TabLayout tabLayout = this.e;
        int i3 = tabLayout.q;
        if (i3 > 0 && (mode == 0 || size > i3)) {
            i = View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.a != null) {
            float f = tabLayout.m;
            if (isSelected() && tabLayout.i != -1) {
                f = tabLayout.n;
            }
            int i4 = this.i;
            ImageView imageView = this.b;
            if (imageView == null || imageView.getVisibility() != 0) {
                TextView textView = this.a;
                if (textView != null && textView.getLineCount() > 1) {
                    f = tabLayout.o;
                }
            } else {
                i4 = 1;
            }
            float textSize = this.a.getTextSize();
            int lineCount = this.a.getLineCount();
            int maxLines = this.a.getMaxLines();
            if (f != textSize || (maxLines >= 0 && i4 != maxLines)) {
                if (tabLayout.u != 1 || f <= textSize || lineCount != 1 || ((layout = this.a.getLayout()) != null && layout.getLineWidth(0) * (f / layout.getPaint().getTextSize()) <= (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())) {
                    this.a.setTextSize(0, f);
                    this.a.setMaxLines(i4);
                    super.onMeasure(i, i2);
                }
            }
        }
    }

    @Override // android.view.View
    public final boolean performClick() {
        boolean zPerformClick = super.performClick();
        if (this.f == null) {
            return zPerformClick;
        }
        if (!zPerformClick) {
            playSoundEffect(0);
        }
        this.f.a();
        return true;
    }

    @Override // android.view.View
    public final void setSelected(boolean z) {
        isSelected();
        super.setSelected(z);
        TextView textView = this.a;
        if (textView != null) {
            textView.setSelected(z);
        }
        ImageView imageView = this.b;
        if (imageView != null) {
            imageView.setSelected(z);
        }
        View view = this.c;
        if (view != null) {
            view.setSelected(z);
        }
    }
}
