package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lrj extends kry {
    public static final Parcelable.Creator CREATOR = new lqu(12);
    int a;
    String b;

    public lrj(int i, String str) {
        this.a = i;
        this.b = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        ksy.l(parcel, 2, this.a);
        ksy.B(parcel, 3, this.b);
        ksy.h(parcel, iG);
    }

    private lrj() {
    }
}
