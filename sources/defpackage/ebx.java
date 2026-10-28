package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ebx extends awpg {
    /* synthetic */ Object a;
    final /* synthetic */ eby b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ebx(eby ebyVar, awoq awoqVar) {
        super(awoqVar);
        this.b = ebyVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(this);
    }
}
