package defpackage;

import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class mhd {
    public View a;
    private final boolean b;
    private final PointF c = new PointF();

    public mhd(View view, boolean z) {
        this.a = view;
        this.b = z;
    }

    public final void a(MotionEvent motionEvent) {
        motionEvent.getClass();
        ViewParent parent = this.a.getParent();
        if (parent != null) {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.c.set(motionEvent.getX(), motionEvent.getY());
                parent.requestDisallowInterceptTouchEvent(true);
                return;
            }
            if (action != 2) {
                if (action != 3) {
                    parent.requestDisallowInterceptTouchEvent(false);
                    return;
                } else {
                    parent.requestDisallowInterceptTouchEvent(true);
                    return;
                }
            }
            float x = motionEvent.getX();
            PointF pointF = this.c;
            float f = x - pointF.x;
            float y = motionEvent.getY() - pointF.y;
            double dAbs = Math.abs(f);
            double dAbs2 = Math.abs(y);
            if (((float) Math.hypot(dAbs, dAbs2)) >= ViewConfiguration.get(this.a.getContext()).getScaledTouchSlop()) {
                parent.requestDisallowInterceptTouchEvent(((float) (((double) ((float) Math.atan2(dAbs2, dAbs))) * 57.29577951308232d)) < 40.0f && (!this.b || this.a.canScrollHorizontally((f > 0.0f ? 1 : (f == 0.0f ? 0 : -1)) > 0 ? -1 : 1)));
            } else {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }
}
