package defpackage;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kvf extends kry {
    public static final kvg CREATOR = new kvg(0);
    final String a;
    final String b;
    final String c;
    final String d;
    final String e;
    final Bundle f;

    public kvf(String str, String str2, String str3, String str4, String str5, Bundle bundle) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        ksy.B(parcel, 2, this.a);
        ksy.B(parcel, 3, this.b);
        ksy.B(parcel, 4, this.c);
        ksy.B(parcel, 5, this.d);
        ksy.B(parcel, 6, this.e);
        ksy.p(parcel, 7, this.f);
        ksy.h(parcel, iG);
    }
}
