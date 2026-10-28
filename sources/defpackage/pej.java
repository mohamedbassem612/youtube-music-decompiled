package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class pej extends awpg {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public long e;
    public /* synthetic */ Object f;
    public int g;
    final /* synthetic */ isi h;
    public ahub i;
    public ahub j;
    public ahub k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pej(isi isiVar, awoq awoqVar) {
        super(awoqVar);
        this.h = isiVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.g |= Integer.MIN_VALUE;
        return this.h.t(null, 0L, null, null, null, this);
    }
}
