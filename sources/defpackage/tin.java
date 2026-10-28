package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class tin extends awpg {
    /* synthetic */ Object a;
    final /* synthetic */ tir b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tin(tir tirVar, awoq awoqVar) {
        super(awoqVar);
        this.b = tirVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objK = this.b.k(null, null, null, this);
        return objK != awox.a ? new awmn(objK) : objK;
    }
}
