package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayDeque;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public class auko implements Parcelable {
    public int l;
    public int n;
    public int p;
    public int r;
    public int t;
    public static final ArrayDeque j = new ArrayDeque();
    public static final Object k = new Object();
    public static final Parcelable.Creator CREATOR = new ahpw(8);
    public aukj[] m = new aukj[16];
    public aukl[] o = new aukl[16];
    public aukp[] q = new aukp[16];
    public aukr[] s = new aukr[16];
    public aukv[] u = new aukv[16];

    public auko() {
        for (int i = 0; i < 16; i++) {
            this.m[i] = new aukj();
            this.o[i] = new aukl();
            this.q[i] = new aukp();
            this.s[i] = new aukr();
            this.u[i] = new aukv();
        }
        a();
    }

    static void e(int i, int i2, aukm[] aukmVarArr) {
        for (int i3 = 0; i3 < i2; i3++) {
            aukmVarArr[i3].e = i;
        }
    }

    protected static final void f(int i) {
        if (i < 0 || i >= 16) {
            throw new IllegalArgumentException(a.bR(i, "Invalid event count: "));
        }
    }

    public void a() {
        this.l = 0;
        this.n = 0;
        this.p = 0;
        this.r = 0;
        this.t = 0;
    }

    public void b(Parcel parcel) {
        parcel.readInt();
        int i = parcel.readInt();
        this.l = i;
        f(i);
        for (int i2 = 0; i2 < this.l; i2++) {
            this.m[i2].a(parcel);
        }
        int i3 = parcel.readInt();
        this.n = i3;
        f(i3);
        for (int i4 = 0; i4 < this.n; i4++) {
            this.o[i4].a(parcel);
        }
        int i5 = parcel.readInt();
        this.p = i5;
        f(i5);
        for (int i6 = 0; i6 < this.p; i6++) {
            this.q[i6].a(parcel);
        }
        int i7 = parcel.readInt();
        this.r = i7;
        f(i7);
        for (int i8 = 0; i8 < this.r; i8++) {
            this.s[i8].a(parcel);
        }
        int i9 = parcel.readInt();
        this.t = i9;
        f(i9);
        for (int i10 = 0; i10 < this.t; i10++) {
            this.u[i10].a(parcel);
        }
    }

    public void c() {
        a();
        synchronized (k) {
            ArrayDeque arrayDeque = j;
            if (!arrayDeque.contains(this)) {
                arrayDeque.add(this);
            }
        }
    }

    public void d(int i) {
        e(i, this.l, this.m);
        e(i, this.n, this.o);
        e(i, this.p, this.q);
        e(i, this.r, this.s);
        e(i, this.t, this.u);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
        parcel.writeInt(this.l);
        for (int i2 = 0; i2 < this.l; i2++) {
            this.m[i2].writeToParcel(parcel, i);
        }
        parcel.writeInt(this.n);
        for (int i3 = 0; i3 < this.n; i3++) {
            this.o[i3].writeToParcel(parcel, i);
        }
        parcel.writeInt(this.p);
        for (int i4 = 0; i4 < this.p; i4++) {
            this.q[i4].writeToParcel(parcel, i);
        }
        parcel.writeInt(this.r);
        for (int i5 = 0; i5 < this.r; i5++) {
            this.s[i5].writeToParcel(parcel, i);
        }
        parcel.writeInt(this.t);
        for (int i6 = 0; i6 < this.t; i6++) {
            this.u[i6].writeToParcel(parcel, i);
        }
    }
}
