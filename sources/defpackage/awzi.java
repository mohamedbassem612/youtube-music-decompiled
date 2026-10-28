package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class awzi extends awpg {
    /* synthetic */ Object a;
    int b;
    final /* synthetic */ awzj c;
    Object d;
    axcb e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awzi(awzj awzjVar, awoq awoqVar) {
        super(awoqVar);
        this.c = awzjVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.collect(null, this);
    }
}
