package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class tjz extends awpg {
    Object a;
    Object b;
    /* synthetic */ Object c;
    final /* synthetic */ tkd d;
    int e;
    String f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tjz(tkd tkdVar, awoq awoqVar) {
        super(awoqVar);
        this.d = tkdVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.f(null, null, this);
    }
}
