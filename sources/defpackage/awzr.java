package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class awzr extends awpg {
    /* synthetic */ Object a;
    int b;
    awzt c;
    final /* synthetic */ awzl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awzr(awzl awzlVar, awoq awoqVar) {
        super(awoqVar);
        this.d = awzlVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.d.collect(null, this);
    }
}
