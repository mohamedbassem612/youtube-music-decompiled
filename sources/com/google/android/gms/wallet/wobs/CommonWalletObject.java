package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.kry;
import defpackage.ksy;
import defpackage.lsn;
import defpackage.lst;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class CommonWalletObject extends kry {
    public static final Parcelable.Creator CREATOR = new lsn();
    public String a;
    String b;
    String c;
    String d;
    String e;
    String f;
    String g;

    @Deprecated
    String h;
    int i;
    final ArrayList j;
    lst k;
    final ArrayList l;

    @Deprecated
    String m;

    @Deprecated
    String n;
    final ArrayList o;
    boolean p;
    final ArrayList q;
    final ArrayList r;
    final ArrayList s;

    public CommonWalletObject(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, ArrayList arrayList, lst lstVar, ArrayList arrayList2, String str9, String str10, ArrayList arrayList3, boolean z, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = i;
        this.j = arrayList;
        this.k = lstVar;
        this.l = arrayList2;
        this.m = str9;
        this.n = str10;
        this.o = arrayList3;
        this.p = z;
        this.q = arrayList4;
        this.r = arrayList5;
        this.s = arrayList6;
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
        ksy.l(parcel, 10, this.i);
        ksy.F(parcel, 11, this.j);
        ksy.A(parcel, 12, this.k, i);
        ksy.F(parcel, 13, this.l);
        ksy.B(parcel, 14, this.m);
        ksy.B(parcel, 15, this.n);
        ksy.F(parcel, 16, this.o);
        ksy.i(parcel, 17, this.p);
        ksy.F(parcel, 18, this.q);
        ksy.F(parcel, 19, this.r);
        ksy.F(parcel, 20, this.s);
        ksy.h(parcel, iG);
    }

    public CommonWalletObject() {
        this.j = new ArrayList();
        this.l = new ArrayList();
        this.o = new ArrayList();
        this.q = new ArrayList();
        this.r = new ArrayList();
        this.s = new ArrayList();
    }
}
