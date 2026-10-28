package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class awzo extends awpg {
    /* synthetic */ Object a;
    int b;
    Object c;
    Object d;
    long e;
    int f;
    final /* synthetic */ awzj g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awzo(awzj awzjVar, awoq awoqVar) {
        super(awoqVar);
        this.g = awzjVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.g.collect(null, this);
    }
}
