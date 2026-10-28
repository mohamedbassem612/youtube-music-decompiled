package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class qal extends awpg {
    public Object a;
    public /* synthetic */ Object b;
    public int c;
    final /* synthetic */ kjc d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qal(kjc kjcVar, awoq awoqVar) {
        super(awoqVar);
        this.d = kjcVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.c |= Integer.MIN_VALUE;
        return this.d.H(null, this);
    }
}
