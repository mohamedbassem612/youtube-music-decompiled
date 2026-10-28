package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class tjf extends awpg {
    /* synthetic */ Object a;
    final /* synthetic */ tjg b;
    int c;
    tid d;
    axfi e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tjf(tjg tjgVar, awoq awoqVar) {
        super(awoqVar);
        this.b = tjgVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(null, null, this);
    }
}
