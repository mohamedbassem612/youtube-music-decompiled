package defpackage;

import j$.util.Optional;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tgh {
    public String e;
    private tmo f;
    private tgl h;
    private Executor i;
    private int j;
    private boolean k;
    private byte l;
    private Optional g = Optional.empty();
    public Optional a = Optional.empty();
    public Optional b = Optional.empty();
    public Optional c = Optional.empty();
    public Optional d = Optional.empty();

    public final tgi a() {
        tmo tmoVar;
        tgl tglVar;
        Executor executor;
        String str;
        if (this.l == 3 && (tmoVar = this.f) != null && (tglVar = this.h) != null && (executor = this.i) != null && (str = this.e) != null) {
            return new tgi(tmoVar, this.g, tglVar, this.a, this.b, this.c, this.d, executor, this.j, str, this.k);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f == null) {
            sb.append(" cache");
        }
        if (this.h == null) {
            sb.append(" volleyNetworkConfig");
        }
        if (this.i == null) {
            sb.append(" deliveryExecutor");
        }
        if ((this.l & 1) == 0) {
            sb.append(" threadPoolSize");
        }
        if (this.e == null) {
            sb.append(" threadPoolTag");
        }
        if ((this.l & 2) == 0) {
            sb.append(" useV2");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(tmo tmoVar) {
        if (tmoVar == null) {
            throw new NullPointerException("Null cache");
        }
        this.f = tmoVar;
    }

    public final void c(Optional optional) {
        if (optional == null) {
            throw new NullPointerException("Null cacheEventLogger");
        }
        this.g = optional;
    }

    public final void d(Executor executor) {
        if (executor == null) {
            throw new NullPointerException("Null deliveryExecutor");
        }
        this.i = executor;
    }

    public final void e(boolean z) {
        this.k = z;
        this.l = (byte) (this.l | 2);
    }

    public final void f(tgl tglVar) {
        if (tglVar == null) {
            throw new NullPointerException("Null volleyNetworkConfig");
        }
        this.h = tglVar;
    }

    public final void g() {
        this.j = 4;
        this.l = (byte) (this.l | 1);
    }
}
