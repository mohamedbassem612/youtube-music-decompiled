package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class tjn extends awpg {
    Object a;
    Object b;
    /* synthetic */ Object c;
    final /* synthetic */ tjo d;
    int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tjn(tjo tjoVar, awoq awoqVar) {
        super(awoqVar);
        this.d = tjoVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(null, null, null, false, null, this);
    }
}
