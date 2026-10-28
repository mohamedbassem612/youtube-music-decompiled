package defpackage;

import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ede extends edj {
    @Override // defpackage.edj
    public final IntentFilter a() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.os.action.CHARGING");
        intentFilter.addAction("android.os.action.DISCHARGING");
        return intentFilter;
    }

    @Override // defpackage.edl
    public final /* synthetic */ Object b() {
        Intent intentRegisterReceiver = this.a.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver == null) {
            dzf.b();
            Log.e(edf.a, "getInitialState - null intent received");
            return Boolean.FALSE;
        }
        int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
        boolean z = true;
        if (intExtra != 2 && intExtra != 5) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.edj
    public final void c(Intent intent) {
        String action = intent.getAction();
        if (action != null) {
            dzf.b();
            String str = edf.a;
            switch (action.hashCode()) {
                case -1886648615:
                    if (action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                        f(Boolean.FALSE);
                    }
                    break;
                case -54942926:
                    if (action.equals("android.os.action.DISCHARGING")) {
                        f(Boolean.FALSE);
                    }
                    break;
                case 948344062:
                    if (action.equals("android.os.action.CHARGING")) {
                        f(Boolean.TRUE);
                    }
                    break;
                case 1019184907:
                    if (action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                        f(Boolean.TRUE);
                    }
                    break;
            }
        }
    }
}
