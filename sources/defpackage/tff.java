package defpackage;

import android.telephony.TelephonyDisplayInfo;
import android.telephony.TelephonyManager;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class tff implements tfg {
    final /* synthetic */ tfi a;
    private boolean b;

    public tff(tfi tfiVar) {
        this.a = tfiVar;
    }

    @Override // defpackage.tfg
    public final void a() {
        d(null);
    }

    @Override // defpackage.tfg
    public final void b(TelephonyManager telephonyManager) {
        try {
            telephonyManager.listen(new tfe(this, telephonyManager), 1048576);
        } catch (RuntimeException e) {
            ((agrc) ((agrc) ((agrc) tfi.a.b()).j(e)).k("com/google/android/libraries/youtube/common/network/Cellular5gDetector$Sdk31Detector", "record5gInfo", (char) 286, "Cellular5gDetector.java")).t("TelephonyManager threw error when registering listener.");
            this.a.e = false;
        }
    }

    @Override // defpackage.tfg
    public final boolean c() {
        return this.a.c() && this.b;
    }

    public final void d(TelephonyDisplayInfo telephonyDisplayInfo) {
        boolean z;
        tfi tfiVar = this.a;
        synchronized (tfiVar) {
            try {
                if (telephonyDisplayInfo == null) {
                    this.b = false;
                    tfiVar.d.kk(Boolean.FALSE);
                } else {
                    int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
                    if (overrideNetworkType == 4) {
                        z = true;
                    } else if (overrideNetworkType == 5) {
                        overrideNetworkType = 5;
                        z = true;
                    } else {
                        z = false;
                    }
                    boolean z2 = z || overrideNetworkType == 3;
                    this.b = z2;
                    tfiVar.d.kk(Boolean.valueOf(z2));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
