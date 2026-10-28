package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class aepi implements aepl {
    public final mbc a;
    public long b;
    private final awmd c;
    private final int d;
    private final long e;

    public aepi(awmd awmdVar, aqin aqinVar, mbc mbcVar) {
        this.c = awmdVar;
        this.d = aqinVar.c;
        this.e = TimeUnit.SECONDS.toMillis(aqinVar.d);
        this.a = mbcVar;
    }

    @Override // defpackage.aepl
    public final int a() {
        return this.d;
    }

    @Override // defpackage.aepl
    public final boolean b() {
        if (((aepv) this.c.io()).b()) {
            return false;
        }
        long j = this.e;
        return j <= 0 || j + this.b > this.a.b();
    }
}
