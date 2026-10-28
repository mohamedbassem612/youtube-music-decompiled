package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class leo implements Runnable {
    private final /* synthetic */ int $cid;
    final /* synthetic */ lgh a;
    final /* synthetic */ long b;
    final /* synthetic */ boolean c;
    final /* synthetic */ ler d;

    public leo(ler lerVar, lgh lghVar, long j, boolean z, int i) {
        this.$cid = i;
        this.a = lghVar;
        this.b = j;
        this.c = z;
        this.d = lerVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$cid;
        lgh lghVar = this.a;
        if (i != 0) {
            ler lerVar = this.d;
            lerVar.aa(lghVar);
            lerVar.am(lghVar, this.b, this.c);
            return;
        }
        ler lerVar2 = this.d;
        lerVar2.aa(lghVar);
        lerVar2.am(lghVar, this.b, this.c);
    }
}
