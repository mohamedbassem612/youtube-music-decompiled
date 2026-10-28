package defpackage;

import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class tve {
    public hwc a;
    private final ViewConfiguration b;
    private boolean c;
    private float d;
    private float e;

    public tve(ViewConfiguration viewConfiguration) {
        viewConfiguration.getClass();
        this.b = viewConfiguration;
    }

    private static float d(MotionEvent motionEvent, int i) {
        return Build.VERSION.SDK_INT >= 29 ? motionEvent.getRawX(i) : motionEvent.getX(i);
    }

    private static float e(MotionEvent motionEvent, int i) {
        return Build.VERSION.SDK_INT >= 29 ? motionEvent.getRawY(i) : motionEvent.getY(i);
    }

    public void a() {
        this.c = false;
    }

    public boolean b(View view, MotionEvent motionEvent) {
        hwc hwcVar;
        boolean zC = c(motionEvent);
        if (!zC || (hwcVar = this.a) == null) {
            return zC;
        }
        hwcVar.k(motionEvent);
        return true;
    }

    protected final boolean c(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 3) {
            a();
            return false;
        }
        if (this.c && motionEvent.getActionMasked() == 1) {
            this.c = false;
            return true;
        }
        if (motionEvent.getActionMasked() == 0) {
            this.c = true;
            this.d = d(motionEvent, 0);
            this.e = e(motionEvent, 0);
            return false;
        }
        if (this.c && motionEvent.getActionMasked() == 2) {
            float scaledTouchSlop = this.b.getScaledTouchSlop();
            if (Math.abs(d(motionEvent, 0) - this.d) <= scaledTouchSlop && Math.abs(e(motionEvent, 0) - this.e) <= scaledTouchSlop) {
                return false;
            }
            this.c = false;
            return false;
        }
        if (!this.c || motionEvent.getActionMasked() != 6) {
            return false;
        }
        motionEvent.getPointerCount();
        if (motionEvent.getActionIndex() != 0 || motionEvent.getPointerCount() <= 1) {
            return false;
        }
        this.d = d(motionEvent, 1);
        this.e = e(motionEvent, 1);
        return false;
    }

    public tve() {
    }
}
