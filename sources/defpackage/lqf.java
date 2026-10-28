package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lqf extends kry {
    public static final Parcelable.Creator CREATOR = new lof(11);
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public String h;

    public lqf(int i, int i2, int i3, int i4, int i5, int i6, boolean z, String str) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = z;
        this.h = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        ksy.l(parcel, 2, this.a);
        ksy.l(parcel, 3, this.b);
        ksy.l(parcel, 4, this.c);
        ksy.l(parcel, 5, this.d);
        ksy.l(parcel, 6, this.e);
        ksy.l(parcel, 7, this.f);
        ksy.i(parcel, 8, this.g);
        ksy.B(parcel, 9, this.h);
        ksy.h(parcel, iG);
    }

    public lqf() {
    }
}
