package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ctw implements Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ String a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ctw(Object obj, String str, long j, long j2, int i) {
        this.$cid = i;
        this.d = obj;
        this.a = str;
        this.b = j;
        this.c = j2;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [cty, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [cfx, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        if (this.$cid != 0) {
            int i = bwp.a;
            long j = this.c;
            long j2 = this.b;
            ((boy) this.d).a.c(this.a, j2, j);
            return;
        }
        int i2 = bwp.a;
        long j3 = this.c;
        long j4 = this.b;
        ((pj) this.d).b.o(this.a, j4, j3);
    }
}
