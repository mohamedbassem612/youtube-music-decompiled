package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public abstract class cpb extends cpo {
    public final long a;
    public final long b;
    public cpd c;
    public int[] d;

    public cpb(bye byeVar, byi byiVar, bse bseVar, int i, Object obj, long j, long j2, long j3, long j4, long j5) {
        super(byeVar, byiVar, bseVar, i, obj, j, j2, j5);
        this.a = j3;
        this.b = j4;
    }

    public final int c(int i) {
        int[] iArr = this.d;
        iArr.getClass();
        return iArr[i];
    }

    public final cpd d() {
        cpd cpdVar = this.c;
        cpdVar.getClass();
        return cpdVar;
    }
}
