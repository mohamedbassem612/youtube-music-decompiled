package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class awxz extends awpg {
    int a;
    long b;
    /* synthetic */ Object c;
    final /* synthetic */ awya d;
    int e;
    awyj f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awxz(awya awyaVar, awoq awoqVar) {
        super(awoqVar);
        this.d = awyaVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        Object objG = this.d.g(null, 0, 0L, this);
        return objG != awox.a ? new awyi(objG) : objG;
    }
}
