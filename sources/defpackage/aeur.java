package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class aeur extends aeuu {
    private Runnable b;
    private boolean c;
    OverScroller d;
    private int e;
    private int f;
    private int g;
    private VelocityTracker h;

    public aeur() {
        this.e = -1;
        this.g = -1;
    }

    public final int A(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        return u(coordinatorLayout, view, t() - i, i2, i3);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0044  */
    /* JADX WARN: Code duplicated, block: B:23:0x005e  */
    /* JADX WARN: Code duplicated, block: B:26:0x0063  */
    /* JADX WARN: Code duplicated, block: B:28:0x006f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0089  */
    @Override // defpackage.ast
    public final boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        int y;
        boolean z;
        OverScroller overScroller;
        int iFindPointerIndex;
        if (this.g < 0) {
            this.g = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.c) {
            int i = this.e;
            if (i != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i)) != -1) {
                int y2 = (int) motionEvent.getY(iFindPointerIndex);
                if (Math.abs(y2 - this.f) > this.g) {
                    this.f = y2;
                    return true;
                }
                if (motionEvent.getActionMasked() == 0) {
                    this.e = -1;
                    int x = (int) motionEvent.getX();
                    y = (int) motionEvent.getY();
                    if (y(view)) {
                        z = false;
                    } else {
                        z = false;
                    }
                    this.c = z;
                    if (z) {
                        this.f = y;
                        this.e = motionEvent.getPointerId(0);
                        if (this.h == null) {
                            this.h = VelocityTracker.obtain();
                        }
                        overScroller = this.d;
                        if (overScroller != null) {
                            this.d.abortAnimation();
                            return true;
                        }
                    }
                }
                velocityTracker = this.h;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent);
                }
            }
        } else {
            if (motionEvent.getActionMasked() == 0) {
                this.e = -1;
                int x2 = (int) motionEvent.getX();
                y = (int) motionEvent.getY();
                if (y(view) || !coordinatorLayout.l(view, x2, y)) {
                    z = false;
                } else {
                    z = true;
                }
                this.c = z;
                if (z) {
                    this.f = y;
                    this.e = motionEvent.getPointerId(0);
                    if (this.h == null) {
                        this.h = VelocityTracker.obtain();
                    }
                    overScroller = this.d;
                    if (overScroller != null && !overScroller.isFinished()) {
                        this.d.abortAnimation();
                        return true;
                    }
                }
            }
            velocityTracker = this.h;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:41:0x00cd A[ADDED_TO_REGION] */
    @Override // defpackage.ast
    public final boolean onTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z;
        VelocityTracker velocityTracker;
        VelocityTracker velocityTracker2;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.e);
                if (iFindPointerIndex == -1) {
                    return false;
                }
                int y = (int) motionEvent.getY(iFindPointerIndex);
                int i = this.f - y;
                this.f = y;
                A(coordinatorLayout, view, i, r(view), 0);
            } else if (actionMasked != 3) {
                if (actionMasked == 6) {
                    int i2 = motionEvent.getActionIndex() == 0 ? 1 : 0;
                    this.e = motionEvent.getPointerId(i2);
                    this.f = (int) (motionEvent.getY(i2) + 0.5f);
                }
            }
            z = false;
            velocityTracker2 = this.h;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
            }
            return !this.c || z;
        }
        VelocityTracker velocityTracker3 = this.h;
        if (velocityTracker3 != null) {
            velocityTracker3.addMovement(motionEvent);
            this.h.computeCurrentVelocity(1000);
            float yVelocity = this.h.getYVelocity(this.e);
            int i3 = -s(view);
            Runnable runnable = this.b;
            if (runnable != null) {
                view.removeCallbacks(runnable);
                this.b = null;
            }
            OverScroller overScroller = this.d;
            if (overScroller == null) {
                overScroller = new OverScroller(view.getContext());
                this.d = overScroller;
            }
            overScroller.fling(0, getTopAndBottomOffset(), 0, Math.round(yVelocity), 0, 0, i3, 0);
            if (this.d.computeScrollOffset()) {
                aeuq aeuqVar = new aeuq(this, coordinatorLayout, view);
                this.b = aeuqVar;
                view.postOnAnimation(aeuqVar);
            } else {
                w(coordinatorLayout, view);
            }
            z = true;
        }
        this.c = false;
        this.e = -1;
        velocityTracker = this.h;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.h = null;
        }
        velocityTracker2 = this.h;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        if (this.c) {
        }
        z = false;
        this.c = false;
        this.e = -1;
        velocityTracker = this.h;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.h = null;
        }
        velocityTracker2 = this.h;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        if (this.c) {
        }
    }

    public int r(View view) {
        throw null;
    }

    public int s(View view) {
        throw null;
    }

    public int t() {
        throw null;
    }

    public int u(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        throw null;
    }

    public void w(CoordinatorLayout coordinatorLayout, View view) {
        throw null;
    }

    public boolean y(View view) {
        throw null;
    }

    public aeur(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = -1;
        this.g = -1;
    }
}
