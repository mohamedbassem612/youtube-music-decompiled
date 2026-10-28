package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class pei extends awpg {
    public Object a;
    public Object b;
    public Object c;
    public long d;
    public /* synthetic */ Object e;
    public int f;
    final /* synthetic */ isi g;
    public ahub h;
    public ahub i;
    public ahub j;
    public ahub k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pei(isi isiVar, awoq awoqVar) {
        super(awoqVar);
        this.g = isiVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.f |= Integer.MIN_VALUE;
        return this.g.u(null, 0L, null, null, this);
    }
}
