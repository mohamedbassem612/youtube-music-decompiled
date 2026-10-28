package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import androidx.car.app.model.Alert;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class ttz extends ViewGroup {
    private static final Interpolator k = new tty();
    public final float[] a;
    public final int[] b;
    public final int c;
    public final int d;
    public float e;
    public VelocityTracker f;
    protected boolean g;
    public boolean h;
    protected boolean i;
    protected final Scroller j;
    private final int l;
    private boolean m;

    public ttz(Context context) {
        super(context);
        this.a = new float[]{0.0f, 0.0f};
        this.b = new int[]{-2147483647, Alert.DURATION_SHOW_INDEFINITELY};
        this.e = 0.0f;
        this.g = false;
        this.m = false;
        this.h = false;
        this.i = false;
        Context context2 = getContext();
        setFocusable(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context2);
        this.l = viewConfiguration.getScaledTouchSlop();
        this.d = viewConfiguration.getScaledMinimumFlingVelocity();
        this.c = viewConfiguration.getScaledMaximumFlingVelocity();
        this.j = new Scroller(context2, k);
    }

    private final int f(int i) {
        int[] iArr = this.b;
        int i2 = iArr[0];
        if (i < i2) {
            return i2;
        }
        int i3 = iArr[1];
        return i > i3 ? i3 : i;
    }

    private final void g() {
        if (!this.g && this.j.isFinished()) {
            this.m = true;
        }
        this.g = true;
        this.e = 0.0f;
        this.j.abortAnimation();
    }

    protected final void a(int i) {
        this.j.forceFinished(true);
        scrollTo(0, f(i));
    }

    public final void b(int i, int i2) {
        int[] iArr = this.b;
        iArr[0] = i;
        iArr[1] = i2;
    }

    protected final void c(MotionEvent motionEvent) {
        float[] fArr = this.a;
        fArr[0] = motionEvent.getX();
        fArr[1] = motionEvent.getY();
    }

    @Override // android.view.View
    public final void computeScroll() {
        Scroller scroller = this.j;
        if (scroller.computeScrollOffset()) {
            int currY = scroller.getCurrY();
            scrollTo(0, currY);
            invalidate();
            if (this.e != 0.0f) {
                this.e = 0.0f;
            }
            if (currY == scroller.getFinalY()) {
                scroller.abortAnimation();
                if (this.m) {
                    this.m = false;
                }
            }
        }
    }

    public final boolean d(MotionEvent motionEvent) {
        if (this.g) {
            this.g = false;
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            c(motionEvent);
            if (this.j.isFinished()) {
                this.h = true;
                return false;
            }
            g();
        } else {
            if (action != 2) {
                return false;
            }
            float x = motionEvent.getX();
            float[] fArr = this.a;
            float f = x - fArr[0];
            float y = motionEvent.getY() - fArr[1];
            int i = this.l;
            float f2 = i;
            boolean z = f > f2 || f < ((float) (-i));
            if (y <= f2 && y >= (-i)) {
                return false;
            }
            if (z && !this.i) {
                return false;
            }
            c(motionEvent);
            g();
        }
        return true;
    }

    public final void e(int i) {
        this.j.startScroll(0, getScrollY(), 0, f(i) - getScrollY(), 500);
        invalidate();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        throw null;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        VelocityTracker velocityTrackerObtain = this.f;
        if (velocityTrackerObtain == null) {
            velocityTrackerObtain = VelocityTracker.obtain();
            this.f = velocityTrackerObtain;
        }
        velocityTrackerObtain.addMovement(motionEvent);
        if (!this.g) {
            if (d(motionEvent) || action != 1 || !this.h) {
                return true;
            }
            this.h = false;
            return performClick();
        }
        if (action != 1) {
            if (action == 2) {
                float[] fArr = this.a;
                float f = fArr[1];
                c(motionEvent);
                a(getScrollY() + Math.round(f - fArr[1]));
                this.h = false;
                return true;
            }
            if (action != 3) {
                return true;
            }
        }
        this.g = false;
        if (action != 3 && getChildCount() > 0) {
            this.f.computeCurrentVelocity(1000, this.c);
            float yVelocity = this.f.getYVelocity();
            int i = this.d;
            if (yVelocity > i || yVelocity < (-i)) {
                float f2 = -yVelocity;
                this.e = f2;
                int[] iArr = this.b;
                this.j.fling(getScrollX(), getScrollY(), 0, (int) f2, 0, 0, iArr[0], iArr[1]);
                invalidate();
            }
        }
        VelocityTracker velocityTracker = this.f;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f = null;
        }
        this.h = false;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean showContextMenuForChild(View view) {
        requestDisallowInterceptTouchEvent(true);
        return super.showContextMenuForChild(view);
    }

    public ttz(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new float[]{0.0f, 0.0f};
        this.b = new int[]{-2147483647, Alert.DURATION_SHOW_INDEFINITELY};
        this.e = 0.0f;
        this.g = false;
        this.m = false;
        this.h = false;
        this.i = false;
        Context context2 = getContext();
        setFocusable(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context2);
        this.l = viewConfiguration.getScaledTouchSlop();
        this.d = viewConfiguration.getScaledMinimumFlingVelocity();
        this.c = viewConfiguration.getScaledMaximumFlingVelocity();
        this.j = new Scroller(context2, k);
    }

    public ttz(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new float[]{0.0f, 0.0f};
        this.b = new int[]{-2147483647, Alert.DURATION_SHOW_INDEFINITELY};
        this.e = 0.0f;
        this.g = false;
        this.m = false;
        this.h = false;
        this.i = false;
        Context context2 = getContext();
        setFocusable(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context2);
        this.l = viewConfiguration.getScaledTouchSlop();
        this.d = viewConfiguration.getScaledMinimumFlingVelocity();
        this.c = viewConfiguration.getScaledMaximumFlingVelocity();
        this.j = new Scroller(context2, k);
    }
}
