package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class pdm extends awpg {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ pdn c;
    int d;
    pbf e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pdm(pdn pdnVar, awoq awoqVar) {
        super(awoqVar);
        this.c = pdnVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(null, this);
    }
}
