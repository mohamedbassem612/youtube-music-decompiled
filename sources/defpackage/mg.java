package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ListView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class mg implements View.OnTouchListener, View.OnAttachStateChangeListener {
    private final float a;
    private final int b;
    final View c;
    public boolean d;
    private final int e;
    private Runnable f;
    private Runnable g;
    private int h;
    private final int[] i = new int[2];

    public mg(View view) {
        this.c = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.b = tapTimeout;
        this.e = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    public abstract jf a();

    protected boolean b() {
        throw null;
    }

    protected boolean c() {
        jf jfVarA = a();
        if (jfVarA == null || !jfVarA.u()) {
            return true;
        }
        jfVarA.k();
        return true;
    }

    public final void d() {
        Runnable runnable = this.g;
        if (runnable != null) {
            this.c.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f;
        if (runnable2 != null) {
            this.c.removeCallbacks(runnable2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005c  */
    /* JADX WARN: Code duplicated, block: B:21:0x0062  */
    /* JADX WARN: Code duplicated, block: B:22:0x0065  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c8  */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        ListView listViewFN;
        boolean z2 = this.d;
        View view2 = this.c;
        if (z2) {
            jf jfVarA = a();
            if (jfVarA != null && jfVarA.u() && (listViewFN = jfVarA.fN()) != null) {
                mb mbVar = (mb) listViewFN;
                if (mbVar.isShown()) {
                    MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                    int[] iArr = this.i;
                    view2.getLocationOnScreen(iArr);
                    motionEventObtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                    listViewFN.getLocationOnScreen(iArr);
                    motionEventObtainNoHistory.offsetLocation(-iArr[0], -iArr[1]);
                    boolean zA = mbVar.a(motionEventObtainNoHistory, this.h);
                    motionEventObtainNoHistory.recycle();
                    int actionMasked = motionEvent.getActionMasked();
                    boolean z3 = (actionMasked == 1 || actionMasked == 3) ? false : true;
                    if (zA && z3) {
                        z = true;
                    } else if (c()) {
                        z = false;
                    } else {
                        z = true;
                    }
                } else if (c()) {
                    z = true;
                } else {
                    z = false;
                }
            } else if (c()) {
                z = true;
            } else {
                z = false;
            }
        } else {
            if (view2.isEnabled()) {
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 == 0) {
                    this.h = motionEvent.getPointerId(0);
                    if (this.f == null) {
                        this.f = new mc(this, 2);
                    }
                    view2.postDelayed(this.f, this.b);
                    if (this.g == null) {
                        this.g = new mc(this, 3);
                    }
                    view2.postDelayed(this.g, this.e);
                } else if (actionMasked2 == 1) {
                    d();
                } else if (actionMasked2 == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.h);
                    if (iFindPointerIndex >= 0) {
                        float x = motionEvent.getX(iFindPointerIndex);
                        float y = motionEvent.getY(iFindPointerIndex);
                        float f = this.a;
                        float f2 = -f;
                        if (x < f2 || y < f2 || x >= (view2.getRight() - view2.getLeft()) + f || y >= (view2.getBottom() - view2.getTop()) + f) {
                            d();
                            view2.getParent().requestDisallowInterceptTouchEvent(true);
                            if (b()) {
                                z = true;
                            }
                        }
                    }
                } else if (actionMasked2 == 3) {
                    d();
                }
                z = false;
            } else {
                z = false;
            }
            if (z) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                view2.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
        }
        this.d = z;
        return z || z2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.d = false;
        this.h = -1;
        Runnable runnable = this.f;
        if (runnable != null) {
            this.c.removeCallbacks(runnable);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
