package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lqk extends kry {
    public static final Parcelable.Creator CREATOR = new lof(16);
    public double a;
    public double b;

    public lqk(double d, double d2) {
        this.a = d;
        this.b = d2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        ksy.j(parcel, 2, this.a);
        ksy.j(parcel, 3, this.b);
        ksy.h(parcel, iG);
    }

    public lqk() {
    }
}
