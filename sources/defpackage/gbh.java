package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gbh {
    public long a = -1;
    public long b = -1;
    public long c = -1;
    public long d = -1;
    public long e = -1;
    public long f = -1;
    public long g = -1;
    public long h = -1;

    private static DisplayMetrics d(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        try {
            defaultDisplay.getRealMetrics(displayMetrics);
        } catch (NoSuchMethodError unused) {
            defaultDisplay.getMetrics(displayMetrics);
        }
        return displayMetrics;
    }

    private static boolean e(View view) {
        try {
            if (view.getClass().getName().contains("DebugGestureViewWrapper")) {
                view = ((ViewGroup) view).getChildAt(0);
            }
            Object objInvoke = view.getClass().getMethod("getAdConfiguration", null).invoke(view, null);
            Integer num = (Integer) objInvoke.getClass().getField("adType").get(objInvoke);
            num.intValue();
            String str = (String) objInvoke.getClass().getMethod("adTypeToString", Integer.TYPE).invoke(null, num);
            return str.contains("INTERSTITIAL") || str.contains("APP_OPEN") || str.contains("REWARDED");
        } catch (ReflectiveOperationException | SecurityException unused) {
            return false;
        }
    }

    public final void a() {
        this.h = this.g;
        this.g = SystemClock.uptimeMillis();
    }

    public final void b() {
        this.b = this.a;
        this.a = SystemClock.uptimeMillis();
    }

    public final void c(Context context, View view) {
        this.d = this.c;
        this.c = SystemClock.uptimeMillis();
        long j = this.e;
        if (j != -1) {
            this.f = j;
        }
        DisplayMetrics displayMetricsD = d(context);
        int i = displayMetricsD.widthPixels * displayMetricsD.heightPixels;
        if (view != null) {
            int iMin = Math.min(view.getWidth(), displayMetricsD.widthPixels) * Math.min(view.getHeight(), displayMetricsD.heightPixels);
            if ((iMin << 1) >= i || (iMin == 0 && e(view))) {
                this.e = this.c;
                return;
            }
        }
        this.e = -1L;
    }
}
