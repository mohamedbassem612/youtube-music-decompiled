package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jyh extends kry {
    public static final Parcelable.Creator CREATOR = new jwx(15);
    public final String a;
    public final byte[] b;
    public final String c;
    public final String d;
    public final String e;

    public jyh(String str, String str2, String str3, String str4, byte[] bArr) {
        this.a = str;
        this.d = str3;
        this.c = str2;
        this.e = str4;
        this.b = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iG = ksy.g(parcel, 20293);
        ksy.B(parcel, 1, str);
        ksy.B(parcel, 3, this.c);
        ksy.B(parcel, 4, this.d);
        ksy.B(parcel, 5, this.e);
        ksy.q(parcel, 6, this.b);
        ksy.h(parcel, iG);
    }
}
