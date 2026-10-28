package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class osv {
    private final PointF a;
    private final float b;
    private final float c;
    private final float d;
    private Boolean e;

    public osv(Context context, float f, float f2) {
        float scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        this.a = new PointF();
        this.e = null;
        this.b = scaledTouchSlop;
        this.c = f;
        this.d = f2;
    }

    public final void a(View view, MotionEvent motionEvent) {
        ViewParent parent = view.getParent();
        if (parent != null) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                this.a.set(motionEvent.getX(), motionEvent.getY());
                this.e = null;
                parent.requestDisallowInterceptTouchEvent(true);
                return;
            }
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    parent.requestDisallowInterceptTouchEvent(false);
                    return;
                } else {
                    parent.requestDisallowInterceptTouchEvent(true);
                    return;
                }
            }
            if (this.e == null) {
                float x = motionEvent.getX();
                PointF pointF = this.a;
                double dAbs = Math.abs(x - pointF.x);
                double dAbs2 = Math.abs(motionEvent.getY() - pointF.y);
                if (((float) Math.hypot(dAbs, dAbs2)) >= this.b) {
                    float degrees = (float) Math.toDegrees((float) Math.atan2(dAbs2, dAbs));
                    Boolean boolValueOf = Boolean.valueOf(degrees >= this.c && degrees <= this.d);
                    this.e = boolValueOf;
                    parent.requestDisallowInterceptTouchEvent(boolValueOf.booleanValue());
                }
            }
        }
    }
}
