package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class beu implements awzd {
    final /* synthetic */ bfp a;

    public beu(bfp bfpVar) {
        this.a = bfpVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(awoq awoqVar) throws Throwable {
        bet betVar;
        if (awoqVar instanceof bet) {
            betVar = (bet) awoqVar;
            int i = betVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                betVar.e = i - Integer.MIN_VALUE;
            } else {
                betVar = new bet(this, awoqVar);
            }
        } else {
            betVar = new bet(this, awoqVar);
        }
        Object obj = betVar.c;
        awox awoxVar = awox.a;
        int i2 = betVar.e;
        if (i2 == 0) {
            atqp.j(obj);
            bfp bfpVar = this.a;
            if (!(bfpVar.g.h() instanceof bgb)) {
                betVar.a = null;
                betVar.b = null;
                betVar.e = 1;
                if (bfpVar.f(true, betVar) == awoxVar) {
                    return awoxVar;
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Object obj2 = betVar.b;
            Object obj3 = betVar.a;
            atqp.j(obj);
        }
        return awmy.a;
    }

    @Override // defpackage.awzd
    public final /* bridge */ /* synthetic */ Object emit(Object obj, awoq awoqVar) {
        return a(awoqVar);
    }
}
