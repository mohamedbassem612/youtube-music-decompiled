package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lri extends kry {
    public static final Parcelable.Creator CREATOR = new lqu(11);
    final String a;

    public lri(String str) {
        kro.m(str, "responseJson cannot be null!");
        this.a = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        ksy.B(parcel, 1, this.a);
        ksy.h(parcel, iG);
    }
}
