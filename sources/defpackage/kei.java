package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kei extends gda implements kej {
    public kei(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.media.IImagePicker");
    }

    @Override // defpackage.kej
    public final kuo a() {
        kuo kumVar;
        Parcel parcelD = d(2, c());
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
