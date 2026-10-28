package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lqg extends kry {
    public static final Parcelable.Creator CREATOR = new lof(12);
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public lqf f;
    public lqf g;

    public lqg(String str, String str2, String str3, String str4, String str5, lqf lqfVar, lqf lqfVar2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = lqfVar;
        this.g = lqfVar2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        ksy.B(parcel, 2, this.a);
        ksy.B(parcel, 3, this.b);
        ksy.B(parcel, 4, this.c);
        ksy.B(parcel, 5, this.d);
        ksy.B(parcel, 6, this.e);
        ksy.A(parcel, 7, this.f, i);
        ksy.A(parcel, 8, this.g, i);
        ksy.h(parcel, iG);
    }

    public lqg() {
    }
}
