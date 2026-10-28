package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kqf extends kry {
    public static final Parcelable.Creator CREATOR = new kpm(6);
    public final int a;
    public final String b;
    public final int c;
    public final int d;

    public kqf(int i, String str, int i2, int i3) {
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int iG = ksy.g(parcel, 20293);
        ksy.l(parcel, 1, i2);
        ksy.B(parcel, 2, this.b);
        ksy.l(parcel, 3, this.c);
        int i3 = this.d;
        ksy.l(parcel, 4, i3 > 0 ? i3 : 1);
        ksy.h(parcel, iG);
    }
}
