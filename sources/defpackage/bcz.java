package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ScrollView;
import androidx.core.widget.NestedScrollView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class bcz extends axx {
    @Override // defpackage.axx
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        accessibilityEvent.setClassName(ScrollView.class.getName());
        accessibilityEvent.setScrollable(nestedScrollView.c() > 0);
        accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
        accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
        accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
        accessibilityEvent.setMaxScrollY(nestedScrollView.c());
    }

    @Override // defpackage.axx
    public final void onInitializeAccessibilityNodeInfo(View view, bbz bbzVar) {
        int iC;
        super.onInitializeAccessibilityNodeInfo(view, bbzVar);
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        bbzVar.v(ScrollView.class.getName());
        if (!nestedScrollView.isEnabled() || (iC = nestedScrollView.c()) <= 0) {
            return;
        }
        bbzVar.L(true);
        if (nestedScrollView.getScrollY() > 0) {
            bbzVar.k(bby.f);
            bbzVar.k(bby.j);
        }
        if (nestedScrollView.getScrollY() < iC) {
            bbzVar.k(bby.e);
            bbzVar.k(bby.k);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005d  */
    /* JADX WARN: Code duplicated, block: B:25:0x007a  */
    @Override // defpackage.axx
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        int iMin;
        if (super.performAccessibilityAction(view, i, bundle)) {
            return true;
        }
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        if (nestedScrollView.isEnabled()) {
            int height = nestedScrollView.getHeight();
            Rect rect = new Rect();
            if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                height = rect.height();
            }
            if (i == 4096) {
                iMin = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.c());
                if (iMin != nestedScrollView.getScrollY()) {
                    nestedScrollView.gP(0, iMin, true);
                    return true;
                }
            } else if (i == 8192 || i == 16908344) {
                int iMax = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                if (iMax != nestedScrollView.getScrollY()) {
                    nestedScrollView.gP(0, iMax, true);
                    return true;
                }
            } else if (i == 16908346) {
                iMin = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.c());
                if (iMin != nestedScrollView.getScrollY()) {
                    nestedScrollView.gP(0, iMin, true);
                    return true;
                }
            }
        }
        return false;
    }
}
