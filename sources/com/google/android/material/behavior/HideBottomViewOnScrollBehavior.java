package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.youtube.music.R;
import defpackage.aetz;
import defpackage.aeux;
import defpackage.aeuy;
import defpackage.aevc;
import defpackage.aevd;
import defpackage.afba;
import defpackage.ast;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class HideBottomViewOnScrollBehavior extends ast {
    public AccessibilityManager b;
    public AccessibilityManager.TouchExplorationStateChangeListener c;
    public int d;
    public ViewPropertyAnimator e;
    private final LinkedHashSet f;
    private int g;
    private int h;
    private TimeInterpolator i;
    private TimeInterpolator j;
    private int k;
    private int l;
    private int m;

    public HideBottomViewOnScrollBehavior() {
        this.f = new LinkedHashSet();
        this.k = 0;
        this.d = 2;
        this.l = 0;
        this.m = 0;
    }

    private final void s(View view, int i, long j, TimeInterpolator timeInterpolator) {
        this.e = view.animate().translationY(i).setInterpolator(timeInterpolator).setDuration(j).setListener(new aeux(this, view));
    }

    private final void t(View view, int i) {
        this.d = i;
        if (i == 1) {
            if (view.hasFocus()) {
                view.clearFocus();
            }
            if (view.getImportantForAccessibility() != 4) {
                this.l = view.getImportantForAccessibility();
            }
            if (view.getVisibility() != 4) {
                this.m = view.getVisibility();
            }
            view.setImportantForAccessibility(4);
        } else {
            if (view.getImportantForAccessibility() == 4) {
                view.setImportantForAccessibility(this.l);
            }
            if (view.getVisibility() == 4) {
                view.setVisibility(this.m);
            }
        }
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            ((aeuy) it.next()).a();
        }
    }

    @Override // defpackage.ast
    public final boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
        this.k = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.g = afba.r(view.getContext(), R.attr.motionDurationLong2, 225);
        this.h = afba.r(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.i = afba.y(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, aetz.d);
        this.j = afba.y(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, aetz.c);
        AccessibilityManager accessibilityManager = this.b;
        if (accessibilityManager == null) {
            accessibilityManager = (AccessibilityManager) view.getContext().getSystemService(AccessibilityManager.class);
            this.b = accessibilityManager;
        }
        if (accessibilityManager == null || this.c != null) {
            return false;
        }
        aevc aevcVar = new aevc(this, view, 1);
        this.c = aevcVar;
        this.b.addTouchExplorationStateChangeListener(aevcVar);
        view.addOnAttachStateChangeListener(new aevd(this, 1));
        return false;
    }

    @Override // defpackage.ast
    public final void onNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i2 <= 0) {
            if (i2 < 0) {
                r(view);
            }
        } else {
            if (q()) {
                return;
            }
            AccessibilityManager accessibilityManager = this.b;
            if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
                ViewPropertyAnimator viewPropertyAnimator = this.e;
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.cancel();
                    view.clearAnimation();
                }
                t(view, 1);
                s(view, this.k, this.h, this.j);
            }
        }
    }

    @Override // defpackage.ast
    public final boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        return i == 2;
    }

    public final boolean q() {
        return this.d == 1;
    }

    public final void r(View view) {
        if (this.d != 2) {
            t(view, 2);
            ViewPropertyAnimator viewPropertyAnimator = this.e;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            s(view, 0, this.g, this.i);
        }
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = new LinkedHashSet();
        this.k = 0;
        this.d = 2;
        this.l = 0;
        this.m = 0;
    }
}
