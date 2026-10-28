package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class ozw extends awpg {
    /* synthetic */ Object a;
    final /* synthetic */ ozx b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ozw(ozx ozxVar, awoq awoqVar) {
        super(awoqVar);
        this.b = ozxVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, null, null, this);
    }
}
