package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class zvj {
    public int a;
    public double b;
    public agkj c;
    public Optional d;
    public Optional e;
    public Optional f;
    public Optional g;
    public byte h;
    public int i;
    public int j;
    private String k;
    private ajtv l;
    private Throwable m;
    private Optional n;
    private Optional o;
    private Optional p;
    private Optional q;
    private Optional r;
    private Optional s;

    public zvj(byte[] bArr) {
        this.n = Optional.empty();
        this.d = Optional.empty();
        this.e = Optional.empty();
        this.o = Optional.empty();
        this.f = Optional.empty();
        this.p = Optional.empty();
        this.g = Optional.empty();
        this.q = Optional.empty();
        this.r = Optional.empty();
        this.s = Optional.empty();
    }

    public final zvk a() {
        String str;
        ajtv ajtvVar;
        int i;
        int i2;
        Throwable th;
        agkj agkjVar;
        if (this.h == 3 && (str = this.k) != null && (ajtvVar = this.l) != null && (i = this.i) != 0 && (i2 = this.j) != 0 && (th = this.m) != null && (agkjVar = this.c) != null) {
            return new zvk(str, ajtvVar, i, i2, this.a, this.b, th, agkjVar, this.n, this.d, this.e, this.o, this.f, this.p, this.g, this.q, this.r, this.s);
        }
        StringBuilder sb = new StringBuilder();
        if (this.k == null) {
            sb.append(" message");
        }
        if (this.l == null) {
            sb.append(" level");
        }
        if (this.i == 0) {
            sb.append(" type");
        }
        if (this.j == 0) {
            sb.append(" category");
        }
        if ((this.h & 1) == 0) {
            sb.append(" serverSampleWeight");
        }
        if ((this.h & 2) == 0) {
            sb.append(" clientSampleWeight");
        }
        if (this.m == null) {
            sb.append(" throwableException");
        }
        if (this.c == null) {
            sb.append(" kvPairs");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(double d) {
        this.b = d;
        this.h = (byte) (this.h | 2);
    }

    public final void c(ajtv ajtvVar) {
        if (ajtvVar == null) {
            throw new NullPointerException("Null level");
        }
        this.l = ajtvVar;
    }

    public final void d(String str) {
        if (str == null) {
            throw new NullPointerException("Null message");
        }
        this.k = str;
    }

    public final void e(aokx aokxVar) {
        this.r = Optional.of(aokxVar);
    }

    public final void f(Throwable th) {
        if (th == null) {
            throw new NullPointerException("Null throwableException");
        }
        this.m = th;
    }

    public zvj() {
        throw null;
    }
}
