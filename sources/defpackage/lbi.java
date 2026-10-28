package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lbi extends BroadcastReceiver {
    public final ldr a;

    public lbi(ldr ldrVar) {
        this.a = ldrVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            this.a.aT().f.a("App receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        if (action == null) {
            this.a.aT().f.a("App receiver called with null action");
            return;
        }
        if (action.hashCode() != 1279883384 || !action.equals("com.google.android.gms.measurement.BATCHES_AVAILABLE")) {
            this.a.aT().f.a("App receiver called with unknown action");
            return;
        }
        ldr ldrVar = this.a;
        ldrVar.aT().k.a("[sgtm] App Receiver notified batches are available");
        ldrVar.aU().j(new kcx(this, 17));
    }
}
