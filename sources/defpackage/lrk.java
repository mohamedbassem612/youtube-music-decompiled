package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class lrk extends kry {
    public static final Parcelable.Creator CREATOR = new lqu(13);
    final String a;
    final String b;
    final int c;
    final int d;

    public lrk(String str, String str2, int i, int i2) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        ksy.B(parcel, 2, this.a);
        ksy.B(parcel, 3, this.b);
        ksy.l(parcel, 4, this.c);
        ksy.l(parcel, 5, this.d);
        ksy.h(parcel, iG);
    }
}
