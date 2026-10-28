package defpackage;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lqq extends kry {
    public static final Parcelable.Creator CREATOR = new lqr();
    public int a;
    public String b;
    public String c;
    public int d;
    public Point[] e;
    public lqj f;
    public lqm g;
    public lqn h;
    public lqp i;
    public lqo j;
    public lqk k;
    public lqg l;
    public lqh m;
    public lqi n;
    public byte[] o;
    public boolean p;
    public double q;

    public lqq(int i, String str, String str2, int i2, Point[] pointArr, lqj lqjVar, lqm lqmVar, lqn lqnVar, lqp lqpVar, lqo lqoVar, lqk lqkVar, lqg lqgVar, lqh lqhVar, lqi lqiVar, byte[] bArr, boolean z, double d) {
        this.a = i;
        this.b = str;
        this.o = bArr;
        this.c = str2;
        this.d = i2;
        this.e = pointArr;
        this.p = z;
        this.q = d;
        this.f = lqjVar;
        this.g = lqmVar;
        this.h = lqnVar;
        this.i = lqpVar;
        this.j = lqoVar;
        this.k = lqkVar;
        this.l = lqgVar;
        this.m = lqhVar;
        this.n = lqiVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        ksy.l(parcel, 2, this.a);
        ksy.B(parcel, 3, this.b);
        ksy.B(parcel, 4, this.c);
        ksy.l(parcel, 5, this.d);
        ksy.E(parcel, 6, this.e, i);
        ksy.A(parcel, 7, this.f, i);
        ksy.A(parcel, 8, this.g, i);
        ksy.A(parcel, 9, this.h, i);
        ksy.A(parcel, 10, this.i, i);
        ksy.A(parcel, 11, this.j, i);
        ksy.A(parcel, 12, this.k, i);
        ksy.A(parcel, 13, this.l, i);
        ksy.A(parcel, 14, this.m, i);
        ksy.A(parcel, 15, this.n, i);
        ksy.q(parcel, 16, this.o);
        ksy.i(parcel, 17, this.p);
        ksy.j(parcel, 18, this.q);
        ksy.h(parcel, iG);
    }

    public lqq() {
    }
}
