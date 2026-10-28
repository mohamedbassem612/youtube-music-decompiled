package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class bts {
    public static final bts a = new bts(new btr());
    public final agke A;
    public final boolean C;
    public final agkj I;
    public final agkz J;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int j;
    public final int k;
    public final boolean l;
    public final boolean m;
    public final agke n;
    public final agke o;
    public final agke p;
    public final agke r;
    public final agke s;
    public final int u;
    public final int v;
    public final agke w;
    public final btq x;
    public final agke z;
    public final int f = 0;
    public final int g = 0;
    public final int h = 0;
    public final int i = 0;
    public final int q = 0;
    public final int t = 0;
    public final boolean y = false;
    public final int B = 0;
    public final int D = 0;
    public final boolean E = false;
    public final boolean F = false;
    public final boolean G = false;
    public final boolean H = false;

    static {
        int i = bwp.a;
    }

    protected bts(btr btrVar) {
        this.b = btrVar.a;
        this.c = btrVar.b;
        this.d = btrVar.c;
        this.e = btrVar.d;
        this.j = btrVar.e;
        this.k = btrVar.f;
        this.l = btrVar.g;
        this.m = btrVar.h;
        this.n = btrVar.i;
        this.o = btrVar.j;
        this.p = btrVar.k;
        this.r = btrVar.l;
        this.u = btrVar.n;
        this.s = btrVar.m;
        this.v = btrVar.o;
        this.w = btrVar.p;
        this.x = btrVar.q;
        this.z = btrVar.r;
        this.C = btrVar.s;
        this.A = btrVar.t;
        this.I = agkj.h(btrVar.u);
        this.J = agkz.n(btrVar.v);
    }

    public btr a() {
        return new btr(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            bts btsVar = (bts) obj;
            if (this.b == btsVar.b && this.c == btsVar.c && this.d == btsVar.d && this.e == btsVar.e && this.m == btsVar.m && this.j == btsVar.j && this.k == btsVar.k && this.l == btsVar.l && aguu.v(this.n, btsVar.n) && aguu.v(this.o, btsVar.o) && aguu.v(this.p, btsVar.p) && aguu.v(this.r, btsVar.r) && this.u == btsVar.u && aguu.v(this.s, btsVar.s) && this.v == btsVar.v && aguu.v(this.w, btsVar.w) && this.x.equals(btsVar.x) && aguu.v(this.A, btsVar.A) && aguu.v(this.z, btsVar.z) && this.C == btsVar.C && aguu.q(this.I, btsVar.I) && this.J.equals(btsVar.J)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((((((((((((((((((((((((((((((((((this.b + 31) * 31) + this.c) * 31) + this.d) * 31) + this.e) * 28629151) + (this.m ? 1 : 0)) * 31) + this.j) * 31) + this.k) * 31) + (this.l ? 1 : 0)) * 31) + this.n.hashCode()) * 31) + this.o.hashCode()) * 31) + this.p.hashCode()) * 961) + this.r.hashCode()) * 961) + this.u) * 31) + this.s.hashCode()) * 31) + this.v) * 31) + this.w.hashCode()) * 31) + 29791) * 961) + this.z.hashCode()) * 961) + (this.C ? 1 : 0)) * 31) + this.A.hashCode()) * 887503681) + this.I.hashCode()) * 31) + this.J.hashCode();
    }
}
