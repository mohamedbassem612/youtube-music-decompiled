package defpackage;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class osz extends TouchDelegate {
    final /* synthetic */ View a;
    final /* synthetic */ Rect b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public osz(Rect rect, View view, View view2, Rect rect2) {
        super(rect, view);
        this.a = view2;
        this.b = rect2;
    }

    @Override // android.view.TouchDelegate
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.a.getWindowToken() == null) {
            return false;
        }
        super.onTouchEvent(motionEvent);
        return this.b.contains((int) motionEvent.getX(), (int) motionEvent.getY());
    }
}
