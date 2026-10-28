package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.widget.NestedScrollView;
import com.google.android.libraries.multiplatform.elements.FlagServices;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class ovw extends NestedScrollView {
    private axx h;
    private ovx i;

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        ovx ovxVar = this.i;
        if (ovxVar != null) {
            ovxVar.a(this);
        }
    }

    @Override // androidx.core.widget.NestedScrollView
    public final void j(int i) {
        super.j(i);
        ovx ovxVar = this.i;
        if (ovxVar != null) {
            ovxVar.f();
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        axx axxVar = this.h;
        if (axxVar == null || bac.c(this) == axxVar) {
            return;
        }
        axxVar.onInitializeAccessibilityNodeInfo(this, new bbz(accessibilityNodeInfo));
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    protected final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        ovx ovxVar = this.i;
        if (ovxVar != null) {
            ovxVar.d(this);
        }
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zOnTouchEvent;
        if (Memory.peekByte(FlagServices.b().c + 102) != 0) {
            ovx ovxVar = this.i;
            if (ovxVar != null) {
                ovxVar.c(motionEvent);
            }
            zOnTouchEvent = super.onTouchEvent(motionEvent);
            ovx ovxVar2 = this.i;
            if (ovxVar2 != null) {
                ovxVar2.b(this, motionEvent);
            }
        } else {
            zOnTouchEvent = super.onTouchEvent(motionEvent);
            ovx ovxVar3 = this.i;
            if (ovxVar3 != null) {
                ovxVar3.e(this, motionEvent);
            }
        }
        return zOnTouchEvent;
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        if (super.performAccessibilityAction(i, bundle)) {
            return true;
        }
        axx axxVar = this.h;
        if (axxVar == null || bac.c(this) == axxVar) {
            return false;
        }
        return axxVar.performAccessibilityAction(this, i, bundle);
    }

    @Override // android.view.View
    public final boolean requestRectangleOnScreen(Rect rect, boolean z) {
        return getChildCount() > 0 ? requestChildRectangleOnScreen(getChildAt(0), rect, z) : super.requestRectangleOnScreen(rect, z);
    }

    @Override // android.view.View
    public final void setAccessibilityDelegate(View.AccessibilityDelegate accessibilityDelegate) {
        if (this.h == null) {
            this.h = bac.c(this);
        }
        super.setAccessibilityDelegate(accessibilityDelegate);
    }

    public final void y(owb owbVar) {
        ovx ovxVar;
        if (owbVar == null) {
            ovx ovxVar2 = this.i;
            if (ovxVar2 != null) {
                ovxVar2.a = null;
                this.i = null;
                return;
            }
            return;
        }
        if (Memory.peekByte(FlagServices.b().c + 102) == 0 || (ovxVar = this.i) == null) {
            ovxVar = new ovx();
            this.i = ovxVar;
        }
        ovxVar.a = owbVar;
    }
}
