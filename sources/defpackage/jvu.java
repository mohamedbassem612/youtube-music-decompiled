package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jvu extends gda implements jvw {
    public jvu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.adshield.internal.IAdShieldClient");
    }

    @Override // defpackage.jvw
    public final String a(kuo kuoVar, String str) {
        Parcel parcelC = c();
        gdc.e(parcelC, kuoVar);
        parcelC.writeString(str);
        Parcel parcelD = d(8, parcelC);
        String string = parcelD.readString();
        parcelD.recycle();
        return string;
    }

    @Override // defpackage.jvw
    public final String b(kuo kuoVar) {
        Parcel parcelC = c();
        gdc.e(parcelC, kuoVar);
        Parcel parcelD = d(13, parcelC);
        String string = parcelD.readString();
        parcelD.recycle();
        return string;
    }
}
