package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jxi extends kry {
    public static final Parcelable.Creator CREATOR = new jwx(7);
    public final String a;
    public final boolean b;
    public final int c;

    public jxi(String str, boolean z, int i) {
        this.a = str;
        this.b = z;
        this.c = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        ksy.B(parcel, 1, this.a);
        ksy.i(parcel, 2, this.b);
        ksy.l(parcel, 3, this.c);
        ksy.h(parcel, iG);
    }
}
