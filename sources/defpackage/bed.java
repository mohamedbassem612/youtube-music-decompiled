package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bed extends awpg {
    /* synthetic */ Object a;
    int b;
    final /* synthetic */ bgg c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bed(bgg bggVar, awoq awoqVar) {
        super(awoqVar);
        this.c = bggVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.b(this);
    }
}
