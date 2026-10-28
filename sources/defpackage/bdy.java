package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bdy extends awpg {
    public Object a;
    public Object b;
    public /* synthetic */ Object c;
    public int d;
    public awrm e;
    final /* synthetic */ bbl f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bdy(bbl bblVar, awoq awoqVar) {
        super(awoqVar);
        this.f = bblVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f.b(null, null, this);
    }
}
