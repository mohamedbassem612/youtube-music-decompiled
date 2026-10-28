package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.time.Instant;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kkp extends kry {
    public static final Parcelable.Creator CREATOR = new kbc(13);
    public final boolean a;
    public final long b;

    public kkp(boolean z, long j) {
        this.a = z;
        this.b = j;
    }

    public final Instant a() {
        return Instant.ofEpochMilli(this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.a;
        int iG = ksy.g(parcel, 20293);
        ksy.i(parcel, 1, z);
        ksy.m(parcel, 2, this.b);
        ksy.h(parcel, iG);
    }
}
