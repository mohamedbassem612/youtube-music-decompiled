package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class axbb implements axah {
    private final axah a;
    private final awqk b;

    public axbb(axah axahVar, awqk awqkVar) {
        this.a = axahVar;
        this.b = awqkVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.axah, defpackage.awzc
    public final Object collect(awzd awzdVar, awoq awoqVar) throws Throwable {
        axba axbaVar;
        if (awoqVar instanceof axba) {
            axbaVar = (axba) awoqVar;
            int i = axbaVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                axbaVar.c = i - Integer.MIN_VALUE;
            } else {
                axbaVar = new axba(this, awoqVar);
            }
        } else {
            axbaVar = new axba(this, awoqVar);
        }
        Object obj = axbaVar.a;
        awox awoxVar = awox.a;
        int i2 = axbaVar.c;
        if (i2 == 0) {
            atqp.j(obj);
            axah axahVar = this.a;
            axaz axazVar = new axaz(awzdVar, this.b);
            axbaVar.c = 1;
            if (axahVar.collect(axazVar, axbaVar) == awoxVar) {
                return awoxVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            atqp.j(obj);
        }
        throw new awmh();
    }
}
