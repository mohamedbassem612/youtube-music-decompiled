package defpackage;

import android.graphics.Rect;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class ogf {
    public Rect a;
    public Rect b;
    public Integer c;
    private double d;
    private double e;
    private double f;
    private double g;
    private double h;
    private double i;
    private double j;
    private double k;
    private double l;
    private agke m;
    private short n;

    public final ogg a() {
        agke agkeVar;
        if (this.n == 511 && (agkeVar = this.m) != null) {
            return new ogg(this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.a, this.b, this.c, agkeVar);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.n & 1) == 0) {
            sb.append(" exposure");
        }
        if ((this.n & 2) == 0) {
            sb.append(" maxExposure");
        }
        if ((this.n & 4) == 0) {
            sb.append(" minExposure");
        }
        if ((this.n & 8) == 0) {
            sb.append(" volume");
        }
        if ((this.n & 16) == 0) {
            sb.append(" maxVolume");
        }
        if ((this.n & 32) == 0) {
            sb.append(" minVolume");
        }
        if ((this.n & 64) == 0) {
            sb.append(" screenShare");
        }
        if ((this.n & 128) == 0) {
            sb.append(" maxScreenShare");
        }
        if ((this.n & 256) == 0) {
            sb.append(" minScreenShare");
        }
        if (this.m == null) {
            sb.append(" mtosBuckets");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(double d) {
        this.d = d;
        this.n = (short) (this.n | 1);
    }

    public final void c(double d) {
        this.e = d;
        this.n = (short) (this.n | 2);
    }

    public final void d(double d) {
        this.k = d;
        this.n = (short) (this.n | 128);
    }

    public final void e(double d) {
        this.h = d;
        this.n = (short) (this.n | 16);
    }

    public final void f(double d) {
        this.f = d;
        this.n = (short) (this.n | 4);
    }

    public final void g(double d) {
        this.l = d;
        this.n = (short) (this.n | 256);
    }

    public final void h(double d) {
        this.i = d;
        this.n = (short) (this.n | 32);
    }

    public final void i(agke agkeVar) {
        if (agkeVar == null) {
            throw new NullPointerException("Null mtosBuckets");
        }
        this.m = agkeVar;
    }

    public final void j(double d) {
        this.j = d;
        this.n = (short) (this.n | 64);
    }

    public final void k(double d) {
        this.g = d;
        this.n = (short) (this.n | 8);
    }
}
