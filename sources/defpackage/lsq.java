package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lsq extends kry {
    public static final Parcelable.Creator CREATOR = new lry(12);
    String a;
    lsr b;

    @Deprecated
    lst c;

    public lsq(String str, lsr lsrVar, lst lstVar) {
        this.a = str;
        this.b = lsrVar;
        this.c = lstVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        ksy.B(parcel, 2, this.a);
        ksy.A(parcel, 3, this.b, i);
        ksy.A(parcel, 5, this.c, i);
        ksy.h(parcel, iG);
    }

    lsq() {
    }
}
