package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ikx implements awzc {
    private final /* synthetic */ int $cid;
    final /* synthetic */ awzc a;

    public ikx(awzc awzcVar, int i) {
        this.$cid = i;
        this.a = awzcVar;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0070  */
    @Override // defpackage.awzc
    public final Object collect(awzd awzdVar, awoq awoqVar) throws Throwable {
        egk egkVar;
        int i = this.$cid;
        if (i == 0) {
            Object objCollect = this.a.collect(new ikw(awzdVar, 0), awoqVar);
            return objCollect != awox.a ? awmy.a : objCollect;
        }
        if (i != 1) {
            if (i == 2) {
                Object objE = axak.e((axak) this.a, new ikw(awzdVar, 2), awoqVar);
                return objE != awox.a ? awmy.a : objE;
            }
            if (i == 3) {
                Object objD = axbi.d((axbi) this.a, new ikw(awzdVar, 3), awoqVar);
                return objD != awox.a ? awmy.a : objD;
            }
            if (i != 4) {
                Object objCollect2 = this.a.collect(new ikw(awzdVar, 5), awoqVar);
                return objCollect2 != awox.a ? awmy.a : objCollect2;
            }
            Object objCollect3 = this.a.collect(new ikw(awzdVar, 4), awoqVar);
            return objCollect3 != awox.a ? awmy.a : objCollect3;
        }
        if (awoqVar instanceof egk) {
            egkVar = (egk) awoqVar;
            int i2 = egkVar.b;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                egkVar.b = i2 - Integer.MIN_VALUE;
            } else {
                egkVar = new egk(this, awoqVar);
            }
        } else {
            egkVar = new egk(this, awoqVar);
        }
        Object obj = egkVar.a;
        awox awoxVar = awox.a;
        int i3 = egkVar.b;
        if (i3 == 0) {
            atqp.j(obj);
            awzc awzcVar = this.a;
            ikw ikwVar = new ikw(awzdVar, 1);
            egkVar.c = null;
            egkVar.d = null;
            egkVar.e = null;
            egkVar.b = 1;
            if (awzcVar.collect(ikwVar, egkVar) == awoxVar) {
                return awoxVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Object obj2 = egkVar.e;
            Object obj3 = egkVar.d;
            Object obj4 = egkVar.c;
            atqp.j(obj);
        }
        return awmy.a;
    }
}
