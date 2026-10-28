package defpackage;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.pm.PackageManager;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.android.apps.youtube.music.mediabrowser.MusicBrowserService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class hgb {
    private static final agrf c = agrf.h("com/google/android/apps/youtube/music/mediabrowser/MediaBrowserNotificationController");
    public final Context a;
    public final vxz b;
    private final hfy d;
    private final hwv e;
    private final awmd f;
    private final int g;

    public hgb(Context context, hfy hfyVar, hwv hwvVar, awmd awmdVar, int i, vxz vxzVar) {
        this.a = context;
        this.d = hfyVar;
        this.e = hwvVar;
        this.f = awmdVar;
        this.g = i;
        this.b = vxzVar;
    }

    public final Notification a() {
        Context context = this.a;
        atr atrVar = new atr(context, "ExternalDeviceNotifications");
        atrVar.m = false;
        atrVar.e(8, true);
        atrVar.l = -2;
        atrVar.q(this.g);
        atrVar.e(16, true);
        atrVar.t = "ExternalDeviceNotificationsGroup";
        atrVar.E = "ExternalDeviceNotifications";
        atrVar.s(b());
        atrVar.h = (PendingIntent) this.f.io();
        atrVar.s(b());
        atrVar.l(context.getString(R.string.mbs_notification_status_restoring));
        return atrVar.a();
    }

    final String b() {
        String str;
        String str2 = this.d.b().b;
        boolean zIsEmpty = str2.isEmpty();
        Context context = this.a;
        if (zIsEmpty) {
            str = "";
        } else {
            try {
                PackageManager packageManager = context.getPackageManager();
                str = (String) packageManager.getApplicationLabel(packageManager.getApplicationInfo(str2, SemanticState.Focused));
            } catch (PackageManager.NameNotFoundException e) {
                ((agrc) ((agrc) ((agrc) hfy.a.c().i(agso.a, "ConnectedClientCtlr")).j(e)).k("com/google/android/apps/youtube/music/mediabrowser/ConnectedClientController", "getDisplayName", (char) 158, "ConnectedClientController.java")).w("Could not find the display name for the following package: %s", str2);
                str = "";
            }
        }
        boolean zAa = ahno.aa(str);
        Context context2 = this.a;
        return zAa ? context2.getString(R.string.mbs_notification_connected) : context2.getString(R.string.mbs_notification_connected_to, str);
    }

    public final void c(MusicBrowserService musicBrowserService) {
        agrx agrxVar = agso.a;
        try {
            musicBrowserService.startForeground(16, a());
        } catch (ForegroundServiceStartNotAllowedException e) {
            ((agrc) ((agrc) ((agrc) c.c().i(agso.a, "MediaBrowserNotifCtlr")).j(e)).k("com/google/android/apps/youtube/music/mediabrowser/MediaBrowserNotificationController", "startForegroundWithCrashFix", 'w', "MediaBrowserNotificationController.java")).t("Failed to start MBS in foreground due to Android S+ restrictions");
        }
    }

    public final void d(MusicBrowserService musicBrowserService) {
        agrx agrxVar = agso.a;
        musicBrowserService.stopForeground(true);
        NotificationManager notificationManager = (NotificationManager) this.a.getSystemService("notification");
        if (notificationManager != null) {
            notificationManager.cancel(16);
        }
        if (this.e.a()) {
            return;
        }
        musicBrowserService.stopSelf();
    }
}
