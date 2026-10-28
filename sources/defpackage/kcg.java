package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kcg extends gda implements kch {
    public kcg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.ISession");
    }

    @Override // defpackage.kch
    public final int a() {
        Parcel parcelD = d(17, c());
        int i = parcelD.readInt();
        parcelD.recycle();
        return i;
    }

    @Override // defpackage.kch
    public final int b() {
        Parcel parcelD = d(18, c());
        int i = parcelD.readInt();
        parcelD.recycle();
        return i;
    }

    @Override // defpackage.kch
    public final kuo g() {
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

    @Override // defpackage.kch
    public final void h(int i) {
        Parcel parcelC = c();
        parcelC.writeInt(i);
        e(13, parcelC);
    }

    @Override // defpackage.kch
    public final boolean i() {
        Parcel parcelD = d(5, c());
        boolean zF = gdc.f(parcelD);
        parcelD.recycle();
        return zF;
    }

    @Override // defpackage.kch
    public final boolean j() {
        Parcel parcelD = d(9, c());
        boolean zF = gdc.f(parcelD);
        parcelD.recycle();
        return zF;
    }

    @Override // defpackage.kch
    public final void k() {
        Parcel parcelC = c();
        parcelC.writeInt(2153);
        e(15, parcelC);
    }

    @Override // defpackage.kch
    public final void l() {
        Parcel parcelC = c();
        parcelC.writeInt(2151);
        e(12, parcelC);
    }
}
