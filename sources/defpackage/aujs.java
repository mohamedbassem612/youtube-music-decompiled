package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.vr.ndk.base.DaydreamApi;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aujs implements Runnable {
    private final /* synthetic */ int $cid;
    final /* synthetic */ PendingIntent a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;

    public aujs(DaydreamApi daydreamApi, PendingIntent pendingIntent, ComponentName componentName, int i) {
        this.$cid = i;
        this.a = pendingIntent;
        this.c = componentName;
        this.b = daydreamApi;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r6v4, types: [android.os.Parcelable, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        if (this.$cid != 0) {
            aukf aukfVar = ((DaydreamApi) this.b).f;
            if (aukfVar == null) {
                Log.w("DaydreamApi", "Can't launch PendingIntent via DaydreamManager: not available.");
                try {
                    this.a.send();
                    return;
                } catch (Exception e) {
                    Log.e("DaydreamApi", "Couldn't launch PendingIntent: ", e);
                    return;
                }
            }
            try {
                PendingIntent pendingIntent = this.a;
                ?? r6 = this.c;
                Parcel parcelC = aukfVar.c();
                gdc.c(parcelC, pendingIntent);
                gdc.c(parcelC, r6);
                Parcel parcelD = aukfVar.d(7, parcelC);
                gdc.f(parcelD);
                parcelD.recycle();
                return;
            } catch (RemoteException e2) {
                Log.e("DaydreamApi", "RemoteException while launching PendingIntent in VR.", e2);
                return;
            }
        }
        Object obj = this.c;
        aukf aukfVar2 = ((DaydreamApi) obj).f;
        if (aukfVar2 == null) {
            Log.w("DaydreamApi", "Failed to exit VR: Daydream service unavailable.");
            this.b.run();
            return;
        }
        try {
            if (((DaydreamApi) obj).c >= 23) {
                Bundle bundle = new Bundle();
                bundle.putParcelable("EXIT_VR_INTENT_KEY", this.a);
                bundle.putString("EXIT_VR_TEXT_KEY", null);
                aukf aukfVar3 = ((DaydreamApi) obj).f;
                Parcel parcelC2 = aukfVar3.c();
                gdc.c(parcelC2, bundle);
                Parcel parcelD2 = aukfVar3.d(17, parcelC2);
                boolean zF = gdc.f(parcelD2);
                parcelD2.recycle();
                if (!zF) {
                    Log.w("DaydreamApi", "Failed to exit VR: Invalid request.");
                    this.b.run();
                }
            } else {
                PendingIntent pendingIntent2 = this.a;
                Parcel parcelC3 = aukfVar2.c();
                gdc.c(parcelC3, pendingIntent2);
                Parcel parcelD3 = aukfVar2.d(10, parcelC3);
                boolean zF2 = gdc.f(parcelD3);
                parcelD3.recycle();
                if (!zF2) {
                    Log.w("DaydreamApi", "Failed to exit VR: Invalid request.");
                    this.b.run();
                }
            }
        } catch (RemoteException e3) {
            Log.e("DaydreamApi", "Failed to exit VR: RemoteException while exiting:".concat(e3.toString()));
            this.b.run();
        }
    }

    public aujs(DaydreamApi daydreamApi, Runnable runnable, PendingIntent pendingIntent, int i) {
        this.$cid = i;
        this.b = runnable;
        this.a = pendingIntent;
        this.c = daydreamApi;
    }
}
