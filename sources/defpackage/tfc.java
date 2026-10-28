package defpackage;

import android.telephony.ServiceState;
import android.telephony.TelephonyManager;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class tfc extends tfh {
    final /* synthetic */ tfd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tfc(tfd tfdVar, TelephonyManager telephonyManager) {
        super(tfdVar.a, telephonyManager);
        this.a = tfdVar;
    }

    @Override // android.telephony.PhoneStateListener
    public final void onServiceStateChanged(ServiceState serviceState) {
        this.a.d(serviceState);
        a();
    }
}
