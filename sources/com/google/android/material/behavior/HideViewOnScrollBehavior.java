package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.youtube.music.R;
import defpackage.aetz;
import defpackage.aeuz;
import defpackage.aeva;
import defpackage.aevb;
import defpackage.aevc;
import defpackage.aevd;
import defpackage.aeve;
import defpackage.aevf;
import defpackage.aevg;
import defpackage.afba;
import defpackage.ast;
import defpackage.asv;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class HideViewOnScrollBehavior extends ast {
    public AccessibilityManager b;
    public AccessibilityManager.TouchExplorationStateChangeListener c;
    public int d;
    public ViewPropertyAnimator e;
    private aevg f;
    private final LinkedHashSet g;
    private int h;
    private int i;
    private TimeInterpolator j;
    private TimeInterpolator k;
    private int l;
    private int m;
    private int n;

    public HideViewOnScrollBehavior() {
        this.g = new LinkedHashSet();
        this.l = 0;
        this.d = 2;
        this.m = 0;
        this.n = 0;
    }

    private final void s(View view, int i, long j, TimeInterpolator timeInterpolator) {
        this.e = this.f.c(view, i).setInterpolator(timeInterpolator).setDuration(j).setListener(new aeve(this, view));
    }

    private final void t(int i) {
        aevg aevbVar;
        aevg aevgVar = this.f;
        if (aevgVar == null || aevgVar.b() != i) {
            if (i != 0) {
                aevbVar = i != 1 ? new aeva() : new aeuz();
            } else {
                aevbVar = new aevb();
            }
            this.f = aevbVar;
        }
    }

    private final void u(View view, int i) {
        this.d = i;
        if (i == 1) {
            if (view.hasFocus()) {
                view.clearFocus();
            }
            if (view.getImportantForAccessibility() != 4) {
                this.m = view.getImportantForAccessibility();
            }
            if (view.getVisibility() != 4) {
                this.n = view.getVisibility();
            }
            view.setImportantForAccessibility(4);
        } else {
            if (view.getImportantForAccessibility() == 4) {
                view.setImportantForAccessibility(this.m);
            }
            if (view.getVisibility() == 4) {
                view.setVisibility(this.n);
            }
        }
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            ((aevf) it.next()).a();
        }
    }

    @Override // defpackage.ast
    public final boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
        AccessibilityManager accessibilityManager = this.b;
        if (accessibilityManager == null) {
            accessibilityManager = (AccessibilityManager) view.getContext().getSystemService(AccessibilityManager.class);
            this.b = accessibilityManager;
        }
        int i2 = 0;
        if (accessibilityManager != null && this.c == null) {
            aevc aevcVar = new aevc(this, view, i2);
            this.c = aevcVar;
            this.b.addTouchExplorationStateChangeListener(aevcVar);
            view.addOnAttachStateChangeListener(new aevd(this, 0));
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i3 = ((asv) view.getLayoutParams()).c;
        if (i3 == 80 || i3 == 81) {
            t(1);
        } else {
            int absoluteGravity = Gravity.getAbsoluteGravity(i3, i);
            int i4 = 2;
            if (absoluteGravity != 3 && absoluteGravity != 19) {
                i4 = 0;
            }
            t(i4);
        }
        this.l = this.f.a(view, marginLayoutParams);
        this.h = afba.r(view.getContext(), R.attr.motionDurationLong2, 225);
        this.i = afba.r(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.j = afba.y(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, aetz.d);
        this.k = afba.y(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, aetz.c);
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
                u(view, 1);
                s(view, this.l, this.i, this.k);
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
            u(view, 2);
            ViewPropertyAnimator viewPropertyAnimator = this.e;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            this.f.d();
            s(view, 0, this.h, this.j);
        }
    }

    public HideViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.g = new LinkedHashSet();
        this.l = 0;
        this.d = 2;
        this.m = 0;
        this.n = 0;
    }
}
