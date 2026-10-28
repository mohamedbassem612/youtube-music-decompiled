package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jxb extends kry {
    public static final Parcelable.Creator CREATOR = new jwx(5);
    public final boolean a;
    public final List b;
    public final List c;
    public final boolean d;
    public final int e;
    public final int f;
    public final boolean g;
    public final int h;
    public final boolean i;
    public final int[] j;
    public final byte[] k;
    public final jxc l;
    public final String m;
    public final jww n;

    public jxb(boolean z, List list, List list2, boolean z2, int i, int i2, boolean z3, int i3, boolean z4, int[] iArr, byte[] bArr, jxc jxcVar, String str, jww jwwVar) {
        this.a = z;
        this.b = list;
        this.c = list2;
        this.d = z2;
        this.e = i;
        this.f = i2;
        this.g = z3;
        this.h = i3;
        this.i = z4;
        this.j = iArr;
        this.k = bArr;
        this.l = jxcVar;
        this.m = str;
        this.n = jwwVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        ksy.i(parcel, 1, this.a);
        ksy.D(parcel, 2, this.b);
        ksy.F(parcel, 3, this.c);
        ksy.i(parcel, 4, this.d);
        ksy.l(parcel, 5, this.e);
        ksy.l(parcel, 6, this.f);
        ksy.i(parcel, 7, this.g);
        ksy.l(parcel, 8, this.h);
        ksy.i(parcel, 9, this.i);
        ksy.u(parcel, 10, this.j);
        ksy.q(parcel, 11, this.k);
        ksy.A(parcel, 12, this.l, i);
        ksy.B(parcel, 13, this.m);
        ksy.A(parcel, 15, this.n, i);
        ksy.h(parcel, iG);
    }
}
