package defpackage;

import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
class tfh extends PhoneStateListener {
    private final TelephonyManager a;
    final /* synthetic */ tfi b;

    public tfh(tfi tfiVar, TelephonyManager telephonyManager) {
        this.b = tfiVar;
        this.a = telephonyManager;
    }

    final void a() {
        try {
            try {
                this.a.listen(this, 0);
            } catch (RuntimeException e) {
                ((agrc) ((agrc) ((agrc) tfi.a.b()).j(e)).k("com/google/android/libraries/youtube/common/network/Cellular5gDetector$UnregisterablePhoneStateListener", "unregister", 325, "Cellular5gDetector.java")).t("TelephonyManager threw error when unregistering listener.");
            }
        } finally {
            this.b.e = false;
        }
    }
}
