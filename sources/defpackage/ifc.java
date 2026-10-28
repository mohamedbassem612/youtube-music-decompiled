package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class ifc extends awpg {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ ifj c;
    int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ifc(ifj ifjVar, awoq awoqVar) {
        super(awoqVar);
        this.c = ifjVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(0, this);
    }
}
