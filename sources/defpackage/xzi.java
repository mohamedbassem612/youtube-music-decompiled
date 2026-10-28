package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class xzi implements Runnable {
    final /* synthetic */ xzj a;
    private final xzc b;
    private final long c;

    public xzi(xzj xzjVar, xzc xzcVar, long j) {
        this.a = xzjVar;
        this.b = xzcVar;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        tun tunVar = this.a.a;
        long jB = tunVar.c.b();
        long j = tunVar.a;
        long j2 = j == -1 ? -1L : jB - j;
        if (j2 == -1 || j2 > this.c) {
            return;
        }
        this.b.P();
    }
}
