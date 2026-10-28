package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class awzh extends awpg {
    /* synthetic */ Object a;
    int b;
    Object c;
    final /* synthetic */ awzj d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awzh(awzj awzjVar, awoq awoqVar) {
        super(awoqVar);
        this.d = awzjVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.d.collect(null, this);
    }
}
