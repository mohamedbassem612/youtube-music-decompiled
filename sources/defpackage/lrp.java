package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lrp extends kry {
    public static final Parcelable.Creator CREATOR = new lqu(15);
    String a;
    int b;
    boolean c;
    String d;
    String e;
    String f;
    String g;
    String h;
    String i;

    public lrp(String str, int i, boolean z, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.a = str;
        this.b = i;
        this.c = z;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        ksy.B(parcel, 1, this.a);
        ksy.l(parcel, 2, this.b);
        ksy.i(parcel, 3, this.c);
        ksy.B(parcel, 4, this.d);
        ksy.B(parcel, 5, this.e);
        ksy.B(parcel, 6, this.f);
        ksy.B(parcel, 7, this.g);
        ksy.B(parcel, 8, this.h);
        ksy.B(parcel, 9, this.i);
        ksy.h(parcel, iG);
    }

    private lrp() {
    }
}
