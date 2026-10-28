package defpackage;

import android.telephony.TelephonyDisplayInfo;
import android.telephony.TelephonyManager;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class tfe extends tfh {
    final /* synthetic */ tff a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tfe(tff tffVar, TelephonyManager telephonyManager) {
        super(tffVar.a, telephonyManager);
        this.a = tffVar;
    }

    @Override // android.telephony.PhoneStateListener
    public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
        this.a.d(telephonyDisplayInfo);
        a();
    }
}
