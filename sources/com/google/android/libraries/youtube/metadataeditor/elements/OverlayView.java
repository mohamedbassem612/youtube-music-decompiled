package com.google.android.libraries.youtube.metadataeditor.elements;

import android.content.Context;
import android.graphics.Point;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import defpackage.xxj;
import defpackage.zpr;
import defpackage.zpu;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class OverlayView extends View {
    public View a;
    public xxj b;
    private final Point c;

    public OverlayView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = new Point();
        this.a = null;
        this.b = null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            this.c.set((int) motionEvent.getX(), (int) motionEvent.getY());
        } else if (motionEvent.getActionMasked() == 1) {
            Point point = new Point((int) motionEvent.getX(), (int) motionEvent.getY());
            Point point2 = this.c;
            if (Math.hypot(point2.x - point.x, point2.y - point.y) <= 10.0d) {
                performClick();
            }
        }
        View view = this.a;
        if (view != null) {
            view.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.view.View
    public final boolean performClick() {
        zpu zpuVar;
        int iC;
        xxj xxjVar = this.b;
        if (xxjVar != null) {
            float f = this.c.y;
            zpr zprVar = (zpr) xxjVar.a;
            RecyclerView recyclerView = zprVar.k;
            if (recyclerView != null && (zpuVar = zprVar.f) != null) {
                int i = 0;
                while (true) {
                    if (i >= recyclerView.getChildCount()) {
                        iC = -1;
                        break;
                    }
                    View childAt = recyclerView.getChildAt(i);
                    float top = childAt.getTop();
                    float height = childAt.getHeight();
                    if (top <= f && f < top + height) {
                        iC = recyclerView.c(childAt);
                        break;
                    }
                    i++;
                }
                if (zpuVar.a(iC) != null) {
                    zprVar.l(zpuVar.a(iC), zpuVar.h());
                    zpuVar.d(iC);
                }
            }
        }
        return super.performClick();
    }

    public OverlayView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public OverlayView(Context context) {
        this(context, null);
    }
}
