package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class awpa extends awpi {
    final /* synthetic */ awqk a;
    final /* synthetic */ Object b;
    private int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awpa(awoq awoqVar, awqk awqkVar, Object obj) {
        super(awoqVar);
        this.a = awqkVar;
        this.b = obj;
    }

    @Override // defpackage.awpe
    protected final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.c = 2;
            atqp.j(obj);
            return obj;
        }
        this.c = 1;
        atqp.j(obj);
        awqk awqkVar = this.a;
        awro.c(awqkVar, 2);
        return awqkVar.invoke(this.b, this);
    }
}
