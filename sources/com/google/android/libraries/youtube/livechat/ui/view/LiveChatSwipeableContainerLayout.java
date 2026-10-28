package com.google.android.libraries.youtube.livechat.ui.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import defpackage.aedd;
import defpackage.pr;
import defpackage.ttn;
import defpackage.wvr;
import defpackage.xcq;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class LiveChatSwipeableContainerLayout extends FrameLayout {
    public final OverScroller a;
    public boolean b;
    public boolean c;
    public int d;
    public int e;
    public xcq f;
    private final int g;
    private final ttn h;
    private int i;
    private int j;
    private boolean k;
    private ValueAnimator l;
    private Runnable m;

    public LiveChatSwipeableContainerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.g = ViewConfiguration.get(context).getScaledTouchSlop();
        this.h = new ttn(context, 200, 1, 20);
        this.a = new OverScroller(context);
    }

    private final int f(MotionEvent motionEvent) {
        return (int) (this.b ? motionEvent.getY() : motionEvent.getX());
    }

    private final boolean g(float f) {
        return getChildCount() > 0 && f >= ((float) (-c())) && f <= ((float) (a() - c()));
    }

    public final int a() {
        if (getChildCount() == 0) {
            return 0;
        }
        boolean z = this.b;
        View childAt = getChildAt(0);
        return z ? childAt.getHeight() : childAt.getWidth();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        d(0);
    }

    public final int b() {
        return this.b ? getHeight() : getWidth();
    }

    public final int c() {
        return this.b ? getScrollY() : getScrollX();
    }

    public final void d(int i) {
        if (this.b) {
            setScrollY(i);
        } else {
            setScrollX(i);
        }
    }

    public final void e(boolean z) {
        this.b = true;
        this.c = z;
    }

    @Override // android.view.ViewGroup
    protected final void measureChild(View view, int i, int i2) {
        if (this.b) {
            view.measure(i, 0);
        } else {
            view.measure(0, i2);
        }
    }

    @Override // android.view.ViewGroup
    protected final void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.getClass();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        view.measure(getChildMeasureSpec(i, marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004b  */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 2 && this.k) {
            return true;
        }
        if (!g(f(motionEvent))) {
            if (c() < 0) {
                d(0);
            }
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            if (this.b) {
                motionEvent.getRawY();
            } else {
                motionEvent.getRawX();
            }
            ttn ttnVar = this.h;
            ttnVar.d(motionEvent);
            ttnVar.b(motionEvent);
            this.i = f(motionEvent);
        } else if (actionMasked == 1) {
            this.h.b(motionEvent);
            this.k = false;
        } else if (actionMasked == 2) {
            this.h.b(motionEvent);
            int iF = f(motionEvent);
            if (Math.abs(iF - this.i) > this.g) {
                this.k = true;
                this.i = iF;
            }
        } else if (actionMasked == 3) {
            this.h.b(motionEvent);
            this.k = false;
        }
        return this.k;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.b) {
            if (View.MeasureSpec.getMode(i2) == 0 || getChildCount() <= 0) {
                return;
            }
            View childAt = getChildAt(0);
            int measuredHeight = getMeasuredHeight();
            if (childAt.getMeasuredHeight() < measuredHeight) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                layoutParams.getClass();
                childAt.measure(getChildMeasureSpec(i, 0, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
                return;
            }
            return;
        }
        if (View.MeasureSpec.getMode(i) == 0 || getChildCount() <= 0) {
            return;
        }
        View childAt2 = getChildAt(0);
        int measuredWidth = getMeasuredWidth();
        if (childAt2.getMeasuredWidth() < measuredWidth) {
            ViewGroup.LayoutParams layoutParams2 = childAt2.getLayoutParams();
            layoutParams2.getClass();
            childAt2.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), getChildMeasureSpec(i2, 0, layoutParams2.height));
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x007f  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:65:0x0103  */
    /* JADX WARN: Code duplicated, block: B:69:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        xcq xcqVar;
        ValueAnimator valueAnimator;
        int i;
        if (!g(f(motionEvent))) {
            if (c() >= 0) {
                return false;
            }
            d(0);
            return false;
        }
        ttn ttnVar = this.h;
        ttnVar.b(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.i = f(motionEvent);
        } else if (actionMasked == 1) {
            xcqVar = this.f;
            if (xcqVar == null && this.k) {
                if (Math.abs(c()) < b() * 0.5f) {
                    int iE = ttnVar.e(motionEvent, true != this.b ? 2 : 1);
                    boolean z = iE != 2 && iE == 1 && this.j < 0;
                    if (Math.abs(this.j) <= this.g || !z || !this.c) {
                        valueAnimator = this.l;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        this.l = null;
                        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(c(), 0);
                        this.l = valueAnimatorOfInt;
                        valueAnimatorOfInt.setDuration(100L);
                        this.l.setInterpolator(aedd.a);
                        this.l.addUpdateListener(new pr(this, 20, null));
                        this.l.start();
                    }
                }
                xcqVar.a();
            } else {
                valueAnimator = this.l;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                this.l = null;
                ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(c(), 0);
                this.l = valueAnimatorOfInt2;
                valueAnimatorOfInt2.setDuration(100L);
                this.l.setInterpolator(aedd.a);
                this.l.addUpdateListener(new pr(this, 20, null));
                this.l.start();
            }
            ttnVar.c();
            this.j = 0;
            if (this.k) {
                return false;
            }
            this.k = false;
        } else if (actionMasked == 2) {
            int iF = f(motionEvent);
            this.e = iF;
            int i2 = this.i - iF;
            if (!this.k) {
                int iAbs = Math.abs(i2);
                int i3 = this.g;
                if (iAbs > i3) {
                    this.k = true;
                    i2 = i2 > 0 ? i2 - i3 : i2 + i3;
                }
            }
            int i4 = i2;
            if (this.k) {
                this.i = iF;
                boolean z2 = this.b;
                OverScroller overScroller = this.a;
                if (z2) {
                    i = i4;
                    overScroller.startScroll(0, iF, 0, i, 0);
                } else {
                    overScroller.startScroll(iF, 0, i4, 0, 0);
                    i = i4;
                }
                Runnable wvrVar = this.m;
                if (wvrVar == null) {
                    wvrVar = new wvr(this, 19, null);
                    this.m = wvrVar;
                }
                removeCallbacks(wvrVar);
                post(wvrVar);
            } else {
                i = i4;
            }
            this.j = i;
        } else if (actionMasked == 3) {
            xcqVar = this.f;
            if (xcqVar == null) {
                valueAnimator = this.l;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                this.l = null;
                ValueAnimator valueAnimatorOfInt3 = ValueAnimator.ofInt(c(), 0);
                this.l = valueAnimatorOfInt3;
                valueAnimatorOfInt3.setDuration(100L);
                this.l.setInterpolator(aedd.a);
                this.l.addUpdateListener(new pr(this, 20, null));
                this.l.start();
            } else {
                valueAnimator = this.l;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                this.l = null;
                ValueAnimator valueAnimatorOfInt4 = ValueAnimator.ofInt(c(), 0);
                this.l = valueAnimatorOfInt4;
                valueAnimatorOfInt4.setDuration(100L);
                this.l.setInterpolator(aedd.a);
                this.l.addUpdateListener(new pr(this, 20, null));
                this.l.start();
            }
            ttnVar.c();
            this.j = 0;
            if (this.k) {
                return false;
            }
            this.k = false;
        }
        return true;
    }

    public LiveChatSwipeableContainerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LiveChatSwipeableContainerLayout(Context context) {
        this(context, null);
    }
}
