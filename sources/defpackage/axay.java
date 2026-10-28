package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class axay extends awpg {
    /* synthetic */ Object a;
    final /* synthetic */ axaz b;
    int c;
    axcb d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axay(axaz axazVar, awoq awoqVar) {
        super(awoqVar);
        this.b = axazVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
