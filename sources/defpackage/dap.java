package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class dap implements dau {
    private final cvn b;
    private final eol d;
    public long a = -1;
    private long c = -1;

    public dap(cvn cvnVar, eol eolVar) {
        this.b = cvnVar;
        this.d = eolVar;
    }

    @Override // defpackage.dau
    public final long a(cvj cvjVar) {
        long j = this.c;
        if (j < 0) {
            return -1L;
        }
        this.c = -1L;
        return -(j + 2);
    }

    @Override // defpackage.dau
    public final cvz b() {
        ahno.O(this.a != -1);
        return new cvm(this.b, this.a);
    }

    @Override // defpackage.dau
    public final void c(long j) {
        long[] jArr = (long[]) this.d.b;
        this.c = jArr[bwp.an(jArr, j, true)];
    }
}
