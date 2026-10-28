package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class awzk extends awpg {
    /* synthetic */ Object a;
    int b;
    final /* synthetic */ awzl c;
    Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awzk(awzl awzlVar, awoq awoqVar) {
        super(awoqVar);
        this.c = awzlVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.collect(null, this);
    }
}
