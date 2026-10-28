package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lrd extends kry {
    public static final Parcelable.Creator CREATOR = new lre();
    final String a;
    final String b;
    final String c;
    final String d;
    final String e;
    final String f;
    final String g;
    final String h;

    @Deprecated
    final String i;
    final String j;
    final int k;
    final ArrayList l;
    final lst m;
    final ArrayList n;

    @Deprecated
    final String o;

    @Deprecated
    final String p;
    final ArrayList q;
    final boolean r;
    final ArrayList s;
    final ArrayList t;
    final ArrayList u;
    final lsq v;

    public lrd(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, ArrayList arrayList, lst lstVar, ArrayList arrayList2, String str11, String str12, ArrayList arrayList3, boolean z, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, lsq lsqVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = str9;
        this.j = str10;
        this.k = i;
        this.l = arrayList;
        this.m = lstVar;
        this.n = arrayList2;
        this.o = str11;
        this.p = str12;
        this.q = arrayList3;
        this.r = z;
        this.s = arrayList4;
        this.t = arrayList5;
        this.u = arrayList6;
        this.v = lsqVar;
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
        ksy.B(parcel, 9, this.h);
        ksy.B(parcel, 10, this.i);
        ksy.B(parcel, 11, this.j);
        ksy.l(parcel, 12, this.k);
        ksy.F(parcel, 13, this.l);
        ksy.A(parcel, 14, this.m, i);
        ksy.F(parcel, 15, this.n);
        ksy.B(parcel, 16, this.o);
        ksy.B(parcel, 17, this.p);
        ksy.F(parcel, 18, this.q);
        ksy.i(parcel, 19, this.r);
        ksy.F(parcel, 20, this.s);
        ksy.F(parcel, 21, this.t);
        ksy.F(parcel, 22, this.u);
        ksy.A(parcel, 23, this.v, i);
        ksy.h(parcel, iG);
    }
}
