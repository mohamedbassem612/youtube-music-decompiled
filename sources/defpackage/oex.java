package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class oex implements oel {
    private long a = -1;
    private long b = -1;
    private long c = -1;
    private long d = -1;
    private long e = -1;
    private long f = -1;
    private long g = -1;
    private long h = -1;
    private final long i = SystemClock.uptimeMillis();

    private static DisplayMetrics a(Context context) {
        WindowManager windowManager;
        DisplayMetrics displayMetrics = null;
        if ((Build.VERSION.SDK_INT < 33 || context.isUiContext()) && (windowManager = (WindowManager) context.getSystemService("window")) != null) {
            Display defaultDisplay = windowManager.getDefaultDisplay();
            displayMetrics = new DisplayMetrics();
            try {
                defaultDisplay.getRealMetrics(displayMetrics);
            } catch (NoSuchMethodError unused) {
                defaultDisplay.getMetrics(displayMetrics);
            }
        }
        return displayMetrics;
    }

    private final void e(Map map) {
        map.put("tcq", Long.valueOf(this.a));
        map.put("tpq", Long.valueOf(this.b));
        map.put("tcc", Long.valueOf(this.g));
        map.put("tpc", Long.valueOf(this.h));
        map.put("tpv", Long.valueOf(this.d));
        map.put("tcv", Long.valueOf(this.c));
        map.put("tchv", Long.valueOf(this.e));
        map.put("tphv", Long.valueOf(this.f));
        map.put("tst", Long.valueOf(this.i));
    }

    @Override // defpackage.oel
    public final synchronized void b(Map map) {
        this.h = this.g;
        this.g = SystemClock.uptimeMillis();
        e(map);
    }

    @Override // defpackage.oel
    public final synchronized void c(Map map) {
        this.b = this.a;
        this.a = SystemClock.uptimeMillis();
        e(map);
    }

    @Override // defpackage.oel
    public final synchronized void d(Map map, Context context) {
        this.d = this.c;
        this.c = SystemClock.uptimeMillis();
        if (this.e != -1) {
            this.f = 0L;
        }
        DisplayMetrics displayMetricsA = a(context);
        if (displayMetricsA != null) {
            int i = displayMetricsA.widthPixels;
            int i2 = displayMetricsA.heightPixels;
        }
        this.e = -1L;
        e(map);
    }
}
