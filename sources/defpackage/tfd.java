package defpackage;

import android.telephony.ServiceState;
import android.telephony.TelephonyManager;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class tfd implements tfg {
    final /* synthetic */ tfi a;
    private agev b = agdf.a;

    public tfd(tfi tfiVar) {
        this.a = tfiVar;
    }

    private static final boolean e(String str) {
        return str.contains("nrState=CONNECTED") || str.contains("nrState=NOT_RESTRICTED");
    }

    @Override // defpackage.tfg
    public final void a() {
        d(null);
    }

    @Override // defpackage.tfg
    public final void b(TelephonyManager telephonyManager) {
        try {
            telephonyManager.listen(new tfc(this, telephonyManager), 1);
        } catch (RuntimeException e) {
            ((agrc) ((agrc) ((agrc) tfi.a.b()).j(e)).k("com/google/android/libraries/youtube/common/network/Cellular5gDetector$Sdk29Detector", "record5gInfo", (char) 228, "Cellular5gDetector.java")).t("TelephonyManager threw error when registering listener.");
            this.a.e = false;
        }
    }

    @Override // defpackage.tfg
    public final boolean c() {
        return this.a.c() && e((String) this.b.e(""));
    }

    public final void d(ServiceState serviceState) {
        tfi tfiVar = this.a;
        synchronized (tfiVar) {
            try {
                if (serviceState == null) {
                    this.b = agdf.a;
                    tfiVar.d.kk(Boolean.FALSE);
                } else {
                    String string = serviceState.toString();
                    this.b = agev.i(string);
                    tfiVar.d.kk(Boolean.valueOf(e(string)));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
