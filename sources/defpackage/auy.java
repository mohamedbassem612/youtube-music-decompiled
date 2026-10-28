package defpackage;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class auy {
    public static String b;
    private static aux f;
    public final NotificationManager d;
    private final Context g;
    public static final Object a = new Object();
    public static Set c = new HashSet();
    private static final Object e = new Object();

    public auy(Context context) {
        this.g = context;
        this.d = (NotificationManager) context.getSystemService("notification");
    }

    public final void a(String str, int i) {
        this.d.cancel(str, i);
    }

    public final void b(String str, int i, Notification notification) {
        Bundle bundle = notification.extras;
        if (bundle == null || !bundle.getBoolean("android.support.useSideChannel")) {
            this.d.notify(str, i, notification);
            return;
        }
        Context context = this.g;
        auv auvVar = new auv(context.getPackageName(), i, str, notification);
        synchronized (e) {
            aux auxVar = f;
            if (auxVar == null) {
                auxVar = new aux(context.getApplicationContext());
                f = auxVar;
            }
            auxVar.a.obtainMessage(0, auvVar).sendToTarget();
        }
        this.d.cancel(str, i);
    }

    public final boolean c() {
        return this.d.areNotificationsEnabled();
    }

    public final boolean d() {
        if (Build.VERSION.SDK_INT >= 36) {
            return this.d.canPostPromotedNotifications();
        }
        return false;
    }
}
