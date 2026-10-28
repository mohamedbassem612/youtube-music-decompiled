package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class pkp extends awpg {
    public /* synthetic */ Object a;
    public int b;
    public ahzd c;
    public ahze d;
    public ahzg e;
    final /* synthetic */ axfd f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pkp(axfd axfdVar, awoq awoqVar) {
        super(awoqVar);
        this.f = axfdVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.f.W(null, this);
    }
}
