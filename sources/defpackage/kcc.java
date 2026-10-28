package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kcc extends gda implements kcd {
    public kcc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.IDiscoveryManager");
    }

    @Override // defpackage.kcd
    public final kuo a() {
        kuo kumVar;
        Parcel parcelD = d(5, c());
        IBinder strongBinder = parcelD.readStrongBinder();
        if (strongBinder == null) {
            kumVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            kumVar = iInterfaceQueryLocalInterface instanceof kuo ? (kuo) iInterfaceQueryLocalInterface : new kum(strongBinder);
        }
        parcelD.recycle();
        return kumVar;
    }
}
