package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class axbn implements awzd {
    final /* synthetic */ awrm a;
    final /* synthetic */ awut b;
    final /* synthetic */ axbo c;
    final /* synthetic */ awzd d;

    public axbn(awrm awrmVar, awut awutVar, axbo axboVar, awzd awzdVar) {
        this.a = awrmVar;
        this.b = awutVar;
        this.c = axboVar;
        this.d = awzdVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.awzd
    public final Object emit(Object obj, awoq awoqVar) throws Throwable {
        axbm axbmVar;
        if (awoqVar instanceof axbm) {
            axbmVar = (axbm) awoqVar;
            int i = axbmVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                axbmVar.e = i - Integer.MIN_VALUE;
            } else {
                axbmVar = new axbm(this, awoqVar);
            }
        } else {
            axbmVar = new axbm(this, awoqVar);
        }
        Object obj2 = axbmVar.c;
        awox awoxVar = awox.a;
        int i2 = axbmVar.e;
        if (i2 == 0) {
            atqp.j(obj2);
            awwd awwdVar = (awwd) this.a.a;
            if (awwdVar != null) {
                awwdVar.p(new axbq());
                axbmVar.a = obj;
                axbmVar.b = awwdVar;
                axbmVar.e = 1;
                if (awwdVar.l(axbmVar) == awoxVar) {
                    return awoxVar;
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Object obj3 = axbmVar.b;
            obj = axbmVar.a;
            atqp.j(obj2);
        }
        this.a.a = awro.t(this.b, null, 4, new axbl(this.c, this.d, obj, null), 1);
        return awmy.a;
    }
}
