package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lsf extends kry {
    public static final Parcelable.Creator CREATOR = new lry(4);
    final int a;
    final String b;

    public lsf(int i, String str) {
        this.a = i;
        this.b = str;
        kro.d(i > 0, "SecurePaymentsData.key must be > 0");
        kro.d(str != null, "SecurePaymentsData.value must not be null");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        ksy.l(parcel, 2, this.a);
        ksy.B(parcel, 3, this.b);
        ksy.h(parcel, iG);
    }
}
