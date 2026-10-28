package defpackage;

import android.net.Network;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jyn extends kry {
    public static final Parcelable.Creator CREATOR = new jwx(19);
    public final jyp a;
    public final String b;
    public final List c;
    public final List d;
    public final List e;
    public final List f;
    public final int g;
    public final String h;
    public final boolean i;
    public final byte[] j;
    public final String k;
    public final boolean l;
    public final Network m;
    public final boolean n;
    public final int o;

    public jyn(jyp jypVar, String str, List list, List list2, List list3, List list4, int i, String str2, boolean z, byte[] bArr, String str3, boolean z2, Network network, boolean z3, int i2) {
        this.a = jypVar;
        this.b = str;
        this.c = list;
        this.d = list2;
        this.e = list3;
        this.f = list4;
        this.g = i;
        this.h = str2;
        this.i = z;
        this.j = bArr;
        this.k = str3;
        this.l = z2;
        this.m = network;
        this.n = z3;
        this.o = i2;
    }

    public static jym a() {
        jym jymVar = new jym();
        jymVar.k = (byte) (jymVar.k | 2);
        jymVar.c(0);
        jymVar.d(false);
        jymVar.e(false);
        jymVar.j = 1;
        jymVar.k = (byte) (jymVar.k | 16);
        return jymVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        jyp jypVar = this.a;
        int iG = ksy.g(parcel, 20293);
        ksy.A(parcel, 1, jypVar, i);
        ksy.B(parcel, 2, this.b);
        ksy.D(parcel, 3, this.c);
        ksy.D(parcel, 4, this.d);
        ksy.D(parcel, 5, this.e);
        ksy.D(parcel, 6, this.f);
        ksy.l(parcel, 7, this.g);
        ksy.B(parcel, 8, this.h);
        ksy.i(parcel, 9, this.i);
        ksy.q(parcel, 10, this.j);
        ksy.B(parcel, 11, this.k);
        ksy.i(parcel, 12, this.l);
        ksy.A(parcel, 13, this.m, i);
        ksy.i(parcel, 14, this.n);
        ksy.l(parcel, 15, this.o);
        ksy.h(parcel, iG);
    }
}
