package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xnj extends awpg {
    public /* synthetic */ Object a;
    public int b;
    final /* synthetic */ xpl c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xnj(xpl xplVar, awoq awoqVar) {
        super(awoqVar);
        this.c = xplVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.c(this);
    }
}
