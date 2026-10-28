package defpackage;

import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import android.telephony.TelephonyManager;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class yoy extends PhoneStateListener {
    final /* synthetic */ yoz a;
    private final TelephonyManager b;
    private final twi c;

    public yoy(yoz yozVar, TelephonyManager telephonyManager, twi twiVar) {
        this.a = yozVar;
        this.b = telephonyManager;
        this.c = twiVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    @Override // android.telephony.PhoneStateListener
    public final void onServiceStateChanged(ServiceState serviceState) {
        String str;
        if (serviceState != null) {
            try {
                String string = serviceState.toString();
                if (string.contains("nrState=CONNECTED") || string.contains("nrState=NOT_RESTRICTED")) {
                    str = "5g";
                } else {
                    str = "n";
                }
            } catch (RuntimeException unused) {
                zhq zhqVar = zhq.ABR;
                str = "e";
            }
        } else {
            str = "n";
        }
        this.c.a(str);
        this.b.listen(this, 0);
        yoz yozVar = this.a;
        synchronized (yozVar) {
            yozVar.e = false;
        }
    }
}
