package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.googlehelp.GoogleHelp;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kxe extends kry {
    public static final Parcelable.Creator CREATOR = new kvg(1);
    public GoogleHelp a;
    public final String b;
    public final String c;
    public final int d;
    public final String e;
    public final int f;
    public final String g;

    public kxe(GoogleHelp googleHelp, String str, String str2, int i, String str3, int i2, String str4) {
        this.a = googleHelp;
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = str3;
        this.f = i2;
        this.g = str4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        ksy.A(parcel, 1, this.a, i);
        ksy.B(parcel, 2, this.b);
        ksy.B(parcel, 3, this.c);
        ksy.l(parcel, 4, this.d);
        ksy.B(parcel, 5, this.e);
        ksy.l(parcel, 6, this.f);
        ksy.B(parcel, 7, this.g);
        ksy.h(parcel, iG);
    }
}
