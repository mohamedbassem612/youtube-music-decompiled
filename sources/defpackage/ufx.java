package defpackage;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class ufx implements View.OnTouchListener {
    final GestureDetector a;
    private final Context b;
    private ScaleGestureDetector c;
    private boolean d;

    public ufx(Context context, ukd ukdVar) {
        this.b = context;
        this.a = new GestureDetector(context, new ufw(ukdVar));
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0029  */
    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        this.a.onTouchEvent(motionEvent);
        int action = motionEvent.getAction() & 255;
        boolean z = this.d;
        if (action != 1) {
            if (action == 5) {
                z = true;
            } else if (action == 6 && motionEvent.getPointerCount() < 2) {
            }
            this.d = z;
            if (action == 1) {
                this.c = null;
                action = 1;
            }
            if (!z && action == 2) {
                ScaleGestureDetector scaleGestureDetector = this.c;
                if (scaleGestureDetector == null) {
                    ScaleGestureDetector scaleGestureDetector2 = new ScaleGestureDetector(this.b, new ufv());
                    this.c = scaleGestureDetector2;
                    scaleGestureDetector = scaleGestureDetector2;
                }
                return scaleGestureDetector.onTouchEvent(motionEvent);
            }
        }
        view.performClick();
        z = false;
        this.d = z;
        if (action == 1) {
            this.c = null;
            action = 1;
        }
        return !z ? true : true;
    }
}
