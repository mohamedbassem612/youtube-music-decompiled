package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class bem extends awpg {
    public /* synthetic */ Object a;
    public int b;
    public Object c;
    public Object d;
    public Object e;
    final /* synthetic */ ecs f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bem(ecs ecsVar, awoq awoqVar) {
        super(awoqVar);
        this.f = ecsVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.f.collect(null, this);
    }
}
