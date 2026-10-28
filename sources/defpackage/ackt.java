package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class ackt extends awpg {
    public Object a;
    public int b;
    public /* synthetic */ Object c;
    public int d;
    final /* synthetic */ axlj e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ackt(axlj axljVar, awoq awoqVar) {
        super(awoqVar);
        this.e = axljVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.d |= Integer.MIN_VALUE;
        return this.e.G(null, 0, this);
    }
}
