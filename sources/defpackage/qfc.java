package defpackage;

import java.util.function.Predicate;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qfc {
    public String a;
    public axgh b;
    public String c;
    public qjj d;
    public qgi e;
    public Predicate f;
    public qdo g;
    private boolean h;
    private axhz i;
    private boolean j;
    private boolean k;
    private int l;
    private int m;
    private byte n;

    public final qfd a() {
        axhz axhzVar;
        Predicate predicate;
        if (this.n == 31 && (axhzVar = this.i) != null && (predicate = this.f) != null) {
            return new qfd(this.a, this.h, axhzVar, this.b, this.c, this.d, this.j, this.e, this.k, this.l, predicate, this.g, this.m);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.n & 1) == 0) {
            sb.append(" isEventNameConstant");
        }
        if (this.i == null) {
            sb.append(" metric");
        }
        if ((this.n & 2) == 0) {
            sb.append(" isUnsampled");
        }
        if ((this.n & 4) == 0) {
            sb.append(" shouldAttachActiveTraces");
        }
        if ((this.n & 8) == 0) {
            sb.append(" maxActiveTraces");
        }
        if (this.f == null) {
            sb.append(" activeTracePredicate");
        }
        if ((this.n & 16) == 0) {
            sb.append(" debugLogsSize");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(String str) {
        this.a = str;
    }

    public final void c(int i) {
        this.m = i;
        this.n = (byte) (this.n | 16);
    }

    public final void d(boolean z) {
        this.h = z;
        this.n = (byte) (this.n | 1);
    }

    public final void e(boolean z) {
        this.j = z;
        this.n = (byte) (this.n | 2);
    }

    public final void f(int i) {
        this.l = i;
        this.n = (byte) (this.n | 8);
    }

    public final void g(axhz axhzVar) {
        if (axhzVar == null) {
            throw new NullPointerException("Null metric");
        }
        this.i = axhzVar;
    }

    public final void h(axgh axghVar) {
        this.b = axghVar;
    }

    public final void i(boolean z) {
        this.k = z;
        this.n = (byte) (this.n | 4);
    }
}
