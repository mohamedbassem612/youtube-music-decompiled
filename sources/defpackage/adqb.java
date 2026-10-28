package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class adqb extends awpg {
    /* synthetic */ Object a;
    final /* synthetic */ adqc b;
    int c;
    adqc d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adqb(adqc adqcVar, awoq awoqVar) {
        super(awoqVar);
        this.b = adqcVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return adqc.a(this.b, this);
    }
}
