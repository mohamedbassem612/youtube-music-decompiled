package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class awzs extends awpg {
    /* synthetic */ Object a;
    int b;
    final /* synthetic */ awzt c;
    Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awzs(awzt awztVar, awoq awoqVar) {
        super(awoqVar);
        this.c = awztVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
