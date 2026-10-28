package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class khi extends gda implements IInterface {
    public khi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.internal.ICastDeviceController");
    }

    public final void a(kmv kmvVar) {
        Parcel parcelC = c();
        gdc.c(parcelC, kmvVar);
        f(1, parcelC);
    }

    public final void b(khk khkVar, kmv kmvVar) {
        Parcel parcelC = c();
        gdc.e(parcelC, khkVar);
        gdc.c(parcelC, kmvVar);
        f(18, parcelC);
    }

    public final void g(kmv kmvVar) {
        Parcel parcelC = c();
        gdc.c(parcelC, kmvVar);
        f(19, parcelC);
    }

    public final void h(String str, kmv kmvVar) {
        Parcel parcelC = c();
        parcelC.writeString(str);
        gdc.c(parcelC, kmvVar);
        f(12, parcelC);
    }
}
