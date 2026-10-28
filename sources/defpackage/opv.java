package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.car.app.model.Alert;
import app.rive.semantics.SemanticState;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public abstract class opv extends axx {
    private static final Rect a = new Rect(Alert.DURATION_SHOW_INDEFINITELY, Alert.DURATION_SHOW_INDEFINITELY, Integer.MIN_VALUE, Integer.MIN_VALUE);
    public final AccessibilityManager d;
    private final View j;
    private opu k;
    private final Rect b = new Rect();
    private final Rect c = new Rect();
    private final Rect h = new Rect();
    private final int[] i = new int[2];
    int e = Integer.MIN_VALUE;
    int f = Integer.MIN_VALUE;
    public int g = Integer.MIN_VALUE;

    public opv(View view) {
        this.j = view;
        this.d = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    private final bbz a(int i) {
        bbz bbzVarB = bbz.b();
        bbzVarB.B(true);
        bbzVarB.C(true);
        bbzVarB.v("android.view.View");
        Rect rect = a;
        bbzVarB.q(rect);
        bbzVarB.r(rect);
        e(i, bbzVarB);
        Rect rect2 = this.c;
        bbzVarB.m(rect2);
        Rect rect3 = this.b;
        bbzVarB.n(rect3);
        if (rect2.equals(rect) && rect3.equals(rect)) {
            throw new agfz("Callbacks must set parent bounds or screen bounds in populateNodeForVirtualViewId()");
        }
        List listI = bbzVarB.i();
        if (listI.contains(bby.c)) {
            throw new agfz("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if (listI.contains(bby.d)) {
            throw new agfz("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        View view = this.j;
        bbzVarB.H(view.getContext().getPackageName());
        bbzVarB.M(view, i);
        if (this.e == i) {
            bbzVarB.o(true);
            bbzVarB.j(SemanticState.Focused);
        } else {
            bbzVarB.o(false);
            bbzVarB.j(64);
        }
        if (bbzVarB.U()) {
            bbzVarB.k(bby.h);
        }
        boolean z = this.f == i;
        if (z) {
            bbzVarB.j(2);
        } else if (bbzVarB.U()) {
            bbzVarB.j(1);
        }
        bbzVarB.D(z);
        int[] iArr = this.i;
        view.getLocationOnScreen(iArr);
        if (rect3.equals(rect)) {
            bbzVarB.q(rect2);
            Rect rect4 = new Rect();
            rect4.set(rect2);
            if (bbzVarB.b != -1) {
                bbz bbzVarB2 = bbz.b();
                Rect rect5 = new Rect();
                for (int i2 = bbzVarB.b; i2 != -1; i2 = bbzVarB2.b) {
                    bbzVarB2.J(view, -1);
                    bbzVarB2.q(rect);
                    e(i2, bbzVarB2);
                    bbzVarB2.m(rect5);
                    rect4.offset(rect5.left, rect5.top);
                }
            }
            view.getLocationOnScreen(iArr);
            rect4.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
            bbzVarB.r(rect4);
            bbzVarB.n(rect3);
        }
        Rect rect6 = this.h;
        if (view.getLocalVisibleRect(rect6)) {
            rect6.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
            if (rect3.intersect(rect6)) {
                bbzVarB.r(rect3);
                if (rect3 != null && !rect3.isEmpty() && view.getWindowVisibility() == 0) {
                    Object parent = view.getParent();
                    while (parent instanceof View) {
                        View view2 = (View) parent;
                        if (view2.getAlpha() > 0.0f && view2.getVisibility() == 0) {
                            parent = view2.getParent();
                        }
                    }
                    if (parent != null) {
                        bbzVarB.R(true);
                    }
                }
            }
        }
        return bbzVarB;
    }

    private final boolean b(int i) {
        if (this.e != i) {
            return false;
        }
        this.e = Integer.MIN_VALUE;
        this.j.invalidate();
        l(i, 65536);
        return true;
    }

    protected void c(int i, AccessibilityEvent accessibilityEvent) {
        throw null;
    }

    protected void d(bbz bbzVar) {
        throw null;
    }

    protected abstract void e(int i, bbz bbzVar);

    protected abstract boolean f(int i, int i2);

    @Override // defpackage.axx
    public final bcc getAccessibilityNodeProvider(View view) {
        opu opuVar = this.k;
        if (opuVar != null) {
            return opuVar;
        }
        opu opuVar2 = new opu(this);
        this.k = opuVar2;
        return opuVar2;
    }

    final bbz h(int i) {
        if (i != -1) {
            return a(i);
        }
        View view = this.j;
        bbz bbzVarC = bbz.c(view);
        bac.k(view, bbzVarC);
        return bbzVarC;
    }

    public final void i(int i) {
        int i2 = this.g;
        if (i2 != i) {
            this.g = i;
            l(i, SemanticState.Focused);
            l(i2, SemanticState.Hidden);
        }
    }

    public final boolean j(int i) {
        if (this.f != i) {
            return false;
        }
        this.f = Integer.MIN_VALUE;
        l(i, 8);
        return true;
    }

    protected final boolean k(int i, int i2, Bundle bundle) {
        int i3;
        int i4;
        if (i == -1) {
            return this.j.performAccessibilityAction(i2, bundle);
        }
        if (i2 == 1) {
            View view = this.j;
            if ((view.isFocused() || view.requestFocus()) && (i3 = this.f) != i) {
                if (i3 != Integer.MIN_VALUE) {
                    j(i3);
                }
                if (i != Integer.MIN_VALUE) {
                    this.f = i;
                    l(i, 8);
                    return true;
                }
            }
        } else {
            if (i2 == 2) {
                return j(i);
            }
            if (i2 != 64) {
                if (i2 == 128) {
                    return b(i);
                }
                if (i2 != 16908342) {
                    return f(i, i2);
                }
                bbz bbzVarA = a(i);
                Rect rect = new Rect();
                bbzVarA.m(rect);
                return this.j.requestRectangleOnScreen(rect);
            }
            AccessibilityManager accessibilityManager = this.d;
            if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled() && (i4 = this.e) != i) {
                if (i4 != Integer.MIN_VALUE) {
                    b(i4);
                }
                this.e = i;
                this.j.invalidate();
                l(i, 32768);
                return true;
            }
        }
        return false;
    }

    public final void l(int i, int i2) {
        View view;
        ViewParent parent;
        AccessibilityEvent accessibilityEventObtain;
        if (i == Integer.MIN_VALUE || !this.d.isEnabled() || (parent = (view = this.j).getParent()) == null) {
            return;
        }
        if (i != -1) {
            accessibilityEventObtain = AccessibilityEvent.obtain(i2);
            bbz bbzVarH = h(i);
            accessibilityEventObtain.getText().add(bbzVarH.g());
            accessibilityEventObtain.setContentDescription(bbzVarH.f());
            accessibilityEventObtain.setScrollable(bbzVarH.W());
            accessibilityEventObtain.setPassword(bbzVarH.V());
            accessibilityEventObtain.setEnabled(bbzVarH.T());
            accessibilityEventObtain.setChecked(bbzVarH.S());
            c(i, accessibilityEventObtain);
            accessibilityEventObtain.setClassName(bbzVarH.e());
            accessibilityEventObtain.setSource(view, i);
            accessibilityEventObtain.setPackageName(view.getContext().getPackageName());
        } else {
            accessibilityEventObtain = AccessibilityEvent.obtain(i2);
            view.onInitializeAccessibilityEvent(accessibilityEventObtain);
        }
        parent.requestSendAccessibilityEvent(view, accessibilityEventObtain);
    }

    @Override // defpackage.axx
    public final void onInitializeAccessibilityNodeInfo(View view, bbz bbzVar) {
        super.onInitializeAccessibilityNodeInfo(view, bbzVar);
        d(bbzVar);
    }
}
