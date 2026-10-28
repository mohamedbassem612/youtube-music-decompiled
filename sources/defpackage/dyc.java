package defpackage;

import android.app.Activity;
import android.graphics.Rect;
import android.view.WindowManager;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dyc implements dxy {
    public static final dyc b = new dyc();

    @Override // defpackage.dxy
    public final Rect a(Activity activity) {
        Rect bounds = ((WindowManager) activity.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getBounds();
        bounds.getClass();
        return bounds;
    }
}
