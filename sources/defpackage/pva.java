package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class pva extends awpg {
    /* synthetic */ Object a;
    final /* synthetic */ pvc b;
    int c;
    axst d;
    axst e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pva(pvc pvcVar, awoq awoqVar) {
        super(awoqVar);
        this.b = pvcVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.f(null, this);
    }
}
