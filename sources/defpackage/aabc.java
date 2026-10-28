package defpackage;

import android.app.NotificationManager;
import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aabc implements aabo {
    private final Context a;

    public aabc(Context context) {
        this.a = context;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0031  */
    /* JADX WARN: Code duplicated, block: B:21:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.aabo
    public final void a(ajda ajdaVar, xgn xgnVar, aabr aabrVar, atr atrVar) {
        if (ajdaVar != null) {
            ajcu ajcuVar = ajdaVar.e;
            if (ajcuVar == null) {
                ajcuVar = ajcu.a;
            }
            int iH = agvp.H(ajcuVar.s);
            if (iH == 0) {
                iH = 1;
            }
            if (iH != 1) {
                NotificationManager notificationManager = (NotificationManager) this.a.getSystemService("notification");
                String string = Integer.toString(iH - 1);
                if (notificationManager.getNotificationChannel(string) != null) {
                    atrVar.E = string;
                    if (!ajcuVar.q) {
                        return;
                    }
                } else {
                    atrVar.E = "generic_notifications";
                    if (ajcuVar.n) {
                        return;
                    }
                }
            } else {
                atrVar.E = "generic_notifications";
                if (ajcuVar.n) {
                    return;
                }
            }
            atrVar.H = 1;
        }
    }
}
