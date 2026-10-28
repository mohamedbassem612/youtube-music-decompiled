package defpackage;

import android.content.Intent;
import android.content.IntentFilter;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class edq extends edj {
    @Override // defpackage.edj
    public final IntentFilter a() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        return intentFilter;
    }

    @Override // defpackage.edl
    public final /* bridge */ /* synthetic */ Object b() {
        Intent intentRegisterReceiver = this.a.registerReceiver(null, a());
        boolean z = true;
        if (intentRegisterReceiver != null && intentRegisterReceiver.getAction() != null) {
            String action = intentRegisterReceiver.getAction();
            if (action == null) {
                z = false;
            } else {
                int iHashCode = action.hashCode();
                if (iHashCode == -1181163412) {
                    action.equals("android.intent.action.DEVICE_STORAGE_LOW");
                } else if (iHashCode != -730838620 || !action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                }
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.edj
    public final void c(Intent intent) {
        if (intent.getAction() != null) {
            dzf.b();
            int i = edr.a;
            intent.getAction();
            String action = intent.getAction();
            if (action != null) {
                int iHashCode = action.hashCode();
                if (iHashCode == -1181163412) {
                    if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                        f(Boolean.FALSE);
                    }
                } else if (iHashCode == -730838620 && action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                    f(Boolean.TRUE);
                }
            }
        }
    }
}
