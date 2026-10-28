package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ttn {
    protected final int a;
    public VelocityTracker b;
    public float c;
    public float d;
    public float e;
    public float f;
    public int g = -1;
    private final int h;
    private final int i;
    private final int j;

    public ttn(Context context, int i, int i2, int i3) {
        if (i < 200) {
            throw new IllegalArgumentException("snapVelocity cannot be less than 200");
        }
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.h = i3;
        if (i2 == 1) {
            this.a = viewConfiguration.getScaledPagingTouchSlop();
        } else {
            this.a = viewConfiguration.getScaledTouchSlop();
        }
        this.i = viewConfiguration.getScaledMaximumFlingVelocity();
        this.j = i;
    }

    public final int a(MotionEvent motionEvent, int i) {
        boolean z;
        boolean z2;
        int iAbs;
        if (i == 1) {
            z = true;
        } else if (i == 3) {
            i = 3;
            z = true;
        } else {
            z = false;
        }
        int i2 = 2;
        if (i == 2) {
            z2 = true;
        } else if (i == 3) {
            i = 3;
            z2 = true;
        } else {
            z2 = false;
        }
        int iFindPointerIndex = motionEvent.findPointerIndex(this.g);
        if (!tym.C(iFindPointerIndex, motionEvent.getPointerCount())) {
            return 0;
        }
        float x = motionEvent.getX(iFindPointerIndex);
        float y = motionEvent.getY(iFindPointerIndex);
        int iRound = z2 ? Math.round(x - this.e) : 0;
        int iRound2 = z ? Math.round(y - this.f) : 0;
        int iAbs2 = Math.abs(iRound);
        int iAbs3 = Math.abs(iRound2);
        if (i == 2 || (i == 3 && iAbs2 > iAbs3)) {
            iAbs = Math.abs(iRound);
            i2 = iRound < 0 ? 1 : 3;
        } else if (z) {
            iAbs = Math.abs(iRound2);
            if (iRound2 >= 0) {
                i2 = 4;
            }
        } else {
            iAbs = 0;
            i2 = 0;
        }
        if (iAbs > this.a) {
            return i2;
        }
        return 0;
    }

    public final void b(MotionEvent motionEvent) {
        VelocityTracker velocityTrackerObtain = this.b;
        if (velocityTrackerObtain == null) {
            velocityTrackerObtain = VelocityTracker.obtain();
            this.b = velocityTrackerObtain;
        }
        velocityTrackerObtain.addMovement(motionEvent);
    }

    public final void c() {
        this.g = -1;
    }

    public final void d(MotionEvent motionEvent) {
        this.e = motionEvent.getX();
        float y = motionEvent.getY();
        this.f = y;
        this.c = this.e;
        this.d = y;
        this.g = motionEvent.getPointerId(0);
    }

    public final int e(MotionEvent motionEvent, int i) {
        float y;
        float yVelocity;
        int iFindPointerIndex = motionEvent.findPointerIndex(this.g);
        if (iFindPointerIndex < 0) {
            return 0;
        }
        this.b.computeCurrentVelocity(1000, this.i);
        if (i == 1) {
            y = this.d - motionEvent.getY(iFindPointerIndex);
            yVelocity = this.b.getYVelocity(this.g);
        } else {
            if (i != 2) {
                throw new IllegalArgumentException("Cannot assess fling for ANY orientation");
            }
            y = this.c - motionEvent.getX(iFindPointerIndex);
            yVelocity = this.b.getXVelocity(this.g);
        }
        int i2 = (int) yVelocity;
        int i3 = (int) y;
        VelocityTracker velocityTracker = this.b;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.b = null;
        }
        if (Math.abs(i3) < this.h || Math.abs(i2) <= this.j) {
            return 0;
        }
        return i2 > 0 ? 1 : 2;
    }
}
