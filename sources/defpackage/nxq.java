package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class nxq {
    private final PointF a;
    private final float b;
    private final float c;
    private final float d;
    private final boolean e;
    private Boolean f;

    public nxq(Context context, float f, float f2, boolean z) {
        float scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        this.a = new PointF();
        this.f = null;
        this.b = scaledTouchSlop;
        this.c = f;
        this.d = f2;
        this.e = z;
    }

    public final Boolean a(View view, MotionEvent motionEvent) {
        ViewParent parent = view.getParent();
        int action = motionEvent.getAction();
        if (action == 0) {
            this.a.set(motionEvent.getX(), motionEvent.getY());
            this.f = null;
            if (this.e) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        } else if (action != 2) {
            if (action != 3) {
                parent.requestDisallowInterceptTouchEvent(false);
            } else if (this.e) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        } else if (this.f == null) {
            float x = motionEvent.getX();
            PointF pointF = this.a;
            double dAbs = Math.abs(x - pointF.x);
            double dAbs2 = Math.abs(motionEvent.getY() - pointF.y);
            if (((float) Math.hypot(dAbs, dAbs2)) >= this.b) {
                float degrees = (float) Math.toDegrees((float) Math.atan2(dAbs2, dAbs));
                Boolean boolValueOf = Boolean.valueOf(degrees >= this.c && degrees <= this.d);
                this.f = boolValueOf;
                parent.requestDisallowInterceptTouchEvent(boolValueOf.booleanValue());
            }
        }
        return this.f;
    }
}
