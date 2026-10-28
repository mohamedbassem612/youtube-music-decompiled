package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kdr extends gda implements kds {
    public kdr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.internal.IMediaRouterCallback");
    }

    @Override // defpackage.kds
    public final int a() {
        Parcel parcelD = d(7, c());
        int i = parcelD.readInt();
        parcelD.recycle();
        return i;
    }

    @Override // defpackage.kds
    public final void b(String str, Bundle bundle) {
        Parcel parcelC = c();
        parcelC.writeString(str);
        gdc.c(parcelC, bundle);
        e(1, parcelC);
    }

    @Override // defpackage.kds
    public final void g(String str, Bundle bundle) {
        Parcel parcelC = c();
        parcelC.writeString(str);
        gdc.c(parcelC, bundle);
        e(2, parcelC);
    }

    @Override // defpackage.kds
    public final void h(String str, String str2, Bundle bundle) {
        Parcel parcelC = c();
        parcelC.writeString(str);
        parcelC.writeString(str2);
        gdc.c(parcelC, bundle);
        e(9, parcelC);
    }

    @Override // defpackage.kds
    public final void i(String str, String str2, Bundle bundle, int i) {
        Parcel parcelC = c();
        parcelC.writeString(str);
        parcelC.writeString(str2);
        gdc.c(parcelC, bundle);
        parcelC.writeInt(i);
        e(10, parcelC);
    }

    @Override // defpackage.kds
    public final void j(String str, Bundle bundle) {
        Parcel parcelC = c();
        parcelC.writeString(str);
        gdc.c(parcelC, bundle);
        e(3, parcelC);
    }

    @Override // defpackage.kds
    public final void k(String str, Bundle bundle) {
        Parcel parcelC = c();
        parcelC.writeString(str);
        gdc.c(parcelC, bundle);
        e(4, parcelC);
    }

    @Override // defpackage.kds
    public final void l(String str, String str2, Bundle bundle) {
        Parcel parcelC = c();
        parcelC.writeString(str);
        parcelC.writeString(str2);
        gdc.c(parcelC, bundle);
        e(8, parcelC);
    }

    @Override // defpackage.kds
    public final void m(String str, Bundle bundle, int i) {
        Parcel parcelC = c();
        parcelC.writeString(str);
        gdc.c(parcelC, bundle);
        parcelC.writeInt(i);
        e(6, parcelC);
    }
}
