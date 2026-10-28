package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public abstract class cpo extends cpg {
    public final long n;

    public cpo(bye byeVar, byi byiVar, bse bseVar, int i, Object obj, long j, long j2, long j3) {
        super(byeVar, byiVar, 1, bseVar, i, obj, j, j2);
        bseVar.getClass();
        this.n = j3;
    }

    public long h() {
        long j = this.n;
        if (j != -1) {
            return 1 + j;
        }
        return -1L;
    }

    public abstract boolean j();
}
