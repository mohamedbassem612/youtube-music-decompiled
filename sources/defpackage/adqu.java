package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class adqu extends awpg {
    /* synthetic */ Object a;
    final /* synthetic */ adrf b;
    int c;
    axcw d;
    vlq e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adqu(adrf adrfVar, awoq awoqVar) {
        super(awoqVar);
        this.b = adrfVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.c(null, null, this);
    }
}
