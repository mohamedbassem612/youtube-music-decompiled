package com.google.android.gms.identity.intents.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.kry;
import defpackage.ksy;
import defpackage.kvg;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class UserAddress extends kry implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new kvg(7);
    String a;
    String b;
    String c;
    String d;
    String e;
    String f;
    String g;
    String h;
    String i;
    String j;
    String k;
    String l;
    boolean m;
    String n;
    String o;

    public UserAddress(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, boolean z, String str13, String str14) {
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
        this.k = str11;
        this.l = str12;
        this.m = z;
        this.n = str13;
        this.o = str14;
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
        ksy.B(parcel, 12, this.k);
        ksy.B(parcel, 13, this.l);
        ksy.i(parcel, 14, this.m);
        ksy.B(parcel, 15, this.n);
        ksy.B(parcel, 16, this.o);
        ksy.h(parcel, iG);
    }

    UserAddress() {
    }
}
