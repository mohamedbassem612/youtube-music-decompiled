package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qai extends awpg {
    public /* synthetic */ Object a;
    public int b;
    final /* synthetic */ hef c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qai(hef hefVar, awoq awoqVar) {
        super(awoqVar);
        this.c = hefVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return qnl.U(this.c, this);
    }
}
