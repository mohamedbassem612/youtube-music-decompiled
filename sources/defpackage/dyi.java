package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Point;
import android.graphics.Rect;
import android.inputmethodservice.InputMethodService;
import android.view.Display;
import android.view.WindowManager;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class dyi implements dyg {
    private final /* synthetic */ int $cid;
    public static final dyi b = new dyi(1);
    public static final dyi a = new dyi(0);

    private dyi(int i) {
        this.$cid = i;
    }

    @Override // defpackage.dyg
    public final dwz a(Activity activity, dyd dydVar) {
        if (this.$cid != 0) {
            return dyh.a.a(activity, dydVar);
        }
        activity.getClass();
        return new dwz(new dwd(dxy.a.a().a(activity)), dydVar.a(activity));
    }

    @Override // defpackage.dyg
    public final dwz b(Context context, dyd dydVar) {
        if (this.$cid != 0) {
            WindowManager windowManager = context.isUiContext() ? (WindowManager) context.getSystemService(WindowManager.class) : (WindowManager) context.getApplicationContext().getSystemService(WindowManager.class);
            Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
            bounds.getClass();
            return new dwz(bounds, windowManager.getCurrentWindowMetrics().getDensity());
        }
        Context baseContext = context;
        while (true) {
            if (!(baseContext instanceof ContextWrapper)) {
                baseContext = context;
                break;
            }
            if (!(baseContext instanceof Activity) && !(baseContext instanceof InputMethodService) && !(baseContext instanceof Application)) {
                ContextWrapper contextWrapper = (ContextWrapper) baseContext;
                if (contextWrapper.getBaseContext() == null) {
                    break;
                }
                baseContext = contextWrapper.getBaseContext();
                baseContext.getClass();
            } else {
                break;
            }
        }
        if (baseContext instanceof Activity) {
            return a((Activity) baseContext, dydVar);
        }
        if (!(baseContext instanceof InputMethodService) && !(baseContext instanceof Application)) {
            throw new IllegalArgumentException("Must provide a UiContext or Application Context");
        }
        Object systemService = context.getSystemService("window");
        systemService.getClass();
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        defaultDisplay.getClass();
        Point pointD = yp.d(defaultDisplay);
        return new dwz(new Rect(0, 0, pointD.x, pointD.y), dydVar.a(context));
    }
}
