package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lqy extends kry {
    public static final Parcelable.Creator CREATOR = new lqu(2);
    public int a;
    public int b;
    public int c;
    public long d;
    public int e;

    public lqy(int i, int i2, int i3, long j, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = j;
        this.e = i4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        ksy.l(parcel, 2, this.a);
        ksy.l(parcel, 3, this.b);
        ksy.l(parcel, 4, this.c);
        ksy.m(parcel, 5, this.d);
        ksy.l(parcel, 6, this.e);
        ksy.h(parcel, iG);
    }
}
