package defpackage;

import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.Pair;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class npl implements View.OnAttachStateChangeListener {
    public final List a = new ArrayList();

    public static Paint a(int i) {
        Paint paint = new Paint();
        paint.setColor(i);
        return paint;
    }

    public final void b() {
        for (Pair pair : this.a) {
            View view = (View) pair.first;
            view.getOverlay().remove((Drawable) pair.second);
            view.invalidate();
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
        b();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
