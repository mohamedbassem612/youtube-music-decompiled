package defpackage;

import android.net.Uri;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class yqd {
    public Uri a;
    public long b;
    public long c;
    public long d;
    public final wis e;
    final /* synthetic */ yqf f;
    private Uri g;
    private String h;
    private long i;
    private boolean j;
    private volatile jvf k;
    private final Object l = new Object();

    public yqd(yqf yqfVar, Uri uri, wis wisVar) {
        this.f = yqfVar;
        zkf.d(uri);
        this.a = uri;
        this.k = (jvf) (yqfVar.f ? null : yqfVar.a.io());
        this.h = null;
        this.i = 0L;
        this.b = 0L;
        this.c = 0L;
        this.d = yqfVar.c.b();
        this.j = false;
        this.e = wisVar;
    }

    public final synchronized Uri a() {
        return this.g;
    }

    public final jvf b() {
        Object objIo = this.k;
        if (objIo == null) {
            synchronized (this.l) {
                objIo = this.k;
                if (objIo == null) {
                    objIo = this.f.a.io();
                    this.k = (jvf) objIo;
                }
            }
        }
        return (jvf) objIo;
    }

    public final synchronized String c() {
        if (this.h != null) {
            yqf yqfVar = this.f;
            if (yqfVar.c.b() - this.i <= yqfVar.b + yqfVar.g) {
                return this.h;
            }
        }
        return null;
    }

    public final synchronized void d() {
        long jMax = !this.j ? 0L : Math.max(1000L, this.c << 1);
        this.c = jMax;
        yqf yqfVar = this.f;
        long jMin = Math.min(jMax, yqfVar.b);
        this.c = jMin;
        this.c = Math.min(86400000L, jMin);
        this.d = yqfVar.c.b() + this.c;
        this.j = true;
    }

    public final synchronized void e() {
        this.c = 0L;
        yqf yqfVar = this.f;
        this.d = yqfVar.c.b() + yqfVar.b;
        this.j = false;
    }

    public final void f() {
        this.a = yqg.k(this.a);
        this.b = this.f.c.b();
    }

    public final synchronized void g(Uri uri) {
        this.g = uri;
        this.h = uri != null ? uri.getAuthority() : null;
        yqf yqfVar = this.f;
        this.i = yqfVar.c.b();
        if (uri != null) {
            yqfVar.f(uri);
        }
    }
}
