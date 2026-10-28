package defpackage;

import android.app.ActivityManager;
import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class exl {
    public final ActivityManager a;
    public float c;
    public final ci e;
    public float b = 2.0f;
    public float d = 0.33f;

    public exl(Context context) {
        this.c = 1.0f;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.a = activityManager;
        this.e = new ci(context.getResources().getDisplayMetrics(), (byte[]) null);
        if (activityManager.isLowRamDevice()) {
            this.c = 0.0f;
        }
    }
}
