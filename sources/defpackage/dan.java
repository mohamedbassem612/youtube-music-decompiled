package defpackage;

import java.math.BigInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class dan implements cvz {
    final /* synthetic */ dao a;

    public dan(dao daoVar) {
        this.a = daoVar;
    }

    @Override // defpackage.cvz
    public final long a() {
        dao daoVar = this.a;
        return daoVar.c.f(daoVar.d);
    }

    @Override // defpackage.cvz
    public final cvx b(long j) {
        dao daoVar = this.a;
        BigInteger bigIntegerValueOf = BigInteger.valueOf(daoVar.c.g(j));
        long j2 = daoVar.b;
        long j3 = daoVar.a;
        cwa cwaVar = new cwa(j, bwp.t((bigIntegerValueOf.multiply(BigInteger.valueOf(j2 - j3)).divide(BigInteger.valueOf(daoVar.d)).longValue() + j3) - 30000, j3, (-1) + j2));
        return new cvx(cwaVar, cwaVar);
    }

    @Override // defpackage.cvz
    public final /* synthetic */ boolean c() {
        return false;
    }

    @Override // defpackage.cvz
    public final boolean d() {
        return true;
    }
}
