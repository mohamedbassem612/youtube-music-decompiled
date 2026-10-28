package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class pbr extends awpg {
    public Object a;
    public /* synthetic */ Object b;
    public int c;
    public pkx d;
    public awri e;
    final /* synthetic */ grj f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pbr(grj grjVar, awoq awoqVar) {
        super(awoqVar);
        this.f = grjVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.c |= Integer.MIN_VALUE;
        return this.f.k(null, 0L, 0L, null, this);
    }
}
