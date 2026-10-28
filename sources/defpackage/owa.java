package defpackage;

import android.view.MotionEvent;
import android.view.View;
import com.google.android.libraries.multiplatform.elements.NodeTreeProcessor;
import com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class owa extends oyk {
    public boolean a;
    public int b;
    public int c;

    public owa(NodeTreeProcessor nodeTreeProcessor) {
        super(nodeTreeProcessor);
        this.a = false;
        this.b = 0;
        this.c = 0;
    }

    @Override // defpackage.oyk, com.google.android.libraries.multiplatform.elements.NodeViewInternalInterface
    public final boolean ab(MotionEvent motionEvent) {
        Object parent = getParent();
        if (parent instanceof View) {
            View view = (View) parent;
            motionEvent.offsetLocation(view.getScrollX(), view.getScrollY());
        }
        return super.ab(motionEvent);
    }

    @Override // defpackage.oyk, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int scrollY;
        int scrollX;
        Object parent = getParent();
        int i = 0;
        if (parent instanceof View) {
            View view = (View) parent;
            scrollX = view.getScrollX();
            scrollY = view.getScrollY();
        } else {
            scrollY = 0;
            scrollX = 0;
        }
        if (scrollX != 0) {
            i = scrollX;
        } else if (scrollY == 0) {
            return super.dispatchTouchEvent(motionEvent);
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.offsetLocation(-i, -scrollY);
        boolean zDispatchTouchEvent = super.dispatchTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
        return zDispatchTouchEvent;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        float fMax;
        if (this.a) {
            super.onMeasure(i, i2);
            setMeasuredDimension(this.b, this.c);
            return;
        }
        super.onMeasure(i, i2);
        ArrayList<PaintUnit> arrayList = this.D;
        float fMax2 = 0.0f;
        if (arrayList != null) {
            float fMax3 = 0.0f;
            for (PaintUnit paintUnit : arrayList) {
                fMax3 = Math.max(fMax3, paintUnit.q().right);
                fMax2 = Math.max(fMax2, paintUnit.q().bottom);
            }
            fMax = fMax2;
            fMax2 = fMax3;
        } else {
            fMax = 0.0f;
        }
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            fMax2 = Math.max(fMax2, childAt.getRight());
            fMax = Math.max(fMax, childAt.getBottom());
        }
        setMeasuredDimension(resolveSize((int) Math.max(fMax2, getMinimumWidth()), i), resolveSize((int) Math.max(fMax, getMinimumHeight()), i2));
    }
}
