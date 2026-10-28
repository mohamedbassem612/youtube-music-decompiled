package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kqa extends kry {
    public static final Parcelable.Creator CREATOR = new kpm(5);
    public final int a;
    public final String b;
    public final long c;
    public final int d;
    public final boolean e;

    public kqa(int i, String str, long j, int i2, boolean z) {
        this.a = i;
        this.b = str;
        this.c = j;
        this.d = i2;
        this.e = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int iG = ksy.g(parcel, 20293);
        ksy.l(parcel, 1, i2);
        ksy.B(parcel, 2, this.b);
        ksy.m(parcel, 3, this.c);
        ksy.l(parcel, 4, this.d);
        ksy.i(parcel, 5, this.e);
        ksy.h(parcel, iG);
    }
}
