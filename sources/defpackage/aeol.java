package defpackage;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aeol extends TouchDelegate {
    private final Rect a;
    private final View b;
    private final int c;

    public aeol(Rect rect, View view) {
        super(rect, view);
        this.a = new Rect(rect);
        this.b = view;
        this.c = ViewConfiguration.get(view.getContext()).getScaledEdgeSlop();
    }

    @Override // android.view.TouchDelegate
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        if (this.a.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            int action = motionEvent.getAction();
            if (action == 0 || action == 1) {
                i = action;
            } else if (action == 2) {
                i = 2;
            }
            long downTime = motionEvent.getDownTime();
            long eventTime = motionEvent.getEventTime();
            float x = motionEvent.getX();
            View view = this.b;
            return view.dispatchTouchEvent(MotionEvent.obtain(downTime, eventTime, i, x, view.getHeight() - this.c, motionEvent.getMetaState()));
        }
        return false;
    }
}
