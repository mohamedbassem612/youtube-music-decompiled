package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.vr.ndk.base.DaydreamApi;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aujn implements ServiceConnection {
    final /* synthetic */ DaydreamApi a;

    public aujn(DaydreamApi daydreamApi) {
        this.a = daydreamApi;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        auki aukiVar;
        aukf aukfVar = null;
        if (iBinder == null) {
            aukiVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.vr.vrcore.common.api.IVrCoreSdkService");
            aukiVar = iInterfaceQueryLocalInterface instanceof auki ? (auki) iInterfaceQueryLocalInterface : new auki(iBinder);
        }
        DaydreamApi daydreamApi = this.a;
        daydreamApi.e = aukiVar;
        try {
            auki aukiVar2 = daydreamApi.e;
            Parcel parcelD = aukiVar2.d(2, aukiVar2.c());
            IBinder strongBinder = parcelD.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface2 = strongBinder.queryLocalInterface("com.google.vr.vrcore.common.api.IDaydreamManager");
                aukfVar = iInterfaceQueryLocalInterface2 instanceof aukf ? (aukf) iInterfaceQueryLocalInterface2 : new aukf(strongBinder);
            }
            parcelD.recycle();
            daydreamApi.f = aukfVar;
        } catch (RemoteException unused) {
            Log.e("DaydreamApi", "RemoteException in onServiceConnected");
        }
        DaydreamApi daydreamApi2 = this.a;
        if (daydreamApi2.f == null) {
            Log.w("DaydreamApi", "Daydream service component unavailable.");
        }
        ArrayList arrayList = daydreamApi2.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((Runnable) arrayList.get(i)).run();
        }
        arrayList.clear();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.a.e = null;
    }
}
