package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class awwy implements Runnable {
    private final /* synthetic */ int $cid;
    private final Object a;
    private final Object b;

    public awwy(avln avlnVar, avlp avlpVar, int i) {
        this.$cid = i;
        this.b = avlnVar;
        this.a = avlpVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [awuc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [avlp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [avln, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        if (this.$cid != 0) {
            this.a.F(this.b);
            return;
        }
        this.b.e((awuq) this.a, awmy.a);
    }

    public awwy(awuq awuqVar, awuc awucVar, int i) {
        this.$cid = i;
        this.a = awuqVar;
        this.b = awucVar;
    }
}
