package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ecq extends awpg {
    /* synthetic */ Object a;
    int b;
    final /* synthetic */ ecs c;
    Object d;
    Object e;
    Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ecq(ecs ecsVar, awoq awoqVar) {
        super(awoqVar);
        this.c = ecsVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.collect(null, this);
    }
}
