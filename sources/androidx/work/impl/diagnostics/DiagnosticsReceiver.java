package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import androidx.work.impl.workers.DiagnosticsWorker;
import defpackage.bnz;
import defpackage.dzf;
import defpackage.dzg;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {
    private static final String a = dzf.a("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent != null) {
            dzf.b();
            try {
                bnz.i(context).f(new dzg(DiagnosticsWorker.class).g());
            } catch (IllegalStateException e) {
                dzf.b();
                Log.e(a, "WorkManager is not initialized", e);
            }
        }
    }
}
