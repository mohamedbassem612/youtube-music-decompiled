package com.google.android.libraries.youtube.common.ui;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.Scroller;
import defpackage.ttv;
import defpackage.ttz;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class TopPeekingScrollView extends ttz {
    private static final Rect n = new Rect();
    public int k;
    public View l;
    public View m;
    private float o;
    private int p;
    private int q;

    public TopPeekingScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.i = context.obtainStyledAttributes(attributeSet, ttv.g).getBoolean(0, false);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("TopPeekingScrollView can host only one direct child");
        }
        super.addView(view);
    }

    public final void f(int i, int i2, boolean z) {
        this.k = i;
        this.p = i2;
        if (z) {
            b(0, i2);
            a(getScrollY() != 0 ? this.p : 0);
        }
        requestLayout();
    }

    @Override // defpackage.ttz, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        View view;
        if (super.d(motionEvent) && (getScrollY() < this.p || ((view = this.m) != null && !view.canScrollVertically(-1) && motionEvent.getY() >= this.o))) {
            return true;
        }
        this.o = motionEvent.getY();
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        n.set(i, i2, i3, this.k);
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            int i5 = i3 - i;
            childAt.layout((i5 - childAt.getMeasuredWidth()) / 2, i2 + this.k, ((i5 - childAt.getMeasuredWidth()) / 2) + childAt.getMeasuredWidth(), i4);
        }
        b(0, this.p);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i2);
        int iMax = 0;
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            childAt.measure(i, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
            iMax = Math.max(0, childAt.getMeasuredWidth());
        }
        setMeasuredDimension(iMax, size + this.k);
    }

    @Override // android.view.View
    protected final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        this.q = i2 - i4 > 0 ? 1 : 2;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x007f  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:53:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:60:0x0100 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x0102  */
    /* JADX WARN: Code duplicated, block: B:62:0x0108  */
    /* JADX WARN: Code duplicated, block: B:63:0x010c  */
    /* JADX WARN: Code duplicated, block: B:64:0x010d  */
    @Override // defpackage.ttz, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        float yVelocity;
        int i;
        boolean zPerformClick;
        int i2;
        int i3;
        Scroller scroller;
        int i4;
        if (!this.g) {
            Rect rect = n;
            if (!rect.isEmpty() && this.l != null && rect.contains((int) motionEvent.getX(), ((int) motionEvent.getY()) + getScrollY())) {
                this.l.dispatchTouchEvent(motionEvent);
            }
        }
        int action = motionEvent.getAction();
        if (this.f == null) {
            this.f = VelocityTracker.obtain();
        }
        this.f.addMovement(motionEvent);
        if (!this.g) {
            if (!super.d(motionEvent) && action == 1 && this.h) {
                this.h = false;
                zPerformClick = performClick();
            }
            if (zPerformClick && motionEvent.getActionMasked() == 1 && (i2 = this.q) != 0) {
                if (i2 == 1 || getScrollY() >= this.p) {
                    i3 = this.q;
                    if (i3 == 0) {
                        throw null;
                    }
                    if (i3 == 2 && getScrollY() > 0) {
                        scroller = this.j;
                        if (!scroller.isFinished()) {
                            scroller.abortAnimation();
                        }
                        i4 = this.q;
                        if (i4 != 0) {
                            throw null;
                        }
                        if (i4 == 1) {
                            e(this.p);
                        } else {
                            e(0);
                        }
                    }
                } else {
                    scroller = this.j;
                    if (!scroller.isFinished()) {
                        scroller.abortAnimation();
                    }
                    i4 = this.q;
                    if (i4 != 0) {
                        throw null;
                    }
                    if (i4 == 1) {
                        e(this.p);
                    } else {
                        e(0);
                    }
                }
            }
            return zPerformClick;
        }
        if (action == 1) {
            this.g = false;
            if (action != 3 && getChildCount() > 0) {
                this.f.computeCurrentVelocity(1000, this.c);
                yVelocity = this.f.getYVelocity();
                i = this.d;
                if (yVelocity <= i || yVelocity < (-i)) {
                    float f = -yVelocity;
                    this.e = f;
                    int scrollX = getScrollX();
                    int scrollY = getScrollY();
                    Scroller scroller2 = this.j;
                    int[] iArr = this.b;
                    scroller2.fling(scrollX, scrollY, 0, (int) f, 0, 0, iArr[0], iArr[1]);
                    invalidate();
                }
            }
            velocityTracker = this.f;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f = null;
            }
            this.h = false;
        } else if (action == 2) {
            float[] fArr = this.a;
            float f2 = fArr[1];
            c(motionEvent);
            a(getScrollY() + Math.round(f2 - fArr[1]));
            this.h = false;
        } else if (action == 3) {
            this.g = false;
            if (action != 3) {
                this.f.computeCurrentVelocity(1000, this.c);
                yVelocity = this.f.getYVelocity();
                i = this.d;
                if (yVelocity <= i) {
                    float f3 = -yVelocity;
                    this.e = f3;
                    int scrollX2 = getScrollX();
                    int scrollY2 = getScrollY();
                    Scroller scroller3 = this.j;
                    int[] iArr2 = this.b;
                    scroller3.fling(scrollX2, scrollY2, 0, (int) f3, 0, 0, iArr2[0], iArr2[1]);
                    invalidate();
                } else {
                    float f4 = -yVelocity;
                    this.e = f4;
                    int scrollX3 = getScrollX();
                    int scrollY3 = getScrollY();
                    Scroller scroller4 = this.j;
                    int[] iArr3 = this.b;
                    scroller4.fling(scrollX3, scrollY3, 0, (int) f4, 0, 0, iArr3[0], iArr3[1]);
                    invalidate();
                }
            }
            velocityTracker = this.f;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f = null;
            }
            this.h = false;
        }
        zPerformClick = true;
        if (zPerformClick) {
            if (i2 == 1) {
                i3 = this.q;
                if (i3 == 0) {
                    throw null;
                }
                if (i3 == 2) {
                    scroller = this.j;
                    if (!scroller.isFinished()) {
                        scroller.abortAnimation();
                    }
                    i4 = this.q;
                    if (i4 != 0) {
                        throw null;
                    }
                    if (i4 == 1) {
                        e(this.p);
                    } else {
                        e(0);
                    }
                }
            } else {
                i3 = this.q;
                if (i3 == 0) {
                    throw null;
                }
                if (i3 == 2) {
                    scroller = this.j;
                    if (!scroller.isFinished()) {
                        scroller.abortAnimation();
                    }
                    i4 = this.q;
                    if (i4 != 0) {
                        throw null;
                    }
                    if (i4 == 1) {
                        e(this.p);
                    } else {
                        e(0);
                    }
                }
            }
        }
        return zPerformClick;
    }

    public TopPeekingScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TopPeekingScrollView(Context context) {
        this(context, null);
    }
}
