package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class awzv extends awpg {
    /* synthetic */ Object a;
    int b;
    Object c;
    final /* synthetic */ awzt d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awzv(awzt awztVar, awoq awoqVar) {
        super(awoqVar);
        this.d = awztVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.d.emit(null, this);
    }
}
