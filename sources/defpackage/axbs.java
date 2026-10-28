package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class axbs implements awzd {
    final /* synthetic */ awye a;
    final /* synthetic */ int b;

    public axbs(awye awyeVar, int i) {
        this.a = awyeVar;
        this.b = i;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.awzd
    public final Object emit(Object obj, awoq awoqVar) throws Throwable {
        axbr axbrVar;
        if (awoqVar instanceof axbr) {
            axbrVar = (axbr) awoqVar;
            int i = axbrVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                axbrVar.c = i - Integer.MIN_VALUE;
            } else {
                axbrVar = new axbr(this, awoqVar);
            }
        } else {
            axbrVar = new axbr(this, awoqVar);
        }
        Object obj2 = axbrVar.a;
        awox awoxVar = awox.a;
        int i2 = axbrVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                atqp.j(obj2);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                atqp.j(obj2);
            }
            return awmy.a;
        }
        atqp.j(obj2);
        awye awyeVar = this.a;
        awnr awnrVar = new awnr(this.b, obj);
        axbrVar.c = 1;
        if (awyeVar.h(awnrVar, axbrVar) == awoxVar) {
            return awoxVar;
        }
        axbrVar.c = 2;
        if (awuw.j(axbrVar) == awoxVar) {
            return awoxVar;
        }
        return awmy.a;
    }
}
