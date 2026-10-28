package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class alt {
    private final alo a;
    private final alo b;
    private final alo c;

    /* JADX WARN: Illegal instructions before constructor call */
    public alt(alo aloVar, alo aloVar2) {
        alo aloVarC;
        if (aloVar.b == 12884901888L) {
            amd amdVar = alw.a;
            aloVar = ace.c(aloVar, alw.b, aln.b);
        }
        if (aloVar2.b == 12884901888L) {
            amd amdVar2 = alw.a;
            aloVarC = ace.c(aloVar2, alw.b, aln.b);
        } else {
            aloVarC = aloVar2;
        }
        this(aloVar2, aloVar, aloVarC);
    }

    public long a(long j) {
        alo aloVar = this.b;
        float fD = alf.d(j);
        float fC = alf.c(j);
        float fB = alf.b(j);
        long jD = aloVar.d(fD, fC, fB);
        return this.c.e(Float.intBitsToFloat((int) (jD >> 32)), Float.intBitsToFloat((int) (jD & 4294967295L)), aloVar.c(fD, fC, fB), alf.a(j), this.a);
    }

    public alt(alo aloVar, alo aloVar2, alo aloVar3) {
        this.a = aloVar;
        this.b = aloVar2;
        this.c = aloVar3;
    }
}
