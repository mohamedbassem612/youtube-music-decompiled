package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class egk extends awpg {
    public /* synthetic */ Object a;
    public int b;
    public Object c;
    public Object d;
    public Object e;
    final /* synthetic */ ikx f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public egk(ikx ikxVar, awoq awoqVar) {
        super(awoqVar);
        this.f = ikxVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.f.collect(null, this);
    }
}
