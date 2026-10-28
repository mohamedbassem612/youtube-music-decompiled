package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jww extends kry {
    public static final Parcelable.Creator CREATOR = new jwx(0);
    public final String a;
    public final int b;

    public jww(String str, int i) {
        this.a = str;
        this.b = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iG = ksy.g(parcel, 20293);
        ksy.B(parcel, 1, str);
        ksy.l(parcel, 2, this.b);
        ksy.h(parcel, iG);
    }
}
