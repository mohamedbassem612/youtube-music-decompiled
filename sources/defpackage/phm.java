package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class phm extends awpg {
    /* synthetic */ Object a;
    final /* synthetic */ phn b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public phm(phn phnVar, awoq awoqVar) {
        super(awoqVar);
        this.b = phnVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, this);
    }
}
