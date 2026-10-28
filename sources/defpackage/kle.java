package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kle extends kry {
    public static final Parcelable.Creator CREATOR = new kbc(16);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public int f;
    public final String g;

    public kle(String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.g = "fcm-25.1.2_1p";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iG = ksy.g(parcel, 20293);
        ksy.B(parcel, 1, str);
        ksy.B(parcel, 2, this.b);
        ksy.B(parcel, 3, this.c);
        ksy.B(parcel, 4, this.d);
        ksy.B(parcel, 5, this.e);
        ksy.l(parcel, 6, this.f);
        ksy.B(parcel, 7, this.g);
        ksy.h(parcel, iG);
    }

    public kle(String str, String str2, String str3, String str4, String str5, int i, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = i;
        this.g = str6;
    }
}
