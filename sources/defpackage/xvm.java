package defpackage;

import android.net.Uri;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xvm {
    public Uri a;
    public Uri b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public xvl h;
    public int i;
    public xwc j;
    private String k;
    private String l;
    private long m;
    private int n;
    private byte o = 3;

    public xvm(xvn xvnVar) {
        this.a = xvnVar.a;
        this.b = xvnVar.b;
        this.j = xvnVar.n;
        this.k = xvnVar.c;
        this.l = xvnVar.d;
        this.c = xvnVar.e;
        this.d = xvnVar.f;
        this.e = xvnVar.g;
        this.f = xvnVar.h;
        this.g = xvnVar.i;
        this.m = xvnVar.j;
        this.n = xvnVar.k;
        this.i = xvnVar.m;
        this.h = xvnVar.l;
    }

    public final xvn a() {
        if (this.o == 3 && this.j != null && this.k != null && this.l != null && this.i != 0 && this.h != null) {
            return new xvn(this.a, this.b, this.j, this.k, this.l, this.c, this.d, this.e, this.f, this.g, this.m, this.n, this.i, this.h);
        }
        StringBuilder sb = new StringBuilder();
        if (this.j == null) {
            sb.append(" deviceId");
        }
        if (this.k == null) {
            sb.append(" deviceName");
        }
        if (this.l == null) {
            sb.append(" networkId");
        }
        if ((this.o & 1) == 0) {
            sb.append(" wakeOnLanTimeout");
        }
        if ((this.o & 2) == 0) {
            sb.append(" wakeOnLanStatusOnStarted");
        }
        if (this.i == 0) {
            sb.append(" cacheMethod");
        }
        if (this.h == null) {
            sb.append(" appStatusWrapper");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(String str) {
        if (str == null) {
            throw new NullPointerException("Null deviceName");
        }
        this.k = str;
    }

    public final void c(String str) {
        if (str == null) {
            throw new NullPointerException("Null networkId");
        }
        this.l = str;
    }

    public final void d(int i) {
        this.n = i;
        this.o = (byte) (this.o | 2);
    }

    public final void e(long j) {
        this.m = j;
        this.o = (byte) (this.o | 1);
    }

    public final void f(xva xvaVar) {
        this.h = new xvl(xvaVar);
    }
}
