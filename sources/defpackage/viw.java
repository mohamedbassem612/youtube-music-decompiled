package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class viw {
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private final Optional f = Optional.empty();
    private final Optional g = Optional.empty();
    private Optional h = Optional.empty();
    private Optional i = Optional.empty();
    private Optional j = Optional.empty();
    private int k;
    private int l;
    private byte m;

    public final vix a() {
        if (this.m == 127) {
            return new vix(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.m & 1) == 0) {
            sb.append(" primarySurfaceId");
        }
        if ((this.m & 2) == 0) {
            sb.append(" raisedPrimarySurfaceId");
        }
        if ((this.m & 4) == 0) {
            sb.append(" secondarySurfaceId");
        }
        if ((this.m & 8) == 0) {
            sb.append(" primaryTextId");
        }
        if ((this.m & 16) == 0) {
            sb.append(" secondaryTextId");
        }
        if ((this.m & 32) == 0) {
            sb.append(" contentDescriptionId");
        }
        if ((this.m & 64) == 0) {
            sb.append(" chipColorId");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(int i) {
        this.l = i;
        this.m = (byte) (this.m | 64);
    }

    public final void c(int i) {
        this.k = i;
        this.m = (byte) (this.m | 32);
    }

    public final void d(int i) {
        this.a = i;
        this.m = (byte) (this.m | 1);
    }

    public final void e(int i) {
        this.j = Optional.of(Integer.valueOf(i));
    }

    public final void f(int i) {
        this.i = Optional.of(Integer.valueOf(i));
    }

    public final void g(int i) {
        this.d = i;
        this.m = (byte) (this.m | 8);
    }

    public final void h(int i) {
        this.b = i;
        this.m = (byte) (this.m | 2);
    }

    public final void i(int i) {
        this.c = i;
        this.m = (byte) (this.m | 4);
    }

    public final void j(int i) {
        this.e = i;
        this.m = (byte) (this.m | 16);
    }

    public final void k(int i) {
        this.h = Optional.of(Integer.valueOf(i));
    }
}
