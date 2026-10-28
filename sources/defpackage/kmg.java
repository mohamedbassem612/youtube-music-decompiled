package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kmg extends kry {
    public static final Parcelable.Creator CREATOR = new kbc(18);
    public final boolean a;
    public final String b;
    public final int c;
    public final int d;
    public final long e;

    public kmg(boolean z, String str, int i, int i2, long j) {
        this.a = z;
        this.b = str;
        this.c = ket.B(i) - 1;
        this.d = ket.C(i2) - 1;
        this.e = j;
    }

    public final int a() {
        return ket.B(this.c);
    }

    public final void b() {
        ket.C(this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.a;
        int iG = ksy.g(parcel, 20293);
        ksy.i(parcel, 1, z);
        ksy.B(parcel, 2, this.b);
        ksy.l(parcel, 3, this.c);
        ksy.l(parcel, 4, this.d);
        ksy.m(parcel, 5, this.e);
        ksy.h(parcel, iG);
    }
}
