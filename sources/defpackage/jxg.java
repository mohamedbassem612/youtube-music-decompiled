package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jxg extends kry implements Iterable {
    public static final Parcelable.Creator CREATOR = new jxh();
    final String a;
    public final int[] b;
    public final byte[] c;
    final Bundle[] d;
    public final Bundle[] e;
    public final Bundle[] f;
    final int g;
    public final int[] h;
    public final String[] i;
    final byte[] j;
    final double[] k;
    final Bundle l;
    final int m;
    final long[] n;
    final long[] o;
    final Bundle[] p;
    final int[] q;
    final byte[] r;
    final boolean s;

    public jxg(String str, int[] iArr, byte[] bArr, Bundle[] bundleArr, Bundle[] bundleArr2, Bundle[] bundleArr3, int i, int[] iArr2, String[] strArr, byte[] bArr2, double[] dArr, Bundle bundle, int i2, long[] jArr, long[] jArr2, Bundle[] bundleArr4, int[] iArr3, byte[] bArr3, boolean z) {
        this.a = str;
        this.b = iArr;
        this.c = bArr;
        this.d = bundleArr;
        this.e = bundleArr2;
        this.f = bundleArr3;
        this.g = i;
        this.h = iArr2;
        this.i = strArr;
        this.j = bArr2;
        this.k = dArr;
        this.l = bundle;
        this.m = i2;
        this.n = jArr;
        this.o = jArr2;
        this.p = bundleArr4;
        this.q = iArr3;
        this.r = bArr3;
        this.s = z;
    }

    public final boolean a() {
        return this.a != null;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new jxf(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        ksy.B(parcel, 1, this.a);
        ksy.u(parcel, 2, this.b);
        ksy.q(parcel, 3, this.c);
        ksy.E(parcel, 4, this.d, i);
        ksy.E(parcel, 5, this.e, i);
        ksy.E(parcel, 6, this.f, i);
        ksy.l(parcel, 7, this.g);
        ksy.u(parcel, 8, this.h);
        ksy.C(parcel, 9, this.i);
        ksy.q(parcel, 10, this.j);
        double[] dArr = this.k;
        if (dArr != null) {
            int iG2 = ksy.g(parcel, 11);
            parcel.writeDoubleArray(dArr);
            ksy.h(parcel, iG2);
        }
        ksy.p(parcel, 12, this.l);
        ksy.l(parcel, 13, this.m);
        ksy.x(parcel, 14, this.n);
        ksy.x(parcel, 15, this.o);
        ksy.E(parcel, 16, this.p, i);
        ksy.u(parcel, 17, this.q);
        ksy.q(parcel, 18, this.r);
        ksy.i(parcel, 19, this.s);
        ksy.h(parcel, iG);
    }

    public jxg() {
        this(null, null, null, null, null, null, 0, null, null, null, null, null, 0, null, null, null, null, null, false);
    }
}
