package com.google.android.libraries.youtube.common.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import defpackage.dty;
import defpackage.tvd;
import defpackage.vhb;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class RtlAwareViewPager extends tvd {
    public final List i;
    private final SparseArray j;
    private final MotionEvent.PointerProperties[] k;
    private final MotionEvent.PointerCoords[] l;
    private float m;

    public RtlAwareViewPager(Context context) {
        super(context);
        this.i = new CopyOnWriteArrayList();
        this.j = new SparseArray();
        this.k = new MotionEvent.PointerProperties[10];
        this.l = new MotionEvent.PointerCoords[10];
        for (int i = 0; i < 10; i++) {
            this.k[i] = new MotionEvent.PointerProperties();
            this.l[i] = new MotionEvent.PointerCoords();
        }
        this.m = 1.0f;
        z();
    }

    private final MotionEvent y(MotionEvent motionEvent) {
        MotionEvent.PointerProperties[] pointerPropertiesArr;
        MotionEvent.PointerCoords[] pointerCoordsArr;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            SparseArray sparseArray = this.j;
            sparseArray.clear();
            sparseArray.put(motionEvent.getPointerId(0), Float.valueOf(motionEvent.getY(0)));
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.j.clear();
        } else if (actionMasked == 5) {
            int actionIndex = motionEvent.getActionIndex();
            this.j.put(motionEvent.getPointerId(actionIndex), Float.valueOf(motionEvent.getY(actionIndex)));
        } else if (actionMasked == 6) {
            this.j.remove(motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        if (actionMasked != 2) {
            return motionEvent;
        }
        int pointerCount = motionEvent.getPointerCount();
        if (pointerCount <= 10) {
            pointerPropertiesArr = this.k;
            pointerCoordsArr = this.l;
        } else {
            pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
            pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
            for (int i = 0; i < pointerCount; i++) {
                pointerPropertiesArr[i] = new MotionEvent.PointerProperties();
                pointerCoordsArr[i] = new MotionEvent.PointerCoords();
            }
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr2 = pointerPropertiesArr;
        MotionEvent.PointerCoords[] pointerCoordsArr2 = pointerCoordsArr;
        for (int i2 = 0; i2 < pointerCount; i2++) {
            motionEvent.getPointerProperties(i2, pointerPropertiesArr2[i2]);
            motionEvent.getPointerCoords(i2, pointerCoordsArr2[i2]);
            int i3 = pointerPropertiesArr2[i2].id;
            SparseArray sparseArray2 = this.j;
            int iIndexOfKey = sparseArray2.indexOfKey(i3);
            float fFloatValue = iIndexOfKey >= 0 ? ((Float) sparseArray2.valueAt(iIndexOfKey)).floatValue() : pointerCoordsArr2[i2].y;
            pointerCoordsArr2[i2].y = fFloatValue + ((pointerCoordsArr2[i2].y - fFloatValue) * this.m);
        }
        return MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), motionEvent.getAction(), pointerCount, pointerPropertiesArr2, pointerCoordsArr2, motionEvent.getMetaState(), motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
    }

    private final void z() {
        this.g = new vhb(this, 1);
    }

    @Override // defpackage.duc
    public final int a() {
        return v(this.c);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        if (indexOfChild(view) == -1) {
            super.addView(view, v(i));
        }
    }

    @Override // defpackage.duc
    public final void e(dty dtyVar) {
        this.i.add(dtyVar);
    }

    @Override // defpackage.duc
    public final void j(dty dtyVar) {
        this.i.remove(dtyVar);
    }

    @Override // defpackage.duc
    public final void l(int i) {
        super.l(v(i));
    }

    @Override // defpackage.duc
    public final void m(int i, boolean z) {
        super.m(v(i), true);
    }

    @Override // defpackage.tvd, defpackage.duc, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.m == 1.0f) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        MotionEvent motionEventY = y(motionEvent);
        try {
            boolean zOnInterceptTouchEvent = super.onInterceptTouchEvent(motionEventY);
        } finally {
            if (motionEventY != motionEvent) {
                motionEventY.recycle();
            }
        }
    }

    @Override // defpackage.tvd, defpackage.duc, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.m == 1.0f) {
            return super.onTouchEvent(motionEvent);
        }
        MotionEvent motionEventY = y(motionEvent);
        try {
            boolean zOnTouchEvent = super.onTouchEvent(motionEventY);
        } finally {
            if (motionEventY != motionEvent) {
                motionEventY.recycle();
            }
        }
    }

    public final int v(int i) {
        return getResources().getConfiguration().getLayoutDirection() == 1 ? (this.b.g() - i) - 1 : i;
    }

    @Override // defpackage.duc, android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (indexOfChild(view) == -1) {
            super.addView(view, v(i), layoutParams);
        }
    }

    public RtlAwareViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.i = new CopyOnWriteArrayList();
        this.j = new SparseArray();
        this.k = new MotionEvent.PointerProperties[10];
        this.l = new MotionEvent.PointerCoords[10];
        for (int i = 0; i < 10; i++) {
            this.k[i] = new MotionEvent.PointerProperties();
            this.l[i] = new MotionEvent.PointerCoords();
        }
        this.m = 1.0f;
        z();
    }
}
