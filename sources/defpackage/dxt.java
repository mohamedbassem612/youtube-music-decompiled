package defpackage;

import android.app.Activity;
import android.os.IBinder;
import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dxt implements View.OnAttachStateChangeListener {
    private final dxu a;
    private final WeakReference b;

    public dxt(dxu dxuVar, Activity activity) {
        this.a = dxuVar;
        this.b = new WeakReference(activity);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.getClass();
        view.removeOnAttachStateChangeListener(this);
        Activity activity = (Activity) this.b.get();
        IBinder iBinderS = azw.s(activity);
        if (activity == null || iBinderS == null) {
            return;
        }
        this.a.b(iBinderS, activity);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        view.getClass();
    }
}
