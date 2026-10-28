package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lsr extends kry {
    public static final Parcelable.Creator CREATOR = new lry(11);
    final int a;
    String b;
    final double c;
    String d;
    long e;
    final int f;

    public lsr(int i, String str, double d, String str2, long j, int i2) {
        this.a = i;
        this.b = str;
        this.c = d;
        this.d = str2;
        this.e = j;
        this.f = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        ksy.l(parcel, 2, this.a);
        ksy.B(parcel, 3, this.b);
        ksy.j(parcel, 4, this.c);
        ksy.B(parcel, 5, this.d);
        ksy.m(parcel, 6, this.e);
        ksy.l(parcel, 7, this.f);
        ksy.h(parcel, iG);
    }

    lsr() {
        this.f = -1;
        this.a = -1;
        this.c = -1.0d;
    }
}
