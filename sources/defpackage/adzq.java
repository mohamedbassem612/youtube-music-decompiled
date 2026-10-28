package defpackage;

import android.view.MotionEvent;
import android.widget.ListView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adzq extends ListView {
    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (getChildCount() != 0 && (getFirstVisiblePosition() != 0 || getChildAt(0).getTop() != 0)) {
            requestDisallowInterceptTouchEvent(true);
        }
        return super.onTouchEvent(motionEvent);
    }
}
