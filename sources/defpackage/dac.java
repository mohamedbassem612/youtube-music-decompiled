package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class dac implements cwh {
    private final long a;
    private final dad[] b;
    private final int c;

    public dac(long j, dad[] dadVarArr, int i) {
        this.a = j;
        this.b = dadVarArr;
        this.c = i;
    }

    @Override // defpackage.cvz
    public final long a() {
        return this.a;
    }

    @Override // defpackage.cvz
    public final cvx b(long j) {
        return e(j, -1);
    }

    @Override // defpackage.cvz
    public final /* synthetic */ boolean c() {
        return false;
    }

    @Override // defpackage.cvz
    public final boolean d() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005a  */
    /* JADX WARN: Code duplicated, block: B:27:0x0060  */
    /* JADX WARN: Code duplicated, block: B:29:0x0064  */
    /* JADX WARN: Code duplicated, block: B:31:0x0070  */
    /* JADX WARN: Code duplicated, block: B:33:0x0077  */
    /* JADX WARN: Code duplicated, block: B:36:0x0082  */
    /* JADX WARN: Code duplicated, block: B:37:0x0088  */
    /* JADX WARN: Code duplicated, block: B:42:0x0074 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x0074 A[SYNTHETIC] */
    @Override // defpackage.cwh
    public final cvx e(long j, int i) {
        int i2;
        long j2;
        long j3;
        long j4;
        long jI;
        long jI2;
        cwa cwaVar;
        cvx cvxVar;
        int i3;
        dal dalVar;
        int iB;
        dad[] dadVarArr = this.b;
        if (dadVarArr.length != 0) {
            int i4 = i;
            if (i4 != -1) {
                i2 = i4;
            } else {
                i4 = this.c;
                i2 = -1;
            }
            if (i4 != -1) {
                dal dalVar2 = dadVarArr[i4].b;
                int iH = dae.h(dalVar2, j);
                if (iH != -1) {
                    long[] jArr = dalVar2.f;
                    j3 = jArr[iH];
                    long[] jArr2 = dalVar2.c;
                    j2 = jArr2[iH];
                    if (j3 < j && iH < dalVar2.b - 1 && (iB = dalVar2.b(j)) != -1 && iB != iH) {
                        long j5 = jArr[iB];
                        jI = jArr2[iB];
                        j4 = j5;
                    }
                    if (i2 == -1) {
                        jI2 = j2;
                        for (i3 = 0; i3 < dadVarArr.length; i3++) {
                            if (i3 != this.c) {
                                dalVar = dadVarArr[i3].b;
                                jI2 = dae.i(dalVar, j3, jI2);
                                if (j4 != -9223372036854775807L) {
                                    jI = dae.i(dalVar, j4, jI);
                                }
                            }
                        }
                    } else {
                        jI2 = j2;
                    }
                    cwaVar = new cwa(j3, jI2);
                    if (j4 == -9223372036854775807L) {
                        cvxVar = new cvx(cwaVar, cwaVar);
                    } else {
                        cvxVar = new cvx(cwaVar, new cwa(j4, jI));
                    }
                    return cvxVar;
                }
            } else {
                j2 = Long.MAX_VALUE;
                j3 = j;
            }
            j4 = -9223372036854775807L;
            jI = -1;
            if (i2 == -1) {
                jI2 = j2;
                while (i3 < dadVarArr.length) {
                    if (i3 != this.c) {
                        dalVar = dadVarArr[i3].b;
                        jI2 = dae.i(dalVar, j3, jI2);
                        if (j4 != -9223372036854775807L) {
                            jI = dae.i(dalVar, j4, jI);
                        }
                    }
                }
            } else {
                jI2 = j2;
            }
            cwaVar = new cwa(j3, jI2);
            if (j4 == -9223372036854775807L) {
                cvxVar = new cvx(cwaVar, cwaVar);
            } else {
                cvxVar = new cvx(cwaVar, new cwa(j4, jI));
            }
            return cvxVar;
        }
        cwa cwaVar2 = cwa.a;
        return new cvx(cwaVar2, cwaVar2);
    }

    @Override // defpackage.cwh
    public final boolean f(int i) {
        return true;
    }
}
