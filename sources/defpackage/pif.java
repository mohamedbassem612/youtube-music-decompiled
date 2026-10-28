package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class pif extends awpg {
    public /* synthetic */ Object a;
    public int b;
    public plb c;
    final /* synthetic */ nwd d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pif(nwd nwdVar, awoq awoqVar) {
        super(awoqVar);
        this.d = nwdVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.d.a(null, null, this);
    }
}
