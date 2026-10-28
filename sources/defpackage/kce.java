package defpackage;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kce extends gda implements kcf {
    public kce(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.IReconnectionService");
    }

    @Override // defpackage.kcf
    public final int a(Intent intent, int i, int i2) {
        Parcel parcelC = c();
        gdc.c(parcelC, intent);
        parcelC.writeInt(i);
        parcelC.writeInt(i2);
        Parcel parcelD = d(2, parcelC);
        int i3 = parcelD.readInt();
        parcelD.recycle();
        return i3;
    }

    @Override // defpackage.kcf
    public final IBinder b(Intent intent) {
        Parcel parcelC = c();
        gdc.c(parcelC, intent);
        Parcel parcelD = d(3, parcelC);
        IBinder strongBinder = parcelD.readStrongBinder();
        parcelD.recycle();
        return strongBinder;
    }

    @Override // defpackage.kcf
    public final void g() {
        e(1, c());
    }

    @Override // defpackage.kcf
    public final void h() {
        e(4, c());
    }
}
