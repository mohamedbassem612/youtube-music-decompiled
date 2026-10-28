package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class hta extends awpg {
    public Object a;
    public Object b;
    public /* synthetic */ Object c;
    public int d;
    public afzq e;
    final /* synthetic */ kwq f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hta(kwq kwqVar, awoq awoqVar) {
        super(awoqVar);
        this.f = kwqVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f.n(null, this);
    }
}
