package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lst extends kry {
    public static final Parcelable.Creator CREATOR = new lry(14);
    long a;
    long b;

    public lst(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        ksy.m(parcel, 2, this.a);
        ksy.m(parcel, 3, this.b);
        ksy.h(parcel, iG);
    }

    lst() {
    }
}
