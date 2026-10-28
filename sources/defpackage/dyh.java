package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.WindowManager;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dyh implements dyg {
    public static final dyh a = new dyh();

    @Override // defpackage.dyg
    public final dwz a(Activity activity, dyd dydVar) {
        return new dwz(new dwd(dxy.a.a().a(activity)), dydVar.a(activity));
    }

    @Override // defpackage.dyg
    public final dwz b(Context context, dyd dydVar) {
        WindowManager windowManager = (WindowManager) context.getSystemService(WindowManager.class);
        float f = context.getResources().getDisplayMetrics().density;
        Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
        bounds.getClass();
        return new dwz(bounds, f);
    }
}
