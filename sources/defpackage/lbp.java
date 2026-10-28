package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lbp extends kry {
    public static final Parcelable.Creator CREATOR = new kvg(13);
    public final long a;
    public final int b;
    public final long c;

    public lbp(long j, int i, long j2) {
        this.a = j;
        this.b = i;
        this.c = j2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        ksy.m(parcel, 1, this.a);
        ksy.l(parcel, 2, this.b);
        ksy.m(parcel, 3, this.c);
        ksy.h(parcel, iG);
    }
}
