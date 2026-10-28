package defpackage;

import android.util.SparseArray;
import android.view.ViewOutlineProvider;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fkl implements fil {
    public String A;
    public fip B;
    public fip C;
    public long J;
    public CharSequence a;
    public CharSequence b;
    public Object c;
    public String d;
    public SparseArray e;
    public ViewOutlineProvider h;
    public boolean i;
    public fip r;
    public fip s;
    public fip t;
    public fip u;
    public fip v;
    public fip w;
    public fip x;
    public fip y;
    public fip z;
    public int f = -16777216;
    public int g = -16777216;
    public boolean j = true;
    public boolean k = true;
    public float l = 1.0f;
    public float m = 1.0f;
    public float n = 1.0f;
    public float o = 0.0f;
    public float p = 0.0f;
    public float q = 0.0f;
    public int D = 0;
    public int E = 0;
    public int F = 0;
    public int G = 0;
    public int H = 0;
    public int I = 0;

    public final void A(float f) {
        this.l = f;
        this.J |= 524288;
    }

    public final void B(float f) {
        this.m = f;
        this.J |= 524288;
    }

    public final void C(fip fipVar) {
        this.J |= 32;
        this.x = fipVar;
    }

    public final void D(float f) {
        this.p = f;
        this.J |= -2147483648L;
    }

    public final void E(float f) {
        this.q = f;
        this.J |= -2147483648L;
    }

    public final void F(Object obj) {
        this.J |= 2;
        this.c = obj;
    }

    public final void G(SparseArray sparseArray) {
        this.J |= 4;
        this.e = sparseArray;
    }

    public final boolean H() {
        return (this.r == null && this.t == null && this.u == null && this.x == null && this.y == null && this.z == null) ? false : true;
    }

    public final boolean I() {
        return (this.J & 1048576) != 0;
    }

    public final boolean J() {
        return (this.J & 8388608) != 0;
    }

    public final boolean K() {
        return (this.J & 2097152) != 0;
    }

    public final boolean L() {
        return (this.J & 33554432) != 0;
    }

    public final boolean M() {
        return (this.J & 67108864) != 0;
    }

    public final boolean N() {
        return (this.J & 524288) != 0;
    }

    public final boolean O() {
        return (this.J & 524288) != 0;
    }

    public final boolean P() {
        return (this.J & (-2147483648L)) != 0;
    }

    public final boolean Q() {
        return (this.J & (-2147483648L)) != 0;
    }

    public final boolean R() {
        return (this.B == null && this.C == null && this.A == null) ? false : true;
    }

    @Override // defpackage.fil
    public final /* synthetic */ boolean a(Object obj) {
        return gzj.aX(this, (fkl) obj);
    }

    public final float b() {
        float f = this.l;
        if (f != this.m) {
            return 1.0f;
        }
        return f;
    }

    public final void c(fkl fklVar) {
        if ((this.J & 8) != 0) {
            fklVar.h(this.r);
        }
        if ((this.J & 16) != 0) {
            fklVar.u(this.t);
        }
        if ((this.J & 1073741824) != 0) {
            fklVar.m(this.u);
        }
        if ((this.J & 4294967296L) != 0) {
            fklVar.r(this.v);
        }
        if ((this.J & 8589934592L) != 0) {
            fklVar.s(this.w);
        }
        if ((this.J & 131072) != 0) {
            fklVar.p(this.s);
        }
        if ((this.J & 32) != 0) {
            fklVar.C(this.x);
        }
        if ((this.J & 536870912) != 0) {
            fklVar.n(this.y);
        }
        if ((this.J & 262144) != 0) {
            fklVar.t(this.z);
        }
        if ((this.J & 4194304) != 0) {
            fklVar.f(this.A);
        }
        if ((this.J & 16777216) != 0) {
            fklVar.J |= 16777216;
        }
        if ((this.J & 64) != 0) {
            fklVar.J |= 64;
        }
        if ((this.J & 128) != 0) {
            fklVar.J |= 128;
        }
        if ((this.J & 256) != 0) {
            fklVar.w(this.B);
        }
        if ((this.J & 512) != 0) {
            fklVar.J |= 512;
        }
        if ((this.J & 1024) != 0) {
            fklVar.J |= 1024;
        }
        if ((this.J & 2048) != 0) {
            fklVar.y(this.C);
        }
        if ((this.J & 4096) != 0) {
            fklVar.J |= 4096;
        }
        if ((this.J & 8192) != 0) {
            fklVar.J |= 8192;
        }
        if ((this.J & 1) != 0) {
            fklVar.l(this.a);
        }
        if ((this.J & 17179869184L) != 0) {
            fklVar.d(this.b);
        }
        if ((this.J & 16384) != 0) {
            fklVar.J |= 16384;
        }
        if ((this.J & 134217728) != 0) {
            int i = this.f;
            fklVar.J |= 134217728;
            fklVar.f = i;
        }
        if ((this.J & 268435456) != 0) {
            int i2 = this.g;
            fklVar.J |= 268435456;
            fklVar.g = i2;
        }
        if ((this.J & 32768) != 0) {
            fklVar.x(this.h);
        }
        if ((this.J & 65536) != 0) {
            fklVar.k(this.i);
        }
        fklVar.j = this.j;
        if ((this.J & 8388608) != 0) {
            fklVar.j(this.k);
        }
        Object obj = this.c;
        if (obj != null) {
            fklVar.F(obj);
        }
        SparseArray sparseArray = this.e;
        if (sparseArray != null) {
            fklVar.G(sparseArray);
        }
        String str = this.d;
        if (str != null) {
            fklVar.d = str;
        }
        int i3 = this.D;
        if (i3 != 0) {
            fklVar.q(i3 == 1);
        }
        int i4 = this.E;
        if (i4 != 0) {
            fklVar.i(i4 == 1);
        }
        int i5 = this.F;
        if (i5 != 0) {
            fklVar.v(i5 == 1);
        }
        int i6 = this.G;
        if (i6 != 0) {
            fklVar.o(i6 == 1);
        }
        int i7 = this.H;
        if (i7 != 0) {
            if (i7 == 1) {
                fklVar.H = 1;
            } else {
                fklVar.H = 2;
            }
        }
        int i8 = this.I;
        if (i8 != 0) {
            fklVar.e(i8 == 1);
        }
        if ((this.J & 524288) != 0) {
            fklVar.A(this.l);
            fklVar.B(this.m);
        }
        if ((this.J & 1048576) != 0) {
            fklVar.g(this.n);
        }
        if ((this.J & 2097152) != 0) {
            fklVar.z(this.o);
        }
        if ((this.J & 33554432) != 0) {
            fklVar.J |= 33554432;
        }
        if ((this.J & 67108864) != 0) {
            fklVar.J |= 67108864;
        }
        if ((this.J & (-2147483648L)) != 0) {
            fklVar.D(this.p);
        }
        if ((this.J & (-2147483648L)) != 0) {
            fklVar.E(this.q);
        }
    }

    public final void d(CharSequence charSequence) {
        this.J |= 17179869184L;
        this.b = charSequence;
    }

    public final void e(boolean z) {
        this.I = true != z ? 2 : 1;
    }

    public final void f(String str) {
        this.J |= 4194304;
        this.A = str;
    }

    public final void g(float f) {
        this.n = f;
        long j = this.J;
        this.J = f == 1.0f ? j & (-1048577) : j | 1048576;
    }

    public final void h(fip fipVar) {
        this.J |= 8;
        this.r = fipVar;
    }

    public final void i(boolean z) {
        this.E = true != z ? 2 : 1;
    }

    public final void j(boolean z) {
        this.J |= 8388608;
        this.k = z;
    }

    public final void k(boolean z) {
        this.J |= 65536;
        this.i = z;
    }

    public final void l(CharSequence charSequence) {
        this.J |= 1;
        this.a = charSequence;
    }

    public final void m(fip fipVar) {
        this.J |= 1073741824;
        this.u = fipVar;
    }

    public final void n(fip fipVar) {
        this.J |= 536870912;
        this.y = fipVar;
    }

    public final void o(boolean z) {
        this.G = true != z ? 2 : 1;
    }

    public final void p(fip fipVar) {
        this.J |= 131072;
        this.s = fipVar;
    }

    public final void q(boolean z) {
        this.D = true != z ? 2 : 1;
    }

    public final void r(fip fipVar) {
        this.J |= 4294967296L;
        this.v = fipVar;
    }

    public final void s(fip fipVar) {
        this.J |= 8589934592L;
        this.w = fipVar;
    }

    public final void t(fip fipVar) {
        this.J |= 262144;
        this.z = fipVar;
    }

    public final void u(fip fipVar) {
        this.J |= 16;
        this.t = fipVar;
    }

    public final void v(boolean z) {
        this.F = true != z ? 2 : 1;
    }

    public final void w(fip fipVar) {
        this.J |= 256;
        this.B = fipVar;
    }

    public final void x(ViewOutlineProvider viewOutlineProvider) {
        this.J |= 32768;
        this.h = viewOutlineProvider;
    }

    public final void y(fip fipVar) {
        this.J |= 2048;
        this.C = fipVar;
    }

    public final void z(float f) {
        this.o = f;
        long j = this.J;
        this.J = f == 0.0f ? j & (-2097153) : j | 2097152;
    }
}
