package androidx.media.session;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.util.Log;
import defpackage.br$$ExternalSyntheticApiModelOutline0;
import defpackage.brm;
import defpackage.ej;
import defpackage.ek;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class MediaButtonReceiver extends BroadcastReceiver {
    private static ComponentName a(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent(str);
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (listQueryIntentServices.size() == 1) {
            ResolveInfo resolveInfo = listQueryIntentServices.get(0);
            return new ComponentName(resolveInfo.serviceInfo.packageName, resolveInfo.serviceInfo.name);
        }
        if (listQueryIntentServices.isEmpty()) {
            return null;
        }
        throw new IllegalStateException("Expected 1 service that handles " + str + ", found " + listQueryIntentServices.size());
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null || !"android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) || !intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            Objects.toString(intent);
            return;
        }
        ComponentName componentNameA = a(context, "android.intent.action.MEDIA_BUTTON");
        if (componentNameA != null) {
            intent.setComponent(componentNameA);
            try {
                context.startForegroundService(intent);
                return;
            } catch (IllegalStateException e) {
                if (Build.VERSION.SDK_INT < 31 || !br$$ExternalSyntheticApiModelOutline0.m653m((Object) e)) {
                    throw e;
                }
                Log.e("MediaButtonReceiver", "caught exception when trying to start a foreground service from the background: ".concat(String.valueOf(br$$ExternalSyntheticApiModelOutline0.m((Object) e).getMessage())));
                return;
            }
        }
        ComponentName componentNameA2 = a(context, "android.media.browse.MediaBrowserService");
        if (componentNameA2 == null) {
            throw new IllegalStateException("Could not find any Service that handles android.intent.action.MEDIA_BUTTON or implements a media browser service.");
        }
        BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
        Context applicationContext = context.getApplicationContext();
        brm brmVar = new brm(applicationContext, intent, pendingResultGoAsync);
        ek ekVar = new ek(applicationContext, componentNameA2, brmVar);
        brmVar.c = ekVar;
        ((ej) ekVar.a).b.connect();
    }
}
