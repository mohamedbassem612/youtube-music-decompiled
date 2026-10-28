package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class als extends alt {
    private final amb a;
    private final amb b;
    private final float[] c;

    public als(amb ambVar, amb ambVar2) {
        float[] fArrG;
        super(ambVar2, ambVar, ambVar2);
        this.a = ambVar;
        this.b = ambVar2;
        if (ace.d(ambVar.d, ambVar2.d)) {
            fArrG = ace.g(ambVar2.j, ambVar.i);
        } else {
            float[] fArr = ambVar.i;
            float[] fArr2 = ambVar2.j;
            float[] fArrA = ambVar.d.a();
            float[] fArrA2 = ambVar2.d.a();
            amd amdVar = ambVar.d;
            amd amdVar2 = alw.a;
            amd amdVar3 = alw.b;
            fArrG = ace.g(ace.d(ambVar2.d, amdVar3) ? fArr2 : ace.f(ace.g(ace.e(aln.b.c, fArrA2, alw.a()), ambVar2.i)), ace.d(amdVar, amdVar3) ? fArr : ace.g(ace.e(aln.b.c, fArrA, alw.a()), ambVar.i));
        }
        this.c = fArrG;
    }

    @Override // defpackage.alt
    public final long a(long j) {
        double d = alf.d(j);
        float fC = alf.c(j);
        float fB = alf.b(j);
        alv alvVar = this.a.n;
        float fA = (float) alvVar.a(d);
        float fA2 = (float) alvVar.a(fC);
        float fA3 = (float) alvVar.a(fB);
        float[] fArr = this.c;
        float f = fArr[0] * fA;
        float f2 = fArr[3] * fA2;
        float f3 = fArr[6] * fA3;
        float f4 = fArr[1] * fA;
        float f5 = fArr[4] * fA2;
        float f6 = fArr[7] * fA3;
        float f7 = fArr[2] * fA;
        float f8 = fArr[5] * fA2;
        float f9 = fArr[8] * fA3;
        amb ambVar = this.b;
        alv alvVar2 = ambVar.l;
        return aav.a((float) alvVar2.a(f + f2 + f3), (float) alvVar2.a(f4 + f5 + f6), (float) alvVar2.a(f7 + f8 + f9), alf.a(j), ambVar);
    }
}
