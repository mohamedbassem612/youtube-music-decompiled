package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kzq extends gda implements kzr {
    public kzq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // defpackage.kzr
    public final int a() {
        Parcel parcelD = d(2, c());
        int i = parcelD.readInt();
        parcelD.recycle();
        return i;
    }

    @Override // defpackage.kzr
    public final void b(String str, String str2, Bundle bundle, long j) {
        Parcel parcelC = c();
        parcelC.writeString(str);
        parcelC.writeString(str2);
        gdc.c(parcelC, bundle);
        parcelC.writeLong(j);
        e(1, parcelC);
    }
}
