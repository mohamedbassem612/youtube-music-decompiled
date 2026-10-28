package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class zjx implements bzg {
    public final zho a;
    private final mbc b;
    private final int c;
    private int d;
    private long e;
    private long f;
    private long g;

    public zjx(mbc mbcVar, zho zhoVar, int i) {
        this.b = mbcVar;
        this.a = zhoVar;
        this.c = i;
    }

    @Override // defpackage.bzg
    public final synchronized void a(bye byeVar, byi byiVar, boolean z, int i) {
        long j = i;
        try {
            if (z) {
                this.f += j;
            } else {
                this.g += j;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r15v0, types: [boolean, int] */
    @Override // defpackage.bzg
    public final synchronized void b(bye byeVar, byi byiVar, boolean z) {
        long jB = this.b.b();
        long j = this.e;
        int i = j == 0 ? 0 : (int) (jB - j);
        long j2 = this.g + this.f;
        zih zihVar = new zih(this.c, i, j2, (this.g > this.f ? 1 : (this.g == this.f ? 0 : -1)) >>> 31, byiVar != null ? byiVar.a.getQueryParameter("cpn") : null);
        if (i > 0 && j2 >= 16384) {
            Iterator it = this.a.a.iterator();
            while (it.hasNext()) {
                ((zhp) it.next()).a(zihVar);
            }
        }
        int i2 = this.d - 1;
        this.d = i2;
        if (i2 < 0) {
            Iterator it2 = this.a.a.iterator();
            while (it2.hasNext()) {
                ((zhp) it2.next()).e(zihVar);
            }
            this.d = 0;
        }
        this.e = jB;
        this.g = 0L;
        this.f = 0L;
    }

    @Override // defpackage.bzg
    public final synchronized void d(bye byeVar, byi byiVar, boolean z) {
        if (this.d == 0) {
            this.e = this.b.b();
        }
        this.d++;
    }

    @Override // defpackage.bzg
    public final void c(bye byeVar, byi byiVar, boolean z) {
    }
}
