package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lql extends kry {
    public static final Parcelable.Creator CREATOR = new lof(17);
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;

    public lql(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        ksy.B(parcel, 2, this.a);
        ksy.B(parcel, 3, this.b);
        ksy.B(parcel, 4, this.c);
        ksy.B(parcel, 5, this.d);
        ksy.B(parcel, 6, this.e);
        ksy.B(parcel, 7, this.f);
        ksy.B(parcel, 8, this.g);
        ksy.h(parcel, iG);
    }

    public lql() {
    }
}
