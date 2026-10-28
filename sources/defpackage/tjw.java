package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class tjw extends awpg {
    Object a;
    boolean b;
    /* synthetic */ Object c;
    final /* synthetic */ tkd d;
    int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tjw(tkd tkdVar, awoq awoqVar) {
        super(awoqVar);
        this.d = tkdVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.d(null, false, this);
    }
}
