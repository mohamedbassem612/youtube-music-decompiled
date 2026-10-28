package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class epv extends gda implements IInterface {
    public epv(IBinder iBinder) {
        super(iBinder, "com.android.vending.billing.IInAppBillingService");
    }

    public final int a(int i, String str, String str2) {
        Parcel parcelC = c();
        parcelC.writeInt(i);
        parcelC.writeString(str);
        parcelC.writeString(str2);
        Parcel parcelD = d(1, parcelC);
        int i2 = parcelD.readInt();
        parcelD.recycle();
        return i2;
    }

    public final int b(int i, String str, String str2, Bundle bundle) {
        Parcel parcelC = c();
        parcelC.writeInt(i);
        parcelC.writeString(str);
        parcelC.writeString(str2);
        gdc.c(parcelC, bundle);
        Parcel parcelD = d(10, parcelC);
        int i2 = parcelD.readInt();
        parcelD.recycle();
        return i2;
    }
}
