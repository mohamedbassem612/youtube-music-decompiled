package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aciq implements acgu {
    public final abmt a;
    public abnl b;
    public abnp c;
    public wjf d;
    public long f;
    public long i;
    public long j;
    public long k;
    public aboe o;
    private final mbc p;
    private String q;
    public float e = 1.0f;
    public long g = -1;
    public long h = 0;
    public int l = 4;
    public abob m = abob.a;
    public boolean n = false;

    public aciq(mbc mbcVar, abnl abnlVar, abnp abnpVar, abmt abmtVar) {
        this.p = mbcVar;
        this.b = abnlVar;
        this.c = abnpVar;
        this.a = abmtVar;
    }

    @Override // defpackage.acgu
    public final long a() {
        return this.j;
    }

    @Override // defpackage.acgu
    public final long b() {
        return this.g;
    }

    @Override // defpackage.acgu
    public final long c() {
        return this.i;
    }

    @Override // defpackage.acgu
    public final long d() {
        return this.p.b();
    }

    @Override // defpackage.acgu
    public final long e() {
        return this.f;
    }

    @Override // defpackage.acgu
    public final long f() {
        return this.k;
    }

    @Override // defpackage.acgu
    public final long g() {
        return this.h;
    }

    public final String h() {
        String str = this.q;
        this.q = null;
        return str;
    }

    public final void i(String str) {
        if (this.q == null) {
            this.q = str;
        }
    }

    public final void j(wjf wjfVar) {
        this.d = wjfVar;
        if (wjfVar != null) {
            this.i = wjfVar.d();
        }
    }
}
