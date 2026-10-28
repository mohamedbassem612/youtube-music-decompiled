package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awoz extends awpg {
    final /* synthetic */ awqg a;
    private int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awoz(awoq awoqVar, awou awouVar, awqg awqgVar) {
        super(awoqVar, awouVar);
        this.a = awqgVar;
    }

    @Override // defpackage.awpe
    protected final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.b = 2;
            atqp.j(obj);
            return obj;
        }
        this.b = 1;
        atqp.j(obj);
        awqg awqgVar = this.a;
        awro.c(awqgVar, 1);
        return awqgVar.invoke(this);
    }
}
