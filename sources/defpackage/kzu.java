package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kzu extends kry {
    public static final Parcelable.Creator CREATOR = new kwo(2);
    public final long a;
    public final long b;
    public final boolean c;
    public final Bundle d;
    public final String e;

    public kzu(long j, long j2, boolean z, Bundle bundle, String str) {
        this.a = j;
        this.b = j2;
        this.c = z;
        this.d = bundle;
        this.e = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        ksy.m(parcel, 1, this.a);
        ksy.m(parcel, 2, this.b);
        ksy.i(parcel, 3, this.c);
        ksy.p(parcel, 7, this.d);
        ksy.B(parcel, 8, this.e);
        ksy.h(parcel, iG);
    }
}
