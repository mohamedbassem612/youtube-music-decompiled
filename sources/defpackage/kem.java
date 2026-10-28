package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kem extends kry {
    public static final Parcelable.Creator CREATOR = new kbc(2);
    public final int a;
    public final int b;
    public final int c;

    public kem(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int iG = ksy.g(parcel, 20293);
        ksy.l(parcel, 2, i2);
        ksy.l(parcel, 3, this.b);
        ksy.l(parcel, 4, this.c);
        ksy.h(parcel, iG);
    }
}
