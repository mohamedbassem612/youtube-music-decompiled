package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class tju extends awpg {
    Object a;
    Object b;
    Object c;
    Object d;
    /* synthetic */ Object e;
    final /* synthetic */ tkd f;
    int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tju(tkd tkdVar, awoq awoqVar) {
        super(awoqVar);
        this.f = tkdVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.b(this);
    }
}
