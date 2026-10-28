package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.youtube.music.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.focus.FocusRingDrawable;
import defpackage.a;
import defpackage.aeud;
import defpackage.aewu;
import defpackage.aexi;
import defpackage.aexj;
import defpackage.aexm;
import defpackage.aexn;
import defpackage.aexp;
import defpackage.aeyc;
import defpackage.aeym;
import defpackage.aeyr;
import defpackage.afas;
import defpackage.afba;
import defpackage.afbe;
import defpackage.afbk;
import defpackage.afbv;
import defpackage.afcx;
import defpackage.afcz;
import defpackage.afev;
import defpackage.aha;
import defpackage.ass;
import defpackage.ast;
import defpackage.asv;
import defpackage.avgj;
import defpackage.azs;
import defpackage.bac;
import defpackage.kjs;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class FloatingActionButton extends aeyr implements afbv, ass {
    public int a;
    public boolean b;
    public final Rect c;
    private ColorStateList e;
    private PorterDuff.Mode f;
    private ColorStateList g;
    private int h;
    private int i;
    private int j;
    private int k;
    private final Rect l;
    private aexn m;
    private final afcx n;
    private final kjs o;

    public FloatingActionButton(Context context, AttributeSet attributeSet, int i) {
        Drawable drawable;
        Drawable layerDrawable;
        super(afev.a(context, attributeSet, i, R.style.Widget_Design_FloatingActionButton), attributeSet, i);
        this.c = new Rect();
        this.l = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayA = aeym.a(context2, attributeSet, aexp.c, i, R.style.Widget_Design_FloatingActionButton, new int[0]);
        this.e = afba.f(context2, typedArrayA, 1);
        this.f = a.l(typedArrayA.getInt(2, -1), null);
        this.g = afba.f(context2, typedArrayA, 12);
        this.i = typedArrayA.getInt(7, -1);
        this.j = typedArrayA.getDimensionPixelSize(6, 0);
        this.h = typedArrayA.getDimensionPixelSize(3, 0);
        float dimension = typedArrayA.getDimension(4, 0.0f);
        float dimension2 = typedArrayA.getDimension(9, 0.0f);
        float dimension3 = typedArrayA.getDimension(11, 0.0f);
        this.b = typedArrayA.getBoolean(16, false);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.mtrl_fab_min_touch_target);
        int dimensionPixelSize2 = typedArrayA.getDimensionPixelSize(10, 0);
        this.k = dimensionPixelSize2;
        aexn aexnVarI = i();
        if (aexnVarI.z != dimensionPixelSize2) {
            aexnVarI.z = dimensionPixelSize2;
            aexnVarI.h();
        }
        aeud aeudVarB = aeud.b(context2, typedArrayA, 15);
        aeud aeudVarB2 = aeud.b(context2, typedArrayA, 8);
        afbk afbkVar = new afbk(afbk.i(context2, attributeSet, i, R.style.Widget_Design_FloatingActionButton, afbk.a));
        boolean z = typedArrayA.getBoolean(5, false);
        setEnabled(typedArrayA.getBoolean(0, true));
        typedArrayA.recycle();
        kjs kjsVar = new kjs(this);
        this.o = kjsVar;
        kjsVar.j(attributeSet, i);
        this.n = new afcx(this);
        i().g(afbkVar);
        aexn aexnVarI2 = i();
        ColorStateList colorStateList = this.e;
        PorterDuff.Mode mode = this.f;
        ColorStateList colorStateList2 = this.g;
        int i2 = this.h;
        afbk afbkVar2 = aexnVarI2.l;
        azs.l(afbkVar2);
        aexnVarI2.m = new aexm(afbkVar2);
        aexnVarI2.m.setTintList(colorStateList);
        if (mode != null) {
            aexnVarI2.m.setTintMode(mode);
        }
        aexnVarI2.m.n(aexnVarI2.B.getContext());
        if (i2 > 0) {
            Context context3 = aexnVarI2.B.getContext();
            afbk afbkVar3 = aexnVarI2.l;
            azs.l(afbkVar3);
            aewu aewuVar = new aewu(afbkVar3);
            int color = context3.getColor(R.color.design_fab_stroke_top_outer_color);
            int color2 = context3.getColor(R.color.design_fab_stroke_top_inner_color);
            int color3 = context3.getColor(R.color.design_fab_stroke_end_inner_color);
            int color4 = context3.getColor(R.color.design_fab_stroke_end_outer_color);
            aewuVar.c = color;
            aewuVar.d = color2;
            aewuVar.e = color3;
            aewuVar.f = color4;
            float f = i2;
            if (aewuVar.b != f) {
                aewuVar.b = f;
                aewuVar.a.setStrokeWidth(f * 1.3333f);
                aewuVar.g = true;
                aewuVar.invalidateSelf();
            }
            aewuVar.b(colorStateList);
            aexnVarI2.o = aewuVar;
            aewu aewuVar2 = aexnVarI2.o;
            azs.l(aewuVar2);
            afbe afbeVar = aexnVarI2.m;
            azs.l(afbeVar);
            layerDrawable = new LayerDrawable(new Drawable[]{aewuVar2, afbeVar});
            drawable = null;
        } else {
            drawable = null;
            aexnVarI2.o = null;
            layerDrawable = aexnVarI2.m;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(afas.b(colorStateList2), layerDrawable, drawable);
        aexnVarI2.n = rippleDrawable;
        FocusRingDrawable.b(aexnVarI2.B.getContext(), rippleDrawable, aexnVarI2.m);
        aexnVarI2.p = rippleDrawable;
        i().u = dimensionPixelSize;
        aexn aexnVarI3 = i();
        if (aexnVarI3.r != dimension) {
            aexnVarI3.r = dimension;
            aexnVarI3.e(dimension, aexnVarI3.s, aexnVarI3.t);
        }
        aexn aexnVarI4 = i();
        if (aexnVarI4.s != dimension2) {
            aexnVarI4.s = dimension2;
            aexnVarI4.e(aexnVarI4.r, dimension2, aexnVarI4.t);
        }
        aexn aexnVarI5 = i();
        if (aexnVarI5.t != dimension3) {
            aexnVarI5.t = dimension3;
            aexnVarI5.e(aexnVarI5.r, aexnVarI5.s, dimension3);
        }
        i().w = aeudVarB;
        i().x = aeudVarB2;
        i().q = z;
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    private final int h(int i) {
        int i2 = this.j;
        if (i2 != 0) {
            return i2;
        }
        Resources resources = getResources();
        if (i != -1) {
            return i != 1 ? resources.getDimensionPixelSize(R.dimen.design_fab_size_normal) : resources.getDimensionPixelSize(R.dimen.design_fab_size_mini);
        }
        return Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? h(1) : h(0);
    }

    private final aexn i() {
        aexn aexnVar = this.m;
        if (aexnVar != null) {
            return aexnVar;
        }
        aexn aexnVar2 = new aexn(this, new avgj(this));
        this.m = aexnVar2;
        return aexnVar2;
    }

    private final void j() {
        setTooltipText(isClickable() ? getContentDescription() : null);
    }

    @Override // defpackage.ass
    public final ast a() {
        return new Behavior();
    }

    public final int b() {
        return h(this.i);
    }

    @Override // defpackage.afbv
    public final void d(afbk afbkVar) {
        i().g(afbkVar);
    }

    final void e() {
        aexn aexnVarI = i();
        FloatingActionButton floatingActionButton = aexnVarI.B;
        if (floatingActionButton.getVisibility() == 0) {
            if (aexnVarI.A == 1) {
                return;
            }
        } else if (aexnVarI.A != 2) {
            return;
        }
        Animator animator = aexnVarI.v;
        if (animator != null) {
            animator.cancel();
        }
        if (!aexnVarI.l()) {
            floatingActionButton.g(4, false);
            return;
        }
        aeud aeudVar = aexnVarI.x;
        AnimatorSet animatorSetB = aeudVar != null ? aexnVarI.b(aeudVar, 0.0f, 0.0f, 0.0f) : aexnVarI.c(0.0f, 0.4f, 0.4f, aexn.d, aexn.e);
        animatorSetB.addListener(new aexi(aexnVarI));
        animatorSetB.start();
    }

    final void f() {
        aexn aexnVarI = i();
        FloatingActionButton floatingActionButton = aexnVarI.B;
        if (floatingActionButton.getVisibility() != 0) {
            if (aexnVarI.A == 2) {
                return;
            }
        } else if (aexnVarI.A != 1) {
            return;
        }
        Animator animator = aexnVarI.v;
        if (animator != null) {
            animator.cancel();
        }
        aeud aeudVar = aexnVarI.w;
        if (!aexnVarI.l()) {
            floatingActionButton.g(0, false);
            floatingActionButton.setAlpha(1.0f);
            floatingActionButton.setScaleY(1.0f);
            floatingActionButton.setScaleX(1.0f);
            aexnVarI.f(1.0f);
            return;
        }
        if (floatingActionButton.getVisibility() != 0) {
            floatingActionButton.setAlpha(0.0f);
            float f = aeudVar == null ? 0.4f : 0.0f;
            floatingActionButton.setScaleY(f);
            floatingActionButton.setScaleX(f);
            aexnVarI.f(f);
        }
        aeud aeudVar2 = aexnVarI.w;
        AnimatorSet animatorSetB = aeudVar2 != null ? aexnVarI.b(aeudVar2, 1.0f, 1.0f, 1.0f) : aexnVarI.c(1.0f, 1.0f, 1.0f, aexn.b, aexn.c);
        animatorSetB.addListener(new aexj(aexnVarI));
        animatorSetB.start();
    }

    @Override // android.widget.ImageButton, android.widget.ImageView, android.view.View
    public final CharSequence getAccessibilityClassName() {
        return "com.google.android.material.floatingactionbutton.FloatingActionButton";
    }

    @Override // android.view.View
    public final ColorStateList getBackgroundTintList() {
        return this.e;
    }

    @Override // android.view.View
    public final PorterDuff.Mode getBackgroundTintMode() {
        return this.f;
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        aexn aexnVarI = i();
        afbe afbeVar = aexnVarI.m;
        if (afbeVar != null) {
            afba.p(aexnVarI.B, afbeVar);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        i().B.getViewTreeObserver();
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onMeasure(int i, int i2) {
        int iB = b();
        this.a = (iB - this.k) / 2;
        i().i();
        int iMin = Math.min(View.resolveSize(iB, i), View.resolveSize(iB, i2));
        Rect rect = this.c;
        setMeasuredDimension(rect.left + iMin + rect.right, iMin + rect.top + rect.bottom);
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof afcz)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        afcz afczVar = (afcz) parcelable;
        super.onRestoreInstanceState(afczVar.d);
        afcx afcxVar = this.n;
        Bundle bundle = (Bundle) afczVar.a.get("expandableWidgetHelper");
        azs.l(bundle);
        afcxVar.b = bundle.getBoolean("expanded", false);
        afcxVar.a = bundle.getInt("expandedComponentIdHint", 0);
        if (afcxVar.b) {
            View view = (View) afcxVar.c;
            ViewParent parent = view.getParent();
            if (parent instanceof CoordinatorLayout) {
                ((CoordinatorLayout) parent).b(view);
            }
        }
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        if (parcelableOnSaveInstanceState == null) {
            parcelableOnSaveInstanceState = new Bundle();
        }
        afcz afczVar = new afcz(parcelableOnSaveInstanceState);
        aha ahaVar = afczVar.a;
        afcx afcxVar = this.n;
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", afcxVar.b);
        bundle.putInt("expandedComponentIdHint", afcxVar.a);
        ahaVar.put("expandableWidgetHelper", bundle);
        return afczVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            Rect rect = this.l;
            rect.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
            Rect rect2 = this.c;
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right -= rect2.right;
            rect.bottom -= rect2.bottom;
            int i = -this.m.a();
            rect.inset(i, i);
            if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.e != colorStateList) {
            this.e = colorStateList;
            aexn aexnVarI = i();
            afbe afbeVar = aexnVarI.m;
            if (afbeVar != null) {
                afbeVar.setTintList(colorStateList);
            }
            aewu aewuVar = aexnVarI.o;
            if (aewuVar != null) {
                aewuVar.b(colorStateList);
            }
        }
    }

    @Override // android.view.View
    public final void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f != mode) {
            this.f = mode;
            afbe afbeVar = i().m;
            if (afbeVar != null) {
                afbeVar.setTintMode(mode);
            }
        }
    }

    @Override // android.view.View
    public final void setClickable(boolean z) {
        super.setClickable(z);
        j();
    }

    @Override // android.view.View
    public final void setContentDescription(CharSequence charSequence) {
        super.setContentDescription(charSequence);
        j();
    }

    @Override // android.view.View
    public final void setElevation(float f) {
        super.setElevation(f);
        afbe afbeVar = i().m;
        if (afbeVar != null) {
            afbeVar.p(f);
        }
    }

    @Override // android.widget.ImageView
    public final void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            i().h();
        }
    }

    @Override // android.widget.ImageView
    public final void setImageResource(int i) {
        this.o.l(i);
        Drawable drawable = getDrawable();
        if (drawable != null) {
            drawable.clearColorFilter();
        }
    }

    @Override // android.view.View
    public final void setScaleX(float f) {
        super.setScaleX(f);
        i();
    }

    @Override // android.view.View
    public final void setScaleY(float f) {
        super.setScaleY(f);
        i();
    }

    @Override // android.view.View
    public final void setTranslationX(float f) {
        super.setTranslationX(f);
        i();
    }

    @Override // android.view.View
    public final void setTranslationY(float f) {
        super.setTranslationY(f);
        i();
    }

    @Override // android.view.View
    public final void setTranslationZ(float f) {
        super.setTranslationZ(f);
        i();
    }

    /* JADX INFO: compiled from: PG */
    public class Behavior extends BaseBehavior {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* JADX INFO: compiled from: PG */
    public class BaseBehavior extends ast {
        private Rect b;
        private final boolean c;

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, aexp.d);
            this.c = typedArrayObtainStyledAttributes.getBoolean(0, true);
            typedArrayObtainStyledAttributes.recycle();
        }

        private final boolean q(View view, FloatingActionButton floatingActionButton) {
            return (this.c && ((asv) floatingActionButton.getLayoutParams()).f == view.getId() && floatingActionButton.d == 0) ? false : true;
        }

        private static boolean r(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof asv) {
                return ((asv) layoutParams).a instanceof BottomSheetBehavior;
            }
            return false;
        }

        private final boolean s(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (q(appBarLayout, floatingActionButton)) {
                return false;
            }
            Rect rect = this.b;
            if (rect == null) {
                rect = new Rect();
                this.b = rect;
            }
            aeyc.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.d()) {
                floatingActionButton.e();
            } else {
                floatingActionButton.f();
            }
            return true;
        }

        private final boolean t(View view, FloatingActionButton floatingActionButton) {
            if (q(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((asv) floatingActionButton.getLayoutParams()).topMargin) {
                floatingActionButton.e();
            } else {
                floatingActionButton.f();
            }
            return true;
        }

        @Override // defpackage.ast
        public final /* bridge */ /* synthetic */ boolean getInsetDodgeRect(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            Rect rect2 = floatingActionButton.c;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        @Override // defpackage.ast
        public final void onAttachedToLayoutParams(asv asvVar) {
            if (asvVar.h == 0) {
                asvVar.h = 80;
            }
        }

        @Override // defpackage.ast
        public final /* bridge */ /* synthetic */ boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                s(coordinatorLayout, (AppBarLayout) view2, floatingActionButton);
                return false;
            }
            if (!r(view2)) {
                return false;
            }
            t(view2, floatingActionButton);
            return false;
        }

        @Override // defpackage.ast
        public final /* bridge */ /* synthetic */ boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            List listA = coordinatorLayout.a(floatingActionButton);
            int size = listA.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                View view2 = (View) listA.get(i3);
                if (!(view2 instanceof AppBarLayout)) {
                    if (r(view2) && t(view2, floatingActionButton)) {
                        break;
                    }
                } else {
                    if (s(coordinatorLayout, (AppBarLayout) view2, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.j(floatingActionButton, i);
            Rect rect = floatingActionButton.c;
            if (rect.centerX() <= 0 || rect.centerY() <= 0) {
                return true;
            }
            asv asvVar = (asv) floatingActionButton.getLayoutParams();
            int i4 = floatingActionButton.getRight() >= coordinatorLayout.getWidth() - asvVar.rightMargin ? rect.right : floatingActionButton.getLeft() <= asvVar.leftMargin ? -rect.left : 0;
            if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - asvVar.bottomMargin) {
                i2 = rect.bottom;
            } else if (floatingActionButton.getTop() <= asvVar.topMargin) {
                i2 = -rect.top;
            }
            if (i2 != 0) {
                int i5 = bac.a;
                floatingActionButton.offsetTopAndBottom(i2);
            }
            if (i4 == 0) {
                return true;
            }
            int i6 = bac.a;
            floatingActionButton.offsetLeftAndRight(i4);
            return true;
        }

        public BaseBehavior() {
            this.c = true;
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.floatingActionButtonStyle);
    }

    public FloatingActionButton(Context context) {
        this(context, null);
    }
}
