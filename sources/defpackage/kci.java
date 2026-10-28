package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kci extends gda implements kcj {
    public kci(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.ISessionManager");
    }

    @Override // defpackage.kcj
    public final kuo a() {
        kuo kumVar;
        Parcel parcelD = d(1, c());
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

    @Override // defpackage.kcj
    public final kuo b() {
        kuo kumVar;
        Parcel parcelD = d(7, c());
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

    @Override // defpackage.kcj
    public final void g(boolean z) {
        Parcel parcelC = c();
        ClassLoader classLoader = gdc.a;
        parcelC.writeInt(1);
        parcelC.writeInt(z ? 1 : 0);
        e(6, parcelC);
    }

    @Override // defpackage.kcj
    public final void h(kck kckVar) {
        Parcel parcelC = c();
        ClassLoader classLoader = gdc.a;
        parcelC.writeStrongBinder(kckVar);
        e(2, parcelC);
    }
}
