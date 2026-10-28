package defpackage;

import android.content.Context;
import android.os.Build;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class otd {
    public boolean a;
    public Float b;
    public Float c;
    public float d;
    public final int e;
    public final int f;
    public final orp g;
    private final float[] h;

    public otd(Context context, orp orpVar, float f) {
        int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        this.a = false;
        this.h = new float[2];
        this.g = orpVar;
        this.e = (int) (f * 40.0f);
        this.f = scaledTouchSlop;
    }

    private static final void d(MotionEvent motionEvent, int i, float[] fArr) {
        if (Build.VERSION.SDK_INT >= 29) {
            fArr[0] = motionEvent.getRawX(i);
            fArr[1] = motionEvent.getRawY(i);
        } else {
            fArr[0] = motionEvent.getX(i);
            fArr[1] = motionEvent.getY(i);
        }
    }

    public final float a(float f, float f2) {
        return f2 >= f ? Math.min(f2 - f, (f + 6.2831855f) - f2) : -a(f2, f);
    }

    public final float b(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount() - 1;
        float[] fArr = this.h;
        d(motionEvent, pointerCount, fArr);
        float f = fArr[0];
        float f2 = fArr[1];
        d(motionEvent, 0, fArr);
        return (float) Math.atan2(f - fArr[0], f2 - fArr[1]);
    }

    public final float c(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount() - 1;
        float[] fArr = this.h;
        d(motionEvent, pointerCount, fArr);
        float f = fArr[0];
        float f2 = fArr[1];
        d(motionEvent, 0, fArr);
        return (float) Math.hypot(f - fArr[0], f2 - fArr[1]);
    }
}
