package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class uix extends awpg {
    /* synthetic */ Object a;
    final /* synthetic */ ujb b;
    int c;
    ujc d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uix(ujb ujbVar, awoq awoqVar) {
        super(awoqVar);
        this.b = ujbVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(null, this);
    }
}
