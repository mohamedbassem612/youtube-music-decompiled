package defpackage;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aehl implements View.OnTouchListener {
    public final aehi a;
    private final GestureDetector b;

    public aehl(Context context, aehi aehiVar) {
        this.a = aehiVar;
        this.b = new GestureDetector(context, new aehk(this));
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        this.a.s();
        this.b.onTouchEvent(motionEvent);
        return false;
    }
}
