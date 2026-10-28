package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kvv extends kry {
    public static final Parcelable.Creator CREATOR = new kpm(17);
    public int a;
    int b;

    public kvv(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        ksy.l(parcel, 2, this.a);
        ksy.l(parcel, 3, this.b);
        ksy.h(parcel, iG);
    }

    public kvv() {
        throw null;
    }
}
