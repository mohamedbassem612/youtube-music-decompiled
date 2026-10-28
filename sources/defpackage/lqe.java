package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lqe extends kry {
    public static final Parcelable.Creator CREATOR = new lof(10);
    public final int a;
    public final String[] b;

    public lqe(int i, String[] strArr) {
        this.a = i;
        this.b = strArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        ksy.l(parcel, 2, this.a);
        ksy.C(parcel, 3, this.b);
        ksy.h(parcel, iG);
    }
}
