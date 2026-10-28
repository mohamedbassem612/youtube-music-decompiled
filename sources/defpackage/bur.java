package defpackage;

import android.graphics.Bitmap;
import android.text.Layout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class bur {
    public CharSequence a;
    public Layout.Alignment b;
    public Layout.Alignment c;
    public int d;
    public float e;
    public int f;
    public float g;
    public float h;
    public boolean i;
    public int j;
    public float k;
    public int l;
    private Bitmap m;
    private float n;
    private int o;
    private int p;
    private float q;
    private int r;

    public bur(bus busVar) {
        this.a = busVar.u;
        this.m = busVar.x;
        this.b = busVar.v;
        this.c = busVar.w;
        this.n = busVar.y;
        this.o = busVar.z;
        this.d = busVar.A;
        this.e = busVar.B;
        this.f = busVar.C;
        this.p = busVar.H;
        this.q = busVar.I;
        this.g = busVar.D;
        this.h = busVar.E;
        this.i = busVar.F;
        this.r = busVar.G;
        this.j = busVar.J;
        this.k = busVar.K;
        this.l = busVar.L;
    }

    public final bus a() {
        return new bus(this.a, this.b, this.c, this.m, this.n, this.o, this.d, this.e, this.f, this.p, this.q, this.g, this.h, this.i, this.r, this.j, this.k, this.l);
    }

    public final void b(Bitmap bitmap) {
        this.m = bitmap;
        this.a = null;
    }

    public final void c(float f, int i) {
        this.n = f;
        this.o = i;
    }

    public final void d(CharSequence charSequence) {
        this.a = charSequence;
        this.m = null;
    }

    public final void e(float f, int i) {
        this.q = f;
        this.p = i;
    }

    public final void f(int i) {
        this.r = i;
        this.i = true;
    }

    public bur() {
        this.a = null;
        this.m = null;
        this.b = null;
        this.c = null;
        this.n = -3.4028235E38f;
        this.o = Integer.MIN_VALUE;
        this.d = Integer.MIN_VALUE;
        this.e = -3.4028235E38f;
        this.f = Integer.MIN_VALUE;
        this.p = Integer.MIN_VALUE;
        this.q = -3.4028235E38f;
        this.g = -3.4028235E38f;
        this.h = -3.4028235E38f;
        this.i = false;
        this.r = -16777216;
        this.j = Integer.MIN_VALUE;
    }
}
