package defpackage;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cjb extends ciz {
    final long g;
    final xsc h;
    final xsc i;

    public cjb(civ civVar, long j, long j2, long j3, long j4, long j5, List list, long j6, xsc xscVar, xsc xscVar2, long j7, long j8) {
        super(civVar, j, j2, j3, j5, list, j6, j7, j8);
        this.h = xscVar;
        this.i = xscVar2;
        this.g = j4;
    }

    @Override // defpackage.ciz
    public final long c(long j) {
        List list = this.c;
        if (list != null) {
            return list.size();
        }
        long j2 = this.g;
        if (j2 != -1) {
            return 1 + (j2 - this.a);
        }
        if (j == -9223372036854775807L) {
            return -1L;
        }
        BigInteger bigIntegerMultiply = BigInteger.valueOf(j).multiply(BigInteger.valueOf(this.k));
        BigInteger bigIntegerMultiply2 = BigInteger.valueOf(this.b).multiply(BigInteger.valueOf(1000000L));
        RoundingMode roundingMode = RoundingMode.CEILING;
        int i = ahbb.a;
        return new BigDecimal(bigIntegerMultiply).divide(new BigDecimal(bigIntegerMultiply2), 0, roundingMode).toBigIntegerExact().longValue();
    }

    @Override // defpackage.ciz
    public final civ g(ciy ciyVar, long j) {
        List list = this.c;
        long j2 = j - this.a;
        long j3 = list != null ? ((cjc) list.get((int) j2)).a : j2 * this.b;
        xsc xscVar = this.i;
        bse bseVar = ciyVar.c;
        return new civ(xscVar.aG(bseVar.a, j, bseVar.k, j3), 0L, -1L);
    }

    @Override // defpackage.cje
    public final /* bridge */ /* synthetic */ cje i() {
        return new cjb(this.j, this.k, 0L, this.a, this.g, this.b, this.c, this.f, this.h, this.i, this.d, this.e);
    }

    @Override // defpackage.cje
    public final civ j(ciy ciyVar) {
        xsc xscVar = this.h;
        if (xscVar == null) {
            return this.j;
        }
        bse bseVar = ciyVar.c;
        return new civ(xscVar.aG(bseVar.a, 0L, bseVar.k, 0L), 0L, -1L);
    }
}
