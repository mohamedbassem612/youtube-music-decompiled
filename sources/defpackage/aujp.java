package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.vr.ndk.base.DaydreamApi;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aujp implements Runnable {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;

    public aujp(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$cid;
        if (i != 0) {
            if (i != 1) {
                try {
                    ((PendingIntent) this.a).send(0);
                    return;
                } catch (Exception e) {
                    Log.e("DaydreamApi", "Couldn't launch PendingIntent: ".concat(e.toString()));
                    return;
                }
            }
            DaydreamApi daydreamApi = (DaydreamApi) this.a;
            Context applicationContext = daydreamApi.a;
            if (applicationContext.getApplicationContext() != null) {
                applicationContext = applicationContext.getApplicationContext();
            }
            applicationContext.unbindService(daydreamApi.d);
            daydreamApi.e = null;
            return;
        }
        aukf aukfVar = ((DaydreamApi) this.a).f;
        if (aukfVar == null) {
            Log.e("DaydreamApi", "Can't launch VR homescreen via DaydreamManager. Giving up trying to leave current VR activity...");
            return;
        }
        try {
            Parcel parcelD = aukfVar.d(8, aukfVar.c());
            boolean zF = gdc.f(parcelD);
            parcelD.recycle();
            if (zF) {
                return;
            }
            Log.e("DaydreamApi", "There is no VR homescreen installed.");
        } catch (RemoteException e2) {
            Log.e("DaydreamApi", "RemoteException while launching VR homescreen: ".concat(e2.toString()));
        }
    }
}
