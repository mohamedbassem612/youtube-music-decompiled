package defpackage;

import android.text.Layout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class dcu {
    public String a;
    public int b;
    public boolean c;
    public int d;
    public boolean e;
    public float k;
    public String l;
    public Layout.Alignment o;
    public Layout.Alignment p;
    public dcp r;
    public String t;
    public String u;
    public String v;
    public int f = -1;
    public int g = -1;
    public int h = -1;
    public int i = -1;
    public int j = -1;
    public int m = -1;
    public int n = -1;
    public int q = -1;
    public float s = Float.MAX_VALUE;

    public final int a() {
        int i = this.h;
        if (i == -1 && this.i == -1) {
            return -1;
        }
        return (this.i == 1 ? 2 : 0) | (i == 1 ? 1 : 0);
    }

    public final void b(dcu dcuVar) {
        int i;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (dcuVar != null) {
            if (!this.c && dcuVar.c) {
                d(dcuVar.b);
            }
            if (this.h == -1) {
                this.h = dcuVar.h;
            }
            if (this.i == -1) {
                this.i = dcuVar.i;
            }
            if (this.a == null && (str = dcuVar.a) != null) {
                this.a = str;
            }
            if (this.f == -1) {
                this.f = dcuVar.f;
            }
            if (this.g == -1) {
                this.g = dcuVar.g;
            }
            if (this.n == -1) {
                this.n = dcuVar.n;
            }
            if (this.o == null && (alignment2 = dcuVar.o) != null) {
                this.o = alignment2;
            }
            if (this.p == null && (alignment = dcuVar.p) != null) {
                this.p = alignment;
            }
            if (this.q == -1) {
                this.q = dcuVar.q;
            }
            if (this.j == -1) {
                this.j = dcuVar.j;
                this.k = dcuVar.k;
            }
            if (this.r == null) {
                this.r = dcuVar.r;
            }
            if (this.s == Float.MAX_VALUE) {
                this.s = dcuVar.s;
            }
            if (this.t == null) {
                this.t = dcuVar.t;
            }
            if (this.u == null) {
                this.u = dcuVar.u;
            }
            if (this.v == null) {
                this.v = dcuVar.v;
            }
            if (!this.e && dcuVar.e) {
                c(dcuVar.d);
            }
            if (this.m != -1 || (i = dcuVar.m) == -1) {
                return;
            }
            this.m = i;
        }
    }

    public final void c(int i) {
        this.d = i;
        this.e = true;
    }

    public final void d(int i) {
        this.b = i;
        this.c = true;
    }
}
