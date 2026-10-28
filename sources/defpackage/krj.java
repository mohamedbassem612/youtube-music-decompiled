package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class krj extends kry {
    public static final Parcelable.Creator CREATOR = new fh(18);
    public final int a;
    public final int b;
    public final int c;
    public final long d;
    public final long e;
    public final String f;
    public final String g;
    public final int h;
    public final int i;

    public krj(int i, int i2, int i3, long j, long j2, String str, String str2, int i4, int i5) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = j;
        this.e = j2;
        this.f = str;
        this.g = str2;
        this.h = i4;
        this.i = i5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int iG = ksy.g(parcel, 20293);
        ksy.l(parcel, 1, i2);
        ksy.l(parcel, 2, this.b);
        ksy.l(parcel, 3, this.c);
        ksy.m(parcel, 4, this.d);
        ksy.m(parcel, 5, this.e);
        ksy.B(parcel, 6, this.f);
        ksy.B(parcel, 7, this.g);
        ksy.l(parcel, 8, this.h);
        ksy.l(parcel, 9, this.i);
        ksy.h(parcel, iG);
    }
}
