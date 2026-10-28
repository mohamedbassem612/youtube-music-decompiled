package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.vr.ndk.base.DaydreamApi;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aujo implements Runnable {
    final /* synthetic */ aukh a;
    final /* synthetic */ DaydreamApi b;

    public aujo(DaydreamApi daydreamApi, aukh aukhVar) {
        this.a = aukhVar;
        this.b = daydreamApi;
    }

    @Override // java.lang.Runnable
    public final void run() {
        aukf aukfVar = this.b.f;
        if (aukfVar != null) {
            try {
                aukh aukhVar = this.a;
                Parcel parcelC = aukfVar.c();
                gdc.e(parcelC, aukhVar);
                Parcel parcelD = aukfVar.d(9, parcelC);
                boolean zF = gdc.f(parcelD);
                parcelD.recycle();
                if (zF) {
                    return;
                }
            } catch (RemoteException e) {
                Log.e("DaydreamApi", "RemoteException while launching VR transition: ", e);
            }
        }
        Log.w("DaydreamApi", "Can't launch callbacks via DaydreamManager, sending manually");
        try {
            this.a.b();
        } catch (RemoteException unused) {
        }
    }
}
