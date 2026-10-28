package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lok extends kry {
    public static final Parcelable.Creator CREATOR = new lof(3);
    final int a;
    final krq b;

    public lok(int i, krq krqVar) {
        this.a = i;
        this.b = krqVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        ksy.l(parcel, 1, this.a);
        ksy.A(parcel, 2, this.b, i);
        ksy.h(parcel, iG);
    }
}
