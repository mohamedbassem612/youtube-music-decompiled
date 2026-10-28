package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class tgw implements tgv {
    private final mbc b;
    private int c = 0;
    private long d = 0;

    public tgw(mbc mbcVar) {
        this.b = mbcVar;
    }

    @Override // defpackage.tgv
    public final synchronized long a() {
        if (this.c > 0) {
            return -1L;
        }
        return this.b.b() - this.d;
    }

    @Override // defpackage.tgv
    public final synchronized void b() {
        this.c--;
        this.d = this.b.b();
    }

    @Override // defpackage.tgv
    public final synchronized void c() {
        this.c++;
    }
}
