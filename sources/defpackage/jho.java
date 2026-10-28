package defpackage;

import android.content.Context;
import android.view.MotionEvent;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jho extends duc {
    public boolean i;

    public jho(Context context) {
        super(context);
        this.i = true;
    }

    @Override // defpackage.duc, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.i && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // defpackage.duc, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.i && super.onTouchEvent(motionEvent);
    }
}
