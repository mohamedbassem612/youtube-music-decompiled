package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aauq {
    private static final ActivityManager.RunningAppProcessInfo a = new ActivityManager.RunningAppProcessInfo();

    public static boolean a(Context context, Intent intent) {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = a;
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        if (runningAppProcessInfo.importance != 125) {
            aaut.a = (runningAppProcessInfo.importance == 100 || runningAppProcessInfo.importance == 200) ? false : true;
        }
        try {
            if (context.getApplicationInfo().targetSdkVersion >= 26) {
                context.startForegroundService(intent);
                return true;
            }
            context.startService(intent);
            return true;
        } catch (RuntimeException unused) {
            return false;
        }
    }
}
