package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kwx extends gda implements kwz {
    public kwx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    @Override // defpackage.kwz
    public final void a() {
        e(3, c());
    }

    @Override // defpackage.kwz
    public final void b(int i) {
        Parcel parcelC = c();
        parcelC.writeInt(i);
        e(7, parcelC);
    }

    @Override // defpackage.kwz
    public final void g(int i) {
        Parcel parcelC = c();
        parcelC.writeInt(i);
        e(6, parcelC);
    }

    @Override // defpackage.kwz
    public final void h(byte[] bArr) {
        Parcel parcelC = c();
        parcelC.writeByteArray(bArr);
        e(5, parcelC);
    }

    @Override // defpackage.kwz
    public final void i(kuo kuoVar, String str) {
        Parcel parcelC = c();
        gdc.e(parcelC, kuoVar);
        parcelC.writeString(str);
        parcelC.writeString(null);
        e(8, parcelC);
    }

    @Override // defpackage.kwz
    public final void j() {
        Parcel parcelC = c();
        parcelC.writeIntArray(null);
        e(4, parcelC);
    }
}
