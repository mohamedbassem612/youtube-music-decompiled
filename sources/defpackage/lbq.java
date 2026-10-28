package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lbq extends kry {
    public static final Parcelable.Creator CREATOR = new kvg(14);
    public String a;
    public String b;
    public lfy c;
    public long d;
    public boolean e;
    public String f;
    public final lcd g;
    public long h;
    public lcd i;
    public final long j;
    public final lcd k;

    public lbq(lbq lbqVar) {
        kro.l(lbqVar);
        this.a = lbqVar.a;
        this.b = lbqVar.b;
        this.c = lbqVar.c;
        this.d = lbqVar.d;
        this.e = lbqVar.e;
        this.f = lbqVar.f;
        this.g = lbqVar.g;
        this.h = lbqVar.h;
        this.i = lbqVar.i;
        this.j = lbqVar.j;
        this.k = lbqVar.k;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        ksy.B(parcel, 2, this.a);
        ksy.B(parcel, 3, this.b);
        ksy.A(parcel, 4, this.c, i);
        ksy.m(parcel, 5, this.d);
        ksy.i(parcel, 6, this.e);
        ksy.B(parcel, 7, this.f);
        ksy.A(parcel, 8, this.g, i);
        ksy.m(parcel, 9, this.h);
        ksy.A(parcel, 10, this.i, i);
        ksy.m(parcel, 11, this.j);
        ksy.A(parcel, 12, this.k, i);
        ksy.h(parcel, iG);
    }

    public lbq(String str, String str2, lfy lfyVar, long j, boolean z, String str3, lcd lcdVar, long j2, lcd lcdVar2, long j3, lcd lcdVar3) {
        this.a = str;
        this.b = str2;
        this.c = lfyVar;
        this.d = j;
        this.e = z;
        this.f = str3;
        this.g = lcdVar;
        this.h = j2;
        this.i = lcdVar2;
        this.j = j3;
        this.k = lcdVar3;
    }
}
