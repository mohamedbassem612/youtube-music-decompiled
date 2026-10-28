package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class pxa extends awpg {
    public /* synthetic */ Object a;
    public int b;
    final /* synthetic */ kjc c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pxa(kjc kjcVar, awoq awoqVar) {
        super(awoqVar);
        this.c = kjcVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.I(this);
    }
}
