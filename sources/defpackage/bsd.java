package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bsd {
    public boolean A;
    public float B;
    public byte[] C;
    public int D;
    public bru E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public String a;
    public String b;
    public List c;
    public String d;
    public int e;
    public int f;
    public float g;
    public int h;
    public int i;
    public int j;
    public String k;
    public bsx l;
    public String m;
    public String n;
    public String o;
    public int p;
    public int q;
    public List r;
    public bsa s;
    public long t;
    public int u;
    public int v;
    public int w;
    public int x;
    public float y;
    public int z;

    public bsd(bse bseVar) {
        this.a = bseVar.a;
        this.b = bseVar.b;
        this.c = bseVar.c;
        this.d = bseVar.d;
        this.e = bseVar.e;
        this.f = bseVar.f;
        this.g = bseVar.g;
        this.i = bseVar.i;
        this.j = bseVar.j;
        this.k = bseVar.l;
        this.l = bseVar.m;
        this.m = bseVar.o;
        this.n = bseVar.p;
        this.o = bseVar.q;
        this.p = bseVar.r;
        this.q = bseVar.s;
        this.r = bseVar.t;
        this.s = bseVar.u;
        this.t = bseVar.v;
        this.u = bseVar.w;
        this.v = bseVar.x;
        this.w = bseVar.y;
        this.x = bseVar.z;
        this.y = bseVar.A;
        this.z = bseVar.B;
        this.A = bseVar.C;
        this.B = bseVar.D;
        this.C = bseVar.E;
        this.D = bseVar.F;
        this.E = bseVar.G;
        this.F = bseVar.H;
        this.G = bseVar.I;
        this.H = bseVar.J;
        this.I = bseVar.K;
        this.J = bseVar.L;
        this.K = bseVar.M;
        this.L = bseVar.N;
        this.M = bseVar.O;
        this.N = bseVar.P;
        this.O = bseVar.Q;
        this.P = bseVar.R;
        this.Q = bseVar.S;
    }

    public final void a(String str) {
        this.n = bsy.g(str);
    }

    public final void b(float f) {
        boolean z = true;
        if (f != -1.0f && f <= 0.0f) {
            z = false;
        }
        ahno.F(z);
        this.y = f;
    }

    public final void c(int i) {
        this.a = Integer.toString(i);
    }

    public final void d(List list) {
        this.c = agke.n(list);
    }

    public final void e(String str) {
        this.o = bsy.g(str);
    }

    public bsd() {
        this.c = agpi.a;
        this.g = -1.0f;
        this.i = -1;
        this.j = -1;
        this.p = -1;
        this.q = -1;
        this.t = Long.MAX_VALUE;
        this.u = -1;
        this.v = -1;
        this.w = -1;
        this.x = -1;
        this.y = -1.0f;
        this.B = 1.0f;
        this.D = -1;
        this.F = -1;
        this.G = -1;
        this.H = -1;
        this.I = -1;
        this.J = -1;
        this.M = -1;
        this.N = 1;
        this.O = -1;
        this.P = -1;
        this.Q = 0;
        this.h = 0;
    }
}
