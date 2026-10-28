package defpackage;

import android.app.NotificationManager;
import android.service.notification.StatusBarNotification;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class nvz {
    public static final StatusBarNotification[] a(NotificationManager notificationManager) {
        try {
            StatusBarNotification[] activeNotifications = notificationManager.getActiveNotifications();
            activeNotifications.getClass();
            return activeNotifications;
        } catch (RuntimeException unused) {
            return new StatusBarNotification[0];
        }
    }
}
