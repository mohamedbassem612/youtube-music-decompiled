package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.widget.HorizontalScrollView;
import com.google.android.libraries.multiplatform.elements.FlagServices;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class ovv extends HorizontalScrollView {
    private ovx a;

    public final void a(owb owbVar) {
        ovx ovxVar;
        if (owbVar == null) {
            ovx ovxVar2 = this.a;
            if (ovxVar2 != null) {
                ovxVar2.a = null;
                this.a = null;
                return;
            }
            return;
        }
        if (Memory.peekByte(FlagServices.b().c + 102) == 0 || (ovxVar = this.a) == null) {
            ovxVar = new ovx();
            this.a = ovxVar;
        }
        ovxVar.a = owbVar;
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        ovx ovxVar = this.a;
        if (ovxVar != null) {
            ovxVar.a(this);
        }
    }

    @Override // android.widget.HorizontalScrollView
    public final void fling(int i) {
        super.fling(i);
        ovx ovxVar = this.a;
        if (ovxVar != null) {
            ovxVar.f();
        }
    }

    @Override // android.view.View
    protected final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        ovx ovxVar = this.a;
        if (ovxVar != null) {
            ovxVar.d(this);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zOnTouchEvent;
        if (Memory.peekByte(FlagServices.b().c + 102) != 0) {
            ovx ovxVar = this.a;
            if (ovxVar != null) {
                ovxVar.c(motionEvent);
            }
            zOnTouchEvent = super.onTouchEvent(motionEvent);
            ovx ovxVar2 = this.a;
            if (ovxVar2 != null) {
                ovxVar2.b(this, motionEvent);
            }
        } else {
            zOnTouchEvent = super.onTouchEvent(motionEvent);
            ovx ovxVar3 = this.a;
            if (ovxVar3 != null) {
                ovxVar3.e(this, motionEvent);
            }
        }
        return zOnTouchEvent;
    }

    @Override // android.view.View
    public final boolean requestRectangleOnScreen(Rect rect, boolean z) {
        return getChildCount() > 0 ? requestChildRectangleOnScreen(getChildAt(0), rect, z) : super.requestRectangleOnScreen(rect, z);
    }
}
