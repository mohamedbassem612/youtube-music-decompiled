package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lnp extends kry {
    public static final Parcelable.Creator CREATOR = new kvu(19);
    public String a;
    public String b;
    public String[] c;
    public int d;
    public int e;
    public jxb f;
    public Bundle g;

    public lnp(String str, String str2, String[] strArr, int i, int i2, jxb jxbVar, Bundle bundle) {
        this.a = str;
        this.b = str2;
        this.c = strArr;
        this.d = i;
        this.e = i2;
        this.f = jxbVar;
        this.g = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        ksy.B(parcel, 1, this.a);
        ksy.B(parcel, 2, this.b);
        ksy.C(parcel, 3, this.c);
        ksy.l(parcel, 4, this.d);
        ksy.l(parcel, 5, this.e);
        ksy.A(parcel, 6, this.f, i);
        ksy.p(parcel, 7, this.g);
        ksy.h(parcel, iG);
    }
}
