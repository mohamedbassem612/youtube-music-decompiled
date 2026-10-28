package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class krt extends kry {
    public static final Parcelable.Creator CREATOR = new fh(19);
    public final int a;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final int e;

    public krt(int i, boolean z, boolean z2, int i2, int i3) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = i2;
        this.e = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int iG = ksy.g(parcel, 20293);
        ksy.l(parcel, 1, i2);
        ksy.i(parcel, 2, this.b);
        ksy.i(parcel, 3, this.c);
        ksy.l(parcel, 4, this.d);
        ksy.l(parcel, 5, this.e);
        ksy.h(parcel, iG);
    }
}
