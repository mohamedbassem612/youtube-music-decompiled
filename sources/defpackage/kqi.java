package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kqi extends kry {
    public static final Parcelable.Creator CREATOR = new fh(16);
    Bundle a;
    klq[] b;
    int c;
    public kqj d;
    kqk e;
    String f;

    public kqi(Bundle bundle, klq[] klqVarArr, int i, kqj kqjVar, kqk kqkVar, String str) {
        this.a = bundle;
        this.b = klqVarArr;
        this.c = i;
        this.d = kqjVar;
        this.e = kqkVar;
        this.f = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        ksy.p(parcel, 1, this.a);
        ksy.E(parcel, 2, this.b, i);
        ksy.l(parcel, 3, this.c);
        ksy.A(parcel, 4, this.d, i);
        ksy.A(parcel, 5, this.e, i);
        ksy.B(parcel, 6, this.f);
        ksy.h(parcel, iG);
    }

    public kqi() {
    }
}
