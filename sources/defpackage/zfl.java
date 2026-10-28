package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class zfl implements Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ long a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ zfl(Object obj, long j, long j2, int i) {
        this.$cid = i;
        this.c = obj;
        this.a = j;
        this.b = j2;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, xir] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, xir] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, xir] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$cid;
        if (i == 0) {
            long j = this.a;
            ?? r2 = this.c;
            r2.o("pot_gcas", j);
            r2.o("pot_gcaf", this.b);
            return;
        }
        if (i == 1) {
            long j2 = this.a;
            ?? r3 = this.c;
            r3.o("pot_gcms", j2);
            r3.o("pot_gcmf", this.b);
            return;
        }
        if (i == 2) {
            long j3 = this.a;
            ?? r4 = this.c;
            r4.o("pot_gcis", j3);
            r4.o("pot_gcif", this.b);
            return;
        }
        if (i != 3) {
            tau tauVar = tau.PROOF_OF_ORIGIN_UNINITIALIZED_TOKEN_MINT_STARTED;
            long j4 = this.a;
            xir xirVar = ((zfo) this.c).d;
            xirVar.g(tauVar, j4);
            xirVar.g(tau.PROOF_OF_ORIGIN_UNINITIALIZED_TOKEN_MINT_FINISHED, this.b);
            return;
        }
        tau tauVar2 = tau.PROOF_OF_ORIGIN_TOKEN_MINT_STARTED;
        long j5 = this.a;
        xir xirVar2 = ((zfo) this.c).d;
        xirVar2.g(tauVar2, j5);
        xirVar2.g(tau.PROOF_OF_ORIGIN_TOKEN_MINT_FINISHED, this.b);
    }
}
