package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class axaa extends awpg {
    /* synthetic */ Object a;
    int b;
    final /* synthetic */ axab c;
    Object d;
    Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axaa(axab axabVar, awoq awoqVar) {
        super(awoqVar);
        this.c = axabVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
