package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class awxy extends awpg {
    /* synthetic */ Object a;
    final /* synthetic */ awya b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awxy(awya awyaVar, awoq awoqVar) {
        super(awoqVar);
        this.b = awyaVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objF = awya.f(this.b, this);
        return objF != awox.a ? new awyi(objF) : objF;
    }
}
