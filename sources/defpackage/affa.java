package defpackage;

import android.R;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewPropertyAnimator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class affa implements View.OnTouchListener {
    public final long a;
    public final View b;
    private final int c;
    private final int d;
    private final int e;
    private int f = 1;
    private float g;
    private float h;
    private boolean i;
    private int j;
    private VelocityTracker k;
    private float l;
    private final igp m;

    public affa(View view, igp igpVar) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        this.c = viewConfiguration.getScaledTouchSlop();
        this.d = viewConfiguration.getScaledMinimumFlingVelocity() << 4;
        this.e = viewConfiguration.getScaledMaximumFlingVelocity();
        this.a = view.getContext().getResources().getInteger(R.integer.config_shortAnimTime);
        this.b = view;
        this.m = igpVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        motionEvent.offsetLocation(this.l, 0.0f);
        if (this.f < 2) {
            this.f = this.b.getWidth();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.g = motionEvent.getRawX();
            this.h = motionEvent.getRawY();
            VelocityTracker velocityTrackerObtain = VelocityTracker.obtain();
            this.k = velocityTrackerObtain;
            velocityTrackerObtain.addMovement(motionEvent);
        } else if (actionMasked != 1) {
            if (actionMasked == 2) {
                VelocityTracker velocityTracker = this.k;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent);
                    float rawX = motionEvent.getRawX() - this.g;
                    float rawY = motionEvent.getRawY() - this.h;
                    int i = this.c;
                    if (Math.abs(rawX) > i && Math.abs(rawY) < Math.abs(rawX) / 2.0f) {
                        this.i = true;
                        if (rawX <= 0.0f) {
                            i = -i;
                        }
                        this.j = i;
                        View view2 = this.b;
                        view2.getParent().requestDisallowInterceptTouchEvent(true);
                        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                        motionEventObtain.setAction((motionEvent.getActionIndex() << 8) | 3);
                        view2.onTouchEvent(motionEventObtain);
                        motionEventObtain.recycle();
                    }
                    if (this.i) {
                        this.l = rawX;
                        View view3 = this.b;
                        view3.setTranslationX(rawX - this.j);
                        float fAbs = Math.abs(rawX);
                        view3.setAlpha(Math.max(0.0f, Math.min(1.0f, 1.0f - ((fAbs + fAbs) / this.f))));
                        return true;
                    }
                }
            } else if (actionMasked == 3 && this.k != null) {
                this.b.animate().translationX(0.0f).alpha(1.0f).setDuration(this.a).setListener(null);
                this.k.recycle();
                this.k = null;
                this.l = 0.0f;
                this.g = 0.0f;
                this.h = 0.0f;
                this.i = false;
                return false;
            }
        } else if (this.k != null) {
            float rawX2 = motionEvent.getRawX() - this.g;
            this.k.addMovement(motionEvent);
            this.k.computeCurrentVelocity(1000);
            float xVelocity = this.k.getXVelocity();
            float fAbs2 = Math.abs(xVelocity);
            float fAbs3 = Math.abs(this.k.getYVelocity());
            if (Math.abs(rawX2) > this.f / 2 && this.i) {
                z2 = rawX2 > 0.0f;
                z = true;
            } else if (this.d > fAbs2 || fAbs2 > this.e || fAbs3 >= fAbs2 || fAbs3 >= fAbs2 || !this.i) {
                z = false;
                z2 = false;
            } else {
                z = ((xVelocity > 0.0f ? 1 : (xVelocity == 0.0f ? 0 : -1)) >>> 31) == ((rawX2 > 0.0f ? 1 : (rawX2 == 0.0f ? 0 : -1)) >>> 31);
                z2 = this.k.getXVelocity() > 0.0f;
            }
            if (z) {
                abep abepVar = ((abel) this.m.a).l;
                if (abepVar != null) {
                    abes abesVar = (abes) abepVar.a;
                    if (abesVar.o) {
                        boolean[] zArr = abesVar.j;
                        int i2 = abesVar.l;
                        if (i2 >= 0 && zArr != null) {
                            zArr[i2] = true;
                        }
                        abesVar.c(false);
                    }
                }
                ViewPropertyAnimator viewPropertyAnimatorAnimate = this.b.animate();
                int i3 = this.f;
                viewPropertyAnimatorAnimate.translationX(z2 ? i3 : -i3).alpha(0.0f).setDuration(this.a).setListener(new afey(this));
            } else if (this.i) {
                this.b.animate().translationX(0.0f).alpha(1.0f).setDuration(this.a).setListener(null);
            }
            this.k.recycle();
            this.k = null;
            this.l = 0.0f;
            this.g = 0.0f;
            this.h = 0.0f;
            this.i = false;
        }
        return false;
    }
}
