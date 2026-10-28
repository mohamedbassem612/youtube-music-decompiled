package defpackage;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.Service;
import android.util.Log;
import androidx.work.impl.foreground.SystemForegroundService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class edv {
    public static void a(Service service, int i, Notification notification, int i2) {
        try {
            service.startForeground(i, notification, i2);
        } catch (ForegroundServiceStartNotAllowedException e) {
            dzf.b();
            Log.w(SystemForegroundService.a, "Unable to start foreground service", e);
        } catch (SecurityException e2) {
            dzf.b();
            Log.w(SystemForegroundService.a, "Unable to start foreground service", e2);
        }
    }
}
