package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import defpackage.dzf;
import defpackage.ebm;
import java.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {
    private static final String a = dzf.a("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        dzf.b();
        Objects.toString(intent);
        try {
            ebm ebmVarJ = ebm.j(context);
            BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
            synchronized (ebm.a) {
                try {
                    BroadcastReceiver.PendingResult pendingResult = ebmVarJ.h;
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                    ebmVarJ.h = pendingResultGoAsync;
                    if (ebmVarJ.g) {
                        ebmVarJ.h.finish();
                        ebmVarJ.h = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (IllegalStateException e) {
            dzf.b();
            Log.e(a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
        }
    }
}
