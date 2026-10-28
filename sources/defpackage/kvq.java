package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kvq extends kry {
    public static final Parcelable.Creator CREATOR = new kpm(16);
    final String a;
    final boolean b;
    final boolean c;
    final boolean d;
    final boolean e;
    final kvt[] f;
    final boolean g;

    public kvq(String str, boolean z, boolean z2, boolean z3, boolean z4, kvt[] kvtVarArr, boolean z5) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = kvtVarArr;
        this.g = z5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        ksy.B(parcel, 2, this.a);
        ksy.i(parcel, 3, this.b);
        ksy.i(parcel, 4, this.c);
        ksy.i(parcel, 5, this.d);
        ksy.i(parcel, 6, this.e);
        ksy.E(parcel, 7, this.f, i);
        ksy.i(parcel, 8, this.g);
        ksy.h(parcel, iG);
    }
}
