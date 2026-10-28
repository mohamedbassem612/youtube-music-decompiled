package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lqj extends kry {
    public static final Parcelable.Creator CREATOR = new lof(15);
    public int a;
    public String b;
    public String c;
    public String d;

    public lqj(int i, String str, String str2, String str3) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        ksy.l(parcel, 2, this.a);
        ksy.B(parcel, 3, this.b);
        ksy.B(parcel, 4, this.c);
        ksy.B(parcel, 5, this.d);
        ksy.h(parcel, iG);
    }

    public lqj() {
    }
}
