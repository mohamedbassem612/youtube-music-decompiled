package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kyg {
    public static final int a;
    private static volatile boolean b = false;
    private static volatile boolean c = false;

    static {
        a = true != a.aO() ? 0 : 33554432;
        new agqj("android.settings.SETTINGS_EMBED_DEEP_LINK_ACTIVITY");
    }

    public static PendingIntent a(Context context, Intent intent, int i) {
        boolean z = b;
        return PendingIntent.getActivity(context, 0, intent, i);
    }

    public static PendingIntent b(Context context, Intent intent, int i) {
        boolean z = b;
        return PendingIntent.getBroadcast(context, 0, intent, i);
    }
}
