package defpackage;

import android.content.Context;
import android.os.Build;
import android.view.WindowManager;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class qgp {
    public static volatile long a;
    private static volatile float b;

    private qgp() {
    }

    public static agev a(Context context) {
        if (Build.VERSION.SDK_INT >= 31) {
            return agdf.a;
        }
        float f = b;
        if (f == 0.0f) {
            synchronized (qgp.class) {
                f = b;
                if (f == 0.0f) {
                    float refreshRate = ((WindowManager) context.getApplicationContext().getSystemService("window")).getDefaultDisplay().getRefreshRate();
                    b = refreshRate;
                    f = refreshRate;
                }
            }
        }
        return agev.i(Float.valueOf(f));
    }
}
