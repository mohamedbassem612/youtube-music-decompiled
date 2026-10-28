package defpackage;

import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class edg extends edj {
    @Override // defpackage.edj
    public final IntentFilter a() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }

    @Override // defpackage.edl
    public final /* synthetic */ Object b() {
        Intent intentRegisterReceiver = this.a.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver == null) {
            dzf.b();
            Log.e(edh.a, "getInitialState - null intent received");
            return Boolean.FALSE;
        }
        int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
        float intExtra2 = intentRegisterReceiver.getIntExtra("level", -1);
        float intExtra3 = intentRegisterReceiver.getIntExtra("scale", -1);
        boolean z = true;
        if (intExtra != 1 && intExtra2 / intExtra3 <= 0.15f) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.edj
    public final void c(Intent intent) {
        if (intent.getAction() != null) {
            dzf.b();
            String str = edh.a;
            intent.getAction();
            String action = intent.getAction();
            if (action != null) {
                int iHashCode = action.hashCode();
                if (iHashCode == -1980154005) {
                    if (action.equals("android.intent.action.BATTERY_OKAY")) {
                        f(Boolean.TRUE);
                    }
                } else if (iHashCode == 490310653 && action.equals("android.intent.action.BATTERY_LOW")) {
                    f(Boolean.FALSE);
                }
            }
        }
    }
}
